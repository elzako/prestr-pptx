package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class n8o {
   public static void n5(GradientFormat var0, String var1, String var2, h6j var3) {
      if (var0 == null) {
         throw new ArgumentNullException("gradientFormat");
      }

      if (t2f.k5(var1)) {
         if (var3.l6().u9().containsKey(var1)) {
            com.aspose.slides.internal.k4y.a6y var4 = var3.l6().u9().get_Item(var1);
            com.aspose.slides.internal.k4y.k5d var5 = com.aspose.slides.ms.System.d1.n5(var2) ? null : var3.l6().h0().get_Item(var2);
            n5(var4.l6(), var0);
            n5(var4, var5, var0);
            var0.setLinearGradientAngle(com.aspose.slides.ms.System.q1.n5(t2f.n5(var4.a6(), 0.0F) / 10.0F - 270.0F));
            var0.setLinearGradientScaled((byte)1);
            n5(var4, var0);
         }
      }
   }

   private static void n5(int var0, GradientFormat var1) {
      if (!q9k.u3.containsKey(var0)) {
         throw new ArgumentOutOfRangeException();
      }

      var1.setGradientShape(q9k.u3.get_Item(var0));
   }

   private static void n5(com.aspose.slides.internal.k4y.a6y var0, com.aspose.slides.internal.k4y.k5d var1, GradientFormat var2) {
      int var3 = 0;
      if (!com.aspose.slides.ms.System.d1.n5(var0.u9())) {
         var3 = t2f.u3(var0.u9());
      }

      com.aspose.slides.internal.o9b.c8 var4 = t2f.x8(var0.h0()).o8();
      com.aspose.slides.internal.o9b.c8 var5 = t2f.x8(var0.c8()).o8();
      String var6 = var0.t2();
      String var7 = var0.s7();
      if (var1 != null && t2f.k5(var1.l6())) {
         var6 = var1.l6();
      }

      if (var1 != null && t2f.k5(var1.k5())) {
         var7 = var1.k5();
      }

      int var8 = t2f.n5(var6, 100);
      if (var8 < 100 && var8 >= 0) {
         t2f.n5(var4.o8(), var8).n5(var4);
      }

      int var9 = t2f.n5(var7, 100);
      if (var9 < 100 && var9 >= 0) {
         t2f.n5(var5.o8(), var9).n5(var5);
      }

      if (var0.l6() == 2) {
         float var10 = var3 / 100.0F;
         ((GradientStopCollection)var2.getGradientStops()).n5(var10 / 2.0F, var5.o8());
         ((GradientStopCollection)var2.getGradientStops()).n5(0.5F, var4.o8());
         ((GradientStopCollection)var2.getGradientStops()).n5(1.0F - var10 / 2.0F, var5.o8());
      } else {
         float var11 = 1.0F - var3 / 100.0F;
         ((GradientStopCollection)var2.getGradientStops()).n5(0.0F, var5.o8());
         ((GradientStopCollection)var2.getGradientStops()).n5(var11, var4.o8());
      }
   }

   private static void n5(com.aspose.slides.internal.k4y.a6y var0, GradientFormat var1) {
      int var2 = t2f.u3(var0.k5());
      int var3 = t2f.u3(var0.u3());
      if (var2 != 100 || var3 != 100) {
         if (var2 >= 40 && var3 <= 60) {
            var1.setGradientDirection(4);
         }

         if (var2 < 40 && var3 < 50) {
            var1.setGradientDirection(0);
         }

         if (var2 < 40 && var3 > 50) {
            var1.setGradientDirection(2);
         }

         if (var2 > 60 && var3 <= 50) {
            var1.setGradientDirection(1);
         }

         if (var2 > 60 && var3 >= 50) {
            var1.setGradientDirection(3);
         }
      }
   }
}
