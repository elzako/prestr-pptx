package com.aspose.slides;

final class k0 extends p9<BrightnessContrast> implements IBrightnessContrastEffectiveData, i7b, t9f {
   k0(BrightnessContrast var1) {
      super(var1);
   }

   @Override
   public final float getBrightness() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.u3(), Float.NaN) ? this.n5.u3() : 0.0F;
   }

   @Override
   public final float getContrast() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.a6(), Float.NaN) ? this.n5.a6() : 0.0F;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      k0 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, k0.class);
      return var2 == null ? false : this.getBrightness() == var2.getBrightness();
   }

   @Override
   public int hashCode() {
      return (int)(1000.0F * this.getBrightness());
   }

   @Override
   public final c0v n5(c0v var1) {
      return var1;
   }

   @Override
   public final String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.j8.n5(this).s7(), ' ', com.aspose.slides.ms.System.n1.u9(this.getBrightness())});
   }
}
