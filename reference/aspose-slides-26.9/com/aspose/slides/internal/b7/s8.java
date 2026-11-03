package com.aspose.slides.internal.b7;

public class s8 extends x2 {
   public s8(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(50000.0, this.u9().l6().l6(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj2"), var1);
      double var5 = l6(var3, 2.0, 1.0);
      double var7 = n5(0.0, this.l6().n5("adj1"), var5);
      double var9 = l6(100000.0, this.u9().l6().n5(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var11 = n5(0.0, this.l6().n5("adj3"), var9);
      double var13 = l6(var11, com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), this.u9().l6().n5());
      double var15 = k5(100000.0, 0.0, var13);
      double var17 = n5(0.0, this.l6().n5("adj4"), var15);
      double var19 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var21 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var7, 200000.0);
      double var23 = k5(this.u9().l6().l6() / 2.0, 0.0, var19);
      double var25 = k5(this.u9().l6().l6() / 2.0, 0.0, var21);
      double var27 = k5(this.u9().l6().l6() / 2.0, var21, 0.0);
      double var29 = k5(this.u9().l6().l6() / 2.0, var19, 0.0);
      double var31 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var11, 100000.0);
      double var33 = l6(this.u9().l6().n5(), var17, 100000.0);
      double var35 = k5(this.u9().l6().n5(), 0.0, var33);
      double var37 = u3(var35, this.u9().l6().n5(), 2.0);
      c2 var39 = new c2(this.u9());
      var39.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var39.a6(0.0, this.u9().l6().l6() / 2.0);
      var39.u9(var31, var23);
      var39.u9(var31, var25);
      var39.u9(var35, var25);
      var39.u9(var35, 0.0);
      var39.u9(this.u9().l6().n5(), 0.0);
      var39.u9(this.u9().l6().n5(), this.u9().l6().l6());
      var39.u9(var35, this.u9().l6().l6());
      var39.u9(var35, var27);
      var39.u9(var31, var27);
      var39.u9(var31, var29);
      var39.a6();
      var39.n5(new m8(var35, 0.0, this.u9().l6().n5(), this.u9().l6().l6()));
      return var39;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 25000.0);
      var1.l6("adj2", 25000.0);
      var1.l6("adj3", 25000.0);
      var1.l6("adj4", 64977.0);
   }
}
