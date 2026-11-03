package com.aspose.slides;

class t5j {
   private final com.aspose.slides.internal.o9b.n3 n5;
   private final com.aspose.slides.internal.o9b.y4 l6;

   public t5j(com.aspose.slides.internal.o9b.n3 var1) {
      this.n5 = var1;
      this.l6 = var1.l6();
   }

   public final float n5() {
      return this.n5(this.l6.k5(this.n5.x8()));
   }

   public final float l6() {
      return this.n5(this.l6.a6(this.n5.x8()));
   }

   public final float k5() {
      return this.n5(this.l6.h0(this.n5.x8()));
   }

   public final float u3() {
      return this.k5() - this.n5() - this.l6();
   }

   protected final float n5(int var1) {
      float var2 = this.n5.t2();
      int var3 = this.l6.u9(this.n5.x8());
      return var2 * var1 / var3;
   }
}
