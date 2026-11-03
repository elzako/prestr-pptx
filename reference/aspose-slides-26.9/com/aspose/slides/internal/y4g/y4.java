package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.IOException;

public class y4 extends e5 {
   private a3 x8;
   final com.aspose.slides.internal.v6g.n5<a3> n5 = new e2(this);
   private f0 n3;
   final com.aspose.slides.internal.v6g.n5<f0> l6 = new w1(this);
   private u9 y4;
   final com.aspose.slides.internal.v6g.n5<u9> k5 = new c4(this);
   private p3 e2;
   public final com.aspose.slides.internal.v6g.n5<p3> u3 = new y1(this);

   com.aspose.slides.internal.z0k.t4 l6() {
      return super.h0;
   }

   public com.aspose.slides.internal.f3c.u9 k5() {
      return this.c8.n3().k5();
   }

   public y4(com.aspose.slides.internal.z0k.t4 var1, String var2, boolean var3, int var4, com.aspose.slides.internal.f3c.s7 var5) {
      super(var1, var3);
      if (var2 != null && var2.length() != 0) {
         this.c8 = new z6(this, var4, var2, var5);
         this.t2 = new e9(this.u9, (z6)this.c8);
      } else {
         throw new ArgumentNullException("targetHost is null or an empty string.");
      }
   }

   @Override
   protected void finalize() throws Throwable {
      super.dispose(false);
      super.finalize();
   }

   @Override
   protected void dispose(boolean disposing) {
      super.dispose(disposing);
      if (disposing) {
         this.n5.k5(new d2(this));
         this.l6.k5(new d5(this));
         this.k5.k5(new s3(this));
         this.u3.k5(new p8(this));
      }
   }

   private void l6(com.aspose.slides.ms.System.z7 var1) {
      this.n5(var1, false);
   }

   private void n5(com.aspose.slides.ms.System.z7 var1, boolean var2) {
      byte[] var3 = this.t2.n5(var1);
      if (!var2 && (var3 == null || var3.length == 0)) {
         throw new n5((byte)40, "The server stopped the handshake.");
      }
   }

   @Override
   com.aspose.slides.ms.System.z7 n5(com.aspose.slides.ms.System.h0 var1, Object var2) {
      if (this.c8.e2() != 0) {
         this.c8.k5();
      }

      this.c8.n5(j9.n5(false, this.c8.u9()));
      this.c8.k5(1);
      y4$n5 var3 = new y4$n5(var1, var2, 0);
      this.t2.n5((byte)1, new f2(this), var3);
      return var3;
   }

   @Override
   void n5(com.aspose.slides.ms.System.z7 var1) {
      y4$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, y4$n5.class);
      if (var2 == null) {
         throw new ArgumentNullException();
      }

      if (!var2.k5()) {
         var2.l6().a6();
      }

      if (var2.u9()) {
         throw var2.a6();
      }
   }

   private void k5(com.aspose.slides.ms.System.z7 var1) {
      y4$n5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), y4$n5.class);

      try {
         switch (var2.u3()) {
            case 0:
               this.t2.k5(var1);
               var2.n5(1);
               this.t2.n5(this.u9, new z1(this), var2);
               break;
            case 1:
               this.n5(var1, true);
               if (this.c8.y4() == 14 || this.c8.u3() && this.c8.y4() == 2) {
                  if (this.c8.u3()) {
                     o5.l6(this.c8);
                     this.c8.p8().n5().n5();
                     this.c8.p8().n5().q0();
                     var2.n5(2);
                     this.t2.n5(new q0(this), var2);
                  } else {
                     boolean var3 = this.c8.x8().a6();
                     com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

                     try {
                        if (this.c8.u9() == 48) {
                           var3 = this.c8.n3().l6() != null && this.c8.n3().l6().size() > 0;
                        }

                        byte[] var5 = null;
                        if (var3) {
                           var5 = this.t2.k5((byte)11);
                           var4.write(var5, 0, var5.length);
                        }

                        var5 = this.t2.k5((byte)16);
                        var4.write(var5, 0, var5.length);
                        this.c8.p8().n5().q0();
                        if (var3 && this.c8.n3().k5() != null) {
                           var5 = this.t2.k5((byte)15);
                           var4.write(var5, 0, var5.length);
                        }

                        this.t2.l6(var4);
                        var5 = this.t2.k5((byte)20);
                        var4.write(var5, 0, var5.length);
                        var2.n5(4);
                        this.u9.beginWrite(var4.getBuffer(), 0, com.aspose.slides.internal.v6g.k5.u3(var4.getLength(), 11), new z3(this), var2);
                     } finally {
                        if (var4 != null) {
                           var4.dispose();
                        }
                     }
                  }
               } else {
                  this.t2.n5(this.u9, new t4(this), var2);
               }
               break;
            case 2:
               this.t2.l6(var1);
               var2.n5(3);
               this.t2.n5(this.u9, new m3(this), var2);
               break;
            case 3:
               this.n5(var1, true);
               if (this.c8.e2() != 2) {
                  this.t2.n5(this.u9, new z8(this), var2);
               } else {
                  var2.n5(6);
                  this.t2.n5((byte)20, new j5(this), var2);
               }
               break;
            case 4:
               this.u9.endWrite(var1);
               var2.n5(5);
               this.t2.n5(this.u9, new m1(this), var2);
               break;
            case 5:
               this.l6(var1);
               if (this.c8.e2() != 2) {
                  this.t2.n5(this.u9, new k7(this), var2);
               } else {
                  this.c8.q0().a6();
                  this.c8.d5();
                  var2.h0();
               }
               break;
            case 6:
               this.t2.k5(var1);
               this.c8.q0().a6();
               this.c8.d5();
               var2.h0();
         }
      } catch (n5 var11) {
         this.t2.n5(var11.n5());
         var2.n5(new IOException("The authentication or decryption has failed.", var11));
      } catch (RuntimeException var12) {
         this.t2.l6((byte)80);
         var2.n5(new IOException("The authentication or decryption has failed.", var12));
      }
   }

   @Override
   com.aspose.slides.internal.f3c.u9 n5(
      com.aspose.slides.internal.f3c.s7 var1, com.aspose.slides.internal.f3c.u9 var2, String var3, com.aspose.slides.internal.f3c.s7 var4
   ) {
      return !this.l6.n5() ? this.n3.n5(var1, var2, var3, var4) : null;
   }

   public boolean u3() {
      return !this.u3.n5();
   }

   @Override
   v0 n5(com.aspose.slides.internal.i2i.k5 var1) {
      p3 var2 = this.e2;
      return var2 != null ? var2.n5(var1) : null;
   }

   @Override
   boolean l6(com.aspose.slides.internal.f3c.u9 var1, int[] var2) {
      return !this.n5.n5() ? this.x8.n5(var1, var2) : var2 != null && var2.length == 0;
   }

   public boolean n5(com.aspose.slides.internal.f3c.u9 var1, int[] var2) {
      return super.k5(var1, var2);
   }

   public v0 l6(com.aspose.slides.internal.i2i.k5 var1) {
      return super.k5(var1);
   }

   public com.aspose.slides.internal.f3c.u9 l6(
      com.aspose.slides.internal.f3c.s7 var1, com.aspose.slides.internal.f3c.u9 var2, String var3, com.aspose.slides.internal.f3c.s7 var4
   ) {
      return super.k5(var1, var2, var3, var4);
   }

   @Override
   com.aspose.slides.internal.o8m.a6 n5(com.aspose.slides.internal.f3c.u9 var1, String var2) {
      return !this.k5.n5() ? this.y4.n5(var1, var2) : null;
   }

   public com.aspose.slides.internal.o8m.a6 l6(com.aspose.slides.internal.f3c.u9 var1, String var2) {
      return super.k5(var1, var2);
   }

   // $VF: synthetic method
   static a3 n5(y4 var0, a3 var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static f0 n5(y4 var0, f0 var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static u9 n5(y4 var0, u9 var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static p3 n5(y4 var0, p3 var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static void n5(y4 var0, com.aspose.slides.ms.System.z7 var1) {
      var0.k5(var1);
   }
}
