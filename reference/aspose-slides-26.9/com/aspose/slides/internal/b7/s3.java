package com.aspose.slides.internal.b7;

public class s3 extends x2 {
   public s3(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 50000.0);
      double var3 = n5(0.0, this.l6().n5("adj2"), 50000.0);
      double var5 = n5(0.0, this.l6().n5("adj3"), 50000.0);
      double var7 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var5, 100000.0);
      double var9 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 50000.0);
      double var11 = k5(this.u9().l6().n5(), 0.0, var9);
      double var13 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var15 = k5(this.u9().l6().n5(), 0.0, var13);
      double var17 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 200000.0);
      double var19 = k5(var15, 0.0, var17);
      double var21 = k5(var15, var17, 0.0);
      double var23 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 100000.0);
      double var25 = k5(this.u9().l6().l6(), 0.0, var23);
      double var27 = l6(var21, 1.0, 2.0);
      double var29 = u3(var25, this.u9().l6().l6(), 2.0);
      double var31 = u3(var7, this.u9().l6().l6(), 2.0);
      c2 var33 = new c2(this.u9());
      var33.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var33.a6(0.0, var25);
      var33.u9(var19, var25);
      var33.u9(var19, var7);
      var33.u9(var11, var7);
      var33.u9(var15, 0.0);
      var33.u9(this.u9().l6().n5(), var7);
      var33.u9(var21, var7);
      var33.u9(var21, this.u9().l6().l6());
      var33.u9(0.0, this.u9().l6().l6());
      var33.a6();
      var33.n5(new m8(0.0, var25, var21, this.u9().l6().l6()));
      return var33;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 25000.0);
      var1.l6("adj2", 25000.0);
      var1.l6("adj3", 25000.0);
   }
}
