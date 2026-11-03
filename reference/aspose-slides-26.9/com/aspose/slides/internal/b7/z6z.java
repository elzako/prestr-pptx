package com.aspose.slides.internal.b7;

public class z6z extends x2 {
   public z6z(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj"), 50000.0);
      double var3 = l6(this.u9().l6().n5() / 2.0, var1, 50000.0);
      double var5 = l6(this.u9().l6().l6() / 2.0, var1, 50000.0);
      double var7 = l6(var3, 2700000.0);
      double var9 = k5(var5, 2700000.0);
      double var11 = k5(this.u9().l6().n5() / 2.0, 0.0, var7);
      double var13 = k5(this.u9().l6().n5() / 2.0, var7, 0.0);
      double var15 = k5(this.u9().l6().l6() / 2.0, 0.0, var9);
      double var17 = k5(this.u9().l6().l6() / 2.0, var9, 0.0);
      double var19 = k5(this.u9().l6().l6() / 2.0, 0.0, var5);
      c2 var21 = new c2(this.u9());
      var21.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var21.a6(0.0, this.u9().l6().l6() / 2.0);
      var21.u9(var11, var15);
      var21.u9(this.u9().l6().n5() / 2.0, 0.0);
      var21.u9(var13, var15);
      var21.u9(this.u9().l6().n5(), this.u9().l6().l6() / 2.0);
      var21.u9(var13, var17);
      var21.u9(this.u9().l6().n5() / 2.0, this.u9().l6().l6());
      var21.u9(var11, var17);
      var21.a6();
      var21.n5(new m8(var11, var15, var13, var17));
      return var21;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 12500.0);
   }
}
