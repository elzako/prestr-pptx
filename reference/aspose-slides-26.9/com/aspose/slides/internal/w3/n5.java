package com.aspose.slides.internal.w3;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class n5 {
   public static void n5(Object var0, String var1) {
      if (j8.l6(null, var0)) {
         throw new ArgumentNullException(var1);
      }
   }

   public static void n5(String var0, String var1) {
      if (d1.n5(var0)) {
         throw new ArgumentException(var1);
      }
   }
}
