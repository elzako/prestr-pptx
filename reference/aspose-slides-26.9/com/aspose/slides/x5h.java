package com.aspose.slides;

class x5h {
   public static com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.w1 var0, float var1, float var2) {
      return var1 == 0.0F && var2 == 0.0F ? var0 : new com.aspose.slides.internal.o9b.w1(var0.l6() + var1, var0.k5() + var2);
   }

   public static boolean n5(com.aspose.slides.internal.o9b.y1 var0, com.aspose.slides.internal.o9b.y1 var1, float[] var2, float[] var3) {
      var2[0] = var3[0] = 0.0F;
      float var4 = var0.a6() - var1.a6();
      if (var4 > 0.0F) {
         var2[0] = var4;
      }

      float var5 = var0.h0() - var1.h0();
      if (var5 < 0.0F) {
         var2[0] = var5;
      }

      float var6 = var0.t2() - var1.t2();
      if (var6 > 0.0F) {
         var3[0] = var6;
      }

      float var7 = var0.l6() - var1.l6();
      if (var7 < 0.0F) {
         var3[0] = var7;
      }

      return var2[0] != 0.0F || var3[0] != 0.0F;
   }

   public static com.aspose.slides.internal.o9b.w1 n5(double var0, double var2, com.aspose.slides.internal.o9b.w1 var4) {
      double var5 = var0 * (Math.PI / 180.0) % (Math.PI * 2);
      double var7 = var2 * com.aspose.slides.ms.System.q1.c8(var5) + var4.l6();
      double var9 = var2 * com.aspose.slides.ms.System.q1.h0(var5) + var4.k5();
      return new com.aspose.slides.internal.o9b.w1((float)var7, (float)var9);
   }

   public static void n5(com.aspose.slides.internal.o9b.w1 var0, float[] var1, float[] var2, float[] var3, float[] var4) {
      var1[0] = com.aspose.slides.ms.System.q1.l6(var1[0], var0.l6());
      var3[0] = com.aspose.slides.ms.System.q1.n5((float)(var3[0]), (float)(var0.l6()));
      var2[0] = com.aspose.slides.ms.System.q1.l6(var2[0], var0.k5());
      var4[0] = com.aspose.slides.ms.System.q1.n5((float)(var4[0]), (float)(var0.k5()));
   }

   public static boolean n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2, double var3) {
      e4c var5 = new e4c(var1.l6() - var0.l6(), var1.k5() - var0.k5());
      e4c var6 = new e4c(var0.l6() - var2.l6(), var0.k5() - var2.k5());
      double var7 = var5.n5(var5.u9());
      double var9 = 2.0 * var6.n5(var5.u9());
      double var11 = var6.n5(var6.u9()) - var3 * var3;
      double var13 = var9 * var9 - 4.0 * var7 * var11;
      if (var13 < 0.0) {
         return false;
      }

      var13 = com.aspose.slides.ms.System.q1.z3(var13);
      double var15 = (-var9 - var13) / (2.0 * var7);
      double var17 = (-var9 + var13) / (2.0 * var7);
      return var15 >= 0.0 && var15 <= 1.0 ? true : var17 >= 0.0 && var17 <= 1.0;
   }

   public static com.aspose.slides.internal.o9b.y1 n5(com.aspose.slides.internal.o9b.y1[] var0) {
      if (var0.length == 0) {
         return com.aspose.slides.internal.o9b.y1.n5;
      }

      if (var0.length == 1) {
         return var0[0];
      }

      com.aspose.slides.internal.o9b.y1 var1 = var0[0].y4();
      float var2 = var1.a6();
      float var3 = var1.h0();
      float var4 = var1.t2();
      float var5 = var1.l6();

      for (int var6 = 1; var6 < var0.length; var6++) {
         com.aspose.slides.internal.o9b.y1 var7 = var0[var6].y4();
         var2 = com.aspose.slides.ms.System.q1.l6(var7.a6(), var2);
         var3 = com.aspose.slides.ms.System.q1.n5((float)(var7.h0()), (float)(var3));
         var4 = com.aspose.slides.ms.System.q1.l6(var7.t2(), var4);
         var5 = com.aspose.slides.ms.System.q1.n5((float)(var7.l6()), (float)(var5));
      }

      return new com.aspose.slides.internal.o9b.y1(var2, var4, var3 - var2, var5 - var4);
   }

   public static com.aspose.slides.internal.o9b.w1 n5(
      com.aspose.slides.internal.o9b.w1 var0, float var1, float var2, com.aspose.slides.internal.o9b.y1 var3, boolean var4
   ) {
      return n5(new com.aspose.slides.internal.o9b.y1(var0.l6(), var0.k5(), var1, var2), var3.y4(), var4);
   }

   public static com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.y1 var0, com.aspose.slides.internal.o9b.y1 var1, boolean var2) {
      com.aspose.slides.internal.o9b.w1 var3 = new com.aspose.slides.internal.o9b.w1(var0.x8(), var0.n3());
      float var4 = 0.0F;
      float var5 = 0.0F;
      float[] var6 = new float[]{0.0F};
      float[] var7 = new float[]{0.0F};
      boolean var8 = !n5(var1.y4(), var0.y4(), var6, var7)
         || var2
            && (
               var6[0] != 0.0F && var7[0] == 0.0F && (var1.a6() > var0.h0() || var1.h0() < var0.a6())
                  || var7[0] != 0.0F && var6[0] == 0.0F && (var1.t2() > var0.l6() || var1.l6() < var0.t2())
            );
      var4 = var6[0];
      var5 = var7[0];
      return var8 ? var3 : n5(var3.u3(), var4, var5);
   }

   public static com.aspose.slides.internal.o9b.w1[] n5(
      com.aspose.slides.internal.o9b.w1 var0,
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3
   ) {
      double var4 = k5(var1.u3(), var2.u3());
      double var6 = k5(var0.u3(), var2.u3());
      double var8 = k5(var1.u3(), var3.u3());
      com.aspose.slides.internal.o9b.w1 var10 = var1.u3();
      com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1 var13 = new com.aspose.slides.internal.o9b.w1();
      if (var6 / 6.0 < var4 / 2.0 && var8 / 6.0 < var4 / 2.0) {
         float var14;
         if (com.aspose.slides.internal.o9b.w1.l6(var0, var1)) {
            var14 = 0.16666667F;
         } else {
            var14 = 0.33333334F;
         }

         n5(var1.u3(), n5(l6(var2.u3(), var0.u3()).u3(), var14).u3()).n5(var11);
         if (com.aspose.slides.internal.o9b.w1.l6(var2, var3)) {
            var14 = 0.16666667F;
         } else {
            var14 = 0.33333334F;
         }

         n5(var2.u3(), n5(l6(var1.u3(), var3.u3()).u3(), var14).u3()).n5(var12);
      } else if (var6 / 6.0 >= var4 / 2.0 && var8 / 6.0 >= var4 / 2.0) {
         n5(var1.u3(), n5(l6(var2.u3(), var0.u3()).u3(), var6 == 0.0 ? 0.0F : (float)(var4 / 2.0 / var6)).u3()).n5(var11);
         n5(var2.u3(), n5(l6(var1.u3(), var3.u3()).u3(), var8 == 0.0 ? 0.0F : (float)(var4 / 2.0 / var8)).u3()).n5(var12);
      } else if (var6 / 6.0 >= var4 / 2.0) {
         n5(var1.u3(), n5(l6(var2.u3(), var0.u3()).u3(), var6 == 0.0 ? 0.0F : (float)(var4 / 2.0 / var6)).u3()).n5(var11);
         n5(var2.u3(), n5(l6(var1.u3(), var3.u3()).u3(), var8 != 0.0 && var6 != 0.0 ? (float)(var4 / 2.0 / var8 * (var8 / var6)) : 0.0F).u3()).n5(var12);
      } else {
         n5(var1.u3(), n5(l6(var2.u3(), var0.u3()).u3(), var6 != 0.0 && var8 != 0.0 ? (float)(var4 / 2.0 / var6 * (var6 / var8)) : 0.0F).u3()).n5(var11);
         n5(var2.u3(), n5(l6(var1.u3(), var3.u3()).u3(), var8 == 0.0 ? 0.0F : (float)(var4 / 2.0 / var8)).u3()).n5(var12);
      }

      var2.n5(var13);
      com.aspose.slides.internal.o9b.w1[] var15 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 11)
      );

      for (int var16 = 0; var16 <= 10; var16++) {
         n5(var10.u3(), var11.u3(), var12.u3(), var13.u3(), var16 / 10.0F).n5(var15[var16]);
      }

      return var15;
   }

   private static com.aspose.slides.internal.o9b.w1 n5(
      com.aspose.slides.internal.o9b.w1 var0,
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      float var4
   ) {
      float var5 = 1.0F - var4;
      float var6 = (float)com.aspose.slides.ms.System.q1.a6(var5, 3.0);
      float var7 = (float)com.aspose.slides.ms.System.q1.a6(var4, 3.0);
      return new com.aspose.slides.internal.o9b.w1(
         var6 * var0.l6() + 3.0F * var4 * var5 * var5 * var1.l6() + 3.0F * var4 * var4 * var5 * var2.l6() + var7 * var3.l6(),
         var6 * var0.k5() + 3.0F * var4 * var5 * var5 * var1.k5() + 3.0F * var4 * var4 * var5 * var2.k5() + var7 * var3.k5()
      );
   }

   private static com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1) {
      return new com.aspose.slides.internal.o9b.w1(var0.l6() + var1.l6(), var0.k5() + var1.k5());
   }

   private static com.aspose.slides.internal.o9b.w1 l6(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1) {
      return new com.aspose.slides.internal.o9b.w1(var0.l6() - var1.l6(), var0.k5() - var1.k5());
   }

   private static com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.w1 var0, float var1) {
      return new com.aspose.slides.internal.o9b.w1(var0.l6() * var1, var0.k5() * var1);
   }

   private static double k5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1) {
      return com.aspose.slides.ms.System.q1.z3(
         com.aspose.slides.ms.System.q1.a6(var0.l6() - var1.l6(), 2.0) + com.aspose.slides.ms.System.q1.a6(var0.k5() - var1.k5(), 2.0)
      );
   }
}
