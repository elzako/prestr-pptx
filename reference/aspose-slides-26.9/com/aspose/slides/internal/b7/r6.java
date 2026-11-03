package com.aspose.slides.internal.b7;

public class r6 extends j8m {
   @Override
   public int n5() {
      return 36;
   }

   @Override
   public n2z u3() {
      r6 var1 = new r6();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(0.0, this.l6().n5("adj"), 49999.0);
      double var3 = l6(var1, this.u9().l6().n5(), 100000.0);
      double var5 = k5(0.0, var3, 0.0);
      double var7 = k5(this.u9().l6().n5(), 0.0, var3);
      d1 var9 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var9.k5();
      var9.l6(0.0, 0.0);
      var9.n5(this.u9().l6().n5(), 0.0);
      var9.k5();
      var9.l6(var5, this.u9().l6().l6());
      var9.n5(var7, this.u9().l6().l6());
      return var9;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 33333.0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
