package com.aspose.slides.internal.b7;

public class x4 extends x2 {
   public x4(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 50000.0);
      double var3 = n5(0.0, this.l6().n5("adj2"), 50000.0);
      double var5 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 100000.0);
      double var7 = k5(this.u9().l6().n5(), 0.0, var5);
      double var9 = k5(this.u9().l6().l6(), 0.0, var5);
      double var11 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var13 = k5(this.u9().l6().n5(), 0.0, var11);
      double var15 = k5(this.u9().l6().l6(), 0.0, var11);
      double var17 = k5(var5, 0.0, var11);
      double var19 = a6(var17, var5, var11);
      double var21 = l6(var19, 1.0, 2.0);
      double var23 = k5(this.u9().l6().n5(), 0.0, var21);
      double var25 = k5(this.u9().l6().l6(), 0.0, var21);
      c2 var27 = new c2(this.u9());
      var27.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var27.a6(var5, 0.0);
      var27.u9(var13, 0.0);
      var27.u9(this.u9().l6().n5(), var11);
      var27.u9(this.u9().l6().n5(), var9);
      var27.u9(var7, this.u9().l6().l6());
      var27.u9(var11, this.u9().l6().l6());
      var27.u9(0.0, var15);
      var27.u9(0.0, var5);
      var27.a6();
      var27.n5(new m8(var21, var21, var23, var25));
      return var27;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 0.0);
      var1.l6("adj2", 16667.0);
   }
}
