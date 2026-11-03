package com.aspose.slides;

public final class AlphaBiLevel extends ImageTransformOperation implements IAlphaBiLevel, i4e {
   private float l6;
   private p8 k5;

   AlphaBiLevel(float threshold, r0g parentImmediate) {
      super(parentImmediate);
      this.l6 = threshold;
   }

   @Override
   public final float getThreshold() {
      return this.l6;
   }

   @Override
   public final void setThreshold(float value) {
      this.l6 = value;
      this.h0();
   }

   public final IAlphaBiLevelEffectiveData getEffective() {
      return this.n5();
   }

   final p8 n5() {
      if (this.k5 == null) {
         this.k5 = new p8(this);
      }

      return this.k5;
   }

   static c0v n5(c0v var0, float var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(2.55 * var1), 14);

      for (int var3 = 0; var3 < var0.a6().length; var3 += 4) {
         var0.a6()[var3 + 3] = (byte)((var0.a6()[var3 + 3] & 255) < var2 ? 0 : 255);
      }

      return var0;
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      return n5(var1, this.getThreshold());
   }

   @Override
   String n5(IBaseSlide var1, r0s var2) {
      return com.aspose.slides.ms.System.d1.n5(new String[]{super.n5(var1, var2), com.aspose.slides.ms.System.n1.u9(this.l6)});
   }

   @Override
   public boolean equals(Object obj) {
      AlphaBiLevel var2 = com.aspose.slides.internal.v6g.k5.n5(obj, AlphaBiLevel.class);
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
