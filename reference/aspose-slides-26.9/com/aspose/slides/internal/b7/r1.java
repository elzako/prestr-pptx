package com.aspose.slides.internal.b7;

public class r1 extends j8m {
   @Override
   public int n5() {
      return 17;
   }

   @Override
   public n2z u3() {
      r1 var1 = new r1();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(0.0, this.l6().n5("adj"), 56338.0);
      double var3 = l6(var1, this.u9().l6().l6(), 100000.0);
      double var5 = l6(var3, 3.0, 4.0);
      double var7 = l6(var3, 5.0, 4.0);
      double var9 = l6(var3, 3.0, 8.0);
      double var11 = l6(var3, 1.0, 8.0);
      double var13 = k5(this.u9().l6().l6(), 0.0, var9);
      double var15 = k5(var11, this.u9().l6().l6(), 0.0);
      double var17 = k5(0.0, var3, 0.0);
      double var19 = k5(0.0, var5, 0.0);
      double var21 = k5(0.0, var7, 0.0);
      double var23 = k5(0.0, var9, 0.0);
      double var25 = k5(0.0, var11, 0.0);
      double var27 = k5(0.0, var13, 0.0);
      double var29 = k5(0.0, var15, 0.0);
      double var31 = k5(0.0, this.u9().l6().n5() / 3.0, 0.0);
      double var33 = k5(this.u9().l6().n5(), 0.0, this.u9().l6().n5() / 3.0);
      d1 var35 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var35.k5();
      var35.l6(0.0, var17);
      var35.n5(new k0(var31, var21), new k0(var33, var19), new k0(this.u9().l6().n5(), 0.0));
      var35.k5();
      var35.l6(0.0, var27);
      var35.n5(new k0(var31, var29), new k0(var33, var29), new k0(this.u9().l6().n5(), var27));
      return var35;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 45977.0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
