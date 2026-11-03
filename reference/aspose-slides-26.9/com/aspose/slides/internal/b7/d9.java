package com.aspose.slides.internal.b7;

public class d9 extends x2 {
   public d9(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().n5() / 2.0, 2700000.0);
      double var3 = k5(this.u9().l6().l6() / 2.0, 2700000.0);
      double var5 = k5(this.u9().l6().n5() / 2.0, 0.0, var1);
      double var7 = k5(this.u9().l6().n5() / 2.0, var1, 0.0);
      double var9 = k5(this.u9().l6().l6() / 2.0, 0.0, var3);
      double var11 = k5(this.u9().l6().l6() / 2.0, var3, 0.0);
      c2 var13 = new c2(this.u9());
      var13.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var13.a6(0.0, this.u9().l6().l6() / 2.0);
      var13.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 1.08E7, 5400000.0);
      var13.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 1.62E7, 5400000.0);
      var13.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 0.0, 5400000.0);
      var13.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 5400000.0, 5400000.0);
      var13.a6();
      var13.n5(new m8(var5, var9, var7, var11));
      return var13;
   }

   @Override
   public j6 n5(float var1, float var2) {
      double var3 = l6(var1 / 2.0F, 2700000.0);
      double var5 = k5(var2 / 2.0F, 2700000.0);
      double var7 = k5(var1 / 2.0F, 0.0, var3);
      double var9 = k5(var2 / 2.0F, 0.0, var5);
      return new j6((var1 + var7 * 2.0) * 1.1F, (var2 + var9 * 2.0) * 1.1F);
   }

   @Override
   protected void n5(z3$l6 var1) {
   }
}
