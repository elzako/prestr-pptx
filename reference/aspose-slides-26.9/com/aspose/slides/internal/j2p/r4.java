package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.s2;
import com.aspose.slides.ms.System.Xml.t0;

public final class r4 extends y2 {
   private String l6;
   private String k5;
   private o5 u3;

   public final String n5() {
      if (this.l6 == null) {
         this.l6 = com.aspose.slides.ms.System.d1.n5;
      }

      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
      this.n5 = null;
   }

   public final String l6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
      this.n5 = null;
   }

   public final o5 k5() {
      if (this.u3 == null) {
         this.u3 = new o5();
      }

      return this.u3;
   }

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
      this.n5(i9.k5(var1, "Recipient", "http://www.w3.org/2001/04/xmlenc#"));
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

      l0 var27 = var1.selectSingleNode("enc:CarriedKeyName", var2);
      if (var27 != null) {
         this.l6(var27.getInnerText());
      }

      l0 var28 = var1.selectSingleNode("enc:ReferenceList", var2);
      if (var28 != null) {
         i0 var29 = var28.selectNodes("enc:DataReference", var2);
         if (var29 != null) {
            IEnumerator var30 = var29.iterator();

            try {
               while (var30.hasNext()) {
                  l0 var11 = (l0)var30.next();
                  j5 var12 = new j5();
                  var12.n5(com.aspose.slides.internal.v6g.k5.n5(var11, m8.class));
                  this.k5().addItem(var12);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                  ((IDisposable)var30).dispose();
               }
            }
         }

         i0 var31 = var28.selectNodes("enc:KeyReference", var2);
         if (var31 != null) {
            IEnumerator var32 = var31.iterator();

            try {
               while (var32.hasNext()) {
                  l0 var33 = (l0)var32.next();
                  a5 var13 = new a5();
                  var13.n5(com.aspose.slides.internal.v6g.k5.n5(var33, m8.class));
                  this.k5().addItem(var13);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var32, IDisposable.class)) {
                  ((IDisposable)var32).dispose();
               }
            }
         }
      }

      this.n5 = var1;
   }

   public m8 u3() {
      if (this.a6()) {
         return this.n5;
      }

      XmlDocument var1 = new XmlDocument();
      var1.setPreserveWhitespace(true);
      return this.n5(var1);
   }

   public final m8 n5(XmlDocument var1) {
      m8 var2 = var1.createElement("EncryptedKey", "http://www.w3.org/2001/04/xmlenc#");
      if (!com.aspose.slides.ms.System.d1.n5(this.u9())) {
         var2.k5("Id", this.u9());
      }

      if (!com.aspose.slides.ms.System.d1.n5(this.h0())) {
         var2.k5("Type", this.h0());
      }

      if (!com.aspose.slides.ms.System.d1.n5(this.c8())) {
         var2.k5("MimeType", this.c8());
      }

      if (!com.aspose.slides.ms.System.d1.n5(this.t2())) {
         var2.k5("Encoding", this.t2());
      }

      if (!com.aspose.slides.ms.System.d1.n5(this.n5())) {
         var2.k5("Recipient", this.n5());
      }

      if (this.x8() != null) {
         var2.appendChild(this.x8().n5(var1));
      }

      if (this.s7().n5() > 0) {
         var2.appendChild(this.s7().n5(var1));
      }

      if (this.y4() == null) {
         throw new CryptographicException("Cipher data is not specified.");
      }

      var2.appendChild(this.y4().n5(var1));
      if (this.n3().size() > 0) {
         m8 var3 = var1.createElement("EncryptionProperties", "http://www.w3.org/2001/04/xmlenc#");

         for (int var4 = 0; var4 < this.n3().size(); var4++) {
            d2 var5 = this.n3().n5(var4);
            var3.appendChild(var5.n5(var1));
         }

         var2.appendChild(var3);
      }

      if (this.k5().size() > 0) {
         m8 var6 = var1.createElement("ReferenceList", "http://www.w3.org/2001/04/xmlenc#");

         for (int var8 = 0; var8 < this.k5().size(); var8++) {
            var6.appendChild(this.k5().l6(var8).l6(var1));
         }

         var2.appendChild(var6);
      }

      if (this.l6() != null) {
         m8 var7 = var1.createElement("CarriedKeyName", "http://www.w3.org/2001/04/xmlenc#");
         t0 var9 = var1.createTextNode(this.l6());
         var7.appendChild(var9);
         var2.appendChild(var7);
      }

      return var2;
   }
}
