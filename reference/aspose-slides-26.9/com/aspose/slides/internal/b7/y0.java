package com.aspose.slides.internal.b7;

public class y0 extends x2 {
   public y0(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(50000.0, this.u9().l6().l6(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj"), var1);
      double var5 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 200000.0);
      double var7 = k5(var5, var5, 0.0);
      double var9 = k5(this.u9().l6().l6(), 0.0, var5);
      c2 var11 = new c2(this.u9());
      var11.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, false);
      var11.a6(0.0, var5);
      var11.n5(var5, this.u9().l6().n5() / 2.0, 1.08E7, -1.08E7);
      var11.u9(this.u9().l6().n5(), var9);
      var11.n5(var5, this.u9().l6().n5() / 2.0, 0.0, 1.08E7);
      var11.a6();
      var11.n5(this.u9().l6().n5(), this.u9().l6().l6(), 3, false, false);
      var11.a6(0.0, var5);
      var11.n5(var5, this.u9().l6().n5() / 2.0, 1.08E7, 1.08E7);
      var11.n5(var5, this.u9().l6().n5() / 2.0, 0.0, 1.08E7);
      var11.a6();
      var11.n5(this.u9().l6().n5(), this.u9().l6().l6(), 5, false, true);
      var11.a6(this.u9().l6().n5(), var5);
      var11.n5(var5, this.u9().l6().n5() / 2.0, 0.0, 1.08E7);
      var11.n5(var5, this.u9().l6().n5() / 2.0, 1.08E7, 1.08E7);
      var11.u9(this.u9().l6().n5(), var9);
      var11.n5(var5, this.u9().l6().n5() / 2.0, 0.0, 1.08E7);
      var11.u9(0.0, var5);
      var11.n5(new m8(0.0, var7, this.u9().l6().n5(), var9));
      return var11;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 25000.0);
   }
}
