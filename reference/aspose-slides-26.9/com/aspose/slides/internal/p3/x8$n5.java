package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class x8$n5 extends u6 {
   private x8 k5;

   public x8$n5(x8 var1) {
      super(var1);
      this.n5 = new List<>(10);
      this.k5 = var1;
   }

   @Override
   public boolean l6() {
      return this.l6 < this.n5.size() || this.n5(this.l6);
   }

   protected final boolean n5(int var1) {
      List var2 = this.k5.n5(var1 + 1 - this.n5.size());
      if (var2 != null) {
         this.n5.addRange(var2);
      }

      return var1 < this.n5.size();
   }
}
