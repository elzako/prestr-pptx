package com.aspose.slides;

abstract class d8y extends m0 implements t4h {
   private final com.aspose.slides.internal.o9b.l6 n5;

   protected d8y(double var1, com.aspose.slides.internal.o9b.l6 var3) {
      super(var1);
      this.n5 = var3;
   }

   public final IImage getFrame() {
      return u4i.n5((com.aspose.slides.internal.o9b.l6)this.n5.deepClone());
   }

   @Override
   public final com.aspose.slides.internal.o9b.l6 n5() {
      return (com.aspose.slides.internal.o9b.l6)this.n5.deepClone();
   }
}
