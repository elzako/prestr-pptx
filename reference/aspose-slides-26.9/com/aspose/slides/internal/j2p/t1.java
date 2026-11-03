package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.l0;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.s2;

public class t1 extends b3 {
   private ArrayList n5 = null;
   private ArrayList l6 = null;
   private ArrayList k5 = null;
   private ArrayList u3 = null;
   private byte[] a6 = null;

   public final ArrayList n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.f3c.u9 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("certificate");
      }

      if (this.n5 == null) {
         this.n5 = new ArrayList();
      }

      com.aspose.slides.internal.f3c.h0 var2 = new com.aspose.slides.internal.f3c.h0(var1);
      this.n5.addItem(var2);
   }

   public final ArrayList k5() {
      return this.k5;
   }

   public final void n5(byte[] var1) {
      if (this.k5 == null) {
         this.k5 = new ArrayList();
      }

      this.k5.addItem(var1);
   }

   public final ArrayList u3() {
      return this.u3;
   }

   public final void n5(String var1) {
      if (this.u3 == null) {
         this.u3 = new ArrayList();
      }

      this.u3.addItem(var1);
   }

   public final ArrayList a6() {
      return this.l6;
   }

   public final void n5(String var1, String var2) {
      if (this.l6 == null) {
         this.l6 = new ArrayList();
      }

      this.l6.add(i9.n5(var1, var2));
   }

   private void u9() {
      this.a6 = null;
      if (this.k5 != null) {
         this.k5.clear();
      }

      if (this.u3 != null) {
         this.u3.clear();
      }

      if (this.l6 != null) {
         this.l6.clear();
      }

      if (this.n5 != null) {
         this.n5.clear();
      }
   }

   @Override
   public m8 l6() {
      XmlDocument var1 = new XmlDocument();
      var1.setPreserveWhitespace(true);
      return this.n5(var1);
   }

   @Override
   public m8 n5(XmlDocument var1) {
      m8 var2 = var1.createElement("X509Data", "http://www.w3.org/2000/09/xmldsig#");
      if (this.l6 != null) {
         IEnumerator var3 = this.l6.iterator();

         try {
            while (var3.hasNext()) {
               f5 var4 = (f5)var3.next();
               m8 var5 = var1.createElement("X509IssuerSerial", "http://www.w3.org/2000/09/xmldsig#");
               m8 var6 = var1.createElement("X509IssuerName", "http://www.w3.org/2000/09/xmldsig#");
               var6.appendChild(var1.createTextNode(var4.n5()));
               var5.appendChild(var6);
               m8 var7 = var1.createElement("X509SerialNumber", "http://www.w3.org/2000/09/xmldsig#");
               var7.appendChild(var1.createTextNode(var4.l6()));
               var5.appendChild(var7);
               var2.appendChild(var5);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }
      }

      if (this.k5 != null) {
         IEnumerator var32 = this.k5.iterator();

         try {
            while (var32.hasNext()) {
               byte[] var36 = (byte[])var32.next();
               m8 var39 = var1.createElement("X509SKI", "http://www.w3.org/2000/09/xmldsig#");
               var39.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(var36)));
               var2.appendChild(var39);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var32, IDisposable.class)) {
               ((IDisposable)var32).dispose();
            }
         }
      }

      if (this.u3 != null) {
         IEnumerator var33 = this.u3.iterator();

         try {
            while (var33.hasNext()) {
               String var37 = (String)var33.next();
               m8 var40 = var1.createElement("X509SubjectName", "http://www.w3.org/2000/09/xmldsig#");
               var40.appendChild(var1.createTextNode(var37));
               var2.appendChild(var40);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var33, IDisposable.class)) {
               ((IDisposable)var33).dispose();
            }
         }
      }

      if (this.n5 != null) {
         IEnumerator var34 = this.n5.iterator();

         try {
            while (var34.hasNext()) {
               com.aspose.slides.internal.f3c.u9 var38 = (com.aspose.slides.internal.f3c.u9)var34.next();
               m8 var41 = var1.createElement("X509Certificate", "http://www.w3.org/2000/09/xmldsig#");
               var41.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(var38.x8())));
               var2.appendChild(var41);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var34, IDisposable.class)) {
               ((IDisposable)var34).dispose();
            }
         }
      }

      if (this.a6 != null) {
         m8 var35 = var1.createElement("X509CRL", "http://www.w3.org/2000/09/xmldsig#");
         var35.appendChild(var1.createTextNode(com.aspose.slides.ms.System.z3.n5(this.a6)));
         var2.appendChild(var35);
      }

      return var2;
   }

   @Override
   public void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("element");
      }

      s2 var2 = new s2(var1.getOwnerDocument().getNameTable());
      var2.n5("ds", "http://www.w3.org/2000/09/xmldsig#");
      i0 var3 = var1.selectNodes("ds:X509IssuerSerial", var2);
      i0 var4 = var1.selectNodes("ds:X509SKI", var2);
      i0 var5 = var1.selectNodes("ds:X509SubjectName", var2);
      i0 var6 = var1.selectNodes("ds:X509Certificate", var2);
      i0 var7 = var1.selectNodes("ds:X509CRL", var2);
      if (var7.n5() == 0 && var3.n5() == 0 && var4.n5() == 0 && var5.n5() == 0 && var6.n5() == 0) {
         throw new CryptographicException("Malformed element {0}.", "X509Data");
      }

      this.u9();
      if (var7.n5() != 0) {
         this.a6 = com.aspose.slides.ms.System.z3.s7(i9.n5(var7.n5(0).getInnerText()));
      }

      IEnumerator var8 = var3.iterator();

      try {
         while (var8.hasNext()) {
            l0 var9 = (l0)var8.next();
            l0 var10 = var9.selectSingleNode("ds:X509IssuerName", var2);
            l0 var11 = var9.selectSingleNode("ds:X509SerialNumber", var2);
            if (var10 == null || var11 == null) {
               throw new CryptographicException("Malformed element {0}.", "IssuerSerial");
            }

            this.n5(com.aspose.slides.ms.System.d1.l6(var10.getInnerText()), com.aspose.slides.ms.System.d1.l6(var11.getInnerText()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            ((IDisposable)var8).dispose();
         }
      }

      IEnumerator var36 = var4.iterator();

      try {
         while (var36.hasNext()) {
            l0 var37 = (l0)var36.next();
            this.n5(com.aspose.slides.ms.System.z3.s7(i9.n5(var37.getInnerText())));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var36, IDisposable.class)) {
            ((IDisposable)var36).dispose();
         }
      }

      IEnumerator var38 = var5.iterator();

      try {
         while (var38.hasNext()) {
            l0 var39 = (l0)var38.next();
            this.n5(com.aspose.slides.ms.System.d1.l6(var39.getInnerText()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var38, IDisposable.class)) {
            ((IDisposable)var38).dispose();
         }
      }

      IEnumerator var40 = var6.iterator();

      try {
         while (var40.hasNext()) {
            l0 var12 = (l0)var40.next();
            this.n5(new com.aspose.slides.internal.f3c.h0(com.aspose.slides.ms.System.z3.s7(i9.n5(var12.getInnerText()))));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var40, IDisposable.class)) {
            ((IDisposable)var40).dispose();
         }
      }
   }
}
