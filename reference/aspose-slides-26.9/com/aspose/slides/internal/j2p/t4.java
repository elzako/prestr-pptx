package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.s2;

public final class t4 {
   private m8 n5 = null;
   private q0 l6 = null;
   private byte[] k5 = null;

   public final q0 n5() {
      return this.l6;
   }

   public final byte[] l6() {
      return this.k5;
   }

   public final m8 n5(XmlDocument var1) {
      m8 var2 = var1.createElement("CipherData", "http://www.w3.org/2001/04/xmlenc#");
      if (this.l6() != null) {
         m8 var3 = var1.createElement("CipherValue", "http://www.w3.org/2001/04/xmlenc#");
         var3.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(this.l6())));
         var2.appendChild(var3);
      } else {
         if (this.n5() == null) {
            throw new CryptographicException("A Cipher Data element should have either a CipherValue or a CipherReference element.");
         }

         var2.appendChild(this.n5().n5(var1));
      }

      return var2;
   }

   public final void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      s2 var2 = new s2(var1.getOwnerDocument().getNameTable());
      var2.n5("enc", "http://www.w3.org/2001/04/xmlenc#");
      l0 var3 = var1.selectSingleNode("enc:CipherValue", var2);
      l0 var4 = var1.selectSingleNode("enc:CipherReference", var2);
      if (var3 != null) {
         if (var4 != null) {
            throw new CryptographicException("A Cipher Data element should have either a CipherValue or a CipherReference element.");
         }

         this.k5 = com.aspose.slides.ms.System.z3.s7(i9.n5(var3.getInnerText()));
      } else {
         if (var4 == null) {
            throw new CryptographicException("A Cipher Data element should have either a CipherValue or a CipherReference element.");
         }

         this.l6 = new q0();
         this.l6.n5((m8)var4);
      }

      this.n5 = var1;
   }
}
