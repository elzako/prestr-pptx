package com.aspose.slides;

final class t7i implements l8k {
   private final r9g n5;
   private final z9l l6;
   private final PropertyEffectPlaying$SetValueHandler k5;

   public t7i(r9g var1, z9l var2, PropertyEffectPlaying$SetValueHandler var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public final void n5(float var1) {
      this.n5.l6 = var1;
      float var2 = this.l6.n5(this.n5);
      this.k5.invoke(var2);
   }

   @Override
   public final void n5() {
      this.n5(1.0F);
   }
}
