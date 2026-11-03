package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;

public class ViewProperties implements IViewProperties, r0g {
   private float n5;
   private r0g l6;
   private int k5;
   private byte u3;
   private final INormalViewProperties a6;
   private final CommonSlideViewProperties u9;
   private final CommonSlideViewProperties h0;

   @Override
   public final int getLastView() {
      return this.k5;
   }

   @Override
   public final void setLastView(int value) {
      this.k5 = value;
   }

   @Override
   public final byte getShowComments() {
      return this.u3;
   }

   @Override
   public final void setShowComments(byte value) {
      this.u3 = value;
   }

   @Override
   public final INormalViewProperties getNormalViewProperties() {
      return this.a6;
   }

   @Override
   public final ICommonSlideViewProperties getSlideViewProperties() {
      return this.u9;
   }

   @Override
   public final ICommonSlideViewProperties getNotesViewProperties() {
      return this.h0;
   }

   @Override
   public final float getGridSpacing() {
      return this.n5();
   }

   @Override
   public final void setGridSpacing(float value) {
      if (com.aspose.slides.ms.System.n1.k5(value)) {
         throw new ArgumentException("The grid spacing value must be defined (not a float.NaN).");
      }

      if (value < 0.0F) {
         throw new ArgumentException("The grid spacing value must be a positive number.)");
      }

      this.n5(value);
   }

   final float n5() {
      return this.n5;
   }

   final void n5(float var1) {
      this.n5 = var1;
   }

   ViewProperties(Presentation parentImmediate) {
      this.l6 = parentImmediate;
      this.k5 = 0;
      this.u3 = -1;
      this.a6 = new NormalViewProperties();
      this.u9 = new CommonSlideViewProperties();
      this.u9.setScale(73);
      this.h0 = new CommonSlideViewProperties();
      this.h0.setScale(1);
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.l6;
   }
}
