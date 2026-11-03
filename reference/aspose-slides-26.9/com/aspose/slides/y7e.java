package com.aspose.slides;

class y7e {
   public static void n5(IShape var0, com.aspose.slides.internal.k4y.q8e var1, i1x var2) {
      if (var1 != null) {
         byte[] var3 = var2.n5().t4();
         ((Shape)var0).n5(var1.l6(), var1.k5(), var1.n5(), var1.u3(), var1.a6());
         if (var3.length != 0 && var3.length >= 11 && ((var3[var3.length - 1] & 255) == 32 || (var3[10] & 255) == 3)) {
            var2.n5(var1.u3(), var0.getPlaceholder());
            n5(var0.getPlaceholder(), var1);
         }
      }
   }

   private static void n5(IPlaceholder var0, com.aspose.slides.internal.k4y.q8e var1) {
      w2c var2 = ((Placeholder)var0).k5();
      var2.n5(var1.u9());
   }

   public static void n5(IShape var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.q8e> var1) {
      if (var0.isTextHolder()) {
         com.aspose.slides.internal.k4y.q8e var2 = (com.aspose.slides.internal.k4y.q8e)var1.invoke();
         var2.n5(var0.getPlaceholder().getIndex());
         var2.l6(var0.getPlaceholder().getOrientation());
         var2.k5(var0.getPlaceholder().getSize());
         var2.n5(var0.getPlaceholder().getType());
         l6(var0.getPlaceholder(), var2);
      }
   }

   private static void l6(IPlaceholder var0, com.aspose.slides.internal.k4y.q8e var1) {
      w2c var2 = ((Placeholder)var0).k5();
      var1.n5(var2.n5());
      var1.n5(var2.l6());
   }
}
