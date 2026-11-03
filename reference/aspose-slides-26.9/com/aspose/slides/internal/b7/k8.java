package com.aspose.slides.internal.b7;

public class k8 extends x2 {
   public k8(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().n5(), this.l6().n5("adj1"), 100000.0);
      double var3 = u3(0.0, var1, 2.0);
      double var5 = u3(this.u9().l6().n5(), var1, 2.0);
      double var7 = l6(this.u9().l6().l6(), 3.0, 4.0);
      c2 var9 = new c2(this.u9());
      var9.n5(this.u9().l6().n5(), this.u9().l6().l6(), 5, false, true);
      var9.a6(0.0, 0.0);
      var9.n5(new k0(var3, 0.0), new k0(var1, this.u9().l6().l6() / 4.0), new k0(var1, this.u9().l6().l6() / 2.0));
      var9.n5(new k0(var1, var7), new k0(var5, this.u9().l6().l6()), new k0(this.u9().l6().n5(), this.u9().l6().l6()));
      var9.n5(new m8(0.0, 0.0, this.u9().l6().n5(), this.u9().l6().l6()));
      return var9;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 50000.0);
   }
}
