package com.aspose.slides;

public final class AlphaModulate extends ImageTransformOperation implements IAlphaModulate, i4e {
   AlphaModulate(r0g parentImmediate) {
      super(parentImmediate);
   }

   public final IAlphaModulateEffectiveData getEffective() {
      return b3.n5;
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      return var1;
   }

   @Override
   public boolean equals(Object obj) {
      AlphaModulate var2 = com.aspose.slides.internal.v6g.k5.n5(obj, AlphaModulate.class);
      return var2 != null;
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
