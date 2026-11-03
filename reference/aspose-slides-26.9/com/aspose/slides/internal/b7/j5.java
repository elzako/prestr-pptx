package com.aspose.slides.internal.b7;

public class j5 extends j8m {
   @Override
   public int n5() {
      return 13;
   }

   @Override
   public n2z u3() {
      j5 var1 = new j5();
      var1.l6().n5("adj1", this.l6().n5("adj1"));
      var1.l6().n5("adj2", this.l6().n5("adj2"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 2.1599999E7);
      double var3 = k5(1.08E7, 0.0, var1);
      double var5 = k5(3.24E7, 0.0, var1);
      double var7 = a6(var3, var3, var5);
      double var9 = k5(5400000.0, 0.0, var1);
      double var11 = k5(1.62E7, 0.0, var1);
      double var13 = k5(var7, 0.0, var1);
      double var15 = k5(2.16E7, var13, 0.0);
      double var17 = a6(var11, var13, var15);
      double var19 = a6(var3, var15, var17);
      double var21 = a6(var9, var13, var19);
      double var23 = k5(this.u9().l6().n5() / 2.0, var1);
      double var25 = l6(this.u9().l6().l6() / 2.0, var1);
      double var27 = u9(this.u9().l6().n5() / 2.0, var25, var23);
      double var29 = c8(this.u9().l6().l6() / 2.0, var25, var23);
      double var31 = k5(this.u9().l6().n5() / 2.0, var27, 0.0);
      double var33 = k5(this.u9().l6().l6() / 2.0, var29, 0.0);
      double var35 = n5(0.0, this.l6().n5("adj2"), 99000.0);
      double var37 = l6(var35, 1.0, 100000.0);
      double var39 = l6(this.u9().l6().n5() / 2.0, var37, 1.0);
      double var41 = l6(this.u9().l6().l6() / 2.0, var37, 1.0);
      double var43 = k5(var39, var1);
      double var45 = l6(var41, var1);
      double var47 = u9(var39, var45, var43);
      double var49 = c8(var41, var45, var43);
      double var51 = k5(this.u9().l6().n5() / 2.0, var47, 0.0);
      double var53 = k5(this.u9().l6().l6() / 2.0, var49, 0.0);
      d1 var55 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var55.k5();
      var55.l6(var31, var33);
      var55.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, var1, var21);
      var55.k5();
      var55.l6(var51, var53);
      var55.n5(var41, var39, var1, var21);
      return var55;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 1.08E7);
      var1.l6("adj2", 50000.0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
