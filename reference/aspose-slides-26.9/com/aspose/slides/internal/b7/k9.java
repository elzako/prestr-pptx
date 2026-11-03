package com.aspose.slides.internal.b7;

public class k9 extends x2 {
   public k9(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(this.u9().l6().n5() / 2.0, this.l6().n5("hf"), 100000.0);
      double var3 = l6(this.u9().l6().l6() / 2.0, this.l6().n5("vf"), 100000.0);
      double var5 = l6(this.u9().l6().l6() / 2.0, this.l6().n5("vf"), 100000.0);
      double var7 = l6(var1, 1080000.0);
      double var9 = l6(var1, 1.836E7);
      double var11 = k5(var3, 1080000.0);
      double var13 = k5(var3, 1.836E7);
      double var15 = k5(this.u9().l6().n5() / 2.0, 0.0, var7);
      double var17 = k5(this.u9().l6().n5() / 2.0, 0.0, var9);
      double var19 = k5(this.u9().l6().n5() / 2.0, var9, 0.0);
      double var21 = k5(this.u9().l6().n5() / 2.0, var7, 0.0);
      double var23 = k5(var5, 0.0, var11);
      double var25 = k5(var5, 0.0, var13);
      double var27 = l6(var23, var9, var7);
      c2 var29 = new c2(this.u9());
      var29.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var29.a6(var15, var23);
      var29.u9(this.u9().l6().n5() / 2.0, 0.0);
      var29.u9(var21, var23);
      var29.u9(var19, var25);
      var29.u9(var17, var25);
      var29.a6();
      var29.n5(new m8(var17, var27, var19, var25));
      return var29;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("hf", 105146.0);
      var1.l6("vf", 110557.0);
   }
}
