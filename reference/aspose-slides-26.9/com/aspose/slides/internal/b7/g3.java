package com.aspose.slides.internal.b7;

public class g3 extends j8m {
   @Override
   public int n5() {
      return 7;
   }

   @Override
   public n2z u3() {
      g3 var1 = new g3();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(50000.0, this.l6().n5("adj"), 99000.0);
      double var3 = l6(var1, this.u9().l6().l6(), 100000.0);
      double var5 = k5(0.0, var3, 0.0);
      double var7 = l6(var3, 1.0, 2.0);
      double var9 = k5(0.0, var7, 0.0);
      double var11 = k5(this.u9().l6().l6(), 0.0, var7);
      d1 var13 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var13.k5();
      var13.l6(0.0, var9);
      var13.n5(var7, this.u9().l6().n5() / 2.0, 1.08E7, 2.1599999E7);
      var13.k5();
      var13.l6(0.0, var11);
      var13.n5(var7, this.u9().l6().n5() / 2.0, 1.08E7, 2.1599999E7);
      return var13;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 60000.0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
