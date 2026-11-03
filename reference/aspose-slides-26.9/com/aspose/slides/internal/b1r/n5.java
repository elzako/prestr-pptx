package com.aspose.slides.internal.b1r;

import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.ms.System.q1;

public class n5 extends u3 {
   public n5(c8 var1) {
      super(var1);
   }

   @Override
   protected byte[] n5(int[] var1) {
      byte[] var2 = new byte[var1.length * 2];
      byte var3 = 0;

      for (int var4 = 0; var4 < var1.length; var4++) {
         int var5 = var1[var4];
         int var6 = var5 >> 24 & 0xFF;
         int var7 = var5 >> 16 & 0xFF;
         int var8 = var5 >> 8 & 0xFF;
         int var9 = var5 & 0xFF;
         var2[var3] = (byte)q1.l6(0.0, q1.k5(255.0, 0.21 * var7 + 0.71 * var8 + 0.07 * var9));
         var2[var3 + 1] = (byte)var6;
         var3 += 2;
      }

      return var2;
   }
}
