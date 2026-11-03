package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.Xml.XmlDocument;

abstract class m2c extends XmlDocument {
   m2v n5;
   h6n l6;
   static final Dictionary<String, String> k5 = new Dictionary<>();
   static final Dictionary<String, String> u3 = new Dictionary<>();
   private static final String[] h0 = new String[]{
      "http://schemas.openxmlformats.org/officeDocument/2006/relationships",
      "r",
      "http://schemas.openxmlformats.org/presentationml/2006/main",
      "p",
      "http://schemas.microsoft.com/office/2006/activeX",
      "ox",
      "http://schemas.openxmlformats.org/drawingml/2006/main",
      "a",
      "http://schemas.microsoft.com/office/powerpoint/2010/main",
      "p14",
      "urn:schemas-microsoft-com:vml",
      "v",
      "http://schemas.openxmlformats.org/markup-compatibility/2006",
      "mc"
   };
   static final String[] a6 = new String[]{
      "http://schemas.openxmlformats.org/officeDocument/2006/relationships",
      "http://schemas.openxmlformats.org/presentationml/2006/main",
      "http://schemas.openxmlformats.org/drawingml/2006/main",
      "http://schemas.microsoft.com/office/2006/activeX"
   };
   static final char[] u9 = com.aspose.slides.ms.System.d1.c8(
      com.aspose.slides.ms.System.d1.n5(" xmlns:xml=\"{0}\" xml:space=\"preserve\"", new Object[]{"http://www.w3.org/XML/1998/namespace"})
   );
   private static final char[] c8 = com.aspose.slides.ms.System.d1.c8("http://schemas.microsoft.com/office/powerpoint/2010/main");
   private static final com.aspose.slides.internal.v6g.u9 t2;

   protected abstract s2p n5();

   public final w9f n5(String var1, String var2) {
      com.aspose.slides.ms.System.Xml.i0 var3 = this.getElementsByTagName(var1, var2);
      return var3.n5() < 1 ? null : com.aspose.slides.internal.v6g.k5.n5(var3.k5(0), w9f.class);
   }

   public final w9f l6() {
      return (w9f)super.getDocumentElement();
   }

   @Override
   public com.aspose.slides.ms.System.Xml.m8 createElement(String prefix, String localName, String namespaceURI) {
      com.aspose.slides.ms.System.Xml.m8 var4 = this.n5().n5(prefix, localName, namespaceURI, this);
      if (var4 != null) {
         return var4;
      } else {
         throw new Exception();
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public w9f getDocumentElement() {
      return this.l6();
   }


   static {
      for (int var0 = 0; var0 < h0.length; var0 += 2) {
         k5.set_Item(h0[var0], h0[var0 + 1]);
         u3.set_Item(h0[var0 + 1], h0[var0]);
      }

      t2 = new com.aspose.slides.internal.v6g.u9("Choice", "Fallback");
   }
}
