package com.aspose.slides.internal.b7;

public class a9 extends x2 {
   public a9(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(100000.0, this.u9().l6().n5(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj"), var1);
      double var5 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 200000.0);
      double var7 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var9 = k5(this.u9().l6().n5(), 0.0, var5);
      double var11 = k5(this.u9().l6().n5(), 0.0, var7);
      double var13 = l6(var11, 1.0, 2.0);
      double var15 = k5(this.u9().l6().n5(), 0.0, var13);
      double var17 = l6(this.u9().l6().n5() / 2.0, var3, var1);
      double var19 = l6(5.0, var3, var1);
      double var21 = u3(1.0, var19, 12.0);
      var17 = l6(var21, this.u9().l6().n5(), 1.0);
      double var23 = l6(var21, this.u9().l6().l6(), 1.0);
      double var25 = k5(this.u9().l6().n5(), 0.0, var17);
      double var27 = k5(this.u9().l6().l6(), 0.0, var23);
      double var29 = l6(this.u9().l6().l6(), this.u9().l6().n5() / 2.0, var7);
      double var31 = n5(0.0, var29, this.u9().l6().l6());
      double var33 = k5(this.u9().l6().l6(), 0.0, var31);
      c2 var35 = new c2(this.u9());
      var35.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var35.a6(0.0, this.u9().l6().l6());
      var35.u9(var7, 0.0);
      var35.u9(this.u9().l6().n5(), 0.0);
      var35.u9(var11, this.u9().l6().l6());
      var35.a6();
      var35.n5(new m8(var17, var23, var25, var27));
      return var35;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 25000.0);
   }
}
