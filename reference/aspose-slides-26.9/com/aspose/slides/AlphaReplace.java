package com.aspose.slides;

public final class AlphaReplace extends ImageTransformOperation implements IAlphaReplace, i4e {
   private float l6;
   private z7 k5;

   AlphaReplace(float alpha, r0g parentImmediate) {
      super(parentImmediate);
      this.l6 = alpha;
      this.h0();
   }

   public final IAlphaReplaceEffectiveData getEffective() {
      return this.n5();
   }

   final z7 n5() {
      if (this.k5 == null) {
         this.k5 = new z7(this);
      }

      return this.k5;
   }

   final float l6() {
      return this.l6;
   }

   static c0v n5(c0v var0, float var1) {
      if (var1 < 100.0F) {
         var0.h0();
      } else {
         var0.c8();
      }

      byte var2 = (byte)com.aspose.slides.internal.n8e.v4.n5(
         com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1 * 255.0F / 100.0F), 14), 0, 255
      );

      for (int var3 = 0; var3 < var0.a6().length; var3 += 4) {
         var0.a6()[var3 + 3] = var2;
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
      AlphaReplace var2 = com.aspose.slides.internal.v6g.k5.n5(obj, AlphaReplace.class);
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
