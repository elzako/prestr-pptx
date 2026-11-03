package com.aspose.slides.internal.z0k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;

public final class k5 extends t4 {
   private t4 n5;
   private byte[] l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;

   @Override
   public boolean canRead() {
      return this.n5 != null ? this.n5.canRead() : false;
   }

   @Override
   public boolean canWrite() {
      return this.n5 != null ? this.n5.canWrite() : false;
   }

   @Override
   public boolean canSeek() {
      return this.n5 != null ? this.n5.canSeek() : false;
   }

   @Override
   public long getLength() {
      if (this.n5 == null) {
         this.k5();
      }

      if (this.a6 > 0) {
         this.l6();
      }

      return this.n5.getLength();
   }

   @Override
   public long getPosition() {
      if (this.n5 == null) {
         this.k5();
      }

      if (!this.n5.canSeek()) {
         this.u3();
      }

      return this.n5.getPosition() + (this.k5 - this.u3 + this.a6);
   }

   @Override
   public void setPosition(long value) {
      if (value < 0L) {
         throw new ArgumentOutOfRangeException("value", "value must be positive");
      }

      if (this.n5 == null) {
         this.k5();
      }

      if (!this.n5.canSeek()) {
         this.u3();
      }

      if (this.a6 > 0) {
         this.l6();
      }

      this.k5 = 0;
      this.u3 = 0;
      this.n5.seek(value, 0);
   }

   private k5() {
   }

   public k5(t4 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      if (var2 <= 0) {
         throw new ArgumentOutOfRangeException("bufferSize", "value must be positive");
      }

      this.n5 = var1;
      this.u9 = var2;
      if (!this.n5.canRead() && !this.n5.canWrite()) {
         this.k5();
      }
   }

   @Override
   protected void dispose(boolean disposing) {
      try {
         if (!disposing) {
            return;
         }

         if (this.n5 != null) {
            try {
               this.flush();
               return;
            } finally {
               this.n5.close();
            }
         }
      } finally {
         this.n5 = null;
         this.l6 = null;
         super.dispose(disposing);
      }
   }

   @Override
   public void flush() {
      if (this.n5 == null) {
         this.k5();
      }

      if (this.a6 > 0) {
         this.l6();
      } else if (this.k5 < this.u3 && this.n5.canSeek()) {
         this.n5();
      }

      this.k5 = 0;
      this.u3 = 0;
   }

   private void n5() {
      if (this.k5 - this.u3 != 0) {
         this.n5.seek(this.k5 - this.u3, 1);
      }

      this.k5 = 0;
      this.u3 = 0;
   }

   private void l6() {
      this.n5.write(this.l6, 0, this.a6);
      this.a6 = 0;
      this.n5.flush();
   }

   @Override
   public int read(byte[] array, int offset, int count) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (offset < 0) {
         throw new ArgumentOutOfRangeException("offset", "value must be positive");
      }

      if (count < 0) {
         throw new ArgumentOutOfRangeException("count", "value must be positive");
      }

      if (array.length - offset < count) {
         throw new ArgumentException("array.Length - offset < count");
      }

      if (this.n5 == null) {
         this.k5();
      }

      int var4 = this.u3 - this.k5;
      if (var4 == 0) {
         if (!this.n5.canRead()) {
            this.a6();
         }

         if (this.a6 > 0) {
            this.l6();
         }

         if (count >= this.u9) {
            int var6 = this.n5.read(array, offset, count);
            this.k5 = 0;
            this.u3 = 0;
            return var6;
         }

         if (this.l6 == null) {
            this.l6 = new byte[this.u9];
         }

         var4 = this.n5.read(this.l6, 0, this.u9);
         if (var4 == 0) {
            return 0;
         }

         this.k5 = 0;
         this.u3 = var4;
      }

      if (var4 > count) {
         var4 = count;
      }

      com.aspose.slides.ms.System.u3.n5(this.l6, this.k5, array, offset, var4);
      this.k5 += var4;
      if (var4 < count) {
         int var5 = this.n5.read(array, offset + var4, count - var4);
         var4 += var5;
         this.k5 = 0;
         this.u3 = 0;
      }

      return var4;
   }

   @Override
   public int readByte() {
      if (this.n5 == null) {
         this.k5();
      }

      if (this.u3 == 0 && !this.n5.canRead()) {
         this.a6();
      }

      if (this.k5 == this.u3) {
         if (this.a6 > 0) {
            this.l6();
         }

         if (this.l6 == null) {
            this.l6 = new byte[this.u9];
         }

         this.u3 = this.n5.read(this.l6, 0, this.u9);
         this.k5 = 0;
      }

      return this.k5 == this.u3 ? -1 : this.l6[this.k5++] & 0xFF;
   }

   @Override
   public void write(byte[] array, int offset, int count) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (offset < 0) {
         throw new ArgumentOutOfRangeException("offset", "value must be positive");
      }

      if (count < 0) {
         throw new ArgumentOutOfRangeException("count", "value must be positive");
      }

      if (array.length - offset < count) {
         throw new ArgumentException("array.Length - offset < count");
      }

      if (this.n5 == null) {
         this.k5();
      }

      if (this.a6 == 0) {
         if (!this.n5.canWrite()) {
            this.u9();
         }

         if (this.k5 < this.u3) {
            this.n5();
         } else {
            this.k5 = 0;
            this.u3 = 0;
         }
      }

      if (this.a6 > 0) {
         int var4 = this.u9 - this.a6;
         if (var4 > 0) {
            if (var4 > count) {
               var4 = count;
            }

            com.aspose.slides.ms.System.u3.n5(array, offset, this.l6, this.a6, var4);
            this.a6 += var4;
            if (count == var4) {
               return;
            }

            offset += var4;
            count -= var4;
         }

         this.n5.write(this.l6, 0, this.a6);
         this.a6 = 0;
      }

      if (count >= this.u9) {
         this.n5.write(array, offset, count);
      } else {
         if (count == 0) {
            return;
         }

         if (this.l6 == null) {
            this.l6 = new byte[this.u9];
         }

         com.aspose.slides.ms.System.u3.n5(array, offset, this.l6, 0, count);
         this.a6 = count;
      }
   }

   @Override
   public void writeByte(byte value) {
      if (this.n5 == null) {
         this.k5();
      }

      if (this.a6 == 0) {
         if (!this.n5.canWrite()) {
            this.u9();
         }

         if (this.k5 < this.u3) {
            this.n5();
         } else {
            this.k5 = 0;
            this.u3 = 0;
         }

         if (this.l6 == null) {
            this.l6 = new byte[this.u9];
         }
      }

      if (this.a6 == this.u9) {
         this.l6();
      }

      this.l6[this.a6++] = value;
   }

   @Override
   public long seek(long offset, int origin) {
      if (this.n5 == null) {
         this.k5();
      }

      if (!this.n5.canSeek()) {
         this.u3();
      }

      if (this.a6 > 0) {
         this.l6();
      } else if (origin == 1) {
         offset -= this.u3 - this.k5;
      }

      long var4 = this.n5.getPosition() + (this.k5 - this.u3);
      long var6 = this.n5.seek(offset, origin);
      if (this.u3 > 0) {
         if (var4 == var6) {
            if (this.k5 > 0) {
               com.aspose.slides.ms.System.u3.n5(this.l6, this.k5, this.l6, 0, this.u3 - this.k5);
               this.u3 = this.u3 - this.k5;
               this.k5 = 0;
            }

            if (this.u3 > 0) {
               this.n5.seek(this.u3, 1);
            }
         } else if (var4 - this.k5 < var6 && var6 < var4 + this.u3 - this.k5) {
            int var8 = (int)(var6 - var4);
            com.aspose.slides.ms.System.u3.n5(this.l6, this.k5 + var8, this.l6, 0, this.u3 - (this.k5 + var8));
            this.u3 = this.u3 - (this.k5 + var8);
            this.k5 = 0;
            if (this.u3 > 0) {
               this.n5.seek(this.u3, 1);
            }
         } else {
            this.k5 = 0;
            this.u3 = 0;
         }
      }

      return var6;
   }

   @Override
   public void setLength(long value) {
      if (value < 0L) {
         throw new ArgumentOutOfRangeException("value", "value must be positive");
      }

      if (this.n5 == null) {
         this.k5();
      }

      if (!this.n5.canSeek()) {
         this.u3();
      }

      if (!this.n5.canWrite()) {
         this.u9();
      }

      if (this.a6 > 0) {
         this.l6();
      } else if (this.k5 < this.u3) {
         this.n5();
      }

      this.k5 = 0;
      this.u3 = 0;
      this.n5.setLength(value);
   }

   private void k5() {
      throw new ObjectDisposedException("stream", "Stream is closed");
   }

   private void u3() {
      throw new NotSupportedException("Seek not supported");
   }

   private void a6() {
      throw new NotSupportedException("Read not supported");
   }

   private void u9() {
      throw new NotSupportedException("Write not supported");
   }
}
