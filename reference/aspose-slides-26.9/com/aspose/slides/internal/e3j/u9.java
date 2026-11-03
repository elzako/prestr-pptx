package com.aspose.slides.internal.e3j;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import java.awt.geom.Path2D.Double;

public class u9 {
   public static boolean n5(w1 var0) {
      return var0 != null && !Float.isNaN(var0.l6()) && !Float.isInfinite(var0.l6()) && !Float.isNaN(var0.k5()) && !Float.isInfinite(var0.k5());
   }

   public static boolean n5(w1 var0, w1 var1, float var2) {
      return n5(var0.l6(), var0.k5(), var1.l6(), var1.k5(), var2);
   }

   public static boolean n5(float var0, float var1, float var2, float var3, float var4) {
      return n5((double)var0, (double)var1, (double)var2, (double)var3, (double)var4);
   }

   public static boolean n5(double var0, double var2, double var4, double var6, double var8) {
      return Math.abs(var0 - var4) <= var8 && Math.abs(var2 - var6) <= var8;
   }

   public static boolean n5(float var0, float var1, float var2, float var3) {
      return var0 * var3 <= var1 * var2;
   }

   public static float n5(float var0, float var1) {
      return (float)Math.sqrt(var0 * var0 + var1 * var1);
   }

   public static float l6(float var0, float var1, float var2, float var3) {
      return (float)(Math.atan2(var3, var2) - Math.atan2(var1, var0));
   }

   public static double k5(float var0, float var1, float var2, float var3) {
      double var4 = var0 - var2;
      double var6 = var1 - var3;
      return Math.sqrt(var4 * var4 + var6 * var6);
   }

   public static double n5(w1 var0, w1 var1) {
      return k5(var0.l6(), var0.k5(), var1.l6(), var1.k5());
   }

   public static w1 l6(w1 var0, w1 var1) {
      return new w1((var0.l6() + var1.l6()) / 2.0F, (var0.k5() + var1.k5()) / 2.0F);
   }

   public static double n5(w1 var0, w1 var1, w1 var2) {
      double var3 = n5(var0, var1);
      double var5 = n5(var0, var2);
      double var7 = n5(var1, var2);
      double var9 = 0.5 * (var3 + var5 + var7);
      return Math.sqrt(var9 * (var9 - var3) * (var9 - var5) * (var9 - var7));
   }

   public static boolean n5(w1 var0, w1 var1, w1 var2, double var3, double var5) {
      Double var7 = new Double();
      var7.moveTo(var0.l6(), var0.k5());
      var7.lineTo(var1.l6(), var1.k5());
      var7.lineTo(var2.l6(), var2.k5());
      var7.closePath();
      return var7.contains(var3, var5);
   }

   public static boolean n5(double var0, double var2, double var4, double var6, double var8, double var10, double var12, w1 var14, double var15, double var17) {
      double var19 = var15 - var14.l6();
      double var21 = var17 - var14.k5();
      double var23 = var0 * var19 + var2 * var21;
      if (!(var23 < var10) && !(var23 > var12)) {
         double var25 = var4 * var19 + var6 * var21;
         if (!(var25 < var10) && !(var25 > var12)) {
            double var27 = var8 - var23 - var25;
            return !(var27 < var10) && !(var27 > var12);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static y1 l6(w1 var0, w1 var1, w1 var2) {
      float var3 = Math.min(var0.l6(), var1.l6());
      float var4 = Math.max(var0.l6(), var1.l6());
      if (var3 > var2.l6()) {
         var3 = var2.l6();
      } else if (var4 < var2.l6()) {
         var4 = var2.l6();
      }

      float var5 = Math.min(var0.k5(), var1.k5());
      float var6 = Math.max(var0.k5(), var1.k5());
      if (var5 > var2.k5()) {
         var5 = var2.k5();
      } else if (var6 < var2.k5()) {
         var6 = var2.k5();
      }

      return new y1(var3, var5, var4 - var3, var6 - var5);
   }

   public static w1[] n5(float var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      var3 -= var1;
      var5 -= var1;
      var4 -= var2;
      var6 -= var2;
      float var7 = var5 - var3;
      float var8 = var6 - var4;
      float var9 = var7 * var7 + var8 * var8;
      float var10 = var3 * var6 - var5 * var4;
      float var11 = var0 * var0 * var9 - var10 * var10;
      if (var11 < 0.0F) {
         return null;
      }

      float var12 = (float)Math.sqrt(var11);
      float var13 = (var10 * var8 + (var8 < 0.0F ? -1 : 1) * var7 * var12) / var9 + var1;
      float var14 = (var10 * var8 - (var8 < 0.0F ? -1 : 1) * var7 * var12) / var9 + var1;
      float var15 = (-var10 * var7 + Math.abs(var8) * var12) / var9 + var2;
      float var16 = (-var10 * var7 - Math.abs(var8) * var12) / var9 + var2;
      return var11 == 0.0F ? new w1[]{new w1(var13, var15)} : new w1[]{new w1(var13, var15), new w1(var14, var16)};
   }

   public static w1 l6(float var0, float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = 1.0F - var0;
      float var8 = var7 * var7;
      float var9 = var0 * var0;
      w1 var10 = new w1();
      var10.n5(var8 * var1 + 2.0F * var0 * var7 * var3 + var9 * var5);
      var10.l6(var8 * var2 + 2.0F * var0 * var7 * var4 + var9 * var6);
      return var10;
   }

   public static w1 n5(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      float var9 = 1.0F - var0;
      float var10 = var9 * var9 * var9;
      float var11 = var0 * var0 * var0;
      w1 var12 = new w1();
      var12.n5(var10 * var1 + 3.0F * var0 * var9 * var9 * var3 + 3.0F * var0 * var0 * var9 * var5 + var11 * var7);
      var12.l6(var10 * var2 + 3.0F * var0 * var9 * var9 * var4 + 3.0F * var0 * var0 * var9 * var6 + var11 * var8);
      return var12;
   }

   public static double[] n5(double var0, double var2, double var4) {
      double var6 = var2 * var2 - 4.0 * var0 * var4;
      if (var6 < 0.0) {
         return null;
      }

      if (var6 == 0.0) {
         return new double[]{-var2 / (2.0 * var0)};
      }

      double var8 = Math.sqrt(var6);
      double var10 = (-var2 + var8) / (2.0 * var0);
      double var12 = (-var2 - var8) / (2.0 * var0);
      return new double[]{var10, var12};
   }

   public static w1 n5(u3 var0, w1 var1, w1 var2, float var3) {
      if (var3 == 0.0F) {
         return new w1(var1.l6(), var1.k5());
      }

      if (var0.n5()) {
         return var2.k5() > var1.k5() ? new w1(var1.l6(), var1.k5() + var3) : new w1(var1.l6(), var1.k5() - var3);
      }

      double var4 = -var0.n5 / var0.l6;
      double var6 = -var0.k5 / var0.l6;
      double var8 = var4 * var4 + 1.0;
      double var10 = 2.0 * var4 * (var6 - var1.k5()) - 2.0F * var1.l6();
      double var12 = (var6 - var1.k5()) * (var6 - var1.k5()) + var1.l6() * var1.l6() - var3 * var3;
      double var14 = var10 * var10 - 4.0 * var8 * var12;
      double var16 = Math.sqrt(var14);
      double var18 = (-var10 + var16) / (2.0 * var8);
      double var20 = (-var10 - var16) / (2.0 * var8);
      double var22;
      if (var1.l6() < var2.l6()) {
         if (var3 > 0.0F) {
            var22 = var1.l6() < var18 ? var18 : var20;
         } else {
            var22 = var1.l6() < var18 ? var20 : var18;
         }
      } else if (var3 > 0.0F) {
         var22 = var1.l6() > var18 ? var18 : var20;
      } else {
         var22 = var1.l6() > var18 ? var20 : var18;
      }

      double var24 = var4 * var22 + var6;
      return new w1((float)var22, (float)var24);
   }

   public static w1 n5(w1 var0, m1 var1) {
      float[] var2 = new float[2];
      var1.t2().transform(new float[]{var0.l6(), var0.k5()}, 0, var2, 0, 1);
      return new w1(var2[0], var2[1]);
   }
}
