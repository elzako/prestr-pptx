package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.s2;

public final class w1 extends y2 {
   public void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      s2 var2 = new s2(var1.getOwnerDocument().getNameTable());
      var2.n5("enc", "http://www.w3.org/2001/04/xmlenc#");
      var2.n5("ds", "http://www.w3.org/2000/09/xmldsig#");
      this.k5(i9.k5(var1, "Id", "http://www.w3.org/2001/04/xmlenc#"));
      this.u3(i9.k5(var1, "Type", "http://www.w3.org/2001/04/xmlenc#"));
      this.a6(i9.k5(var1, "MimeType", "http://www.w3.org/2001/04/xmlenc#"));
      this.u9(i9.k5(var1, "Encoding", "http://www.w3.org/2001/04/xmlenc#"));
      l0 var3 = var1.selectSingleNode("enc:EncryptionMethod", var2);
      this.n5(new a0());
      if (var3 != null) {
         this.x8().n5(com.aspose.slides.internal.v6g.k5.n5(var3, m8.class));
      }

      this.n5(new e5());
      l0 var4 = var1.selectSingleNode("ds:KeyInfo", var2);
      if (var4 != null) {
         this.s7().n5(com.aspose.slides.internal.v6g.k5.n5(var4, m8.class));
      }

      l0 var5 = var1.selectSingleNode("enc:CipherData", var2);
      if (var5 == null) {
         throw new CryptographicException("Cipher data is not specified.");
      }

      this.n5(new t4());
      this.y4().n5(com.aspose.slides.internal.v6g.k5.n5(var5, m8.class));
      l0 var6 = var1.selectSingleNode("enc:EncryptionProperties", var2);
      if (var6 != null) {
         i0 var7 = var6.selectNodes("enc:EncryptionProperty", var2);
         if (var7 != null) {
            IEnumerator var8 = var7.iterator();

            try {
               while (var8.hasNext()) {
                  l0 var9 = (l0)var8.next();
                  d2 var10 = new d2();
                  var10.n5(com.aspose.slides.internal.v6g.k5.n5(var9, m8.class));
                  this.n3().n5(var10);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  ((IDisposable)var8).dispose();
               }
            }
         }
      }

      this.n5 = var1;
   }
}
