package com.aspose.slides.internal.b7;

public class h5 extends s4 {
   @Override
   public int n5() {
      return 32;
   }

   @Override
   public n2z u3() {
      h5 var1 = new h5();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(3000.0, this.l6().n5("adj"), 47000.0);
      double var3 = l6(var1, this.u9().l6().l6(), 100000.0);
      double var5 = l6(this.u9().l6().l6(), 3.0, 100.0);
      double var7 = l6(this.u9().l6().l6(), 30.0, 100.0);
      double var9 = l6(this.u9().l6().l6(), 36.0, 100.0);
      double var11 = l6(this.u9().l6().l6(), 63.0, 100.0);
      double var13 = l6(this.u9().l6().l6(), 70.0, 100.0);
      double var15 = k5(this.u9().l6().l6(), 0.0, var3);
      double var17 = k5(var3, 0.0, var5);
      double var19 = k5(var3, var5, 0.0);
      double var21 = k5(var15, 0.0, var5);
      double var23 = k5(var15, var5, 0.0);
      double var25 = k5(var17, var17, var7);
      double var27 = k5(var19, var19, var9);
      double var29 = k5(var21, var21, var11);
      double var31 = k5(var23, var23, var13);
      d1 var33 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var33.k5();
      var33.l6(0.0, 0.0);
      var33.n5(this.u9().l6().n5(), 0.0);
      var33.k5();
      var33.l6(0.0, var7);
      var33.n5(new k0(this.u9().l6().n5() / 2.0, var25), new k0(this.u9().l6().n5(), var7));
      var33.k5();
      var33.l6(0.0, var9);
      var33.n5(new k0(this.u9().l6().n5() / 2.0, var27), new k0(this.u9().l6().n5(), var9));
      var33.k5();
      var33.l6(0.0, var11);
      var33.n5(new k0(this.u9().l6().n5() / 2.0, var29), new k0(this.u9().l6().n5(), var11));
      var33.k5();
      var33.l6(0.0, var13);
      var33.n5(new k0(this.u9().l6().n5() / 2.0, var31), new k0(this.u9().l6().n5(), var13));
      var33.k5();
      var33.l6(0.0, this.u9().l6().l6());
      var33.n5(this.u9().l6().n5(), this.u9().l6().l6());
      return var33;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 25000.0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
