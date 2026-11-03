package com.aspose.slides;

public final class BrightnessContrast extends ImageTransformOperation implements IBrightnessContrast, i4e {
   private float l6;
   private float k5;
   private k0 u3;

   BrightnessContrast(float brightness, float contrast, r0g parentImmediate) {
      super(parentImmediate);
      this.l6 = brightness;
      this.k5 = contrast;
      this.h0();
   }

   public final IBrightnessContrastEffectiveData getEffective() {
      return this.l6();
   }

   final k0 l6() {
      if (this.u3 == null) {
         this.u3 = new k0(this);
      }

      return this.u3;
   }

   final float u3() {
      return this.l6;
   }

   final float a6() {
      return this.k5;
   }

   @Override
   String n5(IBaseSlide var1, r0s var2) {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{
         super.n5(var1, var2), ' ', com.aspose.slides.ms.System.n1.u9(this.l6), ' ', com.aspose.slides.ms.System.n1.u9(this.k5)
      });
   }

   @Override
   public boolean equals(Object obj) {
      BrightnessContrast var2 = com.aspose.slides.internal.v6g.k5.n5(obj, BrightnessContrast.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5(this.l6, var2.l6) && com.aspose.slides.internal.n8e.v4.n5(this.k5, var2.k5);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      return var1;
   }
}
