package com.aspose.slides.internal.j2p;

import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.m8;

public class v4 extends b3 {
   private m8 n5;

   @Override
   public m8 l6() {
      XmlDocument var1 = new XmlDocument();
      var1.setPreserveWhitespace(true);
      return this.n5(var1);
   }

   @Override
   public m8 n5(XmlDocument var1) {
      return com.aspose.slides.internal.v6g.k5.n5(var1.importNode(this.n5, true), m8.class);
   }

   @Override
   public void n5(m8 var1) {
      this.n5 = var1;
   }
}
