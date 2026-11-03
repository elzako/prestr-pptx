package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.y4;

class n5$u3 extends n5$y4 {
   protected final int n5;
   private double[] l6;

   public n5$u3(int var1, int var2, int var3, y2 var4) {
      super(var1, var2, var3, var4.n3());
      this.n5 = var1 / 8;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);

      for (int var8 = 0; var8 < var6; var8++) {
         var3[var4] = com.aspose.slides.internal.v6g.k5.n5((Object)(0.5 + 100.0 * (var3[var4] & 0xFF) / 255.0), 14);
         byte[] var9 = new byte[3];
         com.aspose.slides.ms.System.y4.n5(new byte[]{var3[var4], var3[var4 + 1], var3[var4 + 2]}, 0, var9, 0, 3);
         int var10 = this.n5(var9[0], var9[1], var9[2]);
         var7[var2[0]++] = var10;
         var4 += this.n5;
      }
   }

   protected int n5(double var1, double var3, double var5) {
      this.l6(var1, var3, var5);
      return this.k5(this.l6[0], this.l6[1], this.l6[2]);
   }

   private void l6(double var1, double var3, double var5) {
      double var7 = (var1 + 16.0) / 116.0;
      double var9 = var3 / 500.0 + var7;
      double var11 = var7 - var5 / 200.0;
      if (q1.a6(var7, 3.0) > 0.008856) {
         var7 = q1.a6(var7, 3.0);
      } else {
         var7 = (var7 - 0.13793103448275862) / 7.787;
      }

      if (q1.a6(var9, 3.0) > 0.008856) {
         var9 = q1.a6(var9, 3.0);
      } else {
         var9 = (var9 - 0.13793103448275862) / 7.787;
      }

      if (q1.a6(var11, 3.0) > 0.008856) {
         var11 = q1.a6(var11, 3.0);
      } else {
         var11 = (var11 - 0.13793103448275862) / 7.787;
      }

      double var13 = 95.047;
      double var15 = 100.0;
      double var17 = 108.883;
      double var19 = var13 * var9;
      double var21 = var15 * var7;
      double var23 = var17 * var11;
      this.l6 = new double[]{var19, var21, var23};
   }

   private int k5(double var1, double var3, double var5) {
      double var7 = var1 / 100.0;
      double var9 = var3 / 100.0;
      double var11 = var5 / 100.0;
      double var13 = 3.2406 * var7 + -1.5372 * var9 + -0.4986 * var11;
      double var15 = -0.9689 * var7 + 1.8758 * var9 + 0.0415 * var11;
      double var17 = 0.0557 * var7 + -0.204 * var9 + 1.057 * var11;
      if (var13 > 0.0031308) {
         var13 = 1.055 * q1.a6(var13, 0.4166666666666667) - 0.055;
      } else {
         var13 = 12.92 * var13;
      }

      if (var15 > 0.0031308) {
         var15 = 1.055 * q1.a6(var15, 0.4166666666666667) - 0.055;
      } else {
         var15 = 12.92 * var15;
      }

      if (var17 > 0.0031308) {
         var17 = 1.055 * q1.a6(var17, 0.4166666666666667) - 0.055;
      } else {
         var17 = 12.92 * var17;
      }

      double var19 = var13 * 255.0;
      double var21 = var15 * 255.0;
      double var23 = var17 * 255.0;
      if (var19 >= 255.0) {
         var19 = 255.0;
      }

      if (var21 >= 255.0) {
         var21 = 255.0;
      }

      if (var23 >= 255.0) {
         var23 = 255.0;
      }

      if (var19 < 0.0) {
         var19 = 0.0;
      }

      if (var21 < 0.0) {
         var21 = 0.0;
      }

      if (var23 < 0.0) {
         var23 = 0.0;
      }

      int var25 = com.aspose.slides.internal.v6g.k5.u3(var19, 14) << 16;
      int var26 = com.aspose.slides.internal.v6g.k5.u3(var21, 14) << 8;
      int var27 = com.aspose.slides.internal.v6g.k5.u3(var23, 14);
      return 0xFF000000 | var25 | var26 | var27;
   }
}
