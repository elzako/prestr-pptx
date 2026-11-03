package com.aspose.slides.internal.d4;

import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;

public class l6 {
   public static void n5(t4 var0, t4 var1, int var2) {
      com.aspose.slides.internal.f8y.n5.n5(var0 != null);
      com.aspose.slides.internal.f8y.n5.n5(var0.canRead());
      com.aspose.slides.internal.f8y.n5.n5(var1 != null);
      com.aspose.slides.internal.f8y.n5.n5(var1.canWrite());
      var0.seek(0L, 0);
      byte[] var3 = new byte[var2];

      int var4;
      while ((var4 = var0.read(var3, 0, var3.length)) > 0) {
         var1.write(var3, 0, var4);
      }
   }

   public static byte[] n5(t4 var0) {
      com.aspose.slides.internal.f8y.n5.n5(var0 != null);
      com.aspose.slides.internal.f8y.n5.n5(var0.canRead());
      e2 var1 = new e2();

      try {
         n5(var0, var1, 16384);
         return var1.toArray();
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }
}
