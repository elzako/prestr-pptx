package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class w5k extends com.aspose.slides.internal.v6g.h0<w5k> {
   private static float n5;

   public w5k() {
   }

   static void n5(
      com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.c8 var2, LineFormat var3, n1g var4
   ) {
      n5(var0, var1, var2, var3, var4, null);
   }

   static void n5(
      com.aspose.slides.internal.o9b.w1 var0,
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.c8 var2,
      LineFormat var3,
      n1g var4,
      LineFormat var5
   ) {
      if (var3.getFillFormat().getFillType() != 0) {
         l6v var6 = n5(var2.o8(), var3, var4, 1.0F, var5);
         com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();

         try {
            var7.n5(var0.u3(), var1.u3());
            var6.u9 = n5(var2.o8(), (LineFillFormat)var3.getFillFormat(), var4, 1.0F, var7);
            com.aspose.slides.internal.x4g.s7 var8 = (com.aspose.slides.internal.x4g.s7)var7.deepClone();
            var4.d2().n5(var8, var6, new a1v(com.aspose.slides.internal.o9b.c8.u3.o8()));
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }
      }
   }

   static void n5(com.aspose.slides.internal.o9b.c8 var0, com.aspose.slides.internal.o9b.c8 var1, n1g var2, com.aspose.slides.internal.o9b.y1 var3, Format var4) {
      n5(var0.o8(), var1.o8(), var2, var3.y4(), (LineFormat)var4.getLine(), (FillFormat)var4.getFill(), var4.getEffect());
   }

   static void l6(com.aspose.slides.internal.o9b.c8 var0, com.aspose.slides.internal.o9b.c8 var1, n1g var2, com.aspose.slides.internal.o9b.y1 var3, Format var4) {
      l6(var0.o8(), var1.o8(), var2, var3.y4(), (LineFormat)var4.getLine(), (FillFormat)var4.getFill(), var4.getEffect());
   }

   static void n5(
      com.aspose.slides.internal.o9b.c8 var0,
      com.aspose.slides.internal.o9b.c8 var1,
      n1g var2,
      com.aspose.slides.internal.o9b.y1 var3,
      LineFormat var4,
      FillFormat var5,
      IEffectFormat var6
   ) {
      com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();
      var7.l6(var3.y4());
      n5(var0.o8(), var1.o8(), var2, var7, var4, var5, var6, 1.0F);
   }

   static void l6(
      com.aspose.slides.internal.o9b.c8 var0,
      com.aspose.slides.internal.o9b.c8 var1,
      n1g var2,
      com.aspose.slides.internal.o9b.y1 var3,
      LineFormat var4,
      FillFormat var5,
      IEffectFormat var6
   ) {
      if (var6 != null && !var6.isNoEffects()) {
         com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();
         var7.l6(var3.y4());
         l6(var0.o8(), var1.o8(), var2, var7, var4, var5, var6, 1.0F);
      }
   }

   static void n5(com.aspose.slides.internal.o9b.c8 var0, n1g var1, com.aspose.slides.internal.o9b.y1 var2, FillFormat var3, IEffectFormat var4) {
      com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7();
      var5.l6(var2.y4());
      n5(var0.o8(), var1, var5, var3, 1.0F, var4);
   }

   public static boolean n5(
      com.aspose.slides.internal.o9b.y1 var0,
      com.aspose.slides.internal.o9b.y1 var1,
      n1g var2,
      IThreeDFormat var3,
      IFillFormat var4,
      ILineFormat var5,
      com.aspose.slides.internal.o9b.c8 var6,
      com.aspose.slides.internal.o9b.c8 var7
   ) {
      com.aspose.slides.internal.x4g.s7 var8 = new com.aspose.slides.internal.x4g.s7();

      try {
         var8.l6(var0.y4());
         return n5(var8, var1.y4(), var2, var3, var4, var5, var6.o8(), var7.o8());
      } finally {
         if (var8 != null) {
            var8.dispose();
         }
      }
   }

   public static boolean n5(
      com.aspose.slides.internal.x4g.s7 var0,
      com.aspose.slides.internal.o9b.y1 var1,
      n1g var2,
      IThreeDFormat var3,
      IFillFormat var4,
      ILineFormat var5,
      com.aspose.slides.internal.o9b.c8 var6,
      com.aspose.slides.internal.o9b.c8 var7
   ) {
      try {
         if (var3 == null) {
            return false;
         }

         if (ChartTypeCharacterizer.is3DChart(var2.n3().getType())) {
            return false;
         }

         com.aspose.slides.internal.x4g.s7 var8 = (com.aspose.slides.internal.x4g.s7)var0.deepClone();

         try {
            var8.x8();
            a1v var9 = n5(var6.o8(), (FillFormat)var4, var2, 1.0F, var8);
            l6v var10 = l6(var7.o8(), (LineFormat)var5, var2, 0.75F);
            n3c var11 = new n3c(2.0F);
            return var11.n5(var2, var3, var1.y4(), var9, var10, var8);
         } finally {
            if (var8 != null) {
               var8.dispose();
            }
         }
      } catch (RuntimeException var17) {
         com.aspose.slides.internal.n8e.v4.n5(var17);
         return false;
      }
   }

   static void l6(com.aspose.slides.internal.o9b.c8 var0, n1g var1, com.aspose.slides.internal.o9b.y1 var2, FillFormat var3, IEffectFormat var4) {
      if (var4 != null && !var4.isNoEffects()) {
         com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7();
         var5.l6(var2.y4());
         n5(var0.o8(), var1, var5, var3, var4);
      }
   }

   static void n5(com.aspose.slides.internal.o9b.c8 var0, n1g var1, com.aspose.slides.internal.o9b.y1 var2, LineFormat var3, IEffectFormat var4) {
      com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7();
      var5.l6(var2.y4());
      n5(var0.o8(), var1, var5, var3, var4);
   }

   static void n5(com.aspose.slides.internal.o9b.c8 var0, com.aspose.slides.internal.o9b.c8 var1, n1g var2, com.aspose.slides.internal.x4g.s7 var3, Format var4) {
      n5(var0.o8(), var1.o8(), var2, var3, (LineFormat)var4.getLine(), (FillFormat)var4.getFill(), var4.getEffect());
   }

   static void n5(
      com.aspose.slides.internal.o9b.c8 var0,
      com.aspose.slides.internal.o9b.c8 var1,
      n1g var2,
      com.aspose.slides.internal.x4g.s7 var3,
      LineFormat var4,
      FillFormat var5,
      IEffectFormat var6
   ) {
      n5(var0.o8(), var1.o8(), var2, var3, var4, var5, var6, 1.0F);
   }

   static void n5(
      com.aspose.slides.internal.o9b.c8 var0,
      com.aspose.slides.internal.o9b.c8 var1,
      n1g var2,
      com.aspose.slides.internal.x4g.s7 var3,
      LineFormat var4,
      FillFormat var5,
      IEffectFormat var6,
      float var7
   ) {
      l6v var8 = l6(var0.o8(), var4, var2, (float)var4.getEffective().getWidth());
      var8.u9 = n5(var0.o8(), (LineFillFormat)var4.getFillFormat(), var2, var7, var3);
      a1v var9 = n5(var1.o8(), var5, var2, var7, var3);
      l6(var2, var3, var9, var8, var6);
      var2.d2().n5(var3, var8, var9);
      n5(var2, var3, var9, var6);
   }

   static void l6(
      com.aspose.slides.internal.o9b.c8 var0,
      com.aspose.slides.internal.o9b.c8 var1,
      n1g var2,
      com.aspose.slides.internal.x4g.s7 var3,
      LineFormat var4,
      FillFormat var5,
      IEffectFormat var6,
      float var7
   ) {
      if (var6 != null && !var6.isNoEffects()) {
         l6v var8 = l6(var0.o8(), var4, var2, (float)var4.getEffective().getWidth());
         var8.u9 = n5(var0.o8(), (LineFillFormat)var4.getFillFormat(), var2, var7, var3);
         boolean var9 = false;
         a1v var10 = null;
         if (var5 != null) {
            var10 = n5(var1.o8(), var5, var2, var7, var3);
            if (var10.u3() == 1 && (var10.n5().s7() & 255) == 0 && var5.t2()) {
               var10 = new a1v();
            }

            if (var10.u3() == 0) {
               var9 = true;
            }
         }

         n5(var2, var3, var10, var8, var6, var9);
      }
   }

   static void n5(
      com.aspose.slides.internal.o9b.c8 var0,
      com.aspose.slides.internal.o9b.c8 var1,
      n1g var2,
      com.aspose.slides.internal.x4g.s7 var3,
      LineFormat var4,
      IEffectFormat var5,
      float var6
   ) {
      l6v var7 = l6(var0.o8(), var4, var2, var6);
      var7.u9 = n5(var0.o8(), (LineFillFormat)var4.getFillFormat(), var2, 1.0F, var3);
      n5(var2, var3, null, var7, var5);
      l6(var2, var3, null, var7, var5);
      var2.d2().n5(var3, var7, (a1v)null);
   }

   static void n5(com.aspose.slides.internal.o9b.c8 var0, n1g var1, com.aspose.slides.internal.x4g.s7 var2, FillFormat var3, float var4, IEffectFormat var5) {
      a1v var6 = n5(var0.o8(), var3, var1, var4, var2);
      l6(var1, var2, var6, null, var5);
      var1.d2().n5(var2, null, var6);
      n5(var1, var2, var6, var5);
   }

   static void n5(n1g var0, com.aspose.slides.internal.x4g.s7 var1, a1v var2, IEffectFormat var3) {
      if (var3 != null && var3.getInnerShadowEffect() != null) {
         y3w var4 = new y3w(var3.getInnerShadowEffect());
         var4.n5(var0.d2(), var1, var2, null, null);
      }
   }

   static void n5(com.aspose.slides.internal.o9b.c8 var0, n1g var1, com.aspose.slides.internal.x4g.s7 var2, FillFormat var3, IEffectFormat var4) {
      if (var4 != null && !var4.isNoEffects()) {
         a1v var5 = n5(var0.o8(), var3, var1, 1.0F, var2);
         n5(var1, var2, var5, null, var4);
      }
   }

   static void n5(com.aspose.slides.internal.o9b.c8 var0, n1g var1, com.aspose.slides.internal.x4g.s7 var2, LineFormat var3, IEffectFormat var4) {
      l6v var5 = l6(var0.o8(), var3, var1, 0.75F);
      var1.d2().n5(var2, var5, (a1v)null);
   }

   static void n5(
      com.aspose.slides.internal.o9b.c8 var0,
      n1g var1,
      com.aspose.slides.internal.x4g.s7 var2,
      com.aspose.slides.internal.x4g.s7 var3,
      FillFormat var4,
      float var5
   ) {
      a1v var6 = n5(var0.o8(), var4, var1, var5, var3);
      var1.d2().n5(var2, new l6v(com.aspose.slides.internal.o9b.c8.u3.o8(), 0.0F), var6);
      if (com.aspose.slides.internal.v6g.k5.l6(var6, u4z.class)) {
         com.aspose.slides.internal.v6g.k5.n5(var6, u4z.class).l6(1);
      }
   }

   static void n5(n1g var0, com.aspose.slides.internal.x4g.s7 var1, a1v var2, l6v var3, IEffectFormat var4) {
      n5(var0, var1, var2, var3, var4, false);
   }

   static void n5(n1g var0, com.aspose.slides.internal.x4g.s7 var1, a1v var2, l6v var3, IEffectFormat var4, boolean var5) {
      if (var4 != null && var4.getOuterShadowEffect() != null) {
         n7q var6 = new n7q(var4.getOuterShadowEffect());
         var6.n5(true);
         var5 = var2 != null && var2.u3() == 0;
         var6.n5(var0.d2(), var1, var2, var3, var5);
      }
   }

   static void n5(
      com.aspose.slides.internal.o9b.c8 var0,
      com.aspose.slides.internal.o9b.c8 var1,
      n1g var2,
      com.aspose.slides.internal.o9b.y1 var3,
      LineFormat var4,
      FillFormat var5,
      IEffectFormat var6,
      float var7
   ) {
      com.aspose.slides.internal.x4g.s7 var8 = new com.aspose.slides.internal.x4g.s7();
      var8.l6(var3.y4());
      k5(var0.o8(), var1.o8(), var2, var8, var4, var5, var6, var7);
   }

   static void k5(
      com.aspose.slides.internal.o9b.c8 var0,
      com.aspose.slides.internal.o9b.c8 var1,
      n1g var2,
      com.aspose.slides.internal.x4g.s7 var3,
      LineFormat var4,
      FillFormat var5,
      IEffectFormat var6,
      float var7
   ) {
      if (var6 != null && var4 != null) {
         l6v var8 = l6(var0.o8(), var4, var2, (float)var4.getEffective().getWidth());
         var8.u9 = n5(var0.o8(), (LineFillFormat)var4.getFillFormat(), var2, var7, var3);
         if (var5 == null) {
            l6(var2, var3, null, var8, var6);
         } else {
            a1v var9 = n5(var1.o8(), var5, var2, var7, var3);
            if (var9.u3() == 0 || var9.u3() == -1) {
               l6(var2, var3, null, var8, var6);
            }
         }
      }
   }

   static void l6(n1g var0, com.aspose.slides.internal.x4g.s7 var1, a1v var2, l6v var3, IEffectFormat var4) {
      if (var0.n5() && var4 != null && var4.getGlowEffect() != null) {
         i5q var5 = new i5q(var4.getGlowEffect());
         var5.n5(var0.d2(), var1, var2, var3);
      }
   }

   static com.aspose.slides.internal.o9b.m3 n5(com.aspose.slides.internal.o9b.c8 var0, LineFormat var1, n1g var2, float var3) {
      com.aspose.slides.internal.o9b.c8 var4 = var0.o8();
      if (var1 != null) {
         var3 = com.aspose.slides.ms.System.d2.k5(var1.getWidth()) ? var3 : (float)var1.getWidth();
         switch (var1.getFillFormat().getFillType()) {
            case 0:
               com.aspose.slides.internal.o9b.c8.u3.n5(var4);
               break;
            case 1:
               n5((ColorFormat)var1.getFillFormat().getSolidFillColor(), var2.n3()).n5(var4);
               break;
            case 2:
               var0.n5(var4);
               break;
            default:
               var0.n5(var4);
         }
      }

      com.aspose.slides.internal.o9b.m3 var5 = new com.aspose.slides.internal.o9b.m3(var4.o8(), var3);
      n5(var5, var1);
      return var5;
   }

   static com.aspose.slides.internal.o9b.c8 n5(ColorFormat var0, Chart var1) {
      if (var0.getColorType() != 3) {
         return var0.u3();
      }

      ColorFormat var3;
      if (var1.y4().n5() && var1.getThemeManager().isOverrideThemeEnabled()) {
         byte var2 = var1.y4().n5(var0.getSchemeColor());
         var3 = new ColorFormat(var1, ((ColorFormat)var1.getThemeManager().getOverrideTheme().getColorScheme().getByColorSchemeIndex(var2)).u3().o8());
      } else {
         var3 = new ColorFormat(var1, ((BaseSlide)var1.getSlide()).n5(var0.getSchemeColor()).u3().o8());
      }

      ((ColorOperationCollection)var3.getColorTransform()).n5((ColorOperationCollection)var0.getColorTransform(), false);
      return var3.u3();
   }

   private static void n5(com.aspose.slides.internal.o9b.m3 var0, ILineFormat var1) {
      if (var1 != null) {
         switch (var1.getDashStyle()) {
            case 0:
               var0.k5(0);
            case 1:
            default:
               break;
            case 2:
               var0.k5(5);
               var0.l6(new float[]{4.0F, 3.0F});
               break;
            case 3:
               var0.k5(5);
               var0.l6(new float[]{8.0F, 3.0F});
               break;
            case 4:
               var0.k5(5);
               var0.l6(new float[]{4.0F, 3.0F, 1.0F, 3.0F});
               break;
            case 5:
               var0.k5(5);
               var0.l6(new float[]{8.0F, 3.0F, 1.0F, 3.0F});
               break;
            case 6:
               var0.k5(5);
               var0.l6(new float[]{8.0F, 3.0F, 1.0F, 3.0F, 1.0F, 3.0F});
               break;
            case 7:
               var0.k5(5);
               var0.l6(new float[]{3.0F, 1.0F});
               break;
            case 8:
               var0.k5(2);
               var0.l6(2);
         }

         switch (var1.getJoinStyle()) {
            case 1:
               var0.u9(1);
               break;
            case 2:
               var0.u9(0);
               break;
            default:
               var0.u9(2);
         }
      }
   }

   static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0, double var1) {
      int[] var3 = new int[]{var0.x8() & 255, var0.n3() & 255, var0.y4() & 255};

      for (int var4 = 0; var4 < 3; var4++) {
         double var5 = n5(var3[var4]);
         double var7 = var5 * (1.0 + (1.0 - var1));
         if (var1 > 0.0) {
            var7 = var5 * (1.0 - (1.0 - var1)) + (1.0 - var1);
         }

         var3[var4] = n5(var7);
      }

      return com.aspose.slides.internal.o9b.c8.n5(var3[0], var3[1], var3[2]);
   }

   private static int n5(double var0) {
      double var2;
      if (var0 < 0.0) {
         var2 = 0.0;
      } else if (var0 <= 0.0031308) {
         var2 = var0 * 12.92;
      } else if (var0 < 1.0) {
         var2 = 1.055 * com.aspose.slides.ms.System.q1.a6(var0, 0.4166666666666667) - 0.055;
      } else {
         var2 = 1.0;
      }

      return com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var2 * 255.0, 0, (short)1), 14);
   }

   private static double n5(int var0) {
      double var1 = var0 / 255.0;
      double var3 = 0.0;
      if (var1 < 0.0) {
         var3 = 0.0;
      } else if (var1 <= 0.04045) {
         var3 = var1 / 12.92;
      } else if (var1 <= 1.0) {
         var3 = com.aspose.slides.ms.System.q1.a6((var1 + 0.055) / 1.055, 2.4);
      } else {
         var3 = 1.0;
      }

      return var3;
   }

   static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0) {
      x5e var1 = new x5e("r", var0.x8() & 255);
      x5e var2 = new x5e("g", var0.n3() & 255);
      x5e var3 = new x5e("b", var0.y4() & 255);
      if (var1.l6() != 0 && var2.l6() != 0 && var3.l6() != 0) {
         List var4 = new List();
         var4.addItem(var1);
         var4.addItem(var2);
         var4.addItem(var3);
         var4.sort();
         x5e var5 = (x5e)var4.get_Item(0);
         x5e var6 = (x5e)var4.get_Item(1);
         x5e var7 = (x5e)var4.get_Item(2);
         int var8 = var5.l6();
         List$Enumerator var9 = var4.iterator();

         try {
            while (var9.hasNext()) {
               x5e var10 = (x5e)var9.next();
               var10.l6(var8 - var10.l6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
               var9.dispose();
            }
         }

         byte var17 = 42;
         int var11 = var5.l6() + var6.l6() + var7.l6();
         int var12 = var5.k5() + var6.k5() + var7.k5();
         int var13 = g6z.k5((float)var11 / var17);
         if (var11 > 30) {
            if (var7.k5() == 0) {
               int var14 = g6z.n5(var13 / 3.0);
               var5.n5(var5.l6() - var14);
               var6.n5(var6.l6() - var14);
               var7.n5(var7.l6() - var14);
            } else {
               var5.n5(var5.l6() - 1);
               var13--;
               if (var6.k5() == 0) {
                  var6.n5(var6.l6() - 1);
                  if (--var13 > 0) {
                     var7.n5(var7.l6() - var13);
                  } else {
                     var7.n5(var7.l6() - 1);
                  }
               } else {
                  int var21 = g6z.n5((float)var6.k5() / var12 * var13);
                  var6.n5(var6.l6() - var21);
                  var13 -= var21;
                  if (var13 > 0) {
                     var7.n5(var7.l6() - var13);
                  } else {
                     var7.n5(var7.l6() - 1);
                  }
               }
            }
         }
      }

      return com.aspose.slides.internal.o9b.c8.n5(var1.l6(), var2.l6(), var3.l6());
   }

   static l6v l6(com.aspose.slides.internal.o9b.c8 var0, LineFormat var1, n1g var2, float var3) {
      return n5(var0, var1, var2, var3, null);
   }

   static l6v n5(com.aspose.slides.internal.o9b.c8 var0, LineFormat var1, n1g var2, float var3, LineFormat var4) {
      com.aspose.slides.internal.o9b.c8 var5 = var0.o8();
      float var6 = var3;
      if (var1 != null || var4 != null) {
         var6 = n5(var1, var4, var3);
         n5(var1, var4, var0.o8(), var2).n5(var5);
      }

      l6v var7 = new l6v(var5.o8(), var6);
      var7.a6 = 72.0F;
      n5(var7, var1);
      return var7;
   }

   static float n5() {
      if (n5 == 0.0F) {
         com.aspose.slides.internal.o9b.l6 var0 = new com.aspose.slides.internal.o9b.l6(1, 1);
         float var1 = com.aspose.slides.internal.n2d.m1.n5(var0);
         n5 = var1 / 96.0F;
      }

      return n5;
   }

   private static void n5(l6v var0, ILineFormat var1) {
      if (var1 != null
         && com.aspose.slides.internal.v6g.k5.l6(com.aspose.slides.internal.v6g.k5.n5(var1, PVIObject.class).getParent_ISlideComponent(), ChartSeries.class)) {
         var0.k5((byte)0);
      }

      if (var1 != null) {
         var0.l6(var1.getDashStyle());
         if (var1.getDashStyle() == 11) {
            var0.n5(var1.getCustomDashPattern());
         }

         if (var1.getCapStyle() != -1) {
            var0.k5(var1.getCapStyle());
         }
      }
   }

   public static a1v n5(com.aspose.slides.internal.o9b.c8 var0, FillFormat var1, n1g var2, float var3, com.aspose.slides.internal.x4g.s7 var4) {
      if (var1 == null) {
         com.aspose.slides.internal.o9b.c8 var5 = com.aspose.slides.internal.o9b.c8.n5(
               var0.s7() & 255,
               com.aspose.slides.internal.v6g.k5.u3((var0.x8() & 0xFF) * var3, 13),
               com.aspose.slides.internal.v6g.k5.u3((var0.n3() & 0xFF) * var3, 13),
               com.aspose.slides.internal.v6g.k5.u3((var0.y4() & 0xFF) * var3, 13)
            )
            .o8();
         return new a1v(var5.o8());
      }

      switch (var1.getFillType()) {
         case 0:
            return new a1v();
         case 1:
            com.aspose.slides.internal.o9b.c8 var8 = n5((ColorFormat)var1.getSolidFillColor(), var2.n3()).o8();
            com.aspose.slides.internal.o9b.c8.n5(
                  var8.s7() & 255,
                  com.aspose.slides.internal.v6g.k5.u3((var8.x8() & 0xFF) * var3, 13),
                  com.aspose.slides.internal.v6g.k5.u3((var8.n3() & 0xFF) * var3, 13),
                  com.aspose.slides.internal.v6g.k5.u3((var8.y4() & 0xFF) * var3, 13)
               )
               .n5(var8);
            return new a1v(var8.o8());
         case 2:
         case 3:
         case 4:
            com.aspose.slides.internal.o9b.y1 var7 = var4.s7().y4();
            return a1v.n5(
               new j5m(
                  new ShapeFrame(var7.x8(), var7.n3(), var7.s7(), var7.k5(), (byte)0, (byte)0, 0.0F),
                  new com.aspose.slides.internal.w0.c8(),
                  null,
                  var2.n3().getSlide(),
                  null
               ),
               var1
            );
         default:
            com.aspose.slides.internal.o9b.c8 var6 = com.aspose.slides.internal.o9b.c8.n5(
                  var0.s7() & 255,
                  com.aspose.slides.internal.v6g.k5.u3((var0.x8() & 0xFF) * var3, 13),
                  com.aspose.slides.internal.v6g.k5.u3((var0.n3() & 0xFF) * var3, 13),
                  com.aspose.slides.internal.v6g.k5.u3((var0.y4() & 0xFF) * var3, 13)
               )
               .o8();
            return new a1v(var6.o8());
      }
   }

   static a1v n5(com.aspose.slides.internal.o9b.c8 var0, LineFillFormat var1, n1g var2, float var3, com.aspose.slides.internal.x4g.s7 var4) {
      if (var1 == null) {
         com.aspose.slides.internal.o9b.c8 var8 = com.aspose.slides.internal.o9b.c8.n5(
               var0.s7() & 255,
               com.aspose.slides.internal.v6g.k5.u3((var0.x8() & 0xFF) * var3, 13),
               com.aspose.slides.internal.v6g.k5.u3((var0.n3() & 0xFF) * var3, 13),
               com.aspose.slides.internal.v6g.k5.u3((var0.y4() & 0xFF) * var3, 13)
            )
            .o8();
         return new a1v(var8.o8());
      }

      switch (var1.getFillType()) {
         case 0:
            return new a1v();
         case 1:
            com.aspose.slides.internal.o9b.c8 var7 = n5((ColorFormat)var1.getSolidFillColor(), var2.n3()).o8();
            com.aspose.slides.internal.o9b.c8.n5(
                  var7.s7() & 255,
                  com.aspose.slides.internal.v6g.k5.u3((var7.x8() & 0xFF) * var3, 13),
                  com.aspose.slides.internal.v6g.k5.u3((var7.n3() & 0xFF) * var3, 13),
                  com.aspose.slides.internal.v6g.k5.u3((var7.y4() & 0xFF) * var3, 13)
               )
               .n5(var7);
            return new a1v(var7.o8());
         case 2:
         case 3:
         case 4:
            com.aspose.slides.internal.o9b.y1 var6 = var4.s7().y4();
            return a1v.n5(
               new j5m(
                  new ShapeFrame(var6.x8(), var6.n3(), var6.s7(), var6.k5(), (byte)0, (byte)0, 0.0F),
                  new com.aspose.slides.internal.w0.c8(),
                  null,
                  var2.n3().getSlide(),
                  null
               ),
               var1
            );
         default:
            com.aspose.slides.internal.o9b.c8 var5 = com.aspose.slides.internal.o9b.c8.n5(
                  var0.s7() & 255,
                  com.aspose.slides.internal.v6g.k5.u3((var0.x8() & 0xFF) * var3, 13),
                  com.aspose.slides.internal.v6g.k5.u3((var0.n3() & 0xFF) * var3, 13),
                  com.aspose.slides.internal.v6g.k5.u3((var0.y4() & 0xFF) * var3, 13)
               )
               .o8();
            return new a1v(var5.o8());
      }
   }

   static float n5(IChart var0) {
      double var1 = ((l3m)var0.getSlide().createThemeEffective().getFormatScheme()).l6(com.aspose.slides.internal.o9b.c8.u3.o8()).get_Item(0).getWidth();
      if (var0.getStyle() > 31) {
         var1 *= 5.0;
      } else if (var0.getStyle() > 23) {
         var1 *= 7.0;
      } else if (var0.getStyle() > 7) {
         var1 *= 5.0;
      } else {
         var1 *= 3.0;
      }

      return (float)var1;
   }

   private static com.aspose.slides.internal.o9b.c8 n5(LineFormat var0, LineFormat var1, com.aspose.slides.internal.o9b.c8 var2, n1g var3) {
      if (var0 != null && var0.getFillFormat().getFillType() != -1) {
         return n5(var0, var2.o8(), var3);
      } else {
         return var1 != null && var1.getFillFormat().getFillType() != -1 ? n5(var1, var2.o8(), var3) : var2;
      }
   }

   private static com.aspose.slides.internal.o9b.c8 n5(LineFormat var0, com.aspose.slides.internal.o9b.c8 var1, n1g var2) {
      if (var0 == null) {
         throw new ArgumentNullException("format");
      }

      if (var2 == null) {
         throw new ArgumentNullException("chartRenderContext");
      }

      switch (var0.getFillFormat().getFillType()) {
         case 0:
            return com.aspose.slides.internal.o9b.c8.u3;
         case 1:
            return n5((ColorFormat)var0.getFillFormat().getSolidFillColor(), var2.n3());
         case 2:
            return var1;
         default:
            return var1;
      }
   }

   private static float n5(LineFormat var0, LineFormat var1, float var2) {
      if (var0 != null && !com.aspose.slides.ms.System.d2.k5(var0.getWidth())) {
         return (float)var0.getWidth();
      } else {
         return var1 != null && !com.aspose.slides.ms.System.d2.k5(var1.getWidth()) ? (float)var1.getWidth() : var2;
      }
   }

   public void n5(w5k var1) {
   }

   public w5k l6() {
      w5k var1 = new w5k();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.l6();
   }

   private boolean l6(w5k var1) {
      return true;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof w5k) ? false : this.l6((w5k)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public w5k Clone() {
      return this.l6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(w5k bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
