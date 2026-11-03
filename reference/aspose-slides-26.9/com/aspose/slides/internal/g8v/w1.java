package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.SystemException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

@com.aspose.slides.ms.System.j3
public class w1 extends b5 {
   private com.aspose.slides.ms.System.r8 c8;
   private com.aspose.slides.ms.System.r8 t2;
   private boolean s7;
   private boolean x8 = true;
   private boolean n3 = true;
   private com.aspose.slides.internal.f3c.s7 y4;
   private String e2;
   private boolean t9;
   private long z1 = -1L;
   private m3 t4;
   private t2 q0;
   private f2 z3;
   private boolean m1;
   private boolean k7;
   private boolean m3;
   private y5 z8;
   private boolean j5 = true;
   private int w1 = 50;
   private String r4 = com.aspose.slides.ms.System.d1.n5;
   private String c4 = "GET";
   private String y2 = "GET";
   private boolean y1 = true;
   private boolean a0;
   private boolean d2;
   private com.aspose.slides.ms.System.b5 d5 = com.aspose.slides.internal.g8v.j5.l6;
   private boolean s3;
   private com.aspose.slides.ms.System.b5 p8;
   private v4 f2;
   private boolean i1;
   private f0 e5;
   private int b3 = 100000;
   private p6 o0;
   private d2 z7;
   private s0 v4;
   private s0 u6;
   private com.aspose.slides.ms.System.i1 t1;
   private AtomicInteger a5 = new AtomicInteger(0);
   private boolean h2;
   private int v0;
   private boolean f0;
   private byte[] a3;
   private int p3;
   private boolean x9;
   private Exception y0;
   private final ReentrantLock j9 = new ReentrantLock();
   private boolean z6;
   v8 n5;
   private int e9;
   static int l6 = 65536;
   private int o5 = 300000;
   private w1$n5 j8 = new w1$n5();
   private w1$n5 w2 = new w1$n5();
   private String s0;
   private boolean v8;
   private boolean v3;
   private boolean g7;
   v8 k5;

   w1(com.aspose.slides.ms.System.r8 var1) {
      this.c8 = var1;
      this.t2 = var1;
      this.f2 = com.aspose.slides.internal.g8v.k7.n5();
      this.z8 = new y5(1);
      this.n5(true);
      this.s3();
   }

   private void s3() {
      this.j8 = new w1$n5(this, false);
      this.w2 = new w1$n5(this, true);
   }

   public com.aspose.slides.ms.System.r8 n5() {
      return this.t2;
   }

   public int l6() {
      return this.e9;
   }

   boolean k5() {
      return this.n3 && !"HEAD".equals(this.c4) && !"GET".equals(this.c4) && !"MKCOL".equals(this.c4) && !"CONNECT".equals(this.c4) && !"TRACE".equals(this.c4);
   }

   public com.aspose.slides.internal.f3c.s7 u3() {
      if (this.y4 == null) {
         this.y4 = new com.aspose.slides.internal.f3c.s7();
      }

      return this.y4;
   }

   @Override
   public long a6() {
      return this.z1;
   }

   void n5(long var1) {
      this.z1 = var1;
   }

   boolean u9() {
      return this.v8;
   }

   void n5(boolean var1) {
      this.v8 = var1;
   }

   @Override
   public f2 h0() {
      return this.z3;
   }

   @Override
   public void n5(f2 var1) {
      this.z3 = var1;
   }

   @Override
   public y5 c8() {
      return this.z8;
   }

   String t2() {
      return this.s0 == null ? this.t2.k5() : this.s0;
   }

   public boolean s7() {
      return this.j5;
   }

   public int x8() {
      return this.o5;
   }

   @Override
   public String n3() {
      return this.c4;
   }

   @Override
   public void n5(String var1) {
      if (var1 != null && !"".equals(com.aspose.slides.ms.System.d1.l6(var1))) {
         this.c4 = com.aspose.slides.ms.System.d1.s7(var1);
         if (!"HEAD".equals(this.c4)
            && !"GET".equals(this.c4)
            && !"POST".equals(this.c4)
            && !"PUT".equals(this.c4)
            && !"DELETE".equals(this.c4)
            && !"CONNECT".equals(this.c4)
            && !"TRACE".equals(this.c4)
            && !"MKCOL".equals(this.c4)) {
            this.c4 = var1;
         }
      } else {
         throw new ArgumentException("not a valid method");
      }
   }

   @Override
   public v4 y4() {
      return this.f2;
   }

   @Override
   public void n5(v4 var1) {
      this.p8();
      this.f2 = var1;
      this.e5 = null;
   }

   @Override
   public com.aspose.slides.ms.System.r8 e2() {
      return this.c8;
   }

   public boolean t9() {
      return this.i1;
   }

   public f0 z1() {
      return this.m3();
   }

   public String t4() {
      return this.z8.get_Item("Transfer-Encoding");
   }

   public boolean q0() {
      return this.v3;
   }

   boolean z3() {
      return this.f0;
   }

   void l6(boolean var1) {
      this.f0 = var1;
   }

   com.aspose.slides.ms.System.r8 m1() {
      return this.t2;
   }

   boolean k7() {
      return this.e5.u9() && !this.e5.h0();
   }

   public f0 m3() {
      synchronized (this.j9) {
         if (this.s7 || this.e5 == null) {
            this.e5 = com.aspose.slides.internal.g8v.x9.n5(this.t2, this.f2);
            this.s7 = false;
         }
      }

      return this.e5;
   }

   private boolean n5(z6 var1) {
      if (this.o0 != null && !this.o0.t2() && this.k5()) {
         if (this.z1 < 0L && this.o0.canWrite()) {
            return false;
         } else {
            return this.o0.a6() != this.z1 && (this.z1 != -1L || this.o0.canWrite()) ? false : this.o0.n5(var1);
         }
      } else {
         return false;
      }
   }

   @Override
   public com.aspose.slides.ms.System.z7 n5(com.aspose.slides.ms.System.h0 var1, Object var2) {
      if (this.w1()) {
         throw new a7("The request was canceled.", 6);
      } else if (this.c4 == null) {
         throw new v0("Method is null.");
      } else {
         String var3 = this.t4();
         if (!this.i1 && var3 != null && !"".equals(com.aspose.slides.ms.System.d1.l6(var3))) {
            throw new v0("SendChunked should be true.");
         } else {
            this.j9.lock();
            this.x9 = true;
            if (this.u6 != null && !this.m1) {
               this.j9.unlock();
               throw new InvalidOperationException(
                  com.aspose.slides.ms.System.d1.n5(new String[]{"Cannot re-call start of asynchronous ", "method while a previous call is still in progress."})
               );
            } else {
               this.u6 = new s0(this, var1, var2);
               s0 var4 = this.u6;
               this.y2 = this.c4;
               com.aspose.slides.internal.g8v.z6.n5(this.j9, new r4(this), new c4(this, var4));
               return var4;
            }
         }
      }
   }

   @Override
   public u8 n5(com.aspose.slides.ms.System.z7 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("asyncResult");
      } else {
         s0 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, s0.class);
         if (var2 == null) {
            throw new ArgumentException("Invalid IAsyncResult", "asyncResult");
         } else if (!var2.n5(this.b3, false)) {
            this.r4();
            throw new a7("The request timed out", 14);
         } else if (var2.c8()) {
            throw var2.t2();
         } else {
            return var2.e2();
         }
      }
   }

   @Override
   public u8 z8() {
      s0 var1 = (s0)this.n5((com.aspose.slides.ms.System.h0)null, (Object)null);
      return this.n5((com.aspose.slides.ms.System.z7)var1);
   }

   boolean j5() {
      return this.z6;
   }

   void k5(boolean var1) {
      this.z6 = var1;
   }

   boolean w1() {
      return !this.a5.compareAndSet(0, 0);
   }

   @Override
   public void r4() {
      if (!this.a5.compareAndSet(0, 1)) {
         if (!this.m1 || !this.z6) {
            this.m1 = true;
            if (this.t1 != null) {
               try {
                  this.t1.n5(this, com.aspose.slides.ms.System.f2.l6);
               } catch (RuntimeException var7) {
               }

               this.t1 = null;
            }

            if (this.v4 != null) {
               s0 var1 = this.v4;
               if (!var1.k5()) {
                  try {
                     a7 var2 = new a7("Aborted.", 6);
                     var1.n5(false, var2);
                     var1.x8();
                  } catch (RuntimeException var6) {
                  }
               }

               this.v4 = null;
            }

            if (this.u6 != null) {
               s0 var8 = this.u6;
               if (!var8.k5()) {
                  try {
                     a7 var9 = new a7("Aborted.", 6);
                     var8.n5(false, var9);
                     var8.x8();
                  } catch (RuntimeException var5) {
                  }
               }

               this.u6 = null;
            }

            if (this.o0 != null) {
               try {
                  this.o0.close();
                  this.o0 = null;
               } catch (RuntimeException var4) {
               }
            }

            if (this.z7 != null) {
               try {
                  this.z7.h0();
                  this.z7 = null;
               } catch (RuntimeException var3) {
               }
            }
         }
      }
   }

   @Override
   public void getObjectData(com.aspose.slides.internal.h3d.c4 serializationInfo, com.aspose.slides.internal.h3d.s3 streamingContext) {
      serializationInfo.n5("requestUri", this.c8, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.r8.class));
      serializationInfo.n5("actualUri", this.t2, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.r8.class));
      serializationInfo.n5("allowAutoRedirect", this.x8);
      serializationInfo.n5("allowBuffering", this.n3);
      serializationInfo.n5("certificates", this.y4, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.f3c.s7.class));
      serializationInfo.n5("connectionGroup", this.e2);
      serializationInfo.n5("contentLength", this.z1);
      serializationInfo.n5("webHeaders", this.z8, com.aspose.slides.internal.v6g.k5.n5(y5.class));
      serializationInfo.n5("keepAlive", this.j5);
      serializationInfo.n5("maxAutoRedirect", this.w1);
      serializationInfo.n5("mediaType", this.r4);
      serializationInfo.n5("method", this.c4);
      serializationInfo.n5("initialMethod", this.y2);
      serializationInfo.n5("pipelined", this.y1);
      serializationInfo.n5("version", this.d5, com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.b5.class));
      serializationInfo.n5("proxy", this.f2, com.aspose.slides.internal.v6g.k5.n5(v4.class));
      serializationInfo.n5("sendChunked", this.i1);
      serializationInfo.n5("timeout", this.b3);
      serializationInfo.n5("redirects", this.v0);
      serializationInfo.n5("host", this.s0);
   }

   private void p8() {
      if (this.m3) {
         throw new InvalidOperationException("request started");
      }
   }

   void n5(int var1, y5 var2) {
      if (this.t4 != null) {
         this.t4.n5(var1, var2);
      }
   }

   private void f2() {
      this.c4 = "GET";
      this.z8.k5("Transfer-Encoding");
      this.i1 = false;
   }

   private boolean n5(s0 var1, int var2, u8 var3) {
      this.v0++;
      SystemException var4 = null;
      String var5 = null;
      switch (var2) {
         case 300:
            var4 = new a7("Ambiguous redirect.");
            break;
         case 301:
         case 302:
            if ("POST".equals(this.c4)) {
               this.f2();
            }
            break;
         case 303:
            this.f2();
            break;
         case 304:
            return false;
         case 305:
            var4 = new NotImplementedException("Proxy support not available.");
            break;
         case 306:
         default:
            var4 = new v0(com.aspose.slides.ms.System.d1.n5(new String[]{"Invalid status code: ", com.aspose.slides.ms.System.a3.l6(var2)}));
         case 307:
      }

      if (!"GET".equals(this.c4) && !this.k5()) {
         var4 = new a7("The request requires buffering data to succeed.", null, 7, this.z7);
      }

      if (var4 != null) {
         throw var4;
      }

      this.z1 = -1L;
      var5 = this.z7.n5().get_Item("Location");
      if (var5 == null) {
         throw new a7(com.aspose.slides.ms.System.d1.n5(new String[]{"No Location header found for ", com.aspose.slides.ms.System.a3.l6(var2)}), 7);
      }

      com.aspose.slides.ms.System.r8 var6 = this.t2;

      try {
         this.t2 = new com.aspose.slides.ms.System.r8(this.t2, var5);
      } catch (RuntimeException var8) {
         throw new a7(com.aspose.slides.ms.System.d1.n5("Invalid URL ({0}) for {1}",new Object[]{ var5, com.aspose.slides.internal.v6g.k5.l6(var2)}), 7);
      }

      this.s7 = !com.aspose.slides.ms.System.d1.a6(this.t2.t9(), var6.t9()) || !com.aspose.slides.ms.System.d1.a6(this.t2(), var6.k5());
      return true;
   }

   private String i1() {
      boolean var1 = false;
      if (this.i1) {
         var1 = true;
         this.z8.a6("Transfer-Encoding", "chunked");
         this.z8.k5("Content-Length");
      } else if (this.z1 != -1L) {
         if (this.j8.l6() != 1 && this.w2.l6() != 1) {
            if (this.z1 > 0L) {
               var1 = true;
            }

            if (this.t9 || this.h2 || this.z1 > 0L) {
               this.z8.u3("Content-Length", com.aspose.slides.ms.System.p3.l6(this.z1));
            }
         } else if (!this.t9 && !this.h2 && this.z1 <= 0L) {
            this.z8.k5("Content-Length");
         } else {
            this.z8.u3("Content-Length", "0");
         }

         this.z8.k5("Transfer-Encoding");
      } else {
         this.z8.k5("Content-Length");
      }

      if (com.aspose.slides.ms.System.b5.n5(this.p8, com.aspose.slides.internal.g8v.j5.l6) && var1 && this.e5.a6()) {
         this.z8.a6("Expect", "100-continue");
         this.f0 = true;
      } else {
         this.z8.k5("Expect");
         this.f0 = false;
      }

      boolean var2 = this.k7();
      String var3 = var2 ? "Proxy-Connection" : "Connection";
      this.z8.k5(!var2 ? "Proxy-Connection" : "Connection");
      com.aspose.slides.ms.System.b5 var4 = this.e5.k5();
      boolean var5 = var4 == null || com.aspose.slides.ms.System.b5.n5(var4, com.aspose.slides.internal.g8v.j5.n5);
      if (this.j5 && (com.aspose.slides.ms.System.b5.n5(this.d5, com.aspose.slides.internal.g8v.j5.n5) || var5)) {
         if (this.z8.get_Item(var3) == null || com.aspose.slides.ms.System.d1.u9(this.z8.get_Item(var3), "keep-alive", (short)5) == -1) {
            this.z8.a6(var3, "keep-alive");
         }
      } else if (!this.j5 && com.aspose.slides.ms.System.b5.n5(this.d5, com.aspose.slides.internal.g8v.j5.l6)) {
         this.z8.a6(var3, "close");
      }

      this.z8.u3("Host", this.t2());
      if (this.q0 != null) {
         String var6 = this.q0.n5(this.t2);
         if (!"".equals(var6)) {
            this.z8.a6("Cookie", var6);
         } else {
            this.z8.k5("Cookie");
         }
      }

      String var7 = null;
      if ((this.e9 & 1) != 0) {
         var7 = "gzip";
      }

      if ((this.e9 & 2) != 0) {
         var7 = var7 != null ? "gzip, deflate" : "deflate";
      }

      if (var7 != null) {
         this.z8.a6("Accept-Encoding", var7);
      }

      if (!this.d2 && this.a0) {
         this.e5();
      }

      return this.z8.toString();
   }

   private void e5() {
      boolean var1 = this.f2 != null && !this.f2.l6(this.t2);
      f2 var2 = var1 && this.z3 == null ? this.f2.n5() : this.z3;
      l6 var3 = com.aspose.slides.internal.g8v.n5.n5(this, var2);
      if (var3 != null) {
         this.z8.k5("Proxy-Authorization");
         this.z8.k5("Authorization");
         String var4 = var1 && this.z3 == null ? "Proxy-Authorization" : "Authorization";
         this.z8.set_Item(var4, var3.n5());
         this.d2 = true;
      }
   }

   void n5(int var1, Exception var2) {
      if (!this.w1()) {
         s0 var3 = this.v4;
         if (var3 == null) {
            var3 = this.u6;
         }

         if (var3 != null) {
            a7 var5;
            if (var2 == null) {
               String var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"Error: ", com.aspose.slides.ms.System.d5.getName(r8.class, var1)});
               var5 = new a7(var4, var1);
            } else {
               String var6 = com.aspose.slides.ms.System.d1.n5("Error: {0} ({1})",new Object[]{ com.aspose.slides.internal.v6g.k5.l6(var1), var2.getMessage()});
               var5 = new a7(var6, var2, var1);
            }

            var3.n5(false, var5);
            var3.x8();
         }
      }
   }

   byte[] c4() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      String var2;
      if (!this.k7()) {
         var2 = this.t2.n3();
      } else {
         var2 = com.aspose.slides.ms.System.d1.n5("{0}://{1}{2}",new Object[]{ this.t2.t9(), this.t2(), this.t2.n3()});
      }

      if (!this.s3 && this.e5.k5() != null && com.aspose.slides.ms.System.b5.k5(this.e5.k5(), this.d5)) {
         this.p8 = this.e5.k5();
      } else {
         this.p8 = this.d5;
      }

      var1.n5("{0} {1} HTTP/{2}.{3}\r\n", this.c4, var2, com.aspose.slides.internal.v6g.k5.l6(this.p8.n5()), com.aspose.slides.internal.v6g.k5.l6(this.p8.l6()));
      var1.n5(this.i1());
      String var3 = var1.toString();
      return com.aspose.slides.internal.l7h.j5.z3().u3(var3);
   }

   void n5(p6 var1) {
      if (!this.w1()) {
         this.o0 = var1;
         if (this.a3 != null) {
            this.z8.k5("Transfer-Encoding");
            this.z1 = this.p3;
            this.o0.n5(false);
         }

         this.o0.n5(false, new y2(this));
      }
   }

   private void n5(y0 var1) {
      com.aspose.slides.internal.g8v.z6.n5(new a0(this), var1);
   }

   private void n5(Exception var1) {
      a7 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, a7.class);
      if (var2 != null) {
         this.n5(var2.n5(), var2);
      } else {
         this.n5(4, var1);
      }
   }

   void n5(int var1, Exception var2, String var3) {
      if (!this.w1()) {
         synchronized (this.j9) {
            String var5 = com.aspose.slides.ms.System.d1.n5("Error getting response stream ({0}): {1}",new Object[]{ var3, com.aspose.slides.internal.v6g.k5.l6(var1)});
            s0 var6 = this.u6;
            if (var6 == null) {
               var6 = this.v4;
            }

            a7 var7;
            if (com.aspose.slides.internal.v6g.k5.l6(var2, a7.class)) {
               var7 = (a7)var2;
            } else {
               var7 = new a7(var5, var2, var1, null);
            }

            if (var6 != null) {
               if (!var6.k5()) {
                  var6.n5(false, var7);
                  var6.x8();
               } else if (var6 == this.v4) {
                  this.y0 = var7;
               }

               this.m1 = true;
               this.u6 = null;
               this.v4 = null;
            } else {
               this.m1 = true;
               this.y0 = var7;
            }
         }
      }
   }

   private void l6(i9 var1) {
      int var2 = var1.n5;
      if (var2 >= 400 && var2 != 401 && var2 != 407) {
         if (this.o0 != null && this.u6 == null && !this.o0.k5()) {
            this.y0 = new a7(var1.l6, null, 7, this.z7);
            if (!this.n3 && !this.i1 && this.o0.l6 < this.z1) {
               this.o0.k5 = true;
            } else {
               this.z7.a6();
            }
         }
      }
   }

   private boolean n5(s0 var1) {
      boolean var2 = this.z7.k5() == 407;
      if ((var2 ? this.w2.l6() : this.j8.l6()) == 0) {
         return false;
      }

      p6 var3 = com.aspose.slides.internal.v6g.k5.n5(this.z7.u9(), p6.class);
      if (var3 != null) {
         v8 var4 = var3.l6();
         var4.l6(this);
         f2 var5 = !var2 ? this.z3 : this.f2.n5();
         if (var5 != null) {
            var4.n5(var5.n5(this.c8, "NTLM"));
            var4.k5(this.v3);
         }
      }

      var1.s7();
      this.z6 = false;
      this.m1 = false;
      this.z7.a6();
      this.z7 = null;
      return true;
   }

   void n5(i9 var1) {
       synchronized (this.j9) {
           if (this.w1()) {
               if (var1.u9 != null) var1.u9.close();
               return;
           }
           a7 var3 = null;
           try {
               this.z7 = new d2(this.t2, this.c4, var1, this.q0);
           } catch (Exception var4) {
               var3 = new a7(var4.getMessage(), var4, 7, null);
               if (var1.u9 != null) var1.u9.close();
           }
           if (var3 == null && ("POST".equals(this.c4) || "PUT".equals(this.c4))) {
               this.l6(var1);
               if (this.y0 != null) var3 = (a7)this.y0;
           }
           s0 var4 = this.u6;
           boolean var5 = false;
           if (var4 == null && this.z7 != null) {
               var5 = true;
               var4 = new s0(null, null);
               var4.n5(false, this.z7);
           }
           if (var4 != null) {
               if (var3 != null) {
                   this.m1 = true;
                   if (!var4.k5()) var4.n5(false, var3);
                   var4.x8();
                   return;
               }
               boolean var6 = this.k7() && !this.f2.l6(this.t2);
               try {
                   boolean var7 = this.l6(var4);
                   if (!var7) {
                       if ((var6 ? this.w2.k5() : this.j8.k5()) && this.z7 != null && this.z7.k5() < 400) {
                           p6 var8 = com.aspose.slides.internal.v6g.k5.n5(this.z7.u9(), p6.class);
                           if (var8 != null) {
                               v8 var9 = var8.l6();
                               var9.l6(true);
                           }
                       }
                       if (this.o0 != null) this.o0.x8();
                       this.m1 = true;
                       var4.n5(false, this.z7);
                       var4.x8();
                   } else {
                       if (this.i1) {
                           this.i1 = false;
                           this.z8.k5("Transfer-Encoding");
                       }
                       if (this.z7 != null) {
                           if (this.n5(var4)) return;
                           this.z7.h0();
                       }
                       this.z6 = false;
                       this.m1 = false;
                       this.z7 = null;
                       var4.s7();
                       this.e5 = this.m3();
                       this.t1 = this.e5.n5(this, this.e2);
                   }
               } catch (a7 var8) {
                   if (var5) {
                       this.y0 = var8;
                       this.m1 = true;
                   }
                   var4.n5(false, var8);
                   var4.x8();
                   return;
               } catch (Exception var8) {
                   var3 = new a7(var8.getMessage(), var8, 7, null);
                   if (var5) {
                       this.y0 = var3;
                       this.m1 = true;
                   }
                   var4.n5(false, var3);
                   var4.x8();
                   return;
               }
           }
       }
   }

   private boolean n5(u8 var1, int var2) {
      boolean var3 = var2 == 407;
      return var3 ? this.w2.n5(var1, var2) : this.j8.n5(var1, var2);
   }

   private boolean l6(s0 var1) {
      if (var1.c8()) {
         this.a3 = null;
         throw var1.t2();
      }

      Exception var2 = var1.t2();
      d2 var3 = var1.e2();
      byte var4 = 7;
      int var5 = 0;
      if (var2 == null && this.z7 != null) {
         var5 = this.z7.k5();
         if ((!this.j8.n5() && var5 == 401 && this.z3 != null || this.k7() && !this.w2.n5() && var5 == 407) && !this.d2 && this.n5(this.z7, var5)) {
            if (this.k5()) {
               if (this.o0.a6() > 0) {
                  this.a3 = this.o0.u3();
                  this.p3 = this.o0.a6();
               }

               return true;
            }

            if (!"PUT".equals(this.c4) && !"POST".equals(this.c4)) {
               this.a3 = null;
               return true;
            }

            if (!this.u9()) {
               return false;
            }

            this.o0.s7();
            this.o0 = null;
            this.z7.h0();
            this.z7 = null;
            this.a3 = null;
            throw new a7(
               com.aspose.slides.ms.System.d1.n5(new String[]{"This request requires buffering ", "of data for authentication or ", "redirection to be sucessful."})
            );
         }

         this.a3 = null;
         if (var5 >= 400) {
            String var6 = com.aspose.slides.ms.System.d1.n5(
               "The remote server returned an error: ({0}) {1}.",new Object[]{ com.aspose.slides.internal.v6g.k5.l6(var5), this.z7.u3()
            });
            var2 = new a7(var6, null, var4, this.z7);
            this.z7.a6();
         } else if (var5 == 304 && this.x8) {
            String var7 = com.aspose.slides.ms.System.d1.n5(
               "The remote server returned an error: ({0}) {1}.",new Object[]{ com.aspose.slides.internal.v6g.k5.l6(var5), this.z7.u3()
            });
            var2 = new a7(var7, null, var4, this.z7);
         } else if (var5 >= 300 && this.x8 && this.v0 >= this.w1) {
            var2 = new a7("Max. redirections exceeded.", null, var4, this.z7);
            this.z7.a6();
         }
      }

      this.a3 = null;
      if (var2 == null) {
         boolean var8 = false;
         if (this.x8 && var5 >= 300) {
            var8 = this.n5(var1, var5, this.z7);
            if (this.k5() && this.o0.a6() > 0) {
               this.a3 = this.o0.u3();
               this.p3 = this.o0.a6();
            }

            if (var8 && !this.v3) {
               this.j8.u3();
               this.w2.u3();
            }
         }

         if (var3 != null && var5 >= 300 && var5 != 304) {
            var3.a6();
         }

         return var8;
      } else {
         if (!this.u9()) {
            return false;
         }

         if (this.o0 != null) {
            this.o0.s7();
            this.o0 = null;
         }

         this.z7 = null;
         throw var2;
      }
   }

   boolean y2() {
      return this.g7;
   }

   void u3(boolean var1) {
      this.g7 = var1;
   }

   // $VF: synthetic method
   static boolean n5(w1 var0, z6 var1) {
      return var0.n5(var1);
   }

   // $VF: synthetic method
   static boolean n5(w1 var0) {
      return var0.m1;
   }

   // $VF: synthetic method
   static Exception l6(w1 var0) {
      return var0.y0;
   }

   // $VF: synthetic method
   static d2 k5(w1 var0) {
      return var0.z7;
   }

   // $VF: synthetic method
   static boolean u3(w1 var0) {
      return var0.m3;
   }

   // $VF: synthetic method
   static boolean n5(w1 var0, boolean var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static int n5(w1 var0, int var1) {
      return var0.v0 = var1;
   }

   // $VF: synthetic method
   static f0 n5(w1 var0, f0 var1) {
      return var0.e5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.i1 n5(w1 var0, com.aspose.slides.ms.System.i1 var1) {
      return var0.t1 = var1;
   }

   // $VF: synthetic method
   static String a6(w1 var0) {
      return var0.e2;
   }

   // $VF: synthetic method
   static f0 u9(w1 var0) {
      return var0.e5;
   }

   // $VF: synthetic method
   static void n5(w1 var0, Exception var1) {
      var0.n5(var1);
   }

   // $VF: synthetic method
   static boolean l6(w1 var0, boolean var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static s0 h0(w1 var0) {
      return var0.v4;
   }

   // $VF: synthetic method
   static p6 c8(w1 var0) {
      return var0.o0;
   }

   // $VF: synthetic method
   static s0 n5(w1 var0, s0 var1) {
      return var0.v4 = var1;
   }

   // $VF: synthetic method
   static void n5(w1 var0, y0 var1) {
      var0.n5(var1);
   }

   // $VF: synthetic method
   static byte[] t2(w1 var0) {
      return var0.a3;
   }

   // $VF: synthetic method
   static w1$n5 s7(w1 var0) {
      return var0.j8;
   }

   // $VF: synthetic method
   static w1$n5 x8(w1 var0) {
      return var0.w2;
   }

   // $VF: synthetic method
   static int n3(w1 var0) {
      return var0.p3;
   }

   // $VF: synthetic method
   static byte[] n5(w1 var0, byte[] var1) {
      return var0.a3 = var1;
   }

   // $VF: synthetic method
   static String y4(w1 var0) {
      return var0.c4;
   }

   // $VF: synthetic method
   static boolean e2(w1 var0) {
      return var0.x9;
   }

   // $VF: synthetic method
   static f2 t9(w1 var0) {
      return var0.z3;
   }

   // $VF: synthetic method
   static v4 z1(w1 var0) {
      return var0.f2;
   }

   // $VF: synthetic method
   static y5 t4(w1 var0) {
      return var0.z8;
   }
}
