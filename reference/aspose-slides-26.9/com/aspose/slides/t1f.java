package com.aspose.slides;

class t1f {
   public static void n5(ISlideSize var0, com.aspose.slides.internal.k4y.p4p var1) {
      if (var1 != null) {
         var0.setSize((float)var1.n5(), (float)var1.l6(), 0);
         if (com.aspose.slides.ms.System.d2.k5(var1.n5()) || com.aspose.slides.ms.System.d2.k5(var1.l6()) || ((SlideSize)var0).n5(var1.k5())) {
            var0.setSize(var1.k5(), 0);
         }
      }
   }

   public static void n5(ISlideSize var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.p4p> var1) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.p4p var2 = (com.aspose.slides.internal.k4y.p4p)var1.invoke();
         var2.n5(((SlideSize)var0).n5().l6());
         var2.l6(((SlideSize)var0).n5().k5());
         if (var0.getType() != 16) {
            var2.n5(var0.getType());
         }
      }
   }
}
