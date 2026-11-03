package com.aspose.slides.internal.q9r;

import java.util.Comparator;

class a6 implements Comparator<Integer> {
   // $VF: synthetic field
   final u3 n5;

   a6(u3 var1) {
      this.n5 = var1;
   }

   public int n5(Integer var1, Integer var2) {
      return this.n5(var2).compareTo(this.n5(var1));
   }

   private Integer n5(Integer var1) {
      if (var1 == 0) {
         return 0;
      } else if ((3 & var1) == 3) {
         return var1;
      } else if ((2 & var1) == 2) {
         return var1 & -3 | 1;
      } else {
         return (1 & var1) == 1 ? var1 & -2 | 2 : var1;
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(Integer bridgeArg0, Integer bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
