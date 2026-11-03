package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

class c4h {
   private OdpSerializationContext n5;
   private boolean l6 = false;
   private o7g k5;
   private IGenericList<com.aspose.slides.internal.k4y.p4e> u3;

   public final void n5(IPresentation var1, com.aspose.slides.internal.e5a.d2 var2, boolean var3, InterruptionToken var4) {
      if (this.l6) {
         throw new InvalidOperationException("OdpSerializator instance can call WritePresentationToZipFile() method only once.");
      }

      this.l6 = true;
      com.aspose.slides.internal.c8m.s9 var5 = new com.aspose.slides.internal.c8m.s9();
      this.n5 = new OdpSerializationContext(var1, var4);
      this.u3 = new List<>();
      if (var1.getProtectionManager().isEncrypted()) {
         this.k5 = new o7g(var1.getProtectionManager().getEncryptionPassword());
      }

      this.n5(var5, var1);
      this.l6(var5, var1);
      this.k5(var5, var1);
      this.u3(var5, var1);
      this.a6(var5, var1);
      this.u9(var5, var1);
      this.n5(var5, var3);
      this.n5(var5, var1, var3);
      var5.n5(var2);
   }

   public final void n5(IPresentation var1, com.aspose.slides.internal.z0k.t4 var2, InterruptionToken var3) {
      if (this.l6) {
         throw new InvalidOperationException("OdpSerializator instance can call WritePresentationToFlatXml() method only once.");
      }

      this.l6 = true;
      com.aspose.slides.internal.c8m.s9 var4 = new com.aspose.slides.internal.c8m.s9();
      this.n5 = new OdpSerializationContext(var1, var3);
      this.n5.n5(true);
      this.u3 = new List<>();
      this.n5(var4, var1);
      this.l6(var4, var1);
      this.k5(var4, var1);
      var4.n5(var2);
   }

   private void n5(com.aspose.slides.internal.c8m.s9 var1, boolean var2) {
      String var3 = var2 ? "application/vnd.oasis.opendocument.presentation-template" : "application/vnd.oasis.opendocument.presentation";
      var1.n5("/mimetype", var3, com.aspose.slides.internal.l7h.j5.e2().u3(var3));
   }

   private void n5(com.aspose.slides.internal.c8m.s9 var1, IPresentation var2, boolean var3) {
      com.aspose.slides.internal.c8m.z5 var4 = var1.n5("/META-INF/manifest.xml", "text/xml");
      z6l var5 = new z6l(var4, this.n5, this.u3);
      var5.n5((Presentation)var2, var3);
   }

   private void n5(com.aspose.slides.internal.c8m.s9 var1, IPresentation var2) {
      String var3 = com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{"meta.xml"});
      com.aspose.slides.internal.c8m.z5 var4 = var1.n5(var3, "text/xml");
      x6e var5 = new x6e(var4, this.n5);
      var5.l6(var2.getDocumentProperties());
      this.n5(var4, var2);
   }

   private void l6(com.aspose.slides.internal.c8m.s9 var1, IPresentation var2) {
      String var3 = com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{"settings.xml"});
      com.aspose.slides.internal.c8m.z5 var4 = var1.n5(var3, "text/xml");
      s9g var5 = new s9g(var4, this.n5);
      var5.l6((Presentation)var2);
      this.n5(var4, var2);
   }

   private void k5(com.aspose.slides.internal.c8m.s9 var1, IPresentation var2) {
      String var3 = com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{"styles.xml"});
      com.aspose.slides.internal.c8m.z5 var4 = var1.n5(var3, "text/xml");
      j3t var5 = new j3t(var4, this.n5);
      String var6 = com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{"content.xml"});
      com.aspose.slides.internal.c8m.z5 var7 = var1.n5(var6, "text/xml");
      b8u var8 = new b8u(var7, this.n5);
      var5.n5((Presentation)var2, var8);
      this.n5(var4, var2);
      this.n5(var7, var2);
   }

   private void u3(com.aspose.slides.internal.c8m.s9 var1, IPresentation var2) {
      IGenericEnumerator var3 = this.n5.k5().iterator();

      try {
         while (var3.hasNext()) {
            OdpSerializationContext$ImageData var4 = (OdpSerializationContext$ImageData)var3.next();
            this.n5.t2().throwIfInterruptionRequested();
            String var5 = OdpSerializationContext.n5(var4.Index, var4.ContentType);
            com.aspose.slides.internal.c8m.z5 var6 = var1.n5(com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{var5}), var4.ContentType);
            var6.n5(var4.BinaryData != null ? var4.BinaryData : var4.GetBinaryData.invoke());
            this.n5(var6, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IGenericEnumerator var17 = this.n5.u3().iterator();

      try {
         while (var17.hasNext()) {
            KeyValuePair var18 = (KeyValuePair)var17.next();
            this.n5.t2().throwIfInterruptionRequested();
            IPPImage var19 = (IPPImage)var18.getValue();
            String var7 = OdpSerializationContext.n5((Integer)var18.getKey());
            com.aspose.slides.internal.c8m.z5 var8 = var1.n5(com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{var7}), var19.getContentType());
            var8.n5(var19.getBinaryData());
            com.aspose.slides.internal.k4y.p4e var9 = new com.aspose.slides.internal.k4y.p4e();
            var9.n5(var7);
            var9.l6(com.aspose.slides.ms.System.d1.n5);
            if (var2.getProtectionManager().isEncrypted()) {
               this.n5(var8, var9);
            }

            this.u3.addItem(var9);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var17, IDisposable.class)) {
            var17.dispose();
         }
      }
   }

   private void a6(com.aspose.slides.internal.c8m.s9 var1, IPresentation var2) {
      IGenericEnumerator var3 = this.n5.a6().iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            this.n5.t2().throwIfInterruptionRequested();
            String var5 = OdpSerializationContext.l6((Integer)var4.getValue());
            com.aspose.slides.internal.c8m.z5 var6 = var1.n5(
               com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{var5}), "application/vnd.sun.star.oleobject"
            );
            var6.n5((byte[])var4.getKey());
            this.n5(var6, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   private void u9(com.aspose.slides.internal.c8m.s9 var1, IPresentation var2) {
      IGenericEnumerator var3 = this.n5.u9().iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            this.n5.t2().throwIfInterruptionRequested();
            com.aspose.slides.internal.c8m.z5 var5 = var1.n5(
               com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{var4.getValue()}), "application/vnd.sun.star.media"
            );
            var5.n5(((IAudio)var4.getKey()).getBinaryData());
            this.n5(var5, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      IGenericEnumerator var14 = this.n5.h0().iterator();

      try {
         while (var14.hasNext()) {
            KeyValuePair var15 = (KeyValuePair)var14.next();
            this.n5.t2().throwIfInterruptionRequested();
            com.aspose.slides.internal.c8m.z5 var6 = var1.n5(
               com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{var15.getValue()}), "application/vnd.sun.star.media"
            );
            var6.n5(((IVideo)var15.getKey()).getBinaryData());
            this.n5(var6, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }
   }

   private void n5(com.aspose.slides.internal.c8m.z5 var1, IPresentation var2) {
      com.aspose.slides.internal.k4y.p4e var3 = new com.aspose.slides.internal.k4y.p4e();
      var3.n5(var1.k5());
      var3.l6(var1.y4());
      if (var2.getProtectionManager().isEncrypted()) {
         this.n5(var1, var3);
      }

      this.u3.addItem(var3);
   }

   private void n5(com.aspose.slides.internal.c8m.z5 var1, com.aspose.slides.internal.k4y.p4e var2) {
      var2.n5(var1.a6().length & 4294967295L);
      String var3 = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0#sha256-1k";
      String var4 = "http://www.w3.org/2000/09/xmldsig#sha256";
      com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

      byte[] var8;
      byte[] var9;
      byte[] var10;
      try {
         com.aspose.slides.internal.e5a.x8 var6 = new com.aspose.slides.internal.e5a.x8(var5, 0, true);

         try {
            var6.write(var1.a6(), 0, var1.a6().length);
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }

         var5.seek(0L, 0);
         var8 = this.k5.n5(var5, "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0#sha256-1k");
         var9 = this.k5.a6();
         var10 = this.k5.u9();
         this.k5.n5("http://www.w3.org/2000/09/xmldsig#sha256");
         var1.n5(this.k5.n5(var5, var9, var10));
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      com.aspose.slides.internal.k4y.n5h var18 = var2.n5();
      var18.n5("urn:oasis:names:tc:opendocument:xmlns:manifest:1.0#sha256-1k");
      var18.l6(com.aspose.slides.ms.System.z3.n5(var8));
      var18.u3().n5("http://www.w3.org/2001/04/xmlenc#aes256-cbc");
      var18.u3().l6(com.aspose.slides.ms.System.z3.n5(var10));
      var18.u9().n5("PBKDF2");
      var18.u9().l6(this.k5.l6() & 4294967295L);
      var18.u9().n5(this.k5.n5() & 4294967295L);
      var18.u9().l6(com.aspose.slides.ms.System.z3.n5(var9));
      com.aspose.slides.internal.k4y.x3v var7 = var18.n5();
      var7.n5("http://www.w3.org/2000/09/xmldsig#sha256");
      var7.n5(this.k5.u3() & 4294967295L);
      var1.l6(true);
   }
}
