package com.aspose.slides.internal.b7;

public class e6a extends x2 {
   public e6a(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().n5(), this.l6().n5("adj1"), 100000.0);
      double var3 = l6(this.u9().l6().l6(), this.l6().n5("adj2"), 100000.0);
      double var5 = k5(this.u9().l6().n5() / 2.0, var1, 0.0);
      double var7 = k5(this.u9().l6().l6() / 2.0, var3, 0.0);
      double var9 = l6(var1, this.u9().l6().l6(), 1.0);
      double var11 = l6(var3, this.u9().l6().n5(), 1.0);
      double var13 = n5(var9, var11);
      double var15 = k5(var13, 660000.0, 0.0);
      double var17 = k5(var13, 0.0, 660000.0);
      double var19 = l6(this.u9().l6().n5() / 2.0, var15);
      double var21 = k5(this.u9().l6().l6() / 2.0, var15);
      double var23 = k5(this.u9().l6().n5() / 2.0, var19, 0.0);
      double var25 = k5(this.u9().l6().l6() / 2.0, var21, 0.0);
      double var27 = l6(this.u9().l6().n5() / 2.0, var17);
      double var29 = k5(this.u9().l6().l6() / 2.0, var17);
      double var31 = k5(this.u9().l6().n5() / 2.0, var27, 0.0);
      double var33 = k5(this.u9().l6().l6() / 2.0, var29, 0.0);
      double var35 = n5(var19, var21);
      double var37 = n5(var27, var29);
      double var39 = k5(var37, 0.0, var35);
      double var41 = k5(var39, 2.16E7, 0.0);
      double var43 = a6(var39, var39, var41);
      double var45 = l6(this.u9().l6().n5() / 2.0, 2700000.0);
      double var47 = k5(this.u9().l6().l6() / 2.0, 2700000.0);
      double var49 = k5(this.u9().l6().n5() / 2.0, 0.0, var45);
      double var51 = k5(this.u9().l6().n5() / 2.0, var45, 0.0);
      double var53 = k5(this.u9().l6().l6() / 2.0, 0.0, var47);
      double var55 = k5(this.u9().l6().l6() / 2.0, var47, 0.0);
      c2 var57 = new c2(this.u9());
      var57.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var57.a6(var5, var7);
      var57.u9(var23, var25);
      var57.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, var35, var43);
      var57.a6();
      var57.n5(new m8(var49, var53, var51, var55));
      return var57;
   }

   @Override
   public j6 n5(float var1, float var2) {
      double var3 = l6(var1 / 2.0F, 2700000.0);
      double var5 = k5(var2 / 2.0F, 2700000.0);
      double var7 = k5(var1 / 2.0F, 0.0, var3);
      double var9 = k5(var2 / 2.0F, 0.0, var5);
      return new j6((var1 + var7 * 2.0) * 1.1F, (var2 + var9 * 2.0) * 1.1F);
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", -20833.0);
      var1.l6("adj2", 62500.0);
   }
}
