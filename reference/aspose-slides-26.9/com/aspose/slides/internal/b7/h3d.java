package com.aspose.slides.internal.b7;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class h3d extends p6t {
   private double n5;

   public final double l6() {
      return this.n5;
   }

   public final void n5(double var1) {
      if (var1 <= 0.0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.n5 = var1;
   }

   public h3d(double var1) {
      this.n5(var1);
   }

   @Override
   public p6t n5() {
      return new h3d(this.n5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public p6t cloneT() {
      return this.n5();
   }

}
