package com.aspose.slides.internal.q0y;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

class l6 {
   public static n5 n5(int var0, com.aspose.slides.internal.u7q.k5 var1, com.aspose.slides.internal.u7q.k5 var2) {
      switch (var0) {
         case 0:
            return new k5();
         case 1:
         case 2:
            return new a6(var1, var2);
         case 3:
         case 4:
         case 5:
         default:
            throw new NotSupportedException(d1.n5("Not supported transformation type: {0}", new Object[]{s3.n5(h0.class, var0)}));
         case 6:
            return new u3();
      }
   }
}
