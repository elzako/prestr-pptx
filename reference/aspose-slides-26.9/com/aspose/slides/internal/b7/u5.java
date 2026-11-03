package com.aspose.slides.internal.b7;

public class u5 extends x2 {
   public u5(z6e var1) {
      super(var1);
   }

   @Override
   public c2 n5() {
      double var1 = l6(50000.0, this.u9().l6().l6(), com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var3 = n5(0.0, this.l6().n5("adj2"), var1);
      double var5 = n5(0.0, this.l6().n5("adj1"), var3);
      double var7 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var5, 100000.0);
      double var9 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var3, 100000.0);
      double var11 = u3(var7, var9, 4.0);
      double var13 = k5(this.u9().l6().l6() / 2.0, 0.0, var11);
      double var15 = l6(var13, 2.0, 1.0);
      double var17 = l6(var15, var15, 1.0);
      double var19 = l6(var7, var7, 1.0);
      double var21 = k5(var17, 0.0, var19);
      double var23 = com.aspose.slides.ms.System.q1.z3(var21);
      double var25 = l6(var23, this.u9().l6().n5(), var15);
      double var27 = l6(100000.0, var25, com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()));
      double var29 = n5(0.0, this.l6().n5("adj3"), var27);
      double var31 = l6(com.aspose.slides.ms.System.q1.k5(this.u9().l6().l6(), this.u9().l6().n5()), var29, 100000.0);
      double var33 = k5(var13, var7, 0.0);
      double var35 = l6(this.u9().l6().n5(), this.u9().l6().n5(), 1.0);
      double var37 = l6(var31, var31, 1.0);
      double var39 = k5(var35, 0.0, var37);
      double var41 = com.aspose.slides.ms.System.q1.z3(var39);
      double var43 = l6(var41, var13, this.u9().l6().n5());
      double var45 = k5(var13, var43, 0.0);
      double var47 = k5(var33, var43, 0.0);
      double var49 = k5(var9, 0.0, var7);
      double var51 = l6(var49, 1.0, 2.0);
      double var53 = k5(var45, 0.0, var51);
      double var55 = k5(var47, var51, 0.0);
      double var57 = l6(var9, 1.0, 2.0);
      double var59 = k5(this.u9().l6().l6(), 0.0, var57);
      double var61 = k5(this.u9().l6().n5(), 0.0, var31);
      double var63 = n5(var31, var43);
      double var65 = k5(1.08E7, 0.0, var63);
      double var67 = k5(0.0, 0.0, var63);
      double var69 = k5(this.u9().l6().n5(), 0.0, var25);
      double var71 = u3(var13, var33, 2.0);
      double var73 = l6(var7, 1.0, 2.0);
      double var75 = n5(var25, var73);
      double var77 = k5(var75, 0.0, 5400000.0);
      double var79 = k5(5400000.0, var75, 0.0);
      double var81 = k5(1.08E7, 0.0, var75);
      c2 var83 = new c2(this.u9());
      var83.n5(this.u9().l6().n5(), this.u9().l6().l6(), 0, false, false);
      var83.a6(0.0, var13);
      var83.n5(var13, this.u9().l6().n5(), 1.08E7, var67);
      var83.u9(var61, var53);
      var83.u9(this.u9().l6().n5(), var59);
      var83.u9(var61, var55);
      var83.u9(var61, var47);
      var83.n5(var13, this.u9().l6().n5(), var65, var63);
      var83.a6();
      var83.n5(this.u9().l6().n5(), this.u9().l6().l6(), 2, false, false);
      var83.a6(this.u9().l6().n5(), var7);
      var83.n5(var13, this.u9().l6().n5(), 1.62E7, var77);
      var83.n5(var13, this.u9().l6().n5(), var81, var79);
      var83.a6();
      var83.n5(this.u9().l6().n5(), this.u9().l6().l6(), 5, false, true);
      var83.a6(0.0, var13);
      var83.n5(var13, this.u9().l6().n5(), 1.08E7, var67);
      var83.u9(var61, var53);
      var83.u9(this.u9().l6().n5(), var59);
      var83.u9(var61, var55);
      var83.u9(var61, var47);
      var83.n5(var13, this.u9().l6().n5(), var65, var63);
      var83.u9(0.0, var13);
      var83.n5(var13, this.u9().l6().n5(), 1.08E7, 5400000.0);
      var83.u9(this.u9().l6().n5(), var7);
      var83.n5(var13, this.u9().l6().n5(), 1.62E7, var77);
      var83.n5(new m8(0.0, 0.0, this.u9().l6().n5(), this.u9().l6().l6()));
      return var83;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj1", 25000.0);
      var1.l6("adj2", 50000.0);
      var1.l6("adj3", 25000.0);
   }
}
