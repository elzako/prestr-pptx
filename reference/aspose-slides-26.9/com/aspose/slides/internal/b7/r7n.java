package com.aspose.slides.internal.b7;

public class r7n extends x2 {
   public r7n(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().n5(), this.l6().n5("adj1"), 100000.0);
      double var3 = l6(this.u9().l6().l6(), this.l6().n5("adj2"), 100000.0);
      double var5 = k5(this.u9().l6().n5() / 2.0, var1, 0.0);
      double var7 = k5(this.u9().l6().l6() / 2.0, var3, 0.0);
      double var9 = l6(var1, this.u9().l6().l6(), this.u9().l6().n5());
      double var11 = com.aspose.slides.ms.System.q1.n5(var3);
      double var13 = com.aspose.slides.ms.System.q1.n5(var9);
      double var15 = k5(var11, 0.0, var13);
      double var17 = a6(var1, 7.0, 2.0);
      double var19 = a6(var1, 10.0, 5.0);
      double var21 = l6(this.u9().l6().n5(), var17, 12.0);
      double var23 = l6(this.u9().l6().n5(), var19, 12.0);
      double var25 = a6(var3, 7.0, 2.0);
      double var27 = a6(var3, 10.0, 5.0);
      double var29 = l6(this.u9().l6().l6(), var25, 12.0);
      double var31 = l6(this.u9().l6().l6(), var27, 12.0);
      double var33 = a6(var1, 0.0, var5);
      double var35 = a6(var15, 0.0, var33);
      double var37 = a6(var3, var21, var5);
      double var39 = a6(var15, var37, var21);
      double var41 = a6(var1, var5, this.u9().l6().n5());
      double var43 = a6(var15, this.u9().l6().n5(), var41);
      double var45 = a6(var3, var5, var21);
      double var47 = a6(var15, var45, var21);
      double var49 = a6(var1, var29, var7);
      double var51 = a6(var15, var29, var49);
      double var53 = a6(var3, 0.0, var7);
      double var55 = a6(var15, var53, 0.0);
      double var57 = a6(var1, var7, var29);
      double var59 = a6(var15, var29, var57);
      double var61 = a6(var3, var7, this.u9().l6().l6());
      double var63 = a6(var15, var61, this.u9().l6().l6());
      double var65 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), this.l6().n5("adj3"), 100000.0);
      double var67 = k5(this.u9().l6().n5(), 0.0, var65);
      double var69 = k5(this.u9().l6().l6(), 0.0, var65);
      double var71 = l6(var65, 29289.0, 100000.0);
      double var73 = k5(this.u9().l6().n5(), 0.0, var71);
      double var75 = k5(this.u9().l6().l6(), 0.0, var71);
      c2 var77 = new c2(this.u9());
      var77.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var77.a6(0.0, var65);
      var77.n5(var65, var65, 1.08E7, 5400000.0);
      var77.u9(var21, 0.0);
      var77.u9(var39, var55);
      var77.u9(var23, 0.0);
      var77.u9(var67, 0.0);
      var77.n5(var65, var65, 1.62E7, 5400000.0);
      var77.u9(this.u9().l6().n5(), var29);
      var77.u9(var43, var59);
      var77.u9(this.u9().l6().n5(), var31);
      var77.u9(this.u9().l6().n5(), var69);
      var77.n5(var65, var65, 0.0, 5400000.0);
      var77.u9(var23, this.u9().l6().l6());
      var77.u9(var47, var63);
      var77.u9(var21, this.u9().l6().l6());
      var77.n5(var65, var65, 5400000.0, 5400000.0);
      var77.u9(0.0, var31);
      var77.u9(var35, var51);
      var77.u9(0.0, var29);
      var77.a6();
      var77.n5(new m8(var71, var71, var73, var75));
      return var77;
   }

   @Override
   public j6 n5(float var1, float var2) {
      double var3 = l6(com.aspose.slides.ms.System.q1.l6(var2, var1), this.l6().n5("adj3"), 100000.0);
      double var5 = l6(var3, 29289.0, 100000.0);
      return new j6(var1 + var5 * 2.0, var2 + var5 * 2.0);
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", -20833.0);
      var1.l6("adj2", 62500.0);
      var1.l6("adj3", 16667.0);
   }
}
