package com.aspose.slides.internal.b7;

public class h7 extends x2 {
   public h7(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(100000.0, this.u9().l6().n5(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj1"), 100000.0);
      double var5 = n5(0.0, this.l6().n5("adj2"), var1);
      double var7 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var5, 100000.0);
      double var9 = k5(this.u9().l6().n5(), 0.0, var7);
      double var11 = l6(this.u9().l6().l6(), var3, 200000.0);
      double var13 = k5(this.u9().l6().l6() / 2.0, 0.0, var11);
      double var15 = k5(this.u9().l6().l6() / 2.0, var11, 0.0);
      double var17 = l6(var13, var7, this.u9().l6().l6() / 2.0);
      double var19 = k5(var9, var17, 0.0);
      c2 var21 = new c2(this.u9());
      var21.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var21.a6(0.0, var13);
      var21.u9(var9, var13);
      var21.u9(var9, 0.0);
      var21.u9(this.u9().l6().n5(), this.u9().l6().l6() / 2.0);
      var21.u9(var9, this.u9().l6().l6());
      var21.u9(var9, var15);
      var21.u9(0.0, var15);
      var21.a6();
      var21.n5(new m8(0.0, var13, var19, var15));
      return var21;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 50000.0);
      var1.l6("adj2", 50000.0);
   }
}
