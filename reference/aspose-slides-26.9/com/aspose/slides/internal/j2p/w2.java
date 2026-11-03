package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.s2;
import com.aspose.slides.ms.System.Xml.t0;

public class w2 implements ICollection {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private ArrayList a6;
   private m8 u9 = null;
   private s0 h0 = null;
   private g7 c8 = null;

   public final s0 n5() {
      return this.h0;
   }

   public final void n5(s0 var1) {
      this.h0 = var1;
   }

   public w2() {
      this.a6 = new ArrayList();
   }

   @Override
   public final IEnumerator iterator() {
      throw new NotSupportedException();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      throw new NotSupportedException();
   }

   @Override
   public final int size() {
      throw new NotSupportedException();
   }

   @Override
   public final boolean isSynchronized() {
      throw new NotSupportedException();
   }

   @Override
   public final Object getSyncRoot() {
      throw new NotSupportedException();
   }

   public final String l6() {
      return this.l6 == null ? "http://www.w3.org/TR/2001/REC-xml-c14n-20010315" : this.l6;
   }

   public final g7 k5() {
      if (this.c8 == null) {
         this.c8 = z3.n5(g7.class, this.l6());
         if (this.c8 == null) {
            throw new CryptographicException(
               com.aspose.slides.ms.System.d1.n5(
                  com.aspose.slides.internal.x7n.l6.u3(), "Could not create the XML transformation identified by the URI {0}.", this.l6()
               )
            );
         }

         this.c8.n5(this.n5());
         this.c8.n5((e9)null);
      }

      return this.c8;
   }

   public final String u3() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
      this.u9 = null;
   }

   public final String a6() {
      return this.u3;
   }

   public final ArrayList u9() {
      return this.a6;
   }

   public final boolean h0() {
      if (this.u9 == null) {
         return false;
      }

      IEnumerator var1 = this.u9().iterator();

      try {
         while (var1.hasNext()) {
            e9 var2 = (e9)var1.next();
            if (!var2.u9()) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            ((IDisposable)var1).dispose();
         }
      }

      return true;
   }

   public final m8 c8() {
      if (this.h0()) {
         return this.u9;
      }

      XmlDocument var1 = new XmlDocument();
      var1.setPreserveWhitespace(true);
      return this.n5(var1);
   }

   public final m8 n5(XmlDocument var1) {
      m8 var2 = var1.createElement("SignedInfo", "http://www.w3.org/2000/09/xmldsig#");
      if (!com.aspose.slides.ms.System.d1.n5(this.n5)) {
         var2.k5("Id", this.n5);
      }

      m8 var3 = this.k5().n5(var1, "CanonicalizationMethod");
      var2.appendChild(var3);
      if (com.aspose.slides.ms.System.d1.n5(this.k5)) {
         throw new CryptographicException("A signature method is required.");
      }

      m8 var4 = var1.createElement("SignatureMethod", "http://www.w3.org/2000/09/xmldsig#");
      var4.k5("Algorithm", this.k5);
      if (this.u3 != null) {
         m8 var5 = var1.createElement(null, "HMACOutputLength", "http://www.w3.org/2000/09/xmldsig#");
         t0 var6 = var1.createTextNode(this.u3);
         var5.appendChild(var6);
         var4.appendChild(var5);
      }

      var2.appendChild(var4);
      if (this.a6.size() == 0) {
         throw new CryptographicException("At least one Reference element is required.");
      }

      for (int var7 = 0; var7 < this.a6.size(); var7++) {
         e9 var8 = (e9)this.a6.get_Item(var7);
         var2.appendChild(var8.n5(var1));
      }

      return var2;
   }

   public final void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      if (!com.aspose.slides.ms.System.d1.a6(var1.getLocalName(), "SignedInfo")) {
         throw new CryptographicException("Malformed element {0}.", "SignedInfo");
      }

      s2 var2 = new s2(var1.getOwnerDocument().getNameTable());
      var2.n5("ds", "http://www.w3.org/2000/09/xmldsig#");
      int var3 = 0;
      this.n5 = i9.k5(var1, "Id", "http://www.w3.org/2000/09/xmldsig#");
      if (!i9.n5(var1, "Id")) {
         throw new CryptographicException("Malformed element {0}.", "SignedInfo");
      }

      i0 var4 = var1.selectNodes("ds:CanonicalizationMethod", var2);
      if (var4 != null && var4.n5() != 0 && var4.n5() <= 1) {
         m8 var5 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(0), m8.class);
         var3 += var4.n5();
         this.l6 = i9.k5(var5, "Algorithm", "http://www.w3.org/2000/09/xmldsig#");
         if (this.l6 != null && i9.n5(var5, "Algorithm")) {
            this.c8 = null;
            if (var5.getChildNodes().n5() > 0) {
               this.k5().n5(var5.getChildNodes());
            }

            i0 var6 = var1.selectNodes("ds:SignatureMethod", var2);
            if (var6 != null && var6.n5() != 0 && var6.n5() <= 1) {
               m8 var7 = com.aspose.slides.internal.v6g.k5.n5(var6.n5(0), m8.class);
               var3 += var6.n5();
               this.k5 = i9.k5(var7, "Algorithm", "http://www.w3.org/2000/09/xmldsig#");
               if (this.k5 != null && i9.n5(var7, "Algorithm")) {
                  m8 var8 = com.aspose.slides.internal.v6g.k5.n5(var7.selectSingleNode("ds:HMACOutputLength", var2), m8.class);
                  if (var8 != null) {
                     this.u3 = var8.getInnerXml();
                  }

                  this.a6.clear();
                  i0 var9 = var1.selectNodes("ds:Reference", var2);
                  if (var9 != null) {
                     if (var9.n5() > 100) {
                        throw new CryptographicException("Malformed element {0}.", "SignedInfo/Reference");
                     }

                     IEnumerator var10 = var9.iterator();

                     try {
                        while (var10.hasNext()) {
                           l0 var11 = (l0)var10.next();
                           m8 var12 = com.aspose.slides.internal.v6g.k5.n5(var11, m8.class);
                           e9 var13 = new e9();
                           this.n5(var13);
                           var13.n5(var12);
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                           ((IDisposable)var10).dispose();
                        }
                     }

                     var3 += var9.n5();
                     if (var1.selectNodes("*").n5() != var3) {
                        throw new CryptographicException("Malformed element {0}.", "SignedInfo");
                     }
                  }

                  this.u9 = var1;
               } else {
                  throw new CryptographicException("Malformed element {0}.", "SignedInfo/SignatureMethod");
               }
            } else {
               throw new CryptographicException("Malformed element {0}.", "SignedInfo/SignatureMethod");
            }
         } else {
            throw new CryptographicException("Malformed element {0}.", "SignedInfo/CanonicalizationMethod");
         }
      } else {
         throw new CryptographicException("Malformed element {0}.", "SignedInfo/CanonicalizationMethod");
      }
   }

   public final void n5(e9 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("reference");
      }

      var1.n5(this.n5());
      this.a6.addItem(var1);
   }
}
