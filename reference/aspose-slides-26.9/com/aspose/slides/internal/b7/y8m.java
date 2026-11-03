package com.aspose.slides.internal.b7;

public class y8m extends x2 {
   public y8m(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj"), 100000.0);
      double var3 = l6(this.u9().l6().n5(), var1, 200000.0);
      double var5 = l6(this.u9().l6().n5(), var1, 100000.0);
      double var7 = k5(var3, this.u9().l6().n5() / 2.0, 0.0);
      c2 var9 = new c2(this.u9());
      var9.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var9.a6(0.0, this.u9().l6().l6());
      var9.u9(var5, 0.0);
      var9.u9(this.u9().l6().n5(), this.u9().l6().l6());
      var9.a6();
      var9.n5(new m8(var3, this.u9().l6().l6() / 2.0, var7, this.u9().l6().l6()));
      return var9;
   }

   @Override
   public j6 n5(float var1, float var2) {
      return new j6(var1 * 2.0F, var2 * 2.0F);
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 50000.0);
   }
}
