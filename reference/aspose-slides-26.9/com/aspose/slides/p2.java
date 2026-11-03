package com.aspose.slides;

class p2 {
   public static float n5(t3x var0) {
      if (var0.getIndent() >= 0.0F) {
         return var0.getMarginLeft();
      }

      float var1 = var0.getMarginLeft() + var0.getIndent();
      return var1 >= 0.0F ? var1 : 0.0F;
   }

   public static String n5(String var0, boolean var1) {
      if (var1) {
         String[] var2 = new String[]{var0};
         com.aspose.slides.internal.n2d.u9.n5(var2);
         var0 = var2[0];
      }

      return var0;
   }

   public static float n5(e2n var0, float var1) {
      float var2 = com.aspose.slides.ms.System.q1.n5((float)(n5(var0.n5) + var1), (float)(n5(var0)));
      return com.aspose.slides.ms.System.q1.n5((float)(0.0F), (float)(var2));
   }

   public static float n5(e2n var0) {
      t3x var1 = var0.n5;
      float var3;
      if (v6o.n5(var0)) {
         float var2 = var1.getMarginLeft() + var1.getIndent();
         if (var1.getIndent() >= 0.0F) {
            var3 = var2;
         } else {
            var3 = var2 >= 0.0F ? var1.getMarginLeft() : -var1.getIndent();
         }
      } else {
         var3 = var1.getMarginLeft() + var1.getIndent();
      }

      if (var3 > 0.0F) {
         return v6o.n5(var0) ? var3 + 0.05F : var3;
      } else {
         return 0.0F;
      }
   }
}
