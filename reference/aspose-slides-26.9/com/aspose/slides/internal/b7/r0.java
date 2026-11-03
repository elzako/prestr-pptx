package com.aspose.slides.internal.b7;

public class r0 extends x2 {
   public r0(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(50000.0, this.u9().l6().n5(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj"), var1);
      double var5 = l6(this.u9().l6().l6() / 2.0, this.l6().n5("vf"), 100000.0);
      double var7 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var9 = k5(this.u9().l6().n5(), 0.0, var7);
      double var11 = k5(var5, 3600000.0);
      double var13 = k5(this.u9().l6().l6() / 2.0, 0.0, var11);
      double var15 = k5(this.u9().l6().l6() / 2.0, var11, 0.0);
      double var17 = l6(var1, -1.0, 2.0);
      double var19 = k5(var3, var17, 0.0);
      double var21 = a6(var19, 4.0, 2.0);
      double var23 = a6(var19, 3.0, 2.0);
      double var25 = a6(var19, var17, 0.0);
      double var27 = u3(var3, var25, var17);
      double var29 = l6(var27, var23, -1.0);
      double var31 = k5(var21, var29, 0.0);
      double var33 = l6(this.u9().l6().n5(), var31, 24.0);
      double var35 = l6(this.u9().l6().l6(), var31, 24.0);
      double var37 = k5(this.u9().l6().n5(), 0.0, var33);
      double var39 = k5(this.u9().l6().l6(), 0.0, var35);
      c2 var41 = new c2(this.u9());
      var41.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var41.a6(0.0, this.u9().l6().l6() / 2.0);
      var41.u9(var7, var13);
      var41.u9(var9, var13);
      var41.u9(this.u9().l6().n5(), this.u9().l6().l6() / 2.0);
      var41.u9(var9, var15);
      var41.u9(var7, var15);
      var41.a6();
      var41.n5(new m8(var33, var35, var37, var39));
      return var41;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 25000.0);
      var1.l6("vf", 115470.0);
   }
}
