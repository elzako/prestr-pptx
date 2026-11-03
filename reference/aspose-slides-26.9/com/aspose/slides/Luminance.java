package com.aspose.slides;

public final class Luminance extends ImageTransformOperation implements ILuminance, i4e {
   private float l6;
   private float k5;
   private t9v u3;

   Luminance(float brightness, float contrast, r0g parentImmediate) {
      super(parentImmediate);
      this.l6 = brightness;
      this.k5 = contrast;
      this.h0();
   }

   public final ILuminanceEffectiveData getEffective() {
      return this.l6();
   }

   final t9v l6() {
      if (this.u3 == null) {
         this.u3 = new t9v(this);
      }

      return this.u3;
   }

   final float u3() {
      return this.l6;
   }

   final float a6() {
      return this.k5;
   }

   static c0v n5(c0v var0, float var1, float var2) {
      int var3 = com.aspose.slides.internal.v6g.k5.u3(var1 * 128.0F / 100.0F, 13);
      int var4 = com.aspose.slides.internal.v6g.k5.u3(var2, 13);
      int var5 = 128 * var4;
      int var6 = 100 - var4;
      int var7 = 100 + var4;

      for (long var8 = 0L; (var8 & 4294967295L) < var0.a6().length; var8 = (var8 & 4294967295L) + 4L & 4294967295L) {
         int var10 = (var0.a6()[(int)((var8 & 4294967295L) + 2L & 4294967295L)] & 255) + var3;
         int var11 = (var0.a6()[(int)((var8 & 4294967295L) + 1L & 4294967295L)] & 255) + var3;
         int var12 = (var0.a6()[(int)var8] & 255) + var3;
         if (var2 < 0.0F) {
            var10 = (var10 * var7 - var5) / 100;
            var11 = (var11 * var7 - var5) / 100;
            var12 = (var12 * var7 - var5) / 100;
         }

         if (var2 > 0.0F) {
            if (var6 != 0) {
               var10 = (var10 * 100 - var5) / var6;
               var11 = (var11 * 100 - var5) / var6;
               var12 = (var12 * 100 - var5) / var6;
            } else {
               var10 = (var10 * 100 - var5) * 256;
               var11 = (var11 * 100 - var5) * 256;
               var12 = (var12 * 100 - var5) * 256;
            }
         }

         var10 = com.aspose.slides.internal.n8e.v4.n5(var10 + var3, 0, 255);
         var11 = com.aspose.slides.internal.n8e.v4.n5(var11 + var3, 0, 255);
         var12 = com.aspose.slides.internal.n8e.v4.n5(var12 + var3, 0, 255);
         var0.a6()[(int)((var8 & 4294967295L) + 2L & 4294967295L)] = (byte)var10;
         var0.a6()[(int)((var8 & 4294967295L) + 1L & 4294967295L)] = (byte)var11;
         var0.a6()[(int)var8] = (byte)var12;
      }

      return var0;
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      return n5(var1, this.l6, this.k5);
   }

   @Override
   String n5(IBaseSlide var1, r0s var2) {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{
         super.n5(var1, var2), com.aspose.slides.ms.System.n1.u9(this.l6), ' ', com.aspose.slides.ms.System.n1.u9(this.k5)
      });
   }

   @Override
   public boolean equals(Object obj) {
      Luminance var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Luminance.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5(this.l6, var2.l6) && com.aspose.slides.internal.n8e.v4.n5(this.k5, var2.k5);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
