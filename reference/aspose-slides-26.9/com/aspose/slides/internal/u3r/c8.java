package com.aspose.slides.internal.u3r;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.u8;

class c8 extends e2 implements n5 {
   @Override
   public final com.aspose.slides.internal.t6q.x8 n5(XmlDocument var1) {
      if (var1 == null) {
         throw new ArgumentNullException("xmlDocument");
      }

      i0 var2 = var1.getElementsByTagName("rdf:RDF");
      if (var2.n5() != 1) {
         return null;
      }

      m8 var3 = com.aspose.slides.internal.v6g.k5.n5(var2.k5(0), m8.class);
      if (var3 == null) {
         return null;
      }

      if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(var3.getNamespaceURI())) {
         throw new com.aspose.slides.internal.z3b.s7(d1.n5("XmpMeta does not contain correct uri. XMP: {0}", new Object[]{var1.getInnerXml()}));
      }

      com.aspose.slides.internal.t6q.x8 var4 = new com.aspose.slides.internal.t6q.x8();
      if (var3.s7()) {
         IEnumerator var5 = var3.getAttributes().iterator();

         try {
            while (var5.hasNext()) {
               u8 var6 = (u8)var5.next();
               var4.l6(var6.getName(), var6.getValue());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               ((IDisposable)var5).dispose();
            }
         }
      }

      return var4;
   }
}
