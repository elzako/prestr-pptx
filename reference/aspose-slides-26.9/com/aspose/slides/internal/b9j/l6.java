package com.aspose.slides.internal.b9j;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.u3;

public class l6 {
   public static double[][] n5(int var0, double var1) {
      double[][] var3 = new double[var0][var0];
      double var4 = 0.0;
      int var6 = var0 / 2;
      double var7 = 0.0;
      double var9 = 1.0 / ((Math.PI * 2) * q1.a6(var1, 2.0));

      for (int var11 = -var6; var11 <= var6; var11++) {
         for (int var12 = -var6; var12 <= var6; var12++) {
            var7 = (var12 * var12 + var11 * var11) / (2.0 * (var1 * var1));
            var3[var11 + var6][var12 + var6] = var9 * q1.z1(-var7);
            var4 += var3[var11 + var6][var12 + var6];
         }
      }

      for (int var14 = 0; var14 < var0; var14++) {
         for (int var15 = 0; var15 < var0; var15++) {
            var3[var14][var15] = var3[var14][var15] * (1.0 / var4);
         }
      }

      return var3;
   }

   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, double[][] var1, float var2) {
      return n5(var0, var1, var2, 1.0, 0);
   }

   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, double[][] var1, float var2, double var3, int var5) {
      com.aspose.slides.internal.j9e.n5 var6 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 1, 2498570);
      byte[] var7 = new byte[var6.a6() * var6.n5()];
      byte[] var8 = new byte[var6.a6() * var6.n5()];
      com.aspose.slides.internal.e3m.n5.n5(var6.u3(), var7, 0, var7.length);
      var0.n5(var6);
      double var9 = 0.0;
      double var11 = 0.0;
      double var13 = 0.0;
      double var15 = 0.0;
      int var17 = u3.n5(var1, 2).a6(1);
      int var18 = u3.n5(var1, 2).a6(0);
      int var19 = (var17 - 1) / 2;
      int var20 = 0;
      int var21 = 0;

      for (int var22 = var19; var22 < var0.h0() - var19; var22++) {
         for (int var23 = var19; var23 < var0.e2() - var19; var23++) {
            var9 = 0.0;
            var11 = 0.0;
            var13 = 0.0;
            var15 = 0.0;
            var21 = var22 * var6.a6() + var23 * 4;

            for (int var24 = -var19; var24 <= var19; var24++) {
               for (int var25 = -var19; var25 <= var19; var25++) {
                  var20 = var21 + var25 * 4 + var24 * var6.a6();
                  var9 += (var7[var20] & 0xFF) * var1[var24 + var19][var25 + var19];
                  var11 += (var7[var20 + 1] & 0xFF) * var1[var24 + var19][var25 + var19];
                  var13 += (var7[var20 + 2] & 0xFF) * var1[var24 + var19][var25 + var19];
                  var15 += (var7[var20 + 3] & 0xFF) * var1[var24 + var19][var25 + var19];
               }
            }

            var9 = var3 * var9 + var5;
            var11 = var3 * var11 + var5;
            var13 = var3 * var13 + var5;
            var15 = var3 * var15 + var5;
            var9 = var9 > 255.0 ? 255.0 : (var9 < 0.0 ? 0.0 : var9);
            var11 = var11 > 255.0 ? 255.0 : (var11 < 0.0 ? 0.0 : var11);
            var13 = var13 > 255.0 ? 255.0 : (var13 < 0.0 ? 0.0 : var13);
            var15 = var15 > 255.0 ? 255.0 : (var15 < 0.0 ? 0.0 : var15);
            var8[var21] = k5.n5((Object)(var9), (int)(14));
            var8[var21 + 1] = k5.n5((Object)(var11), (int)(14));
            var8[var21 + 2] = k5.n5((Object)(var13), (int)(14));
            var8[var21 + 3] = k5.n5((Object)(var15 * var2), (int)(14));
         }
      }

      com.aspose.slides.internal.o9b.l6 var40 = new com.aspose.slides.internal.o9b.l6(var0.e2(), var0.h0());
      com.aspose.slides.internal.j9e.n5 var41 = var40.n5(new y2(0, 0, var40.e2(), var40.h0()), 2, 2498570);
      com.aspose.slides.internal.e3m.n5.n5(var8, 0, var41.u3(), var8.length);
      var40.n5(var41);
      return var40;
   }
}
