package com.aspose.slides.internal.b7;

public class a8 extends s4 {
   @Override
   public int n5() {
      return 31;
   }

   @Override
   public n2z u3() {
      a8 var1 = new a8();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = n5(5000.0, this.l6().n5("adj"), 95000.0);
      double var3 = l6(var1, this.u9().l6().l6(), 100000.0);
      double var5 = l6(this.u9().l6().l6(), 5.0, 100.0);
      double var7 = l6(this.u9().l6().l6(), 45.0, 100.0);
      double var9 = l6(this.u9().l6().l6(), 55.0, 100.0);
      double var11 = k5(var3, 0.0, var5);
      double var13 = k5(var3, var5, 0.0);
      double var15 = k5(var11, var11, var7);
      double var17 = k5(var13, var13, var9);
      d1 var19 = new d1(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var19.k5();
      var19.l6(0.0, 0.0);
      var19.n5(this.u9().l6().n5(), 0.0);
      var19.k5();
      var19.l6(0.0, var7);
      var19.n5(new k0(this.u9().l6().n5() / 2.0, var15), new k0(this.u9().l6().n5(), var7));
      var19.k5();
      var19.l6(0.0, var9);
      var19.n5(new k0(this.u9().l6().n5() / 2.0, var17), new k0(this.u9().l6().n5(), var9));
      var19.k5();
      var19.l6(0.0, this.u9().l6().l6());
      var19.n5(this.u9().l6().n5(), this.u9().l6().l6());
      return var19;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 35000.0);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
