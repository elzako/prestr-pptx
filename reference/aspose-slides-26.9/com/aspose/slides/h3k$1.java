package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;

final class h3k$1 implements IGenericEqualityComparer<p1s> {
   public boolean n5(p1s var1, p1s var2) {
      if (com.aspose.slides.ms.System.j8.l6(null, var1)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(null, var2)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(var1, var2)
            ? true
            : var1.n5 == var2.n5 && com.aspose.slides.ms.System.j8.n5(var1.l6, var2.l6) && com.aspose.slides.ms.System.j8.n5(var1.k5, var2.k5);
      }
   }

   public int n5(p1s var1) {
      return (int)(var1.n5 + (var1.l6 != null ? var1.l6.hashCode() : 0) + (var1.k5 != null ? var1.k5.hashCode() : 0));
   }

   @Override
   public boolean equals(Object x, Object y) {
      return x instanceof p1s && y instanceof p1s ? this.n5((p1s)x, (p1s)y) : false;
   }

   @Override
   public int hashCode(Object obj) {
      return this.n5((p1s)obj);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int hashCodeT(p1s bridgeArg0) {
      return this.n5(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public boolean equalsT(p1s bridgeArg0, p1s bridgeArg1) {
      return this.n5(bridgeArg0, bridgeArg1);
   }

}
