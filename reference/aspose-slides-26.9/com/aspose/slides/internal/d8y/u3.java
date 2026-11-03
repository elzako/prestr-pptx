package com.aspose.slides.internal.d8y;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.q1;

public class u3 implements n5 {
   @Override
   public final void n5(float[] var1, k5 var2, l6 var3) {
      if (!var2.n5(var1)) {
         if (var3 == null) {
            throw new ArgumentNullException("gamutMappingContext");
         }

         float[] var4 = new float[3];
         System.arraycopy(var1, 0, var4, 0, var4.length);
         com.aspose.slides.internal.g7i.l6.l6(var4);
         float[] var5 = com.aspose.slides.internal.g7i.l6.k5(var4);
         float var6 = var5[0];
         float var7 = var5[1];
         float var8 = var5[2];
         float var9 = var3.n5(var8);
         float var10 = (float)(q1.u3(var7, var9 - var6) * 180.0 / Math.PI);
         float var11 = 0.005F;
         float var12 = -1.0F;
         float var13 = -1.0F;
         float var14 = -1.0F;
         float var15 = -1.0F;
         float var16 = var9;
         float var17 = var6;
         float var18 = var3.n5(var8, var17);
         if (!(var18 < 0.0F)) {
            while (true) {
               double var19 = (float)q1.u3(var18, var9 - var17) * 180.0 / Math.PI;
               double var21 = var19 - var10;
               if (var21 <= 0.0) {
                  if (q1.n5(var21) <= 0.005F) {
                     var12 = var18;
                     var13 = var17;
                     if (var14 >= 0.0F) {
                        break;
                     }
                  }

                  float var23 = var17;
                  var17 += (float)(q1.n5(var16 - var17) / 2.0);
                  var16 = var23;
               } else {
                  if (q1.n5(var21) <= 0.005F) {
                     var14 = var18;
                     var15 = var17;
                     if (var12 >= 0.0F) {
                        break;
                     }
                  }

                  float var35 = var17;
                  var17 -= (float)(q1.n5(var16 - var17) / 2.0);
                  var16 = var35;
               }

               var18 = var3.n5(var8, var17);
            }

            double var33 = (var9 - var6) / (0.0 - var7);
            double var34 = var6 - var33 * var7;
            double var24 = (var15 - var13) / (var14 - var12);
            double var26 = var13 - var24 * var12;
            double var28 = (var26 - var34) / (var33 - var24);
            double var30 = var33 * var28 + var34;
            var5[0] = (float)var30;
            var5[1] = (float)var28;
            var5[2] = var8;
            var4 = com.aspose.slides.internal.g7i.l6.u3(var5);
            com.aspose.slides.internal.g7i.l6.n5(var4);
            System.arraycopy(var4, 0, var1, 0, var4.length);
         }
      }
   }
}
