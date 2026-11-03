package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.SortedList;

class z3$n5 implements o1, z3$l6 {
   private final SortedList<String, Double> n5 = new SortedList<>();

   public z3$n5() {
   }

   @Override
   public final double n5(String var1) {
      this.l6(var1);
      return this.n5.get_Item(var1);
   }

   @Override
   public final void n5(String var1, double var2) {
      this.l6(var1);
      this.n5.set_Item(var1, var2);
   }

   @Override
   public final void l6(String var1, double var2) {
      this.n5.addItem(var1, var2);
   }

   private void l6(String var1) {
      if (!this.n5.containsKey(var1)) {
         throw new b9(com.aspose.slides.ms.System.d1.n5(new String[]{"The shape has no adjust value with name '", var1, "'."}));
      }
   }
}
