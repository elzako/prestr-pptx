package com.aspose.slides;

final class g8q extends d8y implements IPresentationAnimationPlayer {
   private final double n5;
   private final com.aspose.slides.internal.o9b.z1 l6;
   private final x4j k5;

   g8q(com.aspose.slides.internal.o9b.z1 var1, com.aspose.slides.internal.o9b.l6 var2, x4j var3, double var4) {
      super(var4, var2);
      this.n5 = 1.0 / var4;
      this.l6 = var1;
      this.k5 = var3;
   }

   @Override
   public final void setTimePosition(double time) {
      this.k5.n5((float)(this.n5 * time), this.l6);
   }
}
