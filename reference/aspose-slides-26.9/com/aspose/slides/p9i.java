package com.aspose.slides;

class p9i {
   public static void n5(INormalViewProperties var0, com.aspose.slides.internal.k4y.i3l var1) {
      var0.setShowOutlineIcons(var1.n5());
      var0.setSnapVerticalSplitter(var1.l6());
      var0.setVerticalBarState(n5(var1.k5()));
      var0.setHorizontalBarState(n5(var1.u3()));
      var0.setPreferSingleView(var1.a6());
      var0.getRestoredLeft().setDimensionSize(var1.u9().n5());
      var0.getRestoredLeft().setAutoAdjust(var1.u9().l6());
      var0.getRestoredTop().setDimensionSize(var1.h0().n5());
      var0.getRestoredTop().setAutoAdjust(var1.h0().l6());
   }

   public static void l6(INormalViewProperties var0, com.aspose.slides.internal.k4y.i3l var1) {
      var1.n5(var0.getShowOutlineIcons());
      var1.l6(var0.getSnapVerticalSplitter());
      var1.n5(l6(var0.getVerticalBarState()));
      var1.l6(l6(var0.getHorizontalBarState()));
      var1.k5(var0.getPreferSingleView());
      var1.u9().n5(var0.getRestoredLeft().getDimensionSize());
      var1.u9().n5(var0.getRestoredLeft().getAutoAdjust());
      var1.h0().n5(var0.getRestoredTop().getDimensionSize());
      var1.h0().n5(var0.getRestoredTop().getAutoAdjust());
   }

   private static int n5(int var0) {
      switch (var0) {
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         default:
            return 2;
      }
   }

   private static int l6(int var0) {
      switch (var0) {
         case 0:
            return 1;
         case 1:
            return 2;
         case 2:
            return 3;
         default:
            return 3;
      }
   }
}
