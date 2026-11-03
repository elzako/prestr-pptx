package com.aspose.slides.internal.b7;

public class k3 extends x2 {
   public k3(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(100000.0, this.u9().l6().n5(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj"), var1);
      double var5 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var7 = k5(this.u9().l6().n5(), 0.0, var5);
      double var9 = u3(var7, this.u9().l6().n5(), 2.0);
      double var11 = l6(var7, 1.0, 2.0);
      c2 var13 = new c2(this.u9());
      var13.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var13.a6(0.0, 0.0);
      var13.u9(var7, 0.0);
      var13.u9(this.u9().l6().n5(), this.u9().l6().l6() / 2.0);
      var13.u9(var7, this.u9().l6().l6());
      var13.u9(0.0, this.u9().l6().l6());
      var13.a6();
      var13.n5(new m8(0.0, 0.0, var9, this.u9().l6().l6()));
      return var13;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 50000.0);
   }
}
