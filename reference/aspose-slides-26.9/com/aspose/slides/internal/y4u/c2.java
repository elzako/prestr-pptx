package com.aspose.slides.internal.y4u;

public class c2 extends u8 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = this.z8.n5();
      byte[] var10 = this.z8.l6();

      for (int var11 = 0; var11 < var5; var11++) {
         int var12 = var2 + this.s7 * var11;
         int var13 = var7 + var8 * var11;

         for (int var14 = 0; var14 < var4; var14++) {
            byte var15 = var1[var12++];
            byte var16 = var1[var12++];
            byte var17 = var1[var12++];
            var6[var13++] = var10[var9 + (var15 & 255) + c4[var17 & 0xFF]];
            var6[var13++] = var10[var9 + (var15 & 255) + com.aspose.slides.internal.n5p.h0.l6(w1[var16 & 0xFF] + r4[var17 & 0xFF], 16)];
            var6[var13++] = var10[var9 + (var15 & 255) + j5[var16 & 0xFF]];
            var6[var13++] = -1;
         }
      }
   }
}
