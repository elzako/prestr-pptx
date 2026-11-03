package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

class y9r {
   protected n1g n5;
   protected IChartWall l6;
   private float k5;
   private float u3;
   private float a6;
   private float u9;
   private float h0;
   private float c8;
   private float t2;
   private float s7;
   private float x8;
   private float n3;
   private float y4;
   private float e2;

   public y9r(n1g var1, IChartWall var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   final float l6() {
      return this.k5;
   }

   final void n5(float var1) {
      this.k5 = var1;
   }

   final float k5() {
      return this.u3;
   }

   final void l6(float var1) {
      this.u3 = var1;
   }

   final float u3() {
      return this.a6;
   }

   final void k5(float var1) {
      this.a6 = var1;
   }

   final float a6() {
      return this.u9;
   }

   final void u3(float var1) {
      this.u9 = var1;
   }

   final float u9() {
      return this.l6() + this.u3() / 2.0F;
   }

   final float h0() {
      return this.h0;
   }

   final void a6(float var1) {
      this.h0 = var1;
   }

   final float n5(boolean var1, int var2, int var3) {
      float var4 = (this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) / 100.0F;
      float var5 = 0.0F;
      if (var1) {
         var5 = this.a6() / var2;
      } else {
         var5 = this.u3() / var2;
      }

      return var5 / (var3 + var4);
   }

   final float c8() {
      float var1 = (this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F;
      return this.h0() / (1.0F + var1);
   }

   final void n5(com.aspose.slides.internal.x4g.s7 var1) {
      com.aspose.slides.internal.o9b.c8 var2 = (this.l6 == this.n5.n3().getFloor() ? this.n5.n3().n5((byte)0) : com.aspose.slides.internal.o9b.c8.u3).o8();
      w5k.k5(
         var2.o8(),
         com.aspose.slides.internal.o9b.c8.u3.o8(),
         this.n5,
         var1,
         (LineFormat)this.l6.getFormat().getLine(),
         (FillFormat)this.l6.getFormat().getFill(),
         this.l6.getFormat().getEffect(),
         1.0F
      );
      w5k.n5(var2.o8(), this.n5, var1, (LineFormat)this.l6.getFormat().getLine(), this.l6.getFormat().getEffect());
   }

   final void n5(com.aspose.slides.internal.x4g.s7 var1, float var2) {
      com.aspose.slides.internal.o9b.c8 var3 = this.t2().o8();
      w5k.n5(var3.o8(), this.n5, var1, (FillFormat)this.l6.getFormat().getFill(), var2, this.l6.getFormat().getEffect());
   }

   protected final com.aspose.slides.internal.o9b.c8 t2() {
      int var1 = this.n5.n3().getStyle() + 1;
      com.aspose.slides.internal.o9b.c8 var2 = com.aspose.slides.internal.o9b.c8.u3.o8();
      if (var1 <= 32) {
         com.aspose.slides.internal.o9b.c8.u3.n5(var2);
      } else if (var1 <= 34) {
         this.n5.n3().n5((byte)0).n5(var2);
         w5k.n5(var2.o8(), 0.2).n5(var2);
         com.aspose.slides.internal.o9b.c8.n5(255, var2.o8()).n5(var2);
      } else if (var1 <= 40) {
         int var3 = var1 - 35;
         this.n5.n3().n5((byte)var3).n5(var2);
         w5k.n5(var2.o8(), 0.2).n5(var2);
         com.aspose.slides.internal.o9b.c8.n5(255, var2.o8()).n5(var2);
      } else {
         this.n5.n3().n5((byte)0).n5(var2);
         w5k.n5(var2.o8(), 0.95).n5(var2);
         com.aspose.slides.internal.o9b.c8.n5(255, var2.o8()).n5(var2);
      }

      return var2;
   }

   public final float s7() {
      return this.c8;
   }

   public final void u9(float var1) {
      this.c8 = var1;
   }

   public final float x8() {
      return this.t2;
   }

   public final void h0(float var1) {
      this.t2 = var1;
   }

   public final float n3() {
      return this.s7;
   }

   public final void c8(float var1) {
      this.s7 = var1;
   }

   public final float y4() {
      return this.x8;
   }

   public final void t2(float var1) {
      this.x8 = var1;
   }

   public final float e2() {
      return this.n3;
   }

   public final void s7(float var1) {
      this.n3 = var1;
   }

   public final float t9() {
      return this.y4;
   }

   public final void x8(float var1) {
      this.y4 = var1;
   }

   public final float z1() {
      return this.e2;
   }

   public final void n3(float var1) {
      this.e2 = var1;
   }

   void t4() {
      if (this.l6 != null) {
         FillFormat var1 = (FillFormat)this.l6.getFormat().getFill();
         float var2 = com.aspose.slides.ms.System.q1.n5((float)(this.t9() - this.y4()), (float)(1.0F));
         float var3 = com.aspose.slides.ms.System.q1.n5((float)(this.z1() - this.e2()), (float)(1.0F));
         float var4 = 0.5F;
         com.aspose.slides.internal.o9b.y1 var5 = new com.aspose.slides.internal.o9b.y1(this.y4(), this.e2(), var2, var3);
         if (this.l6 == this.n5.n3().getBackWall()) {
            var5 = new com.aspose.slides.internal.o9b.y1(this.y4() + var4, this.e2() + var4, var2 - var4, var3);
         }

         if (this.l6 == this.n5.n3().getSideWall()) {
            var5 = new com.aspose.slides.internal.o9b.y1(this.y4() + var4, this.e2() + var4, var2, var3 - var4);
         }

         a1v var6 = null;
         com.aspose.slides.internal.x4g.s7 var7 = new com.aspose.slides.internal.x4g.s7();

         try {
            var7.l6(var5.y4());
            com.aspose.slides.internal.o9b.c8 var8 = this.t2().o8();
            var6 = w5k.n5(var8.o8(), var1, this.n5, 1.0F, var7);
         } finally {
            var7.dispose();
         }

         if (var6 != null && var6.u3() != 0 && var6.u3() != -1) {
            float var14 = this.h0();
            float var9 = 0.0F;
            com.aspose.slides.internal.o9b.y1 var10 = this.n5.o0().y4();
            if (!this.n5.n3().getRotation3D().getRightAngleAxes()) {
               var9 = this.z3();
            }

            this.n5.c8().n5(var10.y4(), var6, var5.y4(), var14, var9);
         }
      }
   }

   protected final void n5(com.aspose.slides.internal.o9b.y1 var1) {
      l6v var2 = this.q0();
      float var3 = this.h0();
      float var4 = 0.0F;
      if (!this.n5.n3().getRotation3D().getRightAngleAxes()) {
         var4 = this.z3();
      }

      j9e var5 = this.n5.c8();
      float var6 = var1.a6();
      float var7 = var1.h0();
      float var8 = var1.t2();
      float var9 = var1.l6();
      com.aspose.slides.internal.o9b.y1 var10 = this.n5.o0().y4();
      com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1(var6, var8);
      com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1(var7, var9);
      var5.n5(var10.y4(), var2, var11.u3(), var11.u3(), var3, var4);
      var5.n5(var10.y4(), var2, var12.u3(), var12.u3(), var3, var4);
      boolean var13 = this.n5.n3().getRotation3D().getRightAngleAxes();
      float var14 = var13 ? this.h0() : 0.0F;
      var5.n5(var10.y4(), var2, new com.aspose.slides.internal.o9b.w1(var6, var8), new com.aspose.slides.internal.o9b.w1(var6, var9), var3, var14);
      var5.n5(var10.y4(), var2, new com.aspose.slides.internal.o9b.w1(var7, var8), new com.aspose.slides.internal.o9b.w1(var7, var9), var3, var4);
   }

   protected final void l6(com.aspose.slides.internal.o9b.y1 var1) {
      l6v var2 = this.q0();
      float var3 = this.h0();
      float var4 = 0.0F;
      if (!this.n5.n3().getRotation3D().getRightAngleAxes()) {
         var4 = this.z3();
      }

      j9e var5 = this.n5.c8();
      boolean var6 = this.n5.n3().getRotation3D().getRightAngleAxes();
      boolean var7 = this.n5.m1() != null && this.n5.m1().c8().getShowMajorGridLines();
      com.aspose.slides.internal.o9b.y1 var8 = this.n5.o0().y4();
      com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1(var1.a6(), var1.l6());
      com.aspose.slides.internal.o9b.w1 var10 = new com.aspose.slides.internal.o9b.w1(var1.h0(), var1.l6());
      float var11 = var6 ? this.h0() : 0.0F;
      if (!var7) {
         var5.n5(var8.y4(), var2, var9.u3(), var9.u3(), var3, var4);
      }

      var5.n5(var8.y4(), var2, var10.u3(), var10.u3(), var3, var4);
      if (!var7) {
         var5.n5(var8.y4(), var2, var9.u3(), var10.u3(), var3, var4);
      }

      var5.n5(var8.y4(), var2, var9.u3(), var10.u3(), var3, var11);
   }

   protected final l6v q0() {
      com.aspose.slides.internal.o9b.c8 var1 = com.aspose.slides.internal.o9b.c8.u3.o8();
      if (this.l6 == this.n5.n3().getFloor()) {
         this.n5.n3().n5((byte)0).n5(var1);
         w5k.n5(var1.o8(), 0.75).n5(var1);
         com.aspose.slides.internal.o9b.c8.n5(255, var1.o8()).n5(var1);
      }

      LineFormat var2 = (LineFormat)this.l6.getFormat().getLine();
      return w5k.l6(var1.o8(), var2, this.n5, 0.5F);
   }

   protected final float z3() {
      float var1 = this.n5.e5().c8();
      var1 *= (this.n5.n3().getRotation3D().getDepthPercents() & 65535) / 100.0F;
      float var2 = var1 * ((this.n5.n3().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapDepth() & 65535) / 100.0F);
      return -(var1 + var2);
   }

   final boolean m1() {
      l6v var1 = this.q0();
      return !var1.u9() ? false : var1.z3().u3() == 1 && (var1.h0().s7() & 255) != 0;
   }

   void n5() {
      if (this.l6 != null) {
         throw new NotImplementedException("ChartWallRenderContext.DrawBorder3D");
      }
   }

   final com.aspose.slides.internal.o9b.y1 k7() {
      return new com.aspose.slides.internal.o9b.y1(this.l6(), this.k5() - this.a6(), this.u3(), this.a6());
   }
}
