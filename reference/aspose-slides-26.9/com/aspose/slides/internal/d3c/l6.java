package com.aspose.slides.internal.d3c;

import com.aspose.slides.internal.r1x.h2;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.z0k.t4;

public class l6 extends n5 {
   @Override
   protected byte[] n5(int[] var1) {
      byte[] var2 = new byte[var1.length * this.n5().z3()];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[4 * var3] = (byte)(var1[var3] >> 24 & 0xFF);
         var2[4 * var3 + 1] = (byte)(var1[var3] >> 16 & 0xFF);
         var2[4 * var3 + 2] = (byte)(var1[var3] >> 8 & 0xFF);
         var2[4 * var3 + 3] = (byte)(var1[var3] & 0xFF);
      }

      return var2;
   }

   @Override
   protected boolean n5(t4 var1) {
      return h2.n5(var1);
   }

   @Override
   protected v4 n5() {
      return v4.l6();
   }
}
