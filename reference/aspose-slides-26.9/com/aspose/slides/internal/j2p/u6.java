package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.m8;

public class u6 extends b3 {
   private String n5;
   private String l6;

   public final String n5() {
      return this.n5;
   }

   @Override
   public m8 l6() {
      XmlDocument var1 = new XmlDocument();
      var1.setPreserveWhitespace(true);
      return this.n5(var1);
   }

   @Override
   public m8 n5(XmlDocument var1) {
      m8 var2 = var1.createElement("RetrievalMethod", "http://www.w3.org/2000/09/xmldsig#");
      if (!com.aspose.slides.ms.System.d1.n5(this.n5)) {
         var2.k5("URI", this.n5);
      }

      if (!com.aspose.slides.ms.System.d1.n5(this.l6)) {
         var2.k5("Type", this.l6);
      }

      return var2;
   }

   @Override
   public void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.n5 = i9.k5(var1, "URI", "http://www.w3.org/2000/09/xmldsig#");
      this.l6 = i9.k5(var1, "Type", "http://www.w3.org/2000/09/xmldsig#");
   }
}
