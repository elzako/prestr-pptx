package com.aspose.slides;

import com.aspose.slides.ms.System.Xml.XmlDocument;

class v2i {
   public static com.aspose.slides.internal.k4y.o2n n5(String var0) {
      t5w var1 = new t5w(null, InterruptionToken.getNone());
      new i1x(var1, null);
      XmlDocument var3 = new XmlDocument();
      var3.createElement("par");
      com.aspose.slides.ms.System.Xml.m8 var4 = var3.createElement("par");
      var4.k5("xmlns:p", "http://schemas.openxmlformats.org/presentationml/2006/main");
      var4.k5("xmlns:a", "http://schemas.openxmlformats.org/drawingml/2006/main");
      var4.setInnerXml(var0);
      com.aspose.slides.ms.System.Xml.p5 var5 = new com.aspose.slides.ms.System.Xml.p5(var4.getOuterXml(), 1, null);
      var5.u9();
      return new com.aspose.slides.internal.k4y.o2n(var5);
   }
}
