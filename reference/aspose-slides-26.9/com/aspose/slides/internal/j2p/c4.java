package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.s2;

public abstract class c4 {
   private String l6;
   private String k5;
   private j4 u3;
   public m8 n5 = null;

   protected c4() {
      this(com.aspose.slides.ms.System.d1.n5, new j4());
   }

   protected c4(String var1, j4 var2) {
      this.n5(var2);
      this.n5(var1);
      this.n5 = null;
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("A Uri attribute is required for a CipherReference element.");
      }

      this.l6 = var1;
      this.n5 = null;
   }

   public final j4 k5() {
      if (this.u3 == null) {
         this.u3 = new j4();
      }

      return this.u3;
   }

   public final void n5(j4 var1) {
      this.u3 = var1;
      this.n5 = null;
   }

   protected final String u3() {
      return this.k5;
   }

   protected final void l6(String var1) {
      this.k5 = var1;
      this.n5 = null;
   }

   public final boolean a6() {
      return this.n5 != null;
   }

   public final m8 l6(XmlDocument var1) {
      if (this.u3() == null) {
         throw new CryptographicException("The Reference type must be set in an EncryptedReference object.");
      }

      m8 var2 = var1.createElement(this.u3(), "http://www.w3.org/2001/04/xmlenc#");
      if (!com.aspose.slides.ms.System.d1.n5(this.l6)) {
         var2.k5("URI", this.l6);
      }

      if (this.k5().n5() > 0) {
         var2.appendChild(this.k5().n5(var1, "http://www.w3.org/2000/09/xmldsig#"));
      }

      return var2;
   }

   public void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.l6(var1.getLocalName());
      String var2 = i9.k5(var1, "URI", "http://www.w3.org/2001/04/xmlenc#");
      if (var2 == null) {
         throw new ArgumentNullException("A Uri attribute is required for a CipherReference element.");
      }

      this.n5(var2);
      s2 var3 = new s2(var1.getOwnerDocument().getNameTable());
      var3.n5("ds", "http://www.w3.org/2000/09/xmldsig#");
      l0 var4 = var1.selectSingleNode("ds:Transforms", var3);
      if (var4 != null) {
         this.k5().n5(com.aspose.slides.internal.v6g.k5.n5(var4, m8.class));
      }

      this.n5 = var1;
   }
}
