package com.aspose.slides.internal.e9;

import com.aspose.slides.internal.o9b.y1;
import java.util.Comparator;

class k5$k5 implements Comparator<com.aspose.slides.internal.j8.u3> {
   private k5$k5() {
   }

   public final int n5(com.aspose.slides.internal.j8.u3 var1, com.aspose.slides.internal.j8.u3 var2) {
      y1 var3 = y1.n5(var1.l6().y4(), var2.l6().y4()).y4();
      if (var3.u3()) {
         return 0;
      } else if (y1.k5(var3, var1.l6())) {
         return 1;
      } else {
         return y1.k5(var3, var2.l6()) ? -1 : 0;
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(com.aspose.slides.internal.j8.u3 bridgeArg0, com.aspose.slides.internal.j8.u3 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }


   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/e9/k5$1;)V -> ()V
   k5$k5(com.aspose.slides.internal.e9.k5$1 recoveredArg0) {
      this();
   }
}
