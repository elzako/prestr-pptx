package com.aspose.slides.internal.b7;

public class d4 extends com.aspose.slides.internal.v6g.h0<d4> {
   private double n5;
   private double l6;
   private double k5;
   private double u3;

   public d4() {
   }

   public double n5() {
      return this.n5;
   }

   public double l6() {
      return this.k5;
   }

   public double k5() {
      return this.l6;
   }

   public double u3() {
      return this.u3;
   }

   public k0 a6() {
      return new k0(this.n5, this.k5);
   }

   public k0 u9() {
      return new k0(this.l6, this.u3);
   }

   public double h0() {
      return com.aspose.slides.ms.System.q1.n5(this.l6 - this.n5);
   }

   public double c8() {
      return com.aspose.slides.ms.System.q1.n5(this.u3 - this.k5);
   }

   public k0 t2() {
      return new k0(this.n5 + com.aspose.slides.ms.System.q1.n5(this.l6 - this.n5) / 2.0, this.k5 + com.aspose.slides.ms.System.q1.n5(this.u3 - this.k5) / 2.0);
   }

   public d4(double var1, double var3, double var5, double var7) {
      this.n5 = var1;
      this.l6 = var5;
      this.k5 = var3;
      this.u3 = var7;
   }

   public d4(k0 var1, k0 var2) {
      this(var1.n5(), var1.l6(), var2.n5(), var2.l6());
   }

   public d4 n5(k0 var1, double var2) {
      v2 var4 = k0.n5(this.a6(), var1).u9();
      v2 var5 = k0.n5(this.u9(), var1).u9();
      return new d4(v2.n5(var1, v2.n5(var4, var2)).u3(), v2.n5(var1, v2.n5(var5, var2)).u3());
   }

   public void n5(d4 var1) {
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
   }

   public d4 s7() {
      d4 var1 = new d4();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.s7();
   }

   private boolean l6(d4 var1) {
      return var1.n5 == this.n5 && var1.l6 == this.l6 && var1.k5 == this.k5 && var1.u3 == this.u3;
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
         return !(obj instanceof d4) ? false : this.l6((d4)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public d4 Clone() {
      return this.s7();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(d4 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
