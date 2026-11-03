package com.aspose.slides.internal.b7;

public class p1 extends x2 {
   public p1(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 73490.0);
      double var3 = l6(this.u9().l6().n5(), 73490.0, 200000.0);
      double var5 = l6(this.u9().l6().l6(), 73490.0, 200000.0);
      double var7 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 200000.0);
      double var9 = k5(this.u9().l6().n5() / 2.0, 0.0, var3);
      double var11 = k5(this.u9().l6().n5() / 2.0, 0.0, var7);
      double var13 = k5(this.u9().l6().n5() / 2.0, var7, 0.0);
      double var15 = k5(this.u9().l6().n5() / 2.0, var3, 0.0);
      double var17 = k5(this.u9().l6().l6() / 2.0, 0.0, var5);
      double var19 = k5(this.u9().l6().l6() / 2.0, 0.0, var7);
      double var21 = k5(this.u9().l6().l6() / 2.0, var7, 0.0);
      double var23 = k5(this.u9().l6().l6() / 2.0, var5, 0.0);
      c2 var25 = new c2(this.u9());
      var25.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var25.a6(var9, var19);
      var25.u9(var11, var19);
      var25.u9(var11, var17);
      var25.u9(var13, var17);
      var25.u9(var13, var19);
      var25.u9(var15, var19);
      var25.u9(var15, var21);
      var25.u9(var13, var21);
      var25.u9(var13, var23);
      var25.u9(var11, var23);
      var25.u9(var11, var21);
      var25.u9(var9, var21);
      var25.a6();
      var25.n5(new m8(var9, var19, var15, var21));
      return var25;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 23520.0);
   }
}
