package com.aspose.slides.internal.b7;

public class d2 extends x2 {
   public d2(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().n5(), this.l6().n5("adj1"), 100000.0);
      double var3 = u3(var1, this.u9().l6().n5(), 2.0);
      double var5 = l6(this.u9().l6().l6(), this.l6().n5("adj2"), 100000.0);
      double var7 = u3(0.0, var5, 2.0);
      c2 var9 = new c2(this.u9());
      var9.n5(this.u9().l6().n5(), this.u9().l6().l6(), 5, false, true);
      var9.a6(0.0, 0.0);
      var9.u9(var1, 0.0);
      var9.u9(var1, var5);
      var9.u9(this.u9().l6().n5(), var5);
      var9.u9(this.u9().l6().n5(), this.u9().l6().l6());
      var9.n5(new m8(0.0, 0.0, this.u9().l6().n5(), this.u9().l6().l6()));
      return var9;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 50000.0);
      var1.l6("adj2", 50000.0);
   }
}
