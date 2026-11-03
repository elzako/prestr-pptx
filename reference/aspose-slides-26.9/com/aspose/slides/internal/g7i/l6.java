package com.aspose.slides.internal.g7i;

import com.aspose.slides.ms.System.q1;

public class l6 {
   private static float[] n5 = new float[]{0.9642F, 1.0F, 0.8249F};
   private boolean l6 = false;
   private long k5 = 1061109567L;

   public l6() {
      this.l6 = false;
      this.k5 = 1061109567L;
   }

   public final void n5(long var1, boolean var3) {
      this.l6 = com.aspose.slides.internal.g7i.k5.n5(var1) && var3;
      this.k5 = var1;
   }

   public final void n5(float[] var1, com.aspose.slides.internal.q0y.n5 var2) {
      long var3 = var2.l6();
      boolean var5 = var2.c8();
      boolean var6 = var5 && var3 == 1281450528L;
      boolean var7 = true;
      if (this.l6 && !var6) {
         k5(var1, var7);
         if (var3 == 1482250784L) {
            n5(var1, var7);
         }
      } else if (!this.l6 && var6) {
         if (this.k5 == 1482250784L) {
            l6(var1, var7);
         }

         u3(var1, var7);
      } else if (this.k5 != var3) {
         if (this.k5 == 1482250784L && var3 == 1281450528L) {
            l6(var1, var7);
         } else if (this.k5 == 1281450528L && var3 == 1482250784L) {
            n5(var1, var7);
         }
      }

      this.k5 = var2.k5();
      this.l6 = var5 && this.k5 == 1281450528L;
   }

   public final void n5(float[] var1, long var2) {
      boolean var4 = true;
      if (this.l6) {
         k5(var1, var4);
         if (var2 == 1482250784L) {
            n5(var1, var4);
         }
      } else {
         if (this.k5 == var2) {
            return;
         }

         if (this.k5 == 1482250784L && var2 == 1281450528L) {
            l6(var1, var4);
         } else if (this.k5 == 1281450528L && var2 == 1482250784L) {
            n5(var1, var4);
         }
      }
   }

   public static void n5(float[] var0, boolean var1) {
      l6(var0);
      h0(var0);
      a6(var0);
      if (var1) {
         com.aspose.slides.internal.g7i.k5.n5(var0);
      }
   }

   public static void n5(float[] var0, boolean var1, float[] var2) {
      l6(var0);
      n5(var0, var2);
      a6(var0);
      if (var1) {
         com.aspose.slides.internal.g7i.k5.n5(var0);
      }
   }

   public static void l6(float[] var0, boolean var1) {
      if (var1) {
         com.aspose.slides.internal.g7i.k5.n5(var0);
      }

      u9(var0);
      c8(var0);
      n5(var0);
      if (var1) {
         com.aspose.slides.internal.g7i.k5.n5(var0);
      }
   }

   public static void l6(float[] var0, boolean var1, float[] var2) {
      if (var1) {
         com.aspose.slides.internal.g7i.k5.n5(var0);
      }

      u9(var0);
      l6(var0, var2);
      n5(var0);
      if (var1) {
         com.aspose.slides.internal.g7i.k5.n5(var0);
      }
   }

   public static void k5(float[] var0, boolean var1, float[] var2) {
      k5(var0, var1);
      n5(var0, var1, var2);
   }

   public static void u3(float[] var0, boolean var1, float[] var2) {
      l6(var0, var1, var2);
      u3(var0, var1);
   }

   public static void k5(float[] var0, boolean var1) {
      var0[0] = var0[0] * 65535.0F / 65280.0F;
      var0[1] = var0[1] * 65535.0F / 65280.0F;
      var0[2] = var0[2] * 65535.0F / 65280.0F;
      if (var1) {
         com.aspose.slides.internal.g7i.k5.n5(var0);
      }
   }

   public static void u3(float[] var0, boolean var1) {
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

   public static float[] k5(float[] var0) {
      float[] var1 = new float[3];
      float var2 = (float)q1.z3(var0[1] * var0[1] + var0[2] * var0[2]);
      float var3 = (float)(q1.u3(var0[2], var0[1]) * 180.0 / Math.PI);

      while (var3 < 0.0) {
         var3 += 360.0F;
      }

      var1[0] = var0[0];
      var1[1] = var2;
      var1[2] = var3;
      return var1;
   }

   public static float[] u3(float[] var0) {
      return new float[]{var0[0], (float)(var0[1] * q1.c8(var0[2] * Math.PI / 180.0)), (float)(var0[1] * q1.h0(var0[2] * Math.PI / 180.0))};
   }

   public static float n5(float var0) {
      return var0 * 32768.0F / 65535.0F;
   }

   public static float l6(float var0) {
      return var0 * 65535.0F / 32768.0F;
   }

   public static void a6(float[] var0) {
      for (int var1 = 0; var1 < 3; var1++) {
         var0[var1] = n5(var0[var1]);
      }
   }

   public static void u9(float[] var0) {
      for (int var1 = 0; var1 < 3; var1++) {
         var0[var1] = l6(var0[var1]);
      }
   }

   public static void h0(float[] var0) {
      float var1 = (var0[0] + 16.0F) / 116.0F;
      var0[0] = u3(var0[1] / 500.0F + var1) * n5[0];
      var0[1] = u3(var1) * n5[1];
      var0[2] = u3(var1 - var0[2] / 200.0F) * n5[2];
   }

   public static void c8(float[] var0) {
      float var1 = k5(var0[0] / n5[0]);
      float var2 = k5(var0[1] / n5[1]);
      float var3 = k5(var0[2] / n5[2]);
      var0[0] = 116.0F * var2 - 16.0F;
      var0[1] = 500.0F * (var1 - var2);
      var0[2] = 200.0F * (var2 - var3);
   }

   public static void n5(float[] var0, float[] var1) {
      if (var1 == null) {
         var1 = n5;
      }

      float var2 = (var0[0] + 16.0F) / 116.0F;
      var0[0] = u3(var0[1] / 500.0F + var2) * var1[0];
      var0[1] = u3(var2) * var1[1];
      var0[2] = u3(var2 - var0[2] / 200.0F) * var1[2];
   }

   public static void l6(float[] var0, float[] var1) {
      if (var1 == null) {
         var1 = n5;
      }

      float var2 = k5(var0[0] / var1[0]);
      float var3 = k5(var0[1] / var1[1]);
      float var4 = k5(var0[2] / var1[2]);
      var0[0] = 116.0F * var3 - 16.0F;
      var0[1] = 500.0F * (var2 - var3);
      var0[2] = 200.0F * (var3 - var4);
   }

   private static float k5(float var0) {
      return var0 > 0.008856451679 ? (float)q1.a6(var0, 0.3333333333333333) : (float)(7.787037037037037 * var0 + 0.13793103448275862);
   }

   private static float u3(float var0) {
      return var0 > 0.008856451679 ? var0 * var0 * var0 : (float)((var0 - 0.13793103448275862) * 0.128418459346);
   }
}
