package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class NormalViewRestoredProperties implements INormalViewRestoredProperties {
   private float n5 = 0.0F;
   private boolean l6 = true;

   NormalViewRestoredProperties() {
   }

   @Override
   public final float getDimensionSize() {
      return this.n5;
   }

   @Override
   public final void setDimensionSize(float value) {
      if (!(value < 0.0F) && !(value > 100.0F)) {
         this.n5 = value;
      } else {
         throw new ArgumentOutOfRangeException("Scaling ratio can't be less than zero.");
      }
   }

   @Override
   public final boolean getAutoAdjust() {
      return this.l6;
   }

   @Override
   public final void setAutoAdjust(boolean value) {
      this.l6 = value;
   }
}
