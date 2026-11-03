package com.aspose.slides.internal.r3x;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.x9;

public class c8 {
   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, int var1) {
      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(var0.e2(), var0.h0(), 2498570);
      Object var3 = null;
      int var4 = 0;
      int[][] var5 = (int[][])null;
      int[][] var6 = new int[][]{(int[])var3};
      int[] var7 = new int[]{0};
      int[][][] var8 = new int[][][]{var5};
      n5(var1, var6, var7, var8);
      var3 = var6[0];
      var4 = var7[0];
      var5 = var8[0];
      y2 var9 = new y2(0, 0, var0.e2(), var0.h0());
      com.aspose.slides.internal.j9e.n5 var10 = var0.n5(var9.n3(), 1, var0.s7());
      int var11 = var10.l6() * var10.n5();
      int[] var12 = new int[var11];
      int[] var13 = new int[var11];
      int[] var14 = new int[var11];
      int[] var15 = new int[var11];
      int[] var16 = new int[var11];
      int[] var17 = new int[var11];
      int[] var18 = new int[var11];
      int[] var19 = new int[var11];
      n5(var12, var13, var14, var15, var10);
      var0.n5(var10);
      int var20 = 0;
      int var21 = 0;

      for (int var22 = 0; var22 < var10.n5(); var22++) {
         for (int var23 = 0; var23 < var10.l6(); var23++) {
            int var24 = 0;
            int var25 = 0;
            int var26 = 0;
            int var27 = 0;
            int var28 = var21 - var1;

            for (int var29 = 0; var29 < ((Object[])var3).length; var29++) {
               if (var28 < var20) {
                  var27 += var5[var29][var12[var20]];
                  var26 += var5[var29][var13[var20]];
                  var25 += var5[var29][var14[var20]];
                  var24 += var5[var29][var15[var20]];
               } else if (var28 > var20 + var10.l6() - 1) {
                  int var30 = var20 + var10.l6() - 1;
                  var27 += var5[var29][var12[var30]];
                  var26 += var5[var29][var13[var30]];
                  var25 += var5[var29][var14[var30]];
                  var24 += var5[var29][var15[var30]];
               } else {
                  var27 += var5[var29][var12[var28]];
                  var26 += var5[var29][var13[var28]];
                  var25 += var5[var29][var14[var28]];
                  var24 += var5[var29][var15[var28]];
               }

               var28++;
            }

            var16[var21] = var27 / var4;
            var17[var21] = var26 / var4;
            var18[var21] = var25 / var4;
            var19[var21] = var24 / var4;
            var21++;
         }

         var20 += var10.l6();
      }

      com.aspose.slides.internal.j9e.n5 var41 = var2.n5(var9.n3(), 2, var0.s7());
      x9 var47 = var41.u3();
      int var48 = 0;

      for (int var31 = 0; var31 < var10.n5(); var31++) {
         int var32 = var31 - var1;
         var20 = var32 * var10.l6();

         for (int var33 = 0; var33 < var10.l6(); var33++) {
            int var42 = 0;
            int var43 = 0;
            int var44 = 0;
            int var45 = 0;
            int var46 = var20 + var33;
            int var40 = var32;

            for (int var34 = 0; var34 < ((Object[])var3).length; var34++) {
               if (var40 < 0) {
                  var45 += var5[var34][var16[var33]];
                  var44 += var5[var34][var17[var33]];
                  var43 += var5[var34][var18[var33]];
                  var42 += var5[var34][var19[var33]];
               } else if (var40 > var10.n5() - 1) {
                  int var35 = var11 - (var10.l6() - var33);
                  var45 += var5[var34][var16[var35]];
                  var44 += var5[var34][var17[var35]];
                  var43 += var5[var34][var18[var35]];
                  var42 += var5[var34][var19[var35]];
               } else {
                  var45 += var5[var34][var16[var46]];
                  var44 += var5[var34][var17[var46]];
                  var43 += var5[var34][var18[var46]];
                  var42 += var5[var34][var19[var46]];
               }

               var46 += var10.l6();
               var40++;
            }

            com.aspose.slides.internal.e3m.n5.n5(var47, var48++, (byte)(var45 / var4));
            com.aspose.slides.internal.e3m.n5.n5(var47, var48++, (byte)(var44 / var4));
            com.aspose.slides.internal.e3m.n5.n5(var47, var48++, (byte)(var43 / var4));
            com.aspose.slides.internal.e3m.n5.n5(var47, var48++, (byte)(var42 / var4));
         }
      }

      var2.n5(var41);
      return var2;
   }

   static void n5(int var0, int[][] var1, int[] var2, int[][][] var3) {
      int var4 = var0 * 2 + 1;
      var1[0] = new int[var4];
      var2[0] = 0;
      var3[0] = new int[var4][256];

      for (int var5 = 1; var5 <= var0; var5++) {
         int var6 = var0 - var5;
         int var7 = var0 + var5;
         int var8 = (var6 + 1) * (var6 + 1);
         var1[0][var6] = var8;
         var1[0][var7] = var8;
         var2[0] += var1[0][var7] + var1[0][var6];

         for (int var9 = 0; var9 < 256; var9++) {
            int var10 = var1[0][var7] * var9;
            var3[0][var6][var9] = var10;
            var3[0][var7][var9] = var10;
         }
      }

      var1[0][var0] = (var0 + 1) * (var0 + 1);
      var2[0] += var1[0][var0];

      for (int var11 = 0; var11 < 256; var11++) {
         var3[0][var0][var11] = var1[0][var0] * var11;
      }
   }

   static void n5(int[] var0, int[] var1, int[] var2, int[] var3, com.aspose.slides.internal.j9e.n5 var4) {
      x9 var5 = var4.u3();
      int var6 = 0;
      int var7 = 0;

      for (int var8 = 0; var8 < var4.n5(); var8++) {
         for (int var9 = 0; var9 < var4.l6(); var9++) {
            var0[var6] = com.aspose.slides.internal.e3m.n5.n5(var5, var7++) & 255;
            var1[var6] = com.aspose.slides.internal.e3m.n5.n5(var5, var7++) & 255;
            var2[var6] = com.aspose.slides.internal.e3m.n5.n5(var5, var7++) & 255;
            var3[var6] = com.aspose.slides.internal.e3m.n5.n5(var5, var7++) & 255;
            var6++;
         }
      }
   }
}
