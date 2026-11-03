package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.m8;

public class o0 extends b3 {
   private r4 n5;

   public final r4 n5() {
      return this.n5;
   }

   @Override
   public m8 l6() {
      if (this.n5 == null) {
         throw new CryptographicException("Malformed element {0}.", "KeyInfoEncryptedKey");
      } else {
         return this.n5.u3();
      }
   }

   @Override
   public m8 n5(XmlDocument var1) {
      if (this.n5 == null) {
         throw new CryptographicException("Malformed element {0}.", "KeyInfoEncryptedKey");
      } else {
         return this.n5.n5(var1);
      }
   }

   @Override
   public void n5(m8 var1) {
      this.n5 = new r4();
      this.n5.n5(var1);
   }
}
