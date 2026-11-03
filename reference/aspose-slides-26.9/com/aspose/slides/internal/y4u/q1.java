package com.aspose.slides.internal.y4u;

public class q1 extends u8 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = 0;
      int var10 = this.z8.n5();
      byte[] var11 = this.z8.l6();
      int[] var12 = c4;
      int[] var13 = w1;
      int[] var14 = r4;
      int[] var15 = j5;

      for (int var16 = 0; var16 < var1.length; var16 += 3) {
         byte var17 = var1[var16];
         byte var18 = var1[var16 + 1];
         byte var19 = var1[var16 + 2];
         int var20 = var10 + (var17 & 255);
         byte var21 = var11[var20 + var12[var19 & 0xFF]];
         byte var22 = var11[var20 + (var13[var18 & 0xFF] + var14[var19 & 0xFF] >> 16)];
         byte var23 = var11[var20 + var15[var18 & 0xFF]];
         var6[var9++] = var23;
         var6[var9++] = var22;
         var6[var9++] = var21;
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
      int[] var19 = c4;
      int[] var20 = w1;
      int[] var21 = r4;
      int[] var22 = j5;

      for (int var23 = 0; var23 < var6; var23++) {
         for (int var24 = var1.u3(); var24 < var1.u9(); var24++) {
            byte var25 = var16[var13];
            byte var26 = var17[var13];
            byte var27 = var18[var13];
            int var28 = var14 + (var25 & 255);
            byte var29 = var15[var28 + var19[var27 & 0xFF]];
            byte var30 = var15[var28 + (var20[var26 & 0xFF] + var21[var27 & 0xFF] >> 16)];
            byte var31 = var15[var28 + var22[var26 & 0xFF]];
            var7[var11++] = var31;
            var7[var11++] = var30;
            var7[var11++] = var29;
            var13++;
         }

         var13 += var12;
      }
   }
}
