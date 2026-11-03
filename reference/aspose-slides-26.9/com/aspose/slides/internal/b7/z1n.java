package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;

public final class z1n implements IGenericCloneable<z1n> {
   private int n5;
   private double l6;

   public void n5(int var1) {
      this.n5 = var1;
   }

   public void n5(double var1) {
      this.l6 = var1;
   }

   public z1n(int var1, double var2) {
      this.n5(var1);
      this.n5(var2);
   }

   public z1n n5() {
      return new z1n(this.n5, this.l6);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public z1n cloneT() {
      return this.n5();
   }

}
