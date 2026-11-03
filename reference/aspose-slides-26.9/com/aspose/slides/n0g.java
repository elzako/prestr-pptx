package com.aspose.slides;

final class n0g extends p9<HSL> implements IHSLEffectiveData, i7b, t9f {
   n0g(HSL var1) {
      super(var1);
   }

   @Override
   public final float getHue() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.u3(), Float.NaN) ? this.n5.u3() : 0.0F;
   }

   @Override
   public final float getSaturation() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.a6(), Float.NaN) ? this.n5.a6() : 0.0F;
   }

   @Override
   public final float getLuminance() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.u9(), Float.NaN) ? this.n5.u9() : 0.0F;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      n0g var2 = com.aspose.slides.internal.v6g.k5.n5(obj, n0g.class);
      return var2 == null
         ? false
         : this.getHue() == var2.getHue() && this.getSaturation() == var2.getSaturation() && this.getLuminance() == var2.getLuminance();
   }

   @Override
   public final c0v n5(c0v var1) {
      return HSL.n5(var1, this.getHue(), this.getSaturation(), this.getLuminance());
   }

   @Override
   public final String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{
         com.aspose.slides.ms.System.j8.n5(this).s7(),
         ' ',
         com.aspose.slides.ms.System.n1.u9(this.getHue()),
         ' ',
         com.aspose.slides.ms.System.n1.u9(this.getSaturation()),
         ' ',
         com.aspose.slides.ms.System.n1.u9(this.getLuminance())
      });
   }
}
