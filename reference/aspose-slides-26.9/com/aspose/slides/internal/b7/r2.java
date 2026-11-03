package com.aspose.slides.internal.b7;

public class r2 extends x2 {
   public r2(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj"), 50000.0);
      double var3 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 100000.0);
      double var5 = k5(this.u9().l6().n5() / 2.0, 0.0, var3);
      double var7 = k5(this.u9().l6().l6() / 2.0, 0.0, var3);
      double var9 = n5(this.u9().l6().n5(), this.u9().l6().l6());
      double var11 = l6(var7, var9);
      double var13 = k5(var5, var9);
      double var15 = h0(var11, var13, 0.0);
      double var17 = l6(var5, var7, var15);
      double var19 = l6(var3, 1.0, 2.0);
      double var21 = n5(var17, var19);
      double var23 = l6(var21, 2.0, 1.0);
      double var25 = k5(-1.08E7, var23, 0.0);
      double var27 = n5(this.u9().l6().n5(), this.u9().l6().l6());
      double var29 = k5(var27, 0.0, var21);
      double var31 = k5(var29, 0.0, 1.08E7);
      double var33 = l6(var7, var29);
      double var35 = k5(var5, var29);
      double var37 = h0(var33, var35, 0.0);
      double var39 = l6(var5, var7, var37);
      double var41 = l6(var39, var29);
      double var43 = k5(var39, var29);
      double var45 = k5(this.u9().l6().n5() / 2.0, var41, 0.0);
      double var47 = k5(this.u9().l6().l6() / 2.0, var43, 0.0);
      double var49 = k5(this.u9().l6().n5() / 2.0, 0.0, var41);
      double var51 = k5(this.u9().l6().l6() / 2.0, 0.0, var43);
      double var53 = l6(this.u9().l6().n5() / 2.0, 2700000.0);
      double var55 = k5(this.u9().l6().l6() / 2.0, 2700000.0);
      double var57 = k5(this.u9().l6().n5() / 2.0, 0.0, var53);
      double var59 = k5(this.u9().l6().n5() / 2.0, var53, 0.0);
      double var61 = k5(this.u9().l6().l6() / 2.0, 0.0, var55);
      double var63 = k5(this.u9().l6().l6() / 2.0, var55, 0.0);
      c2 var65 = new c2(this.u9());
      var65.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var65.a6(0.0, this.u9().l6().l6() / 2.0);
      var65.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 1.08E7, 5400000.0);
      var65.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 1.62E7, 5400000.0);
      var65.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 0.0, 5400000.0);
      var65.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 5400000.0, 5400000.0);
      var65.a6();
      var65.a6(var45, var47);
      var65.n5(var7, var5, var29, var25);
      var65.a6();
      var65.a6(var49, var51);
      var65.n5(var7, var5, var31, var25);
      var65.a6();
      var65.n5(new m8(var57, var61, var59, var63));
      return var65;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 18750.0);
   }
}
