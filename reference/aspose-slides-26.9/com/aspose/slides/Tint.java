package com.aspose.slides;

public final class Tint extends ImageTransformOperation implements ITint, i4e {
   private float l6;
   private float k5;
   private m0r u3;

   Tint(float hue, float amount, r0g parentImmediate) {
      super(parentImmediate);
      this.l6 = hue;
      this.k5 = amount;
      this.h0();
   }

   public final ITintEffectiveData getEffective() {
      return this.l6();
   }

   final m0r l6() {
      if (this.u3 == null) {
         this.u3 = new m0r(this);
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
      float var3 = var1 / 100.0F;
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = 0.0F;

      for (int var7 = 0; var7 < var0.a6().length; var7 += 4) {
         float[] var8 = new float[]{var4};
         float[] var9 = new float[]{var5};
         float[] var10 = new float[]{var6};
         ColorFormat.n5((var0.a6()[var7 + 2] & 0xFF) / 255.0F, (var0.a6()[var7 + 1] & 0xFF) / 255.0F, (var0.a6()[var7] & 0xFF) / 255.0F, var8, var9, var10);
         var4 = var8[0];
         var5 = var9[0];
         var6 = var10[0];
         float var11 = var2 - var4;
         var11 %= 360.0F;
         if (var11 < -180.0F) {
            var11 += 360.0F;
         } else if (var11 > 180.0F) {
            var11 -= 360.0F;
         }

         float var14 = var4 + var11 * var3;
         var4 = var14 % 360.0F;
         r0s var12 = ColorFormat.u3(var4, var5, var6);
         var0.a6()[var7 + 2] = com.aspose.slides.internal.v6g.k5.n5((Object)(var12.l6 * 255.0F), 13);
         var0.a6()[var7 + 1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var12.k5 * 255.0F), 13);
         var0.a6()[var7] = com.aspose.slides.internal.v6g.k5.n5((Object)(var12.u3 * 255.0F), 13);
      }

      return var0;
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      return n5(var1, this.a6(), this.u3());
   }

   @Override
   String n5(IBaseSlide var1, r0s var2) {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{
         super.n5(var1, var2), com.aspose.slides.ms.System.n1.u9(this.l6), ' ', com.aspose.slides.ms.System.n1.u9(this.k5)
      });
   }

   @Override
   public boolean equals(Object obj) {
      Tint var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Tint.class);
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
