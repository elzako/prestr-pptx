package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class l6w {
   public static u6x n5(SmartArtShape var0, s0 var1) {
      var0.n5(89);
      var0.getAdjustments().get_Item(0).setAngleValue((float)var1.a6());
      var0.getAdjustments().get_Item(1).setAngleValue((float)var1.u9());
      return new u6x(new e4c(var1.n5(), var1.l6()), var1.u3(), var1.u3());
   }

   public static u6x n5(SmartArtShape var0, s0 var1, y8 var2) {
      s0 var3 = var1.c8();
      if (!var2.n5() && var2.l6()) {
         if (var1.h0()) {
            k5(var0, var1.c8(), var2).n5(var3);
         } else {
            l6(var0, var1.c8(), var2).n5(var3);
         }
      } else if (var2.n5() && !var2.l6()) {
         if (var1.h0()) {
            l6(var0, var1.c8(), var2).n5(var3);
         } else {
            k5(var0, var1.c8(), var2).n5(var3);
         }
      } else if (var2.n5() && var2.l6()) {
         u3(var0, var1.c8(), var2).n5(var3);
      }

      if (!var2.n5() && !var2.l6()) {
         var0.n5(41);
         var0.getAdjustments().get_Item(0).setAngleValue((float)var1.a6());
         var0.getAdjustments().get_Item(1).setAngleValue((float)var1.u9());
         var0.getAdjustments().get_Item(2).setRawValue(com.aspose.slides.internal.v6g.k5.u9(var2.k5() * 2.0 / var1.k5() * 50000.0, 14));
         var1.n5(var1.k5() + var2.k5()).n5(var3);
      }

      return new u6x(new e4c(var3.n5(), var3.l6()), var3.u3(), var3.u3());
   }

   private static s0 l6(SmartArtShape var0, s0 var1, y8 var2) {
      var0.n5(65);
      double var3 = var1.l6(var2.a6());
      double var5 = q3g.k5(var1.u9() - var3);
      var1.n5(var1.k5() + var2.u3()).n5(var1);
      double var7 = var2.k5() * 2.0 / var1.k5();
      double var9 = var2.u3() / var1.k5();
      var0.getAdjustments().get_Item(0).setRawValue(com.aspose.slides.internal.v6g.k5.u9(var7 * 50000.0, 14));
      var0.getAdjustments().get_Item(1).setAngleValue((float)var3);
      var0.getAdjustments().get_Item(2).setAngleValue((float)var5);
      var0.getAdjustments().get_Item(3).setAngleValue((float)var1.a6());
      var0.getAdjustments().get_Item(4).setRawValue(com.aspose.slides.internal.v6g.k5.u9(var9 * 50000.0, 14));
      return var1;
   }

   private static s0 k5(SmartArtShape var0, s0 var1, y8 var2) {
      var0.n5(66);
      double var3 = var1.l6(var2.a6());
      double var5 = q3g.k5(var1.a6() + var3);
      var1.n5(var1.k5() + var2.u3()).n5(var1);
      double var7 = var2.k5() * 2.0 / var1.k5();
      double var9 = var2.u3() / var1.k5();
      var0.getAdjustments().get_Item(0).setRawValue(com.aspose.slides.internal.v6g.k5.u9(var7 * 50000.0, 14));
      var0.getAdjustments().get_Item(1).setAngleValue((float)var3);
      var0.getAdjustments().get_Item(2).setAngleValue((float)var5);
      var0.getAdjustments().get_Item(3).setAngleValue((float)var1.u9());
      var0.getAdjustments().get_Item(4).setRawValue(com.aspose.slides.internal.v6g.k5.u9(var9 * 50000.0, 14));
      return var1;
   }

   private static s0 u3(SmartArtShape var0, s0 var1, y8 var2) {
      var0.n5(67);
      double var3 = var1.l6(var2.a6());
      double var5 = q3g.k5(var1.u9() - var3);
      double var7 = q3g.k5(var1.a6() + var3);
      var1.n5(var1.k5() + var2.u3()).n5(var1);
      double var9 = var2.k5() * 2.0 / var1.k5();
      double var11 = var2.u3() / var1.k5();
      var0.getAdjustments().get_Item(0).setRawValue(com.aspose.slides.internal.v6g.k5.u9(var9 * 50000.0, 14));
      var0.getAdjustments().get_Item(1).setAngleValue((float)var3);
      var0.getAdjustments().get_Item(2).setAngleValue((float)var5);
      var0.getAdjustments().get_Item(3).setAngleValue((float)var7);
      var0.getAdjustments().get_Item(4).setRawValue(com.aspose.slides.internal.v6g.k5.u9(var11 * 50000.0, 14));
      return var1;
   }

   public static u6x n5(SmartArtShape var0, y8 var1) {
      var0.n5(1);
      u6x var2 = new u6x(var1.c8().u9(), var1.t2().u9());
      double var3 = var2.n3() - var1.u9() - var1.h0();
      return new u6x(n5(var1).u9(), var3, 0.0);
   }

   public static u6x l6(SmartArtShape var0, y8 var1) {
      double var2 = var1.s7().n3() - var1.u9() - var1.h0();
      double var4 = var1.u3() * 2.0;
      if (var1.n5() && var1.l6()) {
         var0.n5(51);
      } else if (!var1.n5() && var1.l6()) {
         var0.n5(44);
      } else if (var1.n5() && !var1.l6()) {
         var0.n5(45);
      } else {
         var0.n5(5);
         var4 = var1.k5() * 2.0;
      }

      if (var0.getShapeType() != 5) {
         var0.getAdjustments().get_Item(0).setRawValue(com.aspose.slides.internal.v6g.k5.u9(var1.k5() / var1.u3() * 100000.0, 14));
         var0.getAdjustments()
            .get_Item(1)
            .setRawValue(com.aspose.slides.internal.v6g.k5.u9(var1.a6() / com.aspose.slides.ms.System.q1.k5(var2, var4) * 100000.0, 14));
      }

      return new u6x(n5(var1).u9(), var2, var4);
   }

   private static e4c n5(y8 var0) {
      u6x var1 = var0.s7().z1();
      e4c var2 = var1.e2().u9();
      e4c var3 = new e4c(var1.a6() - var2.n5 * var0.u9(), var1.u9() - var2.l6 * var0.u9());
      e4c var4 = new e4c(var1.h0() + var2.n5 * var0.h0(), var1.c8() + var2.l6 * var0.h0());
      return new u6x(var3.u9(), var4.u9()).x8();
   }

   public static void n5(GeometryShape var0, e4c var1, e4c[] var2) {
      com.aspose.slides.internal.k4y.u1s var3 = new com.aspose.slides.internal.k4y.u1s();
      var3.x8().n5();
      com.aspose.slides.internal.k4y.c7f var4 = var3.x8().l6()[0];
      n5(var4, new e4c(var2[0].n5 - var1.n5, var2[0].l6 - var1.l6));

      for (int var5 = 1; var5 < var2.length; var5++) {
         l6(var4, new e4c(var2[var5].n5 - var1.n5, var2[var5].l6 - var1.l6));
      }

      n5(var0, var3);
   }

   public static e4c[] n5(k6a var0, u6x var1, k7t var2, k7t var3, int var4) {
      j8t var5 = new j8t();
      j8t var6 = new j8t();
      u6x var7 = var2.e5().z1();
      u6x var8 = var3.e5().z1();
      List var9 = var7.n5(var1.a6(), var1.u9());
      List var10 = var8.n5(var1.h0(), var1.c8());
      boolean var11 = false;
      boolean var12 = false;

      for (int var13 = 0; var13 < var9.size() && !var11; var13++) {
         j8t var14 = ((j8t)var9.get_Item(var13)).k5();

         for (int var15 = 0; var15 < var10.size(); var15++) {
            j8t var16 = ((j8t)var10.get_Item(var15)).k5();
            int var17 = var14.n5() + var16.n5();
            int var18 = var14.l6() + var16.l6();
            if (var17 == 0
               && var18 == 0
               && (
                  var14.n5() == 1 && var2.u3() < var3.u3()
                     || var14.n5() == -1 && var2.u3() > var3.u3()
                     || var14.l6() == 1 && var2.a6() < var3.a6()
                     || var14.l6() == -1 && var2.a6() > var3.a6()
               )) {
               var14.n5(var5);
               var16.n5(var6);
               var12 = true;
               var11 = true;
               break;
            }
         }
      }

      if (!var11) {
         for (int var23 = 0; var23 < var9.size() && !var11; var23++) {
            j8t var25 = ((j8t)var9.get_Item(var23)).k5();

            for (int var27 = 0; var27 < var10.size(); var27++) {
               j8t var29 = ((j8t)var10.get_Item(var27)).k5();
               byte var30 = var1.a6() > var1.h0() ? var25.n5() : var29.n5();
               byte var31 = var1.a6() < var1.h0() ? var25.n5() : var29.n5();
               byte var19 = var1.u9() > var1.c8() ? var25.l6() : var29.l6();
               byte var20 = var1.u9() < var1.c8() ? var25.l6() : var29.l6();
               if (var30 - var31 == -1 && var19 - var20 == -1) {
                  var25.n5(var5);
                  var29.n5(var6);
                  var11 = true;
                  break;
               }
            }
         }
      }

      List var24 = new List(4);
      var24.addItem(new e4c(var1.a6(), var1.u9()));
      if (var11) {
         if (var12) {
            e4c var26 = new e4c(var1.t2() / 2.0, var1.s7() / 2.0);
            e4c var28 = new e4c(var1.t2() / 2.0, var1.s7() / 2.0);
            double var21 = var0.a6(4);
            if (var4 == 1) {
               var26 = new e4c(var21, var21);
               var28 = new e4c(var1.t2() - var21, var1.s7() - var21);
            } else if (var4 == 2) {
               var26 = new e4c(var1.t2() - var21, var1.s7() - var21);
               var28 = new e4c(var21, var21);
            }

            var24.addItem(new e4c(var1.a6() + var26.n5 * var5.n5(), var1.u9() + var26.l6 * var5.l6()));
            var24.addItem(new e4c(var1.h0() + var28.n5 * var6.n5(), var1.c8() + var28.l6 * var6.l6()));
         } else {
            var24.addItem(new e4c(var1.a6() + var1.t2() * var5.n5(), var1.u9() + var1.s7() * var5.l6()));
         }
      }

      var24.addItem(new e4c(var1.h0(), var1.c8()));
      return (e4c[])var24.toArray(new e4c[0]);
   }

   public static u6x n5(e4c[] var0) {
      if (var0.length <= 1) {
         return new u6x();
      }

      double var1 = -Double.MAX_VALUE;
      double var3 = -Double.MAX_VALUE;
      double var5 = Double.MAX_VALUE;
      double var7 = Double.MAX_VALUE;

      for (e4c var12 : var0) {
         var5 = com.aspose.slides.ms.System.q1.k5(var5, var12.n5);
         var7 = com.aspose.slides.ms.System.q1.k5(var7, var12.l6);
         var1 = com.aspose.slides.ms.System.q1.l6(var1, var12.n5);
         var3 = com.aspose.slides.ms.System.q1.l6(var3, var12.l6);
      }

      return new u6x(new e4c(var5, var7), new e4c(var1, var3));
   }

   private static void n5(GeometryShape var0, com.aspose.slides.internal.k4y.u1s var1) {
      com.aspose.slides.internal.k4y.b9y var2 = new com.aspose.slides.internal.k4y.b9y();
      var2.n5(new com.aspose.slides.internal.k4y.g7("custGeom", var1));
      u7a.n5(var0, var2);
   }

   private static void n5(com.aspose.slides.internal.k4y.c7f var0, e4c var1) {
      com.aspose.slides.internal.k4y.p7x var2 = new com.aspose.slides.internal.k4y.p7x();
      var2.n5().n5(com.aspose.slides.ms.System.p3.n5(com.aspose.slides.internal.v6g.k5.u9(var1.n5 * 12700.0, 14), com.aspose.slides.internal.x7n.l6.k5()));
      var2.n5().l6(com.aspose.slides.ms.System.p3.n5(com.aspose.slides.internal.v6g.k5.u9(var1.l6 * 12700.0, 14), com.aspose.slides.internal.x7n.l6.k5()));
      var0.n5(new com.aspose.slides.internal.k4y.g7("moveTo", var2));
   }

   private static void l6(com.aspose.slides.internal.k4y.c7f var0, e4c var1) {
      com.aspose.slides.internal.k4y.c1x var2 = new com.aspose.slides.internal.k4y.c1x();
      var2.n5().n5(com.aspose.slides.ms.System.p3.n5(com.aspose.slides.internal.v6g.k5.u9(var1.n5 * 12700.0, 14), com.aspose.slides.internal.x7n.l6.k5()));
      var2.n5().l6(com.aspose.slides.ms.System.p3.n5(com.aspose.slides.internal.v6g.k5.u9(var1.l6 * 12700.0, 14), com.aspose.slides.internal.x7n.l6.k5()));
      var0.n5(new com.aspose.slides.internal.k4y.g7("lnTo", var2));
   }
}
