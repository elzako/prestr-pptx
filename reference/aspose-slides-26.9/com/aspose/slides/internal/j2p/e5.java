package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;

public class e5 implements IEnumerable {
   private String n5 = null;
   private ArrayList l6 = new ArrayList();

   public final m8 n5(XmlDocument var1) {
      m8 var2 = var1.createElement("KeyInfo", "http://www.w3.org/2000/09/xmldsig#");
      if (!com.aspose.slides.ms.System.d1.n5(this.n5)) {
         var2.k5("Id", this.n5);
      }

      for (int var3 = 0; var3 < this.l6.size(); var3++) {
         m8 var4 = ((b3)this.l6.get_Item(var3)).n5(var1);
         if (var4 != null) {
            var2.appendChild(var4);
         }
      }

      return var2;
   }

   public final void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.n5 = i9.k5(var1, "Id", "http://www.w3.org/2000/09/xmldsig#");
      if (!i9.n5(var1, "Id")) {
         throw new CryptographicException("Malformed element {0}.", "KeyInfo");
      }

      for (l0 var2 = var1.getFirstChild(); var2 != null; var2 = var2.getNextSibling()) {
         m8 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, m8.class);
         if (var3 != null) {
            String var4 = com.aspose.slides.ms.System.d1.n5(new String[]{var3.getNamespaceURI(), " ", var3.getLocalName()});
            if ("http://www.w3.org/2000/09/xmldsig# KeyValue".equals(var4)) {
               if (!i9.n5(var3, com.aspose.slides.internal.v6g.k5.k5(null, String[].class))) {
                  throw new CryptographicException("Malformed element {0}.", "KeyInfo/KeyValue");
               }

               i0 var5 = var3.getChildNodes();
               IEnumerator var6 = var5.iterator();

               try {
                  while (var6.hasNext()) {
                     l0 var7 = (l0)var6.next();
                     m8 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, m8.class);
                     if (var8 != null) {
                        var4 = com.aspose.slides.ms.System.d1.n5(var4, com.aspose.slides.ms.System.d1.n5(new String[]{"/", var8.getLocalName()}));
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     ((IDisposable)var6).dispose();
                  }
               }
            }

            b3 var12 = z3.n5(b3.class, var4);
            if (var12 == null) {
               var12 = new v4();
            }

            var12.n5(var3);
            this.n5(var12);
         }
      }
   }

   public final int n5() {
      return this.l6.size();
   }

   public final void n5(b3 var1) {
      this.l6.addItem(var1);
   }

   @Override
   public final IEnumerator iterator() {
      return this.l6.iterator();
   }
}
