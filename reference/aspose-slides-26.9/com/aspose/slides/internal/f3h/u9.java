package com.aspose.slides.internal.f3h;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;

public class u9 extends com.aspose.slides.internal.z0k.t4 {
   h0 n5;
   private boolean l6;

   public u9(com.aspose.slides.internal.z0k.t4 var1, int var2, boolean var3) {
      this(var1, var2, 6, var3);
   }

   public u9(com.aspose.slides.internal.z0k.t4 var1, int var2, int var3, boolean var4) {
      this.n5 = new h0(var1, var2, var3, 1950, var4);
   }

   @Override
   protected void dispose(boolean disposing) {
      try {
         if (!this.l6) {
            if (disposing && this.n5 != null) {
               this.n5.close();
            }

            this.l6 = true;
         }
      } finally {
         super.dispose(disposing);
      }
   }

   @Override
   public boolean canRead() {
      if (this.l6) {
         throw new ObjectDisposedException("ZlibStream");
      } else {
         return this.n5.x8.canRead();
      }
   }

   @Override
   public boolean canSeek() {
      return false;
   }

   @Override
   public boolean canWrite() {
      if (this.l6) {
         throw new ObjectDisposedException("ZlibStream");
      } else {
         return this.n5.x8.canWrite();
      }
   }

   @Override
   public void flush() {
      if (this.l6) {
         throw new ObjectDisposedException("ZlibStream");
      }

      this.n5.flush();
   }

   @Override
   public long getLength() {
      throw new NotSupportedException();
   }

   @Override
   public long getPosition() {
      if (this.n5.l6 == 0) {
         return this.n5.n5.c8;
      } else {
         return this.n5.l6 == 1 ? this.n5.n5.u3 : 0L;
      }
   }

   @Override
   public void setPosition(long value) {
      throw new NotSupportedException();
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      if (this.l6) {
         throw new ObjectDisposedException("ZlibStream");
      } else {
         return this.n5.read(buffer, offset, count);
      }
   }

   @Override
   public long seek(long offset, int origin) {
      throw new NotSupportedException();
   }

   @Override
   public void setLength(long value) {
      throw new NotSupportedException();
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      if (this.l6) {
         throw new ObjectDisposedException("ZlibStream");
      }

      this.n5.write(buffer, offset, count);
   }
}
