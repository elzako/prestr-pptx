package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.j8;

class d5$n5 {
   private int n5;
   private double l6;
   private List<j8> k5;

   public d5$n5(int var1, double var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = new List<>(var1);
   }

   public final int n5() {
      return this.n5;
   }

   public final double l6() {
      return this.l6;
   }

   public final void n5(j8 var1) {
      this.k5.insertItem(0, var1);
   }

   public final j8 n5(int var1) {
      return this.k5.get_Item(var1);
   }
}
