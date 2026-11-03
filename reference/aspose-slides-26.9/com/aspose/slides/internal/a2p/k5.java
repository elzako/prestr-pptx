package com.aspose.slides.internal.a2p;

import com.aspose.slides.internal.b7s.e2;
import com.aspose.slides.internal.b8u.t9;
import com.aspose.slides.internal.r1x.v4;

public class k5 extends e2 {
   public k5(t9 var1) {
      this.n5 = var1;
      this.l6 = v4.t9();
   }

   @Override
   protected byte[] n5(int[] var1) {
      byte[] var2 = new byte[var1.length * 3];
      int var3 = 0;

      for (int var4 = 0; var4 < var1.length; var4++) {
         int var5 = var1[var4];
         var2[var3++] = (byte)(var5 >> 16 & 0xFF);
         var2[var3++] = (byte)(var5 >> 8 & 0xFF);
         var2[var3++] = (byte)(var5 & 0xFF);
      }

      return var2;
   }
}
