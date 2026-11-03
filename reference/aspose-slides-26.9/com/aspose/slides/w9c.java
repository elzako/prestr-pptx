package com.aspose.slides;

class w9c extends x2k {
   private ChartDataPointLevel n5;
   private n1g l6;

   public w9c(ChartDataPointLevel var1, n1g var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public int u3() {
      return 0;
   }

   @Override
   protected LineFormat h0() {
      return (LineFormat)this.n5.getFormat().getLine();
   }

   @Override
   protected boolean c8() {
      return false;
   }

   @Override
   protected void n5(com.aspose.slides.internal.x4g.s7 var1) {
      var1.l6(this.t2().y4());
      this.n5.n5(false);
      FillFormat var2 = this.n5.k5();
      w5k.n5(((ColorFormat)var2.getSolidFillColor()).u3().o8(), this.l6, var1, var2, 1.0F, null);
      this.n5.n5(true);
   }
}
