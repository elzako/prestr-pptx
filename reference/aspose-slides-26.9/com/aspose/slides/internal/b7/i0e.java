package com.aspose.slides.internal.b7;

public class i0e extends x2 {
   public i0e(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj"), 50000.0);
      double var3 = l6(this.u9().l6().n5() / 2.0, this.l6().n5("hf"), 100000.0);
      double var5 = l6(var3, 1800000.0);
      double var7 = k5(this.u9().l6().n5() / 2.0, 0.0, var5);
      double var9 = k5(this.u9().l6().n5() / 2.0, var5, 0.0);
      double var11 = k5(this.u9().l6().l6() / 2.0, this.u9().l6().l6() / 4.0, 0.0);
      double var13 = l6(var3, var1, 50000.0);
      double var15 = l6(this.u9().l6().l6() / 2.0, var1, 50000.0);
      double var17 = l6(var13, 1.0, 2.0);
      double var19 = k5(this.u9().l6().n5() / 2.0, 0.0, var13);
      double var21 = k5(this.u9().l6().n5() / 2.0, 0.0, var17);
      double var23 = k5(this.u9().l6().n5() / 2.0, var17, 0.0);
      double var25 = k5(this.u9().l6().n5() / 2.0, var13, 0.0);
      double var27 = k5(var15, 3600000.0);
      double var29 = k5(this.u9().l6().l6() / 2.0, 0.0, var27);
      double var31 = k5(this.u9().l6().l6() / 2.0, var27, 0.0);
      double var33 = k5(this.u9().l6().l6() / 2.0, 0.0, var15);
      c2 var35 = new c2(this.u9());
      var35.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var35.a6(var7, this.u9().l6().l6() / 4.0);
      var35.u9(var21, var29);
      var35.u9(this.u9().l6().n5() / 2.0, 0.0);
      var35.u9(var23, var29);
      var35.u9(var9, this.u9().l6().l6() / 4.0);
      var35.u9(var25, this.u9().l6().l6() / 2.0);
      var35.u9(var9, var11);
      var35.u9(var23, var31);
      var35.u9(this.u9().l6().n5() / 2.0, this.u9().l6().l6());
      var35.u9(var21, var31);
      var35.u9(var7, var11);
      var35.u9(var19, this.u9().l6().l6() / 2.0);
      var35.a6();
      var35.n5(new m8(var19, var29, var25, var31));
      return var35;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 28868.0);
      var1.l6("hf", 115470.0);
   }
}
