package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class k3o {
   private static int n5(Chart var0) {
      int var1 = 0;
      IGenericEnumerator var2 = var0.getChartData().getSeries().iterator();

      try {
         while (var2.hasNext()) {
            ChartSeries var3 = (ChartSeries)var2.next();
            if ((var3.n5().n5() & 4294967295L) > var1) {
               var1 = (int)var3.n5().n5();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public static com.aspose.slides.internal.o9b.c8[] n5(Chart var0, int var1) {
      return n5(var0, var1, n5(var0) + 1);
   }

   public static com.aspose.slides.internal.o9b.c8[] n5(Chart var0, int var1, int var2) {
      if (var2 <= 0) {
         return null;
      }

      com.aspose.slides.internal.o9b.c8[] var3 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), 6)
      );
      var0.n5((byte)4).n5(var3[0]);
      var0.n5((byte)5).n5(var3[1]);
      var0.n5((byte)6).n5(var3[2]);
      var0.n5((byte)7).n5(var3[3]);
      var0.n5((byte)8).n5(var3[4]);
      var0.n5((byte)9).n5(var3[5]);
      int var4 = var1 % 8;
      com.aspose.slides.internal.o9b.c8[] var5;
      switch (var4) {
         case 0:
            var5 = n5(new com.aspose.slides.internal.o9b.c8[]{var3[5]}, var4, var2);
            break;
         case 1:
            com.aspose.slides.internal.o9b.c8 var6 = var0.n5((byte)0).o8();
            if (var1 == 41) {
               double[] var9 = new double[]{0.05, 0.55, 0.78, 0.15, 0.7, 0.3};

               for (int var10 = 0; var10 < 6; var10++) {
                  n5(var6.o8(), var9[var10]).n5(var3[var10]);
               }

               return n5(var3, var4, var2);
            }

            double[] var7 = new double[]{0.88, 0.55, 0.78, 0.92, 0.7, 0.3};

            for (int var8 = 0; var8 < 6; var8++) {
               n5(var6.o8(), var7[var8]).n5(var3[var8]);
            }

            var5 = n5(var3, var4, var2);
            break;
         case 2:
            var5 = n5(var3, var4, var2);
            break;
         case 3:
            var5 = n5(new com.aspose.slides.internal.o9b.c8[]{var3[0]}, var4, var2);
            break;
         case 4:
            var5 = n5(new com.aspose.slides.internal.o9b.c8[]{var3[1]}, var4, var2);
            break;
         case 5:
            var5 = n5(new com.aspose.slides.internal.o9b.c8[]{var3[2]}, var4, var2);
            break;
         case 6:
            var5 = n5(new com.aspose.slides.internal.o9b.c8[]{var3[3]}, var4, var2);
            break;
         case 7:
            var5 = n5(new com.aspose.slides.internal.o9b.c8[]{var3[4]}, var4, var2);
            break;
         default:
            var5 = n5(var3, var4, var2);
      }

      n5(var5);
      return var5;
   }

   private static com.aspose.slides.internal.o9b.c8[] n5(com.aspose.slides.internal.o9b.c8[] var0, int var1, int var2) {
      com.aspose.slides.internal.o9b.c8[] var3 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var2)
      );
      int var4 = 0;
      if ((var1 == 1 || var1 == 2) && var0.length == 6 || (var1 == 0 || var1 > 2) && var0.length == 1) {
         if (var0.length == 6) {
            if (var2 < var0.length) {
               while (var4 < var2) {
                  var0[var4].n5(var3[var4]);
                  var4++;
               }

               return var3;
            }
         } else if (var1 > 2 && var2 == 1) {
            var0[0].n5(var3[0]);
            return var3;
         }

         int var5 = 1;
         if (var0.length == 6) {
            var5 = var2 / 6 + 1;
         } else {
            var5 = var2;
         }

         int var6 = com.aspose.slides.internal.v6g.k5.u3(var5 / 2.0 + 0.5, 14);

         int var7;
         for (var7 = 1; var7 < var6 + 1 && var4 < var2; var7++) {
            double var8 = com.aspose.slides.ms.System.q1.k5(30.0 + 140.0 * var7 / (var5 + 1.0)) / 100.0;
            if (var0.length == 6) {
               for (int var10 = 0; var10 < 6 && var4 < var2; var10++) {
                  com.aspose.slides.internal.o9b.c8 var11 = l6(var0[var10].o8(), var8).o8();
                  var11.n5(var3[var4]);
                  var4++;
               }
            } else {
               com.aspose.slides.internal.o9b.c8 var14 = l6(var0[0].o8(), var8).o8();
               var14.n5(var3[var4]);
               var4++;
            }
         }

         for (; var7 < var5 + 1 && var4 < var2; var7++) {
            double var13 = com.aspose.slides.ms.System.q1.l6(170.0 - 140.0 * var7 / (var5 + 1.0)) / 100.0;
            if (var0.length == 6) {
               for (int var15 = 0; var15 < 6 && var4 < var2; var15++) {
                  com.aspose.slides.internal.o9b.c8 var17 = n5(var0[var15].o8(), var13).o8();
                  var17.n5(var3[var4]);
                  var4++;
               }
            } else {
               com.aspose.slides.internal.o9b.c8 var16 = n5(var0[0].o8(), var13).o8();
               var16.n5(var3[var4]);
               var4++;
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0, double var1) {
      int[] var3 = new int[]{var0.x8() & 255, var0.n3() & 255, var0.y4() & 255};

      for (int var4 = 0; var4 < 3; var4++) {
         double var5 = n5(var3[var4]);
         double var7 = var5 * (1.0 + (1.0 - var1));
         if (var1 > 0.0) {
            var7 = var5 * (1.0 - (1.0 - var1)) + (1.0 - var1);
         }

         var3[var4] = n5(var7);
      }

      return com.aspose.slides.internal.o9b.c8.n5(var3[0], var3[1], var3[2]);
   }

   static com.aspose.slides.internal.o9b.c8 l6(com.aspose.slides.internal.o9b.c8 var0, double var1) {
      int[] var3 = new int[]{var0.x8() & 255, var0.n3() & 255, var0.y4() & 255};

      for (int var4 = 0; var4 < 3; var4++) {
         double var5 = n5(var3[var4]);
         double var7 = var5 * var1;
         if (var7 < 0.0) {
            var7 = 0.0;
         } else if (var7 > 1.0) {
            var7 = 1.0;
         }

         var3[var4] = n5(var7);
      }

      return com.aspose.slides.internal.o9b.c8.n5(var3[0], var3[1], var3[2]);
   }

   private static double n5(int var0) {
      double var1 = var0 / 255.0;
      double var3 = 0.0;
      if (var1 < 0.0) {
         var3 = 0.0;
      } else if (var1 <= 0.04045) {
         var3 = var1 / 12.92;
      } else if (var1 <= 1.0) {
         var3 = com.aspose.slides.ms.System.q1.a6((var1 + 0.055) / 1.055, 2.4);
      } else {
         var3 = 1.0;
      }

      return var3;
   }

   private static int n5(double var0) {
      double var2 = 0.0;
      if (var0 < 0.0) {
         var2 = 0.0;
      } else if (var0 <= 0.0031308) {
         var2 = var0 * 12.92;
      } else if (var0 < 1.0) {
         var2 = 1.055 * com.aspose.slides.ms.System.q1.a6(var0, 0.4166666666666667) - 0.055;
      } else {
         var2 = 1.0;
      }

      return com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5(var2 * 255.0, 0, (short)1), 14);
   }

   private static void n5(com.aspose.slides.internal.o9b.c8[] var0) {
      if (var0 != null) {
         for (int var1 = 0; var1 < var0.length; var1++) {
            com.aspose.slides.internal.o9b.c8 var2 = var0[var1].o8();
            com.aspose.slides.internal.o9b.c8.n5(255, var2.o8()).n5(var0[var1]);
         }
      }
   }
}
