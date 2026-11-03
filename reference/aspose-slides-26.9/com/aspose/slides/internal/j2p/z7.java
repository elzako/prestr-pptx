package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.m8;

public class z7 extends b3 {
   private String n5;

   public z7() {
      this(null);
   }

   public z7(String var1) {
      this.n5(var1);
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   @Override
   public m8 l6() {
      XmlDocument var1 = new XmlDocument();
      var1.setPreserveWhitespace(true);
      return this.n5(var1);
   }

   @Override
   public m8 n5(XmlDocument var1) {
      m8 var2 = var1.createElement("KeyName", "http://www.w3.org/2000/09/xmldsig#");
      var2.appendChild(var1.createTextNode(this.n5));
      return var2;
   }

   @Override
   public void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.n5 = com.aspose.slides.ms.System.d1.l6(var1.getInnerText());
   }
}
