package com.aspose.slides;

final class WheelEffect implements m0s {
   private com.aspose.slides.internal.o9b.w1 n5 = new com.aspose.slides.internal.o9b.w1();
   private final float l6;
   private final com.aspose.slides.internal.o9b.w1[] k5;
   private final int u3;

   public WheelEffect(com.aspose.slides.internal.o9b.p8 frameSize, int mode) {
      this.u3 = mode;
      this.n5 = new com.aspose.slides.internal.o9b.w1(0.5F * frameSize.l6(), 0.5F * frameSize.k5());
      this.l6 = com.aspose.slides.ms.System.q1.n5(frameSize.l6(), frameSize.k5());
      this.k5 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 6)
      );
      this.n5.n5(this.k5[0]);
   }

   @Override
   public final void dispose() {
   }

   @Override
   public final void n5(float var1, com.aspose.slides.internal.o9b.z1 var2) {
      double var3 = (Math.PI * 2) * var1;
      double var5 = -Math.PI / 2;
      if (this.u3 == 1) {
         var3 = -var3;
      } else if (this.u3 == 2) {
         var5 -= var3 / 2.0;
      }

      this.n5(0.0 + var5).n5(this.k5[1]);
      this.n5(var3 / 4.0 + var5).n5(this.k5[2]);
      this.n5(var3 / 2.0 + var5).n5(this.k5[3]);
      this.n5(3.0 * var3 / 4.0 + var5).n5(this.k5[4]);
      this.n5(var3 + var5).n5(this.k5[5]);
      var2.n5(com.aspose.slides.internal.o9b.a6.l6(), this.k5);
   }

   private com.aspose.slides.internal.o9b.w1 n5(double var1) {
      return new com.aspose.slides.internal.o9b.w1(
         this.l6 * (float)com.aspose.slides.ms.System.q1.c8(var1) + this.n5.l6(), this.l6 * (float)com.aspose.slides.ms.System.q1.h0(var1) + this.n5.k5()
      );
   }
}
