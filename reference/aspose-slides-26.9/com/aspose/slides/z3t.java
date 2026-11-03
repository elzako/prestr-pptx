package com.aspose.slides;

abstract class z3t extends e8s {
   w1g l6 = new w1g();
   protected final float k5;
   protected final e8s u3;
   protected final e8s a6;
   protected final p1e u9;

   protected z3t(MathFraction var1, c0e var2, w1g var3) {
      super(var1, var2);
      var3.u3++;
      var3.n5(this.l6);
      var3.s7 = true;
      this.u3 = this.n5(var1.getNumerator(), var3.n5());
      var3.s7 = false;
      var3.t2 = true;
      this.a6 = this.n5(var1.getDenominator(), var3.n5());
      this.k5 = var3.a6;
      this.u9 = this.a6().n5(var3.a6);
   }

   public final MathFraction u3() {
      return (MathFraction)super.t2;
   }
}
