package com.aspose.slides.internal.s6;

public final class z7 implements k7 {
   private g7 n5 = new g7();

   public z7(com.aspose.slides.internal.o9b.c8 var1) {
      this.n5.n5((var1.y4() & 0xFF) / 255.0F);
      this.n5.l6((var1.n3() & 0xFF) / 255.0F);
      this.n5.k5((var1.x8() & 0xFF) / 255.0F);
      this.n5.u3((var1.s7() & 0xFF) / 255.0F);
   }

   @Override
   public final void beginRender() {
   }

   @Override
   public final void endRender() {
   }

   @Override
   public final void updateCurrentLevel(float approximateSize) {
   }

   @Override
   public final void getPixel(float u, float v, g7[] color) {
      this.n5.n5(color[0]);
   }
}
