package com.aspose.slides;

final class o0 extends p9<AlphaModulateFixed> implements IAlphaModulateFixedEffectiveData, i7b, t9f {
   o0(AlphaModulateFixed var1) {
      super(var1);
   }

   @Override
   public final float getAmount() {
      float var1 = com.aspose.slides.internal.n8e.v4.n5(this.n5.getAmount(), 0.0F, Float.POSITIVE_INFINITY);
      return !com.aspose.slides.ms.System.j8.n5(var1, Float.NaN) ? var1 : 0.0F;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      o0 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, o0.class);
      return var2 == null ? false : this.getAmount() == var2.getAmount();
   }

   @Override
   public final c0v n5(c0v var1) {
      return AlphaModulateFixed.n5(var1, this.getAmount());
   }

   @Override
   public final String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.j8.n5(this).s7(), ' ', com.aspose.slides.ms.System.n1.u9(this.getAmount())});
   }
}
