package com.aspose.slides.internal.s6;

import com.aspose.slides.ms.System.q1;

public class n5 extends s3 {
   private byte[] u3;
   private float a6;

   public n5() {
      this.a6 = w2.l6(1.0F);
   }

   public n5(float var1) {
      this.a6 = w2.l6(var1);
   }

   @Override
   protected void n5(e5 var1) {
      this.u3 = new byte[this.n5.length];
      this.n5(this.n5, 4);
      if (this.a6 > Float.MIN_VALUE) {
         this.n5();
         byte[][] var2 = new byte[][]{this.u3};
         byte[][] var3 = new byte[][]{this.n5};
         w2.n5(var2, var3);
         this.u3 = var2[0];
         this.n5 = var3[0];
      }

      this.l6();
      var1.n5(this.u3);
   }

   public final void n5() {
      float var1 = 0.0F;

      for (int var2 = 0; var2 < this.l6.l6(); var2++) {
         int var3 = var2 * this.k5;

         for (int var4 = 0; var4 < this.l6.n5(); var3 += 4) {
            this.u3[var3 + 0] = this.n5[var3 + 0];
            this.u3[var3 + 1] = this.n5[var3 + 1];
            this.u3[var3 + 2] = this.n5[var3 + 2];
            float[] var5 = new float[]{var1};
            this.u3[var3 + 3] = this.n5(var4, var2, var5) ? com.aspose.slides.internal.v6g.k5.n5((Object)(w2.l6(var5[0]) * 255.0F), 13) : this.n5[var3 + 3];
            var1 = var5[0];
            var4++;
         }
      }
   }

   public final void l6() {
      v3 var1 = new v3();

      for (int var2 = 0; var2 < this.l6.l6(); var2++) {
         int var3 = var2 * this.k5;

         for (int var4 = 0; var4 < this.l6.n5(); var3 += 4) {
            v3[] var5 = new v3[]{var1};
            boolean var6 = this.n5(var4, var2, var5);
            var5[0].l6(var1);
            if (var6) {
               this.u3[var3 + 0] = com.aspose.slides.internal.v6g.k5.n5((Object)(w2.l6(var1.n5()) * 255.0F), 13);
               this.u3[var3 + 1] = com.aspose.slides.internal.v6g.k5.n5((Object)(w2.l6(var1.l6()) * 255.0F), 13);
               this.u3[var3 + 2] = com.aspose.slides.internal.v6g.k5.n5((Object)(w2.l6(var1.k5()) * 255.0F), 13);
            }

            this.u3[var3 + 3] = this.n5[var3 + 3];
            var4++;
         }
      }
   }

   public final void n5(byte[] var1, int var2) {
      int var3 = this.l6.n5();
      int var4 = var1.length >> 2;
      byte[] var5 = new byte[var4];
      byte[] var6 = new byte[var4];
      int var7 = var4;

      while (var7-- > 0) {
         byte var8 = var1[(var7 << 2) + 3];
         var6[var7] = var8;
         var5[var7] = var8;
      }

      for (int var14 = 0; var14 < var2; var14++) {
         for (int var15 = 0; var15 < this.l6.l6(); var15++) {
            int var9 = var15 * var3;

            for (int var10 = 0; var10 < this.l6.n5() - 1; var9++) {
               byte var11 = var5[var9];
               byte var12 = var5[var9 + 1];
               int var13 = var9 << 2;
               if ((var11 & 255) == 0 && (var12 & 255) != 0) {
                  var1[var13 + 0] = var1[var13 + 4];
                  var1[var13 + 1] = var1[var13 + 5];
                  var1[var13 + 2] = var1[var13 + 6];
                  var6[var9] = var12;
               } else if ((var12 & 255) == 0 && (var11 & 255) != 0) {
                  var1[var13 + 4] = var1[var13 + 0];
                  var1[var13 + 5] = var1[var13 + 1];
                  var1[var13 + 6] = var1[var13 + 2];
                  var6[var9 + 1] = var11;
               }

               var10++;
            }
         }

         for (int var16 = 0; var16 < this.l6.l6() - 1; var16++) {
            int var17 = var16 * var3;

            for (int var18 = 0; var18 < this.l6.n5(); var17++) {
               byte var19 = var5[var17];
               byte var20 = var5[var17 + var3];
               int var21 = var17 << 2;
               if ((var19 & 255) == 0 && (var20 & 255) != 0) {
                  var1[var21 + 0] = var1[var21 + 0 + this.k5];
                  var1[var21 + 1] = var1[var21 + 1 + this.k5];
                  var1[var21 + 2] = var1[var21 + 2 + this.k5];
                  var6[var17] = var20;
               } else if ((var20 & 255) == 0 && (var19 & 255) != 0) {
                  var1[var21 + 0 + this.k5] = var1[var21 + 0];
                  var1[var21 + 1 + this.k5] = var1[var21 + 1];
                  var1[var21 + 2 + this.k5] = var1[var21 + 2];
                  var6[var17 + var3] = var19;
               }

               var18++;
            }
         }

         com.aspose.slides.ms.System.u3.n5((Object)(var6)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var5)), 0);
      }
   }

   private boolean n5(int var1, int var2, float[] var3) {
      byte var4 = this.l6(var1, var2);
      byte var5 = this.l6(var1 - 1, var2 + 1);
      byte var6 = this.l6(var1 + 1, var2 + 1);
      byte var7 = this.l6(var1 - 1, var2 - 1);
      byte var8 = this.l6(var1 + 1, var2 - 1);
      if (var4 == var5 && var4 == var6 && var4 == var7 && var4 == var8) {
         return false;
      }

      v3 var9 = new v3((var4 & 0xFF) / 255.0F * this.a6);
      v3 var10 = new v3((var5 & 0xFF) / 255.0F * this.a6);
      v3 var11 = new v3((var6 & 0xFF) / 255.0F * this.a6);
      v3 var12 = new v3((var7 & 0xFF) / 255.0F * this.a6);
      v3 var13 = new v3((var8 & 0xFF) / 255.0F * this.a6);
      v3 var14 = new v3(0.299F, 0.587F, 0.114F);
      float var15 = v3.k5(var10.h0(), var14.h0());
      float var16 = v3.k5(var11.h0(), var14.h0());
      float var17 = v3.k5(var12.h0(), var14.h0());
      float var18 = v3.k5(var13.h0(), var14.h0());
      float var19 = v3.k5(var9.h0(), var14.h0());
      float var20 = q1.l6(var19, q1.l6(var15, q1.l6(var16, q1.l6(var17, var18))));
      float var21 = q1.n5(var19, q1.n5(var15, q1.n5(var16, q1.n5(var17, var18))));
      s0 var22 = new s0();
      var22.n5(-(var15 + var16 - (var17 + var18)));
      var22.l6(var15 + var17 - (var16 + var18));
      float var23 = q1.n5((var15 + var16 + var17 + var18) * 0.03125F, 0.0078125F);
      float var24 = 1.0F / (q1.l6(q1.n5(var22.n5()), q1.n5(var22.l6())) + var23);
      s0.u3(new s0(8.0F, 8.0F), s0.a6(new s0(-8.0F, -8.0F), s0.n5(var22, var24).a6()).a6()).n5(var22);
      s0 var25 = new s0(var1, var2);
      float var26 = 0.5F * (this.l6(s0.n5(var25, s0.n5(var22, -0.16666666F)).a6()) + this.l6(s0.n5(var25, s0.n5(var22, 0.16666669F)).a6()));
      float var27 = var26 * 0.5F + 0.25F * (this.l6(s0.n5(var25, s0.n5(var22, -0.5F)).a6()) + this.l6(s0.n5(var25, s0.n5(var22, 0.5F)).a6()));
      float var28 = v3.k5(new v3(var27), var14.h0());
      var3[0] = !(var28 < var20) && !(var28 > var21) ? var27 : var26;
      return true;
   }

   private boolean n5(int var1, int var2, v3[] var3) {
      g7 var4 = this.n5(var1, var2).u9();
      if (var4.u3() < Float.MIN_VALUE) {
         return false;
      }

      v3 var5 = this.n5(var1, var2).a6().h0();
      v3 var6 = this.n5(var1 - 1, var2 + 1).a6().h0();
      v3 var7 = this.n5(var1 + 1, var2 + 1).a6().h0();
      v3 var8 = this.n5(var1 - 1, var2 - 1).a6().h0();
      v3 var9 = this.n5(var1 + 1, var2 - 1).a6().h0();
      v3 var10 = new v3(0.299F, 0.587F, 0.114F);
      float var11 = v3.k5(var6.h0(), var10.h0());
      float var12 = v3.k5(var7.h0(), var10.h0());
      float var13 = v3.k5(var8.h0(), var10.h0());
      float var14 = v3.k5(var9.h0(), var10.h0());
      float var15 = v3.k5(var5.h0(), var10.h0());
      float var16 = q1.l6(var15, q1.l6(var11, q1.l6(var12, q1.l6(var13, var14))));
      float var17 = q1.n5(var15, q1.n5(var11, q1.n5(var12, q1.n5(var13, var14))));
      s0 var18 = new s0();
      var18.n5(-(var11 + var12 - (var13 + var14)));
      var18.l6(var11 + var13 - (var12 + var14));
      float var19 = q1.n5((var11 + var12 + var13 + var14) * 0.03125F, 0.0078125F);
      float var20 = 1.0F / (q1.l6(q1.n5(var18.n5()), q1.n5(var18.l6())) + var19);
      s0.u3(new s0(8.0F, 8.0F), s0.a6(new s0(-8.0F, -8.0F), s0.n5(var18, var20).a6()).a6()).n5(var18);
      s0 var21 = new s0(var1, var2);
      v3 var22 = v3.n5(0.5F, v3.n5(this.n5(s0.n5(var21, s0.n5(var18, -0.16666666F)).a6()).a6(), this.n5(s0.n5(var21, s0.n5(var18, 0.16666669F)).a6()).a6()))
         .h0();
      v3 var23 = v3.n5(
            v3.n5(var22, 0.5F), v3.n5(0.25F, v3.n5(this.n5(s0.n5(var21, s0.n5(var18, -0.5F)).a6()).a6(), this.n5(s0.n5(var21, s0.n5(var18, 0.5F)).a6()).a6()))
         )
         .h0();
      float var24 = v3.k5(var23.h0(), var10.h0());
      (!(var24 < var16) && !(var24 > var17) ? var23 : var22).l6(var3[0]);
      return true;
   }
}
