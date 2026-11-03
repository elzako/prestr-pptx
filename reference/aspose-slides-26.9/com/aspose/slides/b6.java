package com.aspose.slides;

final class b6 extends p9<BiLevel> implements IBiLevelEffectiveData, i7b, t9f {
   b6(BiLevel var1) {
      super(var1);
   }

   @Override
   public final float getThreshold() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.u3(), Float.NaN) ? this.n5.u3() : 0.0F;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      b6 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, b6.class);
      return var2 == null ? false : this.getThreshold() == var2.getThreshold();
   }

   @Override
   public final c0v n5(c0v var1) {
      return BiLevel.n5(var1, this.getThreshold());
   }

   @Override
   public final String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.j8.n5(this).s7(), ' ', com.aspose.slides.ms.System.n1.u9(this.getThreshold())});
   }
}
