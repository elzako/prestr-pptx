package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

class g7 {
   public static KeyValuePair<String, String> n5(com.aspose.slides.internal.z0k.w1 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("reader");
      } else {
         String var1 = com.aspose.slides.ms.System.d1.k5(var0.h0(), '\n', '\r', ' ');
         if (com.aspose.slides.ms.System.d1.n5(var1)) {
            return new KeyValuePair<>(com.aspose.slides.ms.System.d1.n5, com.aspose.slides.ms.System.d1.n5);
         } else {
            String[] var2 = com.aspose.slides.ms.System.d1.u9(var1, '=');
            if (var2.length != 2) {
               throw new InvalidOperationException();
            } else {
               return new KeyValuePair<>(var2[0], var2[1]);
            }
         }
      }
   }
}
