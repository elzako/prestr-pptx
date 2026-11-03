package com.aspose.slides.internal.y4u;

public class y8 extends p6 {
   private byte y1;

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8, int var9) {
      for (int var10 = 0; var10 < var5; var10++) {
         int var11 = var2 + this.s7 * var10;
         int var12 = var10 * var8 + var7;
         int var13 = var9;
         int var14 = var11;

         for (int var15 = 0; var15 < var4; var15++) {
            byte var16 = var1[var14++];
            byte var17 = var1[var14++];
            byte var18 = var1[var14++];
            int var19 = 0xFF000000 | (var16 & 255) << 16 | (var17 & 255) << 8 | var18 & 255;
            int var20 = this.j5.n5(var19);
            if (var20 > this.z8) {
               var20 = this.m1;
            }

            byte var21 = (byte)(var20 << var13);
            this.y1 = (byte)(this.y1 & 0xFF | var21 & 0xFF);
            var13 -= this.u9;
            if (var13 < 0 || var15 + 1 == var4) {
               var13 = this.w1;
               var6[var12++] = this.y1;
               this.y1 = 0;
            }
         }
      }
   }
}
