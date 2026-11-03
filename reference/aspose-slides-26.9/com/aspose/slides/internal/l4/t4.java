package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.y8;

public class t4 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.s7() && com.aspose.slides.internal.w3.u9.l6(var1.y4().n5(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
         var2.l6(this);
         var2.l6("select");
         var2.k5(false);
         return var2.n5(var1);
      }

      if (var1.x8() && com.aspose.slides.internal.w3.u9.l6(var1.y4().n5(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
         var2.l6(this);
         if (!var2.a6(var1.y4().n5())) {
            return false;
         }

         var2.l6("select");
         var2.k5(false);
         return var2.n5(var1);
      } else {
         return this.l6(var1, var2);
      }
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      return z1.n5(var1, var2);
   }
}
