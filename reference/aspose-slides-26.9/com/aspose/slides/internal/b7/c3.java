package com.aspose.slides.internal.b7;

public class c3 extends x2 {
   public c3(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(100000.0, this.u9().l6().l6(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = l6(100000.0, this.u9().l6().n5(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var5 = n5(0.0, this.l6().n5("adj1"), var1);
      double var7 = n5(0.0, this.l6().n5("adj2"), var3);
      double var9 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var7, 100000.0);
      double var11 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var5, 100000.0);
      double var13 = k5(this.u9().l6().l6(), 0.0, var11);
      double var15 = l6(var9, 1.0, 2.0);
      double var17 = u3(var13, this.u9().l6().l6(), 2.0);
      double var19 = k5(this.u9().l6().n5(), 0.0, this.u9().l6().l6());
      double var21 = a6(var19, var13, 0.0);
      double var23 = a6(var19, this.u9().l6().n5(), var9);
      c2 var25 = new c2(this.u9());
      var25.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var25.a6(0.0, 0.0);
      var25.u9(var9, 0.0);
      var25.u9(var9, var13);
      var25.u9(this.u9().l6().n5(), var13);
      var25.u9(this.u9().l6().n5(), this.u9().l6().l6());
      var25.u9(0.0, this.u9().l6().l6());
      var25.a6();
      var25.n5(new m8(0.0, var21, var23, this.u9().l6().l6()));
      return var25;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 50000.0);
      var1.l6("adj2", 50000.0);
   }
}
