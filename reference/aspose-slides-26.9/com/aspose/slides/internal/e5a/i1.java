package com.aspose.slides.internal.e5a;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.e5;

public class i1 extends com.aspose.slides.internal.z0k.t4 implements IDisposable {
   public s3 n5;
   private boolean l6;

   public i1(com.aspose.slides.internal.z0k.t4 var1, int var2) {
      this(var1, var2, 6, false);
   }

   public i1(com.aspose.slides.internal.z0k.t4 var1, int var2, boolean var3) {
      this(var1, var2, 6, var3);
   }

   public i1(com.aspose.slides.internal.z0k.t4 var1, int var2, int var3, boolean var4) {
      this.n5 = new s3(var1, var2, var3, 1950, var4);
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
         throw new ObjectDisposedException("ZlibStream");
      } else {
         return this.n5.read(buffer, offset, count);
      }
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
         throw new ObjectDisposedException("ZlibStream");
      }

      this.n5.write(buffer, offset, count);
   }

   @Override
   public final void dispose() {
      this.n5(true);
      e5.n5(this);
   }
}
