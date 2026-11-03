package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class d0p implements IGenericCloneable<d0p> {
   private final int n5;

   public d0p(int var1) {
      if (0 <= var1 && 8 >= var1) {
         this.n5 = var1;
      } else {
         throw new ArgumentOutOfRangeException("value", "Value should be between 0 and 8.");
      }
   }

   public int n5() {
      return this.n5;
   }

   public d0p l6() {
      return new d0p(this.n5);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d0p cloneT() {
      return this.l6();
   }

}
