package com.aspose.slides.internal.y4u;

public class j4 extends p6 {
   private byte y1;

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8, int var9) {
      for (int var10 = 0; var10 < var5; var10++) {
         int var11 = var2 + this.s7 * var10;
         int var12 = var10 * var8 + var7;
         int var13 = var9;

         for (int var14 = 0; var14 < var4; var14++) {
            int var15 = var14 * this.c4 + var11;
            byte var16 = var1[var15++];
            byte var17 = var1[var15++];
            byte var18 = var1[var15++];
            byte var19 = var1[var15];
            int var20 = (var19 & 255) << 24 | (var18 & 255) << 16 | (var17 & 255) << 8 | var16 & 255;
            int var21 = this.j5.n5(var20);
            if (var21 > this.z8) {
               var21 = this.m1;
            }

            byte var22 = (byte)(var21 << var13);
            this.y1 = (byte)(this.y1 & 0xFF | var22 & 0xFF);
            var13 -= this.u9;
            if (var13 < 0 || var14 + 1 == var4) {
               var13 = this.w1;
               var6[var12++] = this.y1;
               this.y1 = 0;
            }
         }
      }
   }
}
