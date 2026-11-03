package com.aspose.slides.internal.k4d;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x9;

public class k5 {
   public static void n5(com.aspose.slides.internal.o9b.l6 var0, int var1) {
      int var2 = var0.e2();
      int var3 = var0.h0();
      y2 var4 = new y2(0, 0, var2, var3);
      com.aspose.slides.internal.j9e.n5 var5 = var0.n5(var4.n3(), 3, 2498570);
      x9 var6 = var5.u3();
      int var7 = q1.n5(var5.a6());
      int var8 = var7 * var3;
      byte[] var9 = new byte[var8];
      com.aspose.slides.internal.e3m.n5.n5(var6, var9, 0, var8);
      byte[] var10 = new byte[var8 >> 2];

      for (int var11 = 0; var11 < var1; var11++) {
         for (int var12 = 0; var12 < var3; var12++) {
            int var13 = var12 * var7;

            for (int var14 = 0; var14 < var2 - 1; var13 += 4) {
               int var15 = var13 + 4;
               byte var16 = var9[var13 + 3];
               byte var17 = var9[var15 + 3];
               if ((var16 & 255) == 0 && (var17 & 255) != 0) {
                  var9[var13 + 0] = var9[var15 + 0];
                  var9[var13 + 1] = var9[var15 + 1];
                  var9[var13 + 2] = var9[var15 + 2];
                  var10[var13 >> 2] = var17;
               }

               if ((var17 & 255) == 0 && (var16 & 255) != 0) {
                  var9[var15 + 0] = var9[var13 + 0];
                  var9[var15 + 1] = var9[var13 + 1];
                  var9[var15 + 2] = var9[var13 + 2];
                  var10[var15 >> 2] = var16;
               }

               var14++;
            }
         }

         for (int var18 = 0; var18 < var3 - 1; var18++) {
            int var20 = var18 * var7;

            for (int var22 = 0; var22 < var2; var20 += 4) {
               int var24 = var20 + var7;
               byte var26 = var9[var20 + 3];
               byte var27 = var9[var24 + 3];
               if ((var26 & 255) == 0 && (var27 & 255) != 0) {
                  var9[var20 + 0] = var9[var24 + 0];
                  var9[var20 + 1] = var9[var24 + 1];
                  var9[var20 + 2] = var9[var24 + 2];
                  var10[var20 >> 2] = var27;
               }

               if ((var27 & 255) == 0 && (var26 & 255) != 0) {
                  var9[var24 + 0] = var9[var20 + 0];
                  var9[var24 + 1] = var9[var20 + 1];
                  var9[var24 + 2] = var9[var20 + 2];
                  var10[var24 >> 2] = var26;
               }

               var22++;
            }
         }

         for (int var19 = 0; var19 < var3; var19++) {
            int var21 = var19 * var7;

            for (int var23 = 0; var23 < var2; var21 += 4) {
               byte var25 = var10[var21 >> 2];
               if ((var25 & 255) != 0) {
                  var9[var21 + 3] = var10[var21 >> 2];
               }

               var23++;
            }
         }
      }

      com.aspose.slides.internal.e3m.n5.n5(var9, 0, var6, var8);
      var0.n5(var5);
   }
}
