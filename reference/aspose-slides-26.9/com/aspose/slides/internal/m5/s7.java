package com.aspose.slides.internal.m5;

import com.aspose.slides.internal.g4.n3;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.q1;

public class s7 {
   public static com.aspose.slides.internal.g4.t2 n5(n5 var0, m1 var1, String var2) {
      if (var0 == null) {
         return null;
      }

      com.aspose.slides.internal.v2.n5 var3 = var0.l6();
      if (var3 != null && var3.n5() >= 4) {
         float var4 = n5(var3.k5(0));
         float var5 = n5(var3.k5(1));
         float var6 = n5(var3.k5(2));
         float var7 = n5(var3.k5(3));
         w1 var8 = new w1(var4, var5);
         w1 var9 = new w1(var6, var7);
         com.aspose.slides.internal.t8.u3.n5(var1, var8.u3()).n5(var8);
         com.aspose.slides.internal.t8.u3.n5(var1, var9.u3()).n5(var9);
         if (q1.n5(var8.l6() - var9.l6()) < 0.01F && q1.n5(var8.k5() - var9.k5()) < 0.01F) {
            var9.n5(var9.l6() + 1.0F);
         }

         com.aspose.slides.internal.j0.l6 var10 = var0.a6();
         if (var10 == null) {
            return null;
         }

         com.aspose.slides.internal.v2.n5 var11 = var0.k5();
         float var12 = 0.0F;
         float var13 = 1.0F;
         if (var11 != null && var11.n5() >= 2) {
            var12 = n5(var11.k5(0));
            var13 = n5(var11.k5(1));
         }

         if (q1.n5(var13 - var12) < 1.0E-4F) {
            var13 = var12 + 1.0F;
         }

         byte var14 = 21;
         float[] var15 = new float[var14];
         com.aspose.slides.internal.o9b.c8[] var16 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var14)
         );

         for (int var17 = 0; var17 < var14; var17++) {
            float var18 = (float)var17 / (var14 - 1);
            float var19 = var12 + var18 * (var13 - var12);
            var15[var17] = var18;
            float[] var20 = var10.n5(new float[]{var19});
            l6.n5(var20, var2).n5(var16[var17]);
         }

         return new com.aspose.slides.internal.g4.t2(var8.u3(), var9.u3(), var16, var15);
      } else {
         return null;
      }
   }

   public static n3 n5(t2 var0, m1 var1, String var2) {
      if (var0 == null) {
         return null;
      }

      com.aspose.slides.internal.v2.n5 var3 = var0.l6();
      if (var3 != null && var3.n5() >= 6) {
         float var4 = n5(var3.k5(0));
         float var5 = n5(var3.k5(1));
         float var6 = n5(var3.k5(2));
         float var7 = n5(var3.k5(3));
         float var8 = n5(var3.k5(4));
         float var9 = n5(var3.k5(5));
         w1 var10 = new w1(var4, var5);
         w1 var11 = new w1(var7, var8);
         com.aspose.slides.internal.t8.u3.n5(var1, var10.u3()).n5(var10);
         com.aspose.slides.internal.t8.u3.n5(var1, var11.u3()).n5(var11);
         float var12 = q1.n5(com.aspose.slides.internal.t8.u3.n5(var1));
         float var13 = q1.n5(com.aspose.slides.internal.t8.u3.l6(var1));
         float var14 = (var12 + var13) / 2.0F;
         var6 *= var14;
         var9 *= var14;
         com.aspose.slides.internal.j0.l6 var15 = var0.a6();
         if (var15 == null) {
            return null;
         }

         com.aspose.slides.internal.v2.n5 var16 = var0.k5();
         float var17 = 0.0F;
         float var18 = 1.0F;
         if (var16 != null && var16.n5() >= 2) {
            var17 = n5(var16.k5(0));
            var18 = n5(var16.k5(1));
         }

         if (q1.n5(var18 - var17) < 1.0E-4F) {
            var18 = var17 + 1.0F;
         }

         byte var19 = 21;
         float[] var20 = new float[var19];
         com.aspose.slides.internal.o9b.c8[] var21 = (com.aspose.slides.internal.o9b.c8[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.c8.class), var19)
         );

         for (int var22 = 0; var22 < var19; var22++) {
            float var23 = (float)var22 / (var19 - 1);
            float var24 = var17 + var23 * (var18 - var17);
            var20[var22] = var23;
            float[] var25 = var15.n5(new float[]{var24});
            l6.n5(var25, var2).n5(var21[var22]);
         }

         return new n3(var10.u3(), var6, var11.u3(), var9, var21, var20);
      } else {
         return null;
      }
   }

   public static String n5(h0 var0) {
      if (var0 != null && var0.u3() != null) {
         com.aspose.slides.internal.v2.s7 var1 = var0.u3().u9(com.aspose.slides.internal.v2.c8.f5);
         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v2.c8.class)) {
            return ((com.aspose.slides.internal.v2.c8)var1).n5();
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v2.n5.class)) {
            com.aspose.slides.internal.v2.n5 var2 = (com.aspose.slides.internal.v2.n5)var1;
            if (var2.n5() > 0) {
               com.aspose.slides.internal.v2.s7 var3 = var2.k5(0);
               if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.v2.c8.class)) {
                  return ((com.aspose.slides.internal.v2.c8)var3).n5();
               }
            }
         }

         return "DeviceRGB";
      } else {
         return "DeviceRGB";
      }
   }

   private static float n5(com.aspose.slides.internal.v2.s7 var0) {
      if (var0 == null) {
         return 0.0F;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v2.t2.class) ? ((com.aspose.slides.internal.v2.t2)var0).u3() : 0.0F;
      }
   }
}
