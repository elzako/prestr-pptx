package com.aspose.slides.internal.y4u;

public class d2 extends f2 {
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
            int var9 = var8 >> 16 & 0xFF;
            int var10 = var8 >> 8 & 0xFF;
            int var11 = var8 & 0xFF;
            int var12 = 31 & com.aspose.slides.internal.v6g.k5.u3(var11 / 8.225806451612904 + 0.5, 14)
               | (31 & com.aspose.slides.internal.v6g.k5.u3(var10 / 8.225806451612904 + 0.5, 14)) << 5
               | (31 & com.aspose.slides.internal.v6g.k5.u3(var9 / 8.225806451612904 + 0.5, 14)) << 10;
            var2[var4][var5++] = (byte)(var12 & 0xFF);
            var2[var4][var5++] = (byte)((var12 & 0xFF00) >> 8);
         }
      }

      return var2;
   }
}
