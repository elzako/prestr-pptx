package com.aspose.slides;

class m4g extends e3x {
   public m4g(double var1, ChartSeries var3, t9z[] var4) {
      super(var1, var3, var4);
   }

   @Override
   protected void n5(double var1, f6d[] var3) {
      this.l6 = var1;
      this.n5(0.0);

      for (int var4 = 0; var4 < var3.length; var4++) {
         f6d var5 = var3[var4];
         double var6 = com.aspose.slides.ms.System.q1.n5(var5.s7());
         this.n5(this.h0() + var6);
         var5.n5(var6 / var1);
      }
   }
}
