package com.aspose.slides;

class p3r extends n8 {
   final void n5(IMasterNotesSlide var1) {
      this.n5(new String[0]);

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "notesMaster".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.j4 var2 = new com.aspose.slides.internal.k4y.j4(this.s7());
            a1g.n5(var1.getThemeManager(), var2.k5());
            this.n5(var1.getThemeManager());
            if (!var1.getThemeManager().isOverrideThemeEnabled()) {
               var1.getThemeManager().setOverrideTheme(new MasterTheme((r0g)var1.getPresentation()));
               this.l6(var1.getThemeManager());
            }

            k2.n5(var1, var2.l6(), this.n5());
            com.aspose.slides.internal.k4y.i8n var3 = var2.a6();
            p2m.n5(var1.getNotesStyle(), var3, this.k5());
            this.n5(var1, var2);
         }
      }

      this.n3();
   }

   private void n5(IMasterNotesSlide var1, com.aspose.slides.internal.k4y.j4 var2) {
      c4x var3 = ((MasterNotesSlide)var1).t4();
      var3.n5(var2.u3());
      var3.u3(var2.u9());
      w3m.n5((DrawingGuidesCollection)var1.getDrawingGuides(), var3.t2(), "{620B2872-D7B9-4A21-9093-7833F8D536E1}");
   }

   final void l6(IMasterNotesSlide var1) {
      this.y4();
      com.aspose.slides.internal.k4y.j4 var2 = new com.aspose.slides.internal.k4y.j4();
      this.u3().k5().addItem(var1, this.t9());
      k2.n5(var1, var2.l6(), this.l6());
      a1g.l6(var1.getThemeManager(), var2.k5());
      p2m.n5(var1.getNotesStyle(), new p3r$1(this, var2), this.u3());
      this.l6(var1, var2);
      var2.n5(null, this.x8(), "notesMaster");
      this.e2();
   }

   private void l6(IMasterNotesSlide var1, com.aspose.slides.internal.k4y.j4 var2) {
      c4x var3 = ((MasterNotesSlide)var1).t4();
      var3.u3(w3m.l6((DrawingGuidesCollection)var1.getDrawingGuides(), var3.t2(), "{620B2872-D7B9-4A21-9093-7833F8D536E1}"));
      var2.n5(var3.c8());
      var2.n5(var3.t2());
   }

   public p3r(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public p3r(com.aspose.slides.internal.c8m.j8 var1, g6c var2, IBaseSlide var3) {
      super(var1, var2, var3);
   }
}
