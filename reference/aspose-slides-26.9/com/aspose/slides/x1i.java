package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

final class x1i extends k6 {
   public x1i(float var1) {
      super(var1, 100.0F);
   }

   public final boolean n5(e3 var1, s5u var2, GeometryShape var3, TextFrame var4) {
      if (com.aspose.slides.ms.System.d1.n5(var4.t2())) {
         return false;
      }

      g0 var5 = h4.n5(var3);
      g0 var6 = h4.n5(var4);
      if (var6 == null && var5 == null) {
         return false;
      }

      float[] var7 = var5 != null ? h4.n5(var5.k5(), var5.n5(), var5.l6()) : h4.n5(var6.k5(), var6.n5(), var6.l6());
      if (var7 == null) {
         return false;
      }

      x2i var8 = l0y.n5(var3);
      float var9 = var8 != null && var5 != null ? var8.l6() : 0.0F;
      byte var10 = 1;
      com.aspose.slides.internal.s6.r4 var11 = t4x.l6(var7).c8();
      l3f var12 = new l3f();
      com.aspose.slides.internal.o9b.y1 var13 = new com.aspose.slides.internal.o9b.y1();
      l3f[] var14 = new l3f[]{var12};
      com.aspose.slides.internal.o9b.y1[] var15 = new com.aspose.slides.internal.o9b.y1[]{var13};
      s3z.n5(var4.u3, var14, var15, var2);
      var14[0].n5(var12);
      var15[0].a6(var13);
      var2.n5(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var3.getWidth(), var3.getHeight()));
      com.aspose.slides.internal.o9b.y1 var16 = new com.aspose.slides.internal.o9b.y1();
      com.aspose.slides.internal.s6.s0 var17 = new com.aspose.slides.internal.s6.s0();
      com.aspose.slides.internal.o9b.l6 var20;
      if (!var4.h0()) {
         com.aspose.slides.internal.o9b.y1[] var18 = new com.aspose.slides.internal.o9b.y1[]{var16};
         com.aspose.slides.internal.s6.s0[] var19 = new com.aspose.slides.internal.s6.s0[]{var17};
         var20 = this.n5(var1, var2, var12.l6(), var4, var13.y4(), var18, var19);
         var18[0].a6(var16);
         var19[0].n5(var17);
         if (var5 != null) {
            var17 = new com.aspose.slides.internal.s6.s0(var3.getX() + var3.getWidth() / 2.0F, var3.getY() + var3.getHeight() / 2.0F);
         }
      } else {
         k0r var29 = new k0r(null);

         try {
            com.aspose.slides.internal.o9b.y1[] var31 = new com.aspose.slides.internal.o9b.y1[]{var16};
            var20 = var29.n5(var2, var3, var4, var31);
            var31[0].a6(var16);
         } finally {
            if (var29 != null) {
               var29.dispose();
            }
         }

         (var5 == null
               ? new com.aspose.slides.internal.s6.s0(var16.x8() + var16.s7() / 2.0F, var16.n3() + var16.k5() / 2.0F)
               : new com.aspose.slides.internal.s6.s0(var3.getX() + var3.getWidth() / 2.0F, var3.getY() + var3.getHeight() / 2.0F))
            .n5(var17);
      }

      y5x var30 = new y5x();
      var30.k5(var10);
      var30.n5(var20);
      var30.l6(var20);
      if (this.l6()) {
         var17 = new com.aspose.slides.internal.s6.s0(var3.getParentGroup().getFrame().getCenterX(), var3.getParentGroup().getFrame().getCenterY());
      }

      var30.n5(this.n5(var17.a6(), var9, var16.y4(), true, this.l6));
      com.aspose.slides.internal.s6.v3 var32 = new com.aspose.slides.internal.s6.v3(var16.s7() / 2.0F, var16.k5() / 2.0F, 0.0F);
      com.aspose.slides.internal.s6.v3 var21 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.v3 var22 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.v3[] var23 = new com.aspose.slides.internal.s6.v3[]{var21};
      com.aspose.slides.internal.s6.v3[] var24 = new com.aspose.slides.internal.s6.v3[]{var22};
      var30.h0().n5(var11.c8(), var23, var24);
      var23[0].l6(var21);
      var24[0].l6(var22);
      var32.n5(com.aspose.slides.internal.s6.w2.n5(var32.n5(), new float[]{com.aspose.slides.ms.System.q1.n5(var21.n5()), com.aspose.slides.ms.System.q1.n5(var22.n5())}));
      var32.l6(com.aspose.slides.internal.s6.w2.n5(var32.l6(), new float[]{com.aspose.slides.ms.System.q1.n5(var21.l6()), com.aspose.slides.ms.System.q1.n5(var22.l6())}));
      List var25 = new List();
      var25.addItem(var30);
      List var26 = new List();
      var26.addItem(j4u.n5());
      this.n5(var1, var3, var25, var11.c8(), var17.a6(), var32.h0(), var10, var7, var26);
      this.n5(var25);
      return true;
   }

   private com.aspose.slides.internal.o9b.l6 n5(
      e3 var1,
      s5u var2,
      l3f var3,
      TextFrame var4,
      com.aspose.slides.internal.o9b.y1 var5,
      com.aspose.slides.internal.o9b.y1[] var6,
      com.aspose.slides.internal.s6.s0[] var7
   ) {
      f1z var8 = var4.u3;
      TextFrameFormat var9 = var4.s7();
      d2k var10 = var8.l6().u3();
      d2k var11 = var8.k5().u3();
      i2h var12 = var4.a6().k5();
      byte var13 = var9.y1();
      new com.aspose.slides.internal.s6.s0();
      new com.aspose.slides.internal.s6.s0();
      com.aspose.slides.internal.s6.s0 var14;
      com.aspose.slides.internal.s6.s0 var15;
      if (var13 != 1 && var13 != 2) {
         var14 = new com.aspose.slides.internal.s6.s0(var11.n5, s3z.k5(var8));
         var15 = new com.aspose.slides.internal.s6.s0(var5.x8() + var12.l6 + var10.n5, var5.n3() + var12.k5 + var10.l6);
      } else {
         var14 = new com.aspose.slides.internal.s6.s0(s3z.k5(var8), var11.n5);
         var15 = new com.aspose.slides.internal.s6.s0(var5.x8() + var12.l6 + var10.l6, var5.n3() + var12.k5 + var10.n5);
      }

      float var16 = com.aspose.slides.ms.System.q1.l6(var11.n5, var11.l6);
      var6[0] = new com.aspose.slides.internal.o9b.y1(var15.n5() - var16, var15.l6() - var16, var14.n5() + var16 * 2.0F, var14.l6() + var16 * 2.0F);
      var7[0] = new com.aspose.slides.internal.s6.s0(var15.n5() + var14.n5() / 2.0F, var15.l6() + var14.l6() / 2.0F);
      com.aspose.slides.internal.o9b.z1 var17 = var1.a0();
      float var18 = var17 != null ? var17.m1().n5()[0] : 1.0F;
      float var19 = var17 != null ? var17.m1().n5()[3] : 1.0F;
      int var20 = com.aspose.slides.internal.v6g.k5.u3(var6[0].s7() * var18 + 0.5F, 13);
      int var21 = com.aspose.slides.internal.v6g.k5.u3(var6[0].k5() * var19 + 0.5F, 13);
      com.aspose.slides.internal.o9b.l6 var22 = new com.aspose.slides.internal.o9b.l6(var20, var21, 2498570);
      var22.n5(96.0F, 96.0F);
      com.aspose.slides.internal.o9b.z1 var23 = com.aspose.slides.internal.o9b.z1.n5(var22);

      try {
         var23.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
      } finally {
         if (var23 != null) {
            var23.dispose();
         }
      }

      d6z var24 = var3.n5().n5();
      var24.l6 = 0.0F;
      com.aspose.slides.internal.w0.c8 var25 = s3z.n5(var24.n5(), var5.y4(), var12.k5(), var13, var9.getRotationAngle(), var9.getWrapText(), var9.z1());
      com.aspose.slides.internal.w0.c8 var26 = new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, -var6[0].x8(), -var6[0].n3());
      var26.n5(var25, 0);
      r1c var27 = new r1c(var22, var6[0].s7(), var6[0].k5());

      try {
         var27.l6(var26);
         var8.n5(var27, var2);
      } finally {
         if (var27 != null) {
            var27.dispose();
         }
      }

      return var22;
   }

   public static boolean n5(TextFrame var0) {
      x2i var1 = l0y.n5(var0);
      float var2 = var1 != null ? var1.n5() : 0.0F;
      return var1 == null
         ? com.aspose.slides.ms.System.q1.n5(var2) < Float.MIN_VALUE
         : com.aspose.slides.ms.System.q1.n5(var2) < Float.MIN_VALUE && var1.h0() == null;
   }
}
