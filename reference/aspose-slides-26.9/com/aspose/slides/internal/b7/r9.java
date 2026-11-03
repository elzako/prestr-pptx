package com.aspose.slides.internal.b7;

public class r9 extends x2 {
   public r9(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 50000.0);
      double var3 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 100000.0);
      double var5 = k5(this.u9().l6().n5(), 0.0, var3);
      double var7 = k5(this.u9().l6().l6(), 0.0, var3);
      c2 var9 = new c2(this.u9());
      var9.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var9.a6(0.0, 0.0);
      var9.u9(this.u9().l6().n5(), 0.0);
      var9.u9(this.u9().l6().n5(), this.u9().l6().l6());
      var9.u9(0.0, this.u9().l6().l6());
      var9.a6();
      var9.a6(var3, var3);
      var9.u9(var3, var7);
      var9.u9(var5, var7);
      var9.u9(var5, var3);
      var9.a6();
      var9.n5(new m8(var3, var3, var5, var7));
      return var9;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 12500.0);
   }
}
