package com.aspose.slides.internal.b7;

public class e4 extends x2 {
   public e4(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj"), 50000.0);
      double var3 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 100000.0);
      double var5 = k5(this.u9().l6().n5(), 0.0, var3);
      double var7 = k5(this.u9().l6().l6(), 0.0, var3);
      double var9 = l6(var3, 1.0, 2.0);
      double var11 = k5(this.u9().l6().n5(), 0.0, var9);
      double var13 = k5(this.u9().l6().l6(), 0.0, var9);
      c2 var15 = new c2(this.u9());
      var15.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var15.a6(0.0, var3);
      var15.u9(var3, 0.0);
      var15.u9(var5, 0.0);
      var15.u9(this.u9().l6().n5(), var3);
      var15.u9(this.u9().l6().n5(), var7);
      var15.u9(var5, this.u9().l6().l6());
      var15.u9(var3, this.u9().l6().l6());
      var15.u9(0.0, var7);
      var15.a6();
      var15.n5(new m8(var9, var9, var11, var13));
      return var15;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 29289.0);
   }
}
