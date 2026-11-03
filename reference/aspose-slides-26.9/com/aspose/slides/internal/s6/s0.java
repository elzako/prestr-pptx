package com.aspose.slides.internal.s6;

import com.aspose.slides.ms.System.q1;

public class s0 extends com.aspose.slides.internal.v6g.h0<s0> {
   private float n5;
   private float l6;

   public s0() {
   }

   public s0(float var1) {
      this.n5(var1);
      this.l6(var1);
   }

   public s0(float var1, float var2) {
      this.n5(var1);
      this.l6(var2);
   }

   public s0(com.aspose.slides.internal.o9b.w1 var1) {
      this.n5(var1.l6());
      this.l6(var1.k5());
   }

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final float l6() {
      return this.l6;
   }

   public final void l6(float var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return (float)q1.z3(this.n5() * this.n5() + this.l6() * this.l6());
   }

   public final s0 u3() {
      float var1 = (float)q1.z3(this.n5() * this.n5() + this.l6() * this.l6());
      return var1 > 0.0F ? new s0(this.n5() / var1, this.l6() / var1) : new s0(0.0F);
   }

   public static s0 n5(s0 var0, s0 var1) {
      return new s0(var0.n5() + var1.n5(), var0.l6() + var1.l6());
   }

   public static s0 l6(s0 var0, s0 var1) {
      return new s0(var0.n5() - var1.n5(), var0.l6() - var1.l6());
   }

   public static s0 n5(s0 var0, float var1) {
      return new s0(var0.n5() * var1, var0.l6() * var1);
   }

   public static s0 n5(float var0, s0 var1) {
      return new s0(var1.n5() * var0, var1.l6() * var0);
   }

   public static s0 l6(s0 var0, float var1) {
      return new s0(var0.n5() / var1, var0.l6() / var1);
   }

   public static float k5(s0 var0, s0 var1) {
      return var0.n5() * var1.n5() + var0.l6() * var1.l6();
   }

   public static s0 u3(s0 var0, s0 var1) {
      return new s0(var0.n5() < var1.n5() ? var0.n5() : var1.n5(), var0.l6() < var1.l6() ? var0.l6() : var1.l6());
   }

   public static s0 a6(s0 var0, s0 var1) {
      return new s0(var0.n5() > var1.n5() ? var0.n5() : var1.n5(), var0.l6() > var1.l6() ? var0.l6() : var1.l6());
   }

   public void n5(s0 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
   }

   public s0 a6() {
      s0 var1 = new s0();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.a6();
   }

   private boolean l6(s0 var1) {
      return true;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof s0) ? false : this.l6((s0)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public s0 Clone() {
      return this.a6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(s0 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
