package com.aspose.slides.internal.r1x;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class g7 {
   public static void n5(com.aspose.slides.internal.z0k.t4 var0, v3 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("srcStream");
      }

      if (var1 == null) {
         throw new ArgumentNullException("streamContainer");
      }

      int var2 = 1048576;
      long var3 = var0.getLength();
      byte[] var5 = new byte[1048576];
      long var6 = var3;
      int var8 = 0;
      var0.setPosition(0L);

      while (var6 > 0L) {
         int var9 = (int)q1.k5(var6, 1048576L);
         var0.setPosition(var8);
         int var10 = var0.read(var5, 0, var9);
         if (var10 != var9) {
            throw new com.aspose.slides.internal.z3b.u9(d1.n5("Failed to read {0} bytes from stream. Only {1} were read",new Object[]{ var9, var10}));
         }

         var1.l6(var5, 0, var10);
         var6 -= var10;
         var8 += var10;
      }
   }
}
