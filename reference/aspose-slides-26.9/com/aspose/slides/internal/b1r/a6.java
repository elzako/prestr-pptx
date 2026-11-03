package com.aspose.slides.internal.b1r;

import com.aspose.slides.internal.j3b.c8;

public class a6 extends u3 {
   public a6(c8 var1) {
      super(var1);
   }

   @Override
   protected byte[] n5(int[] var1) {
      byte[] var2 = new byte[var1.length * 4];
      byte var3 = 0;

      for (int var4 = 0; var4 < var1.length; var4++) {
         int var5 = var1[var4];
         var2[var3 + 3] = (byte)(var5 >> 24 & 0xFF);
         var2[var3] = (byte)(var5 >> 16 & 0xFF);
         var2[var3 + 1] = (byte)(var5 >> 8 & 0xFF);
         var2[var3 + 2] = (byte)(var5 & 0xFF);
         var3 += 4;
      }

      return var2;
   }
}
