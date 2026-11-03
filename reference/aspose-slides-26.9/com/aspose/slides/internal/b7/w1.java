package com.aspose.slides.internal.b7;

public class w1 extends f7 {
   @Override
   public int n5() {
      return 9;
   }

   @Override
   public n2z u3() {
      w1 var1 = new w1();
      var1.l6().n5("adj", this.l6().n5("adj"));
      return var1;
   }

   @Override
   public d1 a6() {
      double var1 = com.aspose.slides.ms.System.q1.l6(this.u9().l6().n5(), this.u9().l6().l6());
      double var3 = com.aspose.slides.ms.System.q1.k5(this.u9().l6().n5(), this.u9().l6().l6());
      double var5 = this.l6().n5("adj");
      double var7 = n5(0.0, var5, 2.1599999E7);
      double var9 = k5(1.08E7, 0.0, var7);
      double var11 = k5(3.24E7, 0.0, var7);
      double var13 = a6(var9, var9, var11);
      double var15 = k5(5400000.0, 0.0, var7);
      double var17 = k5(1.62E7, 0.0, var7);
      double var19 = k5(var13, 0.0, var7);
      double var21 = k5(2.16E7, var19, 0.0);
      double var23 = a6(var17, var19, var21);
      double var25 = a6(var9, var21, var23);
      double var27 = a6(var15, var19, var25);
      double var29 = k5(var1 / 2.0, var5);
      double var31 = l6(var1 / 2.0, var5);
      double var33 = u9(var1 / 2.0, var31, var29);
      double var35 = c8(var1 / 2.0, var31, var29);
      double var37 = k5(var1 / 2.0, var33, 0.0);
      double var39 = k5(var1 / 2.0, var35, 0.0);
      d1 var41 = new d1(var1, var1, 0, false, true);
      var41.k5();
      var41.l6(var37, var39);
      var41.n5(var1 / 2.0, var1 / 2.0, var7, var27);
      if (this.u9().l6().l6() > this.u9().l6().n5()) {
         var41.n5(var3 / var1);
      } else {
         var41.l6(var3 / var1);
      }

      return var41;
   }

   @Override
   protected void n5(z3$l6 var1) {
      var1.l6("adj", 1.08E7);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public n2z cloneT() {
      return this.u3();
   }

}
