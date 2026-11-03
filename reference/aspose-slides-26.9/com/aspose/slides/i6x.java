package com.aspose.slides;

final class i6x extends w4 implements l8k {
   public float l6 = 0.0F;
   public float k5 = 360.0F;

   public i6x(IShape var1) {
      super(var1);
   }

   @Override
   public final void n5(float var1) {
      this.n5.setRotation(this.l6 + (this.k5 - this.l6) * var1);
   }

   @Override
   public final void n5() {
      this.n5.setRotation(this.k5);
   }
}
