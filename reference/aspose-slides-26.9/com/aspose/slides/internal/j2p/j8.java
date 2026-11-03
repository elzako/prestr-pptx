package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.s2;

public class j8 {
   private String n5;
   private w2 l6;
   private byte[] k5;
   private String u3;
   private e5 a6;
   private IList u9;
   private x8 h0;
   private s0 c8 = null;

   public final s0 n5() {
      return this.c8;
   }

   public final void n5(s0 var1) {
      this.c8 = var1;
   }

   public j8() {
      this.u9 = new ArrayList();
      this.h0 = new x8();
   }

   public final w2 l6() {
      return this.l6;
   }

   public final void n5(w2 var1) {
      this.l6 = var1;
      if (this.n5() != null && this.l6 != null) {
         this.l6.n5(this.n5());
      }
   }

   public final byte[] k5() {
      return this.k5;
   }

   public final void n5(byte[] var1) {
      this.k5 = var1;
   }

   public final e5 u3() {
      if (this.a6 == null) {
         this.a6 = new e5();
      }

      return this.a6;
   }

   public final IList a6() {
      return this.u9;
   }

   public final x8 u9() {
      return this.h0;
   }

   public final m8 h0() {
      XmlDocument var1 = new XmlDocument();
      var1.setPreserveWhitespace(true);
      return this.n5(var1);
   }

   public final m8 n5(XmlDocument var1) {
      m8 var2 = var1.createElement("Signature", "http://www.w3.org/2000/09/xmldsig#");
      if (!com.aspose.slides.ms.System.d1.n5(this.n5)) {
         var2.k5("Id", this.n5);
      }

      if (this.l6 == null) {
         throw new CryptographicException("Signature requires a SignedInfo.");
      }

      var2.appendChild(this.l6.n5(var1));
      if (this.k5 == null) {
         throw new CryptographicException("Signature requires a SignatureValue.");
      }

      m8 var3 = var1.createElement("SignatureValue", "http://www.w3.org/2000/09/xmldsig#");
      var3.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(this.k5)));
      if (!com.aspose.slides.ms.System.d1.n5(this.u3)) {
         var3.k5("Id", this.u3);
      }

      var2.appendChild(var3);
      if (this.u3().n5() > 0) {
         var2.appendChild(this.u3().n5(var1));
      }

      IEnumerator var4 = this.u9.iterator();

      try {
         while (var4.hasNext()) {
            Object var5 = var4.next();
            z8 var6 = com.aspose.slides.internal.v6g.k5.n5(var5, z8.class);
            if (var6 != null) {
               var2.appendChild(var6.n5(var1));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            ((IDisposable)var4).dispose();
         }
      }

      return var2;
   }

   public final void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (!com.aspose.slides.ms.System.d1.a6(var1.getLocalName(), "Signature")) {
         throw new CryptographicException("Malformed element {0}.", "Signature");
      }

      this.n5 = i9.k5(var1, "Id", "http://www.w3.org/2000/09/xmldsig#");
      if (!i9.n5(var1, "Id")) {
         throw new CryptographicException("Malformed element {0}.", "Signature");
      }

      s2 var2 = new s2(var1.getOwnerDocument().getNameTable());
      var2.n5("ds", "http://www.w3.org/2000/09/xmldsig#");
      int var3 = 0;
      i0 var4 = var1.selectNodes("ds:SignedInfo", var2);
      if (var4 != null && var4.n5() != 0 && var4.n5() <= 1) {
         m8 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.k5(0), m8.class);
         var3 += var4.n5();
         this.n5(new w2());
         this.l6().n5(var5);
         i0 var6 = var1.selectNodes("ds:SignatureValue", var2);
         if (var6 != null && var6.n5() != 0 && var6.n5() <= 1) {
            m8 var7 = com.aspose.slides.internal.v6g.k5.n5(var6.k5(0), m8.class);
            var3 += var6.n5();
            this.k5 = com.aspose.slides.ms.System.z3.s7(i9.n5(var7.getInnerText()));
            this.u3 = i9.k5(var7, "Id", "http://www.w3.org/2000/09/xmldsig#");
            if (!i9.n5(var7, "Id")) {
               throw new CryptographicException("Malformed element {0}.", "SignatureValue");
            }

            i0 var8 = var1.selectNodes("ds:KeyInfo", var2);
            this.a6 = new e5();
            if (var8 != null) {
               if (var8.n5() > 1) {
                  throw new CryptographicException("Malformed element {0}.", "KeyInfo");
               }

               IEnumerator var9 = var8.iterator();

               try {
                  while (var9.hasNext()) {
                     l0 var10 = (l0)var9.next();
                     m8 var11 = com.aspose.slides.internal.v6g.k5.n5(var10, m8.class);
                     if (var11 != null) {
                        this.a6.n5(var11);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                     ((IDisposable)var9).dispose();
                  }
               }

               var3 += var8.n5();
            }

            i0 var30 = var1.selectNodes("ds:Object", var2);
            this.u9.clear();
            if (var30 != null) {
               IEnumerator var31 = var30.iterator();

               try {
                  while (var31.hasNext()) {
                     l0 var33 = (l0)var31.next();
                     m8 var12 = com.aspose.slides.internal.v6g.k5.n5(var33, m8.class);
                     if (var12 != null) {
                        z8 var13 = new z8();
                        var13.n5(var12);
                        this.u9.addItem(var13);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var31, IDisposable.class)) {
                     ((IDisposable)var31).dispose();
                  }
               }

               var3 += var30.n5();
            }

            i0 var32 = var1.selectNodes("//*[@Id]", var2);
            if (var32 != null) {
               IEnumerator var34 = var32.iterator();

               try {
                  while (var34.hasNext()) {
                     l0 var35 = (l0)var34.next();
                     this.h0.addItem(var35);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var34, IDisposable.class)) {
                     ((IDisposable)var34).dispose();
                  }
               }
            }

            if (var1.selectNodes("*").n5() != var3) {
               throw new CryptographicException("Malformed element {0}.", "Signature");
            }
         } else {
            throw new CryptographicException("Malformed element {0}.", "SignatureValue");
         }
      } else {
         throw new CryptographicException("Malformed element {0}.", "SignedInfo");
      }
   }
}
