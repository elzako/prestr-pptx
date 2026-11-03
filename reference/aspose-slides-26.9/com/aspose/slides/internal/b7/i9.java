package com.aspose.slides.internal.b7;

public class i9 extends f7 {
   @Override
   public int n5() {
      return 11;
   }

   @Override
   public n2z u3() {
      i9 var1 = new i9();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(0.0, this.l6().n5("adj"), 2.1599999E7);
      double var3 = k5(var1, 0.0, 1.08E7);
      double var5 = k5(1.08E7, 0.0, var1);
      double var7 = k5(2.16E7, 0.0, var1);
      double var9 = a6(var5, var5, 1.0799999E7);
      double var11 = a6(var3, var7, var9);
      double var13 = l6(var11, 2.0, 1.0);
      double var15 = k5(this.u9().l6().n5() / 2.0, this.l6().n5("adj"));
      double var17 = l6(this.u9().l6().l6() / 2.0, this.l6().n5("adj"));
      double var19 = u9(this.u9().l6().n5() / 2.0, var17, var15);
      double var21 = c8(this.u9().l6().l6() / 2.0, var17, var15);
      double var23 = k5(this.u9().l6().n5() / 2.0, var19, 0.0);
      double var25 = k5(this.u9().l6().l6() / 2.0, var21, 0.0);
      d1 var27 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var27.k5();
      var27.l6(var23, var25);
      var27.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, var1, var13);
      return var27;
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
