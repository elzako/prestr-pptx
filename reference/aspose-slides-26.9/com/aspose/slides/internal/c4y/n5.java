package com.aspose.slides.internal.c4y;

import com.aspose.slides.internal.g7.r5;
import com.aspose.slides.internal.z0k.e2;

public class n5 {
   public static byte[] n5(byte[] var0) {
      r5 var1 = new r5(new e2(var0));
      e2 var2 = new e2();

      try {
         var1.n5(var2);
         return var2.toArray();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }
}
