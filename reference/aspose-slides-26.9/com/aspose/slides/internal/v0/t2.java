package com.aspose.slides.internal.v0;

import com.aspose.slides.ms.System.d1;

public class t2 {
   private static u3 n5(char var0, com.aspose.slides.internal.e5.t2 var1, com.aspose.slides.internal.h2.s7 var2, com.aspose.slides.internal.f2.u9 var3) {
      h0 var4 = var1.n_().c_();
      s7[] var5 = var2.n5(var4);

      for (int var6 = 0; var6 < var5.length; var6++) {
         u3 var7 = var4.n5(var5[var6], var2.n5.l6(var3), var2.l6());
         if (var7.n5(var0)) {
            return var7;
         }
      }

      return var4.n5(var5[0], var2.n5.l6(var3), var2.l6());
   }

   public static u3 n5(com.aspose.slides.internal.v4.t2 var0, com.aspose.slides.internal.f2.u9 var1) {
      return n5(var0.o0(), var0, var0.e5(), var1);
   }

   public static u3 n5(char var0, com.aspose.slides.internal.e5.x8 var1, com.aspose.slides.internal.f2.u9 var2) {
      return n5(var0, var1, var1.r4(), var2);
   }

   public static u3 n5(com.aspose.slides.internal.r4.a6 var0, int var1, int var2, com.aspose.slides.internal.e5.x8 var3, com.aspose.slides.internal.f2.u9 var4) {
      h0 var5 = var3.n_().c_();
      com.aspose.slides.internal.h2.s7 var6 = var3.r4();
      s7[] var7 = var6.n5(var5);
      int var8 = var7.length;
      u3[] var9 = new u3[var8];
      int[] var10 = new int[var8];
      boolean var11 = false;

      for (int var12 = 0; var12 < var8; var12++) {
         u3 var13 = var5.n5(var7[var12], var6.n5.l6(var4), var6.l6());
         var9[var12] = var13;

         for (int var14 = var1; var14 < var2; var14++) {
            if (var13.n5(var0.u3(var14))) {
               var10[var12]++;
               var11 = true;
            }
         }

         if (var10[var12] == var2 - var1) {
            return var13;
         }
      }

      if (!var11) {
         String var17;
         switch (var6.n5()) {
            case 164:
               var17 = "italic";
               break;
            case 165:
               var17 = "oblique";
               break;
            case 166:
               var17 = "backslant";
               break;
            default:
               var17 = "normal";
         }

         String var20 = null;

         for (int var15 = var1; var15 < var2; var15++) {
            char var16 = var0.u3(var15);
            if (var16 >= 19968 && var16 <= '龥') {
               var20 = "ms pgothic";
               break;
            }

            if (var16 >= 12353 && var16 <= 13277) {
               var20 = "Gulim";
               break;
            }

            if (var16 >= 1329 && var16 <= 1418 || var16 >= 4304 && var16 <= 4347) {
               var20 = "Sylfaen";
               break;
            }

            if (var16 >= '가' && var16 <= '힣') {
               var20 = "Gulim";
               break;
            }

            if (var16 >= 2305 && var16 <= 2431) {
               var20 = "mangal";
               break;
            }

            if (var16 >= 4608 && var16 <= 5017) {
               var20 = "nyala";
               break;
            }

            if (var16 >= 2433 && var16 <= 2554) {
               var20 = "Vrinda";
               break;
            }

            if (var16 >= 2689 && var16 <= 2801) {
               var20 = "Shruti";
               break;
            }

            if (var16 >= 3202 && var16 <= 3314) {
               var20 = "Tunga";
               break;
            }

            if (var16 >= 2561 && var16 <= 2676) {
               var20 = "Raavi";
               break;
            }

            if (var16 >= 3458 && var16 <= 3572) {
               var20 = "Iskoola Pota";
               break;
            }

            if (var16 >= 2946 && var16 <= 3066) {
               var20 = "Latha";
               break;
            }

            if (var16 >= 3073 && var16 <= 3183) {
               var20 = "Gautami";
               break;
            }

            if (var16 >= 3585 && var16 <= 3663) {
               var20 = "Tahoma";
               break;
            }

            if (var16 >= 1792 && var16 <= 1871) {
               var20 = "Estrangelo Edessa";
               break;
            }

            if (var16 >= 3840 && var16 <= 4037) {
               var20 = "Microsoft Himalaya";
               break;
            }

            if (var16 >= 1920 && var16 <= 1969) {
               var20 = "MV Boli";
               break;
            }

            if (var16 >= 3713 && var16 <= 3805) {
               var20 = "DokChampa";
               break;
            }

            if (var16 >= 2817 && var16 <= 2929) {
               var20 = "Kalinga";
               break;
            }

            if (var16 >= 5121 && var16 <= 5750) {
               var20 = "Euphemia";
               break;
            }

            if (var16 >= 5024 && var16 <= 5108) {
               var20 = "Plantagenet Cherokee";
               break;
            }
         }

         if (!d1.n5(var20)) {
            s7 var23 = var5.n5(var20, var17, var6.k5(), var6.l6(), var6.l6());
            return var5.n5(var23, var6.n5.l6(var4), var6.l6());
         }
      }

      u3 var19 = var9[0];
      int var18 = var10[0];

      for (int var21 = 1; var21 < var8; var21++) {
         int var22 = var10[var21];
         if (var22 > var18) {
            var19 = var9[var21];
            var18 = var22;
         }
      }

      return var19;
   }
}
