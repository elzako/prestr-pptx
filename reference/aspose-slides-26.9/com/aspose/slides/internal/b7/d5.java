package com.aspose.slides.internal.b7;

public class d5 extends x2 {
   public d5(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().n5(), this.l6().n5("adj1"), 100000.0);
      double var3 = l6(this.u9().l6().n5(), this.l6().n5("adj3"), 100000.0);
      double var5 = u3(var1, var3, 2.0);
      double var7 = l6(this.u9().l6().l6(), this.l6().n5("adj2"), 100000.0);
      double var9 = u3(0.0, var7, 2.0);
      double var11 = u3(this.u9().l6().l6(), var7, 2.0);
      c2 var13 = new c2(this.u9());
      var13.n5(this.u9().l6().n5(), this.u9().l6().l6(), 5, false, true);
      var13.a6(0.0, 0.0);
      var13.u9(var1, 0.0);
      var13.u9(var1, var7);
      var13.u9(var3, var7);
      var13.u9(var3, this.u9().l6().l6());
      var13.u9(this.u9().l6().n5(), this.u9().l6().l6());
      var13.n5(new m8(0.0, 0.0, this.u9().l6().n5(), this.u9().l6().l6()));
      return var13;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 50000.0);
      var1.l6("adj2", 50000.0);
      var1.l6("adj3", 50000.0);
   }
}
