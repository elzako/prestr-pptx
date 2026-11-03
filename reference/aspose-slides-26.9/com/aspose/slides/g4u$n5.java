package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class g4u$n5 {
   private final int n5;
   private final int l6;
   private final int k5;
   private List<Integer> u3;

   public g4u$n5(int var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = new List<>();
      this.u3.addItem(var3);
   }

   public g4u$n5(int var1, int var2, int var3, List<Integer> var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = new List<>(var4);
      if (!this.u3.containsItem(this.k5)) {
         this.u3.addItem(this.k5);
      }
   }

   public final boolean n5(int var1) {
      return var1 == this.k5 || this.u3.containsItem(var1);
   }

   public final int n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   public final int k5() {
      return this.k5;
   }
}
