package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class x4r {
   static void n5(com.aspose.slides.internal.z0k.t4 var0, String var1, com.aspose.slides.internal.z0k.t4 var2, w1c var3) {
      com.aspose.slides.internal.y9w.h0 var4 = new com.aspose.slides.internal.y9w.h0();
      h6m var5 = new h6m(var1, 128);

      try {
         var4.n5("EncryptionInfo", var5.l6());
         var4.n5("EncryptedPackage", var5.n5(var0));
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      if (var3 != null) {
         var4.n5("\u0005SummaryInformation", new com.aspose.slides.internal.z0k.e2(var3.y2().n5()));
         var4.n5("\u0005DocumentSummaryInformation", new com.aspose.slides.internal.z0k.e2(var3.c4().n5()));
      }

      com.aspose.slides.internal.y9w.a6 var6 = new com.aspose.slides.internal.y9w.a6(var4);
      var6.n5(var2);
   }

   static com.aspose.slides.internal.z0k.e2 n5(com.aspose.slides.internal.z0k.t4 var0, String var1) {
      com.aspose.slides.internal.z0k.e2 var3;
      com.aspose.slides.internal.z0k.e2 var4;
      try {
         com.aspose.slides.internal.y9w.a6 var2 = new com.aspose.slides.internal.y9w.a6(var0);
         if (!var2.n5().containsKey("EncryptedPackage") || !var2.n5().containsKey("EncryptionInfo")) {
            throw new PptxUnsupportedFormatException("Unknown file format.");
         }

         var3 = var2.n5().l6("EncryptionInfo");
         var4 = var2.n5().l6("EncryptedPackage");
      } catch (InvalidOperationException var6) {
         throw new OOXMLCorruptFileException("This file is not correctly encrypted or malformed");
      }

      return n5(var4, var3, var1);
   }

   static boolean l6(com.aspose.slides.internal.z0k.t4 var0, String var1) {
      if (var0 == null) {
         throw new ArgumentNullException("packageStream");
      }

      com.aspose.slides.internal.z0k.e2 var3;
      try {
         com.aspose.slides.internal.y9w.a6 var2 = new com.aspose.slides.internal.y9w.a6(var0);
         if (!var2.n5().containsKey("EncryptedPackage") || !var2.n5().containsKey("EncryptionInfo")) {
            throw new PptxUnsupportedFormatException("An unknown file format is encountered.");
         }

         var3 = var2.n5().l6("EncryptionInfo");
      } catch (InvalidOperationException var12) {
         throw new OOXMLCorruptFileException("This file is not correctly encrypted or malformed.");
      }

      byte[] var13 = new byte[(int)var3.getLength()];
      var3.read(var13, 0, var13.length);
      if ((var13[0] & 255) == 4 && (var13[2] & 255) == 4) {
         String var14 = null;
         String[] var5 = new String[]{var14};
         com.aspose.slides.ms.System.Xml.l0 var6 = n5(var13, var5);
         var14 = var5[0];
         if ("SHA512".equals(var14)) {
            c3g var16 = new c3g(var14, var6, com.aspose.slides.internal.l7h.j5.z1().u3(var1));
            return var16.n5();
         } else {
            q7j var7 = new q7j(var6, com.aspose.slides.internal.l7h.j5.z1().u3(var1));
            return var7.n5();
         }
      } else {
         h6m var4 = new h6m(var13, var1);

         try {
            return var4.n5();
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      }
   }

   private static com.aspose.slides.internal.z0k.e2 n5(com.aspose.slides.internal.z0k.e2 var0, com.aspose.slides.internal.z0k.e2 var1, String var2) {
      byte[] var3 = new byte[(int)var1.getLength()];
      var1.read(var3, 0, var3.length);
      if ((var3[0] & 255) == 4 && (var3[2] & 255) == 4) {
         String var11 = null;
         String[] var5 = new String[]{var11};
         com.aspose.slides.ms.System.Xml.l0 var6 = n5(var3, var5);
         var11 = var5[0];
         if ("SHA512".equals(var11)) {
            c3g var13 = new c3g(var11, var6, com.aspose.slides.internal.l7h.j5.z1().u3(var2));
            if (var13.n5()) {
               return var13.n5(var0);
            } else {
               throw new InvalidPasswordException("Invalid password.");
            }
         } else {
            q7j var7 = new q7j(var6, com.aspose.slides.internal.l7h.j5.z1().u3(var2));
            if (var7.n5()) {
               return var7.n5(var0);
            } else {
               throw new InvalidPasswordException("Invalid password.");
            }
         }
      } else {
         if (com.aspose.slides.ms.System.d1.n5(var2)) {
            var2 = "VelvetSweatshop";
         }

         h6m var4 = new h6m(var3, var2);

         try {
            if (var4.n5()) {
               return var4.n5(var0);
            } else {
               throw new InvalidPasswordException("Invalid password.");
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      }
   }

   private static com.aspose.slides.ms.System.Xml.l0 n5(byte[] var0, String[] var1) {
      var1[0] = null;
      XmlDocument var2 = new XmlDocument();
      var2.setXmlResolver(null);
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var0);

      try {
         var3.setPosition(8L);
         var2.load(var3);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      String var4 = "hashAlgorithm";
      com.aspose.slides.ms.System.Xml.m8 var5 = var2.getDocumentElement().get_Item("keyEncryptors");
      if (var5 != null) {
         com.aspose.slides.ms.System.Xml.m8 var6 = var5.get_Item("keyEncryptor");
         if (var6 != null) {
            com.aspose.slides.ms.System.Xml.m8 var7 = var6.get_Item("p:encryptedKey");
            var1[0] = var7.getAttributes().n5(var4).getValue();
         }
      }

      if (var1[0] == null) {
         com.aspose.slides.ms.System.Xml.m8 var10 = var2.getDocumentElement().get_Item("keyData");
         if (var10 != null) {
            var1[0] = var10.getAttributes().n5(var4).getValue();
         }
      }

      return var2.getDocumentElement();
   }
}
