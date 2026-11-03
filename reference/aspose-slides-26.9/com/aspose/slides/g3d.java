package com.aspose.slides;

class g3d {
   public static void n5(IPatternFormat var0, com.aspose.slides.internal.k4y.n9q var1) {
      if (var1 != null) {
         var0.setPatternStyle(var1.k5());
         c4i.n5(var0.getForeColor(), var1.u3());
         c4i.n5(var0.getBackColor(), var1.a6());
      }
   }

   public static void l6(IPatternFormat var0, com.aspose.slides.internal.k4y.n9q var1) {
      if (var0 != null) {
         var1.n5(var0.getPatternStyle());
         c4i.n5(var0.getForeColor(), new g3d$1(var1));
         c4i.n5(var0.getBackColor(), new g3d$2(var1));
      }
   }
}
