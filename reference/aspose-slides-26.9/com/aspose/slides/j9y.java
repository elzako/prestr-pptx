package com.aspose.slides;

class j9y implements m0s {
   private final float[] l6;
   private final com.aspose.slides.internal.x4g.a6 k5;
   private final com.aspose.slides.internal.x4g.a6 u3;
   private com.aspose.slides.internal.o9b.y2 a6 = new com.aspose.slides.internal.o9b.y2();
   private final com.aspose.slides.internal.x4g.z3 u9;
   public final boolean n5;

   public j9y(com.aspose.slides.internal.o9b.p8 var1, boolean var2, int var3, boolean var4) {
      this.n5 = var2;
      com.aspose.slides.internal.o9b.c8 var5 = com.aspose.slides.internal.o9b.c8.m3().o8();
      com.aspose.slides.internal.o9b.c8 var6 = com.aspose.slides.internal.o9b.c8.w4().o8();
      if (var4) {
         com.aspose.slides.internal.o9b.c8[] var7 = new com.aspose.slides.internal.o9b.c8[]{var5};
         com.aspose.slides.internal.o9b.c8[] var8 = new com.aspose.slides.internal.o9b.c8[]{var6};
         com.aspose.slides.internal.n8e.v4.n5(var7, var8);
         var7[0].n5(var5);
         var8[0].n5(var6);
      }

      com.aspose.slides.internal.o9b.c8[] var9;
      if (this.n5) {
         var9 = new com.aspose.slides.internal.o9b.c8[]{var5, var5, var6, var6, var6, var5, var5};
      } else {
         var9 = new com.aspose.slides.internal.o9b.c8[]{var6, var6, var5, var5, var5, var6, var6};
      }

      this.l6 = new float[]{0.0F, 0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F};
      n5(this.n5, 0.0F, this.l6);
      this.k5 = new com.aspose.slides.internal.x4g.a6(4);
      this.k5.n5(var9);
      this.k5.n5(this.l6);
      this.u3 = new com.aspose.slides.internal.x4g.a6(4);
      this.u3.n5(var9);
      this.u3.n5(this.l6);
      this.a6 = new com.aspose.slides.internal.o9b.y2(0, 0, var1.l6(), var1.k5());
      this.u9 = com.aspose.slides.internal.x4g.z3.n5(this.a6, var5, var6, var3);
   }

   @Override
   public final void dispose() {
      this.u9.dispose();
   }

   @Override
   public final void n5(float var1, com.aspose.slides.internal.o9b.z1 var2) {
      n5(this.n5, var1, this.l6);
      this.u9.n5(this.u3);
      this.u9.n5(this.k5);
      var2.l6(this.u9, this.a6.n3());
   }

   private static void n5(boolean var0, float var1, float[] var2) {
      if (!var0) {
         var1 = 1.0F - var1;
      }

      float var3 = 0.5F * (1.0F - var1);
      float var4 = 0.5F * (1.0F + var1);
      float var5 = var3 * (1.0F - var1);
      float var6 = var4 * (1.0F - var1) + var1;
      var2[1] = var5;
      var2[2] = var3;
      var2[4] = var4;
      var2[5] = var6;
   }
}
