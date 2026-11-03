package com.aspose.slides;

final class p2y$n5 {
   private float n5;
   private float l6;
   private com.aspose.slides.internal.o9b.c8 k5 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.s6.g7 u3 = new com.aspose.slides.internal.s6.g7();

   public p2y$n5(float var1, float var2, com.aspose.slides.internal.o9b.c8 var3) {
      this.l6(var1);
      this.k5(var2);
      this.n5(var3.o8());
      this.n5(
         new com.aspose.slides.internal.s6.g7(
            (var3.y4() & 0xFF) / 255.0F, (var3.n3() & 0xFF) / 255.0F, (var3.x8() & 0xFF) / 255.0F, (var3.s7() & 0xFF) / 255.0F
         )
      );
   }

   public final boolean n5(float var1) {
      return var1 >= this.l6() && var1 < this.k5();
   }

   private float l6() {
      return this.n5;
   }

   private void l6(float var1) {
      this.n5 = var1;
   }

   private float k5() {
      return this.l6;
   }

   private void k5(float var1) {
      this.l6 = var1;
   }

   private void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.k5 = var1.o8();
   }

   public final com.aspose.slides.internal.s6.g7 n5() {
      return this.u3.u9();
   }

   private void n5(com.aspose.slides.internal.s6.g7 var1) {
      this.u3 = var1.u9();
   }
}
