package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class w7s {
   public static void n5(ILineFormat var0, com.aspose.slides.internal.k4y.p3w var1, h6j var2) {
      if (var0 == null) {
         throw new ArgumentNullException("lineFormat");
      }

      if (var1 == null) {
         throw new ArgumentNullException("graphicProperties");
      }

      int var3 = var1.n5();
      if (var0.getDashStyle() == -1 && var1.n5() == 0) {
         var3 = 1;
      }

      if (t2f.k5(var1.u3())) {
         ((ColorFormat)var0.getFillFormat().getSolidFillColor()).n5(t2f.x8(var1.u3()).o8());
         if (t2f.k5(var1.t2())) {
            int var4 = t2f.u3(var1.t2());
            if (var4 < 100 && var4 >= 0) {
               ((ColorFormat)var0.getFillFormat().getSolidFillColor()).n5(t2f.n5(((ColorFormat)var0.getFillFormat().getSolidFillColor()).u3().o8(), var4).o8());
            }
         }
      }

      l6(var0, var1, var2);
      if (t2f.k5(var1.k5())) {
         double var5 = t2f.u9(var1.k5());
         if (!com.aspose.slides.ms.System.d2.k5(var5)) {
            var0.setWidth(var5);
         }
      }

      switch (var1.s7()) {
         case 1:
            var0.setJoinStyle((byte)2);
            break;
         case 2:
            var0.setJoinStyle((byte)0);
            break;
         case 3:
            var0.setJoinStyle((byte)1);
      }

      switch (var3) {
         case 0:
            break;
         case 1:
            var0.getFillFormat().setFillType((byte)0);
            var0.setDashStyle((byte)0);
            break;
         case 2:
            k5(var0, var1, var2);
            break;
         case 3:
            var0.getFillFormat().setFillType((byte)1);
            var0.setDashStyle((byte)0);
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   public static void n5(ILineFormat var0, String var1, boolean var2, h6j var3) {
      if (var0 == null) {
         throw new ArgumentNullException("lineFormat");
      }

      if (!com.aspose.slides.ms.System.d1.n5(var1)) {
         if (com.aspose.slides.ms.System.d1.a6("none", var1)) {
            var0.getFillFormat().setFillType((byte)0);
         } else {
            String[] var4 = com.aspose.slides.ms.System.d1.n5(var1, ' ');

            for (int var5 = 0; var5 < var4.length; var5++) {
               if (!com.aspose.slides.ms.System.d1.n5(var4[var5])) {
                  if (var5 == 0) {
                     double var6 = t2f.u9(var4[var5]);
                     var0.setWidth(var2 ? var6 : var6 * 2.0);
                  } else if (var5 == 1) {
                     if (com.aspose.slides.ms.System.d1.a6("solid", var4[var5])) {
                        var0.getFillFormat().setFillType((byte)1);
                        var0.setDashStyle((byte)0);
                     }
                  } else if (var5 == 2) {
                     ((ColorFormat)var0.getFillFormat().getSolidFillColor()).n5(t2f.x8(var4[var5]).o8());
                  }
               }
            }
         }
      }
   }

   private static void l6(ILineFormat var0, com.aspose.slides.internal.k4y.p3w var1, h6j var2) {
      if (t2f.k5(var1.a6()) && var2.l6().l6().containsKey(var1.a6())) {
         com.aspose.slides.internal.k4y.s1v var3 = var2.l6().l6().get_Item(var1.a6());
         byte var4 = 0;
         byte var5 = 0;
         byte var6 = 0;
         byte[] var7 = new byte[]{0};
         byte[] var8 = new byte[]{0};
         byte[] var9 = new byte[]{0};
         c3.n5(var3.k5(), var3.l6(), t2f.u9(var1.k5()), t2f.u9(var1.h0()), var7, var8, var9);
         var4 = var7[0];
         var5 = var8[0];
         var6 = var9[0];
         var0.setBeginArrowheadStyle(var4);
         var0.setBeginArrowheadLength(var5);
         var0.setBeginArrowheadWidth(var6);
      }

      if (t2f.k5(var1.u9()) && var2.l6().l6().containsKey(var1.u9())) {
         com.aspose.slides.internal.k4y.s1v var10 = var2.l6().l6().get_Item(var1.u9());
         byte var12 = 0;
         byte var15 = 0;
         byte var18 = 0;
         byte[] var20 = new byte[]{0};
         byte[] var21 = new byte[]{0};
         byte[] var22 = new byte[]{0};
         c3.n5(var10.k5(), var10.l6(), t2f.u9(var1.k5()), t2f.u9(var1.c8()), var20, var21, var22);
         var12 = var20[0];
         var15 = var21[0];
         var18 = var22[0];
         var0.setEndArrowheadStyle(var12);
         var0.setEndArrowheadLength(var15);
         var0.setEndArrowheadWidth(var18);
      }
   }

   private static void k5(ILineFormat var0, com.aspose.slides.internal.k4y.p3w var1, h6j var2) {
      var0.getFillFormat().setFillType((byte)1);
      var0.setDashStyle((byte)11);
      com.aspose.slides.internal.k4y.x2k var3 = null;
      com.aspose.slides.internal.k4y.x2k[] var4 = new com.aspose.slides.internal.k4y.x2k[]{var3};
      boolean var5 = !var2.l6().u3().tryGetValue(var1.l6(), var4) && !var2.n5().k5().u3().tryGetValue(var1.l6(), var4);
      var3 = var4[0];
      if (!var5) {
         double var6 = 1.0;
         if (t2f.k5(var1.k5())) {
            var6 = t2f.u9(var1.k5());
            if (var6 == 0.0) {
               var6 = 1.0;
            }
         }

         double var8 = 0.0;
         if (t2f.k5(var3.u9())) {
            if (t2f.l6(var3.u9())) {
               var8 = var6 / 100.0 * t2f.u3(var3.u9());
            } else {
               var8 = t2f.u9(var3.u9()) / var6;
            }
         }

         double var10 = 0.0;
         if (t2f.k5(var3.k5())) {
            if (t2f.l6(var3.k5())) {
               var10 = var6 / 100.0 * t2f.u3(var3.k5());
            } else {
               var10 = t2f.u9(var3.k5()) / var6;
            }
         }

         double var12 = 0.0;
         if (var3.u3() > 0) {
            if (t2f.l6(var3.a6())) {
               var12 = var6 / 100.0 * t2f.u3(var3.k5());
            } else {
               var12 = t2f.u9(var3.a6()) / var6;
            }
         }

         if (var10 == 0.0 && var12 == 0.0) {
            var12 = var8;
            var10 = var8;
         } else {
            if (var10 == 0.0) {
               var10 = var12;
            }

            if (var12 == 0.0) {
               var12 = var10;
            }
         }

         float[] var14 = new float[(var3.l6() + var3.u3()) * 2];

         for (byte var15 = 0; var15 < var3.l6() * 2; var15 += 2) {
            var14[var15] = (float)var10;
            var14[var15 + 1] = (float)var8;
         }

         for (int var17 = var3.l6() * 2; var17 < var14.length; var17 += 2) {
            var14[var17] = (float)var12;
            var14[var17 + 1] = (float)var8;
         }

         var0.setCustomDashPattern(var14);
      }
   }
}
