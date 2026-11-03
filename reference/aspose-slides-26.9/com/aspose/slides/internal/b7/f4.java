package com.aspose.slides.internal.b7;

public class f4 extends j8m {
   @Override
   public int n5() {
      return 26;
   }

   @Override
   public n2z u3() {
      f4 var1 = new f4();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(0.0, this.l6().n5("adj"), 37500.0);
      double var3 = l6(var1, com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), 100000.0);
      double var5 = l6(var3, 4.0, 3.0);
      double var7 = k5(this.u9().l6().l6(), 0.0, var5);
      double var9 = k5(0.0, var3, 0.0);
      double var11 = k5(0.0, var5, 0.0);
      double var13 = k5(0.0, var7, 0.0);
      double var15 = k5(0.0, this.u9().l6().n5() / 3.0, 0.0);
      double var17 = k5(this.u9().l6().n5(), 0.0, this.u9().l6().n5() / 3.0);
      d1 var19 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var19.k5();
      var19.l6(0.0, 0.0);
      var19.n5(new k0(var15, var11), new k0(var17, var11), new k0(this.u9().l6().n5(), 0.0));
      var19.k5();
      var19.l6(0.0, this.u9().l6().l6());
      var19.n5(new k0(var15, var13), new k0(var17, var13), new k0(this.u9().l6().n5(), this.u9().l6().l6()));
      return var19;
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
