package com.aspose.slides.internal.d9r;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

public class u9 {
   private static c8 n5 = new c8();
   private static k5 l6 = new k5();
   private static u3 k5 = new u3();
   private static h0 u3 = new h0();

   public static a6 n5(int var0) {
      switch (var0) {
         case 0:
            return n5;
         case 1:
            return l6;
         case 2:
            return k5;
         case 3:
            return u3;
         default:
            throw new NotSupportedException(d1.n5(new String[]{"Allocation type ", s3.n5(n5.class, var0), " is not supported."}));
      }
   }
}
