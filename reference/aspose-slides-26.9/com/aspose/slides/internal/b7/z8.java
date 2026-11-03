package com.aspose.slides.internal.b7;

public class z8 extends f7 {
   @Override
   public int n5() {
      return 10;
   }

   @Override
   public n2z u3() {
      z8 var1 = new z8();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = com.aspose.slides.ms.System.q1.l6(this.u9().l6().n5(), this.u9().l6().l6());
      double var3 = com.aspose.slides.ms.System.q1.k5(this.u9().l6().n5(), this.u9().l6().l6());
      double var5 = this.l6().n5("adj");
      double var7 = n5(0.0, var5, 2.1599999E7);
      double var9 = k5(1.08E7, 0.0, var7);
      double var11 = k5(3.24E7, 0.0, var7);
      double var13 = k5(0.0, 0.0, var9);
      double var15 = a6(var13, var11, var9);
      double var17 = k5(5400000.0, 0.0, var7);
      double var19 = k5(1.62E7, 0.0, var7);
      double var21 = k5(var7, 0.0, var15);
      double var23 = k5(var21, 0.0, 2.16E7);
      double var25 = k5(0.0, 0.0, 1.08E7);
      double var27 = a6(var19, var21, var23);
      double var29 = a6(var9, var23, var27);
      double var31 = a6(var17, var21, var29);
      double var33 = a6(var15, var31, var25);
      double var35 = k5(var1 / 2.0, var5);
      double var37 = l6(var1 / 2.0, var5);
      double var39 = u9(var1 / 2.0, var37, var35);
      double var41 = c8(var1 / 2.0, var37, var35);
      double var43 = k5(var1 / 2.0, var39, 0.0);
      double var45 = k5(var1 / 2.0, var41, 0.0);
      double var47 = k5(var1 / 2.0, var15);
      double var49 = l6(var1 / 2.0, var15);
      double var51 = u9(var1 / 2.0, var49, var47);
      double var53 = c8(var1 / 2.0, var49, var47);
      double var55 = k5(var1 / 2.0, var51, 0.0);
      double var57 = k5(var1 / 2.0, var53, 0.0);
      d1 var59 = new d1(var1, var1, 0, false, true);
      var59.k5();
      var59.l6(var55, var57);
      var59.n5(var1 / 2.0, var1 / 2.0, var15, var33);
      if (this.u9().l6().l6() > this.u9().l6().n5()) {
         var59.n5(var3 / var1);
      } else {
         var59.l6(var3 / var1);
      }

      return var59;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 0.0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
