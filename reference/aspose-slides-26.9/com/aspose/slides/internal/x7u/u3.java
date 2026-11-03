package com.aspose.slides.internal.x7u;

public class u3 extends n5 {
   private final float u3;
   protected float l6;
   protected float k5;

   public u3(float var1, float var2, float var3) {
      this.u3 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public com.aspose.slides.internal.z3o.a6 l6(float var1, float var2) {
      return this.n5(var1, var2, this.l6, this.k5);
   }

   @Override
   public com.aspose.slides.internal.z3o.a6 n5(float var1, float var2) {
      return this.n5(var1, var2, 1.0F - this.l6, 1.0F - this.k5);
   }

   protected com.aspose.slides.internal.z3o.a6 n5(float var1, float var2, float var3, float var4) {
      com.aspose.slides.internal.z3o.a6 var5 = new com.aspose.slides.internal.z3o.a6();
      float var6 = var1 * var1 + var2 * var2;
      if (var6 != 0.0F) {
         var6 = (float)Math.sqrt(var6);
         float var7 = var2 * this.u3 / var6;
         float var8 = -(var1 * this.u3) / var6;
         float var9 = -var7;
         float var10 = -var8;
         var5.n5 = var7 + (var9 - var7) * var3;
         var5.l6 = var8 + (var10 - var8) * var3;
         var5.k5 = var7 + (var9 - var7) * var4;
         var5.u3 = var8 + (var10 - var8) * var4;
      }

      return var5;
   }
}
