package com.aspose.slides;

class s0 extends com.aspose.slides.internal.v6g.h0<s0> {
   private double n5;
   private double l6;
   private double k5;
   private double u3;
   private double a6;
   private boolean u9;

   public s0() {
   }

   public final double n5() {
      return this.n5;
   }

   public final double l6() {
      return this.l6;
   }

   public final double k5() {
      return this.k5;
   }

   public final double u3() {
      return this.k5 * 2.0;
   }

   public final double a6() {
      return this.u3;
   }

   public final double u9() {
      return this.a6;
   }

   public final boolean h0() {
      return this.u9;
   }

   public s0(double var1, double var3, double var5, double var7, double var9, boolean var11) {
      this.n5 = var1;
      this.l6 = var3;
      this.k5 = var5;
      this.u3 = var7;
      this.a6 = var9;
      this.u9 = var11;
   }

   public s0(double var1, u6x var3, double var4, double var6, boolean var8, e4c var9) {
      e4c var10 = var3.e2().n5().u9();
      if (com.aspose.slides.ms.System.q1.n5(var1) < var3.n3()) {
         var1 = var3.n3();
      }

      double var11 = com.aspose.slides.ms.System.q1.n5(var1 / 2.0);
      double var13 = com.aspose.slides.ms.System.q1.z3(com.aspose.slides.ms.System.q1.a6(var11, 2.0) - com.aspose.slides.ms.System.q1.a6(var3.n3() / 2.0, 2.0));
      e4c var15 = new e4c(var3.x8().n5 - var10.n5 * var13, var3.x8().l6 - var10.l6 * var13);
      e4c var16 = new e4c(var3.x8().n5 + var10.n5 * var13, var3.x8().l6 + var10.l6 * var13);
      e4c var17 = (q3g.n5(var15.u9(), var9.u9()) < q3g.n5(var16.u9(), var9.u9()) ? var15 : var16).u9();
      double var18 = n5(var4, var11);
      double var20 = n5(var6, var11);
      double var22 = new u6x(var17.n5, var17.l6, var3.a6(), var3.u9()).y4();
      double var24 = new u6x(var17.n5, var17.l6, var3.h0(), var3.c8()).y4();
      this.u9 = var1 < 0.0;
      if (var8) {
         if (l6(var22, var24) < 180.0) {
            Double[] var26 = new Double[]{var22};
            Double[] var27 = new Double[]{var24};
            com.aspose.slides.internal.n8e.v4.l6(var26, var27);
            var22 = var26[0];
            var24 = var27[0];
         }

         var22 += this.u9 ? var18 : var20;
         var24 += this.u9 ? -var20 : -var18;
      } else {
         if (l6(var22, var24) > 180.0) {
            Double[] var30 = new Double[]{var22};
            Double[] var31 = new Double[]{var24};
            com.aspose.slides.internal.n8e.v4.l6(var30, var31);
            var22 = var30[0];
            var24 = var31[0];
         }

         var22 += this.u9 ? var20 : var18;
         var24 += this.u9 ? -var18 : -var20;
      }

      this.u9 ^= var8;
      this.n5 = var17.n5;
      this.l6 = var17.l6;
      this.k5 = var11;
      this.u3 = q3g.k5(var22);
      this.a6 = q3g.k5(var24);
   }

   public final s0 n5(double var1) {
      return new s0(this.n5, this.l6, var1, this.u3, this.a6, this.u9);
   }

   public final double l6(double var1) {
      return n5(var1, this.k5);
   }

   private static double n5(double var0, double var2) {
      return 180.0 * var0 / (Math.PI * var2);
   }

   private static double l6(double var0, double var2) {
      double var4 = var0 > var2 ? var2 + 360.0 : var2;
      return var4 - var0;
   }

   public void n5(s0 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
   }

   public s0 c8() {
      s0 var1 = new s0();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.c8();
   }

   private boolean l6(s0 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3 && var1.a6 == this.a6 && var1.u9 == this.u9;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3, this.a6, this.u9);
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
      return this.c8();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(s0 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
