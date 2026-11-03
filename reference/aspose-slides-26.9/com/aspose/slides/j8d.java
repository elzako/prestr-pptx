package com.aspose.slides;

class j8d {
   static double[][] n5(double[] var0, double[][] var1) {
      double[][] var2 = new double[5][];
      int var3 = var0.length;
      int var4 = var1[0].length;
      double var5 = 0.0;
      double var7 = 0.0;
      double var9 = 0.0;

      for (int var11 = 0; var11 < 5; var11++) {
         var2[var11] = new double[var4 + 1];
      }

      double[] var44 = new double[var4];

      for (int var12 = 0; var12 < var4; var12++) {
         double var13 = 0.0;

         for (int var15 = 0; var15 < var3; var15++) {
            var13 += var1[var15][var12];
         }

         var44[var12] = var13 / var3;
      }

      for (int var45 = 0; var45 < var3; var45++) {
         var9 += var0[var45];
      }

      var9 /= var3;
      double[][] var46 = new double[var4][];

      for (int var16 = 0; var16 < var4; var16++) {
         var46[var16] = new double[var4];

         for (int var17 = 0; var17 < var4; var17++) {
            double var18 = 0.0;

            for (int var20 = 0; var20 < var3; var20++) {
               var18 += (var1[var20][var16] - var44[var16]) * (var1[var20][var17] - var44[var17]);
            }

            var46[var16][var17] = var18;
         }
      }

      double[] var50 = new double[var4];

      for (int var51 = 0; var51 < var4; var51++) {
         var50[var51] = 0.0;

         for (int var47 = 0; var47 < var3; var47++) {
            var50[var51] += (var1[var47][var51] - var44[var51]) * (var0[var47] - var9);
         }
      }

      double[][] var52 = new double[var4][];

      for (int var48 = 0; var48 < var4; var48++) {
         var52[var48] = new double[var4 + 1];
         System.arraycopy(var46[var48], 0, var52[var48], 0, var4);
         var52[var48][var4] = var50[var48];
      }

      double[] var49 = k5(var52);
      int var21 = 0;

      for (int var53 = var49.length - 1; var53 >= 0 && var49[var53] == 0.0; var53--) {
         var21++;
      }

      double var22 = var9;

      for (int var24 = 0; var24 < var44.length; var24++) {
         var22 -= var49[var24] * var44[var24];
      }

      for (int var54 = 0; var54 < var4; var54++) {
         var2[0][var54] = var49[var4 - var54 - 1];
      }

      var2[0][var4] = var22;
      if (var21 == var49.length) {
         for (int var56 = 0; var56 < var4; var56++) {
            var2[1][var56] = 0.0;
         }

         var2[2][0] = 1.0;
         var2[2][1] = 0.0;
         var2[3][0] = Double.NaN;
         var2[3][1] = var3 - var4;
         var2[4][0] = 0.0;
         var2[4][1] = 0.0;
         return var2;
      } else {
         double[] var55 = new double[var3];

         for (int var25 = 0; var25 < var3; var25++) {
            var55[var25] = 0.0;

            for (int var26 = 0; var26 < var4; var26++) {
               double var27 = var2[0][var4 - var26 - 1];
               var55[var25] += var27 * var1[var25][var26];
            }

            var55[var25] += var2[0][var4];
         }

         for (int var57 = 0; var57 < var3; var57++) {
            var5 += (var0[var57] - var55[var57]) * (var0[var57] - var55[var57]);
            var7 += (var9 - var55[var57]) * (var9 - var55[var57]);
         }

         double var29 = var3 - var4 - 1.0 + var21;
         double var58 = var5 / var29;
         double var31 = com.aspose.slides.ms.System.q1.z3(var58);
         var2[2][1] = var31;
         double[][] var33 = new double[var1.length][];

         for (int var34 = 0; var34 < var1.length; var34++) {
            var33[var34] = new double[var1[var34].length + 1];

            for (int var35 = 0; var35 < var1[var34].length + 1; var35++) {
               if (var35 == 0) {
                  var33[var34][var35] = 1.0;
               } else {
                  var33[var34][var35] = var1[var34][var35 - 1];
               }
            }
         }

         double[][] var59 = l6(var33);
         double[][] var60 = n5(var59, var33);
         double[][] var36 = n5(var60);

         for (int var37 = 0; var37 < var36.length; var37++) {
            for (int var38 = 0; var38 < var36[var37].length; var38++) {
               if (var37 == var38) {
                  double var39 = var36[var37][var38] * var58;
                  var39 = com.aspose.slides.ms.System.q1.z3(var39);
                  var2[1][var36.length - var37 - 1] = var39;
               }
            }
         }

         double var41 = var7 / (var4 - var21) / var58;
         var2[3][0] = var41;
         var2[3][1] = var29;
         var2[4][0] = var7;
         var2[4][1] = var5;
         double var62 = var7 / (var7 + var5);
         var2[2][0] = var62;
         return var2;
      }
   }

   static double[][] l6(double[] var0, double[][] var1) {
      double[][] var2 = new double[5][];
      int var3 = var0.length;
      int var4 = var1[0].length;
      double var5 = 0.0;
      double var7 = 0.0;
      double var9 = 0.0;

      for (int var11 = 0; var11 < 5; var11++) {
         var2[var11] = new double[var4 + 1];
      }

      double[] var43 = new double[var4];

      for (int var12 = 0; var12 < var4; var12++) {
         double var13 = 0.0;

         for (int var15 = 0; var15 < var3; var15++) {
            var13 += var1[var15][var12];
         }

         var43[var12] = var13 / var3;
      }

      for (int var44 = 0; var44 < var3; var44++) {
         var9 += var0[var44];
      }

      var9 /= var3;
      double[][] var45 = new double[var4][];

      for (int var16 = 0; var16 < var4; var16++) {
         var45[var16] = new double[var4];

         for (int var17 = 0; var17 < var4; var17++) {
            double var18 = 0.0;

            for (int var20 = 0; var20 < var3; var20++) {
               var18 += var1[var20][var17] * var1[var20][var16];
            }

            var45[var16][var17] = var18;
         }
      }

      double[] var49 = new double[var4];

      for (int var50 = 0; var50 < var4; var50++) {
         var49[var50] = 0.0;

         for (int var46 = 0; var46 < var3; var46++) {
            var49[var50] += var0[var46] * var1[var46][var50];
         }
      }

      double[][] var51 = new double[var4][];

      for (int var47 = 0; var47 < var4; var47++) {
         var51[var47] = new double[var4 + 1];
         System.arraycopy(var45[var47], 0, var51[var47], 0, var4);
         var51[var47][var4] = var49[var47];
      }

      double[] var48 = k5(var51);
      double var21 = 0.0;

      for (int var23 = 0; var23 < var4; var23++) {
         var2[0][var23] = var48[var4 - var23 - 1];
      }

      var2[0][var4] = var21;
      double[] var52 = new double[var3];

      for (int var24 = 0; var24 < var3; var24++) {
         var52[var24] = 0.0;

         for (int var25 = 0; var25 < var4; var25++) {
            double var26 = var2[0][var4 - var25 - 1];
            var52[var24] += var26 * var1[var24][var25];
         }

         var52[var24] += var2[0][var4];
      }

      for (int var53 = 0; var53 < var3; var53++) {
         var5 += (var0[var53] - var52[var53]) * (var0[var53] - var52[var53]);
         var7 += (var9 - var52[var53]) * (var9 - var52[var53]);
      }

      double var28 = var3 - var4 - 1.0;
      double var54 = var5 / var28;
      double var30 = com.aspose.slides.ms.System.q1.z3(var54);
      var2[2][1] = var30;
      double[][] var32 = new double[var1.length][];

      for (int var33 = 0; var33 < var1.length; var33++) {
         var32[var33] = new double[var1[var33].length + 1];

         for (int var34 = 0; var34 < var1[var33].length + 1; var34++) {
            if (var34 == 0) {
               var32[var33][var34] = 1.0;
            } else {
               var32[var33][var34] = var1[var33][var34 - 1];
            }
         }
      }

      double[][] var55 = l6(var32);
      double[][] var56 = n5(var55, var32);
      double[][] var35 = n5(var56);

      for (int var36 = 0; var36 < var35.length; var36++) {
         for (int var37 = 0; var37 < var35[var36].length; var37++) {
            if (var36 == var37) {
               double var38 = var35[var36][var37] * var54;
               var38 = com.aspose.slides.ms.System.q1.z3(var38);
               var2[1][var35.length - var36 - 1] = var38;
            }
         }
      }

      double var40 = var7 / var4 / var54;
      var2[3][0] = var40;
      var2[3][1] = var28;
      var2[4][0] = var7;
      var2[4][1] = var5;
      double var58 = var7 / (var7 + var5);
      var2[2][0] = var58;
      return var2;
   }

   private static double[] k5(double[][] var0) {
      if (var0 == null) {
         return null;
      }

      int var1 = var0.length;
      int var2 = var0[0].length;
      double[] var3 = new double[var1];
      boolean var4 = false;

      for (int var15 = 0; var15 < var1; var15++) {
         int var5 = var15;
         double var6 = var0[var15][var15];

         for (int var8 = var15 + 1; var8 < var1; var8++) {
            if (com.aspose.slides.ms.System.q1.n5(var6) < com.aspose.slides.ms.System.q1.n5(var0[var8][var15])) {
               var6 = var0[var8][var15];
               var5 = var8;
            }
         }

         if (var15 != var5) {
            for (int var17 = 0; var17 < var2; var17++) {
               double var9 = var0[var15][var17];
               var0[var15][var17] = var0[var5][var17];
               var0[var5][var17] = var9;
            }
         }

         for (int var18 = var15 + 1; var18 < var1; var18++) {
            if (var0[var18][var15] != 0.0) {
               double var19 = -(var0[var18][var15] / var6);

               for (int var11 = var15; var11 < var2; var11++) {
                  var0[var18][var11] = var0[var18][var11] + var0[var15][var11] * var19;
                  if (com.aspose.slides.ms.System.q1.n5(var0[var18][var11]) < 5.0E-14) {
                     var0[var18][var11] = 0.0;
                  }
               }
            }
         }
      }

      for (int var16 = var1 - 1; var16 >= 0; var16--) {
         if (var16 == var1 - 1) {
            if (com.aspose.slides.ms.System.q1.n5(var0[var16][var16]) < 5.0E-14) {
               var3[var16] = 0.0;
            } else {
               var3[var16] = var0[var16][var2 - 1] / var0[var16][var16];
            }
         } else if (com.aspose.slides.ms.System.q1.n5(var0[var16][var16]) < 5.0E-14) {
            var3[var16] = 0.0;
         } else {
            double var12 = 0.0;

            for (int var14 = var16 + 1; var14 < var2 - 1; var14++) {
               var12 += var0[var16][var14] * var3[var14];
            }

            var3[var16] = (var0[var16][var2 - 1] - var12) / var0[var16][var16];
         }
      }

      return var3;
   }

   static double[][] n5(double[][] var0) {
      double[][] var1 = new double[var0.length][];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = new double[var0[0].length + var0[0].length];

         for (int var3 = 0; var3 < var1[var2].length; var3++) {
            if (var3 < var0[0].length) {
               var1[var2][var3] = var0[var2][var3];
            } else if (var3 == var2 + var0[0].length) {
               var1[var2][var3] = 1.0;
            }
         }
      }

      int var16 = var1.length;
      int var17 = var1[0].length;
      int var4 = 1;

      do {
         double var5 = com.aspose.slides.ms.System.q1.n5(var1[var4 - 1][var4 - 1]);
         int var7 = var4 - 1;

         for (int var8 = var4 - 1; var8 < var16; var8++) {
            if (com.aspose.slides.ms.System.q1.n5(var1[var8][var4 - 1]) > var5) {
               var5 = com.aspose.slides.ms.System.q1.n5(var1[var8][var4 - 1]);
               var7 = var8;
            }
         }

         if (var7 != var4 - 1) {
            for (int var19 = 0; var19 < var17; var19++) {
               double var9 = var1[var4 - 1][var19];
               var1[var4 - 1][var19] = var1[var7][var19];
               var1[var7][var19] = var9;
            }
         }

         for (int var20 = var4; var20 < var16; var20++) {
            if (var1[var4 - 1][var4 - 1] == 0.0) {
               return (double[][])null;
            }

            double var24 = var1[var20][var4 - 1] / var1[var4 - 1][var4 - 1];

            for (int var11 = 0; var11 < var17; var11++) {
               var1[var20][var11] = var1[var20][var11] - var24 * var1[var4 - 1][var11];
            }
         }
      } while (++var4 <= var1.length);

      var4 = var1.length - 2;

      do {
         for (int var12 = var4; var12 >= 0; var12--) {
            if (var1[var4 + 1][var4 + 1] == 0.0) {
               return (double[][])null;
            }

            double var13 = var1[var12][var4 + 1] / var1[var4 + 1][var4 + 1];
            if (com.aspose.slides.ms.System.q1.n5(var1[var4 + 1][var4 + 1]) < 5.0E-14) {
               var13 = 0.0;
            }

            for (int var21 = 0; var21 < var17; var21++) {
               var1[var12][var21] = var1[var12][var21] - var13 * var1[var4 + 1][var21];
            }
         }
      } while (--var4 >= 0);

      for (int var25 = 0; var25 < var16; var25++) {
         double var27 = var1[var25][var25];
         if (com.aspose.slides.ms.System.q1.n5(var27) < 5.0E-14) {
            for (int var23 = 0; var23 < var17; var23++) {
               var1[var25][var23] = 0.0;
            }
         } else {
            for (int var22 = 0; var22 < var17; var22++) {
               var1[var25][var22] = var1[var25][var22] / var27;
            }
         }
      }

      double[][] var26 = new double[var0.length][];

      for (int var15 = 0; var15 < var16; var15++) {
         var26[var15] = new double[var16];
         System.arraycopy(var1[var15], 0 + var16, var26[var15], 0, var16);
      }

      return var26;
   }

   static double[][] l6(double[][] var0) {
      if (var0 == null) {
         return (double[][])null;
      }

      int var1 = var0.length;
      int var2 = var0[0].length;
      double[][] var3 = new double[var2][];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = new double[var1];
      }

      for (int var6 = 0; var6 < var2; var6++) {
         for (int var5 = 0; var5 < var1; var5++) {
            var3[var6][var5] = var0[var5][var6];
         }
      }

      return var3;
   }

   static double[][] n5(double[][] var0, double[][] var1) {
      if (var0 != null && var1 != null) {
         int var2 = var0.length;
         int var3 = var0[0].length;
         int var4 = var1[0].length;
         double[][] var5 = new double[var2][];

         for (int var6 = 0; var6 < var2; var6++) {
            var5[var6] = new double[var4];
         }

         for (int var9 = 0; var9 < var2; var9++) {
            for (int var7 = 0; var7 < var4; var7++) {
               var5[var9][var7] = 0.0;

               for (int var8 = 0; var8 < var3; var8++) {
                  var5[var9][var7] = var5[var9][var7] + var0[var9][var8] * var1[var8][var7];
               }
            }
         }

         return var5;
      } else {
         return (double[][])null;
      }
   }
}
