package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;

public final class m2 implements IGenericCloneable<m2> {
   private double n5;
   private double l6;
   private double k5;

   public m2(double var1, double var3, double var5) {
      this.l6 = var1;
      this.n5 = var3;
      this.k5 = var5;
   }

   public final m2 n5() {
      return new m2(this.l6, this.n5, this.k5);
   }

   public static m2 l6() {
      return new m2(0.0, 0.0, 0.0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public m2 cloneT() {
      return this.n5();
   }

}
