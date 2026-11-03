package com.aspose.slides;

final class t5 {
   private com.aspose.slides.internal.n8e.h2 n5 = new com.aspose.slides.internal.n8e.h2(0.0F, 0.0F, 0.0F);
   private com.aspose.slides.internal.n8e.h2 l6 = new com.aspose.slides.internal.n8e.h2(0.0F, 0.0F, 0.0F);
   private com.aspose.slides.internal.n8e.h2 k5 = new com.aspose.slides.internal.n8e.h2(0.0F, 0.0F, 0.0F);
   private long u3;

   public final float[] n5() {
      return new float[]{this.n5.n5, this.n5.l6, this.n5.k5};
   }

   public final void n5(float[] var1) {
      this.n5 = new com.aspose.slides.internal.n8e.h2(var1[0], var1[1], var1[2]);
      this.n5.l6();
      this.a6();
   }

   public final float[] l6() {
      return new float[]{this.l6.n5, this.l6.l6, this.l6.k5};
   }

   public final void l6(float[] var1) {
      this.l6 = new com.aspose.slides.internal.n8e.h2(var1[0], var1[1], var1[2]);
      this.a6();
   }

   public final float[] k5() {
      return new float[]{this.k5.n5, this.k5.l6, this.k5.k5};
   }

   public final void k5(float[] var1) {
      this.k5 = new com.aspose.slides.internal.n8e.h2(var1[0], var1[1], var1[2]);
      this.k5.l6();
      this.a6();
   }

   final void n5(Backdrop3DScene var1) {
      this.l6 = new com.aspose.slides.internal.n8e.h2(var1.getAnchorPoint()[0], var1.getAnchorPoint()[1], var1.getAnchorPoint()[2]);
      this.n5 = new com.aspose.slides.internal.n8e.h2(var1.getNormalVector()[0], var1.getNormalVector()[1], var1.getNormalVector()[2]);
      this.k5 = new com.aspose.slides.internal.n8e.h2(var1.getUpVector()[0], var1.getUpVector()[1], var1.getUpVector()[2]);
      this.a6();
   }

   final long u3() {
      return this.u3;
   }

   private void a6() {
      this.u3++;
   }
}
