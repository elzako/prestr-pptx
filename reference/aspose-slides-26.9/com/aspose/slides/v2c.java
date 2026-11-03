package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class v2c extends x0q {
   final void n5(List<String> var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1) {
            while (this.s7().u3()) {
               if ("xmlns".equals(this.s7().e2()) || "".equals(this.s7().e2()) && "xmlns".equals(this.s7().x8())) {
                  String var2 = this.s7().z1();
                  if (!var1.containsItem(var2)) {
                     var1.addItem(var2);
                  }
               }
            }
         }
      }

      this.n3();
   }

   public v2c(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }
}
