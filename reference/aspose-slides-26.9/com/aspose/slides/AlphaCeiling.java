package com.aspose.slides;

public final class AlphaCeiling extends ImageTransformOperation implements IAlphaCeiling, i4e {
   AlphaCeiling(r0g parentImmediate) {
      super(parentImmediate);
   }

   public final IAlphaCeilingEffectiveData getEffective() {
      return f2.n5;
   }

   static c0v n5(c0v var0) {
      for (int var1 = 0; var1 < var0.a6().length; var1 += 4) {
         if ((var0.a6()[var1 + 3] & 255) > 0) {
            var0.a6()[var1 + 3] = -1;
         }
      }

      return var0;
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      return n5(var1);
   }

   @Override
   public boolean equals(Object obj) {
      AlphaCeiling var2 = com.aspose.slides.internal.v6g.k5.n5(obj, AlphaCeiling.class);
      return var2 != null;
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
