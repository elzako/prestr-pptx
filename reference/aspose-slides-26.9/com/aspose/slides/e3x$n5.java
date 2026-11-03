package com.aspose.slides;

import java.util.Comparator;

class e3x$n5 implements Comparator<u5w> {
   private final double n5;

   public e3x$n5(double var1) {
      this.n5 = var1;
   }

   public final int n5(u5w var1, u5w var2) {
      double var3 = this.n5(var1);
      double var5 = this.n5(var2);
      if (var3 > var5) {
         return 1;
      } else {
         return var3 < var5 ? -1 : 0;
      }
   }

   private double n5(u5w var1) {
      if (com.aspose.slides.ms.System.d2.k5(this.n5)) {
         return var1.u3().e2();
      }

      double var2 = this.n5 - var1.u3().e2();
      if (var2 > 180.0) {
         var2 -= 360.0;
      }

      if (var2 < -180.0) {
         var2 += 360.0;
      }

      return -var2;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compare(u5w bridgeArg0, u5w bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
