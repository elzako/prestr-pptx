package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class r5d implements IGenericCloneable<r5d> {
   private final double n5;

   public r5d(double var1) {
      if (!(0.0 > var1) && !(5.12064E7 < var1)) {
         this.n5 = var1;
      } else {
         throw new ArgumentOutOfRangeException("value", "Value should be between 0 and 51206400.");
      }
   }

   public double n5() {
      return this.n5;
   }

   public r5d l6() {
      return new r5d(this.n5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public r5d cloneT() {
      return this.l6();
   }

}
