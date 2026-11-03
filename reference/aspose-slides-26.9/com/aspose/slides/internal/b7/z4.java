package com.aspose.slides.internal.b7;

public class z4 extends x2 {
   public z4(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 50000.0);
      double var3 = n5(0.0, this.l6().n5("adj2"), 50000.0);
      double var5 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 100000.0);
      double var7 = k5(this.u9().l6().n5(), 0.0, var5);
      double var9 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var11 = k5(this.u9().l6().n5(), 0.0, var9);
      double var13 = k5(this.u9().l6().l6(), 0.0, var9);
      double var15 = k5(var5, 0.0, var9);
      double var17 = a6(var15, var5, var9);
      double var19 = l6(var17, 1.0, 2.0);
      double var21 = k5(this.u9().l6().n5(), 0.0, var19);
      double var23 = l6(var5, 1.0, 2.0);
      double var25 = u3(var13, this.u9().l6().l6(), 2.0);
      c2 var27 = new c2(this.u9());
      var27.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var27.a6(var5, 0.0);
      var27.u9(var7, 0.0);
      var27.u9(this.u9().l6().n5(), var5);
      var27.u9(this.u9().l6().n5(), var13);
      var27.u9(var11, this.u9().l6().l6());
      var27.u9(var9, this.u9().l6().l6());
      var27.u9(0.0, var13);
      var27.u9(0.0, var5);
      var27.a6();
      var27.n5(new m8(var19, var23, var21, var25));
      return var27;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 16667.0);
      var1.l6("adj2", 0.0);
   }
}
