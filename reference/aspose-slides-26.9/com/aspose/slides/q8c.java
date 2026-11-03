package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class q8c implements l8k, IDisposable {
   public final l8k n5;
   private float l6;

   public q8c(l8k var1, float var2) {
      if (var1 == null) {
         throw new ArgumentNullException("player");
      }

      this.n5 = var1;
      this.l6(var2);
   }

   @Override
   public final void dispose() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5, IDisposable.class)) {
         com.aspose.slides.internal.v6g.k5.n5(this.n5, IDisposable.class).dispose();
      }
   }

   public final float l6() {
      return this.l6;
   }

   public final void l6(float var1) {
      this.l6 = var1;
   }

   @Override
   public final void n5(float var1) {
      this.n5.n5(this.l6() * var1);
   }

   @Override
   public final void n5() {
      this.n5.n5();
   }
}
