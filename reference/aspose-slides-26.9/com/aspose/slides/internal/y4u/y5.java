package com.aspose.slides.internal.y4u;

public class y5 extends s7 {
   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      byte var9 = 0;

      for (int var10 = 0; var10 < var1.length; var10 += 3) {
         var6[var9] = var1[var10];
         var6[var9 + 1] = -1;
         var9 += 2;
      }
   }
}
