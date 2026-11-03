package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class y7r {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("tableStyle", "tableStyleId");

   public static ITable n5(ShapeCollection var0, com.aspose.slides.internal.k4y.s1k var1, i1x var2) {
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.k4y.g1 var3 = var1.k5().n5().n3();
      int var4 = var3.u3().l6().length;
      int var5 = var3.a6().length;
      double[] var6 = new double[var4];
      double[] var7 = new double[var5];

      for (int var8 = 0; var8 < var4; var8++) {
         var6[var8] = var3.u3().l6()[var8].n5();
      }

      for (int var20 = 0; var20 < var5; var20++) {
         var7[var20] = var3.a6()[var20].l6();
      }

      if (var6.length != 0 && var7.length != 0) {
         Table[] var21 = new Table[]{var0.n5(var6, var7)};
         r8x var9 = var21[0].k5();
         l5u.n5(var21[0], var1, var2);
         com.aspose.slides.internal.k4y.d7u var10 = var3.k5();
         if (var10 != null) {
            x9f.n5(var21[0].getTableFormat().getFillFormat(), var10.c8(), var2.n5());
            w5i.n5(new y7r$1(var21), var10.t2(), var2.n5());
            var21[0].setRightToLeft(var10.n5());
            var21[0].setFirstRow(var10.l6());
            var21[0].setFirstCol(var10.k5());
            var21[0].setLastRow(var10.u3());
            var21[0].setLastCol(var10.a6());
            var21[0].setHorizontalBanding(var10.u9());
            var21[0].setVerticalBanding(var10.h0());
            if (var10.s7() != null) {
               switch (n5.n5(var10.s7().n5())) {
                  case 0:
                     com.aspose.slides.internal.k4y.a1k var11 = (com.aspose.slides.internal.k4y.a1k)var10.s7().l6();
                     var21[0].setStylePreset(-1);
                     s2a.n5(var21[0].u9(), var11, var2.n5());
                     break;
                  case 1:
                     com.aspose.slides.ms.System.o0 var12 = com.aspose.slides.internal.v6g.k5.u3(var10.s7().k5(), com.aspose.slides.ms.System.o0.class).k5();
                     int var13 = ((Presentation)var21[0].getPresentation()).n3().k7().l6(var12.k5());
                     var21[0].setStylePreset(var13);
                     if (var13 == -1) {
                        var21[0].n5(((Presentation)var21[0].getPresentation()).n3().k7().n5(var12.k5()));
                     }
                     break;
                  default:
                     throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var10.s7().n5(), "\""}));
               }
            } else {
               var21[0].setStylePreset(0);
            }

            var9.n5(var10.x8());
         }

         if (var21[0].u9() == null) {
            var21[0].setStylePreset(0);
         }

         com.aspose.slides.internal.k4y.y2o[] var26 = var3.u3().l6();

         for (int var24 = 0; var24 < var26.length; var24++) {
            var21[0].l6.n5(var24).a6().n5(var26[var24].l6());
         }

         com.aspose.slides.internal.k4y.j3b[] var14 = var3.a6();

         for (int var22 = 0; var22 < var14.length; var22++) {
            var21[0].n5.n5(var22).a6().n5(var14[var22].u3());
         }

         int var15 = var21[0].getRows().size();
         int var16 = var21[0].getColumns().size();
         int var23 = var15;

         while (var23 > 0) {
            Row var17 = var21[0].n5.n5(--var23);
            com.aspose.slides.internal.k4y.w3k[] var18 = var14[var23].k5();
            int var25 = var16;

            while (var25 > 0) {
               Cell var19 = var17.n5(--var25);
               p5k.n5(var19, var18[var25], var23, var15, var25, var16, var2.n5());
               var19.l6 = var18[var25].u3();
               var19.n5 = var18[var25].k5();
               var19.k5 = null;
               if (var19.h0()) {
                  var19.l6(false);
               }
            }
         }

         var21[0].c8();
         return var21[0];
      } else {
         return null;
      }
   }

   public static void n5(Table var0, com.aspose.slides.internal.k4y.s1k var1, g6c var2) {
      r8x var3 = var0.k5();
      com.aspose.slides.internal.k4y.m6n var4 = var1.k5().n5();
      com.aspose.slides.internal.k4y.g1 var5 = var4.n5();
      com.aspose.slides.internal.k4y.d7u var6 = var5.n5();
      var6.n5(var3.l6());
      x9f.n5(var0.getTableFormat().getFillFormat(), new y7r$2(var6), var2);
      w5i.n5(var0.getEffectFormat(), new y7r$3(var6), var2);
      if (var0.getStylePreset() == -1) {
         if (((Presentation)var0.getPresentation()).n3().k7().n5(var0.u9().n5().n5().k5()) != null) {
            com.aspose.slides.ms.System.o0 var7 = var0.u9().n5().n5().k5();
            var6.n5(new com.aspose.slides.internal.k4y.g7("tableStyleId", var7.k5()));
         } else {
            com.aspose.slides.internal.k4y.a1k var21 = (com.aspose.slides.internal.k4y.a1k)var6.k5("tableStyle").l6();
            s2a.n5(var0.u9(), var21, var2);
         }
      } else if (var0.getStylePreset() != 0) {
         com.aspose.slides.ms.System.o0 var22 = ((Presentation)var0.getPresentation()).n3().k7().n5(var0.getStylePreset()).k5();
         var6.n5(new com.aspose.slides.internal.k4y.g7("tableStyleId", var22.k5()));
      }

      var6.n5(var0.getRightToLeft());
      var6.l6(var0.getFirstRow());
      var6.k5(var0.getFirstCol());
      var6.u3(var0.getLastRow());
      var6.a6(var0.getLastCol());
      var6.u9(var0.getHorizontalBanding());
      var6.h0(var0.getVerticalBanding());
      int var23 = var0.getColumns().size();
      int var8 = var0.getRows().size();
      com.aspose.slides.internal.k4y.r2n var9 = var5.u3();

      for (int var10 = 0; var10 < var23; var10++) {
         com.aspose.slides.internal.k4y.y2o var11 = var9.n5();
         Column var12 = var0.l6.n5(var10);
         double var13 = 0.0;

         for (int var15 = 0; var15 < var8; var15++) {
            Cell var16 = var0.n5(var10, var15);
            if (!var16.c8() && var16.getColSpan() == 1) {
               double var29 = var16.getMarginLeft() + var16.getMarginRight() + 2.0;
               if (var13 < var29) {
                  var13 = var29;
               }
            } else if (!var16.c8()) {
               double var17 = var16.getMarginLeft() + 2.0;
               if (var13 < var17) {
                  var13 = var17;
               }
            } else {
               var16 = var16.a6();
               if (var16.getColSpan() <= var10 + 1 && var16.getFirstColumn() == var0.getColumns().get_Item(var10 - var16.getColSpan() + 1)) {
                  double var28 = var16.getMarginRight() + 2.0;
                  if (var13 < var28) {
                     var13 = var28;
                  }
               }
            }
         }

         var11.n5(com.aspose.slides.ms.System.q1.l6(var12.getWidth(), var13));
         var11.n5(var12.a6().n5());
      }

      for (int var24 = 0; var24 < var8; var24++) {
         com.aspose.slides.internal.k4y.j3b var25 = var5.l6();
         Row var26 = var0.n5.n5(var24);
         var25.n5(var26.getMinimalHeight());

         for (int var19 = 0; var19 < var23; var19++) {
            Cell var20 = var26.n5(var19);
            if (var26.getMinimalHeight() < var20.getMarginTop() + var20.getMarginBottom() + 2.0) {
               var25.n5(0.0);
            }

            p5k.n5(var20, new y7r$4(var25), var2);
         }

         var25.n5(var26.a6().n5());
      }

      l5u.n5(var0, var1, var2);
   }
}
