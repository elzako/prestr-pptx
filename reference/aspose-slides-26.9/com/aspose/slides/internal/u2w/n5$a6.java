package com.aspose.slides.internal.u2w;

import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.y4;

class n5$a6 extends n5$u3 {
   private byte l6;
   private byte k5;
   private byte u3;

   public n5$a6(int var1, int var2, int var3, y2 var4) {
      super(var1, var2, var3, var4.n3());
   }

   @Override
   protected void n5(Object var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int[] var7 = com.aspose.slides.internal.v6g.k5.k5(var1, int[].class);
      int var8 = this.l6 & 255;
      byte var9 = this.k5;
      byte var10 = this.u3;

      for (int var11 = 0; var11 < var6; var11++) {
         var8 = (byte)((var3[var4] & 255) + var8) & 255;
         byte var12 = com.aspose.slides.internal.v6g.k5.n5((Object)(0.5 + 100.0 * var8 / 255.0), 14);
         var9 = (byte)((var3[var4 + 1] & 255) + (var9 & 255));
         var10 = (byte)((var3[var4 + 2] & 255) + (var10 & 255));
         byte[] var13 = new byte[3];
         com.aspose.slides.ms.System.y4.n5(new byte[]{var12, var9, var10}, 0, var13, 0, 3);
         int var14 = super.n5(var13[0], var13[1], var13[2]);
         var7[var2[0]++] = var14;
         var4 += this.n5;
      }

      this.l6 = (byte)var8;
      this.k5 = var9;
      this.u3 = var10;
   }

   @Override
   protected void n5() {
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4) {
      int var5 = this.l6 & 255;
      int var6 = this.k5 & 255;
      int var7 = this.u3 & 255;

      for (int var8 = 0; var8 < var4; var8++) {
         var5 = (byte)((var1[var2] & 255) + var5) & 255;
         var6 = (byte)((var1[var2 + 1] & 255) + var6) & 255;
         var7 = (byte)((var1[var2 + 2] & 255) + var7) & 255;
         var2 += this.n5;
      }

      this.l6 = (byte)var5;
      this.k5 = (byte)var6;
      this.u3 = (byte)var7;
   }
}
