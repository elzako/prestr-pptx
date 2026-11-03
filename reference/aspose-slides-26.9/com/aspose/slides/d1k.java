package com.aspose.slides;

class d1k {
   public static float n5(String var0) {
      return n5(var0, 1.0F);
   }

   public static float n5(String var0, float var1) {
      if (!t2f.k5(var0)) {
         return var1;
      } else {
         return !com.aspose.slides.ms.System.d1.k5(var0, "s")
            ? k5(var0, var1) * 1000.0F
            : k5(com.aspose.slides.ms.System.d1.l6(var0, 0, var0.length() - 1), var1);
      }
   }

   static float l6(String var0) {
      return l6(var0, Float.NaN);
   }

   static float l6(String var0, float var1) {
      if (!t2f.k5(var0)) {
         return var1;
      } else {
         return "indefinite".equals(var0) ? Float.POSITIVE_INFINITY : (float)com.aspose.slides.ms.System.Xml.f4.t9(var0);
      }
   }

   private static float k5(String var0, float var1) {
      float var2 = 0.0F;
      float[] var3 = new float[]{0.0F};
      boolean var4 = !com.aspose.slides.ms.System.n1.n5(var0, 111, com.aspose.slides.internal.x7n.l6.k5(), var3);
      var2 = var3[0];
      return var4 ? var1 : var2;
   }
}
