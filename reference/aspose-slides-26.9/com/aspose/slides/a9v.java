package com.aspose.slides;

class a9v extends z5 {
   private final float n5;
   private final float l6;

   public final float u3() {
      return this.n5;
   }

   public final float a6() {
      return this.l6;
   }

   public a9v(float var1, float var2, float var3, float var4) {
      super(var1, var2);
      this.n5 = var3;
      this.l6 = var4;
   }

   public final a9v n5(float var1, float var2) {
      return new a9v(var1, var2, this.u3() + (this.n5() - var1) / 2.0F, this.a6() + (this.l6() - var2) / 2.0F);
   }

   public final a9v u9() {
      float var1 = com.aspose.slides.ms.System.q1.l6(this.n5(), this.l6());
      return this.n5(var1, var1);
   }
}
