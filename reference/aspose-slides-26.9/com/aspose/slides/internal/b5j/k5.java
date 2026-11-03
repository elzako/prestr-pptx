package com.aspose.slides.internal.b5j;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.ms.System.q1;

public class k5 {
   private static void n5(w1 var0, w1 var1, boolean var2, boolean var3, float[] var4, float[] var5, int[] var6) {
      var4[0] = var0.l6() * var1.l6() + var0.k5() * var1.k5();
      var5[0] = var0.l6() * var1.k5() - var0.k5() * var1.l6();
      if (var4[0] >= 0.0F) {
         if (!var2) {
            var6[0] = 1;
            return;
         }

         var6[0] = 4;
      } else {
         var6[0] = var2 ? 3 : 2;
      }

      float var7 = (float)q1.u3(var5[0], var4[0]);
      if (var3) {
         if (var7 < 0.0F) {
            var7 += (float) (Math.PI * 2);
         }
      } else if (var7 > 0.0F) {
         var7 -= (float) (Math.PI * 2);
      }

      var7 /= var6[0];
      var4[0] = (float)q1.c8(var7);
      var5[0] = (float)q1.h0(var7);
   }

   private static float n5(float var0, float var1) {
      float var2 = var1 * var1;
      float var3 = 0.0F;
      float var4 = (var2 + var0) / 2.0F;
      if (var4 < 0.0F) {
         return var3;
      }

      float var5 = var2 - var4;
      if (var5 <= 0.0F) {
         return var3;
      }

      var5 = (float)q1.z3(var5);
      var4 = (float)q1.z3(var4);
      var3 = 4.0F * (var1 - var4) / 3.0F;
      if (var3 <= var5 * 1.0E-6F) {
         var3 = 0.0F;
      } else {
         var3 = 4.0F * (var1 - var4) / var5 / 3.0F;
      }

      return var3;
   }

   private static boolean n5(float var0, float var1, float[] var2) {
      boolean var3 = var2[0] * var2[0] > var0 * var1;
      if (var3 && var2[0] < 0.0F) {
         var2[0] = 0.0F;
      }

      return var3;
   }

   public static List<w1> n5(float var0, float var1, float var2, float var3, float var4, boolean var5, boolean var6, float var7, float var8, int[] var9) {
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = (float) (Math.PI / 180.0);
      float var13 = 1.0E-12F;
      boolean var14 = false;
      var9[0] = -1;
      float var15 = (var7 - var0) / 2.0F;
      float var16 = (var8 - var1) / 2.0F;
      float var17 = var15 * var15 + var16 * var16;
      if (var17 < 1.0E-12F) {
         return null;
      }

      float[] var18 = new float[]{var2};
      float[] var19 = new float[]{var3};
      boolean var20 = !n5(var17, 1.0E-12F, var18) || !n5(var17, 1.0E-12F, var19);
      var2 = var18[0];
      var3 = var19[0];
      if (var20) {
         var9[0] = 0;
         return null;
      }

      if (var2 != 0.0F && var3 != 0.0F) {
         var4 = -var4 * (float) (Math.PI / 180.0);
         float var21 = (float)q1.c8(var4);
         float var22 = (float)q1.h0(var4);
         float var23 = var15 * var21 - var16 * var22;
         var16 = var15 * var22 + var16 * var21;
         var15 = var23;
         var15 /= var2;
         var16 /= var3;
         var17 = var15 * var15 + var16 * var16;
         float var24;
         float var25;
         if (var17 > 1.0F) {
            var23 = (float)q1.z3(var17);
            var2 *= var23;
            var3 *= var23;
            var24 = 0.0F;
            var25 = 0.0F;
            var14 = true;
            var15 /= var23;
            var16 /= var23;
         } else {
            var23 = (float)q1.z3((1.0F - var17) / var17);
            if (var5 != var6) {
               var25 = -var23 * var16;
               var24 = var23 * var15;
            } else {
               var25 = var23 * var16;
               var24 = -var23 * var15;
            }
         }

         w1 var26 = new w1(-var15 - var25, -var16 - var24);
         w1 var27 = new w1(var15 - var25, var16 - var24);
         com.aspose.slides.internal.w0.c8 var28 = new com.aspose.slides.internal.w0.c8(
            var21 * var2, -var22 * var2, var22 * var3, var21 * var3, (var7 + var0) / 2.0F, (var8 + var1) / 2.0F
         );
         if (!var14) {
            var28.l6(var28.u3() * var25 + var28.u9() * var24, var28.a6() * var25 + var28.h0() * var24, 1);
         }

         float[] var29 = new float[]{0.0F};
         float[] var30 = new float[]{0.0F};
         n5(var26.u3(), var27.u3(), var5, var6, var29, var30, var9);
         var10 = var29[0];
         var11 = var30[0];
         float var31 = n5(var10, 1.0F);
         if (!var6) {
            var31 = -var31;
         }

         float var32 = -var31 * var26.k5();
         float var33 = var31 * var26.l6();
         List var34 = new List();

         for (int var35 = 1; var35 < var9[0]; var35++) {
            w1 var36 = new w1(var26.l6() * var10 - var26.k5() * var11, var26.l6() * var11 + var26.k5() * var10);
            float var37 = -var31 * var36.k5();
            float var38 = var31 * var36.l6();
            var34.addItem(var28.n5(new w1(var26.l6() + var32, var26.k5() + var33)).u3());
            var34.addItem(var28.n5(new w1(var36.l6() - var37, var36.k5() - var38)).u3());
            var34.addItem(var28.n5(var36.u3()).u3());
            var36.n5(var26);
            var32 = var37;
            var33 = var38;
         }

         float var51 = -var31 * var27.k5();
         float var52 = var31 * var27.l6();
         var34.addItem(var28.n5(new w1(var26.l6() + var32, var26.k5() + var33)).u3());
         var34.addItem(var28.n5(new w1(var27.l6() - var51, var27.k5() - var52)).u3());
         var34.addItem(new w1(var7, var8));
         return var34;
      } else {
         var9[0] = 0;
         return null;
      }
   }
}
