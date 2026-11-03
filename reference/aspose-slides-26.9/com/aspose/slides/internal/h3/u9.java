package com.aspose.slides.internal.h3;

import com.aspose.slides.internal.e1.m1;
import com.aspose.slides.internal.z4.s3;

public abstract class u9 {
   public abstract void n5(s3 var1);

   public static u9 n5(m1 var0) {
      if (var0.u3() == 0) {
         return !var0.l6() ? new u3(var0.k5()) : new k5(var0.k5());
      }

      switch (var0.a6()) {
         case 0:
            return new k5(var0.k5());
         case 1:
            return a6.u3();
         case 2:
            return a6.a6();
         case 3:
            return a6.u9();
         case 4:
         case 6:
            return a6.h0();
         case 5:
            return a6.c8();
         case 7:
            return new n5(var0.u9() + 1);
         default:
            return null;
      }
   }
}
