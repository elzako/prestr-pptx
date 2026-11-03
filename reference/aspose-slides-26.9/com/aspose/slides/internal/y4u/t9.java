package com.aspose.slides.internal.y4u;

public final class t9 extends s7 {
   private boolean z8;

   @Override
   protected void n5() {
      this.z8 = this.a6 == this.s7;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = (var3 + var4 * this.y4 - 1) / 8;
      int var10 = var3 / 8;
      boolean var11 = this.z8 && var5 > 1 && var10 == 0 && var9 == this.x8;
      if (var11) {
         com.aspose.slides.ms.System.y4.n5(var1, var2, var6, var7, var8 * var5);
      } else {
         int var12 = var9 - var10 + 1;
         int var13 = var2;

         for (int var14 = 0; var14 < var5; var14++) {
            com.aspose.slides.ms.System.y4.n5(var1, var13, var6, var14 * var8 + var7, var12);
            var13 += this.s7;
         }
      }
   }
}
