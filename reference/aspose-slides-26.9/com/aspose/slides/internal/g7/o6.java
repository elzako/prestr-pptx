package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.CollectionBase;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class o6 extends CollectionBase {
   public final void n5(s6 var1) {
      this.getInnerList().addItem(var1);
   }

   public final s6 n5(int var1) {
      return (s6)this.getInnerList().get_Item(var1);
   }

   public final boolean n5(com.aspose.slides.ms.System.y8 var1) {
      IEnumerator var2 = this.getInnerList().iterator();

      try {
         while (var2.hasNext()) {
            s6 var3 = (s6)var2.next();
            if (com.aspose.slides.ms.System.j8.n5(var3) == var1) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }

      return false;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public s6 get_Item(int bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
