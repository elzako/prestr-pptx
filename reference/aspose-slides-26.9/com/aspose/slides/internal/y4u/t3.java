package com.aspose.slides.internal.y4u;

public class t3 extends u8 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = 0;

      for (int var10 = 0; var10 < var1.length; var10 += 3) {
         short var11 = (short)(var1[var10] & 0xFF);
         short var12 = (short)(var1[var10 + 1] & 0xFF);
         short var13 = (short)(var1[var10 + 2] & 0xFF);
         float var14 = (float)(var11 + 1.402 * (var13 - 128));
         float var15 = (float)(var11 - 0.34414 * (var12 - 128) - 0.71414 * (var13 - 128));
         float var16 = (float)(var11 + 1.772 * (var12 - 128));
         float var17 = 1.0F - var14 / 255.0F;
         float var18 = 1.0F - var15 / 255.0F;
         float var19 = 1.0F - var16 / 255.0F;
         float var20 = com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.l6(1.0F, var17), var18), var19);
         if (com.aspose.slides.ms.System.q1.n5(var20 - 1.0F) < 0.001) {
            var19 = 0.0F;
            var18 = 0.0F;
            var17 = 0.0F;
         } else {
            var17 = (var17 - var20) / (1.0F - var20);
            var18 = (var18 - var20) / (1.0F - var20);
            var19 = (var19 - var20) / (1.0F - var20);
         }

         var6[var9++] = com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.ms.System.q1.n5(0.0F, com.aspose.slides.ms.System.q1.l6(255.0F, 255.0F * (1.0F - var17) * (1.0F - var20)))), 13
         );
         var6[var9++] = com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.ms.System.q1.n5(0.0F, com.aspose.slides.ms.System.q1.l6(255.0F, 255.0F * (1.0F - var18) * (1.0F - var20)))), 13
         );
         var6[var9++] = com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.ms.System.q1.n5(0.0F, com.aspose.slides.ms.System.q1.l6(255.0F, 255.0F * (1.0F - var19) * (1.0F - var20)))), 13
         );
         var6[var9++] = com.aspose.slides.internal.v6g.k5.n5(
            (Object)(com.aspose.slides.ms.System.q1.n5(0.0F, com.aspose.slides.ms.System.q1.l6(255.0F, 255.0F * (1.0F - var20)))), 13
         );
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.o9b.y2 var1, byte[][] var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10) {
      int var11 = 0;
      int var12 = var10 - var1.t2();
      int var13 = var3 + var1.u3();
      int var14 = this.z8.n5();
      byte[] var15 = this.z8.l6();
      byte[] var16 = var2[0];
      byte[] var17 = var2[1];
      byte[] var18 = var2[2];

      for (int var19 = 0; var19 < var1.l6(); var19++) {
         for (int var20 = var1.u3(); var20 < var1.u9(); var20++) {
            byte var21 = var16[var13];
            byte var22 = var17[var13];
            byte var23 = var18[var13];
            int var24 = (var21 & 255) + var14;
            byte var25 = var15[var24 + c4[var23 & 0xFF]];
            byte var26 = var15[var24 + (w1[var22 & 0xFF] + r4[var23 & 0xFF] >> 16)];
            byte var27 = var15[var24 + j5[var22 & 0xFF]];
            float var28 = 1.0F - (var25 & 0xFF) / 255.0F;
            float var29 = 1.0F - (var26 & 0xFF) / 255.0F;
            float var30 = 1.0F - (var27 & 0xFF) / 255.0F;
            float var31 = com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.l6(1.0F, var28), var29), var30);
            if (com.aspose.slides.ms.System.q1.n5(var31 - 1.0F) < 0.001) {
               var30 = 0.0F;
               var29 = 0.0F;
               var28 = 0.0F;
            } else {
               var28 = (var28 - var31) / (1.0F - var31);
               var29 = (var29 - var31) / (1.0F - var31);
               var30 = (var30 - var31) / (1.0F - var31);
            }

            var7[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.n5(0.0F, com.aspose.slides.ms.System.q1.l6(255.0F, 255.0F * (1.0F - var28) * (1.0F - var31)))), 13
            );
            var7[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.n5(0.0F, com.aspose.slides.ms.System.q1.l6(255.0F, 255.0F * (1.0F - var29) * (1.0F - var31)))), 13
            );
            var7[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.n5(0.0F, com.aspose.slides.ms.System.q1.l6(255.0F, 255.0F * (1.0F - var30) * (1.0F - var31)))), 13
            );
            var7[var11++] = com.aspose.slides.internal.v6g.k5.n5(
               (Object)(com.aspose.slides.ms.System.q1.n5(0.0F, com.aspose.slides.ms.System.q1.l6(255.0F, 255.0F * (1.0F - var31)))), 13
            );
            var13++;
         }

         var13 += var12;
      }
   }
}
