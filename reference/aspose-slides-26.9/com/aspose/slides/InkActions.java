package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

public class InkActions extends GraphicalObject implements IInkActions {
   private h2i n5;
   private final List<m3z> l6 = new List<>();
   private String k5;
   private String u3;

   InkActions(r0g parentImmediate) {
      super(parentImmediate);
      this.n5(new a4l(this));
   }

   final String n5() {
      return this.k5;
   }

   final void n5(String var1) {
      this.k5 = var1;
   }

   final String k5() {
      return this.u3;
   }

   final void l6(String var1) {
      this.u3 = var1;
   }

   final h2i u9() {
      return this.n5;
   }

   final void n5(h2i var1) {
      this.n5 = var1;
   }

   final List<m3z> x8() {
      return this.l6;
   }
}
