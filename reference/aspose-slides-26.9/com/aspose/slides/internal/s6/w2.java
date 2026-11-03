package com.aspose.slides.internal.s6;

import com.aspose.slides.ms.System.q1;

public class w2 {
   public static float n5(float var0, float... var1) {
      float var2 = var0;

      for (float var6 : var1) {
         var2 = q1.n5(var2, var6);
      }

      return var2;
   }

   public static float n5(float var0) {
      return (float)((Math.PI / 180.0) * var0);
   }

   public static double n5(double var0) {
      return (Math.PI / 180.0) * var0;
   }

   public static v8 n5(g7 var0, int var1, int var2) {
      return new v8(
         com.aspose.slides.internal.v6g.k5.u3((1.0F + var0.n5()) * var1 * 0.5F, 13), com.aspose.slides.internal.v6g.k5.u3((1.0F - var0.l6()) * var2 * 0.5F, 13)
      );
   }

   public static v8 n5(v3 var0, int var1, int var2) {
      return new v8(
         com.aspose.slides.internal.v6g.k5.u3((1.0F + var0.n5()) * var1 * 0.5F, 13), com.aspose.slides.internal.v6g.k5.u3((1.0F - var0.l6()) * var2 * 0.5F, 13)
      );
   }

   public static void n5(v8[] var0, v8[] var1) {
      v8 var2 = var0[0].u3();
      var0[0] = var1[0];
      var1[0] = var2;
   }

   public static void n5(o0$k5[] var0, o0$k5[] var1) {
      o0$k5 var2 = var0[0].n5();
      var0[0] = var1[0];
      var1[0] = var2;
   }

   public static void n5(Integer[] var0, Integer[] var1) {
      Integer var2 = ((Integer[])var0.clone())[0];
      var0[0] = var1[0];
      var1[0] = var2;
   }

   public static void n5(Float[] var0, Float[] var1) {
      Float var2 = ((Float[])var0.clone())[0];
      var0[0] = var1[0];
      var1[0] = var2;
   }

   public static void n5(s0[] var0, s0[] var1) {
      s0 var2 = var0[0].a6();
      var0[0] = var1[0];
      var1[0] = var2;
   }

   public static void n5(v3[] var0, v3[] var1) {
      v3 var2 = var0[0].h0();
      var0[0] = var1[0];
      var1[0] = var2;
   }

   public static void n5(g7[] var0, g7[] var1) {
      g7 var2 = var0[0].u9();
      var0[0] = var1[0];
      var1[0] = var2;
   }

   public static void n5(byte[][] var0, byte[][] var1) {
      byte[] var2 = (byte[])var0[0].clone();
      var0[0] = var1[0];
      var1[0] = var2;
   }

   public static float n5(float var0, float var1, float var2) {
      return var0 + var2 * (var1 - var0);
   }

   public static float l6(float var0) {
      return q1.l6(1.0F, q1.n5(0.0F, var0));
   }

   public static v3 n5(v3 var0) {
      return new v3(q1.l6(1.0F, q1.n5(0.0F, var0.n5())), q1.l6(1.0F, q1.n5(0.0F, var0.l6())), q1.l6(1.0F, q1.n5(0.0F, var0.k5())));
   }

   public static void n5(g7 var0, byte[] var1, int var2) {
      var1[var2] = com.aspose.slides.internal.v6g.k5.n5((Object)(l6(var0.n5()) * 255.0F), 13);
      var1[var2 + 1] = com.aspose.slides.internal.v6g.k5.n5((Object)(l6(var0.l6()) * 255.0F), 13);
      var1[var2 + 2] = com.aspose.slides.internal.v6g.k5.n5((Object)(l6(var0.k5()) * 255.0F), 13);
      var1[var2 + 3] = com.aspose.slides.internal.v6g.k5.n5((Object)(l6(var0.u3()) * 255.0F), 13);
   }

   public static boolean n5(s0 var0, s0 var1) {
      return n5(var0, var1, 0.001F);
   }

   public static boolean n5(s0 var0, s0 var1, float var2) {
      return q1.n5(var0.n5() - var1.n5()) < var2 && q1.n5(var0.l6() - var1.l6()) < var2;
   }

   public static boolean n5(s0 var0, s0 var1, s0 var2, s0 var3, s0[] var4) {
      var4[0] = new s0(Float.NaN, Float.NaN);
      s0 var5 = s0.l6(var1, var0).a6();
      s0 var6 = s0.l6(var3, var2).a6();
      float var7 = var5.n5() * var6.l6() - var6.n5() * var5.l6();
      if (var7 == 0.0F) {
         return false;
      } else {
         boolean var8 = var7 > 0.0F;
         s0 var9 = s0.l6(var0, var2).a6();
         float var10 = var5.n5() * var9.l6() - var5.l6() * var9.n5();
         if (var10 < 0.0F == var8) {
            return false;
         } else {
            float var11 = var6.n5() * var9.l6() - var6.l6() * var9.n5();
            if (var11 < 0.0F == var8) {
               return false;
            } else if (var10 > var7 != var8 && var11 > var7 != var8) {
               float var12 = var11 / var7;
               var4[0] = new s0(var0.n5() + var12 * var5.n5(), var0.l6() + var12 * var5.l6());
               return true;
            } else {
               return false;
            }
         }
      }
   }
}
