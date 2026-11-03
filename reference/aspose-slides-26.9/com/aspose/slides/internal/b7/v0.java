package com.aspose.slides.internal.b7;

public class v0 extends x2 {
   public v0(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().l6(), this.l6().n5("adj1"), 100000.0);
      double var3 = l6(this.u9().l6().n5(), this.l6().n5("adj2"), 100000.0);
      double var5 = l6(this.u9().l6().l6(), this.l6().n5("adj3"), 100000.0);
      double var7 = l6(this.u9().l6().n5(), this.l6().n5("adj4"), 100000.0);
      c2 var9 = new c2(this.u9());
      var9.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, false);
      var9.a6(0.0, 0.0);
      var9.u9(this.u9().l6().n5(), 0.0);
      var9.u9(this.u9().l6().n5(), this.u9().l6().l6());
      var9.u9(0.0, this.u9().l6().l6());
      var9.a6();
      var9.n5(this.u9().l6().n5(), this.u9().l6().l6(), 5, false, true);
      var9.a6(var3, var1);
      var9.u9(var7, var5);
      var9.n5(new m8(0.0, 0.0, this.u9().l6().n5(), this.u9().l6().l6()));
      return var9;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 18750.0);
      var1.l6("adj2", -8333.0);
      var1.l6("adj3", 112500.0);
      var1.l6("adj4", -38333.0);
   }
}
