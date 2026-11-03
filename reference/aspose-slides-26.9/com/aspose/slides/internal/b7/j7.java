package com.aspose.slides.internal.b7;

public class j7 extends j8m {
   @Override
   public int n5() {
      return 1;
   }

   @Override
   public n2z u3() {
      j7 var1 = new j7();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(30000.0, this.l6().n5("adj"), 70000.0);
      double var3 = l6(var1, this.u9().l6().n5(), 100000.0);
      double var5 = k5(var3, 0.0, this.u9().l6().n5() / 2.0);
      double var7 = k5(var3, 0.0, 0.0);
      double var9 = k5(this.u9().l6().n5(), 0.0, var3);
      double var11 = l6(var7, 2.0, 1.0);
      double var13 = l6(var9, 2.0, 1.0);
      double var15 = a6(var5, var13, var11);
      double var17 = k5(0.0, var15, 0.0);
      double var19 = k5(this.u9().l6().n5(), 0.0, var15);
      double var21 = a6(var5, 0.0, var19);
      double var23 = a6(var5, var17, this.u9().l6().n5());
      double var25 = a6(var5, var19, 0.0);
      double var27 = a6(var5, this.u9().l6().n5(), var17);
      d1 var29 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var29.k5();
      var29.l6(var21, 0.0);
      var29.n5(var23, 0.0);
      var29.k5();
      var29.l6(var25, this.u9().l6().l6());
      var29.n5(var27, this.u9().l6().l6());
      return var29;
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
