package com.aspose.slides.internal.x1j;

import java.util.Arrays;

final class a6 {
   static boolean n5(float var0, float var1, float var2) {
      float var3 = var1 - var0;
      return var3 <= var2 && var3 >= -var2;
   }

   static boolean n5(double var0, double var2, double var4) {
      double var6 = var2 - var0;
      return var6 <= var4 && var6 >= -var4;
   }

   static int n5(float var0, float var1, float var2, float[] var3, int var4) {
      int var5 = var4;
      if (var0 != 0.0F) {
         float var6 = var1 * var1 - 4.0F * var0 * var2;
         if (var6 > 0.0F) {
            float var7 = (float)Math.sqrt(var6);
            if (var1 >= 0.0F) {
               var3[var5++] = 2.0F * var2 / (-var1 - var7);
               var3[var5++] = (-var1 - var7) / (2.0F * var0);
            } else {
               var3[var5++] = (-var1 + var7) / (2.0F * var0);
               var3[var5++] = 2.0F * var2 / (-var1 + var7);
            }
         } else if (var6 == 0.0F) {
            float var8 = -var1 / (2.0F * var0);
            var3[var5++] = var8;
         }
      } else if (var1 != 0.0F) {
         float var11 = -var2 / var1;
         var3[var5++] = var11;
      }

      return var5 - var4;
   }

   static int n5(float var0, float var1, float var2, float var3, float[] var4, int var5, float var6, float var7) {
      if (var0 == 0.0F) {
         int var8 = n5(var1, var2, var3, var4, var5);
         return n5(var4, var5, var8, var6, var7) - var5;
      }

      var1 /= var0;
      var2 /= var0;
      var3 /= var0;
      double var9 = var1 * var1;
      double var11 = 0.3333333333333333 * (-0.3333333333333333 * var9 + var2);
      double var13 = 0.5 * (0.07407407407407407 * var1 * var9 - 0.3333333333333333 * var1 * var2 + var3);
      double var15 = var11 * var11 * var11;
      double var17 = var13 * var13 + var15;
      byte var23;
      if (var17 < 0.0) {
         double var19 = 0.3333333333333333 * Math.acos(-var13 / Math.sqrt(-var15));
         double var21 = 2.0 * Math.sqrt(-var11);
         var4[var5 + 0] = (float)(var21 * Math.cos(var19));
         var4[var5 + 1] = (float)(-var21 * Math.cos(var19 + (Math.PI / 3)));
         var4[var5 + 2] = (float)(-var21 * Math.cos(var19 - (Math.PI / 3)));
         var23 = 3;
      } else {
         double var31 = Math.sqrt(var17);
         double var32 = Math.cbrt(var31 - var13);
         double var24 = -Math.cbrt(var31 + var13);
         var4[var5] = (float)(var32 + var24);
         var23 = 1;
         if (n5(var17, 0.0, 1.0E-8)) {
            var4[var5 + 1] = -(var4[var5] / 2.0F);
            var23 = 2;
         }
      }

      float var26 = 0.33333334F * var1;

      for (int var27 = 0; var27 < var23; var27++) {
         var4[var5 + var27] = var4[var5 + var27] - var26;
      }

      return n5(var4, var5, var23, var6, var7) - var5;
   }

   static float[] n5(float[] var0, int var1, int var2) {
      return var0.length >= var1 + var2 ? var0 : Arrays.copyOf(var0, 2 * (var1 + var2));
   }

   static int n5(float[] var0, int var1, int var2, float var3, float var4) {
      int var5 = var1;

      for (int var6 = var1; var6 < var1 + var2; var6++) {
         if (var0[var6] >= var3 && var0[var6] < var4) {
            var0[var5++] = var0[var6];
         }
      }

      return var5;
   }

   static void n5(float[] var0, int var1, float[] var2, int var3, float[] var4, int var5, int var6) {
      switch (var6) {
         case 6:
            l6(var0, var1, var2, var3, var4, var5);
            break;
         case 8:
            n5(var0, var1, var2, var3, var4, var5);
            break;
         default:
            throw new InternalError("Unknown curve type");
      }
   }

   static void l6(float[] var0, int var1, int var2) {
      for (int var3 = var1 + 1; var3 < var1 + var2; var3++) {
         float var4 = var0[var3];

         int var5;
         for (var5 = var3 - 1; var5 >= var1 && var0[var5] > var4; var5--) {
            var0[var5 + 1] = var0[var5];
         }

         var0[var5 + 1] = var4;
      }
   }

   static void n5(float[] var0, int var1, float[] var2, int var3, float[] var4, int var5) {
      float var6 = var0[var1 + 0];
      float var7 = var0[var1 + 1];
      float var8 = var0[var1 + 2];
      float var9 = var0[var1 + 3];
      float var10 = var0[var1 + 4];
      float var11 = var0[var1 + 5];
      float var12 = var0[var1 + 6];
      float var13 = var0[var1 + 7];
      if (var2 != null) {
         var2[var3 + 0] = var6;
         var2[var3 + 1] = var7;
      }

      if (var4 != null) {
         var4[var5 + 6] = var12;
         var4[var5 + 7] = var13;
      }

      var6 = (var6 + var8) / 2.0F;
      var7 = (var7 + var9) / 2.0F;
      var12 = (var12 + var10) / 2.0F;
      var13 = (var13 + var11) / 2.0F;
      float var14 = (var8 + var10) / 2.0F;
      float var15 = (var9 + var11) / 2.0F;
      var8 = (var6 + var14) / 2.0F;
      var9 = (var7 + var15) / 2.0F;
      var10 = (var12 + var14) / 2.0F;
      var11 = (var13 + var15) / 2.0F;
      var14 = (var8 + var10) / 2.0F;
      var15 = (var9 + var11) / 2.0F;
      if (var2 != null) {
         var2[var3 + 2] = var6;
         var2[var3 + 3] = var7;
         var2[var3 + 4] = var8;
         var2[var3 + 5] = var9;
         var2[var3 + 6] = var14;
         var2[var3 + 7] = var15;
      }

      if (var4 != null) {
         var4[var5 + 0] = var14;
         var4[var5 + 1] = var15;
         var4[var5 + 2] = var10;
         var4[var5 + 3] = var11;
         var4[var5 + 4] = var12;
         var4[var5 + 5] = var13;
      }
   }

   static void n5(float var0, float[] var1, int var2, float[] var3, int var4, float[] var5, int var6) {
      float var7 = var1[var2 + 0];
      float var8 = var1[var2 + 1];
      float var9 = var1[var2 + 2];
      float var10 = var1[var2 + 3];
      float var11 = var1[var2 + 4];
      float var12 = var1[var2 + 5];
      float var13 = var1[var2 + 6];
      float var14 = var1[var2 + 7];
      if (var3 != null) {
         var3[var4 + 0] = var7;
         var3[var4 + 1] = var8;
      }

      if (var5 != null) {
         var5[var6 + 6] = var13;
         var5[var6 + 7] = var14;
      }

      var7 += var0 * (var9 - var7);
      var8 += var0 * (var10 - var8);
      var13 = var11 + var0 * (var13 - var11);
      var14 = var12 + var0 * (var14 - var12);
      float var15 = var9 + var0 * (var11 - var9);
      float var16 = var10 + var0 * (var12 - var10);
      var9 = var7 + var0 * (var15 - var7);
      var10 = var8 + var0 * (var16 - var8);
      var11 = var15 + var0 * (var13 - var15);
      var12 = var16 + var0 * (var14 - var16);
      var15 = var9 + var0 * (var11 - var9);
      var16 = var10 + var0 * (var12 - var10);
      if (var3 != null) {
         var3[var4 + 2] = var7;
         var3[var4 + 3] = var8;
         var3[var4 + 4] = var9;
         var3[var4 + 5] = var10;
         var3[var4 + 6] = var15;
         var3[var4 + 7] = var16;
      }

      if (var5 != null) {
         var5[var6 + 0] = var15;
         var5[var6 + 1] = var16;
         var5[var6 + 2] = var11;
         var5[var6 + 3] = var12;
         var5[var6 + 4] = var13;
         var5[var6 + 5] = var14;
      }
   }

   static void l6(float[] var0, int var1, float[] var2, int var3, float[] var4, int var5) {
      float var6 = var0[var1 + 0];
      float var7 = var0[var1 + 1];
      float var8 = var0[var1 + 2];
      float var9 = var0[var1 + 3];
      float var10 = var0[var1 + 4];
      float var11 = var0[var1 + 5];
      if (var2 != null) {
         var2[var3 + 0] = var6;
         var2[var3 + 1] = var7;
      }

      if (var4 != null) {
         var4[var5 + 4] = var10;
         var4[var5 + 5] = var11;
      }

      var6 = (var6 + var8) / 2.0F;
      var7 = (var7 + var9) / 2.0F;
      var10 = (var10 + var8) / 2.0F;
      var11 = (var11 + var9) / 2.0F;
      var8 = (var6 + var10) / 2.0F;
      var9 = (var7 + var11) / 2.0F;
      if (var2 != null) {
         var2[var3 + 2] = var6;
         var2[var3 + 3] = var7;
         var2[var3 + 4] = var8;
         var2[var3 + 5] = var9;
      }

      if (var4 != null) {
         var4[var5 + 0] = var8;
         var4[var5 + 1] = var9;
         var4[var5 + 2] = var10;
         var4[var5 + 3] = var11;
      }
   }

   static void l6(float var0, float[] var1, int var2, float[] var3, int var4, float[] var5, int var6) {
      float var7 = var1[var2 + 0];
      float var8 = var1[var2 + 1];
      float var9 = var1[var2 + 2];
      float var10 = var1[var2 + 3];
      float var11 = var1[var2 + 4];
      float var12 = var1[var2 + 5];
      if (var3 != null) {
         var3[var4 + 0] = var7;
         var3[var4 + 1] = var8;
      }

      if (var5 != null) {
         var5[var6 + 4] = var11;
         var5[var6 + 5] = var12;
      }

      var7 += var0 * (var9 - var7);
      var8 += var0 * (var10 - var8);
      var11 = var9 + var0 * (var11 - var9);
      var12 = var10 + var0 * (var12 - var10);
      var9 = var7 + var0 * (var11 - var7);
      var10 = var8 + var0 * (var12 - var8);
      if (var3 != null) {
         var3[var4 + 2] = var7;
         var3[var4 + 3] = var8;
         var3[var4 + 4] = var9;
         var3[var4 + 5] = var10;
      }

      if (var5 != null) {
         var5[var6 + 0] = var9;
         var5[var6 + 1] = var10;
         var5[var6 + 2] = var11;
         var5[var6 + 3] = var12;
      }
   }

   static void n5(float var0, float[] var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7) {
      switch (var7) {
         case 6:
            l6(var0, var1, var2, var3, var4, var5, var6);
            break;
         case 8:
            n5(var0, var1, var2, var3, var4, var5, var6);
      }
   }

   static double n5(double var0) {
      byte var2 = 53;
      short var3 = 1023;
      short var4 = -1022;
      short var5 = 1023;
      long var6 = 9218868437227405312L;
      int var8 = (int)(((Double.doubleToRawLongBits(var0) & 9218868437227405312L) >> 52) - 1023L);
      if (var8 == 1024) {
         return Math.abs(var0);
      }

      if (var8 == -1023) {
         return Double.MIN_VALUE;
      }

      var8 -= 52;
      return var8 >= -1022 ? Double.longBitsToDouble(var8 + 1023L << 52 & 9218868437227405312L) : Double.longBitsToDouble(1L << var8 - -1074);
   }

   static float n5(float var0) {
      byte var1 = 24;
      byte var2 = 127;
      byte var3 = -126;
      byte var4 = 127;
      int var5 = 2139095040;
      int var6 = ((Float.floatToRawIntBits(var0) & 2139095040) >> 23) - 127;
      if (var6 == 128) {
         return Math.abs(var0);
      }

      if (var6 == -127) {
         return Float.MIN_VALUE;
      }

      var6 -= 23;
      return var6 >= -126 ? Float.intBitsToFloat(var6 + 127 << 23 & 2139095040) : Float.intBitsToFloat(1 << var6 - -149);
   }
}
