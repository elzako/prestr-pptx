package com.aspose.slides;

class w3i {
   public static void n5(ILayoutSlide var0, com.aspose.slides.internal.k4y.l8 var1, n4i var2) {
      z2d var3 = ((LayoutSlide)var0).t4();
      if (var1.e2() == null) {
         var1.k5();
      }

      d5t var4 = new d5t(var2.n5(), var2.a6());
      o5.n5(var0.getTimeline(), var0.getShapes(), var1.e2(), var4);
      var1.e2().n5(var3.l6());
      var1.e2().n5(var3.k5());
      k2.n5(var0, var1.x8(), var2);
      a1g.l6(((BaseThemeManager)var0.getThemeManager()).u3(), var1.n5());
      n8c.n5(var0.getSlideShowTransition(), var1.l6(), var2.n5());
      var1.n5(var0.getLayoutType());
      var1.n5(var0.getShowMasterShapes());
      f6p.n5(var3.x8(), new w3i$1(var1));
      var3.u3(w3m.l6((DrawingGuidesCollection)var0.getDrawingGuides(), var3.y4(), "{DCECCB84-F9BA-43D5-87BE-67443E8EF086}"));
      var1.n5(var3.y4());
      var1.l6(var3.c8());
      var1.n5(var3.t2());
      var1.k5(var3.s7());
      var1.u3(var3.n3());
   }
}
