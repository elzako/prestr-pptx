package com.aspose.slides;

public final class HSL extends ImageTransformOperation implements IHSL, i4e {
   private float l6;
   private float k5;
   private float u3;
   private n0g a6;

   HSL(float hue, float saturation, float luminance, r0g parentImmediate) {
      super(parentImmediate);
      this.l6 = hue;
      this.k5 = saturation;
      this.u3 = luminance;
      this.h0();
   }

   public final IHSLEffectiveData getEffective() {
      return this.l6();
   }

   final n0g l6() {
      if (this.a6 == null) {
         this.a6 = new n0g(this);
      }

      return this.a6;
   }

   final float u3() {
      return this.l6;
   }

   final float a6() {
      return this.k5;
   }

   final float u9() {
      return this.u3;
   }

   static c0v n5(c0v var0, float var1, float var2, float var3) {
      float var4 = var2 / 100.0F;
      float var5 = var3 / 100.0F;
      float var6 = 0.0F;
      float var7 = 0.0F;
      float var8 = 0.0F;

      for (int var9 = 0; var9 < var0.a6().length; var9 += 4) {
         float[] var10 = new float[]{var6};
         float[] var11 = new float[]{var8};
         float[] var12 = new float[]{var7};
         ColorFormat.n5((var0.a6()[var9 + 2] & 0xFF) / 255.0F, (var0.a6()[var9 + 1] & 0xFF) / 255.0F, (var0.a6()[var9] & 0xFF) / 255.0F, var10, var11, var12);
         var6 = var10[0];
         var8 = var11[0];
         var7 = var12[0];
         var6 += var1 % 360.0F;
         if (var6 < 0.0F) {
            var6 += 360.0F;
         }

         r0s var13 = ColorFormat.u3(
            var6, com.aspose.slides.internal.n8e.v4.n5(var8 * var5, 0.0F, 1.0F), com.aspose.slides.internal.n8e.v4.n5(var7 * var4, 0.0F, 1.0F)
         );
         var0.a6()[var9 + 2] = com.aspose.slides.internal.v6g.k5.n5((Object)(var13.l6 * 255.0F), 13);
         var0.a6()[var9 + 1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var13.k5 * 255.0F), 13);
         var0.a6()[var9] = com.aspose.slides.internal.v6g.k5.n5((Object)(var13.u3 * 255.0F), 13);
      }

      return var0;
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      return n5(var1, this.u3(), this.a6(), this.u9());
   }

   @Override
   String n5(IBaseSlide var1, r0s var2) {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{
         super.n5(var1, var2),
         com.aspose.slides.ms.System.n1.u9(this.l6),
         ' ',
         com.aspose.slides.ms.System.n1.u9(this.k5),
         ' ',
         com.aspose.slides.ms.System.n1.u9(this.u3)
      });
   }

   @Override
   public boolean equals(Object obj) {
      HSL var2 = com.aspose.slides.internal.v6g.k5.n5(obj, HSL.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5(this.l6, var2.l6)
               && com.aspose.slides.internal.n8e.v4.n5(this.k5, var2.k5)
               && com.aspose.slides.internal.n8e.v4.n5(this.u3, var2.u3);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
