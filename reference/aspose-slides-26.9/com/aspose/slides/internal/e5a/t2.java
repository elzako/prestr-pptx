package com.aspose.slides.internal.e5a;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.e5;

public class t2 extends com.aspose.slides.internal.z0k.t4 implements IDisposable {
   private com.aspose.slides.internal.z0k.t4 n5;
   private h0 l6;
   private long k5 = -99L;
   private boolean u3;
   private long a6;

   public final long n5() {
      return this.l6.n5();
   }

   public t2(com.aspose.slides.internal.z0k.t4 var1) {
      this(true, -99L, var1);
   }

   public t2(com.aspose.slides.internal.z0k.t4 var1, long var2) {
      this(true, var2, var1);
      if (var2 < 0L) {
         throw new ArgumentException("length");
      }
   }

   private t2(boolean var1, long var2, com.aspose.slides.internal.z0k.t4 var4) {
      this.n5 = var4;
      this.l6 = new h0();
      this.k5 = var2;
      this.u3 = var1;
      this.a6 = com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.q8.n5.class) ? var4.getPosition() : -1L;
   }

   public final int l6() {
      return this.l6.l6();
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      int var4 = count;
      if (this.k5 != -99L) {
         if (this.l6.n5() >= this.k5) {
            return 0;
         }

         long var5 = this.k5 - this.l6.n5();
         if (var5 < count) {
            var4 = (int)var5;
         }
      }

      boolean var7 = this.a6 >= 0L;
      if (var7) {
         this.n5.setPosition(this.a6);
      }

      int var8 = this.n5.read(buffer, offset, var4);
      if (var8 > 0) {
         this.l6.n5(buffer, offset, var8);
      }

      if (var7) {
         this.a6 = this.n5.getPosition();
      }

      return var8;
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      if (count > 0) {
         this.l6.n5(buffer, offset, count);
      }

      this.n5.write(buffer, offset, count);
   }

   @Override
   public boolean canRead() {
      return this.n5.canRead();
   }

   @Override
   public boolean canSeek() {
      return this.n5.canSeek();
   }

   @Override
   public boolean canWrite() {
      return this.n5.canWrite();
   }

   @Override
   public void flush() {
      this.n5.flush();
   }

   @Override
   public long getLength() {
      return this.k5 == -99L ? this.n5.getLength() : this.k5;
   }

   @Override
   public long getPosition() {
      return this.l6.n5();
   }

   @Override
   public void setPosition(long value) {
      throw new NotImplementedException();
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
   public final void dispose() {
      this.close();
      this.dispose(true);
      e5.n5(this);
   }

   @Override
   public void close() {
      super.close();
      if (!this.u3) {
         this.n5.close();
      }
   }
}
