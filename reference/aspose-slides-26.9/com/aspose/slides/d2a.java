package com.aspose.slides;

import java.util.Comparator;

class d2a implements Comparator<g3y> {
   public final int n5(g3y var1, g3y var2) {
      if (com.aspose.slides.ms.System.j8.l6(var1, var2)) {
         return 0;
      } else if (com.aspose.slides.ms.System.j8.l6(null, var2)) {
         return 1;
      } else if (com.aspose.slides.ms.System.j8.l6(null, var1)) {
         return -1;
      } else if (com.aspose.slides.ms.System.j8.l6(var1.u9(), var2.u9())) {
         return 0;
      } else if (com.aspose.slides.ms.System.j8.l6(null, var2.u9())) {
         return 1;
      } else {
         return com.aspose.slides.ms.System.j8.l6(null, var1.u9()) ? -1 : com.aspose.slides.ms.System.a3.n5(var1.u9().getOrder(), var2.u9().getOrder());
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(g3y bridgeArg0, g3y bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
