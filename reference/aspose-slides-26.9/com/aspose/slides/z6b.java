package com.aspose.slides;

class z6b {
   static void n5(com.aspose.slides.internal.k0r.d7 var0, INormalViewProperties var1) {
      if (var0 != null) {
         var1.setShowOutlineIcons(!var0.h0());
         var1.setSnapVerticalSplitter(var0.c8());
         var1.setVerticalBarState(s1f.e2(var0.u3()));
         var1.setHorizontalBarState(s1f.e2(var0.a6()));
         var1.setPreferSingleView(var0.u9());
         n5(var0.l6(), var1.getRestoredLeft());
         n5(var0.k5(), var1.getRestoredTop());
      }
   }

   private static void n5(com.aspose.slides.internal.k0r.f1s var0, INormalViewRestoredProperties var1) {
      double var2 = var0.n5() * 100.0F / var0.l6();
      var1.setAutoAdjust(var2 < 0.0);
      var1.setDimensionSize((float)(var1.getAutoAdjust() ? -var2 : var2));
   }

   public static void n5(INormalViewProperties var0, com.aspose.slides.internal.k0r.d7 var1) {
      var1.l6(!var0.getShowOutlineIcons());
      var1.k5(var0.getSnapVerticalSplitter());
      var1.n5(s1f.y4(var0.getVerticalBarState()));
      var1.l6(s1f.y4(var0.getHorizontalBarState()));
      var1.n5(var0.getPreferSingleView());
      n5(var0.getRestoredLeft(), var1.l6());
      n5(var0.getRestoredTop(), var1.k5());
   }

   private static void n5(INormalViewRestoredProperties var0, com.aspose.slides.internal.k0r.f1s var1) {
      var1.n5(com.aspose.slides.internal.v6g.k5.u3(var0.getDimensionSize() * 1.0E7F, 13));
      if (var0.getAutoAdjust()) {
         var1.n5(-var1.n5());
      }

      var1.l6(1000000000);
   }
}
