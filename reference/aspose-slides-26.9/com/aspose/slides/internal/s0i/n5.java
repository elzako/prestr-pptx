package com.aspose.slides.internal.s0i;

import com.aspose.slides.ms.System.u3;

public class n5 {
   private static com.aspose.slides.internal.x2y.n5 n5;

   public static com.aspose.slides.internal.x2y.n5 n5() {
      com.aspose.slides.internal.x2y.n5 var0 = n5;
      if (var0 == null) {
         var0 = n5 = l6();
      }

      return var0;
   }

   private static com.aspose.slides.internal.x2y.n5 l6() {
      com.aspose.slides.internal.x2y.n5 var0 = new com.aspose.slides.internal.x2y.n5();
      byte[] var1 = new byte[1408];
      int var2 = 256;
      var0.n5(var2);

      for (int var3 = 0; var3 <= 255; var3++) {
         var1[var2 + var3] = (byte)var3;
      }

      var2 += 128;

      for (int var5 = 128; var5 < 512; var5++) {
         var1[var2 + var5] = -1;
      }

      u3.n5(var1, var2 + 512, 384);
      var0.n5(var1);
      return var0;
   }
}
