package com.aspose.slides.internal.h2;

public class l6 {
   public float n5 = 0.0F;
   public float l6 = 0.0F;
   public float k5 = 0.0F;
   public float u3 = 0.0F;
   public float a6 = 0.0F;
   public float u9 = 0.0F;
   public float h0 = 0.0F;
   public float c8 = 0.0F;

   public final boolean n5() {
      return this.n5 != 0.0F
         || this.l6 != 0.0F
         || this.k5 != 0.0F
         || this.u3 != 0.0F
         || this.a6 != 0.0F
         || this.u9 != 0.0F
         || this.h0 != 0.0F
         || this.c8 != 0.0F;
   }

   private static float n5(com.aspose.slides.internal.e5.w1 var0, int var1) {
      a5 var2 = var0.l6(var1);
      return var2 != null ? (float)var2.c8().n5() / 1000.0F : 0.0F;
   }

   private static void n5(float[] var0, float[] var1) {
      if ((var0[0] != 0.0F || var1[0] != 0.0F) && (var0[0] == 0.0F || var1[0] == 0.0F)) {
         if (var0[0] == 0.0F) {
            var0[0] = var1[0];
         } else if (var1[0] == 0.0F) {
            var1[0] = var0[0];
         }
      }
   }

   public final void n5(com.aspose.slides.internal.e5.w1 var1) {
      this.n5 = n5(var1, 289);
      this.l6 = n5(var1, 290);
      float[] var2 = new float[]{this.n5};
      float[] var3 = new float[]{this.l6};
      n5(var2, var3);
      this.n5 = var2[0];
      this.l6 = var3[0];
      this.k5 = n5(var1, 291);
      this.u3 = n5(var1, 292);
      float[] var4 = new float[]{this.k5};
      float[] var5 = new float[]{this.u3};
      n5(var4, var5);
      this.k5 = var4[0];
      this.u3 = var5[0];
      this.a6 = n5(var1, 293);
      this.u9 = n5(var1, 294);
      float[] var6 = new float[]{this.a6};
      float[] var7 = new float[]{this.u9};
      n5(var6, var7);
      this.a6 = var6[0];
      this.u9 = var7[0];
      this.h0 = n5(var1, 295);
      this.c8 = n5(var1, 296);
      float[] var8 = new float[]{this.h0};
      float[] var9 = new float[]{this.c8};
      n5(var8, var9);
      this.h0 = var8[0];
      this.c8 = var9[0];
   }
}
