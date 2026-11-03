package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.ms.System.IDisposable;

public abstract class e5 extends com.aspose.slides.internal.z0k.t4 implements IDisposable {
   static com.aspose.slides.internal.r5t.k5 a6 = new com.aspose.slides.internal.r5t.k5(true);
   com.aspose.slides.internal.z0k.t4 u9;
   com.aspose.slides.internal.z0k.e2 h0;
   v8 c8;
   h0 t2;
   boolean s7;
   private volatile boolean n5;
   private boolean l6;
   private final Object k5;
   private Object u3;
   private Object x8;
   private com.aspose.slides.internal.r5t.k5 n3;
   private byte[] y4 = new byte[16384];
   private com.aspose.slides.internal.z0k.e2 e2 = new com.aspose.slides.internal.z0k.e2();

   protected e5(com.aspose.slides.internal.z0k.t4 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("stream is null.");
      }

      if (var1.canRead() && var1.canWrite()) {
         this.h0 = new com.aspose.slides.internal.z0k.e2();
         this.u9 = var1;
         this.s7 = var2;
         this.k5 = new Object();
         this.u3 = new Object();
         this.x8 = new Object();
         this.n3 = new com.aspose.slides.internal.r5t.k5(false);
      } else {
         throw new ArgumentNullException("stream is not both readable and writable.");
      }
   }

   private void l6(com.aspose.slides.ms.System.z7 var1) {
      e5$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), e5$n5.class);

      try {
         try {
            this.n5(var1);
         } catch (n5 var4) {
            this.t2.n5(var4.n5());
            throw new IOException("The authentication or decryption has failed.", var4);
         } catch (RuntimeException var5) {
            this.t2.l6((byte)80);
            throw new IOException("The authentication or decryption has failed.", var5);
         }

         if (var2.u3()) {
            if (var2.a6()) {
               this.u3(var2);
            } else {
               this.k5(var2);
            }

            this.n3.l6();
         } else {
            this.n3.l6();
            var2.n3();
         }
      } catch (Exception var6) {
         this.n3.l6();
         var2.n5(var6);
      }
   }

   boolean a6() {
      if (this.c8.e2() == 2) {
         return false;
      }

      synchronized (this.k5) {
         return this.c8.e2() != 2;
      }
   }

   void u9() {
      if (this.a6()) {
         e5$n5 var1 = new e5$n5(null, null, null, 0, 0, false, false);
         if (!this.n5(var1)) {
            this.n3.a6();
         } else {
            this.l6(var1);
         }
      }
   }

   abstract com.aspose.slides.ms.System.z7 n5(com.aspose.slides.ms.System.h0 var1, Object var2);

   abstract void n5(com.aspose.slides.ms.System.z7 var1);

   abstract com.aspose.slides.internal.f3c.u9 n5(
      com.aspose.slides.internal.f3c.s7 var1, com.aspose.slides.internal.f3c.u9 var2, String var3, com.aspose.slides.internal.f3c.s7 var4
   );

   abstract boolean l6(com.aspose.slides.internal.f3c.u9 var1, int[] var2);

   abstract v0 n5(com.aspose.slides.internal.i2i.k5 var1);

   abstract com.aspose.slides.internal.o8m.a6 n5(com.aspose.slides.internal.f3c.u9 var1, String var2);

   com.aspose.slides.internal.f3c.u9 k5(
      com.aspose.slides.internal.f3c.s7 var1, com.aspose.slides.internal.f3c.u9 var2, String var3, com.aspose.slides.internal.f3c.s7 var4
   ) {
      return this.n5(var1, var2, var3, var4);
   }

   boolean k5(com.aspose.slides.internal.f3c.u9 var1, int[] var2) {
      return this.l6(var1, var2);
   }

   v0 k5(com.aspose.slides.internal.i2i.k5 var1) {
      return this.n5(var1);
   }

   com.aspose.slides.internal.o8m.a6 k5(com.aspose.slides.internal.f3c.u9 var1, String var2) {
      return this.n5(var1, var2);
   }

   public void n5(boolean var1) {
      this.l6 = var1;
   }

   public com.aspose.slides.internal.f3c.u9 h0() {
      return this.c8.e2() == 2 && this.c8.x8().l6() != null && this.c8.x8().l6().size() > 0
         ? new com.aspose.slides.internal.f3c.u9(this.c8.x8().l6().n5(0).t2())
         : null;
   }

   private boolean n5(e5$n5 var1) {
      try {
         synchronized (this.k5) {
            if (this.c8.e2() == 0) {
               this.n5(new b3(this), var1);
               return true;
            } else {
               return false;
            }
         }
      } catch (n5 var5) {
         this.n3.l6();
         this.t2.n5(var5.n5());
         throw new IOException("The authentication or decryption has failed.", var5);
      } catch (RuntimeException var6) {
         this.n3.l6();
         this.t2.l6((byte)80);
         throw new IOException("The authentication or decryption has failed.", var6);
      }
   }

   private void l6(e5$n5 var1) {
      if (!var1.k5()) {
         var1.l6().a6();
      }

      if (var1.x8()) {
         throw var1.s7();
      }
   }

   @Override
   public com.aspose.slides.ms.System.z7 beginRead(byte[] buffer, int offset, int count, com.aspose.slides.ms.System.h0 callback, Object state) {
      this.c8();
      if (buffer == null) {
         throw new ArgumentNullException("buffer is a null reference.");
      }

      if (offset < 0) {
         throw new ArgumentOutOfRangeException("offset is less than 0.");
      }

      if (offset > buffer.length) {
         throw new ArgumentOutOfRangeException("offset is greater than the length of buffer.");
      }

      if (count < 0) {
         throw new ArgumentOutOfRangeException("count is less than 0.");
      }

      if (count > buffer.length - offset) {
         throw new ArgumentOutOfRangeException("count is less than the length of buffer minus the value of the offset parameter.");
      }

      e5$n5 var6 = new e5$n5(callback, state, buffer, offset, count, false, true);
      if (this.a6()) {
         if (!this.n5(var6)) {
            this.n3.a6();
            this.k5(var6);
         }
      } else {
         this.k5(var6);
      }

      return var6;
   }

   private void k5(e5$n5 var1) {
      try {
         int var2 = 0;
         synchronized (this.u3) {
            boolean var4 = this.h0.getPosition() == this.h0.getLength() && this.h0.getLength() > 0L;
            boolean var5 = this.h0.getLength() > 0L && var1.c8() > 0;
            if (var4) {
               this.n5();
            } else if (var5) {
               var2 = this.h0.read(var1.u9(), var1.h0(), var1.c8());
            }
         }

         if (0 < var2) {
            var1.n5(var2);
         } else if (!this.c8.t9()) {
            this.u9.beginRead(this.y4, 0, this.y4.length, new o0(this), new Object[]{this.y4, var1});
         } else {
            var1.n5(0);
         }
      } catch (n5 var8) {
         this.t2.n5(var8.n5());
         throw new IOException("The authentication or decryption has failed.", var8);
      } catch (RuntimeException var9) {
         throw new IOException("IO exception during read.", var9);
      }
   }

   private void k5(com.aspose.slides.ms.System.z7 var1) {
      if (!this.n5) {
         Object[] var2 = com.aspose.slides.internal.v6g.k5.k5(var1.n5(), Object[].class);
         byte[] var3 = com.aspose.slides.internal.v6g.k5.k5(var2[0], byte[].class);
         e5$n5 var4 = (e5$n5)var2[1];

         try {
            int var5 = this.u9.endRead(var1);
            if (var5 <= 0) {
               var4.n5(0);
               return;
            }

            this.e2.write(var3, 0, var5);
            boolean var6 = false;
            long var7 = this.e2.getPosition();
            this.e2.setPosition(0L);
            byte[] var9 = null;
            if (this.e2.getLength() >= 5L) {
               var9 = this.t2.n5(this.e2);
            }

            while (var9 != null) {
               long var10 = this.e2.getLength() - this.e2.getPosition();
               byte[] var12 = null;
               if (var10 > 0L) {
                  var12 = new byte[(int)var10];
                  this.e2.read(var12, 0, var12.length);
               }

               synchronized (this.u3) {
                  long var14 = this.h0.getPosition();
                  if (var9.length > 0) {
                     this.h0.seek(0L, 2);
                     this.h0.write(var9, 0, var9.length);
                     this.h0.seek(var14, 0);
                     var6 = true;
                  }
               }

               this.e2.setLength(0L);
               var9 = null;
               if (var10 > 0L) {
                  this.e2.write(var12, 0, var12.length);
                  if (this.e2.getLength() >= 5L) {
                     this.e2.setPosition(0L);
                     var9 = this.t2.n5(this.e2);
                     if (var9 == null) {
                        var7 = this.e2.getLength();
                     }
                  } else {
                     var7 = var10;
                  }
               } else {
                  var7 = 0L;
               }
            }

            if (var6 || var5 <= 0) {
               this.e2.setPosition(var7);
               int var17 = 0;
               synchronized (this.u3) {
                  var17 = this.h0.read(var4.u9(), var4.h0(), var4.c8());
               }

               var4.n5(var17);
            } else if (this.c8.t9()) {
               var4.n5(0);
            } else {
               this.e2.setPosition(this.e2.getLength());
               this.u9.beginRead(var3, 0, var3.length, new z7(this), var2);
            }
         } catch (Exception var22) {
            var4.n5(var22);
         }
      }
   }

   private void u3(e5$n5 var1) {
      try {
         synchronized (this.x8) {
            byte[] var3 = this.t2.n5((byte)23, var1.u9(), var1.h0(), var1.c8());
            this.u9.beginWrite(var3, 0, var3.length, new v4(this), var1);
         }
      } catch (n5 var6) {
         this.t2.n5(var6.n5());
         this.close();
         throw new IOException("The authentication or decryption has failed.", var6);
      } catch (RuntimeException var7) {
         throw new IOException("IO exception during Write.", var7);
      }
   }

   private void u3(com.aspose.slides.ms.System.z7 var1) {
      if (!this.n5) {
         e5$n5 var2 = (e5$n5)var1.n5();

         try {
            this.u9.endWrite(var1);
            var2.n3();
         } catch (Exception var4) {
            var2.n5(var4);
         }
      }
   }

   @Override
   public com.aspose.slides.ms.System.z7 beginWrite(byte[] buffer, int offset, int count, com.aspose.slides.ms.System.h0 callback, Object state) {
      this.c8();
      if (buffer == null) {
         throw new ArgumentNullException("buffer is a null reference.");
      }

      if (offset < 0) {
         throw new ArgumentOutOfRangeException("offset is less than 0.");
      }

      if (offset > buffer.length) {
         throw new ArgumentOutOfRangeException("offset is greater than the length of buffer.");
      }

      if (count < 0) {
         throw new ArgumentOutOfRangeException("count is less than 0.");
      }

      if (count > buffer.length - offset) {
         throw new ArgumentOutOfRangeException("count is less than the length of buffer minus the value of the offset parameter.");
      }

      e5$n5 var6 = new e5$n5(callback, state, buffer, offset, count, true, true);
      if (this.a6()) {
         if (!this.n5(var6)) {
            this.n3.a6();
            this.u3(var6);
         }
      } else {
         this.u3(var6);
      }

      return var6;
   }

   @Override
   public int endRead(com.aspose.slides.ms.System.z7 asyncResult) {
      this.c8();
      e5$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(asyncResult, e5$n5.class);
      if (var2 == null) {
         throw new ArgumentNullException("asyncResult is null or was not obtained by calling BeginRead.");
      } else if (!asyncResult.k5() && !asyncResult.l6().a6()) {
         throw new n5((byte)80, "Couldn't complete EndRead");
      } else if (var2.x8()) {
         throw var2.s7();
      } else {
         return var2.t2();
      }
   }

   @Override
   public void endWrite(com.aspose.slides.ms.System.z7 asyncResult) {
      this.c8();
      e5$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(asyncResult, e5$n5.class);
      if (var2 == null) {
         throw new ArgumentNullException("asyncResult is null or was not obtained by calling BeginWrite.");
      }

      if (!asyncResult.k5() && !var2.l6().a6()) {
         throw new n5((byte)80, "Couldn't complete EndWrite");
      }

      if (var2.x8()) {
         throw var2.s7();
      }
   }

   @Override
   public void close() {
      super.close();
   }

   @Override
   public void flush() {
      this.c8();
      this.u9.flush();
   }

   @Override
   public int read(byte[] buffer, int offset, int count) {
      this.c8();
      if (buffer == null) {
         throw new ArgumentNullException("buffer");
      }

      if (offset < 0) {
         throw new ArgumentOutOfRangeException("offset is less than 0.");
      }

      if (offset > buffer.length) {
         throw new ArgumentOutOfRangeException("offset is greater than the length of buffer.");
      }

      if (count < 0) {
         throw new ArgumentOutOfRangeException("count is less than 0.");
      }

      if (count > buffer.length - offset) {
         throw new ArgumentOutOfRangeException("count is less than the length of buffer minus the value of the offset parameter.");
      }

      if (this.c8.e2() != 2) {
         this.u9();
      }

      synchronized (this.u3) {
         try {
            a6.n5();
            if (this.h0.getPosition() > 0L) {
               if (this.h0.getPosition() == this.h0.getLength()) {
                  this.h0.setLength(0L);
               } else {
                  int var5 = this.h0.read(buffer, offset, count);
                  if (var5 > 0) {
                     a6.l6();
                     return var5;
                  }
               }
            }

            boolean var19 = false;

            while (true) {
               if (this.e2.getPosition() == 0L || var19) {
                  var19 = false;
                  byte[] var6 = new byte[16384];
                  int var7 = 0;
                  if (count == 1) {
                     int var8 = this.u9.readByte();
                     if (var8 >= 0) {
                        var6[0] = com.aspose.slides.internal.v6g.k5.n5((Object)(var8), 9);
                        var7 = 1;
                     }
                  } else {
                     var7 = this.u9.read(var6, 0, var6.length);
                  }

                  if (var7 <= 0) {
                     a6.l6();
                     return 0;
                  }

                  if (this.e2.getLength() > 0L && this.e2.getPosition() != this.e2.getLength()) {
                     this.e2.seek(0L, 2);
                  }

                  this.e2.write(var6, 0, var7);
               }

               boolean var20 = false;
               this.e2.setPosition(0L);
               byte[] var21 = null;
               if (this.e2.getLength() >= 5L) {
                  var21 = this.t2.n5(this.e2);
                  var19 = var21 == null;
               }

               while (var21 != null) {
                  long var9 = this.e2.getLength() - this.e2.getPosition();
                  byte[] var11 = null;
                  if (var9 > 0L) {
                     var11 = new byte[(int)var9];
                     this.e2.read(var11, 0, var11.length);
                  }

                  long var12 = this.h0.getPosition();
                  if (var21.length > 0) {
                     this.h0.seek(0L, 2);
                     this.h0.write(var21, 0, var21.length);
                     this.h0.seek(var12, 0);
                     var20 = true;
                  }

                  this.e2.setLength(0L);
                  var21 = null;
                  if (var9 > 0L) {
                     this.e2.write(var11, 0, var11.length);
                  }

                  if (var20) {
                     int var14 = this.h0.read(buffer, offset, count);
                     a6.l6();
                     return var14;
                  }
               }
            }
         } catch (n5 var16) {
            throw new IOException("The authentication or decryption has failed.", var16);
         } catch (RuntimeException var17) {
            throw new IOException("IO exception during read.", var17);
         }
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
      this.c8();
      if (buffer == null) {
         throw new ArgumentNullException("buffer");
      }

      if (offset < 0) {
         throw new ArgumentOutOfRangeException("offset is less than 0.");
      }

      if (offset > buffer.length) {
         throw new ArgumentOutOfRangeException("offset is greater than the length of buffer.");
      }

      if (count < 0) {
         throw new ArgumentOutOfRangeException("count is less than 0.");
      }

      if (count > buffer.length - offset) {
         throw new ArgumentOutOfRangeException("count is less than the length of buffer minus the value of the offset parameter.");
      }

      if (this.c8.e2() != 2) {
         this.u9();
      }

      synchronized (this.x8) {
         try {
            byte[] var5 = this.t2.n5((byte)23, buffer, offset, count);
            this.u9.write(var5, 0, var5.length);
         } catch (n5 var7) {
            this.t2.n5(var7.n5());
            this.close();
            throw new IOException("The authentication or decryption has failed.", var7);
         } catch (RuntimeException var8) {
            throw new IOException("IO exception during Write.", var8);
         }
      }
   }

   @Override
   public boolean canRead() {
      return this.u9.canRead();
   }

   @Override
   public boolean canSeek() {
      return false;
   }

   @Override
   public boolean canWrite() {
      return this.u9.canWrite();
   }

   @Override
   public long getLength() {
      throw new NotSupportedException();
   }

   @Override
   public long getPosition() {
      throw new NotSupportedException();
   }

   @Override
   public void setPosition(long value) {
      throw new NotSupportedException();
   }

   @Override
   protected void finalize() throws Throwable {
      this.dispose(false);
      super.finalize();
   }

   @Override
   protected void dispose(boolean disposing) {
      if (!this.n5) {
         if (disposing) {
            if (this.u9 != null) {
               if (this.c8.e2() == 2 && !this.c8.z1()) {
                  try {
                     this.t2.l6((byte)0);
                  } catch (RuntimeException var3) {
                  }
               }

               if (this.s7) {
                  this.u9.close();
               }
            }

            this.s7 = false;
            this.u9 = null;
         }

         this.n5 = true;
         super.dispose(disposing);
      }
   }

   private void n5() {
      this.h0.setLength(0L);
      this.h0.setPosition(0L);
   }

   void c8() {
      if (this.n5) {
         throw new ObjectDisposedException("The Stream is closed.");
      }
   }

   // $VF: synthetic method
   static void n5(e5 var0, com.aspose.slides.ms.System.z7 var1) {
      var0.l6(var1);
   }

   // $VF: synthetic method
   static void l6(e5 var0, com.aspose.slides.ms.System.z7 var1) {
      var0.k5(var1);
   }

   // $VF: synthetic method
   static void k5(e5 var0, com.aspose.slides.ms.System.z7 var1) {
      var0.u3(var1);
   }
}
