package com.aspose.slides;

final class u9b implements l8k {
   private final r9g n5;
   private final PropertyEffectPlaying$SetValueHandler l6;
   private final z9l k5;
   private final z9l u3;
   private float a6 = 0.0F;
   private float u9 = 0.0F;
   private boolean h0 = true;

   public u9b(r9g var1, PropertyEffectPlaying$SetValueHandler var2, z9l var3, z9l var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   @Override
   public final void n5(float var1) {
      if (this.h0) {
         this.h0 = false;
         this.a6 = this.k5.n5(this.n5);
         this.u9 = this.u3.n5(this.n5);
      }

      float var2 = this.a6 + (this.u9 - this.a6) * var1;
      this.l6.invoke(var2);
   }

   @Override
   public final void n5() {
      if (this.h0) {
         this.a6 = this.k5.n5(this.n5);
         this.u9 = this.u3.n5(this.n5);
      }

      this.l6.invoke(this.u9);
   }
}
