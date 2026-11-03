package com.aspose.slides.internal.x4g;

import com.aspose.slides.exceptions.OverflowException;

public final class a6 {
   private float[] n5;
   private com.aspose.slides.internal.o9b.c8[] l6;

   public a6() {
      this.n5 = new float[1];
      this.l6 = new com.aspose.slides.internal.o9b.c8[]{new com.aspose.slides.internal.o9b.c8()};
   }

   public a6(int var1) {
      if (var1 < 0) {
         throw new OverflowException("Arithmetic operation resulted in an overflow");
      }

      this.n5 = new float[var1];
      this.l6 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var1)
      );
   }

   public com.aspose.slides.internal.o9b.c8[] n5() {
      return this.l6;
   }

   public void n5(com.aspose.slides.internal.o9b.c8[] var1) {
      this.l6 = var1;
   }

   public float[] l6() {
      return this.n5;
   }

   public void n5(float[] var1) {
      this.n5 = var1;
   }
}
