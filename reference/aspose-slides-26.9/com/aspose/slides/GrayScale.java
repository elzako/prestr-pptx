package com.aspose.slides;

public final class GrayScale extends ImageTransformOperation implements IGrayScale, i4e {
   GrayScale(r0g parentImmediate) {
      super(parentImmediate);
   }

   public final IGrayScaleEffectiveData getEffective() {
      return z8t.n5;
   }

   static c0v n5(c0v var0) {
      for (int var1 = 0; var1 < var0.a6().length; var1 += 4) {
         int var2 = com.aspose.slides.internal.v6g.k5.u3(
            (var0.a6()[var1 + 2] & 0xFF) * 0.2126 + (var0.a6()[var1 + 1] & 0xFF) * 0.7151 + (var0.a6()[var1] & 0xFF) * 0.0722, 14
         );
         var0.a6()[var1 + 2] = (byte)var2;
         var0.a6()[var1 + 1] = (byte)var2;
         var0.a6()[var1] = (byte)var2;
      }

      return var0;
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      return n5(var1);
   }

   @Override
   public boolean equals(Object obj) {
      GrayScale var2 = com.aspose.slides.internal.v6g.k5.n5(obj, GrayScale.class);
      return var2 != null;
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
