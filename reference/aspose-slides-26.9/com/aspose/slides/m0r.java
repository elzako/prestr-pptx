package com.aspose.slides;

final class m0r extends p9<Tint> implements ITintEffectiveData, i7b, t9f {
   m0r(Tint var1) {
      super(var1);
   }

   @Override
   public final float getHue() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.u3(), Float.NaN) ? this.n5.u3() : 0.0F;
   }

   @Override
   public final float getAmount() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.a6(), Float.NaN) ? this.n5.a6() : 0.0F;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      m0r var2 = com.aspose.slides.internal.v6g.k5.n5(obj, m0r.class);
      return var2 == null ? false : this.getHue() == var2.getHue() && this.getAmount() == var2.getAmount();
   }

   @Override
   public final c0v n5(c0v var1) {
      return Tint.n5(var1, this.getAmount(), this.getHue());
   }

   @Override
   public final String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{
         com.aspose.slides.ms.System.j8.n5(this).s7(),
         ' ',
         com.aspose.slides.ms.System.n1.u9(this.getHue()),
         ' ',
         com.aspose.slides.ms.System.n1.u9(this.getAmount())
      });
   }
}
