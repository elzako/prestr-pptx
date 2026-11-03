package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.m8;

public final class d2 {
   private String n5;
   private String l6;
   private m8 k5;
   private m8 u3 = null;

   public final m8 n5(XmlDocument var1) {
      return com.aspose.slides.internal.v6g.k5.n5(var1.importNode(this.k5, true), m8.class);
   }

   public final void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if ("EncryptionProperty".equals(var1.getLocalName()) && "http://www.w3.org/2001/04/xmlenc#".equals(var1.getNamespaceURI())) {
         this.u3 = var1;
         this.l6 = i9.k5(var1, "Id", "http://www.w3.org/2001/04/xmlenc#");
         this.n5 = i9.k5(var1, "Target", "http://www.w3.org/2001/04/xmlenc#");
         this.k5 = var1;
      } else {
         throw new CryptographicException("Malformed encryption property element.");
      }
   }
}
