package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;

public class e2 extends com.aspose.slides.internal.z0k.t4 {
   private com.aspose.slides.internal.z0k.t4 n5;
   private i1 l6;
   private int k5;
   private byte[] u3;
   private boolean a6;
   private boolean u9;
   private int h0;
   private boolean c8;
   private byte[] t2;
   private int s7;
   private byte[] x8;
   private int n3;
   private int y4;
   private byte[] e2;
   private int t9;

   public e2(com.aspose.slides.internal.z0k.t4 var1, i1 var2, int var3) {
      if (var3 == 0) {
         if (!var1.canRead()) {
            throw new ArgumentException(com.aspose.slides.internal.x8w.z3.n5("Can't read on stream"));
         }
      } else {
         if (var3 != 1) {
            throw new ArgumentException("ArgumentException", "mode");
         }

         if (!var1.canWrite()) {
            throw new ArgumentException(com.aspose.slides.internal.x8w.z3.n5("Can't write on stream"));
         }
      }

      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.a6 = false;
      if (var2 != null) {
         this.e2 = new byte[var2.at_()];
      }
   }

   @Override
   public boolean canRead() {
      return this.k5 == 0;
   }

   @Override
   public boolean canSeek() {
      return false;
   }

   @Override
   public boolean canWrite() {
      return this.k5 == 1;
   }

   @Override
   public long getLength() {
      throw new NotSupportedException("Length");
   }

   @Override
   public long getPosition() {
      throw new NotSupportedException("Position");
   }

   @Override
   public void setPosition(long value) {
      throw new NotSupportedException("Position");
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      if (this.k5 != 0) {
         throw new NotSupportedException(com.aspose.slides.internal.x8w.z3.n5("not in Read mode"));
      }

      if (offset < 0) {
         throw new ArgumentException(com.aspose.slides.internal.x8w.z3.n5("negative"), "offset");
      }

      if (count < 0) {
         throw new ArgumentException(com.aspose.slides.internal.x8w.z3.n5("negative"), "count");
      }

      if (offset > buffer.length - count) {
         throw new ArgumentException("(offset+count)\r\nParameter name: " + com.aspose.slides.internal.x8w.z3.n5("buffer overflow"));
      }

      if (this.e2 == null) {
         return 0;
      }

      int var4 = 0;
      if (count != 0 && (this.n3 != this.y4 || !this.c8)) {
         if (this.t2 == null) {
            this.x8 = new byte[this.l6.au_() << 2];
            this.n3 = 0;
            this.y4 = 0;
            this.t2 = new byte[this.l6.at_()];
            this.s7 = this.n5.read(this.t2, 0, this.t2.length);
         }

         while (count > 0) {
            int var5 = this.y4 - this.n3;
            if (var5 < this.l6.at_()) {
               int var6 = 0;
               this.t9 = this.n5.read(this.e2, 0, this.l6.at_());
               this.c8 = this.t9 < this.l6.at_();
               if (!this.c8) {
                  var6 = this.l6.n5(this.t2, 0, this.t2.length, this.x8, this.y4);
                  com.aspose.slides.ms.System.y4.n5(this.e2, 0, this.t2, 0, this.t9);
                  this.s7 = this.t9;
               } else {
                  if (this.t9 > 0) {
                     var6 = this.l6.n5(this.t2, 0, this.t2.length, this.x8, this.y4);
                     com.aspose.slides.ms.System.y4.n5(this.e2, 0, this.t2, 0, this.t9);
                     this.s7 = this.t9;
                     var5 += var6;
                     this.y4 += var6;
                  }

                  if (!this.u9) {
                     byte[] var7 = this.l6.n5(this.t2, 0, this.s7);
                     var6 = var7.length;
                     com.aspose.slides.ms.System.y4.n5(var7, 0, this.x8, this.y4, var7.length);
                     com.aspose.slides.ms.System.u3.n5(var7, 0, var7.length);
                     this.u9 = true;
                  }
               }

               var5 += var6;
               this.y4 += var6;
            }

            if (this.n3 > this.l6.au_()) {
               com.aspose.slides.ms.System.y4.n5(this.x8, this.n3, this.x8, 0, var5);
               this.y4 = this.y4 - this.n3;
               this.n3 = 0;
            }

            var5 = count < var5 ? count : var5;
            if (var5 > 0) {
               com.aspose.slides.ms.System.y4.n5(this.x8, this.n3, buffer, offset, var5);
               this.n3 += var5;
               var4 += var5;
               offset += var5;
               count -= var5;
            }

            if (var5 != this.l6.at_() && this.s7 != this.l6.at_() || this.c8) {
               count = 0;
            }
         }

         return var4;
      } else {
         return var4;
      }
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      if (this.k5 != 1) {
         throw new NotSupportedException(com.aspose.slides.internal.x8w.z3.n5("not in Write mode"));
      }

      if (offset < 0) {
         throw new ArgumentException(com.aspose.slides.internal.x8w.z3.n5("negative"), "offset");
      }

      if (count < 0) {
         throw new ArgumentException(com.aspose.slides.internal.x8w.z3.n5("negative"), "count");
      }

      if (offset > buffer.length - count) {
         throw new ArgumentException("(offset+count)\r\nParameter name: " + com.aspose.slides.internal.x8w.z3.n5("buffer overflow"));
      }

      if (this.n5 == null) {
         throw new ArgumentNullException("inner stream was disposed");
      }

      int var4 = count;
      if (this.h0 > 0 && this.h0 != this.l6.at_()) {
         int var5 = this.l6.at_() - this.h0;
         var5 = count < var5 ? count : var5;
         com.aspose.slides.ms.System.y4.n5(buffer, offset, this.e2, this.h0, var5);
         this.h0 += var5;
         offset += var5;
         count -= var5;
      }

      int var11 = offset;

      while (count > 0) {
         if (this.h0 == this.l6.at_()) {
            if (this.u3 == null) {
               this.u3 = new byte[this.l6.au_()];
            }

            int var6 = this.l6.n5(this.e2, 0, this.h0, this.u3, 0);
            this.n5.write(this.u3, 0, var6);
            this.h0 = 0;
         }

         if (this.l6.k5()) {
            int var12 = count & ~(this.l6.at_() - 1);
            int var7 = count & this.l6.at_() - 1;
            int var8 = (1 + var12 / this.l6.at_()) * this.l6.au_();
            if (this.e2.length < var8) {
               com.aspose.slides.ms.System.u3.n5(this.e2, 0, this.e2.length);
               this.e2 = new byte[var8];
            }

            if (var12 > 0) {
               int var9 = this.l6.n5(buffer, offset, var12, this.e2, 0);
               this.n5.write(this.e2, 0, var9);
            }

            if (var7 > 0) {
               com.aspose.slides.ms.System.y4.n5(buffer, var4 - var7, this.e2, 0, var7);
            }

            this.h0 = var7;
            count = 0;
         } else {
            int var13 = Math.min(this.l6.at_() - this.h0, count);
            com.aspose.slides.ms.System.y4.n5(buffer, var11, this.e2, this.h0, var13);
            var11 += var13;
            this.h0 += var13;
            count -= var13;
         }
      }
   }

   @Override
   public void flush() {
   }

   public void n5() {
      if (this.u9) {
         throw new NotSupportedException(com.aspose.slides.internal.x8w.z3.n5("This method cannot be called twice."));
      }

      if (this.a6) {
         throw new NotSupportedException(com.aspose.slides.internal.x8w.z3.n5("CryptoStream was disposed."));
      }

      this.u9 = true;
      byte[] var1 = this.l6.n5(this.e2, 0, this.h0);
      if (this.n5 != null && this.k5 == 1) {
         this.n5.write(var1, 0, var1.length);
      }

      if (this.n5 instanceof e2) {
         ((e2)this.n5).n5();
      } else {
         this.n5.flush();
      }

      com.aspose.slides.ms.System.u3.n5(var1, 0, var1.length);
   }

   @Override
   public long seek(long offset, int origin) {
      throw new NotSupportedException("Seek");
   }

   @Override
   public void setLength(long value) {
      throw new NotSupportedException("SetLength");
   }

   @Override
   protected void dispose(boolean disposing) {
      if (!this.a6) {
         if (disposing) {
            if (!this.u9) {
               this.n5();
            }

            if (this.n5 != null) {
               this.n5.close();
            }
         }

         this.a6 = true;
         if (this.e2 != null) {
            com.aspose.slides.ms.System.u3.n5(this.e2, 0, this.e2.length);
         }

         if (this.u3 != null) {
            com.aspose.slides.ms.System.u3.n5(this.u3, 0, this.u3.length);
         }

         if (disposing) {
            this.n5 = null;
            this.e2 = null;
            this.u3 = null;
         }
      }
   }
}
