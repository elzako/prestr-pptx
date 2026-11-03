package com.aspose.slides;

class s3k extends e1o {
   s3k(w3q var1, f7c var2) {
      super(var1, var2);
      this.u3();

      for (int var3 = 0; var3 < this.x8().l6.size(); var3++) {
         z4d var4 = new z4d();
         this.n5(var4);
         this.n5.addItem(var4);
         double var5 = 0.0;

         for (int var7 = 0; var7 < this.t2().length; var7++) {
            var5 += this.t2()[var7] * com.aspose.slides.ms.System.q1.a6(this.x8().l6.get_Item(var3).y4(), this.t2().length - 1.0 - var7);
         }

         var4.l6(var5);
         var4.n5(this.x8().l6.get_Item(var3).y4());
         if (this.x8().t9().k5.n5().a0()) {
            var4.n5(var4.u3() + 0.5);
         }
      }
   }

   @Override
   protected void n5(double[] var1, double[] var2) {
      int var3 = this.h0().k5().getOrder() & 255;
      double[][] var4 = new double[var1.length][];
      if (var3 > var1.length - 1) {
         var3 = var1.length - 1;
      }

      for (int var5 = 0; var5 < var1.length; var5++) {
         var4[var5] = new double[var3];
         var4[var5][0] = var1[var5];

         for (int var6 = 1; var6 < var3; var6++) {
            var4[var5][var6] = var1[var5] * var4[var5][var6 - 1];
         }
      }

      double[][] var8 = (double[][])null;
      if (this.n3()) {
         for (int var10 = 0; var10 < var2.length; var10++) {
            var2[var10] -= this.y4();
         }

         var8 = j8d.l6(var2, var4);
      } else {
         var8 = j8d.n5(var2, var4);
      }

      double[] var11 = new double[var8[0].length];

      for (int var7 = 0; var7 < var11.length; var7++) {
         var11[var7] = var8[0][var7];
         if (var7 == var11.length - 1 && this.n3()) {
            var11[var7] = this.y4();
         }
      }

      this.n5(var8[2][0]);
      this.n5(var11);
   }
}
