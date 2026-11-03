package com.aspose.slides.internal.u3r;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.u8;

class n3 extends e2 implements u3 {
   @Override
   public final boolean n5(XmlDocument var1) {
      m8 var2 = this.k5(var1);
      return var2 != null;
   }

   @Override
   public final com.aspose.slides.internal.t6q.u9 l6(XmlDocument var1) {
      m8 var2 = this.k5(var1);
      if (var2 == null) {
         return null;
      }

      if (!"adobe:ns:meta/".equals(var2.getNamespaceURI())) {
         throw new com.aspose.slides.internal.z3b.s7(d1.n5("XmpMeta does not contain correct URI. XMP: {0}", new Object[]{var1.getInnerXml()}));
      }

      com.aspose.slides.internal.t6q.u9 var3 = new com.aspose.slides.internal.t6q.u9();
      if (var2.s7()) {
         IEnumerator var4 = var2.getAttributes().iterator();

         try {
            while (var4.hasNext()) {
               u8 var5 = (u8)var4.next();
               if ("x:xmptk".equals(var5.getName())) {
                  var3.l6(d1.n5(var5.getValue()) ? null : var5.getValue());
               } else {
                  var3.n5(var5.getName(), var5.getValue());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               ((IDisposable)var4).dispose();
            }
         }
      }

      return var3;
   }

   private m8 k5(XmlDocument var1) {
      if (var1 == null) {
         throw new ArgumentNullException("xmlDocument");
      } else {
         i0 var2 = var1.getElementsByTagName("x:xmpmeta");
         if (var2.n5() != 1) {
            return null;
         } else {
            m8 var3 = com.aspose.slides.internal.v6g.k5.n5(var2.k5(0), m8.class);
            if (var3 == null) {
               return null;
            } else {
               return !"adobe:ns:meta/".equals(var3.getNamespaceURI()) ? null : var3;
            }
         }
      }
   }
}
