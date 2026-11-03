package com.aspose.slides.internal.b7;

public class p4 extends x2 {
   public p4(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = n5(0.0, this.l6().n5("adj1"), 12500.0);
      double var3 = n5(-10000.0, this.l6().n5("adj2"), 10000.0);
      double var5 = l6(this.u9().l6().l6(), var1, 100000.0);
      double var7 = l6(var5, 10.0, 3.0);
      double var9 = k5(var5, 0.0, var7);
      double var11 = k5(var5, var7, 0.0);
      double var13 = k5(this.u9().l6().l6(), 0.0, var5);
      double var15 = k5(var13, 0.0, var7);
      double var17 = k5(var13, var7, 0.0);
      double var19 = l6(this.u9().l6().n5(), var3, 100000.0);
      double var21 = l6(this.u9().l6().n5(), var3, 50000.0);
      double var23 = com.aspose.slides.ms.System.q1.n5(var19);
      double var25 = a6(var21, 0.0, var21);
      double var27 = k5(0.0, 0.0, var25);
      double var29 = a6(var21, var21, 0.0);
      double var31 = k5(this.u9().l6().n5(), 0.0, var29);
      double var33 = u3(var25, var31, 6.0);
      double var35 = k5(var27, var33, 0.0);
      double var37 = u3(var25, var31, 3.0);
      double var39 = k5(var27, var37, 0.0);
      double var41 = u3(var27, var31, 2.0);
      double var43 = k5(var41, var33, 0.0);
      double var45 = u3(var43, var31, 2.0);
      double var47 = k5(0.0, var29, 0.0);
      double var49 = k5(this.u9().l6().n5(), var25, 0.0);
      double var51 = k5(var47, var33, 0.0);
      double var53 = k5(var47, var37, 0.0);
      double var55 = u3(var47, var49, 2.0);
      double var57 = k5(var55, var33, 0.0);
      double var59 = u3(var57, var49, 2.0);
      double var61 = k5(this.u9().l6().n5(), 0.0, var23);
      double var63 = k5(this.u9().l6().n5() / 2.0, var19, 0.0);
      double var65 = com.aspose.slides.ms.System.q1.l6(var27, var47);
      double var67 = com.aspose.slides.ms.System.q1.k5(var31, var49);
      double var69 = l6(this.u9().l6().l6(), var1, 50000.0);
      double var71 = k5(this.u9().l6().l6(), 0.0, var69);
      c2 var73 = new c2(this.u9());
      var73.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, true);
      var73.a6(var27, var5);
      var73.n5(new k0(var35, var9), new k0(var39, var11), new k0(var41, var5));
      var73.n5(new k0(var43, var9), new k0(var45, var11), new k0(var31, var5));
      var73.u9(var49, var13);
      var73.n5(new k0(var59, var17), new k0(var57, var15), new k0(var55, var13));
      var73.n5(new k0(var53, var17), new k0(var51, var15), new k0(var47, var13));
      var73.a6();
      var73.n5(new m8(var65, var69, var67, var71));
      return var73;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 6250.0);
      var1.l6("adj2", 0.0);
   }
}
