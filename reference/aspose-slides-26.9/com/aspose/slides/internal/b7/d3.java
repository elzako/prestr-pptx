package com.aspose.slides.internal.b7;

public class d3 extends x2 {
   public d3(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj2"), 50000.0);
      double var3 = l6(var1, 2.0, 1.0);
      double var5 = n5(0.0, this.l6().n5("adj1"), var3);
      double var7 = k5(100000.0, 0.0, var3);
      double var9 = n5(0.0, this.l6().n5("adj3"), var7);
      double var11 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var9, 100000.0);
      double var13 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 50000.0);
      double var15 = k5(this.u9().l6().n5(), 0.0, var13);
      double var17 = k5(this.u9().l6().l6(), 0.0, var13);
      double var19 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var1, 100000.0);
      double var21 = k5(this.u9().l6().n5(), 0.0, var19);
      double var23 = k5(this.u9().l6().l6(), 0.0, var19);
      double var25 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var5, 200000.0);
      double var27 = k5(var21, 0.0, var25);
      double var29 = k5(var21, var25, 0.0);
      double var31 = k5(var23, 0.0, var25);
      double var33 = k5(var23, var25, 0.0);
      double var35 = l6(var25, var11, var19);
      double var37 = u3(var11, var29, 2.0);
      double var39 = u3(var11, var33, 2.0);
      c2 var41 = new c2(this.u9());
      var41.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var41.a6(0.0, var23);
      var41.u9(var11, var17);
      var41.u9(var11, var31);
      var41.u9(var27, var31);
      var41.u9(var27, var11);
      var41.u9(var15, var11);
      var41.u9(var21, 0.0);
      var41.u9(this.u9().l6().n5(), var11);
      var41.u9(var29, var11);
      var41.u9(var29, var33);
      var41.u9(var11, var33);
      var41.u9(var11, this.u9().l6().l6());
      var41.a6();
      var41.n5(new m8(var35, var31, var21, var33));
      return var41;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 25000.0);
      var1.l6("adj2", 25000.0);
      var1.l6("adj3", 25000.0);
   }
}
