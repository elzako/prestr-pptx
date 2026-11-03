package com.aspose.slides.internal.b7;

public class q7 extends x2 {
   public q7(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 36745.0);
      double var3 = l6(var1, 2.0, 1.0);
      double var5 = k5(100000.0, 0.0, var3);
      double var7 = n5(0.0, this.l6().n5("adj2"), var5);
      double var9 = l6(this.u9().l6().l6(), var1, 100000.0);
      double var11 = l6(this.u9().l6().l6(), var7, 200000.0);
      double var13 = l6(this.u9().l6().n5(), 73490.0, 200000.0);
      double var15 = k5(this.u9().l6().l6() / 2.0, 0.0, var11);
      double var17 = k5(this.u9().l6().l6() / 2.0, var11, 0.0);
      double var19 = k5(var15, 0.0, var9);
      double var21 = k5(var17, var9, 0.0);
      double var23 = k5(this.u9().l6().n5() / 2.0, 0.0, var13);
      double var25 = k5(this.u9().l6().n5() / 2.0, var13, 0.0);
      double var27 = u3(var19, var15, 2.0);
      double var29 = u3(var17, var21, 2.0);
      c2 var31 = new c2(this.u9());
      var31.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var31.a6(var23, var19);
      var31.u9(var25, var19);
      var31.u9(var25, var15);
      var31.u9(var23, var15);
      var31.a6();
      var31.a6(var23, var17);
      var31.u9(var25, var17);
      var31.u9(var25, var21);
      var31.u9(var23, var21);
      var31.a6();
      var31.n5(new m8(var23, var19, var25, var21));
      return var31;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 23520.0);
      var1.l6("adj2", 11760.0);
   }
}
