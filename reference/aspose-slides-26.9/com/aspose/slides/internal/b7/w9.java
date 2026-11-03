package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;

public final class w9 implements IGenericCloneable<w9> {
   private final double n5;
   private final double l6;

   public double n5() {
      return this.n5;
   }

   public double l6() {
      return this.l6;
   }

   public w9(double var1, double var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public w9 k5() {
      return new w9(this.n5, this.l6);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public w9 cloneT() {
      return this.k5();
   }

}
