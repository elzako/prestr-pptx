package com.aspose.slides.internal.b7;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

public final class s9 implements IGenericCloneable<s9> {
   private final List<u4> n5 = new List<>();

   public u4 n5(int var1) {
      return this.n5.get_Item(var1);
   }

   public void n5(u4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("dashStop");
      }

      this.n5.addItem(var1);
   }

   public s9 n5() {
      s9 var1 = new s9();

      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         var1.n5(this.n5(var2));
      }

      return var1;
   }

   s9() {
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public s9 cloneT() {
      return this.n5();
   }

}
