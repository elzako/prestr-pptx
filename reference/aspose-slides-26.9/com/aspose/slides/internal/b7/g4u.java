package com.aspose.slides.internal.b7;

public class g4u extends x2 {
   public g4u(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(50000.0, this.u9().l6().n5(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj"), var1);
      double var5 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 200000.0);
      double var7 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var9 = k5(this.u9().l6().n5(), 0.0, var7);
      double var11 = k5(this.u9().l6().n5(), 0.0, var5);
      double var13 = l6(this.u9().l6().n5() / 3.0, var3, var1);
      double var15 = l6(this.u9().l6().l6() / 3.0, var3, var1);
      double var17 = k5(this.u9().l6().n5(), 0.0, var13);
      c2 var19 = new c2(this.u9());
      var19.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var19.a6(0.0, this.u9().l6().l6());
      var19.u9(var7, 0.0);
      var19.u9(var9, 0.0);
      var19.u9(this.u9().l6().n5(), this.u9().l6().l6());
      var19.a6();
      var19.n5(new m8(var13, var15, var17, this.u9().l6().l6()));
      return var19;
   }

   @Override
   public j6 n5(float var1, float var2) {
      double var3 = l6(50000.0, var1, com.aspose.slides.ms.System.q1.l6(var2, var1));
      double var5 = n5(0.0, this.l6().n5("adj"), var3);
      double var7 = l6(var1 / 3.0F, var5, var3);
      double var9 = l6(var2 / 3.0F, var5, var3);
      return new j6(var1 + var7 * 2.0, var2 + var9);
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 25000.0);
   }
}
