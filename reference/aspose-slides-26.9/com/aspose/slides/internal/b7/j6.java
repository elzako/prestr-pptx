package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;

public final class j6 implements IGenericCloneable<j6> {
   private double n5;
   private double l6;

   public double n5() {
      return this.n5;
   }

   public double l6() {
      return this.l6;
   }

   public j6(double var1, double var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public j6 k5() {
      return new j6(this.n5, this.l6);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public j6 cloneT() {
      return this.k5();
   }

}
