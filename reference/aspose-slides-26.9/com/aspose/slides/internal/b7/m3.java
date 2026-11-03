package com.aspose.slides.internal.b7;

public class m3 extends j8m {
   @Override
   public int n5() {
      return 14;
   }

   @Override
   public n2z u3() {
      m3 var1 = new m3();
      var1.l6().n5("adj1", this.l6().n5("adj1"));
      var1.l6().n5("adj2", this.l6().n5("adj2"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 2.1599999E7);
      double var3 = k5(1.08E7, 0.0, var1);
      double var5 = k5(3.24E7, 0.0, var1);
      double var7 = k5(0.0, 0.0, var3);
      double var9 = a6(var7, var5, var3);
      double var11 = k5(5400000.0, 0.0, var1);
      double var13 = k5(1.62E7, 0.0, var1);
      double var15 = k5(var1, 0.0, var9);
      double var17 = k5(var15, 0.0, 2.16E7);
      double var19 = k5(0.0, 0.0, 1.08E7);
      double var21 = a6(var13, var15, var17);
      double var23 = a6(var3, var17, var21);
      double var25 = a6(var11, var15, var23);
      double var27 = a6(var9, var25, var19);
      double var29 = k5(this.u9().l6().n5() / 2.0, var9);
      double var31 = l6(this.u9().l6().l6() / 2.0, var9);
      double var33 = u9(this.u9().l6().n5() / 2.0, var31, var29);
      double var35 = c8(this.u9().l6().l6() / 2.0, var31, var29);
      double var37 = k5(this.u9().l6().n5() / 2.0, var33, 0.0);
      double var39 = k5(this.u9().l6().l6() / 2.0, var35, 0.0);
      double var41 = n5(0.0, this.l6().n5("adj2"), 99000.0);
      double var43 = l6(var41, 1.0, 100000.0);
      double var45 = l6(this.u9().l6().n5() / 2.0, var43, 1.0);
      double var47 = l6(this.u9().l6().l6() / 2.0, var43, 1.0);
      double var49 = k5(var45, var1);
      double var51 = l6(var47, var1);
      double var53 = u9(var45, var51, var49);
      double var55 = c8(var47, var51, var49);
      double var57 = k5(this.u9().l6().n5() / 2.0, var53, 0.0);
      double var59 = k5(this.u9().l6().l6() / 2.0, var55, 0.0);
      double var61 = k5(var45, var9);
      double var63 = l6(var47, var9);
      double var65 = u9(var45, var63, var61);
      double var67 = c8(var47, var63, var61);
      double var69 = k5(this.u9().l6().n5() / 2.0, var65, 0.0);
      double var71 = k5(this.u9().l6().l6() / 2.0, var67, 0.0);
      d1 var73 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var73.k5();
      var73.l6(var69, var71);
      var73.n5(var47, var45, var9, var27);
      var73.k5();
      var73.l6(var37, var39);
      var73.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, var9, var27);
      return var73;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 0.0);
      var1.l6("adj2", 25000.0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
