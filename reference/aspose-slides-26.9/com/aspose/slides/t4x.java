package com.aspose.slides;

class t4x {
   public static com.aspose.slides.internal.s6.r4 n5(float[] var0) {
      float var1 = var0[4];
      float var2 = var0[5];
      double var3 = com.aspose.slides.internal.s6.w2.n5((double)var1);
      float var5 = (float)com.aspose.slides.ms.System.q1.c8(var3) * var2;
      float var6 = (float)com.aspose.slides.ms.System.q1.h0(var3) * var2;
      return new com.aspose.slides.internal.s6.r4(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, var5, var6, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
   }

   public static com.aspose.slides.internal.s6.r4 l6(float[] var0) {
      com.aspose.slides.internal.s6.r4 var1 = com.aspose.slides.internal.s6.r4.n5(com.aspose.slides.internal.s6.w2.n5(var0[0])).c8();
      com.aspose.slides.internal.s6.r4 var2 = com.aspose.slides.internal.s6.r4.l6(com.aspose.slides.internal.s6.w2.n5(-var0[1])).c8();
      com.aspose.slides.internal.s6.r4 var3 = com.aspose.slides.internal.s6.r4.k5(com.aspose.slides.internal.s6.w2.n5(var0[2])).c8();
      return com.aspose.slides.internal.s6.r4.n5(com.aspose.slides.internal.s6.r4.n5(var2, var1), var3);
   }

   public static com.aspose.slides.internal.s6.r4 n5(
      float[] var0,
      com.aspose.slides.internal.s6.r4 var1,
      com.aspose.slides.internal.s6.v3 var2,
      com.aspose.slides.internal.s6.v8 var3,
      float[] var4,
      com.aspose.slides.internal.s6.v8[] var5
   ) {
      var5[0] = new com.aspose.slides.internal.s6.v8();
      if (var0[3] < Float.MIN_VALUE) {
         float var10 = 1.0F;
         var5[0].n5(com.aspose.slides.internal.v6g.k5.u3((var2.n5() + var2.k5() * com.aspose.slides.ms.System.q1.n5(var1.a6()) + var10) * 2.0F, 13));
         var5[0].l6(com.aspose.slides.internal.v6g.k5.u3((var2.l6() + var2.k5() * com.aspose.slides.ms.System.q1.n5(var1.u9()) + var10) * 2.0F, 13));
         var4[0] = var3.l6() * 2.0F;
         float var11 = 1.0F;
         float var12 = var4[0] * 2.0F;
         return com.aspose.slides.internal.s6.r4.l6(var5[0].n5(), var5[0].l6(), var11, var12);
      } else {
         float var6 = 1.6666666F;
         var5[0].n5(com.aspose.slides.internal.v6g.k5.u3(var3.n5() * var6, 13));
         var5[0].l6(com.aspose.slides.internal.v6g.k5.u3(var3.l6() * var6, 13));
         float var7 = com.aspose.slides.internal.s6.w2.n5(var0[3] / 2.0F);
         var4[0] = var5[0].l6() * 0.5F / (float)com.aspose.slides.ms.System.q1.t2(var7);
         float var8 = 1.0F;
         float var9 = var4[0] * 2.0F;
         return com.aspose.slides.internal.s6.r4.n5(com.aspose.slides.internal.s6.w2.n5(var0[3]), (float)var5[0].n5() / var5[0].l6(), var8, var9);
      }
   }
}
