package com.aspose.slides.internal.j6e;

import com.aspose.slides.internal.d3v.l6$e2;

public class n5$n5 extends l6$e2 {
   public n5$n5(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      byte[] var4 = this.h0;
      int var5 = this.c8;

      for (int var6 = 0; var6 < var3; var6++) {
         int var7 = var1[var2++];
         int var8 = var7 >> 16 & 0xFF;
         int var9 = var7 >> 8 & 0xFF;
         int var10 = var7 & 0xFF;
         var4[var5 + 0] = (byte)var8;
         var4[var5 + 1] = 0;
         var4[var5 + 2] = (byte)var9;
         var4[var5 + 3] = 0;
         var4[var5 + 4] = (byte)var10;
         var4[var5 + 5] = 0;
         var5 += 6;
      }

      this.c8 = var5;
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3) {
      byte[] var4 = this.h0;
      int var5 = this.c8;
      byte var6 = 6;
      System.arraycopy(var1, var2 * 6, var4, var5, var3 * 6);
      this.c8 = var5 + var3 * 6;
   }
}
