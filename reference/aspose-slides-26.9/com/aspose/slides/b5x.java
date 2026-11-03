package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class b5x extends d5 {
   private double n5;

   @Override
   public boolean l6() {
      return true;
   }

   @Override
   public void n5(k6a var1, double var2) {
      var1.n5(var2, 29, 30);
   }

   @Override
   public boolean n5(k6a var1) {
      y4g var2 = this.t2();
      List var3 = var1.r4();
      int var4 = var3.size();
      if (var4 != 0) {
         double var5 = var2.a6() == 0.0 ? 360.0 : var2.a6();
         double var7 = var2.u3() < 0.0 ? 360.0 + var2.u3() : var2.u3();
         double var9 = var1.a6(61);
         double var11 = var1.a6(15);
         b5x$n5 var13 = new b5x$n5(var9, var11, var7, var5, var2.u9());
         double var14 = var13.n5();
         double var16 = var1.a6(29);
         double[] var18 = new double[]{this.n5};
         double[] var19 = var13.n5(var4, var2.u9(), var18);
         this.n5 = var18[0];
         double[] var20 = new double[var4];
         u6x[] var21 = (u6x[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(u6x.class), var4));
         boolean var22 = true;

         for (int var23 = 0; var23 < var4; var23++) {
            k6a var24 = (k6a)var3.get_Item(var23);
            var22 &= var24.c8().l6() != null && var24.c8().l6().getShapeType() == 35;
            var20[var23] = var24.l6(29) ? var24.a6(29) : var16;
            e4c var25 = c8(var24).u9();
            var21[var23] = new u6x(u3(var19[var23]).u9(), var14, var25.n5, var25.l6);
         }

         if (var2.u9()) {
            k6a var40 = (k6a)var3.get_Item(0);
            var20[0] = var40.l6(30) ? var40.a6(30) : var1.a6(30);
         }

         if (var4 > 1) {
            boolean var41 = this.n5(var21, var20, var22);
            if (var41) {
               var14 *= 1.02;
            } else {
               var14 *= 0.98;
            }

            while (var14 > 1.0E-5 && n5(n5(new u6x(com.aspose.slides.ms.System.u3.n5(var21)), var9, var11))) {
               for (int var43 = 0; var43 < var4; var43++) {
                  e4c var46 = c8((k6a)var3.get_Item(var43)).u9();
                  var21[var43] = new u6x(u3(var19[var43]).u9(), var14, var46.n5, var46.l6);
               }

               boolean var44 = this.n5(var21, var20, var22);
               if (var44 != var41) {
                  break;
               }

               if (var44) {
                  var14 *= 1.02;
               } else {
                  var14 *= 0.98;
               }
            }
         }

         u6x var42 = new u6x(com.aspose.slides.ms.System.u3.n5(var21));
         k7t var45 = var1.c8();
         var45.a6(var42.t2());
         var45.c8(var42.s7());
         e4c var47 = new e4c(-var42.n5(), -var42.l6());
         double var26 = com.aspose.slides.ms.System.q1.k5(1.0, n5(var42.z1(), var9, var11));

         for (int var28 = 0; var28 < var4; var28++) {
            k6a var29 = (k6a)var3.get_Item(var28);
            k7t var30 = var29.c8();
            double var31 = var21[var28].n5() - var30.u9().n5 + var47.n5;
            double var33 = var21[var28].l6() - var30.u9().l6 + var47.l6;
            if (var2.k5()) {
               var30.x8(l6(var19[var28] + 90.0, false));
            }

            var30.n5(var31, var33);
            var29.u3(61, var30.s7() * var26);
            var29.u3(15, var30.e2() * var26);
            this.n5(var29, var19[var28], this.n5, var14, var47.u9(), (double)var1.l6().size() / var4);
         }

         for (int var48 = 0; var48 < var4; var48++) {
            k6a var50 = (k6a)var3.get_Item(var48);
            u6x var52 = var21[var48].z1();
            u6x var35 = var50.c8().e5().z1();
            double var36 = var52.t2() - var35.t2();
            double var38 = var52.s7() - var35.s7();
            if (var36 != 0.0 || var38 != 0.0) {
               var50.c8().n5(var36 / 2.0, var38 / 2.0);
            }
         }

         var45.z7();
         if (n5(var26)) {
            var1.n5(var26, 29, 30);
            var1.w1();
            return false;
         }

         l6(var1, var2.n5(), var2.l6());
         var1.u3(12, var14 * 2.0);
         e4c var49 = ((k6a)var3.get_Item(0)).c8().e5().x8().u9();
         e4c var51 = u3(var19[0]).u9();
         e4c var53 = new e4c(var49.n5 - var51.n5 * var14, var49.l6 - var51.l6 * var14);
         var1.c8().n5(6, var53.n5);
         var1.c8().n5(7, var53.l6);
      }

      return true;
   }

   public final double c8() {
      return this.n5;
   }

   @Override
   public e4c k5(k6a var1) {
      k7t var2 = var1.c8();
      e4c var3 = new e4c(var2.k5(2), var2.k5(3));
      return var3.l6() == 0.0 ? super.k5(var1) : var3;
   }

   private void n5(k6a var1, double var2, double var4, double var6, e4c var8, double var9) {
      k7t var11 = var1.c8();
      int var12 = var1.y4().k5().z3();
      int var13 = var1.y4().k5().m1();
      if (var12 != 0 || var13 != 0) {
         e4c var14 = c8(var1).u9();
         double var15 = var12 != 0 ? var12 / 100000.0 : 1.0;
         if (var13 != 0) {
            double var17 = var13 / 100000.0;
            var2 += var4 * (var17 / var9);
         }

         u6x var19 = new u6x(u3(var2).u9(), var6 * var15, var14.n5, var14.l6);
         var1.c8().n5(2, var19.n5() + var8.n5 - var11.u9().n5);
         var1.c8().n5(3, var19.l6() + var8.l6 - var11.u9().l6);
      }
   }

   private boolean n5(u6x[] var1, double[] var2, boolean var3) {
      boolean var4 = this.t2().u9();
      if (var4) {
         double var5 = var2[0];
         u6x var7 = var1[0].z1();

         for (int var8 = 1; var8 < var1.length; var8++) {
            u6x var9 = var1[var8].z1();
            boolean var10 = var3 ? n5(var7.z1(), var9.z1(), var5) : k5(var7.z1(), var9.z1(), var5);
            if (var10) {
               return true;
            }
         }
      }

      int var11 = var4 ? 1 : 0;

      for (int var12 = var11; var12 < var1.length; var12++) {
         u6x var13 = var1[var12].z1();

         for (int var14 = var11; var14 < var1.length; var14++) {
            u6x var15 = var1[var14].z1();
            if (var14 != var12) {
               boolean var16 = var3 ? n5(var13.z1(), var15.z1(), var2[var12]) : k5(var13.z1(), var15.z1(), var2[var12]);
               if (var16) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static boolean n5(u6x var0, u6x var1, double var2) {
      if ((var0.t2() != var0.s7() || var1.s7() != var1.t2()) && !(var2 < 0.0)) {
         return l6(var0.z1(), var1.z1(), var2);
      }

      double var4 = n5(
         var0.x8().u9(),
         com.aspose.slides.ms.System.q1.l6(var0.t2(), var0.s7()) / 2.0,
         var1.x8().u9(),
         com.aspose.slides.ms.System.q1.l6(var1.t2(), var1.s7()) / 2.0
      );
      return var4 - var2 < 0.0;
   }

   private static boolean l6(u6x var0, u6x var1, double var2) {
      double var4 = Double.MAX_VALUE;
      var0.l6(0.5).u3(var0);
      var1.l6(0.5).u3(var1);

      for (int var6 = 0; var6 < 360; var6++) {
         double var7 = var6 * (Math.PI / 180.0);
         double var9 = var1.t2() * com.aspose.slides.ms.System.q1.c8(var7);
         double var11 = var1.s7() * com.aspose.slides.ms.System.q1.h0(var7);
         e4c var13 = new e4c(var9 + var1.x8().n5, var11 + var1.x8().l6);
         if (q3g.k5(var0.z1(), var13.u9())) {
            return true;
         }

         e4c var14 = new e4c();
         e4c[] var15 = new e4c[]{var14};
         double var16 = q3g.n5(new e4c(var0.t2(), var0.s7()), new e4c(var13.n5 - var0.x8().n5, var13.l6 - var0.x8().l6), var15);
         var15[0].l6(var14);
         if (var16 < var4) {
            var4 = var16;
         }
      }

      return var4 < var2;
   }

   private static boolean k5(u6x var0, u6x var1, double var2) {
      double var4 = com.aspose.slides.ms.System.q1.l6(
         com.aspose.slides.ms.System.q1.l6(var0.t2(), var0.s7()), com.aspose.slides.ms.System.q1.l6(var1.t2(), var1.s7())
      );
      if (var4 / 2.0 < var2) {
         return l6(var0.z1(), var1.z1(), var2);
      }

      if (var2 >= 0.0) {
         u6x var6 = u6x.n5(var0, var1).z1();
         if (var6.t2() != 0.0 && var6.s7() != 0.0) {
            return true;
         }

         if (var2 > 0.0 && n5(var0.z1(), var1.z1()) <= var2) {
            return true;
         }
      } else {
         u6x var7 = u6x.n5(var0.n5(var2), var1).z1();
         if (var7.t2() != 0.0 && var7.s7() != 0.0) {
            return true;
         }
      }

      return false;
   }

   private static e4c c8(k6a var0) {
      double var1 = q3g.n5(100.0);
      double var3 = var0.c8().c8() == 0.0 && com.aspose.slides.internal.v6g.k5.l6(var0.s7(), h3o.class) ? var1 : var0.c8().s7();
      double var5 = var0.c8().n3() == 0.0 && com.aspose.slides.internal.v6g.k5.l6(var0.s7(), h3o.class) ? var1 : var0.c8().e2();
      return new e4c(var3, var5);
   }

   private static double n5(e4c var0, double var1, e4c var3, double var4) {
      double var6 = q3g.n5(var0.u9(), var3.u9());
      return var6 - (var1 + var4);
   }

   private static double n5(u6x var0, u6x var1) {
      e4c[] var2 = var0.t9();
      e4c[] var3 = var1.t9();
      double var4 = Double.MAX_VALUE;
      u6x var6 = new u6x();

      for (e4c var10 : var2) {
         for (e4c var14 : var3) {
            u6x var15 = new u6x(var10.u9(), var14.u9());
            if (var4 > var15.n3()) {
               var4 = var15.n3();
               var15.u3(var6);
            }
         }
      }

      for (e4c var21 : var3) {
         double var16 = n5(var1.z1(), var21.u9(), var2);
         if (var16 < var4) {
            var4 = var16;
         }
      }

      return var4;
   }

   private static double n5(u6x var0, e4c var1, e4c[] var2) {
      List var3 = var0.n5(var1.n5, var1.l6);
      e4c[] var4 = (e4c[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(e4c.class), var3.size()));

      for (int var5 = 0; var5 < var3.size(); var5++) {
         var4[var5] = new e4c(var1.n5 + ((j8t)var3.get_Item(var5)).n5(), var1.l6 + ((j8t)var3.get_Item(var5)).l6());
      }

      double var6 = Double.MAX_VALUE;
      e4c var8 = var2[0].u9();

      for (int var9 = 1; var9 <= var2.length; var9++) {
         e4c var10 = (var9 < var2.length ? var2[var9] : var2[0]).u9();

         for (e4c var14 : var4) {
            e4c var15 = new e4c();
            e4c[] var16 = new e4c[]{var15};
            boolean var17 = q3g.n5(var10.u9(), var8.u9(), var1.u9(), var14.u9(), var16) == 1;
            var16[0].l6(var15);
            if (var17) {
               double var18 = q3g.n5(var1.u9(), var15.u9());
               if (var18 < var6) {
                  var6 = var18;
               }
            }
         }

         var10.l6(var8);
      }

      return var6;
   }

   private static double n5(u6x var0, double var1, double var3) {
      double var5 = com.aspose.slides.ms.System.q1.k5(1.0, var1 / var0.t2());
      double var7 = com.aspose.slides.ms.System.q1.k5(1.0, var3 / var0.s7());
      return com.aspose.slides.ms.System.q1.k5(var5, var7);
   }

   private static double k5(double var0) {
      return l6(var0, false) * (Math.PI / 180.0);
   }

   private static double l6(double var0, boolean var2) {
      if (!var2) {
         var0 %= 360.0;
      }

      return var0 < 0.0 ? 360.0 + var0 : var0;
   }

   private static e4c u3(double var0) {
      if (com.aspose.slides.ms.System.d2.k5(var0)) {
         return e4c.k5;
      }

      double var2 = k5(var0);
      return new e4c(com.aspose.slides.ms.System.q1.c8(var2), com.aspose.slides.ms.System.q1.h0(var2));
   }

   private y4g t2() {
      return (y4g)this.n5();
   }

   // $VF: synthetic method
   static double n5(double var0, boolean var2) {
      return l6(var0, var2);
   }

   // $VF: synthetic method
   static double l6(double var0) {
      return k5(var0);
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(u6x.class, new b5x$1());
      com.aspose.slides.internal.v6g.k5.n5(e4c.class, new b5x$2());
   }
}
