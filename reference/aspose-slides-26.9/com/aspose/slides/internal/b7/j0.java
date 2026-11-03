package com.aspose.slides.internal.b7;

public class j0 extends x2 {
   public j0(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj"), 50000.0);
      double var3 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 100000.0);
      double var5 = k5(this.u9().l6().n5(), 0.0, var3);
      double var7 = k5(this.u9().l6().l6(), 0.0, var3);
      double var9 = k5(this.u9().l6().n5(), 0.0, this.u9().l6().l6());
      double var11 = a6(var9, 0.0, var3);
      double var13 = a6(var9, this.u9().l6().n5(), var5);
      double var15 = a6(var9, var3, 0.0);
      double var17 = a6(var9, var7, this.u9().l6().l6());
      c2 var19 = new c2(this.u9());
      var19.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var19.a6(0.0, var3);
      var19.u9(var3, var3);
      var19.u9(var3, 0.0);
      var19.u9(var5, 0.0);
      var19.u9(var5, var3);
      var19.u9(this.u9().l6().n5(), var3);
      var19.u9(this.u9().l6().n5(), var7);
      var19.u9(var5, var7);
      var19.u9(var5, this.u9().l6().l6());
      var19.u9(var3, this.u9().l6().l6());
      var19.u9(var3, var7);
      var19.u9(0.0, var7);
      var19.a6();
      var19.n5(new m8(var11, var15, var13, var17));
      return var19;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 25000.0);
   }
}
