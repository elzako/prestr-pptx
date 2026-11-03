package com.aspose.slides;

class b5c {
   public static void n5(IPresetShadow var0, com.aspose.slides.internal.k4y.p2i var1) {
      if (var1 != null) {
         var0.setDirection(var1.k5());
         var0.setDistance(var1.l6());
         c4i.n5(var0.getShadowColor(), var1.u3());
         var0.setPreset(var1.n5());
      }
   }

   public static void n5(IPresetShadow var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.p2i> var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.p2i var2 = (com.aspose.slides.internal.k4y.p2i)var1.invoke();
         var2.n5(var0.getDirection());
         var2.n5(var0.getDistance());
         c4i.n5(var0.getShadowColor(), new b5c$1(var2));
         var2.n5(var0.getPreset());
      }
   }
}
