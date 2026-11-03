package com.aspose.slides.internal.b7;

public class l1b extends x2 {
   public l1b(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(50000.0, this.u9().l6().l6(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj1"), 100000.0);
      double var5 = n5(0.0, this.l6().n5("adj2"), var1);
      double var7 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var5, 100000.0);
      double var9 = k5(this.u9().l6().l6(), 0.0, var7);
      double var11 = l6(this.u9().l6().n5(), var3, 200000.0);
      double var13 = k5(this.u9().l6().n5() / 2.0, 0.0, var11);
      double var15 = k5(this.u9().l6().n5() / 2.0, var11, 0.0);
      double var17 = l6(var13, var7, this.u9().l6().n5() / 2.0);
      double var19 = k5(var7, 0.0, var17);
      double var21 = k5(var9, var17, 0.0);
      c2 var23 = new c2(this.u9());
      var23.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var23.a6(0.0, var7);
      var23.u9(this.u9().l6().n5() / 2.0, 0.0);
      var23.u9(this.u9().l6().n5(), var7);
      var23.u9(var15, var7);
      var23.u9(var15, var9);
      var23.u9(this.u9().l6().n5(), var9);
      var23.u9(this.u9().l6().n5() / 2.0, this.u9().l6().l6());
      var23.u9(0.0, var9);
      var23.u9(var13, var9);
      var23.u9(var13, var7);
      var23.a6();
      var23.n5(new m8(var13, var19, var15, var21));
      return var23;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 50000.0);
      var1.l6("adj2", 50000.0);
   }
}
