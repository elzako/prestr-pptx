package com.aspose.slides.internal.b1r;

import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.ms.System.q1;

public class l6 extends u3 {
   public l6(c8 var1) {
      super(var1);
   }

   @Override
   protected byte[] n5(int[] var1) {
      byte[] var2 = new byte[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         int var4 = var1[var3];
         int var5 = var4 >> 16 & 0xFF;
         int var6 = var4 >> 8 & 0xFF;
         int var7 = var4 & 0xFF;
         var2[var3] = (byte)q1.l6(0.0, q1.k5(255.0, 0.21 * var5 + 0.71 * var6 + 0.07 * var7));
      }

      return var2;
   }
}
