package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.KeyNotFoundException;

class x5n$2 extends com.aspose.slides.internal.f3.u3<String, com.aspose.slides.internal.g7.u0a> {
   // $VF: synthetic field
   final x5n n5;

   x5n$2(x5n var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.g7.u0a n5(String var1) {
      try {
         return this.n5.n5().containsKey(var1) ? this.n5.n5().get_Item(var1) : this.n5.n5().get_Item("Cambria Math");
      } catch (KeyNotFoundException var3) {
         throw new ArgumentException("The required font \"Cambria Math\" was not found.");
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.g7.u0a invoke(String bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
