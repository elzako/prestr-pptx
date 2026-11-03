package com.aspose.slides;

class x3q implements m0s {
   private com.aspose.slides.internal.x4g.m1 n5;
   private com.aspose.slides.internal.x4g.z3 l6;
   private com.aspose.slides.internal.o9b.y1 k5 = new com.aspose.slides.internal.o9b.y1();
   private com.aspose.slides.internal.o9b.f2 u3 = new com.aspose.slides.internal.o9b.f2();

   public x3q(com.aspose.slides.internal.o9b.p8 var1, double var2, boolean var4) {
      this.n5 = new com.aspose.slides.internal.x4g.m1();
      float var5 = (float)(var2 / Math.PI * 180.0);
      n5(com.aspose.slides.internal.o9b.p8.n5(var1).a6(), var5).l6(this.u3);
      com.aspose.slides.internal.o9b.c8 var6 = com.aspose.slides.internal.o9b.c8.m3().o8();
      com.aspose.slides.internal.o9b.c8 var7 = com.aspose.slides.internal.o9b.c8.w4().o8();
      if (var4) {
         com.aspose.slides.internal.o9b.c8[] var8 = new com.aspose.slides.internal.o9b.c8[]{var6};
         com.aspose.slides.internal.o9b.c8[] var9 = new com.aspose.slides.internal.o9b.c8[]{var7};
         com.aspose.slides.internal.n8e.v4.n5(var8, var9);
         var8[0].n5(var6);
         var9[0].n5(var7);
      }

      com.aspose.slides.internal.x4g.a6 var11 = new com.aspose.slides.internal.x4g.a6(4);
      var11.n5(new com.aspose.slides.internal.o9b.c8[]{var6, var6, var7, var7});
      var11.n5(new float[]{0.0F, 0.33333334F, 0.6666667F, 1.0F});
      com.aspose.slides.internal.o9b.f2 var12 = com.aspose.slides.internal.o9b.f2.n5(com.aspose.slides.internal.o9b.f2.n5(this.u3, this.u3), this.u3).a6();
      this.l6 = com.aspose.slides.internal.x4g.z3.n5(
         new com.aspose.slides.internal.o9b.y1(com.aspose.slides.internal.o9b.w1.n5.u3(), var12.a6()), var6, var7, 0
      );
      this.l6.n5(var11);
      this.k5 = new com.aspose.slides.internal.o9b.y1(com.aspose.slides.internal.o9b.w1.n5.u3(), var12.a6());
      com.aspose.slides.internal.o9b.w1 var10 = new com.aspose.slides.internal.o9b.w1(0.5F * var1.l6(), 0.5F * var1.k5());
      this.n5.c8();
      this.n5.n5(var5, var10.u3(), 0);
      this.n5.l6(-(this.u3.l6() / 2.0F - var10.l6()), -(this.u3.k5() / 2.0F - var10.k5()), 0);
   }

   @Override
   public final void dispose() {
      this.l6.dispose();
   }

   @Override
   public final void n5(float var1, com.aspose.slides.internal.o9b.z1 var2) {
      var2.n5(this.n5, 0);
      var2.l6(-var1 * (this.u3.l6() + this.u3.l6()), 0.0F, 0);
      var2.l6(this.l6, this.k5.y4());
      var2.a6();
   }

   private static com.aspose.slides.internal.o9b.f2 n5(com.aspose.slides.internal.o9b.f2 var0, float var1) {
      com.aspose.slides.internal.o9b.f2 var2 = var0.a6();
      var2.n5(var2.l6() / 2.0F);
      var2.l6(var2.k5() / 2.0F);
      com.aspose.slides.internal.o9b.w1[] var3 = new com.aspose.slides.internal.o9b.w1[]{
         new com.aspose.slides.internal.o9b.w1(-var2.l6(), -var2.k5()),
         new com.aspose.slides.internal.o9b.w1(var2.l6(), -var2.k5()),
         new com.aspose.slides.internal.o9b.w1(var2.l6(), var2.k5()),
         new com.aspose.slides.internal.o9b.w1(-var2.l6(), var2.k5())
      };
      com.aspose.slides.internal.x4g.m1 var4 = new com.aspose.slides.internal.x4g.m1();
      var4.c8();
      var4.n5(var1);
      var4.n5(var3);
      com.aspose.slides.internal.o9b.w1 var5 = new com.aspose.slides.internal.o9b.w1(Float.MAX_VALUE, Float.MAX_VALUE);
      com.aspose.slides.internal.o9b.w1 var6 = new com.aspose.slides.internal.o9b.w1(-Float.MAX_VALUE, -Float.MAX_VALUE);

      for (int var7 = 0; var7 < var3.length; var7++) {
         com.aspose.slides.internal.o9b.w1 var8 = var3[var7].u3();
         var5.n5(com.aspose.slides.ms.System.q1.l6(var5.l6(), var8.l6()));
         var5.l6(com.aspose.slides.ms.System.q1.l6(var5.k5(), var8.k5()));
         var6.n5(com.aspose.slides.ms.System.q1.n5((float)(var6.l6()), (float)(var8.l6())));
         var6.l6(com.aspose.slides.ms.System.q1.n5((float)(var6.k5()), (float)(var8.k5())));
      }

      return new com.aspose.slides.internal.o9b.f2(var6.l6() - var5.l6(), var6.k5() - var5.k5());
   }
}
