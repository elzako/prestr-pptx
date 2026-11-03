package com.aspose.slides.internal.j2p;

import com.aspose.slides.internal.o8m.q1;

public class z3 {
   private static final char[] n5 = new char[]{',', '`', '[', '*', '&'};
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "http://www.w3.org/TR/2001/REC-xml-c14n-20010315",
      "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments",
      "http://www.w3.org/2001/10/xml-exc-c14n#",
      "http://www.w3.org/2001/10/xml-exc-c14n#WithComments",
      "http://www.w3.org/2000/09/xmldsig#base64",
      "http://www.w3.org/TR/1999/REC-xpath-19991116",
      "http://www.w3.org/TR/1999/REC-xslt-19991116",
      "http://www.w3.org/2000/09/xmldsig#enveloped-signature",
      "http://www.w3.org/2002/07/decrypt#XML",
      "urn:mpeg:mpeg21:2003:01-REL-R-NS:licenseTransform",
      "http://www.w3.org/2000/09/xmldsig# X509Data",
      "http://www.w3.org/2000/09/xmldsig# KeyName",
      "http://www.w3.org/2000/09/xmldsig# KeyValue/DSAKeyValue",
      "http://www.w3.org/2000/09/xmldsig# KeyValue/RSAKeyValue",
      "http://www.w3.org/2000/09/xmldsig# RetrievalMethod",
      "http://www.w3.org/2001/04/xmlenc# EncryptedKey",
      "http://www.w3.org/2000/09/xmldsig#dsa-sha1",
      m3.class.getName(),
      "http://www.w3.org/2000/09/xmldsig#rsa-sha1",
      p3.class.getName(),
      "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256",
      "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384",
      "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512",
      "http://www.w3.org/2000/09/xmldsig#sha1",
      com.aspose.slides.internal.o8m.v4.class.getName(),
      "http://www.w3.org/2001/04/xmldsig-more#hmac-md5",
      "http://www.w3.org/2001/04/xmlenc#tripledes-cbc"
   );

   public static Object n5(String var0) {
      switch (l6.n5(var0)) {
         case 0:
            return new p6();
         case 1:
            return new d1();
         case 2:
            return new h6();
         case 3:
            return new y8();
         case 4:
            return new n1();
         case 5:
            return new c3();
         case 6:
            return new l4();
         case 7:
            return new s4();
         case 8:
            return new j3();
         case 9:
            return new i6();
         case 10:
            return new t1();
         case 11:
            return new z7();
         case 12:
            return new k7();
         case 13:
            return new a3();
         case 14:
            return new u6();
         case 15:
            return new o0();
         case 16:
            return new m3();
         case 17:
            return new m3();
         case 18:
            return new p3();
         case 19:
            return new p3();
         case 20:
            return new x9();
         case 21:
            return new y0();
         case 22:
            return new j9();
         case 23:
            return com.aspose.slides.internal.o8m.s4.a6();
         case 24:
            return com.aspose.slides.internal.o8m.z7.a6();
         case 25:
            return new com.aspose.slides.internal.o8m.y1();
         case 26:
            return q1.k5();
         default:
            return null;
      }
   }

   public static <T> T n5(Class<T> var0, String var1) {
      if (var1 != null && com.aspose.slides.ms.System.d1.n5(var1, n5) < 0) {
         try {
            Object var2 = n5(var1);
            if (var2 == null) {
               var2 = com.aspose.slides.internal.o8m.y4.n5(var1);
            }

            return com.aspose.slides.internal.v6g.k5.n5(var2, var0);
         } catch (RuntimeException var3) {
            return null;
         }
      } else {
         return null;
      }
   }
}
