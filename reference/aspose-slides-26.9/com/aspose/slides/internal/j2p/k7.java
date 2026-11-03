package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.s2;

public class k7 extends b3 {
   private com.aspose.slides.internal.o8m.z3 n5 = com.aspose.slides.internal.o8m.z3.k5();

   public final com.aspose.slides.internal.o8m.z3 n5() {
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
      com.aspose.slides.internal.o8m.m3 var2 = this.n5.l6(false).n5();
      m8 var3 = var1.createElement("KeyValue", "http://www.w3.org/2000/09/xmldsig#");
      m8 var4 = var1.createElement("DSAKeyValue", "http://www.w3.org/2000/09/xmldsig#");
      m8 var5 = var1.createElement("P", "http://www.w3.org/2000/09/xmldsig#");
      var5.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(var2.u3)));
      var4.appendChild(var5);
      m8 var6 = var1.createElement("Q", "http://www.w3.org/2000/09/xmldsig#");
      var6.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(var2.a6)));
      var4.appendChild(var6);
      m8 var7 = var1.createElement("G", "http://www.w3.org/2000/09/xmldsig#");
      var7.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(var2.l6)));
      var4.appendChild(var7);
      m8 var8 = var1.createElement("Y", "http://www.w3.org/2000/09/xmldsig#");
      var8.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(var2.c8)));
      var4.appendChild(var8);
      if (var2.k5 != null) {
         m8 var9 = var1.createElement("J", "http://www.w3.org/2000/09/xmldsig#");
         var9.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(var2.k5)));
         var4.appendChild(var9);
      }

      if (var2.u9 != null) {
         m8 var11 = var1.createElement("Seed", "http://www.w3.org/2000/09/xmldsig#");
         var11.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(var2.u9)));
         var4.appendChild(var11);
         m8 var10 = var1.createElement("PgenCounter", "http://www.w3.org/2000/09/xmldsig#");
         var10.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(i9.n5(var2.n5))));
         var4.appendChild(var10);
      }

      var3.appendChild(var4);
      return var3;
   }

   @Override
   public void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if ("KeyValue".equals(var1.getName()) && "http://www.w3.org/2000/09/xmldsig#".equals(var1.getNamespaceURI())) {
         String var2 = "dsig";
         s2 var3 = new s2(var1.getOwnerDocument().getNameTable());
         var3.n5("dsig", "http://www.w3.org/2000/09/xmldsig#");
         l0 var4 = var1.selectSingleNode(com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ "dsig", "DSAKeyValue"}), var3);
         if (var4 == null) {
            throw new CryptographicException(com.aspose.slides.ms.System.d1.n5("{0} must contain child element {1}",new Object[]{ "KeyValue", "DSAKeyValue"}));
         }

         l0 var5 = var4.selectSingleNode(com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ "dsig", "Y"}), var3);
         if (var5 == null) {
            throw new CryptographicException(com.aspose.slides.ms.System.d1.n5("{0} is missing", new Object[]{"Y"}));
         }

         l0 var6 = var4.selectSingleNode(com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ "dsig", "P"}), var3);
         l0 var7 = var4.selectSingleNode(com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ "dsig", "Q"}), var3);
         if ((var6 != null || var7 == null) && (var6 == null || var7 != null)) {
            l0 var8 = var4.selectSingleNode(com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ "dsig", "G"}), var3);
            l0 var9 = var4.selectSingleNode(com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ "dsig", "J"}), var3);
            l0 var10 = var4.selectSingleNode(com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ "dsig", "Seed"}), var3);
            l0 var11 = var4.selectSingleNode(com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ "dsig", "PgenCounter"}), var3);
            if ((var10 != null || var11 == null) && (var10 == null || var11 != null)) {
               try {
                  com.aspose.slides.internal.o8m.m3 var12 = new com.aspose.slides.internal.o8m.m3();
                  var12.u3 = var6 != null ? com.aspose.slides.ms.System.z3.s7(var6.getInnerText()) : null;
                  var12.a6 = var7 != null ? com.aspose.slides.ms.System.z3.s7(var7.getInnerText()) : null;
                  var12.l6 = var8 != null ? com.aspose.slides.ms.System.z3.s7(var8.getInnerText()) : null;
                  var12.c8 = com.aspose.slides.ms.System.z3.s7(var5.getInnerText());
                  var12.k5 = var9 != null ? com.aspose.slides.ms.System.z3.s7(var9.getInnerText()) : null;
                  var12.u9 = var10 != null ? com.aspose.slides.ms.System.z3.s7(var10.getInnerText()) : null;
                  var12.n5 = var11 != null ? i9.n5(com.aspose.slides.ms.System.z3.s7(var11.getInnerText())) : 0;
                  this.n5().l6(var12);
               } catch (RuntimeException var13) {
                  throw new CryptographicException("An error occurred parsing the key components", var13);
               }
            } else {
               throw new CryptographicException(com.aspose.slides.ms.System.d1.n5("{0} and {1} can only occur in combination",new Object[]{ "Seed", "PgenCounter"}));
            }
         } else {
            throw new CryptographicException(com.aspose.slides.ms.System.d1.n5("{0} and {1} can only occour in combination",new Object[]{ "P", "Q"}));
         }
      } else {
         throw new CryptographicException(
            com.aspose.slides.ms.System.d1.n5("Root element must be {0} element in namepsace {1}",new Object[]{ "KeyValue", "http://www.w3.org/2000/09/xmldsig#"})
         );
      }
   }
}
