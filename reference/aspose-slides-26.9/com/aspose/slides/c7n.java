package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import java.util.Arrays;

class c7n extends com.aspose.slides.internal.v6g.h0<c7n> {
   public IGenericEnumerable<f1m> n5;
   public d2k[] l6;

   public c7n() {
   }

   public void n5(c7n var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public c7n n5() {
      c7n var1 = new c7n();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(c7n var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5) && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6);
   }

   @Override
   public int hashCode() {
      int var1 = com.aspose.slides.internal.n2d.q0.n5(this.n5);
      return 31 * var1 + Arrays.hashCode(this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof c7n) ? false : this.l6((c7n)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public c7n Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(c7n bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
