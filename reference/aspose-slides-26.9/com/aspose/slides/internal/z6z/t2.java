package com.aspose.slides.internal.z6z;

import com.aspose.slides.internal.g7.d3;
import com.aspose.slides.internal.g7.u0a;
import com.aspose.slides.ms.System.o0;

public class t2 {
   public static com.aspose.slides.internal.l2.u9 n5(d3 var0, String var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();

      byte[] var3;
      try {
         if (((u0a)var0).k5() == null) {
            var0.n5(var2);
            var3 = com.aspose.slides.internal.n2d.t4.l6(var2);
         } else {
            var3 = com.aspose.slides.internal.n2d.t4.l6(var0.e2().x8().k5()[0].k5().l6());
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return n5(var3, var1);
   }

   private static com.aspose.slides.internal.l2.u9 n5(byte[] var0, String var1) {
      byte[] var2 = l6(var0, var1);
      com.aspose.slides.internal.l2.u9 var3 = new com.aspose.slides.internal.l2.u9(var1, "application/vnd.ms-package.obfuscated-opentype");
      var3.u3().write(var2, 0, var2.length);
      return var3;
   }

   private static byte[] l6(byte[] var0, String var1) {
      byte[] var2 = n5(var1);

      for (int var3 = 0; var3 < 32; var3++) {
         int var4 = var2.length - var3 % var2.length - 1;
         var0[var3] = (byte)(var0[var3] & 0xFF ^ var2[var4] & 0xFF);
      }

      return var0;
   }

   private static byte[] n5(String var0) {
      String var1 = com.aspose.slides.internal.z0k.z1.l6(var0);
      return com.aspose.slides.internal.n2d.t4.n5(new o0(var1));
   }
}
