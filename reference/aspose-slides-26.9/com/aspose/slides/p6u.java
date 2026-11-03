package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.k4y.g7$n5;

class p6u {
   public static void n5(com.aspose.slides.internal.k4y.s5v var0, com.aspose.slides.internal.k0r.c9b var1, t2s var2) {
      if (var1.a6() == null) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.internal.k0r.b9y var3 = var1.a6();
      r2p.n5(var0.u9(), var1, var3.u3(), var2);
      n5(var0, var3, var2);
   }

   public static void n5(com.aspose.slides.internal.k4y.s5v var0, com.aspose.slides.internal.k0r.t6 var1, t2s var2) {
      if (var1.a6() == null) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.internal.k0r.b9y var3 = var1.a6();
      r2p.n5(var0.u9(), var1, var3.u3(), var2);
      n5(var0, var3, var2);
   }

   private static void n5(com.aspose.slides.internal.k4y.s5v var0, com.aspose.slides.internal.k0r.b9y var1, t2s var2) {
      if (var1 == null) {
         throw new InvalidOperationException();
      }

      if (var1.l6().u3()) {
         com.aspose.slides.internal.k4y.z4 var3 = var0.l6();
         n5(new p6u$1(var3), var1.l6().l6(), var2);
      }

      if (var1.l6().a6()) {
         com.aspose.slides.internal.k4y.z4 var6 = var0.k5();
         n5(new p6u$2(var6), var1.l6().k5(), var2);
      }

      if (var1.u3().a6() != null) {
         com.aspose.slides.internal.k0r.s5r var7 = com.aspose.slides.internal.v6g.k5.n5(var1.u3().a6().n5((short)4), com.aspose.slides.internal.k0r.s5r.class);
         if (var7 != null) {
            switch (var7.a6()) {
               case 0:
                  var0.n5((byte)0);
                  break;
               case 1:
                  var0.n5((byte)1);
                  break;
               default:
                  var0.n5((byte)-1);
            }
         }

         com.aspose.slides.internal.k0r.s5r var4 = com.aspose.slides.internal.v6g.k5.n5(var1.u3().a6().n5((short)5), com.aspose.slides.internal.k0r.s5r.class);
         if (var4 != null) {
            switch (var4.a6()) {
               case 0:
                  var0.l6((byte)0);
                  break;
               case 1:
                  var0.l6((byte)1);
                  break;
               default:
                  var0.l6((byte)-1);
            }
         }

         com.aspose.slides.internal.k0r.s5r var5 = com.aspose.slides.internal.v6g.k5.n5(var1.u3().a6().n5((short)6), com.aspose.slides.internal.k0r.s5r.class);
         if (var5 != null && var5.a6() == 1) {
            var0.u9().u3((byte)1);
         }
      }
   }

   private static void n5(g7$n5 var0, com.aspose.slides.internal.k0r.e8p var1, t2s var2) {
      switch ((int)var1.n5()) {
         case 0:
            com.aspose.slides.internal.k4y.e8p var3 = (com.aspose.slides.internal.k4y.e8p)var0.n5("srgbClr").l6();
            var3.n5(n5(var1));
            break;
         case 2:
            com.aspose.slides.internal.k4y.q4d var4 = (com.aspose.slides.internal.k4y.q4d)var0.n5("schemeClr").l6();
            var4.n5(0);
            var2.a6().n5("Color scheme is not parsed.", 1);
            break;
         default:
            throw new NotImplementedException();
      }
   }

   private static long n5(com.aspose.slides.internal.k0r.e8p var0) {
      int var1 = com.aspose.slides.internal.o9b.c8.n5(var0.l6(), var0.k5(), var0.u3()).h0();
      var1 &= 16777215;
      return var1 & 4294967295L;
   }

   public static void n5(com.aspose.slides.internal.k4y.s5v var0, com.aspose.slides.internal.k0r.a6 var1, d5t var2) {
      if (var0 != null) {
         if (var1 == null) {
            throw new InvalidOperationException();
         }

         com.aspose.slides.internal.k0r.b9y var3 = new com.aspose.slides.internal.k0r.b9y();
         var1.e2().addItem(var3);
         n5(var0, var3, var2);
         l6(var0, var3, var2);
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.s5v var0, com.aspose.slides.internal.k0r.b9y var1, d5t var2) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      com.aspose.slides.internal.k0r.y5s var3 = new com.aspose.slides.internal.k0r.y5s();
      var1.e2().addItem(var3);
      if (var0.h0() != null) {
         var3.n5(true);
         if (var0.h0().n5() == null) {
            throw new InvalidOperationException();
         }

         if ("rgb".equals(var0.h0().n5().n5())) {
            com.aspose.slides.internal.k4y.i5j var4 = (com.aspose.slides.internal.k4y.i5j)var0.h0().n5().l6();
            com.aspose.slides.internal.k0r.e8p var5 = new com.aspose.slides.internal.k0r.e8p(0L, w7n.n5(var4.n5()), w7n.n5(var4.l6()), w7n.n5(var4.k5()));
            var3.n5(var5);
         } else {
            var2.n5("Writing of the animation color behavior failed.", 1);
         }
      } else {
         var3.n5(false);
      }

      if (var0.c8() != null) {
         var3.l6(true);
         if (var0.c8().n5() == null) {
            throw new InvalidOperationException();
         }

         if ("srgbClr".equals(var0.c8().n5().n5())) {
            com.aspose.slides.internal.k4y.e8p var8 = (com.aspose.slides.internal.k4y.e8p)var0.c8().n5().l6();
            var8.n5(var8.n5() & 4294967295L & 16777215L & 4294967295L);
            int var10 = (int)var8.n5();
            com.aspose.slides.internal.o9b.c8 var6 = com.aspose.slides.internal.o9b.c8.n5(var10).o8();
            com.aspose.slides.internal.k0r.e8p var7 = new com.aspose.slides.internal.k0r.e8p(0L, var6.x8() & 255, var6.n3() & 255, var6.y4() & 255);
            var3.l6(var7);
         } else {
            var2.n5("Writing of the animation color behavior failed.", 1);
         }
      } else {
         var3.l6(false);
      }

      if (var0.t2() != null) {
         var3.k5(true);
         if (var0.t2().n5() == null) {
            throw new InvalidOperationException();
         }

         if ("srgbClr".equals(var0.t2().n5().n5())) {
            com.aspose.slides.internal.k4y.e8p var9 = (com.aspose.slides.internal.k4y.e8p)var0.t2().n5().l6();
            var9.n5(var9.n5() & 4294967295L & 16777215L & 4294967295L);
            int var11 = (int)var9.n5();
            com.aspose.slides.internal.o9b.c8 var12 = com.aspose.slides.internal.o9b.c8.n5(var11).o8();
            com.aspose.slides.internal.k0r.e8p var13 = new com.aspose.slides.internal.k0r.e8p(0L, var12.x8() & 255, var12.n3() & 255, var12.y4() & 255);
            var3.k5(var13);
         } else {
            var2.n5("Writing of the animation color behavior failed.", 1);
         }
      } else {
         var3.k5(false);
      }

      if (var0.u3() != -1) {
         var3.u3(true);
      } else {
         var3.u3(false);
      }

      if (var0.a6() != -1) {
         var3.a6(true);
      } else {
         var3.a6(false);
      }
   }

   private static void l6(com.aspose.slides.internal.k4y.s5v var0, com.aspose.slides.internal.k0r.b9y var1, d5t var2) {
      if (var0 == null) {
         throw new ArgumentNullException();
      }

      if (var1 == null) {
         throw new ArgumentNullException();
      }

      com.aspose.slides.internal.k4y.u2q var3 = var0.u9();
      com.aspose.slides.internal.k0r.q9u var4 = new com.aspose.slides.internal.k0r.q9u();
      var1.e2().addItem(var4);
      r2p.n5(var3, var4);
      r2p.l6(var3, var4);
      com.aspose.slides.internal.k0r.b1r var5 = new com.aspose.slides.internal.k0r.b1r();
      if (var0.u3() != -1) {
         if (!var1.l6().u9()) {
            throw new InvalidOperationException();
         }

         com.aspose.slides.internal.k0r.s5r var6 = new com.aspose.slides.internal.k0r.s5r(var0.u3() == 0 ? 0 : 1);
         var6.k5((short)4);
         var5.e2().addItem(var6);
      }

      if (var0.a6() != -1) {
         if (!var1.l6().h0()) {
            throw new InvalidOperationException();
         }

         com.aspose.slides.internal.k0r.s5r var7 = new com.aspose.slides.internal.k0r.s5r(var0.a6() == 0 ? 0 : 1);
         var7.k5((short)5);
         var5.e2().addItem(var7);
      }

      if (var3.a6() == 1) {
         com.aspose.slides.internal.k0r.s5r var8 = new com.aspose.slides.internal.k0r.s5r(1);
         var8.k5((short)6);
         var5.e2().addItem(var8);
      }

      if (var5.e2().size() > 0) {
         var4.e2().addItem(var5);
      }

      y1t.n5(var3.h0(), var4, var2);
   }
}
