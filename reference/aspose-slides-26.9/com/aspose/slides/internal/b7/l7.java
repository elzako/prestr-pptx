package com.aspose.slides.internal.b7;

public class l7 extends x2 {
   public l7(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(50000.0, this.u9().l6().n5(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj1"), var1);
      double var5 = n5(0.0, this.l6().n5("adj2"), var1);
      double var7 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 200000.0);
      double var9 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var11 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var5, 100000.0);
      double var13 = k5(this.u9().l6().n5(), 0.0, var11);
      double var15 = u3(this.u9().l6().n5(), var13, 2.0);
      double var17 = l6(this.u9().l6().n5() / 3.0, var3, var1);
      double var19 = com.aspose.slides.ms.System.q1.l6(var3, var5);
      double var21 = l6(this.u9().l6().l6() / 3.0, var19, var1);
      double var23 = l6(this.u9().l6().n5() / 3.0, var5, var1);
      double var25 = k5(this.u9().l6().n5(), 0.0, var23);
      c2 var27 = new c2(this.u9());
      var27.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var27.a6(0.0, this.u9().l6().l6());
      var27.u9(var9, 0.0);
      var27.u9(var13, 0.0);
      var27.u9(this.u9().l6().n5(), this.u9().l6().l6());
      var27.a6();
      var27.n5(new m8(var17, var21, var25, this.u9().l6().l6()));
      return var27;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 25000.0);
      var1.l6("adj2", 25000.0);
   }
}
