package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;

public final class v5 implements IGenericCloneable<v5> {
   private final double n5;
   private final double l6;
   private final double k5;
   private final double u3;

   public v5() {
      this.n5 = 0.0;
      this.l6 = 0.0;
      this.k5 = 0.0;
      this.u3 = 0.0;
   }

   public v5(double var1, double var3, double var5, double var7) {
      this.l6 = var1;
      this.u3 = var3;
      this.k5 = var5;
      this.n5 = var7;
   }

   public double n5() {
      return this.n5;
   }

   public double l6() {
      return this.l6;
   }

   public double k5() {
      return this.k5;
   }

   public double u3() {
      return this.u3;
   }

   public v5 a6() {
      return new v5(this.l6(), this.u3(), this.k5(), this.n5());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public v5 cloneT() {
      return this.a6();
   }

}
