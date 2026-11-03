package com.aspose.slides.internal.b7;

public class g1 extends x2 {
   public g1(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(50000.0, this.u9().l6().l6(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj"), var1);
      double var5 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var7 = k5(this.u9().l6().l6(), 0.0, var5);
      double var9 = l6(this.u9().l6().n5(), 2700000.0);
      double var11 = k5(var5, 2700000.0);
      double var13 = k5(this.u9().l6().n5(), 0.0, var9);
      double var15 = k5(var5, 0.0, var11);
      double var17 = k5(this.u9().l6().l6(), var11, var5);
      c2 var19 = new c2(this.u9());
      var19.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, false);
      var19.a6(this.u9().l6().n5(), this.u9().l6().l6());
      var19.n5(var5, this.u9().l6().n5(), 5400000.0, 5400000.0);
      var19.u9(0.0, var5);
      var19.n5(var5, this.u9().l6().n5(), 1.08E7, 5400000.0);
      var19.a6();
      var19.n5(this.u9().l6().n5(), this.u9().l6().l6(), 5, false, true);
      var19.a6(this.u9().l6().n5(), this.u9().l6().l6());
      var19.n5(var5, this.u9().l6().n5(), 5400000.0, 5400000.0);
      var19.u9(0.0, var5);
      var19.n5(var5, this.u9().l6().n5(), 1.08E7, 5400000.0);
      var19.n5(new m8(var13, var15, this.u9().l6().n5(), var17));
      return var19;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 8333.0);
   }
}
