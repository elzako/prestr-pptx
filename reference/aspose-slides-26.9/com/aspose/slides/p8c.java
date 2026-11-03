package com.aspose.slides;

class p8c extends n8 {
   final void n5(IMasterSlide var1, ILayoutSlide[] var2) {
      this.n5(new String[0]);
      var2[0] = null;

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "sldLayout".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.l8 var3 = new com.aspose.slides.internal.k4y.l8(this.s7());
            var2[0] = ((MasterSlide)var1).t4().n5.n5(var3.c8());
            a1g.n5(var2[0].getThemeManager(), var3.n3());
            k3.n5(var2[0].getThemeManager(), this.k5());
            k2.n5(var2[0], var3.x8(), this.n5());
            n8c.n5(var2[0].getSlideShowTransition(), var3.y4(), this.k5());
            var2[0].setShowMasterShapes(var3.a6());
            this.n5(var2[0], var3);
         }
      }

      this.n3();
   }

   private void n5(ILayoutSlide var1, com.aspose.slides.internal.k4y.l8 var2) {
      z2d var3 = ((LayoutSlide)var1).t4();
      if (var2.e2() != null) {
         var3.n5(var2.e2());
         w3j var4 = new w3j(this.n5().n5(), this.n5().u3());
         o5.n5(var1.getTimeline(), var2.e2(), var4);
         var3.n5(var2.e2().u3());
         var3.n5(var2.e2().a6());
      }

      f6p.n5(var3.x8(), var2.t9());
      var3.u3(var2.z1());
      var3.n5(var2.u9());
      var3.n5(var2.h0());
      var3.l6(var2.t2());
      var3.k5(var2.s7());
      w3m.n5((DrawingGuidesCollection)var1.getDrawingGuides(), var3.y4(), "{DCECCB84-F9BA-43D5-87BE-67443E8EF086}");
   }

   final void n5(ILayoutSlide var1) {
      this.y4();
      com.aspose.slides.internal.k4y.l8 var2 = new com.aspose.slides.internal.k4y.l8();
      this.u3().k5().addItem(var1, this.t9());
      this.n5(var1.getShapes(), this.l6());
      w3i.n5(var1, var2, this.l6());
      var2.n5(null, this.x8(), "sldLayout");
      this.e2();
   }

   public p8c(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public p8c(com.aspose.slides.internal.c8m.j8 var1, g6c var2, IBaseSlide var3) {
      super(var1, var2, var3);
   }
}
