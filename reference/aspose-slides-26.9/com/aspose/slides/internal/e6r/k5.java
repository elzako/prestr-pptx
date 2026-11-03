package com.aspose.slides.internal.e6r;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.t4;

public class k5 extends a0 {
   private List<String> n5 = new List<>();

   public k5(com.aspose.slides.internal.z4.c8 var1) {
      super(var1);
   }

   public final int n5() {
      return this.n5.size();
   }

   public final int a6(String var1) {
      this.n5.addItem(var1);
      return this.n5.size() - 1;
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.n5("[");

      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         var1.n5(this.n5.get_Item(var2));
         var1.u9();
      }

      var1.n5("]");
      var1.l6();
   }
}
