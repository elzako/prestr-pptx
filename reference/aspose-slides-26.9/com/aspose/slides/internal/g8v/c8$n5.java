package com.aspose.slides.internal.g8v;

import java.util.Comparator;

final class c8$n5 implements Comparator<h0> {
   public int n5(h0 var1, h0 var2) {
      if (var1 != null && var2 != null) {
         int var3 = var2.u3().length() - (var2.u3().charAt(0) == '.' ? 1 : 0);
         int var4 = var1.u3().length() - (var1.u3().charAt(0) == '.' ? 1 : 0);
         int var5 = var3 - var4;
         return var5 == 0 ? var2.s7().length() - var1.s7().length() : var5;
      } else {
         return 0;
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(h0 bridgeArg0, h0 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
