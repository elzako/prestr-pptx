package com.aspose.slides;

public class InkOptions implements IInkOptions {
   private boolean n5;
   private boolean l6;

   @Override
   public final boolean getHideInk() {
      return this.n5;
   }

   @Override
   public final void setHideInk(boolean value) {
      this.n5 = value;
   }

   @Override
   public final boolean getInterpretMaskOpAsOpacity() {
      return this.l6;
   }

   @Override
   public final void setInterpretMaskOpAsOpacity(boolean value) {
      this.l6 = value;
   }

   InkOptions() {
      this.setInterpretMaskOpAsOpacity(true);
   }
}
