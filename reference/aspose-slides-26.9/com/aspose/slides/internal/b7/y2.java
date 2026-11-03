package com.aspose.slides.internal.b7;

public class y2 extends x2 {
   public y2(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj2"), 50000.0);
      double var3 = l6(var1, 2.0, 1.0);
      double var5 = n5(0.0, this.l6().n5("adj1"), var3);
      double var7 = n5(0.0, this.l6().n5("adj3"), 50000.0);
      double var9 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var5, 100000.0);
      double var11 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 100000.0);
      double var13 = l6(var9, 1.0, 2.0);
      double var15 = k5(var11, 0.0, var13);
      double var17 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var7, 100000.0);
      double var19 = k5(this.u9().l6().n5(), 0.0, var17);
      double var21 = k5(this.u9().l6().l6(), 0.0, var15);
      double var23 = com.aspose.slides.ms.System.q1.k5(var19, var21);
      double var25 = l6(100000.0, var23, com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var27 = n5(0.0, this.l6().n5("adj4"), var25);
      double var29 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var27, 100000.0);
      double var31 = k5(var29, 0.0, var9);
      double var33 = com.aspose.slides.ms.System.q1.l6(var31, 0.0);
      double var35 = k5(var9, var33, 0.0);
      double var37 = k5(this.u9().l6().n5(), 0.0, var17);
      double var39 = k5(var15, var9, 0.0);
      double var41 = k5(var39, var15, 0.0);
      double var43 = k5(var15, var29, 0.0);
      double var45 = k5(var39, var33, 0.0);
      c2 var47 = new c2(this.u9());
      var47.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var47.a6(0.0, this.u9().l6().l6());
      var47.u9(0.0, var43);
      var47.n5(var29, var29, 1.08E7, 5400000.0);
      var47.u9(var37, var15);
      var47.u9(var37, 0.0);
      var47.u9(this.u9().l6().n5(), var11);
      var47.u9(var37, var41);
      var47.u9(var37, var39);
      var47.u9(var35, var39);
      var47.n5(var33, var33, 1.62E7, -5400000.0);
      var47.u9(var9, this.u9().l6().l6());
      var47.a6();
      var47.n5(new m8(0.0, 0.0, this.u9().l6().n5(), this.u9().l6().l6()));
      return var47;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 25000.0);
      var1.l6("adj2", 25000.0);
      var1.l6("adj3", 25000.0);
      var1.l6("adj4", 43750.0);
   }
}
