package com.aspose.slides.internal.b7;

public class g7 extends x2 {
   public g7(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 2.1599999E7);
      double var3 = n5(0.0, this.l6().n5("adj2"), 2.1599999E7);
      double var5 = k5(var3, 0.0, var1);
      double var7 = k5(var5, 2.16E7, 0.0);
      double var9 = a6(var5, var5, var7);
      double var11 = k5(this.u9().l6().n5() / 2.0, var1);
      double var13 = l6(this.u9().l6().l6() / 2.0, var1);
      double var15 = u9(this.u9().l6().n5() / 2.0, var13, var11);
      double var17 = c8(this.u9().l6().l6() / 2.0, var13, var11);
      double var19 = k5(this.u9().l6().n5() / 2.0, var3);
      double var21 = l6(this.u9().l6().l6() / 2.0, var3);
      double var23 = u9(this.u9().l6().n5() / 2.0, var21, var19);
      double var25 = c8(this.u9().l6().l6() / 2.0, var21, var19);
      double var27 = k5(this.u9().l6().n5() / 2.0, var15, 0.0);
      double var29 = k5(this.u9().l6().l6() / 2.0, var17, 0.0);
      double var31 = k5(this.u9().l6().n5() / 2.0, var23, 0.0);
      double var33 = k5(this.u9().l6().l6() / 2.0, var25, 0.0);
      double var35 = u3(var27, var31, 2.0);
      double var37 = u3(var29, var33, 2.0);
      double var39 = l6(var9, 1.0, 2.0);
      double var41 = k5(var1, var39, 1.08E7);
      double var43 = l6(this.u9().l6().n5() / 2.0, 2700000.0);
      double var45 = k5(this.u9().l6().l6() / 2.0, 2700000.0);
      double var47 = k5(this.u9().l6().n5() / 2.0, 0.0, var43);
      double var49 = k5(this.u9().l6().n5() / 2.0, var43, 0.0);
      double var51 = k5(this.u9().l6().l6() / 2.0, 0.0, var45);
      double var53 = k5(this.u9().l6().l6() / 2.0, var45, 0.0);
      c2 var55 = new c2(this.u9());
      var55.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var55.a6(var27, var29);
      var55.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, var1, var9);
      var55.a6();
      var55.n5(new m8(var47, var51, var49, var53));
      return var55;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 2700000.0);
      var1.l6("adj2", 1.62E7);
   }
}
