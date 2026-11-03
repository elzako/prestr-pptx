package com.aspose.slides;

import com.aspose.slides.ms.System.IDisposable;

class u5j implements j2m {
   private double l6 = 1.0;
   private double k5 = 1.0;
   private float u3;
   public final l8k n5;

   public u5j(l8k var1, double var2) {
      this.n5 = var1;
      this.u3 = 0.0F;
      this.l6(var2);
   }

   @Override
   public final void dispose() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5, IDisposable.class)) {
         com.aspose.slides.internal.v6g.k5.n5(this.n5, IDisposable.class).dispose();
      }
   }

   @Override
   public final double k5() {
      return this.l6;
   }

   public final void l6(double var1) {
      this.l6 = var1;
      this.k5 = this.l6;
      if (this.k5 > 0.0) {
         this.k5 = 1.0 / this.k5;
      }
   }

   @Override
   public final void n5(double var1) {
      float var3 = (float)(var1 * this.k5);
      this.u3 = var3;
      this.n5.n5(var3);
   }

   @Override
   public final void I_() {
      this.n5.n5();
   }
}
