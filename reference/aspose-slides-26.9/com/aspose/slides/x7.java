package com.aspose.slides;

class x7 extends w0v {
   private final e3x n5;
   private final e0 l6;
   private d5r k5;

   public x7(g3y var1) {
      super(var1);
      int var2 = var1.u9().getType();
      this.n5 = new e3x(this.c8(), var1.u9(), this.u3());
      if (this.n5.u3().length > 0) {
         this.n5.u3()[0].n5(true);
      }

      this.l6 = new e0(this.h0());
      this.l6.l6(this.s7());
      if (var1.u9().hasSeriesLines() && !this.l6.c8()) {
         this.k5 = new d5r(var1);
         this.n5(this.k5);
      }

      this.n5(this.n5);
      this.n5(this.l6);
   }

   @Override
   protected void n5(z5 var1) {
      a9v var2 = (a9v)var1;
      Object var3 = null;
      Object var4 = null;
      a9v[] var5 = new a9v[]{(a9v)var3};
      a9v[] var6 = new a9v[]{(a9v)var4};
      this.n5(var2, var5, var6);
      a9v var7 = var5[0];
      a9v var8 = var6[0];
      this.n5.n3(var7);
      this.l6.n3(var8);
      if (this.k5 != null) {
         this.k5.n3(var2);
      }
   }

   @Override
   protected void l6(z5 var1) {
      a9v var2 = (a9v)var1;
      a9v var3 = null;
      a9v var4 = null;
      a9v[] var5 = new a9v[]{var3};
      a9v[] var6 = new a9v[]{var4};
      this.n5(var2, var5, var6);
      var3 = var5[0];
      var4 = var6[0];
      this.n5.a6(var3.u3() - var2.u3());
      this.n5.u9(var3.a6() - var2.a6());
      this.n5.t1();
      this.l6.a6(var4.u3() - var2.u3());
      this.l6.u9(var4.a6() - var2.a6());
      this.l6.t1();
      if (this.k5 != null && !this.l6.c8()) {
         com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1();
         com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1();
         com.aspose.slides.internal.o9b.w1[] var9 = new com.aspose.slides.internal.o9b.w1[]{var7};
         com.aspose.slides.internal.o9b.w1[] var10 = new com.aspose.slides.internal.o9b.w1[]{var8};
         this.n5(this.n5.u3()[0], var9, var10);
         var9[0].n5(var7);
         var10[0].n5(var8);
         com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1(this.l6.p8(), this.l6.f2());
         com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1(this.l6.p8(), this.l6.f2() + this.l6.d5());
         this.k5.n5(var7.u3(), var8.u3(), var11.u3(), var12.u3());
         this.k5.t1();
      }
   }

   private void n5(a9v var1, a9v[] var2, a9v[] var3) {
      float var4 = 1.0F;
      float var5 = this.x8().u9().getGapWidth() / 400.0F;
      float var6 = (this.x8().u9().getSecondPieSize() & 65535) / 200.0F;
      float var7 = var1.n5() / (var4 + var5 + var6);
      float var8 = var4 * var7;
      float var9 = var6 * var7;
      float var10 = var9 * 2.0F;
      float var11 = var1.l6();
      if (var11 < com.aspose.slides.ms.System.q1.n5((float)(var8), (float)(var10))) {
         var7 *= var11 / com.aspose.slides.ms.System.q1.n5((float)(var8), (float)(var10));
         var8 = var4 * var7;
         var9 = var6 * var7;
         var10 = var9 * 2.0F;
      }

      float var12 = var5 * var7;
      float var13 = var1.u3() + (var1.n5() - var8 - var12 - var9) / 2.0F;
      var2[0] = new a9v(var8, var8, var13, var1.a6() + (var1.l6() - var8) / 2.0F);
      var3[0] = new a9v(var9, var10, var13 + var2[0].n5() + var12, var1.a6() + (var1.l6() - var10) / 2.0F);
   }
}
