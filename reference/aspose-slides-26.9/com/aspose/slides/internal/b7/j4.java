package com.aspose.slides.internal.b7;

public class j4 extends j8m {
   @Override
   public int n5() {
      return 15;
   }

   @Override
   public n2z u3() {
      j4 var1 = new j4();
      var1.l6().n5("adj1", this.l6().n5("adj1"));
      var1.l6().n5("adj2", this.l6().n5("adj2"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 2.1599999E7);
      double var3 = k5(var1, 0.0, 1.08E7);
      double var5 = k5(1.08E7, 0.0, var1);
      double var7 = k5(2.16E7, 0.0, var1);
      double var9 = a6(var5, var5, 1.0799999E7);
      double var11 = a6(var3, var7, var9);
      double var13 = l6(var11, 2.0, 1.0);
      double var15 = k5(this.u9().l6().n5() / 2.0, var1);
      double var17 = l6(this.u9().l6().l6() / 2.0, var1);
      double var19 = u9(this.u9().l6().n5() / 2.0, var17, var15);
      double var21 = c8(this.u9().l6().l6() / 2.0, var17, var15);
      double var23 = k5(this.u9().l6().n5() / 2.0, var19, 0.0);
      double var25 = k5(this.u9().l6().l6() / 2.0, var21, 0.0);
      double var27 = n5(0.0, this.l6().n5("adj2"), 99000.0);
      double var29 = l6(var27, 1.0, 100000.0);
      double var31 = l6(this.u9().l6().n5() / 2.0, var29, 1.0);
      double var33 = l6(this.u9().l6().l6() / 2.0, var29, 1.0);
      double var35 = k5(var31, var1);
      double var37 = l6(var33, var1);
      double var39 = u9(var31, var37, var35);
      double var41 = c8(var33, var37, var35);
      double var43 = k5(this.u9().l6().n5() / 2.0, var39, 0.0);
      double var45 = k5(this.u9().l6().l6() / 2.0, var41, 0.0);
      d1 var47 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var47.k5();
      var47.l6(var23, var25);
      var47.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, var1, var13);
      var47.k5();
      var47.l6(var43, var45);
      var47.n5(var33, var31, var1, var13);
      return var47;
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
