package com.aspose.slides.internal.x7u;

public class n3 extends n5 {
   private final float l6;
   private final float k5;
   private final com.aspose.slides.internal.e3j.h0 u3;

   public n3(float var1, float var2, com.aspose.slides.internal.e3j.h0 var3) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
   }

   @Override
   public com.aspose.slides.internal.z3o.a6 l6(float var1, float var2) {
      return this.n5(var1, var2, this.l6, this.k5);
   }

   @Override
   public com.aspose.slides.internal.z3o.a6 n5(float var1, float var2) {
      return this.n5(var1, var2, 1.0F - this.l6, 1.0F - this.k5);
   }

   private com.aspose.slides.internal.z3o.a6 n5(float var1, float var2, float var3, float var4) {
      com.aspose.slides.internal.z3o.a6 var5 = new com.aspose.slides.internal.z3o.a6();
      float var6 = var1 * var1 + var2 * var2;
      if (var6 != 0.0F) {
         float[] var7 = this.u3.n5(var1, var2);
         float var8 = var7[0];
         float var9 = var7[1];
         float var10 = -var8;
         float var11 = -var9;
         var5.n5 = var8 + (var10 - var8) * var3;
         var5.l6 = var9 + (var11 - var9) * var3;
         var5.k5 = var8 + (var10 - var8) * var4;
         var5.u3 = var9 + (var11 - var9) * var4;
      }

      return var5;
   }
}
