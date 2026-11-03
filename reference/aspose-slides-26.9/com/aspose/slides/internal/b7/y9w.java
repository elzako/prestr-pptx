package com.aspose.slides.internal.b7;

public class y9w extends x2 {
   public y9w(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj"), 50000.0);
      double var3 = l6(this.u9().l6().n5() / 2.0, this.l6().n5("hf"), 100000.0);
      double var5 = l6(this.u9().l6().l6() / 2.0, this.l6().n5("vf"), 100000.0);
      double var7 = l6(this.u9().l6().l6() / 2.0, this.l6().n5("vf"), 100000.0);
      double var9 = l6(var3, 1080000.0);
      double var11 = l6(var3, 1.836E7);
      double var13 = k5(var5, 1080000.0);
      double var15 = k5(var5, 1.836E7);
      double var17 = k5(this.u9().l6().n5() / 2.0, 0.0, var9);
      double var19 = k5(this.u9().l6().n5() / 2.0, 0.0, var11);
      double var21 = k5(this.u9().l6().n5() / 2.0, var11, 0.0);
      double var23 = k5(this.u9().l6().n5() / 2.0, var9, 0.0);
      double var25 = k5(var7, 0.0, var13);
      double var27 = k5(var7, 0.0, var15);
      double var29 = l6(var3, var1, 50000.0);
      double var31 = l6(var5, var1, 50000.0);
      double var33 = l6(var29, 2.052E7);
      double var35 = l6(var29, 3240000.0);
      double var37 = k5(var31, 3240000.0);
      double var39 = k5(var31, 2.052E7);
      double var41 = k5(this.u9().l6().n5() / 2.0, 0.0, var33);
      double var43 = k5(this.u9().l6().n5() / 2.0, 0.0, var35);
      double var45 = k5(this.u9().l6().n5() / 2.0, var35, 0.0);
      double var47 = k5(this.u9().l6().n5() / 2.0, var33, 0.0);
      double var49 = k5(var7, 0.0, var37);
      double var51 = k5(var7, 0.0, var39);
      double var53 = k5(var7, var31, 0.0);
      double var55 = k5(var7, 0.0, var31);
      c2 var57 = new c2(this.u9());
      var57.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var57.a6(var17, var25);
      var57.u9(var43, var49);
      var57.u9(this.u9().l6().n5() / 2.0, 0.0);
      var57.u9(var45, var49);
      var57.u9(var23, var25);
      var57.u9(var47, var51);
      var57.u9(var21, var27);
      var57.u9(this.u9().l6().n5() / 2.0, var53);
      var57.u9(var19, var27);
      var57.u9(var41, var51);
      var57.a6();
      var57.n5(new m8(var41, var49, var47, var53));
      return var57;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 19098.0);
      var1.l6("hf", 105146.0);
      var1.l6("vf", 110557.0);
   }
}
