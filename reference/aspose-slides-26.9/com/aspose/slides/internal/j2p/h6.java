package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.k1;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.o8;

public class h6 extends g7 {
   private com.aspose.slides.ms.System.y8[] l6 = new com.aspose.slides.ms.System.y8[]{
      com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class),
      com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class),
      com.aspose.slides.internal.v6g.k5.n5(i0.class)
   };
   private com.aspose.slides.ms.System.y8[] k5 = new com.aspose.slides.ms.System.y8[]{
      com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class)
   };
   private boolean u3 = false;
   private String a6;
   private p8 u9;

   public h6() {
      this(false, null);
   }

   public h6(boolean var1) {
      this(var1, null);
   }

   public h6(boolean var1, String var2) {
      this.u3 = var1;
      this.a6 = var2;
      this.l6(var1 ? "http://www.w3.org/2001/10/xml-exc-c14n#WithComments" : "http://www.w3.org/2001/10/xml-exc-c14n#");
   }

   public final String n3() {
      return this.a6;
   }

   public final void k5(String var1) {
      this.a6 = var1;
   }

   @Override
   public com.aspose.slides.ms.System.y8[] h0() {
      return this.l6;
   }

   @Override
   public void n5(i0 var1) {
      if (var1 != null) {
         IEnumerator var2 = var1.iterator();

         try {
            while (var2.hasNext()) {
               l0 var3 = (l0)var2.next();
               m8 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, m8.class);
               if (var4 != null) {
                  if (!com.aspose.slides.ms.System.d1.a6(var4.getLocalName(), "InclusiveNamespaces")
                     || !com.aspose.slides.ms.System.d1.a6(var4.getNamespaceURI(), "http://www.w3.org/2001/10/xml-exc-c14n#")
                     || !i9.u3(var4, "PrefixList", "http://www.w3.org/2000/09/xmldsig#")) {
                     throw new CryptographicException("Unknown transform has been encountered.");
                  }

                  if (!i9.n5(var4, "PrefixList")) {
                     throw new CryptographicException("Unknown transform has been encountered.");
                  }

                  this.k5(i9.k5(var4, "PrefixList", "http://www.w3.org/2000/09/xmldsig#"));
                  return;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               ((IDisposable)var2).dispose();
            }
         }
      }
   }

   @Override
   public void n5(Object var1) {
      o8 var2 = this.u9() ? this.n5 : new k1();
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.z0k.t4.class)) {
         this.u9 = new p8((com.aspose.slides.internal.z0k.t4)var1, this.u3, this.a6, var2, this.n5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, XmlDocument.class)) {
         this.u9 = new p8((XmlDocument)var1, this.u3, this.a6, var2);
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, i0.class)) {
            throw new ArgumentException("Type of input object is invalid.", "obj");
         }

         this.u9 = new p8((i0)var1, this.u3, this.a6, var2);
      }
   }

   @Override
   protected i0 c8() {
      if (this.n3() == null) {
         return null;
      }

      XmlDocument var1 = new XmlDocument();
      m8 var2 = var1.createElement("Transform", "http://www.w3.org/2000/09/xmldsig#");
      if (!com.aspose.slides.ms.System.d1.n5(this.u3())) {
         var2.k5("Algorithm", this.u3());
      }

      m8 var3 = var1.createElement("InclusiveNamespaces", "http://www.w3.org/2001/10/xml-exc-c14n#");
      var3.k5("PrefixList", this.n3());
      var2.appendChild(var3);
      return var2.getChildNodes();
   }

   @Override
   public Object t2() {
      return new com.aspose.slides.internal.z0k.e2(this.u9.n5());
   }

   @Override
   public Object l6(com.aspose.slides.ms.System.y8 var1) {
      if (var1 != com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class)
         && !var1.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class))) {
         throw new ArgumentException("The input type was invalid for this transform.", "type");
      } else {
         return new com.aspose.slides.internal.z0k.e2(this.u9.n5());
      }
   }

   @Override
   public byte[] n5(com.aspose.slides.internal.o8m.f2 var1) {
      return this.u9.n5(var1);
   }
}
