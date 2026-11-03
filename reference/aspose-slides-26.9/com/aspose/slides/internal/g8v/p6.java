package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;

class p6 extends com.aspose.slides.internal.z0k.t4 {
   static byte[] n5 = new byte[]{com.aspose.slides.internal.v6g.k5.n5((Object)(13), (int)(9)), com.aspose.slides.internal.v6g.k5.n5((Object)(10), (int)(9))};
   private boolean u3;
   private v8 a6;
   private w1 u9;
   private byte[] h0;
   private int c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   long l6;
   private boolean y4;
   private int e2;
   private int t9;
   private com.aspose.slides.internal.r5t.k5 z1;
   private boolean t4;
   private boolean q0;
   private com.aspose.slides.internal.z0k.e2 z3;
   private boolean m1;
   private byte[] k7;
   private boolean m3;
   private boolean z8;
   private Object j5 = new Object();
   private boolean w1;
   private boolean r4;
   private boolean c4;
   private int y2;
   private int y1;
   private com.aspose.slides.ms.System.h0 a0;
   boolean k5;

   public p6(v8 var1, i9 var2) {
      if (var2 == null) {
         throw new InvalidOperationException("data was not initialized");
      }

      if (var2.k5 == null) {
         throw new InvalidOperationException("data.Headers was not initialized");
      }

      if (var2.n5() == null) {
         throw new InvalidOperationException("data.request was not initialized");
      }

      this.u3 = true;
      this.a0 = new d1(this);
      this.z1 = new com.aspose.slides.internal.r5t.k5(true);
      this.u9 = var2.n5();
      this.y2 = this.u9.x8();
      this.y1 = this.y2;
      this.a6 = var1;
      String var3 = var2.k5.get_Item("Transfer-Encoding");
      boolean var4 = var3 != null && com.aspose.slides.ms.System.d1.u9(var3, "chunked", (short)5) != -1;
      String var5 = var2.k5.get_Item("Content-Length");
      if (!var4 && var5 != null && !"".equals(var5)) {
         try {
            this.x8 = com.aspose.slides.ms.System.a3.n5(var5);
            if (this.x8 == 0 && !this.n3()) {
               this.c8();
            }
         } catch (RuntimeException var8) {
            this.x8 = Integer.MAX_VALUE;
         }
      } else {
         this.x8 = Integer.MAX_VALUE;
      }

      int[] var6 = new int[]{this.s7};
      boolean var7 = !com.aspose.slides.ms.System.a3.n5(var5, var6);
      this.s7 = var6[0];
      if (var7) {
         this.s7 = -1;
      }
   }

   public p6(v8 var1, w1 var2) {
      this.y2 = var2.x8();
      this.y1 = this.y2;
      this.u3 = false;
      this.a0 = new s4(this);
      this.a6 = var1;
      this.u9 = var2;
      this.t4 = var2.k5();
      this.q0 = var2.t9();
      if (this.q0) {
         this.z1 = new com.aspose.slides.internal.r5t.k5(true);
      } else if (this.t4) {
         this.z3 = new com.aspose.slides.internal.z0k.e2();
      }
   }

   private boolean n5(String var1) {
      String var2 = this.a6.k5.k5.get_Item(var1);
      return var2 != null && com.aspose.slides.ms.System.d1.u9(var2, "NTLM", (short)4) != -1;
   }

   private boolean n3() {
      boolean var1 = this.u9.y4() != null && !this.u9.y4().l6(this.u9.n5());
      return var1 && this.n5("Proxy-Authenticate") ? true : this.n5("WWW-Authenticate");
   }

   void n5() {
      if (this.x8 > 0 && this.t2 - this.c8 >= this.x8 && !this.n3()) {
         this.c8();
      }
   }

   v8 l6() {
      return this.a6;
   }

   @Override
   public boolean canTimeout() {
      return true;
   }

   @Override
   public int getReadTimeout() {
      return this.y2;
   }

   @Override
   public void setReadTimeout(int value) {
      if (value < -1) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.y2 = value;
   }

   @Override
   public int getWriteTimeout() {
      return this.y1;
   }

   @Override
   public void setWriteTimeout(int value) {
      if (value < -1) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.y1 = value;
   }

   boolean k5() {
      return this.c4;
   }

   void n5(boolean var1) {
      this.q0 = var1;
   }

   void n5(byte[] var1) {
      this.h0 = var1;
   }

   void n5(int var1) {
      this.c8 = var1;
   }

   void l6(int var1) {
      this.t2 = var1;
   }

   byte[] u3() {
      return this.z3.getBuffer();
   }

   int a6() {
      return this.z3 != null ? com.aspose.slides.internal.v6g.k5.u3(this.z3.getLength(), 11) : -1;
   }

   void u9() {
      if (!this.y4) {
         if (this.x8 == Integer.MAX_VALUE) {
            this.x8 = 0;
         }

         this.y4 = true;
         this.a6.l6();
      }
   }

   void h0() {
      boolean var1 = this.y4;
      if (!var1 && this.t2 - this.c8 == this.x8) {
         this.y4 = true;
         this.a6.l6();
      }
   }

   void c8() {
      if (this.u3 && !this.r4 && this.n3 < this.x8 && !this.y4) {
         this.z1.a6();
         synchronized (this.j5) {
            if (this.n3 >= this.x8) {
               return;
            }

            byte[] var2 = null;
            int var3 = this.t2 - this.c8;
            int var7;
            if (this.x8 != Integer.MAX_VALUE) {
               var7 = this.x8 - this.n3;
               var2 = new byte[var7];
               if (this.h0 != null && var3 > 0) {
                  if (var3 > var7) {
                     var3 = var7;
                  }

                  com.aspose.slides.ms.System.y4.n5(this.h0, this.c8, var2, 0, var3);
               }

               int var11 = var7 - var3;

               for (int var12 = -1; var11 > 0 && var12 != 0; var3 += var12) {
                  var12 = this.a6.n5(this.u9, var2, var3, var11);
                  var11 -= var12;
               }
            } else {
               com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();
               byte[] var5 = null;
               if (this.h0 != null && var3 > 0) {
                  var4.write(this.h0, this.c8, var3);
                  if (this.t2 >= 8192) {
                     var5 = this.h0;
                  }
               }

               if (var5 == null) {
                  var5 = new byte[8192];
               }

               int var6;
               while ((var6 = this.a6.n5(this.u9, var5, 0, com.aspose.slides.ms.System.u3.n5((Object)(var5)).a6())) != 0) {
                  var4.write(var5, 0, var6);
               }

               var2 = var4.getBuffer();
               var7 = com.aspose.slides.internal.v6g.k5.u3(var4.getLength(), 11);
               this.x8 = var7;
            }

            this.h0 = var2;
            this.c8 = 0;
            this.t2 = var7;
            this.n3 = 0;
            this.y4 = true;
         }

         this.a6.l6();
      } else {
         if (this.u3 && !this.y4) {
            this.y4 = true;
            this.a6.l6();
         }
      }
   }

   private void n5(com.aspose.slides.ms.System.z7 var1) {
      s0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, s0.class);
      if (var2 == null || !var2.l6) {
         if (var1.n5() != null) {
            var2 = (s0)var1.n5();
            var2.n5(var1);
            var2.x8();
         } else {
            try {
               this.endWrite(var1);
            } catch (RuntimeException var4) {
            }
         }
      }
   }

   private void l6(com.aspose.slides.ms.System.z7 var1) {
      if (var1.n5() != null) {
         s0 var2 = (s0)var1.n5();
         var2.n5(var1);
         var2.x8();
      } else {
         try {
            this.endRead(var1);
         } catch (RuntimeException var4) {
         }
      }
   }

   @Override
   public int read(byte[] buffer, int offset, int size) {
      com.aspose.slides.ms.System.h0 var4 = this.a0;
      s0 var5 = (s0)this.beginRead(buffer, offset, size, var4, null);
      if (!var5.k5() && !var5.n5(this.getReadTimeout(), false)) {
         this.y4 = true;
         this.a6.n5(true);
         throw new a7("The operation has timed out.", 14);
      } else {
         return this.endRead(var5);
      }
   }

   @Override
   public com.aspose.slides.ms.System.z7 beginRead(byte[] buffer, int offset, int size, com.aspose.slides.ms.System.h0 cb, Object state) {
      if (!this.u3) {
         throw new NotSupportedException("this stream does not allow reading");
      }

      if (buffer == null) {
         throw new ArgumentNullException("buffer");
      }

      int var6 = com.aspose.slides.ms.System.u3.n5((Object)(buffer)).a6();
      if (offset >= 0 && var6 >= offset) {
         if (size >= 0 && var6 - offset >= size) {
            synchronized (this.j5) {
               this.e2++;
               this.z1.n5();
            }

            s0 var11 = new s0(cb, state, buffer, offset, size);
            if (this.n3 >= this.x8) {
               var11.n5(true, -1);
               var11.x8();
               return var11;
            }

            int var8 = this.t2 - this.c8;
            if (var8 > 0) {
               int var9 = var8 > size ? size : var8;
               com.aspose.slides.ms.System.y4.n5(this.h0, this.c8, buffer, offset, var9);
               this.c8 += var9;
               offset += var9;
               size -= var9;
               this.n3 += var9;
               if (size == 0 || this.n3 >= this.x8) {
                  var11.n5(true, var9);
                  var11.x8();
                  return var11;
               }

               var11.n5(var9);
            }

            if (cb != null) {
               cb = this.a0;
            }

            if (this.x8 != Integer.MAX_VALUE && this.x8 - this.n3 < size) {
               size = this.x8 - this.n3;
            }

            if (!this.r4) {
               var11.n5(this.a6.n5(this.u9, buffer, offset, size, cb, var11));
            } else {
               var11.n5(true, var11.n3());
               var11.x8();
            }

            return var11;
         } else {
            throw new ArgumentOutOfRangeException("size");
         }
      } else {
         throw new ArgumentOutOfRangeException("offset");
      }
   }

   @Override
   public int endRead(com.aspose.slides.ms.System.z7 r) {
      s0 var2 = (s0)r;
      if (var2.n5) {
         int var14 = var2.n3();
         return var14 >= 0 ? var14 : 0;
      }

      var2.n5 = true;
      if (!var2.k5()) {
         int var3 = -1;

         try {
            var3 = this.a6.n5(this.u9, var2);
         } catch (Exception var9) {
            synchronized (this.j5) {
               this.e2--;
               if (this.e2 == 0) {
                  this.z1.l6();
               }
            }

            this.y4 = true;
            this.a6.n5(true);
            var2.n5(false, var9);
            var2.x8();
            throw var9;
         }

         if (var3 < 0) {
            var3 = 0;
            this.r4 = true;
         }

         this.n3 += var3;
         var2.n5(false, var3 + var2.n3());
         var2.x8();
         if (var3 == 0) {
            this.x8 = this.n3;
         }
      }

      synchronized (this.j5) {
         this.e2--;
         if (this.e2 == 0) {
            this.z1.l6();
         }
      }

      if (this.n3 >= this.x8 && !this.y4) {
         this.c8();
      }

      int var13 = var2.n3();
      return var13 >= 0 ? var13 : 0;
   }

   private void k5(com.aspose.slides.ms.System.z7 var1) {
      s0 var2 = (s0)var1.n5();
      var2.n5(null);

      try {
         this.a6.n5(this.u9, true, var1);
         var2.n5(false, 0);
         if (!this.w1) {
            this.w1 = true;
            v8.n5((Object)this.a6);
         }
      } catch (Exception var4) {
         Exception var3 = var4;
         this.x8();
         this.y4 = true;
         this.a6.n5(true);
         if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.p6w.q0.class)) {
            var3 = new IOException("Error writing request", var4);
         }

         var2.n5(false, var3);
      }

      if (this.t4 && !this.q0 && this.u9.a6() > 0L && this.l6 == this.u9.a6()) {
         this.c4 = true;
      }

      var2.x8();
   }

   @Override
   public com.aspose.slides.ms.System.z7 beginWrite(byte[] buffer, int offset, int size, com.aspose.slides.ms.System.h0 cb, Object state) {
      if (this.u9.w1()) {
         throw new a7("The request was canceled.", null, 6);
      }

      if (this.u3) {
         throw new NotSupportedException("this stream does not allow writing");
      }

      if (buffer == null) {
         throw new ArgumentNullException("buffer");
      }

      int var6 = com.aspose.slides.ms.System.u3.n5((Object)(buffer)).a6();
      if (offset >= 0 && var6 >= offset) {
         if (size >= 0 && var6 - offset >= size) {
            if (this.q0) {
               synchronized (this.j5) {
                  this.t9++;
                  this.z1.n5();
               }
            }

            s0 var15 = new s0(cb, state);
            h6 var8 = new h6(this);
            if (this.q0) {
               this.m1 = true;
               String var9 = com.aspose.slides.ms.System.d1.n5("{0:X}\r\n", new Object[]{com.aspose.slides.internal.v6g.k5.l6(size)});
               byte[] var10 = com.aspose.slides.internal.l7h.j5.e2().u3(var9);
               int var11 = 2 + size + com.aspose.slides.ms.System.u3.n5((Object)(var10)).a6();
               byte[] var12 = new byte[var11];
               com.aspose.slides.ms.System.y4.n5(var10, 0, var12, 0, com.aspose.slides.ms.System.u3.n5((Object)(var10)).a6());
               com.aspose.slides.ms.System.y4.n5(buffer, offset, var12, com.aspose.slides.ms.System.u3.n5((Object)(var10)).a6(), size);
               com.aspose.slides.ms.System.y4.n5(n5, 0, var12, com.aspose.slides.ms.System.u3.n5((Object)(var10)).a6() + size, com.aspose.slides.ms.System.u3.n5((Object)(n5)).a6());
               if (this.t4) {
                  if (this.z3 == null) {
                     this.z3 = new com.aspose.slides.internal.z0k.e2();
                  }

                  this.z3.write(buffer, offset, size);
                  this.l6 = this.l6 + com.aspose.slides.internal.v6g.k5.u9(size, 9);
               }

               buffer = var12;
               offset = 0;
               size = var11;
            } else {
               this.n5(this.u9.a6(), this.l6, com.aspose.slides.internal.v6g.k5.u9(size, 9));
               if (this.t4) {
                  if (this.z3 == null) {
                     this.z3 = new com.aspose.slides.internal.z0k.e2();
                  }

                  this.z3.write(buffer, offset, size);
                  this.l6 = this.l6 + com.aspose.slides.internal.v6g.k5.u9(size, 9);
                  if (this.u9.a6() <= 0L || this.l6 < this.u9.a6()) {
                     var15.n5(true, 0);
                     var15.x8();
                     return var15;
                  }

                  var15.l6 = true;
                  this.m1 = true;
                  buffer = this.z3.getBuffer();
                  offset = 0;
                  size = com.aspose.slides.internal.v6g.k5.u3(this.l6, 11);
               }
            }

            try {
               var15.n5(this.a6.l6(this.u9, buffer, offset, size, var8, var15));
               if (var15.y4() == null) {
                  if (!var15.k5()) {
                     var15.n5(true, 0);
                  }

                  var15.x8();
               }
            } catch (RuntimeException var14) {
               if (!this.k5) {
                  throw var14;
               }

               var15.n5(true, 0);
               var15.x8();
            }

            this.l6 = this.l6 + com.aspose.slides.internal.v6g.k5.u9(size, 9);
            return var15;
         } else {
            throw new ArgumentOutOfRangeException("size");
         }
      } else {
         throw new ArgumentOutOfRangeException("offset");
      }
   }

   private void n5(long var1, long var3, long var5) {
      if (var1 != -1L) {
         long var7 = var1 - var3;
         if (var5 > var7) {
            this.x8();
            this.y4 = true;
            this.a6.n5(true);
            throw new v0(com.aspose.slides.ms.System.d1.n5(new String[]{"The number of bytes to be written is greater than ", "the specified ContentLength."}));
         }
      }
   }

   @Override
   public void endWrite(com.aspose.slides.ms.System.z7 r) {
      if (r == null) {
         throw new ArgumentNullException("r");
      }

      s0 var2 = com.aspose.slides.internal.v6g.k5.n5(r, s0.class);
      if (var2 == null) {
         throw new ArgumentException("Invalid IAsyncResult");
      }

      if (!var2.n5) {
         var2.n5 = true;
         if (var2.l6) {
            var2.u9();
            if (var2.c8()) {
               throw var2.t2();
            }
         } else if (!this.t4 || this.q0) {
            if (var2.c8()) {
               throw var2.t2();
            }

            if (this.q0) {
               synchronized (this.j5) {
                  this.t9--;
                  if (this.t9 == 0) {
                     this.z1.l6();
                  }
               }
            }
         }
      }
   }

   @Override
   public void write(byte[] buffer, int offset, int size) {
      com.aspose.slides.ms.System.h0 var4 = this.a0;
      s0 var5 = (s0)this.beginWrite(buffer, offset, size, var4, null);
      if (!var5.k5() && !var5.n5(this.getWriteTimeout(), false)) {
         this.x8();
         this.y4 = true;
         this.a6.n5(true);
         throw new IOException("Write timed out.");
      }

      this.endWrite(var5);
   }

   @Override
   public void flush() {
   }

   void n5(boolean var1, y0 var2) {
      z6.n5(new y8(this, var1), var2);
   }

   private boolean n5(z6 var1, boolean var2) {
      if (this.z8) {
         return false;
      }

      String var3 = this.u9.n3();
      boolean var4 = "GET".equals(var3) || "CONNECT".equals(var3) || "HEAD".equals(var3) || "TRACE".equals(var3);
      boolean var5 = "PROPFIND".equals(var3)
         || "PROPPATCH".equals(var3)
         || "MKCOL".equals(var3)
         || "COPY".equals(var3)
         || "MOVE".equals(var3)
         || "LOCK".equals(var3)
         || "UNLOCK".equals(var3);
      if (var2 && !var4 && this.z3 != null) {
         this.u9.n5(this.z3.getLength());
      }

      if (!this.q0 && this.u9.a6() <= -1L && !var4 && !var5) {
         return false;
      }

      this.z8 = true;
      this.k7 = this.u9.c4();
      com.aspose.slides.ms.System.z7 var6 = this.a6.l6(this.u9, this.k7, 0, com.aspose.slides.ms.System.u3.n5((Object)(this.k7)).a6(), new c3(this, var1), null);
      return var6 != null;
   }

   boolean t2() {
      return this.m1;
   }

   boolean n5(z6 var1) {
      if (this.m1) {
         return false;
      }

      this.m1 = true;
      if (!this.q0 && this.t4 && this.z3 != null) {
         byte[] var2 = this.z3.getBuffer();
         int var3 = com.aspose.slides.internal.v6g.k5.u3(this.z3.getLength(), 11);
         if (this.u9.a6() != -1L && this.u9.a6() < var3) {
            this.y4 = true;
            this.a6.n5(true);
            throw new a7("Specified Content-Length is less than the number of bytes to write", null, 11, null);
         } else {
            this.n5(true, new l4(this, var1, var3, var2));
            return true;
         }
      } else {
         return false;
      }
   }

   void s7() {
      this.m3 = true;
   }

   @Override
   public void close() {
      if (this.q0) {
         if (!this.m3) {
            this.m3 = true;
            this.z1.a6();
            byte[] var1 = com.aspose.slides.internal.l7h.j5.e2().u3("0\r\n\r\n");
            String var2 = null;
            String[] var7 = new String[]{var2};
            this.a6.n5(this.u9, var1, 0, com.aspose.slides.ms.System.u3.n5((Object)(var1)).a6(), var7);
            var2 = var7[0];
         }
      } else if (this.u3) {
         if (!this.y4) {
            this.h0();
            if (!this.y4) {
               this.y4 = true;
               this.a6.n5(true);
            }
         }
      } else if (!this.t4) {
         this.c4 = true;
         if (!this.w1) {
            this.w1 = true;
            v8.n5((Object)this.a6);
         }
      } else if (!this.m3 && !this.m1) {
         long var4 = this.u9.a6();
         if (!this.q0 && var4 != -1L && this.l6 != var4) {
            IOException var3 = new IOException("Cannot close the stream until all bytes are written");
            this.y4 = true;
            this.a6.n5(true);
            throw new a7("Request was cancelled.", var3, 6);
         }

         this.m3 = true;
      }
   }

   void x8() {
      this.z3 = null;
   }

   @Override
   public long seek(long a, int b) {
      throw new NotSupportedException();
   }

   @Override
   public void setLength(long a) {
      throw new NotSupportedException();
   }

   @Override
   public boolean canSeek() {
      return false;
   }

   @Override
   public boolean canRead() {
      return !this.m3 && this.u3;
   }

   @Override
   public boolean canWrite() {
      return !this.m3 && !this.u3;
   }

   @Override
   public long getLength() {
      if (!this.u3) {
         throw new NotSupportedException();
      } else {
         return com.aspose.slides.internal.v6g.k5.u9(this.s7, 9);
      }
   }

   @Override
   public long getPosition() {
      throw new NotSupportedException();
   }

   @Override
   public void setPosition(long value) {
      throw new NotSupportedException();
   }

   // $VF: synthetic method
   static void n5(p6 var0, com.aspose.slides.ms.System.z7 var1) {
      var0.l6(var1);
   }

   // $VF: synthetic method
   static void l6(p6 var0, com.aspose.slides.ms.System.z7 var1) {
      var0.n5(var1);
   }

   // $VF: synthetic method
   static void k5(p6 var0, com.aspose.slides.ms.System.z7 var1) {
      var0.k5(var1);
   }

   // $VF: synthetic method
   static boolean n5(p6 var0, z6 var1, boolean var2) {
      return var0.n5(var1, var2);
   }

   // $VF: synthetic method
   static w1 n5(p6 var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static v8 l6(p6 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static boolean k5(p6 var0) {
      return var0.w1;
   }

   // $VF: synthetic method
   static boolean n5(p6 var0, boolean var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static boolean u3(p6 var0) {
      return var0.q0;
   }

   // $VF: synthetic method
   static boolean l6(p6 var0, boolean var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static boolean k5(p6 var0, boolean var1) {
      return var0.c4 = var1;
   }
}
