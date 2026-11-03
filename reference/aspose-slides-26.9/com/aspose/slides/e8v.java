package com.aspose.slides;

abstract class e8v extends e3 {
   private float s7;
   private float x8;
   private int n3;
   private int y4;
   protected com.aspose.slides.internal.w0.c8 c8;
   protected com.aspose.slides.internal.w0.c8 t2;

   protected e8v(int var1, int var2, float var3, float var4) {
      super((com.aspose.slides.internal.o9b.l6)null);
      this.s7 = var3;
      this.x8 = var4;
      this.n3 = var1;
      this.y4 = var2;
   }

   @Override
   public float c8() {
      return this.s7;
   }

   @Override
   public float t2() {
      return this.x8;
   }

   @Override
   public int s7() {
      return this.n3;
   }

   @Override
   public int x8() {
      return this.y4;
   }

   @Override
   protected com.aspose.slides.internal.w0.c8 n3() {
      return this.c8;
   }

   @Override
   protected void n5(com.aspose.slides.internal.w0.c8 var1) {
      this.c8 = var1.k5();
      this.t2 = var1.k5();
      this.t2.n5(this.c8() / 576.0F, this.t2() / 576.0F, 1);
      this.h0();
   }
}
