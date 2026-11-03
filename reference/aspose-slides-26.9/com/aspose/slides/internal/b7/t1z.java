package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class t1z implements IGenericCloneable<t1z> {
   private final double n5;

   public t1z(double var1) {
      if (!(-5.12064E7 > var1) && !(5.12064E7 < var1)) {
         this.n5 = var1;
      } else {
         throw new ArgumentOutOfRangeException("value", "Value should be between -51206400 and 51206400.");
      }
   }

   public double n5() {
      return this.n5;
   }

   public t1z l6() {
      return new t1z(this.n5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public t1z cloneT() {
      return this.l6();
   }

}
