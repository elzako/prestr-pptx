package com.aspose.slides.internal.k3w;

public final class l6 {
   // $VF: synthetic field
   static final boolean n5 = !l6.class.desiredAssertionStatus();

   private l6() {
      throw new Error("This is a non instantiable class");
   }

   public static void n5(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float[] var8, int var9) {
      n5(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, Float.MAX_VALUE);
   }

   public static void n5(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float[] var8, int var9, float var10) {
      float var11 = var2 - var0;
      float var12 = var3 - var1;
      float var13 = var6 - var4;
      float var14 = var7 - var5;
      float var15 = var11 * var14 - var13 * var12;
      if (Math.abs(var15) == 0.0F) {
         var8[var9++] = Float.NaN;
         var8[var9] = Float.NaN;
      } else {
         float var16 = var13 * (var1 - var5) - var14 * (var0 - var4);
         var16 /= var15;
         float var17 = var11 * (var5 - var1) - var12 * (var4 - var0);
         float var18 = var13 * var12 - var11 * var14;
         var17 /= var18;
         var10 = Math.abs(var10);
         if (Math.abs(var16) > var10 && Math.abs(var17) > var10) {
            var8[var9++] = Float.NaN;
            var8[var9] = Float.NaN;
         } else {
            var8[var9++] = var0 + var16 * var11;
            var8[var9] = var1 + var16 * var12;
         }
      }
   }

   public static boolean n5(float var0, float var1, float var2) {
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

   public static int n5(float var0, float var1, float var2, float var3, float[] var4, int var5, float var6, float var7) {
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

   public static int n5(float[] var0, int var1, int var2, float var3, float var4) {
      int var5 = var1;
      int var6 = var1;

      for (int var7 = var1 + var2; var6 < var7; var6++) {
         if (var0[var6] >= var3 && var0[var6] < var4) {
            var0[var5++] = var0[var6];
         }
      }

      return var5;
   }

   public static float n5(float var0, float var1, float var2, float var3) {
      float var4 = var2 - var0;
      float var5 = var3 - var1;
      return (float)Math.sqrt(var4 * var4 + var5 * var5);
   }

   public static void n5(float[] var0, int var1, float[] var2, int var3, float[] var4, int var5, int var6) {
      switch (var6) {
         case 6:
            l6(var0, var1, var2, var3, var4, var5);
            return;
         case 8:
            n5(var0, var1, var2, var3, var4, var5);
            return;
         default:
            throw new InternalError("Unsupported curve type");
      }
   }

   public static void n5(float[] var0, int var1, int var2) {
      int var3 = var1 + 1;

      for (int var4 = var1 + var2; var3 < var4; var3++) {
         float var5 = var0[var3];

         int var6;
         for (var6 = var3 - 1; var6 >= var1 && var0[var6] > var5; var6--) {
            var0[var6 + 1] = var0[var6];
         }

         var0[var6 + 1] = var5;
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

   public static void n5(float var0, float[] var1, int var2, float[] var3, int var4, float[] var5, int var6) {
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

   public static void n5(float var0, float[] var1, int var2, float[] var3, int var4, float[] var5, int var6, int var7) {
      switch (var7) {
         case 6:
            l6(var0, var1, var2, var3, var4, var5, var6);
            return;
         case 8:
            n5(var0, var1, var2, var3, var4, var5, var6);
            return;
      }
   }
}
