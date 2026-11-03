package com.aspose.slides;

import java.awt.Dimension;

public class GifOptions extends SaveOptions implements IGifOptions {
   private com.aspose.slides.internal.o9b.p8 n5 = new com.aspose.slides.internal.o9b.p8();
   private boolean l6;
   private int k5;
   private int u3;

   public GifOptions() {
      this.setTransitionFps(25);
      this.n5(com.aspose.slides.internal.o9b.p8.n5.u3());
      this.setDefaultDelay(1000);
   }

   @Override
   public final Dimension getFrameSize() {
      return com.aspose.slides.internal.o9b.p8.l6(this.n5());
   }

   com.aspose.slides.internal.o9b.p8 n5() {
      return this.n5.u3();
   }

   @Override
   public final void setFrameSize(Dimension value) {
      this.n5(com.aspose.slides.internal.o9b.p8.n5(value));
   }

   void n5(com.aspose.slides.internal.o9b.p8 var1) {
      this.n5 = var1.u3();
   }

   @Override
   public final boolean getExportHiddenSlides() {
      return this.l6;
   }

   @Override
   public final void setExportHiddenSlides(boolean value) {
      this.l6 = value;
   }

   @Override
   public final int getTransitionFps() {
      return this.k5;
   }

   @Override
   public final void setTransitionFps(int value) {
      this.k5 = value;
   }

   @Override
   public final int getDefaultDelay() {
      return this.u3;
   }

   @Override
   public final void setDefaultDelay(int value) {
      this.u3 = value;
   }
}
