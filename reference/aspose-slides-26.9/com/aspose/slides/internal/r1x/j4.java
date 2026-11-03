package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import java.util.concurrent.atomic.AtomicInteger;

public class j4 extends com.aspose.slides.internal.z0k.t4 implements com.aspose.slides.internal.b8u.m3 {
   private com.aspose.slides.internal.z0k.t4 n5;
   private boolean l6;
   private final Object k5 = new Object();
   private AtomicInteger u3 = new AtomicInteger(1);

   public j4(com.aspose.slides.internal.z0k.t4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      this.n5 = var1;
   }

   public final int l6() {
      return this.u3.get();
   }

   @Override
   public final Object n5() {
      return n5(this.n5, this.k5);
   }

   @Override
   public long getPosition() {
      this.t2();
      long var1 = 0L;

      try {
         return this.n5.getPosition();
      } catch (ObjectDisposedException var4) {
         if (!this.s7()) {
            throw var4;
         } else {
            return this.getPosition();
         }
      }
   }

   @Override
   public void setPosition(long value) {
      this.t2();

      try {
         this.n5.setPosition(value);
      } catch (ObjectDisposedException var4) {
         if (!this.s7()) {
            throw var4;
         }

         this.setPosition(value);
      }
   }

   @Override
   public long getLength() {
      this.t2();
      long var1 = 0L;

      try {
         return this.n5.getLength();
      } catch (ObjectDisposedException var4) {
         if (!this.s7()) {
            throw var4;
         } else {
            return this.getLength();
         }
      }
   }

   @Override
   public boolean canRead() {
      this.t2();
      boolean var1 = false;

      try {
         return this.n5.canRead();
      } catch (ObjectDisposedException var3) {
         if (!this.s7()) {
            throw var3;
         } else {
            return this.canRead();
         }
      }
   }

   @Override
   public boolean canSeek() {
      this.t2();
      boolean var1 = false;

      try {
         return this.n5.canSeek();
      } catch (ObjectDisposedException var3) {
         if (!this.s7()) {
            throw var3;
         } else {
            return this.canSeek();
         }
      }
   }

   @Override
   public boolean canWrite() {
      this.t2();
      boolean var1 = false;

      try {
         return this.n5.canWrite();
      } catch (ObjectDisposedException var3) {
         if (!this.s7()) {
            throw var3;
         } else {
            return this.canWrite();
         }
      }
   }

   public com.aspose.slides.internal.z0k.t4 k5() {
      return this.n5;
   }

   public final boolean u3() {
      return this.l6;
   }

   public int a6() {
      return this.u3.incrementAndGet();
   }

   public int u9() {
      return this.u3.decrementAndGet();
   }

   public static Object n5(com.aspose.slides.internal.z0k.t4 var0) {
      return n5(var0, new Object());
   }

   public static Object n5(com.aspose.slides.internal.z0k.t4 var0, Object var1) {
      com.aspose.slides.internal.b8u.m3 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.b8u.m3.class);
      return var2 != null ? var2.n5() : var1;
   }

   @Override
   public final void dispose() {
      this.dispose(true);
   }

   @Override
   public void flush() {
      this.t2();

      try {
         this.n5.flush();
      } catch (ObjectDisposedException var2) {
         if (!this.s7()) {
            throw var2;
         }

         this.flush();
      }
   }

   @Override
   public void writeByte(byte value) {
      this.t2();

      try {
         this.n5.writeByte(value);
      } catch (ObjectDisposedException var3) {
         if (!this.s7()) {
            throw var3;
         }

         this.writeByte(value);
      }
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      this.t2();
      boolean var4 = false;

      try {
         return this.n5.read(buffer, offset, count);
      } catch (ObjectDisposedException var6) {
         if (!this.s7()) {
            throw var6;
         } else {
            return this.read(buffer, offset, count);
         }
      }
   }

   @Override
   public int readByte() {
      this.t2();
      boolean var1 = false;

      try {
         return this.n5.readByte();
      } catch (ObjectDisposedException var3) {
         if (!this.s7()) {
            throw var3;
         } else {
            return this.readByte();
         }
      }
   }

   @Override
   public long seek(long offset, int origin) {
      this.t2();
      long var4 = 0L;

      try {
         return this.n5.seek(offset, origin);
      } catch (ObjectDisposedException var7) {
         if (!this.s7()) {
            throw var7;
         } else {
            return this.seek(offset, origin);
         }
      }
   }

   @Override
   public void setLength(long value) {
      this.t2();

      try {
         this.n5.setLength(value);
      } catch (ObjectDisposedException var4) {
         if (!this.s7()) {
            throw var4;
         }

         this.setLength(value);
      }
   }

   @Override
   public void write(byte[] buffer, int offset, int count) {
      this.t2();

      try {
         this.n5.write(buffer, offset, count);
      } catch (ObjectDisposedException var5) {
         if (!this.s7()) {
            throw var5;
         }

         this.write(buffer, offset, count);
      }
   }

   @Override
   public com.aspose.slides.ms.System.z7 beginRead(byte[] buffer, int offset, int count, com.aspose.slides.ms.System.h0 callback, Object state) {
      this.t2();
      return this.n5.beginRead(buffer, offset, count, callback, state);
   }

   @Override
   public com.aspose.slides.ms.System.z7 beginWrite(byte[] buffer, int offset, int count, com.aspose.slides.ms.System.h0 callback, Object state) {
      this.t2();
      return this.n5.beginWrite(buffer, offset, count, callback, state);
   }

   @Override
   public int endRead(com.aspose.slides.ms.System.z7 asyncResult) {
      this.t2();
      return this.n5.endRead(asyncResult);
   }

   @Override
   public void endWrite(com.aspose.slides.ms.System.z7 asyncResult) {
      this.t2();
      this.n5.endWrite(asyncResult);
   }

   @Override
   public void close() {
      this.t2();
      this.dispose();
   }

   public static boolean n5(Object var0, j4[] var1) {
      Object var2 = var0;

      while (var2 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2, v3.class)) {
            var2 = com.aspose.slides.internal.v6g.k5.n5(var2, v3.class).k5();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.v2r.l6.class)) {
            var2 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.v2r.l6.class).l6();
         } else {
            if (com.aspose.slides.internal.v6g.k5.l6(var2, j4.class)) {
               var1[0] = (j4)var2;
               return true;
            }

            var2 = null;
         }
      }

      var1[0] = null;
      return false;
   }

   private boolean s7() {
      synchronized (this.n5()) {
         boolean var2 = false;
         j4 var3 = null;
         j4[] var4 = new j4[]{var3};
         boolean var5 = n5((Object)(this), var4);
         var3 = var4[0];
         if (var5) {
            com.aspose.slides.internal.z0k.n3 var6 = com.aspose.slides.internal.v6g.k5.n5(var3.k5(), com.aspose.slides.internal.z0k.n3.class);
            if (var6 != null) {
               this.n5 = com.aspose.slides.internal.z0k.u9.n5(var6.n5(), 3, 1, 1);
               var2 = true;
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3.k5(), com.aspose.slides.internal.v2r.l6.class)) {
               var4[0] = var3;
               boolean var7 = n5((Object)(var4[0].k5()), var4);
               var3 = var4[0];
               if (var7) {
                  var6 = com.aspose.slides.internal.v6g.k5.n5(var3.k5(), com.aspose.slides.internal.z0k.n3.class);
                  if (var6 != null) {
                     this.n5 = com.aspose.slides.internal.z0k.u9.n5(var6.n5(), 3, 1, 1);
                     var2 = true;
                  }
               }
            }
         }

         return var2;
      }
   }

   protected void h0() {
      synchronized (this.n5()) {
         i9.n5().n5(this);
         if (this.n5 != null && !this.u3() && this.u3.get() <= 0) {
            this.n5.dispose();
            this.n5 = null;
         }
      }
   }

   protected void c8() {
   }

   protected final void t2() {
      if (this.u3()) {
         throw new ObjectDisposedException(com.aspose.slides.ms.System.j8.n5(this).s7());
      }
   }

   @Override
   protected void dispose(boolean disposing) {
      synchronized (this.n5()) {
         if (!this.l6) {
            try {
               this.c8();
               if (disposing) {
                  this.h0();
               }
            } finally {
               this.l6 = this.u3.get() <= 0;
            }
         }
      }
   }
}
