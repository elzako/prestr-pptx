package com.aspose.slides.internal.b7;

public class q3 extends x2 {
   public q3(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj"), 50000.0);
      double var3 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 100000.0);
      double var5 = k5(this.u9().l6().n5() / 2.0, 0.0, var3);
      double var7 = k5(this.u9().l6().l6() / 2.0, 0.0, var3);
      double var9 = l6(this.u9().l6().n5() / 2.0, 2700000.0);
      double var11 = k5(this.u9().l6().l6() / 2.0, 2700000.0);
      double var13 = k5(this.u9().l6().n5() / 2.0, 0.0, var9);
      double var15 = k5(this.u9().l6().n5() / 2.0, var9, 0.0);
      double var17 = k5(this.u9().l6().l6() / 2.0, 0.0, var11);
      double var19 = k5(this.u9().l6().l6() / 2.0, var11, 0.0);
      c2 var21 = new c2(this.u9());
      var21.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var21.a6(0.0, this.u9().l6().l6() / 2.0);
      var21.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 1.08E7, 5400000.0);
      var21.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 1.62E7, 5400000.0);
      var21.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 0.0, 5400000.0);
      var21.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 5400000.0, 5400000.0);
      var21.a6();
      var21.a6(var3, this.u9().l6().l6() / 2.0);
      var21.n5(var7, var5, 1.08E7, -5400000.0);
      var21.n5(var7, var5, 5400000.0, -5400000.0);
      var21.n5(var7, var5, 0.0, -5400000.0);
      var21.n5(var7, var5, 1.62E7, -5400000.0);
      var21.a6();
      var21.n5(new m8(var13, var17, var15, var19));
      return var21;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 25000.0);
   }
}
