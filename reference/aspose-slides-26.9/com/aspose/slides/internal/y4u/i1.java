package com.aspose.slides.internal.y4u;

public class i1 extends f2 {
   @Override
   protected byte[][] n5(int[] var1) {
      byte[][] var2 = new byte[256][];
      int var3 = this.z8 * this.w1;

      for (int var4 = 0; var4 < 256; var4++) {
         var2[var4] = new byte[var3];
         int var5 = 0;

         for (int var6 = 0; var6 < this.w1; var6++) {
            int var7 = var4 >> 8 - (var6 + 1) * this.y4 & this.r4;
            int var8 = var1[var7];
            byte var9 = (byte)(var8 >> 24);
            byte var10 = (byte)(var8 >> 16 & 0xFF);
            byte var11 = (byte)(var8 >> 8 & 0xFF);
            byte var12 = (byte)(var8 & 0xFF);
            var2[var4][var5++] = var10;
            var2[var4][var5++] = var11;
            var2[var4][var5++] = var12;
            var2[var4][var5++] = var9;
         }
      }

      return var2;
   }
}
