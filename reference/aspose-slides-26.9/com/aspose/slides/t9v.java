package com.aspose.slides;

final class t9v extends p9<Luminance> implements ILuminanceEffectiveData, i7b, t9f {
   t9v(Luminance var1) {
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

      t9v var2 = com.aspose.slides.internal.v6g.k5.n5(obj, t9v.class);
      return var2 == null ? false : this.getBrightness() == var2.getBrightness() && this.getContrast() == var2.getContrast();
   }

   @Override
   public final c0v n5(c0v var1) {
      float var2 = (this.getBrightness() / 100.0F / 2.0F - 0.5F) * 255.0F;
      float var3 = var2 + 255.0F;
      float var4 = (float)com.aspose.slides.ms.System.q1.t2((this.getContrast() / 100.0F + 1.0F) * Math.PI / 4.0);

      for (int var5 = 0; var5 < var1.a6().length; var5 += 4) {
         var1.a6()[var5 + 2] = com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.n8e.v4.n5(((var1.a6()[var5 + 2] & 0xFF) + var2) * var4 + var3, 0.0F, 255.0F)), 13
         );
         var1.a6()[var5 + 1] = com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.n8e.v4.n5(((var1.a6()[var5 + 1] & 0xFF) + var2) * var4 + var3, 0.0F, 255.0F)), 13
         );
         var1.a6()[var5] = com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.internal.n8e.v4.n5(((var1.a6()[var5] & 0xFF) + var2) * var4 + var3, 0.0F, 255.0F)), 13
         );
      }

      return var1;
   }

   @Override
   public final String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{
         com.aspose.slides.ms.System.j8.n5(this).s7(),
         ' ',
         com.aspose.slides.ms.System.n1.u9(this.getBrightness()),
         ' ',
         com.aspose.slides.ms.System.n1.u9(this.getContrast()),
         ' '
      });
   }
}
