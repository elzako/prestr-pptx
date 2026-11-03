package com.aspose.slides.ms.System.Xml;

class d6 extends g8 {
   // $VF: synthetic field
   final p4 n5;

   d6(p4 var1) {
      this.n5 = var1;
   }

   @Override
   public String getDelegateId() {
      return "System.Xml.XmlDocument.NodeRemovingDelegate";
   }

   @Override
   public void n5(Object var1, p9 var2) {
      for (Object recoveredElement$var4$328 : p4.n5(this.n5)) {
         g8 var4 = (g8)recoveredElement$var4$328;
         var4.n5(var1, var2);
      }
   }
}
