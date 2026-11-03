package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;

class x9p {
   public static void n5(com.aspose.slides.internal.o9b.l6 var0, double var1, int var3, int var4) {
      if (var0 == null) {
         throw new ArgumentNullException("bitmap cannot null.");
      }

      if (var1 < 0.0) {
         throw new ArgumentException("blurRadius cannot be negative.");
      }

      if (var3 <= 0) {
         throw new ArgumentException("blurringIteration cannot be zero or negative.");
      }

      if (var0.s7() != 2498570 && var0.s7() != 137224) {
         throw new ArgumentException("bitmap should have PixelFormat:Format32bppArgb or Format24bppRgb.");
      }

      if (var4 == 3 && !com.aspose.slides.internal.o9b.t4.k5(var0.s7())) {
         throw new ArgumentException("bitmap doesn't contain alpha channel.");
      }

      if (var1 > 0.0 && var0.e2() != 0 && var0.h0() != 0) {
         int var5 = var0.h0();
         int var6 = var0.e2();
         int var7 = com.aspose.slides.internal.o9b.t4.n5(var0.s7()) >> 3;
         int var8 = var6 * var5;
         int[] var9 = new int[var8];
         com.aspose.slides.internal.j9e.n5 var10 = var0.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var6, var5), 3, var0.s7());
         int var11 = com.aspose.slides.ms.System.q1.n5(var10.a6()) * var5;
         byte[] var12 = new byte[var11];
         System.arraycopy((byte[])var10.u3().k5().n5(), 0, var12, 0, var11);
         int var13 = var4;

         for (int var14 = 0; var14 < var8; var14++) {
            var9[var14] = var12[var13] & 255;
            var13 += var7;
         }

         int[] var18 = new int[var9.length];
         int[] var15 = n5(var1, var3);
         n5(var9, var18, var6, var5, var1, var3, var15);
         var13 = var4;

         for (int var16 = 0; var16 < var8; var16++) {
            var12[var13] = (byte)(var18[var16] > 255 ? 255 : (var18[var16] < 0 ? 0 : var18[var16]));
            var13 += var7;
         }

         System.arraycopy(var12, 0, (byte[])var10.u3().k5().n5(), 0, var11);
         var0.n5(var10);
      }
   }

   public static void n5(com.aspose.slides.internal.o9b.l6 var0, double var1, int var3) {
      if (var0 == null) {
         throw new ArgumentNullException("bitmap cannot null.");
      }

      if (var1 < 0.0) {
         throw new ArgumentException("blurRadius cannot be negative.");
      }

      if (var3 <= 0) {
         throw new ArgumentException("blurringIteration cannot be zero or negative.");
      }

      if (var0.s7() != 2498570 && var0.s7() != 137224) {
         throw new ArgumentException("bitmap should have PixelFormat:Format32bppArgb or Format24bppRgb.");
      }

      if (var1 > 0.0 && var0.e2() != 0 && var0.h0() != 0) {
         boolean var4 = com.aspose.slides.internal.o9b.t4.n5(var0.s7()) >= 32;
         int var5 = var0.e2() * var0.h0();
         int[] var6 = new int[var5];
         int[] var7 = new int[var5];
         int[] var8 = new int[var5];
         int[] var9 = new int[var5];
         com.aspose.slides.internal.j9e.n5 var10 = var0.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var0.e2(), var0.h0()), 3, var0.s7());
         int var11 = com.aspose.slides.ms.System.q1.n5(var10.a6()) * var0.h0();
         byte[] var12 = new byte[var11];
         System.arraycopy((byte[])var10.u3().k5().n5(), 0, var12, 0, var11);
         int var13 = 0;

         for (int var14 = 0; var14 < var5; var14++) {
            var9[var14] = var12[var13++] & 255;
            var8[var14] = var12[var13++] & 255;
            var7[var14] = var12[var13++] & 255;
            if (var4) {
               var6[var14] = var12[var13++] & 255;
            }
         }

         int[] var27 = new int[var7.length];
         int[] var15 = new int[var7.length];
         int[] var16 = new int[var8.length];
         int[] var17 = new int[var9.length];
         int[] var18 = n5(var1, var3);
         int[][] var19 = new int[][]{var6, var7, var8, var9};
         int[][] var20 = new int[][]{var27, var15, var16, var17};
         n5(var19, var20, var0.e2(), var0.h0(), var1, var3, var18);
         var27 = var20[0];
         var15 = var20[1];
         var16 = var20[2];
         var17 = var20[3];
         var13 = 0;

         for (int var21 = 0; var21 < var5; var21++) {
            var12[var13++] = (byte)(var17[var21] > 255 ? 255 : (var17[var21] < 0 ? 0 : var17[var21]));
            var12[var13++] = (byte)(var16[var21] > 255 ? 255 : (var16[var21] < 0 ? 0 : var16[var21]));
            var12[var13++] = (byte)(var15[var21] > 255 ? 255 : (var15[var21] < 0 ? 0 : var15[var21]));
            if (var4) {
               var12[var13++] = (byte)(var27[var21] > 255 ? 255 : (var27[var21] < 0 ? 0 : var27[var21]));
            }
         }

         System.arraycopy(var12, 0, (byte[])var10.u3().k5().n5(), 0, var11);
         var0.n5(var10);
      }
   }

   public static void n5(int[] var0, int[] var1, int var2, int var3, double var4, int var6) {
      int[] var7 = n5(var4, var6);
      n5(var0, var1, var2, var3, var4, var6, var7);
   }

   private static void n5(int[] var0, int[] var1, int var2, int var3, double var4, int var6, int[] var7) {
      if (var4 < 0.0) {
         throw new ArgumentException("blurRadius cannot be negative.");
      }

      if (var6 <= 0) {
         throw new ArgumentException("blurringIteration cannot be zero or negative.");
      }

      if (var4 > 0.0) {
         if (var6 >= 1 && var7[0] - 1 < var2) {
            n5(var0, var1, var2, var3, (var7[0] - 1) / 2);
         }

         if (var6 >= 2 && var7[1] - 1 < var2) {
            n5(var1, var0, var2, var3, (var7[1] - 1) / 2);
         }

         if (var6 >= 3 && var7[2] - 1 < var2) {
            n5(var0, var1, var2, var3, (var7[2] - 1) / 2);
         }

         if (var6 >= 4 && var7[3] - 1 < var2) {
            n5(var1, var0, var2, var3, (var7[3] - 1) / 2);
         }

         if (var6 >= 5 && var7[4] - 1 < var2) {
            n5(var1, var0, var2, var3, (var7[4] - 1) / 2);
         }
      }
   }

   public static void n5(int[][] var0, int[][] var1, int var2, int var3, double var4, int var6, int[] var7) {
      if (var4 < 0.0) {
         throw new ArgumentException("blurRadius cannot be negative.");
      }

      if (var6 <= 0) {
         throw new ArgumentException("blurringIteration cannot be zero or negative.");
      }

      if (var4 > 0.0) {
         if (var6 >= 1) {
            n5(var0, var1, var2, var3, (var7[0] - 1) / 2);
         }

         if (var6 >= 2) {
            n5(var1, var0, var2, var3, (var7[1] - 1) / 2);
         }

         if (var6 >= 3) {
            n5(var0, var1, var2, var3, (var7[2] - 1) / 2);
         }

         if (var6 >= 4) {
            n5(var1, var0, var2, var3, (var7[3] - 1) / 2);
         }

         if (var6 >= 5) {
            n5(var1, var0, var2, var3, (var7[4] - 1) / 2);
         }
      }
   }

   private static void n5(int[] var0, int[] var1, int var2, int var3, int var4) {
      System.arraycopy(var0, 0, var1, 0, var0.length);
      l6(var1, var0, var2, var3, var4);
      k5(var0, var1, var2, var3, var4);
   }

   private static void n5(int[][] var0, int[][] var1, int var2, int var3, int var4) {
      for (int var5 = 0; var5 < var0.length; var5++) {
         var1[var5] = (int[])var0[var5].clone();
      }

      l6(var1, var0, var2, var3, var4);
      k5(var0, var1, var2, var3, var4);
   }

   private static void l6(int[] var0, int[] var1, int var2, int var3, int var4) {
      double var5 = 1.0 / (var4 + var4 + 1);

      for (int var7 = 0; var7 < var3; var7++) {
         int var8 = var7 * var2;
         int var9 = var8;
         int var10 = var8 + var4;
         int var11 = var0[var8];
         int var12 = var0[var8 + var2 - 1];
         int var13 = (var4 + 1) * var11;

         for (int var14 = 0; var14 < var4; var14++) {
            var13 += var0[var8 + var14];
         }

         for (int var15 = 0; var15 <= var4; var15++) {
            var13 += var0[var10++] - var11;
            var1[var8++] = com.aspose.slides.internal.v6g.k5.u3(var13 * var5 + 0.5, 14);
         }

         for (int var16 = var4 + 1; var16 < var2 - var4; var16++) {
            var13 += var0[var10++] - var0[var9++];
            var1[var8++] = com.aspose.slides.internal.v6g.k5.u3(var13 * var5 + 0.5, 14);
         }

         for (int var17 = var2 - var4; var17 < var2; var17++) {
            var13 += var12 - var0[var9++];
            var1[var8++] = com.aspose.slides.internal.v6g.k5.u3(var13 * var5 + 0.5, 14);
         }
      }
   }

   private static void k5(int[] var0, int[] var1, int var2, int var3, int var4) {
      double var5 = 1.0 / (var4 + var4 + 1);

      for (int var7 = 0; var7 < var2; var7++) {
         int var8 = var7;
         int var9 = var8;
         int var10 = var8 + var4 * var2;
         int var11 = var0[var8];
         int var12 = var0[var8 + var2 * (var3 - 1)];
         int var13 = (var4 + 1) * var11;

         for (int var14 = 0; var14 < var4; var14++) {
            var13 += var0[var8 + var14 * var2];
         }

         for (int var15 = 0; var15 <= var4; var15++) {
            var13 += var0[var10] - var11;
            var1[var8] = com.aspose.slides.internal.v6g.k5.u3(var13 * var5 + 0.5, 14);
            var10 += var2;
            var8 += var2;
         }

         for (int var16 = var4 + 1; var16 < var3 - var4; var16++) {
            var13 += var0[var10] - var0[var9];
            var1[var8] = com.aspose.slides.internal.v6g.k5.u3(var13 * var5 + 0.5, 14);
            var9 += var2;
            var10 += var2;
            var8 += var2;
         }

         for (int var17 = var3 - var4; var17 < var3; var17++) {
            var13 += var12 - var0[var9];
            var1[var8] = com.aspose.slides.internal.v6g.k5.u3(var13 * var5 + 0.5, 14);
            var9 += var2;
            var8 += var2;
         }
      }
   }

   private static void l6(int[][] var0, int[][] var1, int var2, int var3, int var4) {
      double var5 = 1.0 / (var4 + var4 + 1);

      for (int var7 = 0; var7 < var3; var7++) {
         int var8 = var7 * var2;
         int var9 = var8;
         int var10 = var8 + var4;
         int var11 = var0[0][var8];
         int var12 = var0[1][var8];
         int var13 = var0[2][var8];
         int var14 = var0[3][var8];
         int var15 = var0[0][var8 + var2 - 1];
         int var16 = var0[1][var8 + var2 - 1];
         int var17 = var0[2][var8 + var2 - 1];
         int var18 = var0[3][var8 + var2 - 1];
         int var19 = (var4 + 1) * var11;
         int var20 = (var4 + 1) * var12;
         int var21 = (var4 + 1) * var13;
         int var22 = (var4 + 1) * var14;

         for (int var23 = 0; var23 < var4; var23++) {
            var19 += var0[0][var8 + var23];
            var20 += var0[1][var8 + var23];
            var21 += var0[2][var8 + var23];
            var22 += var0[3][var8 + var23];
         }

         for (int var24 = 0; var24 <= var4; var24++) {
            var19 += var0[0][var10] - var11;
            var20 += var0[1][var10] - var12;
            var21 += var0[2][var10] - var13;
            var22 += var0[3][var10] - var14;
            var10++;
            var1[0][var8] = (int)(var19 * var5 + 0.5);
            var1[1][var8] = (int)(var20 * var5 + 0.5);
            var1[2][var8] = (int)(var21 * var5 + 0.5);
            var1[3][var8] = (int)(var22 * var5 + 0.5);
            var8++;
         }

         for (int var25 = var4 + 1; var25 < var2 - var4; var25++) {
            var19 += var0[0][var10] - var0[0][var9];
            var20 += var0[1][var10] - var0[1][var9];
            var21 += var0[2][var10] - var0[2][var9];
            var22 += var0[3][var10] - var0[3][var9];
            var10++;
            var9++;
            var1[0][var8] = (int)(var19 * var5 + 0.5);
            var1[1][var8] = (int)(var20 * var5 + 0.5);
            var1[2][var8] = (int)(var21 * var5 + 0.5);
            var1[3][var8] = (int)(var22 * var5 + 0.5);
            var8++;
         }

         for (int var26 = var2 - var4; var26 < var2; var26++) {
            var19 += var15 - var0[0][var9];
            var20 += var16 - var0[1][var9];
            var21 += var17 - var0[2][var9];
            var22 += var18 - var0[3][var9];
            var9++;
            var1[0][var8] = (int)(var19 * var5 + 0.5);
            var1[1][var8] = (int)(var20 * var5 + 0.5);
            var1[2][var8] = (int)(var21 * var5 + 0.5);
            var1[3][var8] = (int)(var22 * var5 + 0.5);
            var8++;
         }
      }
   }

   private static void k5(int[][] var0, int[][] var1, int var2, int var3, int var4) {
      double var5 = 1.0 / (var4 + var4 + 1);

      for (int var7 = 0; var7 < var2; var7++) {
         int var8 = var7;
         int var9 = var8;
         int var10 = var8 + var4 * var2;
         int var11 = var0[0][var8];
         int var12 = var0[1][var8];
         int var13 = var0[2][var8];
         int var14 = var0[3][var8];
         int var15 = var0[0][var8 + var2 * (var3 - 1)];
         int var16 = var0[1][var8 + var2 * (var3 - 1)];
         int var17 = var0[2][var8 + var2 * (var3 - 1)];
         int var18 = var0[3][var8 + var2 * (var3 - 1)];
         int var19 = (var4 + 1) * var11;
         int var20 = (var4 + 1) * var12;
         int var21 = (var4 + 1) * var13;
         int var22 = (var4 + 1) * var14;

         for (int var23 = 0; var23 < var4; var23++) {
            var19 += var0[0][var8 + var23 * var2];
            var20 += var0[1][var8 + var23 * var2];
            var21 += var0[2][var8 + var23 * var2];
            var22 += var0[3][var8 + var23 * var2];
         }

         for (int var24 = 0; var24 <= var4; var24++) {
            var19 += var0[0][var10] - var11;
            var20 += var0[1][var10] - var12;
            var21 += var0[2][var10] - var13;
            var22 += var0[3][var10] - var14;
            var1[0][var8] = (int)(var19 * var5 + 0.5);
            var1[1][var8] = (int)(var20 * var5 + 0.5);
            var1[2][var8] = (int)(var21 * var5 + 0.5);
            var1[3][var8] = (int)(var22 * var5 + 0.5);
            var10 += var2;
            var8 += var2;
         }

         for (int var25 = var4 + 1; var25 < var3 - var4; var25++) {
            var19 += var0[0][var10] - var0[0][var9];
            var20 += var0[1][var10] - var0[1][var9];
            var21 += var0[2][var10] - var0[2][var9];
            var22 += var0[3][var10] - var0[3][var9];
            var1[0][var8] = (int)(var19 * var5 + 0.5);
            var1[1][var8] = (int)(var20 * var5 + 0.5);
            var1[2][var8] = (int)(var21 * var5 + 0.5);
            var1[3][var8] = (int)(var22 * var5 + 0.5);
            var9 += var2;
            var10 += var2;
            var8 += var2;
         }

         for (int var26 = var3 - var4; var26 < var3; var26++) {
            var19 += var15 - var0[0][var9];
            var20 += var16 - var0[1][var9];
            var21 += var17 - var0[2][var9];
            var22 += var18 - var0[3][var9];
            var1[0][var8] = (int)(var19 * var5 + 0.5);
            var1[1][var8] = (int)(var20 * var5 + 0.5);
            var1[2][var8] = (int)(var21 * var5 + 0.5);
            var1[3][var8] = (int)(var22 * var5 + 0.5);
            var9 += var2;
            var8 += var2;
         }
      }
   }

   private static int[] n5(double var0, int var2) {
      double var3 = com.aspose.slides.ms.System.q1.z3(12.0 * var0 * var0 / var2 + 1.0);
      int var5 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var3), 14);
      if (var5 % 2 == 0) {
         var5--;
      }

      int var6 = var5 + 2;
      double var7 = (12.0 * var0 * var0 - var2 * var5 * var5 - 4 * var2 * var5 - 3 * var2) / (-4 * var5 - 4);
      double var9 = com.aspose.slides.ms.System.q1.u3(var7);
      int[] var11 = new int[var2];

      for (int var12 = 0; var12 < var2; var12++) {
         var11[var12] = var12 < var9 ? var5 : var6;
      }

      return var11;
   }
}
