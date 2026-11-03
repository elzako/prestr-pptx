package com.aspose.slides.internal.e5;

import com.aspose.slides.Collections.Generic.Dictionary;

public class y2 extends a6 {
   public y2() {
      this.l6 = "http://www.w3.org/2000/svg";
   }

   @Override
   protected void u3() {
      if (this.n5 == null) {
         this.n5 = new Dictionary<>();
         this.n5.addItem("svg", new y2$n5(null));
         this.n5.addItem("<default>", new y2$l6(null));
      }
   }

   @Override
   public String k5() {
      return "svg";
   }
}
