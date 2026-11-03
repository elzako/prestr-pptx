package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class CommonSlideViewProperties implements ICommonSlideViewProperties {
   private int n5;
   private boolean l6;
   private final DrawingGuidesCollection k5 = new DrawingGuidesCollection();

   @Override
   public final int getScale() {
      return this.n5;
   }

   @Override
   public final void setScale(int value) {
      if (value < 0) {
         throw new ArgumentOutOfRangeException("Scaling ratio can't be less than zero.");
      }

      this.n5 = value;
   }

   @Override
   public final boolean getVariableScale() {
      return this.l6;
   }

   @Override
   public final void setVariableScale(boolean value) {
      this.l6 = value;
   }

   @Override
   public final IDrawingGuidesCollection getDrawingGuides() {
      return this.k5;
   }

   CommonSlideViewProperties() {
   }
}
