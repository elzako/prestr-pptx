package com.aspose.slides.internal.b7;

public class l2 extends x2 {
   public l2(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().n5(), 1.35E7);
      double var3 = k5(this.u9().l6().l6(), 1.35E7);
      double var5 = k5(this.u9().l6().n5(), var1, 0.0);
      double var7 = k5(this.u9().l6().l6(), var3, 0.0);
      c2 var9 = new c2(this.u9());
      var9.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var9.a6(0.0, this.u9().l6().l6());
      var9.n5(this.u9().l6().l6(), this.u9().l6().n5(), 1.08E7, 5400000.0);
      var9.u9(this.u9().l6().n5(), this.u9().l6().l6());
      var9.a6();
      var9.n5(new m8(var5, var7, this.u9().l6().n5(), this.u9().l6().l6()));
      return var9;
   }

   @Override
   protected void n5(z3$l6 var1) {
   }
}
