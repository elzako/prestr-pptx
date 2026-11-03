package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;

class k4y implements h7z {
   private final IProgressCallback n5;
   private int l6;
   private int k5;

   public k4y(IProgressCallback var1) {
      if (var1 == null) {
         throw new NullReferenceException("progressCallback");
      }

      this.n5 = var1;
   }

   @Override
   public final void n5(IPresentation var1, int[] var2) {
      if (var1 == null) {
         throw new NullReferenceException("presentation");
      }

      if (var2 == null) {
         throw new NullReferenceException("slideIndices");
      }

      this.l6 = 0;
      this.k5 = 1;

      for (int var6 : var2) {
         if (var6 >= 1 && var6 <= var1.getSlides().size()) {
            Slide var7 = com.aspose.slides.internal.v6g.k5.n5(var1.getSlides().get_Item(var6 - 1), Slide.class);
            this.k5 = this.k5 + var7.c4();
            var7.n5(new k4y$1(this));
         }
      }

      this.n5.reporting(0.0);
   }

   @Override
   public final void n5() {
      this.l6++;
      this.n5.reporting(100.0);
   }

   private void l6() {
      this.l6++;
      double var1 = 100.0 * this.l6 / this.k5;
      this.n5.reporting(var1);
   }

   // $VF: synthetic method
   static void n5(k4y var0) {
      var0.l6();
   }
}
