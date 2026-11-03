package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;

public class z8 {
   private String n5;
   private String l6;
   private String k5;
   private x8 u3;
   private m8 a6 = null;

   public z8() {
      this.u3 = new x8();
   }

   private boolean l6() {
      return this.a6 != null;
   }

   public final m8 n5() {
      if (this.l6()) {
         return this.a6;
      }

      XmlDocument var1 = new XmlDocument();
      var1.setPreserveWhitespace(true);
      return this.n5(var1);
   }

   public final m8 n5(XmlDocument var1) {
      m8 var2 = var1.createElement("Object", "http://www.w3.org/2000/09/xmldsig#");
      if (!com.aspose.slides.ms.System.d1.n5(this.n5)) {
         var2.k5("Id", this.n5);
      }

      if (!com.aspose.slides.ms.System.d1.n5(this.l6)) {
         var2.k5("MimeType", this.l6);
      }

      if (!com.aspose.slides.ms.System.d1.n5(this.k5)) {
         var2.k5("Encoding", this.k5);
      }

      if (this.u3 != null) {
         IEnumerator var3 = this.u3.iterator();

         try {
            while (var3.hasNext()) {
               l0 var4 = (l0)var3.next();
               var2.appendChild(var1.importNode(var4, true));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }
      }

      return var2;
   }

   public final void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.n5 = i9.k5(var1, "Id", "http://www.w3.org/2000/09/xmldsig#");
      this.l6 = i9.k5(var1, "MimeType", "http://www.w3.org/2000/09/xmldsig#");
      this.k5 = i9.k5(var1, "Encoding", "http://www.w3.org/2000/09/xmldsig#");
      IEnumerator var2 = var1.getChildNodes().iterator();

      try {
         while (var2.hasNext()) {
            l0 var3 = (l0)var2.next();
            this.u3.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }

      this.a6 = var1;
   }
}
