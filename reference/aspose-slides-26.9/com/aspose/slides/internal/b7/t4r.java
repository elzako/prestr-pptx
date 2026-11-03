package com.aspose.slides.internal.b7;

public class t4r extends j8m {
   @Override
   public int n5() {
      return 2;
   }

   @Override
   public n2z u3() {
      t4r var1 = new t4r();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(14286.0, this.l6().n5("adj"), 50000.0);
      double var3 = l6(this.u9().l6().n5(), 1.0, 3.0);
      double var5 = l6(var1, this.u9().l6().l6(), 100000.0);
      double var7 = k5(0.0, var3, 0.0);
      double var9 = k5(this.u9().l6().n5(), 0.0, var3);
      double var11 = k5(0.0, var5, 0.0);
      double var13 = k5(this.u9().l6().l6(), 0.0, var5);
      d1 var15 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var15.k5();
      var15.l6(0.0, var11);
      var15.n5(var7, 0.0);
      var15.n5(var9, 0.0);
      var15.n5(this.u9().l6().n5(), var11);
      var15.k5();
      var15.l6(0.0, var13);
      var15.n5(var7, this.u9().l6().l6());
      var15.n5(var9, this.u9().l6().l6());
      var15.n5(this.u9().l6().n5(), var13);
      return var15;
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
