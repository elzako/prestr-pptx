package com.aspose.slides.internal.i2i;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.d1;

public final class n5 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9(
      "1.3.14.3.2.26", "1.2.840.113549.2.2", "1.2.840.113549.2.5", "2.16.840.1.101.3.4.1", "2.16.840.1.101.3.4.2", "2.16.840.1.101.3.4.3"
   );
   private static String l6 = d1.n5("Input data cannot be coded as a valid certificate.", new Object[]{});

   public static l6[] n5(byte[] var0) {
      n5$n5 var1 = new n5$n5(var0);
      if (!var1.k5().equals("1.2.840.113549.1.7.2")) {
         throw new CryptographicException(l6);
      }

      n5$k5 var2 = new n5$k5(var1.l6());
      n5$u3 var3 = var2.l6();
      if (var3.n5() == null) {
         throw new CryptographicException("The original signer is not found.");
      }

      l6[] var4 = new l6[var2.n5().size()];
      var2.n5().n5(var4, 0);
      return var4;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return n5;
   }
}
