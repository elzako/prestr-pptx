package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.Xml.XmlDocument;

class q5x {
   private z5q n5;
   private o7g l6;
   private IGenericList<com.aspose.slides.internal.k4y.p4e> k5;

   public final void n5(Presentation var1, com.aspose.slides.internal.z0k.t4 var2, InterruptionToken var3, boolean var4) {
      com.aspose.slides.internal.c8m.s9 var5;
      if (var4) {
         var5 = n5(var2);
      } else {
         var5 = new com.aspose.slides.internal.c8m.s9(var2, new q5x$1(this, var3));
      }

      this.n5 = new z5q(var1, var3);
      var1.n5(2);
      if ("application/vnd.oasis.opendocument.presentation-template".equals(var5.y4())) {
         var1.n5 = 10;
      } else {
         var1.n5 = var4 ? 11 : 2;
      }

      var1.n3().n5(0);
      if (var1.a6().l6()) {
         this.l6 = new o7g(var1.a6().getPassword());
      }

      this.n5(var5, var1);
      this.l6(var5, var1);
      this.n5(var5, this.n5);
      this.l6(var5, this.n5);
      this.k5(var5, var1);
      this.u3(var5, var1);
      this.a6(var5, var1);
      this.n5(var1);
   }

   public static com.aspose.slides.internal.c8m.s9 n5(com.aspose.slides.internal.z0k.t4 var0) {
      com.aspose.slides.internal.c8m.s9 var1 = new com.aspose.slides.internal.c8m.s9();

      try {
         XmlDocument var2 = new XmlDocument();
         var2.setXmlResolver(null);
         var2.load(var0);
         com.aspose.slides.ms.System.Xml.i0 var3 = var2.getElementsByTagName("office:document");
         com.aspose.slides.ms.System.Xml.u8 var4 = var3.k5(0).getAttributes().n5("office:mimetype");
         var1.l6(var4 == null ? null : var4.getValue());
         if (var1.y4() != null && com.aspose.slides.ms.System.d1.a6("application/vnd.oasis.opendocument.presentation", var1.y4())) {
            XmlDocument var5 = new XmlDocument();
            var5.setXmlResolver(null);
            var3 = var2.getElementsByTagName("office:meta");
            if (var3.n5() > 0) {
               com.aspose.slides.ms.System.Xml.m8 var6 = var5.createElement("document-meta");
               var6.setInnerXml(var3.k5(0).getOuterXml());
               var1.n5(
                  com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{"meta.xml"}),
                  "text/xml",
                  com.aspose.slides.internal.l7h.j5.z3().u3(var6.getOuterXml())
               );
            }

            var3 = var2.getElementsByTagName("office:settings");
            if (var3.n5() > 0) {
               com.aspose.slides.ms.System.Xml.m8 var16 = var5.createElement("document-settings");
               var16.setInnerXml(var3.k5(0).getOuterXml());
               var1.n5(
                  com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{"settings.xml"}),
                  "text/xml",
                  com.aspose.slides.internal.l7h.j5.z3().u3(var16.getOuterXml())
               );
            }

            com.aspose.slides.ms.System.Xml.l0 var17 = null;
            var3 = var2.getElementsByTagName("office:styles");
            if (var3.n5() > 0) {
               com.aspose.slides.internal.l7h.a5 var7 = new com.aspose.slides.internal.l7h.a5(var3.k5(0).getOuterXml());
               var3 = var2.getElementsByTagName("office:automatic-styles");
               if (var3.n5() > 0) {
                  var17 = var3.k5(0);
                  var7.k5();
                  var7.n5(var3.k5(0).getOuterXml());
               }

               var3 = var2.getElementsByTagName("office:master-styles");
               if (var3.n5() > 0) {
                  var7.k5();
                  var7.n5(var3.k5(0).getOuterXml());
               }

               com.aspose.slides.ms.System.Xml.m8 var8 = var5.createElement("document-styles");
               var8.setInnerXml(var7.toString());
               var1.n5(
                  com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{"styles.xml"}),
                  "text/xml",
                  com.aspose.slides.internal.l7h.j5.z3().u3(var8.getOuterXml())
               );
            }

            var3 = var2.getElementsByTagName("office:body");
            if (var3.n5() > 0) {
               com.aspose.slides.ms.System.Xml.m8 var18 = var5.createElement("document-content");
               com.aspose.slides.internal.l7h.a5 var19 = new com.aspose.slides.internal.l7h.a5();
               if (var17 != null) {
                  var19.n5(var17.getOuterXml());
                  var19.k5();
               }

               var19.n5(var3.k5(0).getOuterXml());
               var18.setInnerXml(var19.toString());
               var1.n5(
                  com.aspose.slides.ms.System.d1.n5("/{0}", new Object[]{"content.xml"}),
                  "text/xml",
                  com.aspose.slides.internal.l7h.j5.z3().u3(var18.getOuterXml())
               );
            }

            return var1;
         } else {
            throw new PptxUnsupportedFormatException("Unknown file format.");
         }
      } catch (RuntimeException var9) {
         if (com.aspose.slides.internal.v6g.k5.l6(var9, PptxUnsupportedFormatException.class)) {
            throw var9;
         } else {
            throw new PptxReadException(var9.getMessage(), var9);
         }
      }
   }

   private void n5(com.aspose.slides.internal.c8m.s9 var1, Presentation var2) {
      if (var1.c8() != null) {
         this.k5 = new List<>();
         z6l var3 = new z6l(var1.c8(), this.n5, this.k5);
         var3.n5(var2);
      }
   }

   private void l6(com.aspose.slides.internal.c8m.s9 var1, Presentation var2) {
      if (var1.s7() != null) {
         if (var1.s7().e2()) {
            com.aspose.slides.internal.k4y.p4e var3 = this.n5(var1.s7().l6());
            this.n5(var1.s7(), var3);
         }

         x6e var4 = new x6e(var1.s7(), this.n5);
         var4.n5(var2.getDocumentProperties());
      }
   }

   private void k5(com.aspose.slides.internal.c8m.s9 var1, Presentation var2) {
      if (var1.x8() != null) {
         if (var1.x8().e2()) {
            com.aspose.slides.internal.k4y.p4e var3 = this.n5(var1.x8().l6());
            this.n5(var1.x8(), var3);
         }

         s9g var4 = new s9g(var1.x8(), this.n5);
         var4.n5(var2);
      }
   }

   private void u3(com.aspose.slides.internal.c8m.s9 var1, Presentation var2) {
      if (var1.n3() != null) {
         if (var1.n3().e2()) {
            com.aspose.slides.internal.k4y.p4e var3 = this.n5(var1.n3().l6());
            this.n5(var1.n3(), var3);
         }

         j3t var4 = new j3t(var1.n3(), this.n5);
         var4.n5(var2);
      }
   }

   private void a6(com.aspose.slides.internal.c8m.s9 var1, Presentation var2) {
      if (var1.t2() != null) {
         if (var1.t2().e2()) {
            com.aspose.slides.internal.k4y.p4e var3 = this.n5(var1.t2().l6());
            this.n5(var1.t2(), var3);
         }

         b8u var4 = new b8u(var1.t2(), this.n5);
         var4.n5(var2);
      }
   }

   private void n5(Presentation var1) {
      for (int var2 = 0; var2 < this.n5.h0().size(); var2++) {
         Hyperlink var3 = this.n5.h0().get_Item(var2);
         if (var3.h0() != null && var3.h0().length() > 0) {
            BaseSlide var4 = null;
            String[] var5 = com.aspose.slides.ms.System.d1.n5(var3.h0(), ' ');
            if (var5.length == 2) {
               String var6 = var5[1];
               int var7 = 0;
               int[] var8 = new int[]{0};
               boolean var9 = com.aspose.slides.ms.System.a3.n5(var6, var8) && var8[0] > 0;
               var7 = var8[0];
               if (var9 && var7 - 1 < var1.getSlides().size()) {
                  var4 = (BaseSlide & ISlide)var1.getSlides().get_Item(var7 - 1);
               }
            }

            if (var4 != null) {
               var3.u3().n5((ISlide)var4);
            } else if (com.aspose.slides.ms.System.d1.l6(var3.h0(), "#")) {
               var3.n5((String)null);
               var3.n5(true);
            }
         }
      }
   }

   static boolean l6(com.aspose.slides.internal.z0k.t4 var0) {
      int var1 = 0;
      int[] var2 = new int[]{0};
      boolean var3 = n5(var0, var2);
      var1 = var2[0];
      return var3;
   }

   static boolean n5(com.aspose.slides.internal.z0k.t4 var0, int[] var1) {
      com.aspose.slides.internal.z0k.t4 var2 = com.aspose.slides.internal.n8e.z3.n5(var0);
      var2.seek(0L, 0);

      try {
         com.aspose.slides.internal.e5a.d2 var3 = com.aspose.slides.internal.e5a.d2.n5(var2, true);
         if (var3.l6("mimetype") != null) {
            com.aspose.slides.internal.e5a.t2 var4 = var3.l6("mimetype").c4();

            try {
               byte[] var5 = new byte[(int)var4.getLength()];
               var4.read(var5, 0, (int)var4.getLength());
               String var6 = com.aspose.slides.internal.l7h.j5.u3(1252).l6(var5);
               if ("application/vnd.oasis.opendocument.presentation".equals(var6)) {
                  var1[0] = 5;
               } else {
                  if (!"application/vnd.oasis.opendocument.presentation-template".equals(var6)) {
                     throw new PptUnsupportedFormatException("Not a Open Office presentation");
                  }

                  var1[0] = 10;
               }

               return true;
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         } else {
            var1[0] = 255;
            return false;
         }
      } catch (com.aspose.slides.internal.e5a.a0 var17) {
         throw new PptUnsupportedFormatException("Unknown file format.", var17);
      } finally {
         ;
      }
   }

   static boolean k5(com.aspose.slides.internal.z0k.t4 var0) {
      try {
         XmlDocument var1 = new XmlDocument();
         var1.setXmlResolver(null);
         var0.seek(0L, 0);
         com.aspose.slides.internal.e5a.d2 var2 = com.aspose.slides.internal.e5a.d2.n5(var0);

         try {
            com.aspose.slides.internal.e5a.y2 var3 = var2.l6("META-INF/manifest.xml");
            if (var3 == null) {
               return false;
            }

            com.aspose.slides.internal.z0k.e2 var4 = new com.aspose.slides.internal.z0k.e2();

            try {
               var3.n5(var4);
               var4.seek(0L, 0);
               var1.load(var4);
            } finally {
               if (var4 != null) {
                  var4.dispose();
               }
            }
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }

         com.aspose.slides.ms.System.Xml.s2 var16 = new com.aspose.slides.ms.System.Xml.s2(var1.getNameTable());
         var16.n5("manifest", "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0");
         com.aspose.slides.ms.System.Xml.i0 var17 = var1.selectNodes(
            "/manifest:manifest/manifest:file-entry[@manifest:full-path=\"content.xml\"]/manifest:encryption-data", var16
         );
         return var17 != null && var17.n5() > 0;
      } catch (RuntimeException var15) {
         throw new OdpReadException(var15.getMessage(), var15);
      }
   }

   private void n5(com.aspose.slides.internal.c8m.s9 var1, z5q var2) {
      for (com.aspose.slides.internal.c8m.z5 var6 : var1.k5("/Pictures")) {
         var2.u3().throwIfInterruptionRequested();
         if (var6.e2()) {
            com.aspose.slides.internal.k4y.p4e var7 = this.n5(var6.l6());
            this.n5(var6, var7);
         }

         try {
            var2.n5(var6);
         } catch (ArgumentException var10) {
            var2.n5(com.aspose.slides.ms.System.d1.n5("Unexpected content: {0}", new Object[]{var6.l6()}), 99);
         }
      }

      if (var2.a6().size() == 0) {
         for (com.aspose.slides.internal.c8m.z5 var17 : var1.k5("/media")) {
            var2.u3().throwIfInterruptionRequested();
            if (var17.e2()) {
               com.aspose.slides.internal.k4y.p4e var19 = this.n5(var17.l6());
               this.n5(var17, var19);
            }

            try {
               var2.n5(var17);
            } catch (ArgumentException var9) {
               var2.n5(com.aspose.slides.ms.System.d1.n5("Unexpected content: {0}", new Object[]{var17.l6()}), 99);
            }
         }
      }

      for (com.aspose.slides.internal.c8m.z5 var18 : var1.k5("/ObjectReplacements")) {
         if (var18.e2()) {
            com.aspose.slides.internal.k4y.p4e var20 = this.n5(var18.l6());
            this.n5(var18, var20);
         }

         try {
            var2.n5(var18);
         } catch (ArgumentException var8) {
            var2.n5(com.aspose.slides.ms.System.d1.n5("Unexpected content: {0}", new Object[]{var18.l6()}), 99);
         }
      }
   }

   private void l6(com.aspose.slides.internal.c8m.s9 var1, z5q var2) {
      for (com.aspose.slides.internal.c8m.z5 var6 : var1.k5("/Object ")) {
         var2.u3().throwIfInterruptionRequested();
         if (var6.e2()) {
            com.aspose.slides.internal.k4y.p4e var7 = this.n5(var6.l6());
            this.n5(var6, var7);
         }

         var2.u9().addItem(var6);
      }

      for (com.aspose.slides.internal.c8m.z5 var11 : var1.k5("/Media")) {
         if (!var11.s7()) {
            var2.u3().throwIfInterruptionRequested();
            if (var11.e2()) {
               com.aspose.slides.internal.k4y.p4e var12 = this.n5(var11.l6());
               this.n5(var11, var12);
            }

            var2.u9().addItem(var11);
         }
      }
   }

   private com.aspose.slides.internal.k4y.p4e n5(String var1) {
      com.aspose.slides.internal.k4y.p4e var2 = null;
      var1 = com.aspose.slides.ms.System.d1.u3(var1,new char[]{ '/'});

      for (int var3 = 0; var3 < this.k5.size(); var3++) {
         var2 = this.k5.get_Item(var3);
         if (com.aspose.slides.ms.System.d1.a6(var2.l6(), var1)) {
            break;
         }
      }

      return var2;
   }

   private void n5(com.aspose.slides.internal.c8m.z5 var1, com.aspose.slides.internal.k4y.p4e var2) {
      if (this.l6 == null) {
         throw new OdpReadException("Some file content was encrypted, a password is required.");
      }

      this.n5(var2);
      com.aspose.slides.internal.k4y.n5h var3 = var2.u3();
      byte[] var4 = new byte[(int)var2.k5()];
      byte[] var5 = com.aspose.slides.ms.System.z3.s7(var3.u9().l6());
      byte[] var6 = com.aspose.slides.ms.System.z3.s7(var3.u3().l6());
      this.l6.n5(var3.a6().n5());
      this.l6.l6((int)var3.u9().u3());
      this.l6.n5((int)var3.u9().k5());
      com.aspose.slides.internal.z0k.t4 var7 = this.l6.n5(var1.a6(), var5, var6);

      try {
         this.n5(var7, var3.l6(), var3.k5(), var2.l6());
         com.aspose.slides.internal.e5a.x8 var8 = new com.aspose.slides.internal.e5a.x8(var7, 1, true);

         try {
            int var9 = var8.read(var4, 0, var4.length);
            if (var9 != var4.length) {
               String var10 = "Data length is not match for the package part {0}.";
               throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var10, new Object[]{var1.l6()}));
            }
         } finally {
            if (var8 != null) {
               var8.dispose();
            }
         }
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }

      var1.n5(var4);
      var1.l6(false);
   }

   private void n5(com.aspose.slides.internal.k4y.p4e var1) {
      com.aspose.slides.internal.k4y.n5h var2 = var1.u3();
      if (var2 == null || var2.u3() == null || var2.u9() == null || var2.a6() == null) {
         String var8 = "Encryption data is not found or not completed for decrypting the package part '{0}'.";
         throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var8, new Object[]{var1.l6()}));
      }

      if (!"http://www.w3.org/2001/04/xmlenc#aes256-cbc".equals(var2.u3().n5())) {
         String var7 = "Encryption algorithm '{0}' is not supported for decrypting the package part '{1}'.";
         throw new NotSupportedException(com.aspose.slides.ms.System.d1.n5(var7,new Object[]{ var2.u3().n5(), var1.l6()}));
      }

      if (com.aspose.slides.ms.System.d1.n5(var2.u3().l6())) {
         String var6 = "Initialisation vector is not specified for decrypting the package part '{0}'.";
         throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var6, new Object[]{var1.l6()}));
      }

      if (com.aspose.slides.ms.System.d1.n5(var2.a6().n5())) {
         String var5 = "Start key generation name is not specified for decrypting the package part '{0}'.";
         throw new NotSupportedException(com.aspose.slides.ms.System.d1.n5(var5, new Object[]{var1.l6()}));
      }

      if (!"PBKDF2".equals(var2.u9().n5())) {
         String var4 = "Key derivation name '{0}' is not supported for decrypting the package part '{1}'.";
         throw new NotSupportedException(com.aspose.slides.ms.System.d1.n5(var4,new Object[]{ var2.u9().n5(), var1.l6()}));
      }

      if (com.aspose.slides.ms.System.d1.n5(var2.u9().l6())) {
         String var3 = "Salt is not specified for decrypting the package part '{0}'.";
         throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var3, new Object[]{var1.l6()}));
      }
   }

   private void n5(com.aspose.slides.internal.z0k.t4 var1, String var2, String var3, String var4) {
      if (com.aspose.slides.ms.System.d1.n5(var2)) {
         String var8 = "A checksum type is not specified for decrypting the package part '{0}'.";
         throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var8, new Object[]{var4}));
      }

      if (com.aspose.slides.ms.System.d1.n5(var3)) {
         String var7 = "Checksum is not specified for decrypting the package part '{0}'.";
         throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var7, new Object[]{var4}));
      }

      if (var4 == null) {
         throw new ArgumentNullException("fileName");
      }

      if (com.aspose.slides.ms.System.d1.a6(var4, com.aspose.slides.ms.System.d1.n5)) {
         throw new ArgumentException("A file name of a package part is not specified.", "fileName");
      }

      byte[] var5 = this.l6.n5(var1, var2);
      if (!com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.z3.n5(var5), var3)) {
         String var6 = "Data checksum is not match for the package part {0}.";
         throw new InvalidDataException(com.aspose.slides.ms.System.d1.n5(var6, new Object[]{var4}));
      }
   }
}
