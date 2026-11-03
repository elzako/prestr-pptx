package com.aspose.slides.internal.j9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.y2;

public class x8 extends j8 {
   public List<com.aspose.slides.internal.r4.u9> n5;
   public List<com.aspose.slides.internal.r4.u9> l6;

   public x8(y2 var1) {
      super(var1);
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public String toString() {
      a5 var1 = new a5("TableHFPenaltyPosition:");
      var1.k5(this.a6()).n5("(");
      var1.n5("header:");
      var1.n5(this.n5);
      var1.n5(", footer:");
      var1.n5(this.l6);
      var1.n5(")");
      return var1.toString();
   }
}
