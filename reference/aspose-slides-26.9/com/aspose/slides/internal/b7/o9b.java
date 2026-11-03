package com.aspose.slides.internal.b7;

public class o9b extends x2 {
   public o9b(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj"), 200000.0);
      double var3 = com.aspose.slides.ms.System.q1.z3(2.0);
      double var5 = l6(this.u9().l6().n5() / 2.0, var3, 1.0);
      double var7 = l6(this.u9().l6().l6() / 2.0, var3, 1.0);
      double var9 = l6(var5, var1, 100000.0);
      double var11 = l6(var7, var1, 100000.0);
      double var13 = l6(var9, 2700000.0);
      double var15 = k5(var11, 2700000.0);
      double var17 = k5(this.u9().l6().n5() / 2.0, var13, 0.0);
      double var19 = k5(this.u9().l6().l6() / 2.0, 0.0, var15);
      double var21 = u3(this.u9().l6().n5() / 2.0, var17, 2.0);
      double var23 = u3(this.u9().l6().l6() / 2.0, var19, 2.0);
      double var25 = l6(this.u9().l6().n5() / 2.0, 2700000.0);
      double var27 = k5(this.u9().l6().l6() / 2.0, 2700000.0);
      double var29 = k5(this.u9().l6().n5() / 2.0, 0.0, var25);
      double var31 = k5(this.u9().l6().n5() / 2.0, var25, 0.0);
      double var33 = k5(this.u9().l6().l6() / 2.0, 0.0, var27);
      double var35 = k5(this.u9().l6().l6() / 2.0, var27, 0.0);
      c2 var37 = new c2(this.u9());
      var37.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var37.a6(0.0, this.u9().l6().l6() / 2.0);
      var37.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 1.08E7, 5400000.0);
      var37.n5(new k0(var21, 0.0), new k0(var17, var19));
      var37.n5(new k0(this.u9().l6().n5(), var23), new k0(this.u9().l6().n5(), this.u9().l6().l6() / 2.0));
      var37.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 0.0, 5400000.0);
      var37.n5(this.u9().l6().l6() / 2.0, this.u9().l6().n5() / 2.0, 5400000.0, 5400000.0);
      var37.a6();
      var37.n5(new m8(var29, var33, var31, var35));
      return var37;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 100000.0);
   }
}
