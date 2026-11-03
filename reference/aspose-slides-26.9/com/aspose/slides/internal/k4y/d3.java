package com.aspose.slides.internal.k4y;

import com.aspose.slides.ms.System.Xml.XmlDocument;

public class d3 extends c9 {
   private XmlDocument n5;

   d3(com.aspose.slides.ms.System.Xml.c7 var1) {
      super(var1);
      this.n5 = new XmlDocument();
      com.aspose.slides.ms.System.Xml.t5 var2 = this.n5.createDocumentFragment();
      var2.setInnerXml(super.n5());
      this.n5.appendChild(var2);
   }

   d3() {
   }

   public final XmlDocument l6() {
      return this.n5;
   }

   public final void n5(XmlDocument var1) {
      this.n5 = var1;
      super.n5(this.n5.getOuterXml());
   }

   @Override
   public String n5() {
      super.n5(this.n5.getOuterXml());
      return super.n5();
   }

   @Override
   public void n5(String var1) {
      this.n5 = new XmlDocument();
      com.aspose.slides.ms.System.Xml.t5 var2 = this.n5.createDocumentFragment();
      var2.setInnerXml(var1);
      this.n5.appendChild(var2);
      super.n5(var1);
   }
}
