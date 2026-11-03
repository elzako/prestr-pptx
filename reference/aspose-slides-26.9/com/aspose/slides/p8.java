package com.aspose.slides;

final class p8 extends p9<AlphaBiLevel> implements IAlphaBiLevelEffectiveData, i7b, t9f {
   p8(AlphaBiLevel var1) {
      super(var1);
   }

   @Override
   public final float getThreshold() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getThreshold(), Float.NaN) ? this.n5.getThreshold() : 0.0F;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      p8 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, p8.class);
      return var2 == null ? false : this.getThreshold() == var2.getThreshold();
   }

   @Override
   public final c0v n5(c0v var1) {
      return AlphaBiLevel.n5(var1, this.getThreshold());
   }

   @Override
   public final String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.j8.n5(this).s7(), ' ', com.aspose.slides.ms.System.n1.u9(this.getThreshold())});
   }
}
