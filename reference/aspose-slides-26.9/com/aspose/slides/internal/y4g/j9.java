package com.aspose.slides.internal.y4g;

import com.aspose.slides.exceptions.NotSupportedException;

public class j9 {
   static com.aspose.slides.internal.g8v.u9 n5;
   static com.aspose.slides.internal.g8v.u9 l6;

   public static y0 n5(boolean var0, int var1) {
      y0 var2;
      switch (var1) {
         case -1073741824:
         case 192:
            var2 = n5();
            break;
         case 12:
         default:
            throw new NotSupportedException("Unsupported security protocol type");
         case 48:
            var2 = l6();
      }

      com.aspose.slides.Collections.Generic.IGenericEnumerable<String> var3 = null;
      com.aspose.slides.internal.g8v.u9 var4 = null;
      if (var0) {
         if (l6 == null) {
            l6 = com.aspose.slides.internal.g8v.x9.u9();
         }

         var4 = l6;
      } else {
         if (n5 == null) {
            n5 = com.aspose.slides.internal.g8v.x9.a6();
         }

         var4 = n5;
      }

      if (var4 == null) {
         return var2;
      }

      var3 = var4.n5(var1, var2.n5());
      y0 var5 = new y0(var1);
      if (var3 != null) {
         for (String var7 : var3) {
            x9 var8 = var2.n5(var7);
            if (var8 != null) {
               var5.addItem(var8);
            }
         }
      }

      return var5;
   }

   private static y0 n5() {
      y0 var0 = new y0(192);
      var0.n5((short)53, "TLS_RSA_WITH_AES_256_CBC_SHA", 4, 2, 3, false, true, (byte)32, (byte)32, (short)256, (byte)16, (byte)16);
      var0.n5((short)47, "TLS_RSA_WITH_AES_128_CBC_SHA", 4, 2, 3, false, true, (byte)16, (byte)16, (short)128, (byte)16, (byte)16);
      var0.n5((short)10, "TLS_RSA_WITH_3DES_EDE_CBC_SHA", 6, 2, 3, false, true, (byte)24, (byte)24, (short)168, (byte)8, (byte)8);
      var0.n5((short)5, "TLS_RSA_WITH_RC4_128_SHA", 3, 2, 3, false, false, (byte)16, (byte)16, (short)128, (byte)0, (byte)0);
      var0.n5((short)4, "TLS_RSA_WITH_RC4_128_MD5", 3, 0, 3, false, false, (byte)16, (byte)16, (short)128, (byte)0, (byte)0);
      var0.n5((short)9, "TLS_RSA_WITH_DES_CBC_SHA", 0, 2, 3, false, true, (byte)8, (byte)8, (short)56, (byte)8, (byte)8);
      var0.n5((short)3, "TLS_RSA_EXPORT_WITH_RC4_40_MD5", 3, 0, 3, true, false, (byte)5, (byte)16, (short)40, (byte)0, (byte)0);
      var0.n5((short)6, "TLS_RSA_EXPORT_WITH_RC2_CBC_40_MD5", 2, 0, 3, true, true, (byte)5, (byte)16, (short)40, (byte)8, (byte)8);
      var0.n5((short)8, "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", 0, 2, 3, true, true, (byte)5, (byte)8, (short)40, (byte)8, (byte)8);
      var0.n5((short)96, "TLS_RSA_EXPORT_WITH_RC4_56_MD5", 3, 0, 3, true, false, (byte)7, (byte)16, (short)56, (byte)0, (byte)0);
      var0.n5((short)97, "TLS_RSA_EXPORT_WITH_RC2_CBC_56_MD5", 2, 0, 3, true, true, (byte)7, (byte)16, (short)56, (byte)8, (byte)8);
      var0.n5((short)98, "TLS_RSA_EXPORT_WITH_DES_CBC_56_SHA", 0, 2, 3, true, true, (byte)8, (byte)8, (short)64, (byte)8, (byte)8);
      var0.n5((short)100, "TLS_RSA_EXPORT_WITH_RC4_56_SHA", 3, 2, 3, true, false, (byte)7, (byte)16, (short)56, (byte)0, (byte)0);
      return var0;
   }

   private static y0 l6() {
      y0 var0 = new y0(48);
      var0.n5((short)53, "SSL_RSA_WITH_AES_256_CBC_SHA", 4, 2, 3, false, true, (byte)32, (byte)32, (short)256, (byte)16, (byte)16);
      var0.n5((short)47, "SSL_RSA_WITH_AES_128_CBC_SHA", 4, 2, 3, false, true, (byte)16, (byte)16, (short)128, (byte)16, (byte)16);
      var0.n5((short)10, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 6, 2, 3, false, true, (byte)24, (byte)24, (short)168, (byte)8, (byte)8);
      var0.n5((short)5, "SSL_RSA_WITH_RC4_128_SHA", 3, 2, 3, false, false, (byte)16, (byte)16, (short)128, (byte)0, (byte)0);
      var0.n5((short)4, "SSL_RSA_WITH_RC4_128_MD5", 3, 0, 3, false, false, (byte)16, (byte)16, (short)128, (byte)0, (byte)0);
      var0.n5((short)9, "SSL_RSA_WITH_DES_CBC_SHA", 0, 2, 3, false, true, (byte)8, (byte)8, (short)56, (byte)8, (byte)8);
      var0.n5((short)3, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3, 0, 3, true, false, (byte)5, (byte)16, (short)40, (byte)0, (byte)0);
      var0.n5((short)6, "SSL_RSA_EXPORT_WITH_RC2_CBC_40_MD5", 2, 0, 3, true, true, (byte)5, (byte)16, (short)40, (byte)8, (byte)8);
      var0.n5((short)8, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 0, 2, 3, true, true, (byte)5, (byte)8, (short)40, (byte)8, (byte)8);
      var0.n5((short)96, "SSL_RSA_EXPORT_WITH_RC4_56_MD5", 3, 0, 3, true, false, (byte)7, (byte)16, (short)56, (byte)0, (byte)0);
      var0.n5((short)97, "SSL_RSA_EXPORT_WITH_RC2_CBC_56_MD5", 2, 0, 3, true, true, (byte)7, (byte)16, (short)56, (byte)8, (byte)8);
      var0.n5((short)98, "SSL_RSA_EXPORT_WITH_DES_CBC_56_SHA", 0, 2, 3, true, true, (byte)8, (byte)8, (short)64, (byte)8, (byte)8);
      var0.n5((short)100, "SSL_RSA_EXPORT_WITH_RC4_56_SHA", 3, 2, 3, true, false, (byte)7, (byte)16, (short)56, (byte)0, (byte)0);
      return var0;
   }
}
