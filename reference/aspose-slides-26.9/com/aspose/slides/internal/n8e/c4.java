package com.aspose.slides.internal.n8e;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class c4 {
   static String n5(Node var0) {
      StringBuilder var1 = new StringBuilder();
      if (var0.getNodeType() == 1) {
         var1.append("<").append(var0.getNodeName()).append(">");
         NodeList var2 = var0.getChildNodes();
         if (var2.getLength() == 1 && var2.item(0).getNodeType() == 3) {
            Node var5 = var2.item(0);
            String var4 = var5.getNodeValue();
            var4 = var4.replace("&", "&amp;");
            var4 = var4.replace("<", "&lt;");
            var4 = var4.replace(">", "&gt;");
            var1.append(var4);
         } else {
            for (int var3 = 0; var3 < var2.getLength(); var3++) {
               var1.append(n5(var2.item(var3)));
            }
         }

         var1.append("</").append(var0.getNodeName()).append(">");
      }

      return var1.toString();
   }

   static Element n5(Element var0, String var1) {
      NodeList var2 = var0.getElementsByTagName(var1);
      return var2.getLength() > 0 ? (Element)var2.item(0) : null;
   }

   static String l6(Element var0, String var1) {
      Element var2 = n5(var0, var1);
      return var2 != null ? var2.getFirstChild().getNodeValue() : "";
   }
}
