package com.aspose.slides;

public final class BiLevel extends ImageTransformOperation implements IBiLevel, i4e {
   private float l6;
   private b6 k5;

   BiLevel(float threshold, r0g parentImmediate) {
      super(parentImmediate);
      this.l6 = threshold;
      this.h0();
   }

   public final IBiLevelEffectiveData getEffective() {
      return this.l6();
   }

   final b6 l6() {
      if (this.k5 == null) {
         this.k5 = new b6(this);
      }

      return this.k5;
   }

   final float u3() {
      return this.l6;
   }

   static c0v n5(c0v var0, float var1) {
      float var2 = 255.0F * var1 / 100.0F;
      if (var1 <= 0.0F) {
         var2 = -1.0F;
      }

      for (int var3 = 0; var3 < var0.a6().length; var3 += 4) {
         float var4 = (var0.a6()[var3 + 2] & 0xFF) * 0.2126F + (var0.a6()[var3 + 1] & 0xFF) * 0.7151F + (var0.a6()[var3] & 0xFF) * 0.0722F;
         if (var4 > var2) {
            var0.a6()[var3 + 2] = -1;
            var0.a6()[var3 + 1] = -1;
            var0.a6()[var3] = -1;
         } else {
            var0.a6()[var3 + 2] = 0;
            var0.a6()[var3 + 1] = 0;
            var0.a6()[var3] = 0;
         }
      }

      return var0;
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      return n5(var1, this.u3());
   }

   @Override
   String n5(IBaseSlide var1, r0s var2) {
      return com.aspose.slides.ms.System.d1.n5(new String[]{super.n5(var1, var2), com.aspose.slides.ms.System.n1.u9(this.l6)});
   }

   @Override
   public boolean equals(Object obj) {
      BiLevel var2 = com.aspose.slides.internal.v6g.k5.n5(obj, BiLevel.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.n8e.v4.n5(this.l6, var2.l6);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
