package com.aspose.slides.internal.y4u;

public class o0 extends b3 {
   private byte j5;

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = var4 * this.y4;
      int var10 = (var3 + var9 - 1) / 8;
      int var11 = var3 / 8;
      int var12 = var10 - var11 + 1;
      int var13 = this.y4 / this.u9;
      int var14 = var13 * 8;
      int var15 = 8 / var13;
      int var16 = var3 % var14 / 8;
      int var17 = (this.n5.u9() * this.y4 - 1) / 8;
      boolean var18 = var10 == var17;

      for (int var19 = 0; var19 < var5; var19++) {
         int var20 = var2 + this.s7 * var19;
         int var21 = var19 * var8 + var7;
         int var22 = var16;

         for (int var23 = 0; var23 < var12; var23++) {
            byte var24 = var1[var20++];
            byte var25 = (byte)((this.z8[var24 & 0xFF] & 255) >> var15 * var22);
            this.j5 = (byte)(this.j5 & 0xFF | var25 & 0xFF);
            if (++var22 == var13) {
               var22 = 0;
               var6[var21++] = this.j5;
               this.j5 = 0;
            }
         }

         if (var18 && var22 > 0) {
            var6[var21] = this.j5;
            this.j5 = 0;
         }
      }
   }
}
