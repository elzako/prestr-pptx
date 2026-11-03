package com.aspose.slides.internal.y4u;

public class w8 extends u8 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = 0;
      int var10 = this.z8.n5();

      for (int var11 = 0; var11 < var1.length; var11 += 3) {
         byte var12 = var1[var11];
         byte var13 = var1[var11 + 1];
         byte var14 = var1[var11 + 2];
         int var15 = var10 + (var12 & 255);
         byte var16 = this.z8.l6()[var15 + c4[var14 & 0xFF]];
         byte var17 = this.z8.l6()[var15 + (w1[var13 & 0xFF] + r4[var14 & 0xFF] >> 16)];
         byte var18 = this.z8.l6()[var15 + j5[var13 & 0xFF]];
         var6[var9++] = var18;
         var6[var9++] = var17;
         var6[var9++] = var16;
         var6[var9++] = -1;
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

      for (int var19 = 0; var19 < var6; var19++) {
         for (int var20 = var1.u3(); var20 < var1.u9(); var20++) {
            byte var21 = var16[var13];
            byte var22 = var17[var13];
            byte var23 = var18[var13];
            int var24 = var14 + (var21 & 255);
            byte var25 = var15[var24 + c4[var23 & 0xFF]];
            byte var26 = var15[var24 + (w1[var22 & 0xFF] + r4[var23 & 0xFF] >> 16)];
            byte var27 = var15[var24 + j5[var22 & 0xFF]];
            var7[var11++] = var27;
            var7[var11++] = var26;
            var7[var11++] = var25;
            var7[var11++] = -1;
            var13++;
         }

         var13 += var12;
      }
   }
}
