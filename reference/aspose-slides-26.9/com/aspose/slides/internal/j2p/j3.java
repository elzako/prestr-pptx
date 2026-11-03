package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Queue;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.o8m.u8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.c7;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.k1;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.o8;
import com.aspose.slides.ms.System.Xml.s2;

public class j3 extends g7 {
   private com.aspose.slides.ms.System.y8[] l6 = new com.aspose.slides.ms.System.y8[]{
      com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.z0k.t4.class), com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class)
   };
   private com.aspose.slides.ms.System.y8[] k5 = new com.aspose.slides.ms.System.y8[]{com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class)};
   private i0 u3 = null;
   private ArrayList a6 = null;
   private y1 u9 = null;
   private XmlDocument h0 = null;
   private s2 c8 = null;

   public j3() {
      this.l6("http://www.w3.org/2002/07/decrypt#XML");
   }

   private ArrayList y4() {
      if (this.a6 == null) {
         this.a6 = new ArrayList();
      }

      return this.a6;
   }

   protected boolean n5(m8 var1, String var2) {
      return var1 == null
         ? false
         : com.aspose.slides.ms.System.d1.a6(var1.n5("Id"), var2)
            || com.aspose.slides.ms.System.d1.a6(var1.n5("id"), var2)
            || com.aspose.slides.ms.System.d1.a6(var1.n5("ID"), var2);
   }

   public final y1 n3() {
      if (this.u9 != null) {
         return this.u9;
      }

      e9 var1 = this.k5();
      s0 var2 = var1 == null ? this.l6() : var1.h0();
      if (var2 != null && var2.u3() != null) {
         this.u9 = var2.u3();
      } else {
         this.u9 = new y1(this.h0);
      }

      return this.u9;
   }

   @Override
   public com.aspose.slides.ms.System.y8[] h0() {
      return this.l6;
   }

   @Override
   public void n5(i0 var1) {
      if (var1 == null) {
         throw new CryptographicException("Unknown transform has been encountered.");
      }

      this.y4().clear();
      IEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            l0 var3 = (l0)var2.next();
            m8 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, m8.class);
            if (var4 != null) {
               if ("Except".equals(var4.getLocalName()) && "http://www.w3.org/2002/07/decrypt#".equals(var4.getNamespaceURI())) {
                  String var5 = i9.k5(var4, "URI", "http://www.w3.org/2002/07/decrypt#");
                  if (var5 != null && var5.length() != 0 && var5.charAt(0) == '#') {
                     if (!i9.n5(var4, "URI")) {
                        throw new CryptographicException("Unknown transform has been encountered.");
                     }

                     String var6 = i9.l6(var5);
                     this.y4().addItem(var6);
                     continue;
                  }

                  throw new CryptographicException("A Uri attribute is required for a CipherReference element.");
               }

               throw new CryptographicException("Unknown transform has been encountered.");
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }
   }

   @Override
   protected i0 c8() {
      if (this.y4().size() == 0) {
         return null;
      }

      XmlDocument var1 = new XmlDocument();
      m8 var2 = var1.createElement("Transform", "http://www.w3.org/2000/09/xmldsig#");
      if (!com.aspose.slides.ms.System.d1.n5(this.u3())) {
         var2.k5("Algorithm", this.u3());
      }

      IEnumerator var3 = this.y4().iterator();

      try {
         while (var3.hasNext()) {
            String var4 = (String)var3.next();
            m8 var5 = var1.createElement("Except", "http://www.w3.org/2002/07/decrypt#");
            var5.k5("URI", var4);
            var2.appendChild(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            ((IDisposable)var3).dispose();
         }
      }

      return var2.getChildNodes();
   }

   @Override
   public void n5(Object var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.z0k.t4.class)) {
         this.n5((com.aspose.slides.internal.z0k.t4)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, XmlDocument.class)) {
         this.l6((XmlDocument)var1);
      }
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1) {
      XmlDocument var2 = new XmlDocument();
      var2.setPreserveWhitespace(true);
      o8 var3 = this.u9() ? this.n5 : new k1();
      c7 var4 = i9.n5(var1, var3, this.n5());
      var2.load(var4);
      this.h0 = var2;
      this.c8 = new s2(this.h0.getNameTable());
      this.c8.n5("enc", "http://www.w3.org/2001/04/xmlenc#");
      this.u3 = var2.selectNodes("//enc:EncryptedData", this.c8);
   }

   private void l6(XmlDocument var1) {
      if (var1 == null) {
         throw new ArgumentNullException("document");
      }

      this.h0 = var1;
      this.c8 = new s2(var1.getNameTable());
      this.c8.n5("enc", "http://www.w3.org/2001/04/xmlenc#");
      this.u3 = var1.selectNodes("//enc:EncryptedData", this.c8);
   }

   private void n5(m8 var1, byte[] var2) {
      l0 var3 = var1.getParentNode();
      if (var3.getNodeType() == 9) {
         var3.setInnerXml(this.n3().l6().l6(var2));
      } else {
         this.n3().n5(var1, var2);
      }
   }

   private boolean n5(m8 var1) {
      if (this.y4().size() > 0) {
         for (int var2 = 0; var2 < this.y4().size(); var2++) {
            if (this.n5(var1, (String)this.y4().get_Item(var2))) {
               return false;
            }
         }
      }

      w1 var5 = new w1();
      var5.n5(var1);
      u8 var3 = this.n3().l6(var5, null);
      if (var3 == null) {
         throw new CryptographicException("Unable to retrieve the decryption key.");
      }

      byte[] var4 = this.n3().n5(var5, var3);
      this.n5(var1, var4);
      return true;
   }

   private void l6(i0 var1) {
      if (var1 != null && var1.n5() != 0) {
         Queue var2 = new Queue();
         IEnumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               l0 var4 = (l0)var3.next();
               var2.enqueue(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }

         for (l0 var19 = com.aspose.slides.internal.v6g.k5.n5(var2.dequeue(), l0.class);
            var19 != null;
            var19 = com.aspose.slides.internal.v6g.k5.n5(var2.dequeue(), l0.class)
         ) {
            m8 var5 = com.aspose.slides.internal.v6g.k5.n5(var19, m8.class);
            if (var5 != null && "EncryptedData".equals(var5.getLocalName()) && "http://www.w3.org/2001/04/xmlenc#".equals(var5.getNamespaceURI())) {
               l0 var6 = var5.getNextSibling();
               l0 var7 = var5.getParentNode();
               if (this.n5(var5)) {
                  l0 var8 = var7.getFirstChild();

                  while (var8 != null && var8.getNextSibling() != var6) {
                     var8 = var8.getNextSibling();
                  }

                  if (var8 != null) {
                     i0 var9 = var8.selectNodes("//enc:EncryptedData", this.c8);
                     if (var9.n5() > 0) {
                        IEnumerator var10 = var9.iterator();

                        try {
                           while (var10.hasNext()) {
                              l0 var11 = (l0)var10.next();
                              var2.enqueue(var11);
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                              ((IDisposable)var10).dispose();
                           }
                        }
                     }
                  }
               }
            }

            if (var2.size() == 0) {
               break;
            }
         }
      }
   }

   @Override
   public Object t2() {
      if (this.u3 != null) {
         this.l6(this.u3);
      }

      i9.n5(this.h0.getDocumentElement(), this.x8());
      return this.h0;
   }

   @Override
   public Object l6(com.aspose.slides.ms.System.y8 var1) {
      if (var1 == com.aspose.slides.internal.v6g.k5.n5(XmlDocument.class)) {
         return (XmlDocument)this.t2();
      } else {
         throw new ArgumentException("The input type was invalid for this transform.", "type");
      }
   }
}
