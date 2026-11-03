package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.s2;

public class i6 extends g7 {
   private com.aspose.slides.ms.System.y8[] l6 = new com.aspose.slides.ms.System.y8[]{com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class)};
   private com.aspose.slides.ms.System.y8[] k5 = new com.aspose.slides.ms.System.y8[]{com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class)};
   private s2 u3 = null;
   private XmlDocument a6 = null;
   private i1 u9 = null;

   public i6() {
      this.l6("urn:mpeg:mpeg21:2003:01-REL-R-NS:licenseTransform");
   }

   @Override
   public com.aspose.slides.ms.System.y8[] h0() {
      return this.l6;
   }

   private void n5(i0 var1, i1 var2) {
      m8 var3 = null;
      m8 var4 = null;
      m8 var5 = null;
      a0 var6 = null;
      e5 var7 = null;
      t4 var8 = null;
      int var9 = 0;

      for (int var10 = var1.n5(); var9 < var10; var9++) {
         var3 = com.aspose.slides.internal.v6g.k5.n5(var1.k5(var9).selectSingleNode("//r:encryptedGrant/enc:EncryptionMethod", this.u3), m8.class);
         var4 = com.aspose.slides.internal.v6g.k5.n5(var1.k5(var9).selectSingleNode("//r:encryptedGrant/dsig:KeyInfo", this.u3), m8.class);
         var5 = com.aspose.slides.internal.v6g.k5.n5(var1.k5(var9).selectSingleNode("//r:encryptedGrant/enc:CipherData", this.u3), m8.class);
         if (var3 != null && var4 != null && var5 != null) {
            var6 = new a0();
            var7 = new e5();
            var8 = new t4();
            var6.n5(var3);
            var7.n5(var4);
            var8.n5(var5);
            com.aspose.slides.internal.z0k.e2 var11 = null;
            com.aspose.slides.internal.z0k.t4 var12 = null;
            com.aspose.slides.internal.z0k.m3 var13 = null;

            try {
               var11 = new com.aspose.slides.internal.z0k.e2(var8.l6());
               var12 = this.u9.n5(var6, var7, var11);
               if (var12 == null || var12.getLength() == 0L) {
                  throw new CryptographicException("Unable to decrypt grant content.");
               }

               var13 = new com.aspose.slides.internal.z0k.m3(var12);
               String var14 = var13.c8();
               var1.k5(var9).getParentNode().setInnerXml(var14);
            } finally {
               if (var11 != null) {
                  var11.close();
               }

               if (var12 != null) {
                  var12.close();
               }

               if (var13 != null) {
                  var13.u3();
               }
            }

            var6 = null;
            var7 = null;
            var8 = null;
         }

         var3 = null;
         var4 = null;
         var5 = null;
      }
   }

   @Override
   protected i0 c8() {
      return null;
   }

   @Override
   public Object t2() {
      return this.a6;
   }

   @Override
   public Object l6(com.aspose.slides.ms.System.y8 var1) {
      if (var1 != com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class) && !var1.n5(com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class))) {
         throw new ArgumentException("The input type was invalid for this transform.", "type");
      } else {
         return this.t2();
      }
   }

   @Override
   public void n5(i0 var1) {
      if (var1 != null && var1.n5() > 0) {
         throw new CryptographicException("Unknown transform has been encountered.");
      }
   }

   @Override
   public void n5(Object var1) {
      if (this.s7() == null) {
         throw new CryptographicException("Null Context property encountered.");
      }

      this.a6 = new XmlDocument();
      this.a6.setPreserveWhitespace(true);
      this.u3 = new s2(this.a6.getNameTable());
      this.u3.n5("dsig", "http://www.w3.org/2000/09/xmldsig#");
      this.u3.n5("enc", "http://www.w3.org/2001/04/xmlenc#");
      this.u3.n5("r", "urn:mpeg:mpeg21:2003:01-REL-R-NS");
      m8 var2 = null;
      m8 var3 = null;
      l0 var4 = null;
      var2 = com.aspose.slides.internal.v6g.k5.n5(this.s7().selectSingleNode("ancestor-or-self::r:issuer[1]", this.u3), m8.class);
      if (var2 == null) {
         throw new CryptographicException("Issuer node is required.");
      }

      var4 = com.aspose.slides.internal.v6g.k5.n5(var2.selectSingleNode("descendant-or-self::dsig:Signature[1]", this.u3), m8.class);
      if (var4 != null) {
         var4.getParentNode().removeChild(var4);
      }

      var3 = com.aspose.slides.internal.v6g.k5.n5(var2.selectSingleNode("ancestor-or-self::r:license[1]", this.u3), m8.class);
      if (var3 == null) {
         throw new CryptographicException("License node is required.");
      }

      i0 var5 = var3.selectNodes("descendant-or-self::r:license[1]/r:issuer", this.u3);
      int var6 = 0;

      for (int var7 = var5.n5(); var6 < var7; var6++) {
         if (var5.k5(var6) != var2
            && "issuer".equals(var5.k5(var6).getLocalName())
            && "urn:mpeg:mpeg21:2003:01-REL-R-NS".equals(var5.k5(var6).getNamespaceURI())) {
            var5.k5(var6).getParentNode().removeChild(var5.k5(var6));
         }
      }

      i0 var11 = var3.selectNodes("/r:license/r:grant/r:encryptedGrant", this.u3);
      if (var11.n5() > 0) {
         if (this.u9 == null) {
            throw new CryptographicException("IRelDecryptor is required.");
         }

         this.n5(var11, this.u9);
      }

      this.a6.setInnerXml(var3.getOuterXml());
   }
}
