package com.aspose.slides.internal.b7;

public class s0 extends x2 {
   public s0(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(100000.0, this.u9().l6().n5(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj"), var1);
      double var5 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var7 = k5(this.u9().l6().n5(), 0.0, var5);
      double var9 = l6(var7, 1.0, 2.0);
      double var11 = k5(var7, 0.0, var5);
      double var13 = a6(var11, var5, 0.0);
      double var15 = a6(var11, var7, this.u9().l6().n5());
      c2 var17 = new c2(this.u9());
      var17.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var17.a6(0.0, 0.0);
      var17.u9(var7, 0.0);
      var17.u9(this.u9().l6().n5(), this.u9().l6().l6() / 2.0);
      var17.u9(var7, this.u9().l6().l6());
      var17.u9(0.0, this.u9().l6().l6());
      var17.u9(var5, this.u9().l6().l6() / 2.0);
      var17.a6();
      var17.n5(new m8(var13, 0.0, var15, this.u9().l6().l6()));
      return var17;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 50000.0);
   }
}
