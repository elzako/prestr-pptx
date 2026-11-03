package com.aspose.slides.internal.w2v;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.g7i.k5;
import com.aspose.slides.internal.w2i.t2;
import com.aspose.slides.ms.System.q1;

public class l6 implements n5 {
   private final t2 n5;
   private final com.aspose.slides.internal.q0y.n5 l6;

   public l6(t2 var1, com.aspose.slides.internal.q0y.n5 var2) {
      this.n5 = var1;
      this.l6 = var2;
      if (this.n5 == null) {
         throw new ArgumentNullException("profile");
      }

      if (this.l6 == null) {
         throw new ArgumentNullException("form");
      }
   }

   @Override
   public final void n5(float[] var1, float[] var2) {
      float[] var3 = this.n5();
      if (this.l6.a6()) {
         var1[0] = (float)(0.9965268999803811 / (1.0 - var3[1]));
      } else {
         var1[0] = (float)((1.0 - var3[1]) / 0.9965268999803811);
      }

      var1[1] = var1[0];
      var1[2] = var1[0];
      var2[0] = (float)((1.0 - var1[0]) * 0.9642F);
      var2[1] = (float)((1.0 - var1[1]) * 1.0);
      var2[2] = (float)((1.0 - var1[2]) * 0.8249F);
      com.aspose.slides.internal.g7i.l6.a6(var2);
   }

   public final float[] n5() {
      if (this.l6.u9() == 3) {
         throw new NotSupportedException("Black point compensation not supported for absolute colorimetric");
      } else if (this.n5.l6().u3 != 1818848875L && this.n5.l6().u3 != 1633842036L) {
         float[] var1 = new float[3];
         this.a6(var1);
         return var1;
      } else {
         throw new NotSupportedException("The LinkClass and AbstractClass profile classes are not supported");
      }
   }

   private void n5(float[] var1) {
      switch ((int)this.n5.l6().u9) {
         case 1281450528:
            com.aspose.slides.internal.g7i.l6.n5(var1);
            break;
         case 1482250784:
            com.aspose.slides.internal.g7i.l6.n5(var1, this.l6.h0());
            com.aspose.slides.internal.g7i.l6.a6(var1);
      }
   }

   private void l6(float[] var1) {
      switch ((int)this.n5.l6().u9) {
         case 1281450528:
            com.aspose.slides.internal.g7i.l6.l6(var1);
            break;
         case 1482250784:
            com.aspose.slides.internal.g7i.l6.u9(var1);
            com.aspose.slides.internal.g7i.l6.l6(var1, this.l6.h0());
      }
   }

   private float n5(float[] var1, float[] var2, int var3, int var4, int var5) {
      float var6 = 0.0F;
      if (var4 != 0 && var5 != 0) {
         for (int var9 = 0; var9 < var3; var9++) {
            var6 += (float)(q1.a6(var1[var9], var4) * q1.a6(var2[var9], var5));
         }
      } else if (var4 != 0) {
         for (int var7 = 0; var7 < var3; var7++) {
            var6 += (float)q1.a6(var1[var7], var4);
         }
      } else if (var5 != 0) {
         for (int var8 = 0; var8 < var3; var8++) {
            var6 += (float)q1.a6(var2[var8], var5);
         }
      } else {
         var6 = var3;
      }

      return var6;
   }

   private float n5(float[] var1, float[] var2, int var3) {
      float var4 = 0.0F;
      if (var3 > 3) {
         double[][] var5 = new double[4][4];
         var5[1][1] = var3;
         var5[1][2] = this.n5(var1, var2, var3, 1, 0);
         var5[1][3] = this.n5(var1, var2, var3, 2, 0);
         var5[2][1] = this.n5(var1, var2, var3, 1, 0);
         var5[2][2] = this.n5(var1, var2, var3, 2, 0);
         var5[2][3] = this.n5(var1, var2, var3, 3, 0);
         var5[3][1] = this.n5(var1, var2, var3, 2, 0);
         var5[3][2] = this.n5(var1, var2, var3, 3, 0);
         var5[3][3] = this.n5(var1, var2, var3, 4, 0);
         double[][] var6 = k5.n5(var5);
         double[] var7 = new double[]{this.n5(var1, var2, var3, 0, 1), this.n5(var1, var2, var3, 1, 1), this.n5(var1, var2, var3, 2, 1)};
         double var8 = var6[1][1] * var7[0] + var6[1][2] * var7[1] + var6[1][3] * var7[2];
         double var10 = var6[2][1] * var7[0] + var6[2][2] * var7[1] + var6[2][3] * var7[2];
         double var12 = var6[3][1] * var7[0] + var6[3][2] * var7[1] + var6[3][3] * var7[2];
         var4 = (float)((-1.0 * var10 + q1.z3(var10 * var10 - 4.0 * var12 * var8)) / (2.0 * var12));
      }

      return var4;
   }

   private void n5(float[] var1, float[] var2, boolean var3, int var4, long var5) {
      com.aspose.slides.internal.g7i.n5 var7 = new com.aspose.slides.internal.g7i.n5(var3, var5, 1061109567L);
      var7.n5(this.n5, var4, false, false);
      var7.n5(var2, var1);
   }

   private void k5(float[] var1) {
      float[] var2 = new float[16];
      if (this.n5.l6().a6 == 1129142603L && this.n5.l6().u3 == 1886549106L) {
         boolean var3 = !k5.n5(this.n5.l6().u9);
         var2 = new float[4];
         var1[2] = 0.0F;
         var1[1] = 0.0F;
         var1[0] = 0.0F;
         this.n5(var1);
         this.n5(var2, var1, var3, 0, this.n5.l6().u9);
      } else {
         switch ((int)this.n5.l6().a6) {
            case 1129142603:
               var2 = new float[4];
               int var4 = k5.k5(1129142603L) & 255;

               for (int var5 = 0; var5 < var4; var5++) {
                  var2[var5] = 1.0F;
               }
               break;
            case 1196573017:
               var2 = new float[]{0.0F};
               break;
            case 1380401696:
               var2 = new float[]{0.0F, 0.0F, 0.0F};
         }
      }

      boolean var6 = !k5.n5(this.n5.l6().a6);
      this.n5(var1, var2, var6, this.l6.u9(), this.n5.l6().a6);
      this.l6(var1);
      if (this.n5.l6().a6 == 1129142603L) {
         var1[1] = 0.0F;
         var1[2] = 0.0F;
      }

      var1[0] = q1.l6(50.0F, var1[0]);
      com.aspose.slides.internal.g7i.l6.n5(var1, this.l6.h0());
   }

   private void u3(float[] var1) {
      int var2 = this.l6.u9();
      float[] var3 = new float[3];
      float[] var4 = new float[3];
      if (this.n5.n5(1110589744) != null && (this.n5.l6().a6 == 1196573017L || this.n5.l6().a6 == 1380401696L || this.n5.l6().a6 == 1129142603L)) {
         com.aspose.slides.internal.g7i.n5 var5 = this.n5(var2);
         float[] var6 = new float[]{0.0F, 0.0F, 0.0F};
         if (var2 == 1) {
            this.k5(var6);
            com.aspose.slides.internal.g7i.l6.l6(var6, this.l6.h0());
         }

         var4[0] = 0.0F;
         var4[1] = var6[1];
         var4[2] = var6[2];
         this.n5(var4);
         var5.n5(var4, var3);
         this.l6(var3);
         float var7 = var3[0];
         var4[0] = 100.0F;
         var4[1] = var6[1];
         var4[2] = var6[2];
         this.n5(var4);
         var5.n5(var4, var3);
         this.l6(var3);
         float var8 = var3[0];
         boolean var9 = false;
         if (var2 == 1) {
            this.k5(var6);
            com.aspose.slides.internal.g7i.l6.l6(var6, this.l6.h0());
            float var10 = 0.0F;
            var9 = true;

            while (var10 < 100.1) {
               var4[0] = var10;
               var4[1] = var6[1];
               var4[2] = var6[2];
               this.n5(var4);
               var5.n5(var4, var3);
               this.l6(var3);
               float var11 = var3[0];
               if (var11 > var7 + 0.2 * (var8 - var7) && q1.n5(var11 - var10) > 4.0) {
                  var9 = false;
                  break;
               }

               var10++;
            }
         }

         if (var9) {
            var1[0] = var6[0];
            var1[1] = var6[1];
            var1[2] = var6[2];
            com.aspose.slides.internal.g7i.l6.n5(var1, this.l6.h0());
         }

         float[] var16 = new float[101];
         float[] var17 = new float[101];
         float var12 = 0.03F;
         float var13 = 0.25F;
         if (var2 == 1) {
            var12 = 0.1F;
            var13 = 0.5F;
         }

         for (int var14 = 0; var14 < var16.length; var14++) {
            var16[var14] = var14;
            var4[0] = var16[var14];
            var4[1] = var6[1];
            var4[2] = var6[2];
            this.n5(var4);
            var5.n5(var4, var3);
            this.l6(var3);
            var17[var14] = (var3[0] - var7) / (var8 - var7);
         }

         int var18 = 0;

         for (int var15 = 0; var15 < var17.length; var15++) {
            if (var17[var15] >= var12 && var17[var15] < var13) {
               var16[var18] = var16[var15];
               var17[var18] = var17[var15];
               var18++;
            }
         }

         if (var18 == 0) {
            throw new com.aspose.slides.internal.d3l.k5("There should be at least one point in range.");
         }

         var1[0] = this.n5(var16, var17, var18);
         if (var1[0] < 0.0) {
            var1[0] = 0.0F;
         }

         var1[1] = var6[1];
         var1[2] = var6[2];
         com.aspose.slides.internal.g7i.l6.n5(var1, this.l6.h0());
      } else {
         this.k5(var1);
      }
   }

   private void a6(float[] var1) {
      if (this.l6.a6()) {
         this.k5(var1);
      } else {
         this.u3(var1);
      }
   }

   private com.aspose.slides.internal.g7i.n5 n5(int var1) {
      com.aspose.slides.internal.g7i.n5 var2 = new com.aspose.slides.internal.g7i.n5(false, this.n5.l6().u9, 1061109567L);
      var2.n5(this.n5, var1, false, false);
      var2.n5(this.n5, 1, false, false);
      return var2;
   }
}
