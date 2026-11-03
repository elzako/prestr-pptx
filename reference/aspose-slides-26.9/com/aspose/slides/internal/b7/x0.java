package com.aspose.slides.internal.b7;

public class x0 extends x2 {
   public x0(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().n5() / 2.0, 2700000.0);
      double var3 = k5(this.u9().l6().l6() / 2.0, 2700000.0);
      double var5 = k5(this.u9().l6().n5() / 2.0, var1, 0.0);
      double var7 = k5(this.u9().l6().l6() / 2.0, 0.0, var3);
      double var9 = k5(this.u9().l6().l6() / 2.0, var3, 0.0);
      c2 var11 = new c2(this.u9());
      var11.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var11.a6(0.0, 0.0);
      var11.u9(this.u9().l6().n5() / 2.0, 0.0);
      var11.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 1.62E7, 1.08E7);
      var11.u9(0.0, this.u9().l6().l6());
      var11.a6();
      var11.n5(new m8(0.0, var7, var5, var9));
      return var11;
   }

   @Override
   protected void n5(z3$l6 var1) {
   }
}
