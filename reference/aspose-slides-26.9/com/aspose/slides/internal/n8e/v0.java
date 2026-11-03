package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.ArrayList;

public class v0 {
   public static double n5(double[] var0, double var1) {
      double var3 = 0.0;
      double var5 = 1.0;
      int var7 = 0;

      while (var7 < var0.length) {
         var3 += var0[var7] * var5;
         var7++;
         var5 *= var1;
      }

      return var3;
   }

   public static int n5(double[] var0) {
      int var1 = var0.length - 1;

      while (var1 >= 0 && !(com.aspose.slides.ms.System.q1.n5(var0[var1]) > 0.0)) {
         var1--;
      }

      return var1 + 1;
   }

   public static double[] l6(double[] var0) {
      int var1 = n5(var0);
      if (var1 == var0.length) {
         return var0;
      }

      double[] var2 = new double[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   public static double[] k5(double[] var0) {
      int var1 = n5(var0);
      if (var1 == var0.length) {
         return (double[])var0.clone();
      }

      double[] var2 = new double[var1];
      System.arraycopy(var0, 0, var2, 0, var1);
      return var2;
   }

   public static double[] u3(double[] var0) {
      int var1 = n5(var0);
      double[] var2 = new double[var1 - 1];

      for (int var3 = 1; var3 < var1; var3++) {
         var2[var3 - 1] = var0[var3] * var3;
      }

      return var2;
   }

   public static double[] n5(double[] var0, double[] var1, double[][] var2) {
      double[] var3 = k5(var0);
      double[] var4 = l6(var1);
      int var5 = var3.length - var4.length + 1;
      if (var5 <= 0) {
         var2[0] = var3;
         return new double[0];
      }

      double[] var6 = new double[var5];

      for (int var7 = var5 - 1; var7 >= 0; var7--) {
         var6[var7] = var3[var7 + var4.length - 1] / var4[var4.length - 1];

         for (int var8 = 0; var8 < var4.length; var8++) {
            var3[var7 + var8] = var3[var7 + var8] - var4[var8] * var6[var7];
         }

         var3[var7 + var4.length - 1] = 0.0;
      }

      var2[0] = l6(var3);
      return var6;
   }

   public static double[][] a6(double[] var0) {
      int var1 = n5(var0);
      if (var1 < var0.length) {
         double[] var2 = var0;
         var0 = new double[var1];
         System.arraycopy(var2, 0, var0, 0, var1);
      }

      double[][] var6 = new double[var1][];
      var6[0] = var0;
      if (var1 > 1) {
         var6[1] = u3(var0);
      }

      int var3;
      for (var3 = 1; var3 < var6.length - 1 && var6[var3].length > 1; var3++) {
         double[][] var4 = new double[][]{var6[var3 + 1]};
         n5(var6[var3 - 1], var6[var3], var4);
         var6[var3 + 1] = var4[0];

         for (int var5 = 0; var5 < var6[var3 + 1].length; var5++) {
            var6[var3 + 1][var5] = -var6[var3 + 1][var5];
         }
      }

      if (var3 < var6.length && var6[var3].length > 0) {
         var3++;
      }

      if (var3 < var6.length) {
         double[][] var7 = var6;
         var6 = new double[var3][];
         System.arraycopy(var7, 0, var6, 0, var3);
      }

      return var6;
   }

   public static int n5(double[][] var0, double var1, double var3) {
      int var5 = 0;
      int var6 = 0;
      double var7 = 0.0;

      for (double[] var12 : var0) {
         double var13 = n5(var12, var1);
         if (var13 * var7 < -1.0E-5) {
            var7 = var13;
            var5++;
         }

         if (var7 == 0.0) {
            var7 = var13;
         }
      }

      var7 = 0.0;

      for (double[] var19 : var0) {
         double var20 = n5(var19, var3);
         if (var20 * var7 < -1.0E-5) {
            var7 = var20;
            var6++;
         }

         if (var7 == 0.0) {
            var7 = var20;
         }
      }

      return var5 - var6;
   }

   public static double[] n5(double[] var0, double var1, double var3) {
      double[] var5 = null;
      double var6 = 1.0E-8;
      double var8 = 0.001;
      ArrayList var10 = new ArrayList();

      while (n5(var0, var1) == 0.0) {
         double[][] var11 = new double[][]{var5};
         var0 = n5(var0, new double[]{-var1, 1.0}, var11);
         var5 = var11[0];
         var10.addItem(var1);
      }

      while (n5(var0, var3) == 0.0) {
         double[][] var21 = new double[][]{var5};
         var0 = n5(var0, new double[]{-var3, 1.0}, var21);
         var5 = var21[0];
         var10.addItem(var3);
      }

      double[][] var22 = a6(var0);

      for (int var12 = n5(var22, var1, var3); var12 > 0; var12 = n5(var22, var1, var3)) {
         double[] var13 = var22[1];
         double var14 = (var1 + var3) / 2.0;
         double var16 = 1.0E300;
         double var18 = 0.0;

         do {
            var18 = var16;
            var16 = -n5(var0, var14) / n5(var13, var14);
            var14 += var16;
         } while (com.aspose.slides.ms.System.q1.n5(var18) >= com.aspose.slides.ms.System.q1.n5(var16) && com.aspose.slides.ms.System.q1.n5(var16) >= var6);

         if (!(com.aspose.slides.ms.System.q1.n5(var16) < var6) || !(com.aspose.slides.ms.System.q1.n5(n5(var0, var14)) < var8)) {
            break;
         }

         do {
            double[][] var20 = new double[][]{var5};
            var0 = n5(var0, new double[]{-var14, 1.0}, var20);
            var5 = var20[0];
            if (var1 <= var14 && var14 <= var3) {
               var10.addItem(var14);
            }
         } while (com.aspose.slides.ms.System.q1.n5(n5(var0, var14)) < var8);

         var22 = a6(var0);
      }

      var10.sort();
      return (double[])com.aspose.slides.ms.System.u3.n5(var10.toArray(com.aspose.slides.internal.v6g.k5.n5(double.class)));
   }
}
