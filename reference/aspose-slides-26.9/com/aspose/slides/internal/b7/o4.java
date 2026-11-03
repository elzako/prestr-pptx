package com.aspose.slides.internal.b7;

public class o4 extends j8m {
   @Override
   public int n5() {
      return 27;
   }

   @Override
   public n2z u3() {
      o4 var1 = new o4();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(60000.0, this.l6().n5("adj"), 100000.0);
      double var3 = l6(var1, this.u9().l6().l6(), 100000.0);
      double var5 = k5(0.0, var3, 0.0);
      d1 var7 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var7.k5();
      var7.l6(0.0, 0.0);
      var7.n5(this.u9().l6().n5(), 0.0);
      var7.k5();
      var7.l6(0.0, var5);
      var7.n5(new k0(this.u9().l6().n5() / 2.0, this.u9().l6().l6()), new k0(this.u9().l6().n5(), var5));
      return var7;
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
