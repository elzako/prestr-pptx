package com.aspose.slides.internal.y1;

import com.aspose.slides.Collections.Generic.List;

public class h0 {
   private int n5 = 0;
   private List<s7> l6 = null;

   public final void n5(com.aspose.slides.internal.t1.n5 var1, int var2) {
      this.n5 += var2;
      if (this.l6 == null) {
         this.l6 = new List<>();
      }

      this.l6.addItem(new s7(var1.y1(), var2));
   }
}
