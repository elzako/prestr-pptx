package com.aspose.slides.internal.d3v;

public class l6$e2 extends l6$q0 {
   public l6$e2(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4, 48);
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
}
