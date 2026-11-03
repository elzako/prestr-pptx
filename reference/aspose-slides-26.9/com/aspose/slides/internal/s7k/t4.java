package com.aspose.slides.internal.s7k;

import com.aspose.slides.ms.System.q1;

class t4 {
   private static float[] n5 = new float[]{0.9642F, 1.0F, 0.8249F};

   public static void n5(float[] var0, d5 var1, d5 var2) {
      int var3 = var2.l6();
      int var4 = var1 != null ? var1.k5() : 1061109567;
      boolean var5 = var2.u9();
      boolean var6 = var1 != null ? var1.u9() : false;
      boolean var7 = true;
      switch (var3) {
         case 1281450528:
            switch (var4) {
               case 1281450528:
                  if (var6 && !var5) {
                     a6(var0, var7);
                  } else if (!var6 && var5) {
                     u9(var0, var7);
                     return;
                  }

                  return;
               case 1482250784:
                  if (var5) {
                     u3(var0, var7);
                  } else {
                     l6(var0, var7);
                  }

                  return;
               default:
                  if (var5) {
                     u9(var0, var7);
                  }

                  return;
            }
         case 1482250784:
            if (var4 == 1281450528) {
               if (var6) {
                  k5(var0, var7);
               } else {
                  n5(var0, var7);
               }
            }
      }
   }

   public static void n5(float[] var0, d5 var1) {
      if (var1.k5() == 1281450528 && var1.u9()) {
         a6(var0, true);
      }
   }

   public static void n5(float[] var0, boolean var1) {
      l6(var0);
      a6(var0);
      k5(var0);
      if (var1) {
         d2.n5(var0);
      }
   }

   public static void l6(float[] var0, boolean var1) {
      if (var1) {
         d2.n5(var0);
      }

      u3(var0);
      u9(var0);
      n5(var0);
      if (var1) {
         d2.n5(var0);
      }
   }

   public static void k5(float[] var0, boolean var1) {
      a6(var0, var1);
      n5(var0, var1);
   }

   public static void u3(float[] var0, boolean var1) {
      l6(var0, var1);
      u9(var0, var1);
   }

   public static void a6(float[] var0, boolean var1) {
      var0[0] = var0[0] * 65535.0F / 65280.0F;
      var0[1] = var0[1] * 65535.0F / 65280.0F;
      var0[2] = var0[2] * 65535.0F / 65280.0F;
      if (var1) {
         d2.n5(var0);
      }
   }

   public static void u9(float[] var0, boolean var1) {
      var0[0] = var0[0] * 65280.0F / 65535.0F;
      var0[1] = var0[1] * 65280.0F / 65535.0F;
      var0[2] = var0[2] * 65280.0F / 65535.0F;
   }

   public static void n5(float[] var0) {
      var0[0] /= 100.0F;
      var0[1] = (var0[1] + 128.0F) / 255.0F;
      var0[2] = (var0[2] + 128.0F) / 255.0F;
   }

   public static void l6(float[] var0) {
      var0[0] *= 100.0F;
      var0[1] = var0[1] * 255.0F - 128.0F;
      var0[2] = var0[2] * 255.0F - 128.0F;
   }

   public static float n5(float var0) {
      return var0 * 32768.0F / 65535.0F;
   }

   public static float l6(float var0) {
      return var0 * 65535.0F / 32768.0F;
   }

   public static void k5(float[] var0) {
      for (int var1 = 0; var1 < 3; var1++) {
         var0[var1] = n5(var0[var1]);
      }
   }

   public static void u3(float[] var0) {
      for (int var1 = 0; var1 < 3; var1++) {
         var0[var1] = l6(var0[var1]);
      }
   }

   public static void a6(float[] var0) {
      float var1 = (var0[0] + 16.0F) / 116.0F;
      var0[0] = u3(var0[1] / 500.0F + var1) * n5[0];
      var0[1] = u3(var1) * n5[1];
      var0[2] = u3(var1 - var0[2] / 200.0F) * n5[2];
   }

   public static void u9(float[] var0) {
      float var1 = k5(var0[0] / n5[0]);
      float var2 = k5(var0[1] / n5[1]);
      float var3 = k5(var0[2] / n5[2]);
      var0[0] = 116.0F * var2 - 16.0F;
      var0[1] = 500.0F * (var1 - var2);
      var0[2] = 200.0F * (var2 - var3);
   }

   private static float k5(float var0) {
      return var0 > 0.008856 ? (float)q1.a6(var0, 0.3333333333333333) : (float)(7.787037037037037 * var0 + 0.13793103448275862);
   }

   private static float u3(float var0) {
      if (var0 > 0.20689303448275861) {
         return var0 * var0 * var0;
      } else {
         return var0 > 0.13793103448275862 ? (float)((var0 - 0.13793103448275862) / 7.787037037037037) : 0.0F;
      }
   }
}
