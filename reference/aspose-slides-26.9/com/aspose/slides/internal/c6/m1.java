package com.aspose.slides.internal.c6;

import com.aspose.slides.IAIWebClient;
import com.aspose.slides.PresentationContentAmountType;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;

class m1 {
   public static t9 n5(int var0, IAIWebClient var1) {
      switch (var0) {
         case 0:
            return new l6(var1);
         case 1:
            return new z1(var1);
         case 2:
            return new s7(var1);
         default:
            throw new ArgumentOutOfRangeException(
               "presentationContentAmount", d1.n5(new String[]{"Not expected: ", com.aspose.slides.ms.System.s3.n5(PresentationContentAmountType.class, var0)})
            );
      }
   }
}
