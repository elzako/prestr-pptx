package com.aspose.slides;

class b0 extends x4g {
   public b0(p6w var1) {
      super(var1);
   }

   public final void n5(k4l var1, com.aspose.slides.internal.o9b.y1 var2, a1v var3) {
      this.n5(this.l6().l6(), var2.y4(), var3, null, var1.n5(), var1.l6());
   }

   private void n5(n1g var1, com.aspose.slides.internal.o9b.y1 var2, a1v var3, l6v var4, k8g var5, com.aspose.slides.internal.s6.k7 var6) {
      IRotation3D var7 = var1.n3().getRotation3D();
      g0 var8 = n5(var7);
      float[] var9 = n5(var8);
      if (var9 != null) {
         com.aspose.slides.internal.s6.r4 var10 = l6(var7).c8();
         com.aspose.slides.internal.s6.r4 var11 = n5(var9).c8();
         y5x var12 = new y5x();
         boolean var13 = false;
         if (var3 != null && var3.u3() != 0 && var3.u3() != -1) {
            var12.n5(k6.n5(var3.n5().o8()));
            var13 = true;
         }

         com.aspose.slides.ms.System.o5 var14 = this.n5(var3, var4).k5();
         var12.l6(com.aspose.slides.ms.System.o5.l6(var14, null) ? k6.n5(((com.aspose.slides.internal.o9b.c8)var14.n5()).o8()) : var12.a6());
         if (var4 != null && var4.u9() && var4.c8() != null && var4.c8().u3() != 0 && var4.c8().u3() != -1) {
            if (com.aspose.slides.internal.o9b.c8.l6(var4.h0(), com.aspose.slides.internal.o9b.c8.u3)) {
               var12.l6(k6.n5(var4.h0().o8()));
            }

            if (var12.a6() == null) {
               var12.n5(var12.u9());
            }
         }

         if (var12.a6() != null || var12.u9() != null) {
            var12.n5((var13 ? 2 : 0) | 4);
            var12.l6(0);
            com.aspose.slides.internal.s6.s0 var15 = new com.aspose.slides.internal.s6.s0(0.0F, 0.0F);
            com.aspose.slides.internal.s6.v3 var16 = new com.aspose.slides.internal.s6.v3(var2.s7() / 2.0F, var2.k5() / 2.0F, 0.0F);
            com.aspose.slides.internal.s6.s0 var17 = new com.aspose.slides.internal.s6.s0(var2.x8() + var2.s7() / 2.0F, var2.n3() + var2.k5() / 2.0F);
            com.aspose.slides.internal.s6.s0.n5(var17, var15).n5(var17);
            var12.n5(this.n5(var5, var2.y4()));
            com.aspose.slides.internal.s6.v3 var18 = new com.aspose.slides.internal.s6.v3();
            com.aspose.slides.internal.s6.v3 var19 = new com.aspose.slides.internal.s6.v3();
            com.aspose.slides.internal.s6.v3[] var20 = new com.aspose.slides.internal.s6.v3[]{var18};
            com.aspose.slides.internal.s6.v3[] var21 = new com.aspose.slides.internal.s6.v3[]{var19};
            var12.h0().n5(var11.c8(), var20, var21);
            var20[0].l6(var18);
            var21[0].l6(var19);
            var16.n5(
               com.aspose.slides.internal.s6.w2.n5(var16.n5(), new float[]{com.aspose.slides.ms.System.q1.n5(var18.n5()), com.aspose.slides.ms.System.q1.n5(var19.n5())})
            );
            var16.l6(
               com.aspose.slides.internal.s6.w2.n5(var16.l6(), new float[]{com.aspose.slides.ms.System.q1.n5(var18.l6()), com.aspose.slides.ms.System.q1.n5(var19.l6())})
            );
            var16.k5(
               com.aspose.slides.internal.s6.w2.n5(var16.k5(), new float[]{com.aspose.slides.ms.System.q1.n5(var18.k5()), com.aspose.slides.ms.System.q1.n5(var19.k5())})
            );
            com.aspose.slides.internal.s6.v8 var22 = new com.aspose.slides.internal.s6.v8(var1.d2().s7(), var1.d2().x8());
            float var23 = 0.0F;
            com.aspose.slides.internal.s6.v8 var24 = new com.aspose.slides.internal.s6.v8();
            float[] var25 = new float[]{0.0F};
            com.aspose.slides.internal.s6.v8[] var26 = new com.aspose.slides.internal.s6.v8[]{var24};
            com.aspose.slides.internal.s6.r4 var27 = t4x.n5(var9, var10.c8(), var16.h0(), var22.u3(), var25, var26).c8();
            var23 = var25[0];
            var26[0].l6(var24);
            com.aspose.slides.internal.s6.v3 var28 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, var23);
            com.aspose.slides.internal.s6.v3 var29 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 0.0F);
            com.aspose.slides.internal.s6.v3 var30 = new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, 0.0F);
            com.aspose.slides.internal.s6.r4 var31 = com.aspose.slides.internal.s6.r4.n5(var28.h0(), var29.h0(), var30.h0()).c8();
            com.aspose.slides.internal.s6.v3 var32 = new com.aspose.slides.internal.s6.v3(1.2F, -1.5F, 1.5F).u9().h0();
            this.n5(var12, var11.c8(), var10.c8(), var31.c8(), var27.c8(), var32.h0(), var17.a6(), var24.u3(), var6);
         }
      }
   }

   private com.aspose.slides.internal.s6.y2 n5(k8g var1, com.aspose.slides.internal.o9b.y1 var2) {
      com.aspose.slides.internal.s6.y2 var3 = new com.aspose.slides.internal.s6.y2();
      com.aspose.slides.internal.s6.s0 var4 = new com.aspose.slides.internal.s6.s0(0.0F, 0.0F);
      com.aspose.slides.internal.s6.s0 var5 = new com.aspose.slides.internal.s6.s0(var2.x8() + var2.s7() / 2.0F, var2.n3() + var2.k5() / 2.0F);
      com.aspose.slides.internal.s6.s0.n5(var5, var4).n5(var5);
      com.aspose.slides.internal.s6.v3[] var6 = var1.n5(var5.a6());
      com.aspose.slides.internal.s6.v3[] var7 = (com.aspose.slides.internal.s6.v3[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.v3.class), 3)
      );
      com.aspose.slides.internal.s6.v3.n5(var1.c8()).l6(var7[0]);
      var7[0].l6(var7[1]);
      var7[0].l6(var7[2]);
      float var8 = var6[0].n5();
      float var9 = var6[0].l6();
      float var10 = var6[0].n5();
      float var11 = var6[0].l6();

      for (com.aspose.slides.internal.s6.v3 var15 : var6) {
         if (var8 > var15.n5()) {
            var8 = var15.n5();
         }

         if (var9 > var15.l6()) {
            var9 = var15.l6();
         }

         if (var10 < var15.n5()) {
            var10 = var15.n5();
         }

         if (var11 < var15.l6()) {
            var11 = var15.l6();
         }
      }

      com.aspose.slides.internal.s6.s0 var18 = new com.aspose.slides.internal.s6.s0(var8, var9);
      com.aspose.slides.internal.s6.s0 var19 = new com.aspose.slides.internal.s6.s0(var10, var11);
      com.aspose.slides.internal.s6.s0 var20 = com.aspose.slides.internal.s6.s0.l6(var19, var18).a6();
      int[] var21 = var1.h0();
      com.aspose.slides.internal.s6.s0[] var16 = (com.aspose.slides.internal.s6.s0[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.s0.class), 3)
      );
      var16[0].n5((var6[0].n5() - var18.n5()) / var20.n5());
      var16[0].l6(var20.l6() != 0.0F ? (var6[0].l6() - var18.l6()) / var20.l6() : 1.0F);
      var16[1].n5((var6[1].n5() - var18.n5()) / var20.n5());
      var16[1].l6(var20.l6() != 0.0F ? (var6[1].l6() - var18.l6()) / var20.l6() : 1.0F);
      var16[2].n5((var6[2].n5() - var18.n5()) / var20.n5());
      var16[2].l6(var20.l6() != 0.0F ? (var6[2].l6() - var18.l6()) / var20.l6() : 1.0F);
      com.aspose.slides.internal.s6.c4 var17 = new com.aspose.slides.internal.s6.c4(4);
      var17.n5(var6);
      var17.n5(var21);
      var17.l6(var7);
      var17.n5(var16);
      var3.n5(var17);
      return var3;
   }

   private void n5(
      y5x var1,
      com.aspose.slides.internal.s6.r4 var2,
      com.aspose.slides.internal.s6.r4 var3,
      com.aspose.slides.internal.s6.r4 var4,
      com.aspose.slides.internal.s6.r4 var5,
      com.aspose.slides.internal.s6.v3 var6,
      com.aspose.slides.internal.s6.s0 var7,
      com.aspose.slides.internal.s6.v8 var8,
      com.aspose.slides.internal.s6.k7 var9
   ) {
      com.aspose.slides.internal.s6.b3 var10 = new com.aspose.slides.internal.s6.b3();
      var10.k5(var2.c8());
      var10.n5(com.aspose.slides.internal.s6.r4.n5(var3, var4).c8());
      var10.l6(var5.c8());
      var10.n5(0);
      com.aspose.slides.internal.s6.w1 var11 = com.aspose.slides.internal.s6.w1.h0();
      var11.n5(new com.aspose.slides.internal.s6.v3(0.3F, 0.3F, 0.3F));
      var11.k5(var2.l6(var6.u9().h0()).h0());
      var11.u3(new com.aspose.slides.internal.s6.v3(0.3F));
      var11.n5(5.0F);
      float var12 = this.l6().u3() * this.l6().a6();
      int var13 = com.aspose.slides.internal.v6g.k5.u3(var8.n5() * var12, 13);
      int var14 = com.aspose.slides.internal.v6g.k5.u3(var8.l6() * var12, 13);
      com.aspose.slides.internal.s6.e5 var15 = new com.aspose.slides.internal.s6.e5(var13, var14, false);
      var15.n5(0L);
      com.aspose.slides.internal.s6.m1 var16 = new com.aspose.slides.internal.s6.m1(var9, var10, var11, 7);
      var15.n5(var1.h0(), var16);
      com.aspose.slides.internal.o9b.l6 var17 = new com.aspose.slides.internal.o9b.l6(var13, var14);

      try {
         com.aspose.slides.internal.j9e.n5 var18 = var17.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var17.e2(), var17.h0()), 2, 2498570);
         int var19 = com.aspose.slides.ms.System.q1.n5(var18.a6()) * var17.h0();
         com.aspose.slides.internal.e3m.n5.n5(var15.n5(), 0, var18.u3(), var19);
         var17.n5(var18);
         this.l6().n5(var17, var7.a6(), var8.u3(), var12);
      } finally {
         if (var17 != null) {
            var17.dispose();
         }
      }
   }
}
