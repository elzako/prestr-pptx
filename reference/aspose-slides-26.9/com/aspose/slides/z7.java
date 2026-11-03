package com.aspose.slides;

final class z7 extends p9<AlphaReplace> implements IAlphaReplaceEffectiveData, i7b, t9f {
   z7(AlphaReplace var1) {
      super(var1);
   }

   @Override
   public final float getAlpha() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.l6(), Float.NaN) ? this.n5.l6() : 0.0F;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      z7 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, z7.class);
      return var2 == null ? false : this.getAlpha() == var2.getAlpha();
   }

   @Override
   public final c0v n5(c0v var1) {
      return AlphaReplace.n5(var1, this.getAlpha());
   }

   @Override
   public final String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.j8.n5(this).s7(), ' ', com.aspose.slides.ms.System.n1.u9(this.getAlpha())});
   }
}
