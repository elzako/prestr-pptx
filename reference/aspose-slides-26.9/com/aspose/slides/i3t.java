package com.aspose.slides;

class i3t extends n8 {
   final void n5(IMasterHandoutSlide var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "handoutMaster".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.z7 var2 = new com.aspose.slides.internal.k4y.z7(this.s7());
            k2.n5(var1, var2.n5(), this.n5());
            a1g.n5(var1.getThemeManager(), var2.l6());
            this.n5(var1, var2);
            this.n5(var1.getThemeManager());
            if (!var1.getThemeManager().isOverrideThemeEnabled()) {
               var1.getThemeManager().setOverrideTheme(new MasterTheme((r0g)var1.getPresentation()));
               this.l6(var1.getThemeManager());
            }
         }
      }

      this.n3();
   }

   private void n5(IMasterHandoutSlide var1, com.aspose.slides.internal.k4y.z7 var2) {
      n5h var3 = ((MasterHandoutSlide)var1).t4();
      var3.n5(var2.k5());
      var3.u3(var2.u3());
      w3m.n5((DrawingGuidesCollection)var1.getDrawingGuides(), var3.t2(), "{56416CCD-93CA-4268-BC5B-53C4BB910035}");
   }

   final void l6(IMasterHandoutSlide var1) {
      this.y4();
      com.aspose.slides.internal.k4y.z7 var2 = new com.aspose.slides.internal.k4y.z7();
      this.u3().k5().addItem(var1, this.t9());
      k2.n5(var1, var2.n5(), this.l6());
      a1g.l6(var1.getThemeManager(), var2.l6());
      this.l6(var1, var2);
      var2.n5(null, this.x8(), "handoutMaster");
      this.e2();
   }

   private void l6(IMasterHandoutSlide var1, com.aspose.slides.internal.k4y.z7 var2) {
      n5h var3 = ((MasterHandoutSlide)var1).t4();
      var3.u3(w3m.l6((DrawingGuidesCollection)var1.getDrawingGuides(), var3.t2(), "{56416CCD-93CA-4268-BC5B-53C4BB910035}"));
      var2.n5(var3.c8());
      var2.n5(var3.t2());
   }

   public i3t(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public i3t(com.aspose.slides.internal.c8m.j8 var1, g6c var2, IBaseSlide var3) {
      super(var1, var2, var3);
   }
}
