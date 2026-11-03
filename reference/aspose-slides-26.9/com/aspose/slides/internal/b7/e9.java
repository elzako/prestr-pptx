package com.aspose.slides.internal.b7;

public class e9 extends j8m {
   @Override
   public int n5() {
      return 39;
   }

   @Override
   public n2z u3() {
      e9 var1 = new e9();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(28570.0, this.l6().n5("adj"), 100000.0);
      double var3 = l6(var1, this.u9().l6().l6(), 100000.0);
      double var5 = k5(0.0, var3, 0.0);
      double var7 = k5(this.u9().l6().l6(), 0.0, var3);
      double var9 = l6(var7, 1.0, 4.0);
      double var11 = k5(0.0, var9, 0.0);
      d1 var13 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var13.k5();
      var13.l6(0.0, var11);
      var13.n5(this.u9().l6().n5(), 0.0);
      var13.k5();
      var13.l6(0.0, this.u9().l6().l6());
      var13.n5(this.u9().l6().n5(), var5);
      return var13;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 44444.0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
