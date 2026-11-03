package com.aspose.slides.internal.y4u;

public class h0 extends y1 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      double[] var9 = new double[4];
      double[] var10 = new double[3];
      int var11 = this.n3.z3();
      int var12 = this.u3.z3();
      int var13 = var2;
      int var14 = var7;
      boolean var15 = this.u3.t4() == 1;

      for (int var16 = 0; var16 < var5; var16++) {
         int var17 = var13;
         int var18 = var14;

         for (int var19 = 0; var19 < var4; var19++) {
            var9[0] = (255 - (var1[var17] & 255)) / 255.0;
            var9[1] = (255 - (var1[var17 + 1] & 255)) / 255.0;
            var9[2] = (255 - (var1[var17 + 2] & 255)) / 255.0;
            var9[3] = (255 - (var1[var17 + 3] & 255)) / 255.0;
            this.n5(var9, var10);
            if (var15) {
               var6[var18] = com.aspose.slides.internal.v6g.k5.n5((Object)(var10[2] * 255.0), 14);
               var6[var18 + 1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var10[1] * 255.0), 14);
               var6[var18 + 2] = com.aspose.slides.internal.v6g.k5.n5((Object)(var10[0] * 255.0), 14);
            } else {
               var6[var18] = com.aspose.slides.internal.v6g.k5.n5((Object)(var10[0] * 255.0), 14);
               var6[var18 + 1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var10[1] * 255.0), 14);
               var6[var18 + 2] = com.aspose.slides.internal.v6g.k5.n5((Object)(var10[2] * 255.0), 14);
            }

            var17 += var11;
            var18 += var12;
         }

         var13 += this.s7;
         var14 += var8;
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.o9b.y2 var1, byte[][] var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10) {
      byte var11 = 4;
      byte var12 = 3;
      double[] var13 = new double[var11];
      double[] var14 = new double[var12];
      int var15 = var3;
      int var16 = var8;
      boolean var17 = this.u3.t4() == 1;

      for (int var18 = 0; var18 < var6; var18++) {
         int var19 = var16;

         for (int var20 = var1.u3(); var20 < var1.u9(); var20++) {
            int var21 = var15 + var20;
            var13[0] = (255 - (var2[0][var21] & 255)) / 255.0;
            var13[1] = (255 - (var2[1][var21] & 255)) / 255.0;
            var13[2] = (255 - (var2[2][var21] & 255)) / 255.0;
            var13[3] = (255 - (var2[3][var21] & 255)) / 255.0;
            this.n5(var13, var14);
            if (var17) {
               var7[var19++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[2] * 255.0), 14);
               var7[var19++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[1] * 255.0), 14);
               var7[var19++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[0] * 255.0), 14);
            } else {
               var7[var19++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[0] * 255.0), 14);
               var7[var19++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[1] * 255.0), 14);
               var7[var19++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[2] * 255.0), 14);
            }
         }

         var15 += var10;
         var16 += var9;
      }
   }
}
