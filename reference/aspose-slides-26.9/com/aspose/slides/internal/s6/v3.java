package com.aspose.slides.internal.s6;

import com.aspose.slides.ms.System.q1;

public class v3 extends com.aspose.slides.internal.v6g.h0<v3> {
   private float n5;
   private float l6;
   private float k5;

   public v3() {
   }

   public v3(float var1) {
      this.n5(var1);
      this.l6(var1);
      this.k5(var1);
   }

   public v3(float var1, float var2, float var3) {
      this.n5(var1);
      this.l6(var2);
      this.k5(var3);
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
      return this.k5;
   }

   public final void k5(float var1) {
      this.k5 = var1;
   }

   public final float u3() {
      return (float)q1.z3(this.n5() * this.n5() + this.l6() * this.l6() + this.k5() * this.k5());
   }

   public static v3 a6() {
      return new v3(0.0F, 1.0F, 0.0F);
   }

   public final v3 u9() {
      float var1 = (float)q1.z3(this.n5() * this.n5() + this.l6() * this.l6() + this.k5() * this.k5());
      return var1 > 0.0F ? new v3(this.n5() / var1, this.l6() / var1, this.k5() / var1) : new v3(0.0F);
   }

   public static v3 n5(v3 var0) {
      return new v3(-var0.n5(), -var0.l6(), -var0.k5());
   }

   public static v3 n5(v3 var0, v3 var1) {
      return new v3(var0.n5() + var1.n5(), var0.l6() + var1.l6(), var0.k5() + var1.k5());
   }

   public static v3 l6(v3 var0, v3 var1) {
      return new v3(var0.n5() - var1.n5(), var0.l6() - var1.l6(), var0.k5() - var1.k5());
   }

   public static v3 n5(v3 var0, float var1) {
      return new v3(var0.n5() * var1, var0.l6() * var1, var0.k5() * var1);
   }

   public static v3 n5(float var0, v3 var1) {
      return new v3(var1.n5() * var0, var1.l6() * var0, var1.k5() * var0);
   }

   public static v3 l6(v3 var0, float var1) {
      return new v3(var0.n5() / var1, var0.l6() / var1, var0.k5() / var1);
   }

   public static float k5(v3 var0, v3 var1) {
      return var0.n5() * var1.n5() + var0.l6() * var1.l6() + var0.k5() * var1.k5();
   }

   public static v3 u3(v3 var0, v3 var1) {
      return new v3(var0.l6() * var1.k5() - var0.k5() * var1.l6(), var0.k5() * var1.n5() - var0.n5() * var1.k5(), var0.n5() * var1.l6() - var0.l6() * var1.n5());
   }

   public void l6(v3 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public v3 h0() {
      v3 var1 = new v3();
      this.l6(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.h0();
   }

   private boolean k5(v3 var1) {
      return true;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof v3) ? false : this.k5((v3)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public v3 Clone() {
      return this.h0();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(v3 bridgeArg0) {
      this.l6(bridgeArg0);
   }

}
