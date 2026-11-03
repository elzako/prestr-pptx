package com.aspose.slides.internal.b7;

public class r3 extends x2 {
   public r3(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 100000.0);
      double var3 = l6(this.u9().l6().l6(), var1, 200000.0);
      double var5 = l6(this.u9().l6().n5(), 73490.0, 200000.0);
      double var7 = k5(this.u9().l6().l6() / 2.0, 0.0, var3);
      double var9 = k5(this.u9().l6().l6() / 2.0, var3, 0.0);
      double var11 = k5(this.u9().l6().n5() / 2.0, 0.0, var5);
      double var13 = k5(this.u9().l6().n5() / 2.0, var5, 0.0);
      c2 var15 = new c2(this.u9());
      var15.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var15.a6(var11, var7);
      var15.u9(var13, var7);
      var15.u9(var13, var9);
      var15.u9(var11, var9);
      var15.a6();
      var15.n5(new m8(var11, var7, var13, var9));
      return var15;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 23520.0);
   }
}
