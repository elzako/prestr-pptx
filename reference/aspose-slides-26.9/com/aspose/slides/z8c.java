package com.aspose.slides;

class z8c {
   public static void n5(IShapeBevel var0, com.aspose.slides.internal.k4y.h8 var1) {
      if (var1 != null) {
         var0.setWidth(var1.n5());
         var0.setHeight(var1.l6());
         var0.setBevelType(var1.k5());
      }
   }

   public static void n5(IShapeBevel var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.h8> var1) {
      if (var0.getBevelType() != -1) {
         com.aspose.slides.internal.k4y.h8 var2 = (com.aspose.slides.internal.k4y.h8)var1.invoke();
         var2.n5(var0.getWidth());
         var2.l6(var0.getHeight());
         var2.n5(var0.getBevelType());
      }
   }
}
