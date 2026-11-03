package com.aspose.slides;

import java.util.Arrays;

class c0v$l6$n5 extends com.aspose.slides.internal.v6g.h0<c0v$l6$n5> {
   int n5;
   int l6;
   int k5;
   int u3;
   byte[] a6;

   public c0v$l6$n5() {
   }

   public void n5(c0v$l6$n5 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
   }

   public c0v$l6$n5 n5() {
      c0v$l6$n5 var1 = new c0v$l6$n5();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(c0v$l6$n5 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3 && com.aspose.slides.ms.System.j8.n5(var1.a6, this.a6);
   }

   @Override
   public int hashCode() {
      int var1 = com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3);
      return 31 * var1 + Arrays.hashCode(this.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof c0v$l6$n5) ? false : this.l6((c0v$l6$n5)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public c0v$l6$n5 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(c0v$l6$n5 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
