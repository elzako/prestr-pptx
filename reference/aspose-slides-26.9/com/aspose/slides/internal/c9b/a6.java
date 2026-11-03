package com.aspose.slides.internal.c9b;

import com.aspose.slides.internal.o9b.w1;

public class a6 {
   // $VF: synthetic field
   static final boolean n5 = !a6.class.desiredAssertionStatus();

   public static w1 n5(w1 var0, double var1, double var3) {
      if (var1 == 0.0) {
         return new w1((float)(var0.l6() + var3), var0.k5());
      }

      if (var1 == Math.PI) {
         return new w1((float)(var0.l6() - var3), var0.k5());
      }

      if (var1 == Math.PI / 2) {
         return new w1(var0.l6(), (float)(var0.k5() + var3));
      }

      if (var1 == -Math.PI / 2) {
         return new w1(var0.l6(), (float)(var0.k5() - var3));
      }

      float var5 = (float)(var3 * Math.cos(var1));
      float var6 = (float)(var3 * Math.sin(var1));
      return new w1(var0.l6() + var5, var0.k5() + var6);
   }

   public static boolean n5(w1 var0, w1 var1, w1 var2, float var3) {
      double var4 = u3(var0, var1);
      double var6 = u3(var0, var2);
      double var8 = u3(var1, var2);
      if (l6(var0, var1) < var3) {
         return true;
      }

      if (l6(var0, var2) < var3) {
         return true;
      }

      if (l6(var1, var2) < var3) {
         return true;
      }

      float var10 = 1.0E-4F;
      return Math.abs(var4 - var6) < var10 || Math.abs(var4 - var8) < var10 || Math.abs(var6 - var8) < var10;
   }

   public static boolean l6(w1 var0, w1 var1, w1 var2, float var3) {
      double var4 = l6(var0, var1);
      double var6 = l6(var0, var2);
      double var8 = l6(var1, var2);
      return Math.abs(var6 + var8 - var4) < var3;
   }

   public static w1[] n5(w1 var0, w1 var1) {
      if (var0.l6() < var1.l6()) {
         return new w1[]{var0, var1};
      } else if (var0.l6() > var1.l6()) {
         return new w1[]{var1, var0};
      } else {
         return var0.k5() > var1.k5() ? new w1[]{var1, var0} : new w1[]{var0, var1};
      }
   }

   public static double n5(double var0, double var2, double var4, double var6) {
      double var8 = var4 - var0;
      double var10 = var6 - var2;
      return Math.sqrt(var8 * var8 + var10 * var10);
   }

   public static float n5(float var0, float var1, float var2, float var3) {
      float var4 = var2 - var0;
      float var5 = var3 - var1;
      return (float)Math.sqrt(var4 * var4 + var5 * var5);
   }

   public static float l6(w1 var0, w1 var1) {
      return n5(var0.l6(), var0.k5(), var1.l6(), var1.k5());
   }

   public static double k5(w1 var0, w1 var1) {
      float var2 = var0.l6();
      float var3 = var0.k5();
      float var4 = var1.l6();
      float var5 = var1.k5();
      double var6 = var4 - var2;
      double var8 = var5 - var3;
      if (var6 == 0.0 && var8 == 0.0) {
         return 0.0;
      }

      if (var6 == 0.0 && var8 != 0.0) {
         return var3 > var5 ? -Math.PI / 2 : Math.PI / 2;
      }

      if (var6 != 0.0 && var8 == 0.0) {
         return var2 > var4 ? Math.PI : 0.0;
      }

      double var10 = Math.atan(var8 / var6);
      if (var6 < 0.0 && var8 < 0.0) {
         var10 -= Math.PI;
      }

      if (var6 < 0.0 && var8 >= 0.0) {
         var10 += Math.PI;
      }

      return var10;
   }

   private static double u3(w1 var0, w1 var1) {
      w1[] var2 = n5(var0, var1);
      float var3 = var2[0].l6();
      float var4 = var2[0].k5();
      float var5 = var2[1].l6();
      float var6 = var2[1].k5();
      float var7 = var5 - var3;
      float var8 = var6 - var4;
      if (var7 == 0.0 && var8 == 0.0) {
         return 0.0;
      } else if (var7 == 0.0 && var8 != 0.0) {
         return var4 > var6 ? -Math.PI / 2 : Math.PI / 2;
      } else {
         return var7 != 0.0 && var8 == 0.0 ? 0.0 : Math.atan(var8 / var7);
      }
   }

   public static w1 n5(w1 var0, w1 var1, w1 var2, w1 var3) {
      float var4 = var0.l6();
      float var5 = var0.k5();
      float var6 = var1.l6() - var4;
      float var7 = var1.k5() - var5;
      float var8 = var2.l6() - var4;
      float var9 = var2.k5() - var5;
      float var10 = var3.l6();
      float var11 = var3.k5();
      var10 -= var4;
      var11 -= var5;
      float var12 = var10 - var8;
      float var13 = var11 - var9;
      float var14 = var7 / var6;
      float var15 = var13 / var12;
      if (var14 == var15) {
         return null;
      }

      float var16 = var10;
      float var17 = var11;
      if (var12 == 0.0F && var6 != 0.0F) {
         var16 = var10;
         var17 = var14 * var10;
      } else if (var12 == 0.0F && var6 == 0.0F) {
         var16 = var8;
         var17 = var9;
      }

      float var18 = var11 - var15 * var10;
      if (var12 != 0.0F) {
         if (var14 != 0.0F) {
            var17 = var18 / (1.0F - var15 / var14);
            var16 = var17 / var14;
         } else if (var15 != 0.0F) {
            var17 = -1.0F * var18 * var14 / var15 / (1.0F - var14 / var15);
            var16 = (var17 - var18) / var15;
         }
      }

      return new w1(var16 + var4, var17 + var5);
   }
}
