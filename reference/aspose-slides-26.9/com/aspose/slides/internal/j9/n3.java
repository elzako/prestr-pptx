package com.aspose.slides.internal.j9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.y2;

public class n3 extends j8 {
   public boolean n5;
   public List<com.aspose.slides.internal.r4.u9> l6;

   public n3(y2 var1, boolean var2, List<com.aspose.slides.internal.r4.u9> var3) {
      super(var1);
      this.n5 = var2;
      this.l6 = var3;
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public String toString() {
      a5 var1 = new a5("Table");
      var1.n5(this.n5 ? "Header" : "Footer");
      var1.n5("Position:");
      var1.k5(this.a6()).n5("(");
      var1.n5(this.l6);
      var1.n5(")");
      return var1.toString();
   }
}
