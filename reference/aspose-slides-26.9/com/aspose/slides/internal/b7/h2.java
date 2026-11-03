package com.aspose.slides.internal.b7;

public class h2 extends f7 {
   @Override
   public int n5() {
      return 12;
   }

   @Override
   public n2z u3() {
      h2 var1 = new h2();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(0.0, this.l6().n5("adj"), 2.1599999E7);
      double var3 = k5(5400000.0, 0.0, var1);
      double var5 = k5(1.08E7, 0.0, var1);
      double var7 = k5(1.62E7, 0.0, var1);
      double var9 = k5(2.16E7, 0.0, var1);
      double var11 = a6(var7, var1, 0.0);
      double var13 = a6(var5, 1.08E7, var11);
      double var15 = a6(var3, var9, var13);
      double var17 = a6(var1, var15, 0.0);
      double var19 = k5(2.16E7, 0.0, var17);
      double var21 = a6(var17, var19, 0.0);
      double var23 = l6(var3, 2.0, 1.0);
      double var25 = l6(var7, 2.0, 1.0);
      double var27 = k5(0.0, 0.0, var25);
      double var29 = k5(0.0, 0.0, 1.08E7);
      double var31 = a6(var7, var27, var29);
      double var33 = a6(var5, 1.08E7, var31);
      double var35 = a6(var3, var23, var33);
      double var37 = a6(var1, var35, 1.08E7);
      double var39 = k5(0.0, 0.0, var37);
      double var41 = a6(var5, var21, var17);
      double var43 = a6(var5, var17, var21);
      double var45 = a6(var5, var37, var39);
      double var47 = a6(var5, var39, var37);
      double var49 = k5(this.u9().l6().n5() / 2.0, var41);
      double var51 = l6(this.u9().l6().l6() / 2.0, var41);
      double var53 = u9(this.u9().l6().n5() / 2.0, var51, var49);
      double var55 = c8(this.u9().l6().l6() / 2.0, var51, var49);
      double var57 = k5(this.u9().l6().n5() / 2.0, var53, 0.0);
      double var59 = k5(this.u9().l6().l6() / 2.0, var55, 0.0);
      double var61 = k5(this.u9().l6().n5() / 2.0, var43);
      double var63 = l6(this.u9().l6().l6() / 2.0, var43);
      double var65 = u9(this.u9().l6().n5() / 2.0, var63, var61);
      double var67 = c8(this.u9().l6().l6() / 2.0, var63, var61);
      double var69 = k5(this.u9().l6().n5() / 2.0, var65, 0.0);
      double var71 = k5(this.u9().l6().l6() / 2.0, var67, 0.0);
      double var73 = k5(this.u9().l6().n5() / 2.0, this.l6().n5("adj"));
      double var75 = l6(this.u9().l6().l6() / 2.0, this.l6().n5("adj"));
      double var77 = u9(this.u9().l6().n5() / 2.0, var75, var73);
      double var79 = c8(this.u9().l6().l6() / 2.0, var75, var73);
      double var81 = k5(this.u9().l6().n5() / 2.0, var77, 0.0);
      double var83 = k5(this.u9().l6().l6() / 2.0, var79, 0.0);
      d1 var85 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var85.k5();
      var85.l6(var57, var59);
      var85.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, var41, var45);
      var85.k5();
      var85.l6(0.0, this.u9().l6().l6() / 2.0);
      var85.n5(this.u9().l6().n5(), this.u9().l6().l6() / 2.0);
      var85.k5();
      var85.l6(var69, var71);
      var85.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, var43, var47);
      return var85;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 1.08E7);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
