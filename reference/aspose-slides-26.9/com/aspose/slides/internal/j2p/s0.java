package com.aspose.slides.internal.j2p;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ObjectModel.Collection;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.o8m.b5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.Xml.XmlDocument;
import com.aspose.slides.ms.System.Xml.f4;
import com.aspose.slides.ms.System.Xml.i0;
import com.aspose.slides.ms.System.Xml.k1;
import com.aspose.slides.ms.System.Xml.m8;
import com.aspose.slides.ms.System.Xml.o8;

public class s0 {
   protected j8 n5;
   private com.aspose.slides.internal.o8m.a6 u3;
   private XmlDocument a6 = null;
   private IEnumerator u9 = null;
   private com.aspose.slides.internal.f3c.c8 h0 = null;
   private IEnumerator c8 = null;
   private boolean[] t2 = null;
   private int[] s7 = null;
   public o8 l6 = null;
   public m8 k5 = null;
   private boolean x8 = false;
   private s0$l6<s0, Boolean> n3 = new v8(this);
   private Collection<String> y4;
   private static IGenericList<String> e2 = null;
   private static IGenericList<String> t9 = null;
   private y1 z1 = null;
   private boolean t4 = false;
   private byte[] q0 = null;
   private static final com.aspose.slides.internal.v6g.u9 z3 = new com.aspose.slides.internal.v6g.u9("SHA1", "SHA256", "SHA384", "SHA512", "MD5", "RIPEMD160");

   public s0() {
      this.l6((m8)null);
   }

   public s0(XmlDocument var1) {
      if (var1 == null) {
         throw new ArgumentNullException("document");
      }

      this.l6(var1.getDocumentElement());
   }

   private void l6(m8 var1) {
      this.a6 = var1 == null ? null : var1.getOwnerDocument();
      this.k5 = var1;
      this.n5 = new j8();
      this.n5.n5(this);
      this.n5.n5(new w2());
      this.u3 = null;
      this.y4 = new Collection<>(y4());
   }

   public final boolean n5() {
      return this.x8;
   }

   public final Collection<String> l6() {
      return this.y4;
   }

   public final com.aspose.slides.internal.o8m.a6 k5() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.o8m.a6 var1) {
      this.u3 = var1;
   }

   public final y1 u3() {
      if (this.z1 == null) {
         this.z1 = new y1(this.a6);
      }

      return this.z1;
   }

   public final w2 a6() {
      return this.n5.l6();
   }

   public final String u9() {
      return this.n5.l6().u3();
   }

   public final e5 h0() {
      return this.n5.u3();
   }

   public final m8 c8() {
      return this.a6 != null ? this.n5.n5(this.a6) : this.n5.h0();
   }

   public final void n5(m8 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.n5.n5(var1);
      if (this.k5 == null) {
         this.k5 = var1;
      }

      this.t4 = false;
   }

   public final void n5(e9 var1) {
      this.n5.l6().n5(var1);
   }

   public final boolean l6(com.aspose.slides.internal.o8m.a6 var1) {
      if (!this.t4()) {
         return false;
      } else {
         return !this.k5(var1) ? false : this.z1();
      }
   }

   public final boolean n5(com.aspose.slides.internal.f3c.h0 var1, boolean var2) {
      if (!var2) {
         java.util.Iterator var3 = var1.y4().n5();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.f3c.m1 var4 = (com.aspose.slides.internal.f3c.m1)var3.next();
               if (com.aspose.slides.ms.System.d1.a6(var4.n5().l6(), "2.5.29.15", (short)5) == 0) {
                  com.aspose.slides.internal.f3c.z8 var5 = new com.aspose.slides.internal.f3c.z8();
                  var5.n5(var4);
                  boolean var6 = (var5.k5() & 128) != 0 || (var5.k5() & 64) != 0;
                  if (!var6) {
                     return false;
                  }
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               ((IDisposable)var3).dispose();
            }
         }

         com.aspose.slides.internal.f3c.x8 var17 = new com.aspose.slides.internal.f3c.x8();
         var17.n5().n5().n5(this.s7());
         boolean var18 = var17.n5(var1);
         if (!var18) {
            return false;
         }
      }

      com.aspose.slides.internal.o8m.a6 var16 = i9.n5(var1);

      try {
         if (!this.l6(var16)) {
            return false;
         }
      } finally {
         if (var16 != null) {
            var16.dispose();
         }
      }

      return true;
   }

   public final void t2() {
      this.t9();
      com.aspose.slides.internal.o8m.a6 var1 = this.k5();
      if (var1 == null) {
         throw new CryptographicException("Signing key is not loaded.");
      }

      if (this.a6().u3() == null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.o8m.z3.class)) {
            this.a6().n5("http://www.w3.org/2000/09/xmldsig#dsa-sha1");
         } else {
            if (!com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.o8m.z6.class)) {
               throw new CryptographicException("Failed to create signing key.");
            }

            if (this.a6().u3() == null) {
               this.a6().n5("http://www.w3.org/2000/09/xmldsig#rsa-sha1");
            }
         }
      }

      b5 var2 = com.aspose.slides.internal.j2p.z3.n5(b5.class, this.a6().u3());
      if (var2 == null) {
         throw new CryptographicException("SignatureDescription could not be created for the signature algorithm supplied.");
      }

      com.aspose.slides.internal.o8m.f2 var3 = var2.a6();
      if (var3 == null) {
         throw new CryptographicException("Could not create hash algorithm object.");
      }

      byte[] var4 = this.n5(var3);
      com.aspose.slides.internal.o8m.t2 var5 = var2.l6(var1);
      this.n5.n5(var5.n5(var3));
   }

   private com.aspose.slides.internal.f3c.c8 s7() {
      com.aspose.slides.internal.f3c.c8 var1 = new com.aspose.slides.internal.f3c.c8();
      if (this.h0() != null) {
         IEnumerator var2 = this.h0().iterator();

         try {
            while (var2.hasNext()) {
               b3 var3 = (b3)var2.next();
               t1 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, t1.class);
               if (var4 != null) {
                  var1.n5(i9.n5(var4, 0));
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               ((IDisposable)var2).dispose();
            }
         }
      }

      return var1;
   }

   public m8 n5(XmlDocument var1, String var2) {
      return l6(var1, var2);
   }

   public static m8 l6(XmlDocument var0, String var1) {
      if (var0 == null) {
         return null;
      }

      try {
         f4.k5(var1);
      } catch (XmlException var6) {
         return null;
      }

      m8 var2 = var0.getElementById(var1);
      if (var2 != null) {
         XmlDocument var3 = (XmlDocument)var0.cloneNode(true);
         m8 var4 = var3.getElementById(var1);
         com.aspose.slides.internal.f8y.n5.n5(var4 != null);
         if (var4 != null) {
            var4.getAttributes().n5();
            m8 var5 = var3.getElementById(var1);
            if (var5 != null) {
               throw new CryptographicException("Malformed reference element.");
            }
         }

         return var2;
      } else {
         var2 = n5(var0, "Id", var1);
         if (var2 != null) {
            return var2;
         }

         var2 = n5(var0, "id", var1);
         return var2 != null ? var2 : n5(var0, "ID", var1);
      }
   }

   private static boolean l6(s0 var0) {
      return var0.x8() ? false : var0.n3();
   }

   private boolean x8() {
      if (this.a6().a6() == null) {
         return false;
      }

      com.aspose.slides.internal.o8m.y2 var1 = com.aspose.slides.internal.j2p.z3.n5(com.aspose.slides.internal.o8m.y2.class, this.u9());
      if (var1 == null) {
         return false;
      }

      int var2 = 0;
      int[] var3 = new int[]{0};
      boolean var4 = !com.aspose.slides.ms.System.a3.n5(this.a6().a6(), var3);
      var2 = var3[0];
      return var4 ? true : var2 != var1.y4();
   }

   private boolean n3() {
      IGenericEnumerator var1 = this.l6().iterator();

      try {
         while (var1.hasNext()) {
            String var2 = (String)var1.next();
            if (com.aspose.slides.ms.System.d1.u3(var2, this.a6().l6(), (short)5)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return false;
   }

   private boolean l6(e9 var1) {
      j4 var2 = var1.a6();
      int var3 = var2.n5();

      for (int var4 = 0; var4 < var3; var4++) {
         g7 var5 = var2.n5(var4);
         if (!this.n5(var5.u3())) {
            return false;
         }
      }

      return true;
   }

   private boolean n5(String var1) {
      IGenericEnumerator var2 = this.l6().iterator();

      try {
         while (var2.hasNext()) {
            String var3 = (String)var2.next();
            if (com.aspose.slides.ms.System.d1.u3(var3, var1, (short)5)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var13 = e2().iterator();

      try {
         while (var13.hasNext()) {
            String var4 = (String)var13.next();
            if (com.aspose.slides.ms.System.d1.u3(var4, var1, (short)5)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }

      return false;
   }

   private static IGenericList<String> y4() {
      if (e2 == null) {
         List var0 = new List();
         var0.addItem("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
         var0.addItem("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
         var0.addItem("http://www.w3.org/2001/10/xml-exc-c14n#");
         var0.addItem("http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
         e2 = var0;
      }

      return e2;
   }

   private static IGenericList<String> e2() {
      if (t9 == null) {
         List var0 = new List();
         var0.addItem("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
         var0.addItem("http://www.w3.org/2000/09/xmldsig#base64");
         var0.addItem("urn:mpeg:mpeg21:2003:01-REL-R-NS:licenseTransform");
         var0.addItem("http://www.w3.org/2002/07/decrypt#XML");
         t9 = var0;
      }

      return t9;
   }

   private byte[] n5(com.aspose.slides.internal.o8m.f2 var1) {
      boolean var2 = com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.o8m.b3.class);
      if (var2 || !this.t4 || !this.a6().h0()) {
         String var3 = this.a6 == null ? null : this.a6.getBaseURI();
         o8 var4 = this.x8 ? this.l6 : new k1();
         XmlDocument var5 = i9.n5(this.a6().c8(), var4, var3);
         x8 var6 = this.k5 == null ? null : i9.n5(this.k5);
         i9.n5(var5.getDocumentElement(), var6);
         g7 var7 = this.a6().k5();
         var7.n5(var4);
         var7.n5(var3);
         var7.n5((Object)var5);
         this.q0 = var7.n5(var1);
         this.t4 = !var2;
      }

      return this.q0;
   }

   private int n5(int var1, ArrayList var2) {
      if (this.t2[var1]) {
         return this.s7[var1];
      }

      this.t2[var1] = true;
      e9 var3 = (e9)var2.get_Item(var1);
      if (var3.l6() != null && var3.l6().length() != 0 && (var3.l6().length() <= 0 || var3.l6().charAt(0) == '#')) {
         if (var3.l6().length() > 0 && var3.l6().charAt(0) == '#') {
            String var4 = i9.l6(var3.l6());
            if ("xpointer(/)".equals(var4)) {
               this.s7[var1] = 0;
               return 0;
            }

            for (int var5 = 0; var5 < var2.size(); var5++) {
               if (com.aspose.slides.ms.System.d1.a6(((e9)var2.get_Item(var5)).n5(), var4)) {
                  this.s7[var1] = this.n5(var5, var2) + 1;
                  return this.s7[var1];
               }
            }

            this.s7[var1] = 0;
            return 0;
         } else {
            throw new CryptographicException("Malformed reference element.");
         }
      } else {
         this.s7[var1] = 0;
         return 0;
      }
   }

   private void t9() {
      ArrayList var1 = this.a6().u9();
      this.t2 = new boolean[var1.size()];
      this.s7 = new int[var1.size()];
      s0$n5 var2 = new s0$n5();
      var2.n5(var1);
      ArrayList var3 = new ArrayList();
      IEnumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            e9 var5 = (e9)var4.next();
            var3.addItem(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            ((IDisposable)var4).dispose();
         }
      }

      var3.sort(var2);
      x8 var22 = new x8();
      IEnumerator var6 = this.n5.a6().iterator();

      try {
         while (var6.hasNext()) {
            z8 var7 = (z8)var6.next();
            var22.addItem(var7.n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            ((IDisposable)var6).dispose();
         }
      }

      IEnumerator var23 = var3.iterator();

      try {
         while (var23.hasNext()) {
            e9 var8 = (e9)var23.next();
            if (var8.k5() == null) {
               var8.k5("http://www.w3.org/2000/09/xmldsig#sha1");
            }

            var8.n5(this.a6, var22);
            if (var8.n5() != null) {
               var22.addItem(var8.t2());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
            ((IDisposable)var23).dispose();
         }
      }
   }

   private boolean z1() {
      ArrayList var1 = this.n5.l6().u9();

      for (int var2 = 0; var2 < var1.size(); var2++) {
         e9 var3 = (e9)var1.get_Item(var2);
         if (!this.l6(var3)) {
            return false;
         }

         byte[] var4 = null;

         try {
            var4 = var3.l6(this.a6, this.n5.u9());
         } catch (m1 var6) {
            return false;
         }

         if (!n5(var4, var3.u3())) {
            return false;
         }
      }

      return true;
   }

   private static boolean n5(byte[] var0, byte[] var1) {
      com.aspose.slides.internal.f8y.n5.n5(var0 != null);
      com.aspose.slides.internal.f8y.n5.n5(var1 != null);
      int var2 = 0;
      if (var0.length != var1.length) {
         return false;
      }

      int var3 = var0.length;

      for (int var4 = 0; var4 < var3; var4++) {
         var2 |= (var0[var4] & 255) - (var1[var4] & 255);
      }

      return 0 == var2;
   }

   private boolean t4() {
      return this.n3 == null ? true : this.n3.n5(this);
   }

   private boolean k5(com.aspose.slides.internal.o8m.a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("key");
      }

      b5 var2 = com.aspose.slides.internal.j2p.z3.n5(b5.class, this.u9());
      if (var2 == null) {
         throw new CryptographicException("SignatureDescription could not be created for the signature algorithm supplied.");
      }

      com.aspose.slides.ms.System.y8 var3 = com.aspose.slides.ms.System.y8.k5(var2.u3());
      if (!n5(var1, var3)) {
         return false;
      }

      com.aspose.slides.internal.o8m.f2 var4 = var2.a6();
      if (var4 == null) {
         throw new CryptographicException("Could not create hash algorithm object.");
      }

      byte[] var5 = this.n5(var4);
      com.aspose.slides.internal.o8m.c8 var6 = var2.n5(var1);
      return var6.n5(var5, this.n5.k5());
   }

   private static m8 n5(XmlDocument var0, String var1, String var2) {
      String var3 = com.aspose.slides.ms.System.d1.n5("//*[@", var1, "=\"", var2, "\"]");
      i0 var4 = var0.selectNodes(var3);
      if (var4 != null && var4.n5() != 0) {
         if (var4.n5() == 1) {
            return com.aspose.slides.internal.v6g.k5.n5(var4.k5(0), m8.class);
         } else {
            throw new CryptographicException("Malformed reference element.");
         }
      } else {
         return null;
      }
   }

   private static boolean n5(com.aspose.slides.internal.o8m.a6 var0, com.aspose.slides.ms.System.y8 var1) {
      com.aspose.slides.ms.System.y8 var2 = com.aspose.slides.ms.System.j8.n5(var0);
      if (var2 == var1) {
         return true;
      }

      if (var1.n5(var2)) {
         return true;
      }

      while (var1 != null && var1.n5() != com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o8m.a6.class)) {
         var1 = var1.n5();
      }

      return var1 == null ? false : var2.n5(var1);
   }

   // $VF: synthetic method
   static boolean n5(s0 var0) {
      return l6(var0);
   }

   // $VF: synthetic method
   static int n5(s0 var0, int var1, ArrayList var2) {
      return var0.n5(var1, var2);
   }
}
