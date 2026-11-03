package com.aspose.slides.internal.n2d;

import java.util.Comparator;

class n3$n5 implements Comparator<com.aspose.slides.internal.e1x.t4> {
   private final Comparator<String> n5;

   public n3$n5(Comparator<String> var1) {
      this.n5 = var1;
   }

   public final int n5(com.aspose.slides.internal.e1x.t4 var1, com.aspose.slides.internal.e1x.t4 var2) {
      int var3 = this.n5.compare(var1.n5(), var2.n5());
      return var3 != 0 ? var3 : this.n5.compare(var1.l6(), var2.l6());
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(com.aspose.slides.internal.e1x.t4 bridgeArg0, com.aspose.slides.internal.e1x.t4 bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
