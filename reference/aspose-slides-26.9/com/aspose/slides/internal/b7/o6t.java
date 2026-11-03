package com.aspose.slides.internal.b7;

public class o6t extends x2 {
   public o6t(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(50000.0, this.u9().l6().n5(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj2"), var1);
      double var5 = l6(var3, 2.0, 1.0);
      double var7 = n5(0.0, this.l6().n5("adj1"), var5);
      double var9 = l6(50000.0, this.u9().l6().l6(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var11 = n5(0.0, this.l6().n5("adj3"), var9);
      double var13 = l6(var11, com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), this.u9().l6().l6() / 2.0);
      double var15 = k5(100000.0, 0.0, var13);
      double var17 = n5(0.0, this.l6().n5("adj4"), var15);
      double var19 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var21 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var7, 200000.0);
      double var23 = k5(this.u9().l6().n5() / 2.0, 0.0, var19);
      double var25 = k5(this.u9().l6().n5() / 2.0, 0.0, var21);
      double var27 = k5(this.u9().l6().n5() / 2.0, var21, 0.0);
      double var29 = k5(this.u9().l6().n5() / 2.0, var19, 0.0);
      double var31 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var11, 100000.0);
      double var33 = k5(this.u9().l6().l6(), 0.0, var31);
      double var35 = l6(this.u9().l6().l6(), var17, 200000.0);
      double var37 = k5(this.u9().l6().l6() / 2.0, 0.0, var35);
      double var39 = k5(this.u9().l6().l6() / 2.0, var35, 0.0);
      c2 var41 = new c2(this.u9());
      var41.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var41.a6(0.0, var37);
      var41.u9(var25, var37);
      var41.u9(var25, var31);
      var41.u9(var23, var31);
      var41.u9(this.u9().l6().n5() / 2.0, 0.0);
      var41.u9(var29, var31);
      var41.u9(var27, var31);
      var41.u9(var27, var37);
      var41.u9(this.u9().l6().n5(), var37);
      var41.u9(this.u9().l6().n5(), var39);
      var41.u9(var27, var39);
      var41.u9(var27, var33);
      var41.u9(var29, var33);
      var41.u9(this.u9().l6().n5() / 2.0, this.u9().l6().l6());
      var41.u9(var23, var33);
      var41.u9(var25, var33);
      var41.u9(var25, var39);
      var41.u9(0.0, var39);
      var41.a6();
      var41.n5(new m8(0.0, var37, this.u9().l6().n5(), var39));
      return var41;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 25000.0);
      var1.l6("adj2", 25000.0);
      var1.l6("adj3", 25000.0);
      var1.l6("adj4", 48123.0);
   }
}
