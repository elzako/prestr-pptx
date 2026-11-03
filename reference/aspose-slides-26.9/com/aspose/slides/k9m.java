package com.aspose.slides;

class k9m extends x4g {
   public k9m(p6w var1) {
      super(var1);
   }

   public final boolean n5(com.aspose.slides.internal.o9b.y1 var1, AutoShape var2, float var3) {
      return this.l6(var1.y4(), var2, var3);
   }

   private boolean l6(com.aspose.slides.internal.o9b.y1 var1, AutoShape var2, float var3) {
      n1g var4 = this.l6().l6();
      IRotation3D var5 = var4.n3().getRotation3D();
      g0 var6 = n5(var5);
      float[] var7 = n5(var6);
      if (var7 == null) {
         return false;
      }

      com.aspose.slides.internal.s6.r4 var8 = l6(var5).c8();
      com.aspose.slides.internal.s6.r4 var9 = n5(var7).c8();
      com.aspose.slides.internal.o9b.y1 var10 = new com.aspose.slides.internal.o9b.y1();
      com.aspose.slides.internal.o9b.y1[] var11 = new com.aspose.slides.internal.o9b.y1[]{var10};
      com.aspose.slides.internal.o9b.l6 var12 = this.n5(var4, var2, var11);
      var11[0].a6(var10);
      float var13 = 0.0F;
      com.aspose.slides.internal.s6.s0 var14 = new com.aspose.slides.internal.s6.s0(var1.x8() + var1.s7() / 2.0F, var1.n3() + var1.k5() / 2.0F);
      float var15 = var2.getX() - var14.n5();
      float var16 = var2.getX() + var10.s7() - var14.n5();
      float var17 = var14.l6() - var2.getY();
      float var18 = var14.l6() - (var2.getY() + var10.k5());
      com.aspose.slides.internal.s6.v3[] var19 = new com.aspose.slides.internal.s6.v3[]{
         new com.aspose.slides.internal.s6.v3(var15, var17, var3),
         new com.aspose.slides.internal.s6.v3(var16, var17, var3),
         new com.aspose.slides.internal.s6.v3(var15, var18, var3),
         new com.aspose.slides.internal.s6.v3(var16, var18, var3)
      };
      com.aspose.slides.internal.s6.v3 var20 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 1.0F);
      com.aspose.slides.internal.s6.v3[] var21 = new com.aspose.slides.internal.s6.v3[]{var20, var20, var20, var20};
      com.aspose.slides.internal.s6.s0[] var22 = new com.aspose.slides.internal.s6.s0[]{
         new com.aspose.slides.internal.s6.s0(0.0F, 0.0F),
         new com.aspose.slides.internal.s6.s0(1.0F, 0.0F),
         new com.aspose.slides.internal.s6.s0(0.0F, 1.0F),
         new com.aspose.slides.internal.s6.s0(1.0F, 1.0F)
      };
      int[] var23 = new int[]{0, 2, 1, 1, 2, 3};
      com.aspose.slides.internal.s6.c4 var24 = new com.aspose.slides.internal.s6.c4(2);
      var24.n5(var19);
      var24.l6(var21);
      var24.n5(var22);
      var24.n5(var23);
      y5x var25 = new y5x();
      var25.n5(var12);
      var25.l6(var12);
      var25.n5(new com.aspose.slides.internal.s6.y2(var24));
      var25.n5(2);
      var25.l6(0);
      com.aspose.slides.internal.s6.v3 var26 = new com.aspose.slides.internal.s6.v3(var1.s7() / 2.0F, var1.k5() / 2.0F, 0.0F);
      com.aspose.slides.internal.s6.v3 var27 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.v3 var28 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.v3[] var29 = new com.aspose.slides.internal.s6.v3[]{var27};
      com.aspose.slides.internal.s6.v3[] var30 = new com.aspose.slides.internal.s6.v3[]{var28};
      var25.h0().n5(var9.c8(), var29, var30);
      var29[0].l6(var27);
      var30[0].l6(var28);
      var26.n5(com.aspose.slides.internal.s6.w2.n5(var26.n5(), new float[]{com.aspose.slides.ms.System.q1.n5(var27.n5()), com.aspose.slides.ms.System.q1.n5(var28.n5())}));
      var26.l6(com.aspose.slides.internal.s6.w2.n5(var26.l6(), new float[]{com.aspose.slides.ms.System.q1.n5(var27.l6()), com.aspose.slides.ms.System.q1.n5(var28.l6())}));
      var26.k5(com.aspose.slides.internal.s6.w2.n5(var26.k5(), new float[]{com.aspose.slides.ms.System.q1.n5(var27.k5()), com.aspose.slides.ms.System.q1.n5(var28.k5())}));
      com.aspose.slides.internal.s6.v8 var31 = new com.aspose.slides.internal.s6.v8(var4.d2().s7(), var4.d2().x8());
      float var32 = 0.0F;
      com.aspose.slides.internal.s6.v8 var33 = new com.aspose.slides.internal.s6.v8();
      float[] var34 = new float[]{0.0F};
      com.aspose.slides.internal.s6.v8[] var35 = new com.aspose.slides.internal.s6.v8[]{var33};
      com.aspose.slides.internal.s6.r4 var36 = t4x.n5(var7, var8.c8(), var26.h0(), var31.u3(), var34, var35).c8();
      var32 = var34[0];
      var35[0].l6(var33);
      com.aspose.slides.internal.s6.r4 var37 = com.aspose.slides.internal.s6.r4.n5(
            new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, var32),
            new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 0.0F),
            new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, 0.0F)
         )
         .c8();
      com.aspose.slides.internal.s6.v3 var38 = new com.aspose.slides.internal.s6.v3(
         var2.getX() + var10.s7() / 2.0F - var14.n5(), var14.l6() - (var2.getY() + var10.k5() / 2.0F), var3 - 0.0F
      );
      this.n5(var25, var9.c8(), var8.c8(), var37.c8(), var36.c8(), var14.a6(), var33.u3(), var38.h0());
      return true;
   }

   private com.aspose.slides.internal.o9b.l6 n5(n1g var1, AutoShape var2, com.aspose.slides.internal.o9b.y1[] var3) {
      var3[0] = new com.aspose.slides.internal.o9b.y1(var2.getX(), var2.getY(), var2.getWidth(), var2.getHeight());
      com.aspose.slides.internal.o9b.z1 var4 = var1.d2().a0();
      float var5 = var4 != null ? var4.m1().n5()[0] : 1.0F;
      float var6 = var4 != null ? var4.m1().n5()[3] : 1.0F;
      double var7 = com.aspose.slides.ms.System.q1.n5(var2.getRotation()) / 180.0 * Math.PI;
      float var9 = (float)com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.h0(var7));
      float var10 = (float)com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.c8(var7));
      float var11 = var3[0].s7() * var10 + var3[0].k5() * var9;
      float var12 = var3[0].s7() * var9 + var3[0].k5() * var10;
      var3[0].l6(var11);
      var3[0].n5(var12);
      float var13 = this.l6().u3();
      int var14 = com.aspose.slides.internal.v6g.k5.u3(var11 * var5 * this.l6().u9() * var13 + 0.5F, 13);
      int var15 = com.aspose.slides.internal.v6g.k5.u3(var12 * var6 * this.l6().u9() * var13 + 0.5F, 13);
      com.aspose.slides.internal.o9b.l6 var16 = new com.aspose.slides.internal.o9b.l6(var14, var15, 2498570);
      var16.n5(96.0F, 96.0F);
      com.aspose.slides.internal.o9b.z1 var17 = com.aspose.slides.internal.o9b.z1.n5(var16);

      try {
         var17.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
      } finally {
         if (var17 != null) {
            var17.dispose();
         }
      }

      r1c var18 = new r1c(var16, var11, var12);

      try {
         float var19 = var2.getRotation();
         com.aspose.slides.internal.w0.c8 var20 = null;
         if (var19 % 90.0F == 0.0F) {
            var20 = new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, -var3[0].x8(), -var3[0].n3());
         } else {
            if (var19 <= 180.0F) {
               var20 = new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, -var3[0].x8() + var2.getHeight() * var9, -var3[0].n3());
            } else {
               var20 = new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, -var3[0].x8(), -var3[0].n3() + var2.getWidth() * var9);
            }

            var20.n5(var2.getRotation(), new com.aspose.slides.internal.o9b.w1(var3[0].x8(), var3[0].n3()));
            var2.setRotation(0.0F);
         }

         var18.l6(var20);
         var2.e5().n5(var18, var1.d5(), InterruptionToken.getNone());
         var2.setRotation(var19);
      } finally {
         if (var18 != null) {
            var18.dispose();
         }
      }

      return var16;
   }

   private void n5(
      y5x var1,
      com.aspose.slides.internal.s6.r4 var2,
      com.aspose.slides.internal.s6.r4 var3,
      com.aspose.slides.internal.s6.r4 var4,
      com.aspose.slides.internal.s6.r4 var5,
      com.aspose.slides.internal.s6.s0 var6,
      com.aspose.slides.internal.s6.v8 var7,
      com.aspose.slides.internal.s6.v3 var8
   ) {
      com.aspose.slides.internal.s6.r4 var9 = com.aspose.slides.internal.s6.r4.n5(
            com.aspose.slides.internal.s6.r4.n5(var2, com.aspose.slides.internal.s6.r4.n5(var3, var4)), var5
         )
         .c8();
      com.aspose.slides.internal.s6.g7 var10 = var9.k5(var8.h0()).u9();
      com.aspose.slides.internal.s6.g7 var11 = com.aspose.slides.internal.s6.g7.l6(var10, var10.u3()).u9();
      com.aspose.slides.internal.s6.v8 var12 = com.aspose.slides.internal.s6.w2.n5(var11.u9(), var7.n5(), var7.l6()).u3();
      com.aspose.slides.internal.s6.s0 var13 = new com.aspose.slides.internal.s6.s0(
         var6.n5() - var7.n5() / 2.0F + var12.n5(), var6.l6() - var7.l6() / 2.0F + var12.l6()
      );
      float var14 = 1.0F / this.l6().a6();
      float var15 = 1.0F / this.l6().u3();
      com.aspose.slides.internal.s6.v8 var16 = new com.aspose.slides.internal.s6.v8(
         com.aspose.slides.internal.v6g.k5.u3(var1.a6().e2() * var14 * var15 + 0.5F, 13),
         com.aspose.slides.internal.v6g.k5.u3(var1.a6().h0() * var14 * var15 + 0.5F, 13)
      );
      float var17 = this.l6().u3() * this.l6().a6();
      this.l6().n5(var1.a6(), var13.a6(), var16.u3(), var17);
   }
}
