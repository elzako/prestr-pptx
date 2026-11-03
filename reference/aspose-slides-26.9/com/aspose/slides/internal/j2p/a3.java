package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.s2;

public class a3 extends b3 {
   private com.aspose.slides.internal.o8m.z6 n5 = com.aspose.slides.internal.o8m.z6.k5();

   public final com.aspose.slides.internal.o8m.z6 n5() {
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
      com.aspose.slides.internal.o8m.j4 var2 = this.n5.l6(false).n5();
      m8 var3 = var1.createElement("KeyValue", "http://www.w3.org/2000/09/xmldsig#");
      m8 var4 = var1.createElement("RSAKeyValue", "http://www.w3.org/2000/09/xmldsig#");
      m8 var5 = var1.createElement("Modulus", "http://www.w3.org/2000/09/xmldsig#");
      var5.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(var2.h0)));
      var4.appendChild(var5);
      m8 var6 = var1.createElement("Exponent", "http://www.w3.org/2000/09/xmldsig#");
      var6.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(var2.c8)));
      var4.appendChild(var6);
      var3.appendChild(var4);
      return var3;
   }

   @Override
   public void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if ("KeyValue".equals(var1.getLocalName()) && "http://www.w3.org/2000/09/xmldsig#".equals(var1.getNamespaceURI())) {
         String var2 = "dsig";
         s2 var3 = new s2(var1.getOwnerDocument().getNameTable());
         var3.n5("dsig", "http://www.w3.org/2000/09/xmldsig#");
         l0 var4 = var1.selectSingleNode(com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ "dsig", "RSAKeyValue"}), var3);
         if (var4 == null) {
            throw new CryptographicException(com.aspose.slides.ms.System.d1.n5("{0} must contain child element {1}",new Object[]{ "KeyValue", "RSAKeyValue"}));
         }

         try {
            com.aspose.slides.internal.o8m.j4 var5 = new com.aspose.slides.internal.o8m.j4();
            var5.h0 = com.aspose.slides.ms.System.z3.s7(
               var4.selectSingleNode(com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ "dsig", "Modulus"}), var3).getInnerText()
            );
            var5.c8 = com.aspose.slides.ms.System.z3.s7(
               var4.selectSingleNode(com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ "dsig", "Exponent"}), var3).getInnerText()
            );
            this.n5().n5(var5);
         } catch (RuntimeException var6) {
            throw new CryptographicException(
               com.aspose.slides.ms.System.d1.n5("An error occurred parsing the {0} and {1} elements",new Object[]{ "Modulus", "Exponent"}), var6
            );
         }
      } else {
         throw new CryptographicException(
            com.aspose.slides.ms.System.d1.n5("Root element must be {0} element in namespace {1}",new Object[]{ "KeyValue", "http://www.w3.org/2000/09/xmldsig#"})
         );
      }
   }
}
