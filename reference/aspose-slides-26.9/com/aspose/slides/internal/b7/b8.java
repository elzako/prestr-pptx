package com.aspose.slides.internal.b7;

public class b8 extends x2 {
   public b8(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(1000.0, this.l6().n5("adj1"), 36745.0);
      double var3 = k5(0.0, 0.0, var1);
      double var5 = u3(73490.0, var3, 4.0);
      double var7 = l6(36745.0, this.u9().l6().n5(), this.u9().l6().l6());
      double var9 = com.aspose.slides.ms.System.q1.k5(var5, var7);
      double var11 = n5(1000.0, this.l6().n5("adj3"), var9);
      double var13 = l6(-4.0, var11, 1.0);
      double var15 = k5(73490.0, var13, var1);
      double var17 = n5(0.0, this.l6().n5("adj2"), var15);
      double var19 = l6(this.u9().l6().l6(), var1, 200000.0);
      double var21 = l6(this.u9().l6().l6(), var17, 100000.0);
      double var23 = l6(this.u9().l6().l6(), var11, 100000.0);
      double var25 = l6(this.u9().l6().n5(), 73490.0, 200000.0);
      double var27 = k5(this.u9().l6().l6() / 2.0, 0.0, var19);
      double var29 = k5(this.u9().l6().l6() / 2.0, var19, 0.0);
      double var31 = k5(var21, var23, 0.0);
      double var33 = k5(var27, 0.0, var31);
      double var35 = k5(var33, 0.0, var23);
      double var37 = k5(this.u9().l6().l6(), 0.0, var35);
      double var39 = k5(this.u9().l6().n5() / 2.0, 0.0, var25);
      double var41 = k5(this.u9().l6().n5() / 2.0, var25, 0.0);
      double var43 = k5(this.u9().l6().n5() / 2.0, 0.0, var23);
      c2 var45 = new c2(this.u9());
      var45.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var45.a6(this.u9().l6().n5() / 2.0, var35);
      var45.n5(var23, var23, 1.62E7, 2.16E7);
      var45.a6();
      var45.a6(this.u9().l6().n5() / 2.0, var37);
      var45.n5(var23, var23, 5400000.0, 2.16E7);
      var45.a6();
      var45.a6(var39, var27);
      var45.u9(var41, var27);
      var45.u9(var41, var29);
      var45.u9(var39, var29);
      var45.a6();
      var45.n5(new m8(var39, var27, var41, var29));
      return var45;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 23520.0);
      var1.l6("adj2", 5880.0);
      var1.l6("adj3", 11760.0);
   }
}
