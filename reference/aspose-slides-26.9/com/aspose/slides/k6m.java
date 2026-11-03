package com.aspose.slides;

class k6m extends x0q {
   final void n5(com.aspose.slides.internal.k4y.q0h var1) {
      this.y4();
      this.x8().y4("p:txStyles");
      this.x8().u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      this.x8().u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      this.x8().u3("xmlns", "p", null, "http://schemas.openxmlformats.org/presentationml/2006/main");
      if (var1.u3() != null) {
         var1.u3().n5("p", this.x8(), "titleStyle");
      }

      if (var1.a6() != null) {
         var1.a6().n5("p", this.x8(), "bodyStyle");
      }

      if (var1.u9() != null) {
         var1.u9().n5("p", this.x8(), "otherStyle");
      }

      if (var1.h0() != null) {
         var1.h0().n5("p", this.x8(), "extLst");
      }

      this.x8().s7();
      this.e2();
   }

   public k6m(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
