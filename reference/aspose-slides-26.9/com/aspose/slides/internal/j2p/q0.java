package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.s2;

public final class q0 extends c4 {
   private byte[] l6;

   public q0() {
      this.l6("CipherReference");
   }

   public final byte[] n5() {
      return !this.a6() ? null : this.l6;
   }

   public final void n5(byte[] var1) {
      this.l6 = var1;
   }

   public final m8 n5(XmlDocument var1) {
      if (this.u3() == null) {
         throw new CryptographicException("The Reference type must be set in an EncryptedReference object.");
      }

      m8 var2 = var1.createElement(this.u3(), "http://www.w3.org/2001/04/xmlenc#");
      if (!com.aspose.slides.ms.System.d1.n5(this.l6())) {
         var2.k5("URI", this.l6());
      }

      if (this.k5().n5() > 0) {
         var2.appendChild(this.k5().n5(var1, "http://www.w3.org/2001/04/xmlenc#"));
      }

      return var2;
   }

   @Override
   public void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.l6(var1.getLocalName());
      String var2 = i9.k5(var1, "URI", "http://www.w3.org/2001/04/xmlenc#");
      if (var2 != null) {
         this.n5(var2);
         s2 var3 = new s2(var1.getOwnerDocument().getNameTable());
         var3.n5("enc", "http://www.w3.org/2001/04/xmlenc#");
         l0 var4 = var1.selectSingleNode("enc:Transforms", var3);
         if (var4 != null) {
            this.k5().n5(com.aspose.slides.internal.v6g.k5.n5(var4, m8.class));
         }

         this.n5 = var1;
      } else {
         throw new CryptographicException("A Uri attribute is required for a CipherReference element.");
      }
   }
}
