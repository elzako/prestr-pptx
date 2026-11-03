package com.aspose.slides.internal.e5a;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.e5;

public class x8 extends com.aspose.slides.internal.z0k.t4 implements IDisposable {
   public s3 n5;
   private boolean l6;
   private long k5;

   public x8(com.aspose.slides.internal.z0k.t4 var1, int var2) {
      this(var1, var2, 6, false);
   }

   public x8(com.aspose.slides.internal.z0k.t4 var1, int var2, boolean var3) {
      this(var1, var2, 6, var3);
   }

   public x8(com.aspose.slides.internal.z0k.t4 var1, int var2, int var3, boolean var4) {
      this.n5 = new s3(var1, var2, var3, 1951, var4);
      this.k5 = var1 != null && var1.canSeek() ? var1.getPosition() : -1L;
   }

   public final void n5(int var1) {
      if (this.l6) {
         throw new ObjectDisposedException("DeflateStream");
      }

      if (this.n5.c8 != null) {
         throw new f2("The working buffer is already set.");
      }

      if (var1 < 128) {
         throw new f2(d1.n5("Don't be silly. {0} bytes?? Use a bigger buffer.", new Object[]{var1}));
      }

      this.n5.t2 = var1;
   }

   public final void l6(int var1) {
      if (this.l6) {
         throw new ObjectDisposedException("DeflateStream");
      }

      this.n5.n3 = var1;
   }

   @Override
   public void close() {
      this.n5(true);
      e5.n5(this);
   }

   protected void n5(boolean var1) {
      if (!this.l6) {
         if (var1 && this.n5 != null) {
            this.n5.close();
         }

         this.l6 = true;
      }
   }

   @Override
   public boolean canRead() {
      if (this.l6) {
         throw new ObjectDisposedException("DeflateStream");
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
         throw new ObjectDisposedException("DeflateStream");
      } else {
         return this.n5.x8.canWrite();
      }
   }

   @Override
   public void flush() {
      if (this.l6) {
         throw new ObjectDisposedException("DeflateStream");
      }

      this.n5.flush();
   }

   @Override
   public long getLength() {
      throw new NotImplementedException();
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
      throw new NotImplementedException();
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      if (this.l6) {
         throw new ObjectDisposedException("DeflateStream");
      }

      if (this.k5 >= 0L) {
         this.n5.setPosition(this.k5);
      }

      int var4 = this.n5.read(buffer, offset, count);
      if (this.k5 >= 0L) {
         this.k5 = this.n5.getPosition();
      }

      return var4;
   }

   @Override
   public long seek(long offset, int origin) {
      throw new NotImplementedException();
   }

   @Override
   public void setLength(long value) {
      throw new NotImplementedException();
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      if (this.l6) {
         throw new ObjectDisposedException("DeflateStream");
      }

      this.n5.write(buffer, offset, count);
   }

   @Override
   public final void dispose() {
      this.n5(true);
      e5.n5(this);
   }
}
