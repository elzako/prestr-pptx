package com.aspose.slides;

class m4f {
   public static void n5(GroupShape var0, com.aspose.slides.internal.k4y.e2 var1) {
      com.aspose.slides.internal.k4y.b8c var2 = var1.l6().k5();
      if (var2 != null) {
         z5b.n5(var0, var2);
         float var3 = 0.0F;
         float var4 = 0.0F;
         float var5 = 0.0F;
         float var6 = 0.0F;
         if (var2.s7() != null) {
            var3 = (float)var2.s7().n5();
            var4 = (float)var2.s7().l6();
         }

         if (var2.x8() != null) {
            var5 = (float)var2.x8().n5();
            var6 = (float)var2.x8().l6();
         }

         var0.n5(new e4c(var3, var4));
         var0.l6(new e4c(var5, var6));
      }
   }

   public static void n5(GroupShape var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.b8c> var1) {
      o4f var2 = var0.R_();
      e4c var3 = var0.k5().u9();
      e4c var4 = var0.u9().u9();
      e4c var5 = var2.n5().u9();
      e4c var6 = var0.z7().u9();
      float var7 = var2.k5();
      byte var8 = var2.u3();
      byte var9 = var2.a6();
      if (!com.aspose.slides.ms.System.d2.k5(var5.n5)
         || !com.aspose.slides.ms.System.d2.k5(var5.l6)
         || !com.aspose.slides.ms.System.d2.k5(var6.n5)
         || !com.aspose.slides.ms.System.d2.k5(var6.l6)
         || !com.aspose.slides.ms.System.n1.k5(var7)
         || var8 != -1
         || var9 != -1
         || !com.aspose.slides.ms.System.d2.k5(var3.n5) && var3.n5 != 0.0
         || !com.aspose.slides.ms.System.d2.k5(var3.l6) && var3.l6 != 0.0
         || !com.aspose.slides.ms.System.d2.k5(var4.n5) && var4.n5 != 0.0
         || !com.aspose.slides.ms.System.d2.k5(var4.l6) && var4.l6 != 0.0) {
         com.aspose.slides.internal.k4y.b8c var10 = (com.aspose.slides.internal.k4y.b8c)var1.invoke();
         ShapeFrame var11 = var0.e5().e2();
         com.aspose.slides.internal.k4y.s2b var12 = var10.n5();
         var12.n5(com.aspose.slides.ms.System.d2.k5(var11.getX()) ? 0.0 : var11.getX());
         var12.l6(com.aspose.slides.ms.System.d2.k5(var11.getY()) ? 0.0 : var11.getY());
         com.aspose.slides.internal.k4y.q8g var13 = var10.l6();
         var13.n5(com.aspose.slides.ms.System.d2.k5(var11.getWidth()) ? 0.0 : var11.getWidth());
         var13.l6(com.aspose.slides.ms.System.d2.k5(var11.getHeight()) ? 0.0 : var11.getHeight());
         var10.n5(com.aspose.slides.ms.System.n1.k5(var11.getRotation()) ? 0.0F : var11.getRotation());
         var10.n5(var11.getFlipH() == 1);
         var10.l6(var11.getFlipV() == 1);
         if (var3.n5 != 0.0 || var3.l6 != 0.0) {
            com.aspose.slides.internal.k4y.s2b var14 = var10.k5();
            var14.n5(com.aspose.slides.ms.System.d2.k5(var3.n5) ? 0.0 : var3.n5);
            var14.l6(com.aspose.slides.ms.System.d2.k5(var3.l6) ? 0.0 : var3.l6);
         }

         if (var4.n5 != 0.0 || var4.l6 != 0.0) {
            com.aspose.slides.internal.k4y.q8g var15 = var10.u3();
            var15.n5(com.aspose.slides.ms.System.d2.k5(var4.n5) ? 0.0 : var4.n5);
            var15.l6(com.aspose.slides.ms.System.d2.k5(var4.l6) ? 0.0 : var4.l6);
         }
      }
   }
}
