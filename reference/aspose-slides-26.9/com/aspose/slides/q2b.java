package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class q2b {
   protected IReflectionEffectiveData n5;

   public q2b(IReflectionEffectiveData var1) {
      if (var1 == null) {
         throw new ArgumentNullException("reflectionEffectiveData is null.");
      }

      this.n5 = var1;
   }

   public void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4, IShapeFrame var5) {
      if (var2 == null) {
         throw new ArgumentNullException("path is null.");
      }

      if (var2.h0() != 0) {
         if (var3 != null && var3.u3() != 0 || var4 != null && var4.u9()) {
            com.aspose.slides.internal.x4g.s7 var6 = (com.aspose.slides.internal.x4g.s7)var2.deepClone();

            try {
               com.aspose.slides.internal.x4g.m1 var7 = this.n5(var1);
               var6.l6(var7);
               com.aspose.slides.internal.x4g.m1 var8 = this.n5(var6, var4);
               var6.l6(var8);
               var8.n5(var7, 0);
               this.n5(var6, var6.s7().y4(), var8, var4, var3, var1);
            } finally {
               if (var6 != null) {
                  var6.dispose();
               }
            }
         }
      }
   }

   public final com.aspose.slides.internal.o9b.y1 n5(com.aspose.slides.internal.x4g.s7 var1, e3 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("shapePath is null");
      }

      com.aspose.slides.internal.x4g.s7 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.deepClone(), com.aspose.slides.internal.x4g.s7.class);
      com.aspose.slides.internal.x4g.m1 var4 = this.n5(var2);
      var3.l6(var4);
      com.aspose.slides.internal.x4g.m1 var5 = this.n5(var3, (l6v)null);
      var3.l6(var5);
      return var3.s7().y4();
   }

   protected final void n5(
      com.aspose.slides.internal.x4g.s7 var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.x4g.m1 var3, l6v var4, a1v var5, e3 var6
   ) {
      float var7 = 0.0F;
      if (var4 != null && var4.u9()) {
         var7 = (float)var4.n5();
      }

      double var8 = this.n5.getBlurRadius();
      com.aspose.slides.internal.o9b.w1 var10 = new com.aspose.slides.internal.o9b.w1(
         var2.x8() - (var7 + 2.0F + com.aspose.slides.internal.v6g.k5.u3(var8, 14)), var2.n3() - (var7 + 2.0F + com.aspose.slides.internal.v6g.k5.u3(var8, 14))
      );
      com.aspose.slides.internal.x4g.m1 var11 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var10.l6(), -var10.k5());
      var1.l6(var11);
      com.aspose.slides.internal.o9b.l6 var12 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(var2.s7() + 2.0 * (var7 + 2.0F + var8), 14),
         com.aspose.slides.internal.v6g.k5.u3(var2.k5() + 2.0 * (var7 + 2.0F + var8), 14)
      );

      try {
         if (var6.a0() != null) {
            var12.n5(var6.a0().s7(), var6.a0().x8());
         }

         com.aspose.slides.internal.o9b.z1 var13 = n2d.n5(var12, var6);

         try {
            com.aspose.slides.internal.x4g.m1 var14 = new com.aspose.slides.internal.x4g.m1();
            var14.n5(var3, 1);
            var14.n5(var11, 1);
            this.n5(var13, var1, var5, var4, var14);
         } finally {
            if (var13 != null) {
               var13.dispose();
            }
         }

         n5(var12, var2.k5(), this.n5);
         float var23 = 0.33333334F;
         if (var8 > 4.0) {
            x9p.n5(var12, var8 * var23, 4);
         }

         this.n5(var6, var12, var10.u3());
      } finally {
         if (var12 != null) {
            var12.dispose();
         }
      }
   }

   protected final void n5(
      com.aspose.slides.internal.o9b.z1 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4, com.aspose.slides.internal.x4g.m1 var5
   ) {
      if (var3 != null && var3.u3() != 0) {
         com.aspose.slides.internal.o9b.u3 var6 = d4.k5(var3);

         try {
            com.aspose.slides.internal.x4g.m1 var7 = n2d.n5(var6);
            var7.n5(var5, 1);
            n2d.n5(var6, var7);
            var1.n5(var6, var2);
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      }

      if (var4 != null && var4.u9()) {
         com.aspose.slides.internal.o9b.m3 var16 = var4.q0();

         try {
            com.aspose.slides.internal.x4g.m1 var17 = var16.t4();
            var17.n5(var5, 1);
            var16.n5(var17);
            var1.n5(var16, var2);
         } finally {
            if (var16 != null) {
               var16.dispose();
            }
         }
      }
   }

   static void n5(com.aspose.slides.internal.o9b.l6 var0, float var1, IReflectionEffectiveData var2, boolean var3, float var4) {
      l6(var0, var1, var2, var3, var4);
   }

   static void n5(com.aspose.slides.internal.o9b.l6 var0, float var1, IReflectionEffectiveData var2) {
      l6(var0, var1, var2, false, 1.0F);
   }

   private static void l6(com.aspose.slides.internal.o9b.l6 var0, float var1, IReflectionEffectiveData var2, boolean var3, float var4) {
      float var5 = 1.0F - n5(var1, (float)var2.getDistance());
      float var6 = var2.getStartReflectionOpacity() / 100.0F * var5;
      float var7 = var2.getEndReflectionOpacity() / 100.0F;
      float var8 = var2.getStartPosAlpha() / 100.0F;
      float var9 = var2.getEndPosAlpha() / 100.0F;
      float[] var10 = new float[256];

      for (int var11 = 0; var11 < 256; var11++) {
         var10[var11] = var11 / 255.0F;
      }

      int[] var26 = new int[var0.h0()];
      float[] var12 = new float[var0.h0()];

      for (int var13 = 0; var13 < var0.h0(); var13++) {
         float var14 = (float)var13 / var0.h0();
         var12[var13] = var14;
         int var15 = com.aspose.slides.internal.v6g.k5.u3((var6 + (var7 - var6) * (var14 - var8) / (var9 - var8)) * 255.0F, 13);
         var26[var13] = var15 > 255 ? 255 : (var15 < 0 ? 0 : var15);
      }

      com.aspose.slides.internal.j9e.n5 var27 = var0.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var0.e2(), var0.h0()), 3, var0.s7());
      com.aspose.slides.ms.System.x9 var28 = var27.u3();
      int var29 = com.aspose.slides.ms.System.q1.n5(var27.a6()) * var0.h0();
      byte[] var16 = new byte[var29];
      com.aspose.slides.internal.e3m.n5.n5(var28, var16, 0, var29);
      int var17 = var0.e2();
      int var18 = var0.h0();

      for (int var19 = 0; var19 < var17; var19++) {
         for (int var20 = 0; var20 < var18; var20++) {
            int var21 = (var20 * var17 + var19 << 2) + 3;
            float var22 = var12[var20];
            int var23 = var16[var21] & 255;
            if (var22 >= var8 && var22 <= var9) {
               if (var23 > 0) {
                  float var24 = var10[var23];
                  if (var3) {
                     if (var26[var20] != 0 && var24 != 0.0F) {
                        int var25 = com.aspose.slides.internal.v6g.k5.u3(
                           com.aspose.slides.ms.System.q1.a6(var26[var20] * var24 / 255.0F, 1.0F / var4) * 255.0, 14
                        );
                        var16[var21] = (byte)(var25 > 255 ? 255 : var25);
                     } else {
                        var16[var21] = 0;
                     }
                  } else {
                     var16[var21] = com.aspose.slides.internal.v6g.k5.n5((Object)(var26[var20] * var24), 13);
                  }
               }
            } else if (var22 > var9 && var23 > 0) {
               var16[var21] = 0;
            }
         }
      }

      com.aspose.slides.internal.e3m.n5.n5(var16, 0, var28, var29);
      var0.n5(var27);
   }

   static float n5(float var0, float var1) {
      float var2 = var0 / 8.0F;
      float var3 = 0.8F / var2;
      float var4 = var1 / 10.0F;
      return var3 * var4 / (var3 * var4 + 1.0F);
   }

   protected final com.aspose.slides.internal.x4g.m1 n5(e3 var1) {
      com.aspose.slides.internal.x4g.m1 var2 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
      if (!this.n5.getRotateShadowWithShape() && var1 != null) {
         com.aspose.slides.internal.w0.c8 var3 = var1.q0();
         com.aspose.slides.internal.w0.c8 var4 = var1.z3();
         var1.n5(var3, false);
         com.aspose.slides.internal.x4g.m1 var5 = com.aspose.slides.internal.n8e.n1.l6(com.aspose.slides.internal.n8e.n1.n5(var4));
         var2 = com.aspose.slides.internal.n8e.n1.l6(var3);
         var2.n5(var5, 1);
      }

      return var2;
   }

   protected final com.aspose.slides.internal.x4g.m1 n5(com.aspose.slides.internal.x4g.s7 var1, l6v var2) {
      com.aspose.slides.internal.o9b.y1 var3 = var1.s7().y4();
      com.aspose.slides.internal.x4g.s7 var4 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();

      try {
         if (var2 != null && var2.u9()) {
            com.aspose.slides.internal.n2d.y4.n5(var4, var2.q0());
         } else {
            var4.y4();
         }

         var4.s7().a6(var3);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      float var5 = (float)this.n5.getScaleHorizontal() / 100.0F;
      float var6 = (float)this.n5.getScaleVertical() / 100.0F;
      float var7 = 2.0F * (var3.n3() + var3.k5());
      float var8 = 0.0F;
      float var9 = com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.l6(var5));
      float var10 = com.aspose.slides.ms.System.q1.l6(var6);
      com.aspose.slides.internal.x4g.m1 var11 = new com.aspose.slides.internal.x4g.m1(var9, 0.0F, 0.0F, var10, var8, var7);
      com.aspose.slides.internal.x4g.m1 var12 = new com.aspose.slides.internal.x4g.m1();
      var12.k5(var3.x8(), var3.n3());
      var12.n5(com.aspose.slides.ms.System.q1.n5(var5), com.aspose.slides.ms.System.q1.n5(var6));
      var12.k5(-var3.x8(), -var3.n3());
      com.aspose.slides.internal.x4g.m1 var13 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, (float)this.n5.getDistance());
      new com.aspose.slides.internal.x4g.m1();
      com.aspose.slides.internal.x4g.m1 var14 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
      var14.n5(var11, 1);
      var14.n5(var13, 1);
      var14.n5(var12, 1);
      return var14;
   }

   protected final void n5(e3 var1, com.aspose.slides.internal.o9b.l6 var2, com.aspose.slides.internal.o9b.w1 var3) {
      if (!this.n5.getRotateShadowWithShape()) {
         com.aspose.slides.internal.w0.c8 var4 = var1.q0();
         var1.z3();
         var1.n5(
            var2,
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var3.l6()), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var3.k5()), 14)
         );
         var1.n5(var4, false);
      } else {
         var1.n5(
            var2,
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var3.l6()), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var3.k5()), 14)
         );
      }
   }
}
