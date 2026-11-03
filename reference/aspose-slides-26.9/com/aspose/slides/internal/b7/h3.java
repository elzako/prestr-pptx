package com.aspose.slides.internal.b7;

public class h3 extends x2 {
   public h3(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 50000.0);
      double var3 = n5(0.0, this.l6().n5("adj2"), 50000.0);
      double var5 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 100000.0);
      double var7 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var9 = k5(this.u9().l6().n5(), 0.0, var7);
      double var11 = l6(var5, 29289.0, 100000.0);
      double var13 = u3(var9, this.u9().l6().n5(), 2.0);
      c2 var15 = new c2(this.u9());
      var15.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var15.a6(var5, 0.0);
      var15.u9(var9, 0.0);
      var15.u9(this.u9().l6().n5(), var7);
      var15.u9(this.u9().l6().n5(), this.u9().l6().l6());
      var15.u9(0.0, this.u9().l6().l6());
      var15.u9(0.0, var5);
      var15.n5(var5, var5, 1.08E7, 5400000.0);
      var15.a6();
      var15.n5(new m8(var11, var11, var13, this.u9().l6().l6()));
      return var15;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 16667.0);
      var1.l6("adj2", 16667.0);
   }
}
