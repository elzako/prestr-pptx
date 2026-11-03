package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;

class n5$z1 extends n5$y4 {
   private final int[][] n5;
   private final boolean l6;
   private final boolean k5;

   public n5$z1(int var1, int var2, int var3, int[][] var4, y2 var5, int var6, boolean var7) {
      super(var1, var2, var3, var5.n3());
      this.n5 = var4;
      this.l6 = var6 == 18761;
      this.k5 = var7;
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[][] var7 = this.n5;
      boolean var8 = this.l6;
      if (this.k5) {
         long[] var9 = com.aspose.slides.internal.v6g.k5.k5(var1, long[].class);

         for (int var10 = 0; var10 < var6; var10++) {
            int var11;
            if (var8) {
               var11 = (var3[var4] & 255 | (var3[var4 + 1] & 255) << 8) & 65535;
            } else {
               var11 = ((var3[var4] & 255) << 8 | var3[var4 + 1] & 255) & 65535;
            }

            int[] var12 = var7[var11 & 65535];
            int var13 = var12[0] >> 24 & 0xFF;
            int var14 = var12[0] >> 16 & 0xFF;
            int var15 = var12[0] >> 8 & 0xFF;
            int var16 = var12[0] & 0xFF;
            long var17 = var13 << 8 | var13;
            long var19 = var14 << 8 | var14;
            long var21 = var15 << 8 | var15;
            long var23 = var16 << 8 | var16;
            var9[var2[0]++] = var17 << 48 | var19 << 32 | var21 << 16 | var23;
            var4 += 2;
         }
      } else {
         int[] var25 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);

         for (int var26 = 0; var26 < var6; var26++) {
            int var27;
            if (var8) {
               var27 = (var3[var4] & 255 | (var3[var4 + 1] & 255) << 8) & 65535;
            } else {
               var27 = ((var3[var4] & 255) << 8 | var3[var4 + 1] & 255) & 65535;
            }

            int[] var28 = var7[var27 & 65535];
            var25[var2[0]++] = var28[0];
            var4 += 2;
         }
      }
   }
}
