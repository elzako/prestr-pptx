package com.aspose.slides;

class x4g {
   private boolean n5;
   private final p6w l6;

   public x4g(p6w var1) {
      this.l6 = var1;
      this.n5(false);
   }

   static com.aspose.slides.internal.o9b.y1 n5(n1g var0, com.aspose.slides.internal.o9b.y1 var1, com.aspose.slides.internal.o9b.y1 var2, float var3) {
      IRotation3D var4 = var0.n3().getRotation3D();
      g0 var5 = n5(var4);
      float[] var6 = n5(var5);
      if (var6 == null) {
         return var2;
      }

      com.aspose.slides.internal.s6.r4 var7 = l6(var4).c8();
      com.aspose.slides.internal.s6.r4 var8 = n5(var6).c8();
      com.aspose.slides.internal.s6.s0 var9 = new com.aspose.slides.internal.s6.s0(var1.x8() + var1.s7() / 2.0F, var1.n3() + var1.k5() / 2.0F);
      com.aspose.slides.internal.s6.v3[] var10 = new com.aspose.slides.internal.s6.v3[]{
         new com.aspose.slides.internal.s6.v3(var2.a6() - var9.n5(), var9.l6() - var2.t2(), var3),
         new com.aspose.slides.internal.s6.v3(var2.h0() - var9.n5(), var9.l6() - var2.t2(), var3),
         new com.aspose.slides.internal.s6.v3(var2.a6() - var9.n5(), var9.l6() - var2.l6(), var3),
         new com.aspose.slides.internal.s6.v3(var2.h0() - var9.n5(), var9.l6() - var2.l6(), var3)
      };
      com.aspose.slides.internal.s6.v3 var11 = new com.aspose.slides.internal.s6.v3(var1.s7() / 2.0F, var1.k5() / 2.0F, 0.0F);

      for (com.aspose.slides.internal.s6.v3 var15 : var10) {
         com.aspose.slides.internal.s6.v3 var16 = var8.n5(var15.h0()).h0();
         var11.n5(com.aspose.slides.internal.s6.w2.n5(var11.n5(), com.aspose.slides.ms.System.q1.n5(var16.n5())));
         var11.l6(com.aspose.slides.internal.s6.w2.n5(var11.l6(), com.aspose.slides.ms.System.q1.n5(var16.l6())));
         var11.k5(com.aspose.slides.internal.s6.w2.n5(var11.k5(), com.aspose.slides.ms.System.q1.n5(var16.k5())));
      }

      com.aspose.slides.internal.s6.v8 var34 = new com.aspose.slides.internal.s6.v8(var0.d2().s7(), var0.d2().x8());
      float var35 = 0.0F;
      com.aspose.slides.internal.s6.v8 var37 = new com.aspose.slides.internal.s6.v8();
      float[] var38 = new float[]{0.0F};
      com.aspose.slides.internal.s6.v8[] var39 = new com.aspose.slides.internal.s6.v8[]{var37};
      com.aspose.slides.internal.s6.r4 var17 = t4x.n5(var6, var7.c8(), var11.h0(), var34.u3(), var38, var39).c8();
      var35 = var38[0];
      var39[0].l6(var37);
      com.aspose.slides.internal.s6.r4 var18 = com.aspose.slides.internal.s6.r4.n5(
            new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, var35),
            new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 0.0F),
            new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, 0.0F)
         )
         .c8();
      com.aspose.slides.internal.s6.r4 var19 = com.aspose.slides.internal.s6.r4.n5(
            com.aspose.slides.internal.s6.r4.n5(var8, com.aspose.slides.internal.s6.r4.n5(var7, var18)), var17
         )
         .c8();
      float var20 = var9.n5() - var37.n5() / 2.0F;
      float var21 = var9.l6() - var37.l6() / 2.0F;
      float var22 = Float.MAX_VALUE;
      float var23 = Float.MAX_VALUE;
      float var24 = -Float.MAX_VALUE;
      float var25 = -Float.MAX_VALUE;

      for (com.aspose.slides.internal.s6.v3 var29 : var10) {
         com.aspose.slides.internal.s6.g7 var30 = var19.k5(var29.h0()).u9();
         com.aspose.slides.internal.s6.v8 var31 = com.aspose.slides.internal.s6.w2.n5(
               com.aspose.slides.internal.s6.g7.l6(var30, var30.u3()).u9(), var37.n5(), var37.l6()
            )
            .u3();
         float var32 = var31.n5() + var20;
         float var33 = var31.l6() + var21;
         if (var32 < var22) {
            var22 = var32;
         }

         if (var32 > var24) {
            var24 = var32;
         }

         if (var33 < var23) {
            var23 = var33;
         }

         if (var33 > var25) {
            var25 = var33;
         }
      }

      return new com.aspose.slides.internal.o9b.y1(var22, var23, var24 - var22, var25 - var23);
   }

   protected final void n5(
      y5x var1,
      com.aspose.slides.internal.s6.r4 var2,
      com.aspose.slides.internal.s6.r4 var3,
      com.aspose.slides.internal.s6.r4 var4,
      com.aspose.slides.internal.s6.r4 var5,
      com.aspose.slides.internal.s6.v3 var6,
      com.aspose.slides.internal.s6.s0 var7,
      com.aspose.slides.internal.s6.v8 var8
   ) {
      com.aspose.slides.internal.s6.b3 var9 = new com.aspose.slides.internal.s6.b3();
      var9.k5(var2.c8());
      var9.n5(com.aspose.slides.internal.s6.r4.n5(var3, var4).c8());
      var9.l6(var5.c8());
      var9.n5(1);
      com.aspose.slides.internal.s6.w1 var10 = com.aspose.slides.internal.s6.w1.h0();
      var10.n5(new com.aspose.slides.internal.s6.v3(0.3F, 0.3F, 0.3F));
      var10.k5(var2.l6(var6.u9().h0()).h0());
      var10.u3(new com.aspose.slides.internal.s6.v3(0.3F));
      var10.n5(5.0F);
      float var11 = this.l6().u3() * this.l6().a6();
      int var12 = com.aspose.slides.internal.v6g.k5.u3(var8.n5() * var11, 13);
      int var13 = com.aspose.slides.internal.v6g.k5.u3(var8.l6() * var11, 13);
      com.aspose.slides.internal.s6.e5 var14 = new com.aspose.slides.internal.s6.e5(var12, var13, false);
      var14.n5(0L);
      com.aspose.slides.internal.s6.o0 var15 = null;
      com.aspose.slides.internal.s6.o0 var16 = null;
      var1.k5(0);
      com.aspose.slides.internal.s6.o0[] var17 = new com.aspose.slides.internal.s6.o0[]{var15};
      com.aspose.slides.internal.s6.o0[] var18 = new com.aspose.slides.internal.s6.o0[]{var16};
      m7b.n5(var1, var9, var10, var17, var18);
      var15 = var17[0];
      var16 = var18[0];
      var14.n5(var1.h0(), var15, var16);
      com.aspose.slides.internal.o9b.l6 var19 = new com.aspose.slides.internal.o9b.l6(var12, var13);

      try {
         com.aspose.slides.internal.j9e.n5 var20 = var19.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var19.e2(), var19.h0()), 2, 2498570);
         int var21 = com.aspose.slides.ms.System.q1.n5(var20.a6()) * var19.h0();
         com.aspose.slides.internal.e3m.n5.n5(var14.n5(), 0, var20.u3(), var21);
         var19.n5(var20);
         this.l6().n5(var19, var7.a6(), var8.u3(), var11);
      } finally {
         if (var19 != null) {
            var19.dispose();
         }
      }
   }

   protected final com.aspose.slides.internal.s6.v3 n5(IRotation3D var1, boolean var2, boolean var3, float var4) {
      com.aspose.slides.internal.s6.v3 var5 = new com.aspose.slides.internal.s6.v3(-1.5F, -2.0F, -3.5F).u9().h0();
      float var6 = var1.getRotationY() & 65535;
      if (this.n5()) {
         new com.aspose.slides.internal.s6.v3(1.5F, 2.0F, 3.5F).u9().l6(var5);
      } else if (!var2 && var3 && var4 != 0.0F && var6 <= 180.0F) {
         new com.aspose.slides.internal.s6.v3(2.0F, 1.0F, 0.0F).u9().l6(var5);
      }

      return var5;
   }

   protected static g0 n5(IRotation3D var0) {
      g0 var1 = new g0();
      if (var0.getRightAngleAxes()) {
         var1.n5(new float[]{0.0F, 0.0F, 0.0F});
         var1.n5(46);
      } else {
         float var2 = var0.getRotationY() & 65535;
         float var3 = var0.getRotationX();
         var1.n5(new float[]{var3, var2, 0.0F});
         if ((var0.getPerspective() & 255) != 0) {
            var1.n5((var0.getPerspective() & 0xFF) * 0.5F);
         } else {
            var1.n5(0.05F);
         }

         var1.n5(53);
      }

      return var1;
   }

   protected static float[] n5(g0 var0) {
      int var1 = var0.k5();
      float[] var2 = var0.n5();
      float var3 = var0.l6();
      float[] var4 = null;
      float[][] var5 = new float[][]{(float[])var4};
      boolean var6 = !h4.n5.tryGetValue(var1, var5);
      var4 = var5[0];
      if (var6) {
         return null;
      }

      var4 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(var4)).deepClone(), float[].class);
      if (var2 != null) {
         ((float[])var4)[0] = var2[0];
         ((float[])var4)[1] = var2[1];
         ((float[])var4)[2] = var2[2];
      } else {
         ((float[])var4)[0] = 0.0F;
         ((float[])var4)[1] = 0.0F;
         ((float[])var4)[2] = 0.0F;
      }

      if (((float[])var4)[3] != 0.0F && !com.aspose.slides.ms.System.n1.k5(var3)) {
         ((float[])var4)[3] = var3;
      }

      return (float[])var4;
   }

   protected static com.aspose.slides.internal.s6.r4 l6(IRotation3D var0) {
      float var1 = 0.0F;
      float var2 = 0.0F;
      if (var0.getRightAngleAxes()) {
         var1 = var0.getRotationY() & 65535;
         var2 = var0.getRotationX();
      }

      float var3 = -((float)com.aspose.slides.ms.System.q1.h0(com.aspose.slides.internal.s6.w2.n5(var1)));
      float var4 = -((float)com.aspose.slides.ms.System.q1.h0(com.aspose.slides.internal.s6.w2.n5(var2)));
      return new com.aspose.slides.internal.s6.r4(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, var3, var4, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F);
   }

   protected static com.aspose.slides.internal.s6.r4 n5(float[] var0) {
      com.aspose.slides.internal.s6.r4 var1 = com.aspose.slides.internal.s6.r4.n5(com.aspose.slides.internal.s6.w2.n5(var0[0])).c8();
      com.aspose.slides.internal.s6.r4 var2 = com.aspose.slides.internal.s6.r4.l6(com.aspose.slides.internal.s6.w2.n5(-var0[1])).c8();
      com.aspose.slides.internal.s6.r4 var3 = com.aspose.slides.internal.s6.r4.k5(com.aspose.slides.internal.s6.w2.n5(var0[2])).c8();
      return com.aspose.slides.internal.s6.r4.n5(com.aspose.slides.internal.s6.r4.n5(var2, var1), var3);
   }

   protected final com.aspose.slides.ms.System.o5<com.aspose.slides.internal.o9b.c8> n5(a1v var1, l6v var2) {
      com.aspose.slides.ms.System.o5 var3 = new com.aspose.slides.ms.System.o5();
      if (var1 != null && var1.u3() == 1) {
         var3 = new com.aspose.slides.ms.System.o5<>(var1.n5().o8());
      } else if (var2 != null && var2.u9() && var2.c8().u3() == 1) {
         var3 = new com.aspose.slides.ms.System.o5<>(var2.h0().o8());
      }

      if (com.aspose.slides.ms.System.o5.l6(var3, null)
         && com.aspose.slides.internal.o9b.c8.n5((com.aspose.slides.internal.o9b.c8)var3.n5(), com.aspose.slides.internal.o9b.c8.u3)) {
         var3 = new com.aspose.slides.ms.System.o5();
      }

      return var3;
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   final p6w l6() {
      return this.l6;
   }
}
