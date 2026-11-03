package com.aspose.slides.internal.s6;

import java.util.Comparator;

final class e2$n5 implements Comparator<e2> {
   public final int n5(e2 var1, e2 var2) {
      if (var1.u3() == var2.u3()) {
         return 0;
      } else {
         return var1.u3() > var2.u3() ? 1 : -1;
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(e2 bridgeArg0, e2 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
