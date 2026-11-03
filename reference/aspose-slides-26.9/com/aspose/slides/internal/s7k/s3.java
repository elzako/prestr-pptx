package com.aspose.slides.internal.s7k;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;

class s3 {
   public static d5 n5(int var0, k7 var1) {
      switch (var0) {
         case 0:
            return new p8();
         case 1:
         case 2:
            return new i1(var1);
         case 3:
         case 4:
         case 5:
         default:
            throw new NotSupportedException(d1.n5("Not supported transformation type: {0}", new Object[]{com.aspose.slides.internal.v6g.k5.l6(var0)}));
         case 6:
            return new f2();
      }
   }
}
