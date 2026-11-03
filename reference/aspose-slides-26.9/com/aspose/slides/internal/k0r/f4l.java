package com.aspose.slides.internal.k0r;

public class f4l extends v4m {
   private com.aspose.slides.ms.System.o5<Float> n5 = new com.aspose.slides.ms.System.o5<>();

   public f4l() {
      this.n5(2);
   }

   public f4l(float var1) {
      this.n5(2);
      long var2 = com.aspose.slides.ms.System.x8.l6(com.aspose.slides.ms.System.x8.n5(var1), 0);
      this.n5(com.aspose.slides.ms.System.x8.n5(var2));
   }

   public final float a6() {
      if (!this.n5.l6()) {
         this.u3();
      }

      return this.n5.n5();
   }

   @Override
   protected void u3() {
      this.n5 = new com.aspose.slides.ms.System.o5<>(com.aspose.slides.ms.System.x8.c8(this.k5(), 0));
   }
}
