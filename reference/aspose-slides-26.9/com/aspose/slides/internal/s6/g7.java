package com.aspose.slides.internal.s6;

public class g7 extends com.aspose.slides.internal.v6g.h0<g7> {
   private float n5;
   private float l6;
   private float k5;
   private float u3;

   public g7() {
   }

   public g7(float var1, float var2, float var3, float var4) {
      this.n5(var1);
      this.l6(var2);
      this.k5(var3);
      this.u3(var4);
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
      return this.u3;
   }

   public final void u3(float var1) {
      this.u3 = var1;
   }

   public final v3 a6() {
      return new v3(this.n5(), this.l6(), this.k5());
   }

   public static g7 n5(g7 var0, g7 var1) {
      return new g7(var0.n5() + var1.n5(), var0.l6() + var1.l6(), var0.k5() + var1.k5(), var0.u3() + var1.u3());
   }

   public static g7 n5(g7 var0, v3 var1) {
      return new g7(var0.n5() + var1.n5(), var0.l6() + var1.l6(), var0.k5() + var1.k5(), var0.u3());
   }

   public static g7 l6(g7 var0, g7 var1) {
      return new g7(var0.n5() - var1.n5(), var0.l6() - var1.l6(), var0.k5() - var1.k5(), var0.u3() - var1.u3());
   }

   public static g7 n5(g7 var0, float var1) {
      return new g7(var0.n5() * var1, var0.l6() * var1, var0.k5() * var1, var0.u3() * var1);
   }

   public static g7 l6(g7 var0, v3 var1) {
      return new g7(var0.n5() * var1.n5(), var0.l6() * var1.l6(), var0.k5() * var1.k5(), var0.u3());
   }

   public static g7 l6(g7 var0, float var1) {
      return new g7(var0.n5() / var1, var0.l6() / var1, var0.k5() / var1, var0.u3() / var1);
   }

   public void n5(g7 var1) {
      var1.u3 = this.u3;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public g7 u9() {
      g7 var1 = new g7();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.u9();
   }

   private boolean l6(g7 var1) {
      return true;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof g7) ? false : this.l6((g7)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public g7 Clone() {
      return this.u9();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(g7 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
