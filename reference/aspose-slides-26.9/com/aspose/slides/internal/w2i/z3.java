package com.aspose.slides.internal.w2i;

import com.aspose.slides.internal.l7h.a5;

public class z3 extends com.aspose.slides.internal.v6g.h0<z3> {
   public float n5;
   public float l6;
   public float k5;

   public static boolean n5(z3 var0, z3 var1) {
      return var0.n5 == var1.n5 && var0.l6 == var1.l6 && var0.k5 == var1.k5;
   }

   public static boolean l6(z3 var0, z3 var1) {
      return !n5(var0, var1);
   }

   @Override
   public boolean equals(Object obj) {
      return com.aspose.slides.internal.v6g.k5.l6(obj, z3.class) ? n5(com.aspose.slides.internal.v6g.k5.u3(obj, z3.class), this) : false;
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("[X={0:F4};", this.n5);
      var1.n5(" Y={0:F4};", this.l6);
      var1.n5(" Z={0:F4}]", this.k5);
      return var1.toString();
   }

   public void n5(z3 var1) {
      var1 = var1 == null ? new z3() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public z3 n5() {
      z3 var1 = new z3();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public z3 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(z3 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
