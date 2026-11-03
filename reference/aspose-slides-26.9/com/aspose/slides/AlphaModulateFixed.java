package com.aspose.slides;

public final class AlphaModulateFixed extends ImageTransformOperation implements IAlphaModulateFixed, i4e {
   private float l6;
   private o0 k5;

   AlphaModulateFixed(float amount, r0g parentImmediate) {
      super(parentImmediate);
      this.l6 = com.aspose.slides.internal.n8e.v4.n5(amount, 0.0F, Float.POSITIVE_INFINITY);
      this.h0();
   }

   @Override
   public final float getAmount() {
      return this.l6;
   }

   @Override
   public final void setAmount(float value) {
      this.l6 = value;
      this.h0();
   }

   public final IAlphaModulateFixedEffectiveData getEffective() {
      return this.n5();
   }

   final o0 n5() {
      if (this.k5 == null) {
         this.k5 = new o0(this);
      }

      return this.k5;
   }

   static c0v n5(c0v var0, float var1) {
      float var2 = var1 / 100.0F;
      var0.t2();

      for (int var3 = 0; var3 < var0.a6().length; var3 += 4) {
         var0.a6()[var3 + 3] = com.aspose.slides.internal.v6g.k5.n5((Object)(com.aspose.slides.internal.n8e.v4.n5((var0.a6()[var3 + 3] & 0xFF) * var2, 0.0F, 255.0F)), 13);
      }

      return var0;
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      return n5(var1, this.l6);
   }

   @Override
   String n5(IBaseSlide var1, r0s var2) {
      return com.aspose.slides.ms.System.d1.n5(new String[]{super.n5(var1, var2), com.aspose.slides.ms.System.n1.u9(this.l6)});
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      AlphaModulateFixed var2 = com.aspose.slides.internal.v6g.k5.n5(obj, AlphaModulateFixed.class);
      return var2 == null ? false : com.aspose.slides.internal.n8e.v4.n5(this.l6, var2.l6);
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
