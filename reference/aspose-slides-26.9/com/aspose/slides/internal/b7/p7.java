package com.aspose.slides.internal.b7;

public class p7 extends x2 {
   public p7(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().l6() / 2.0, this.l6().n5("vf"), 100000.0);
      double var3 = l6(this.u9().l6().n5() / 2.0, 2160000.0);
      double var5 = l6(this.u9().l6().n5() / 2.0, 4320000.0);
      double var7 = k5(this.u9().l6().n5() / 2.0, 0.0, var3);
      double var9 = k5(this.u9().l6().n5() / 2.0, 0.0, var5);
      double var11 = k5(this.u9().l6().n5() / 2.0, var5, 0.0);
      double var13 = k5(this.u9().l6().n5() / 2.0, var3, 0.0);
      double var15 = k5(var1, 4320000.0);
      double var17 = k5(var1, 2160000.0);
      double var19 = k5(this.u9().l6().l6() / 2.0, 0.0, var15);
      double var21 = k5(this.u9().l6().l6() / 2.0, 0.0, var17);
      double var23 = k5(this.u9().l6().l6() / 2.0, var17, 0.0);
      double var25 = k5(this.u9().l6().l6() / 2.0, var15, 0.0);
      c2 var27 = new c2(this.u9());
      var27.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var27.a6(0.0, this.u9().l6().l6() / 2.0);
      var27.u9(var7, var21);
      var27.u9(var9, var19);
      var27.u9(var11, var19);
      var27.u9(var13, var21);
      var27.u9(this.u9().l6().n5(), this.u9().l6().l6() / 2.0);
      var27.u9(var13, var23);
      var27.u9(var11, var25);
      var27.u9(var9, var25);
      var27.u9(var7, var23);
      var27.a6();
      var27.n5(new m8(var7, var21, var13, var23));
      return var27;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("vf", 105146.0);
   }
}
