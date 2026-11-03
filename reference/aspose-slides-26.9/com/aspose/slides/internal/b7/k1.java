package com.aspose.slides.internal.b7;

public class k1 extends j8m {
   @Override
   public int n5() {
      return 25;
   }

   @Override
   public n2z u3() {
      k1 var1 = new k1();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(0.0, this.l6().n5("adj"), 20000.0);
      double var3 = l6(var1, this.u9().l6().l6(), 100000.0);
      double var5 = l6(var3, 1.0, 3.0);
      double var7 = k5(0.0, 0.0, var5);
      double var9 = k5(this.u9().l6().l6(), 0.0, var7);
      double var11 = k5(0.0, var3, 0.0);
      double var13 = k5(this.u9().l6().l6(), 0.0, var3);
      double var15 = k5(0.0, var7, 0.0);
      double var17 = k5(0.0, var9, 0.0);
      double var19 = k5(0.0, this.u9().l6().n5() / 3.0, 0.0);
      double var21 = k5(this.u9().l6().n5(), 0.0, this.u9().l6().n5() / 3.0);
      d1 var23 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var23.k5();
      var23.l6(0.0, var11);
      var23.n5(new k0(var19, var15), new k0(var21, var15), new k0(this.u9().l6().n5(), var11));
      var23.k5();
      var23.l6(0.0, var13);
      var23.n5(new k0(var19, var17), new k0(var21, var17), new k0(this.u9().l6().n5(), var13));
      return var23;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 18750.0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
