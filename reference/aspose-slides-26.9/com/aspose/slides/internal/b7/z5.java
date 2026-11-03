package com.aspose.slides.internal.b7;

public class z5 extends j8m {
   @Override
   public int n5() {
      return 28;
   }

   @Override
   public n2z u3() {
      z5 var1 = new z5();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(6250.0, this.l6().n5("adj"), 100000.0);
      double var3 = l6(var1, com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), 100000.0);
      double var5 = k5(this.u9().l6().l6(), 0.0, var3);
      double var7 = k5(0.0, var3, 0.0);
      double var9 = k5(var7, 0.0, var5);
      d1 var11 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var11.k5();
      var11.l6(0.0, 0.0);
      var11.n5(this.u9().l6().n5(), 0.0);
      var11.k5();
      var11.l6(0.0, this.u9().l6().l6());
      var11.n5(new k0(this.u9().l6().n5() / 2.0, var9), new k0(this.u9().l6().n5(), this.u9().l6().l6()));
      return var11;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 50000.0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
