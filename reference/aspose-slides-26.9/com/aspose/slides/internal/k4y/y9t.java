package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class y9t extends b3 {
   private String n5;
   private d1w l6;
   private m8y k5;
   private e1u u3;
   private r1l a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "office:version", "scripts", "font-face-decls", "automatic-styles", "body"
   );

   public y9t(com.aspose.slides.ms.System.Xml.c7 var1) {
      y9t$1 var2 = new y9t$1(this);
      n5(var1, var2);
      n5(var1, new y9t$2(this, var1));
   }

   public y9t() {
      this.a6 = new r1l();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("office", var3, "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
      var2.u3("xmlns", "ooo", null, "http://openoffice.org/2004/office");
      var2.u3("xmlns", "officeooo", null, "http://openoffice.org/2009/office");
      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:script:1.0") == null) {
         var2.u3("xmlns", "script", null, "urn:oasis:names:tc:opendocument:xmlns:script:1.0");
      }

      if (var2.n5("http://www.w3.org/1999/xlink") == null) {
         var2.u3("xmlns", "xlink", null, "http://www.w3.org/1999/xlink");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:presentation:1.0") == null) {
         var2.u3("xmlns", "presentation", null, "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:style:1.0") == null) {
         var2.u3("xmlns", "style", null, "urn:oasis:names:tc:opendocument:xmlns:style:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0") == null) {
         var2.u3("xmlns", "svg", null, "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:chart:1.0") == null) {
         var2.u3("xmlns", "chart", null, "urn:oasis:names:tc:opendocument:xmlns:chart:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
         var2.u3("xmlns", "text", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
      }

      if (var2.n5("urn:org:documentfoundation:names:experimental:office:xmlns:loext:1.0") == null) {
         var2.u3("xmlns", "loext", null, "urn:org:documentfoundation:names:experimental:office:xmlns:loext:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:drawing:1.0") == null) {
         var2.u3("xmlns", "draw", null, "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0") == null) {
         var2.u3("xmlns", "fo", null, "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0") == null) {
         var2.u3("xmlns", "dr3d", null, "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:table:1.0") == null) {
         var2.u3("xmlns", "table", null, "urn:oasis:names:tc:opendocument:xmlns:table:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0") == null) {
         var2.u3("xmlns", "smil", null, "urn:oasis:names:tc:opendocument:xmlns:smil-compatible:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0") == null) {
         var2.u3("xmlns", "number", null, "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:form:1.0") == null) {
         var2.u3("xmlns", "form", null, "urn:oasis:names:tc:opendocument:xmlns:form:1.0");
      }

      if (var2.n5("http://www.w3.org/2002/xforms") == null) {
         var2.u3("xmlns", "xforms", null, "http://www.w3.org/2002/xforms");
      }

      if (var2.n5("http://purl.org/dc/elements/1.1/") == null) {
         var2.u3("xmlns", "dc", null, "http://purl.org/dc/elements/1.1/");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:meta:1.0") == null) {
         var2.u3("xmlns", "meta", null, "urn:oasis:names:tc:opendocument:xmlns:meta:1.0");
      }

      if (var2.n5("http://openoffice.org/2010/draw") == null) {
         var2.u3("xmlns", "drawooo", null, "http://openoffice.org/2010/draw");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:config:1.0") == null) {
         var2.u3("xmlns", "config", null, "urn:oasis:names:tc:opendocument:xmlns:config:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:animation:1.0") == null) {
         var2.u3("xmlns", "anim", null, "urn:oasis:names:tc:opendocument:xmlns:animation:1.0");
      }

      if (this.n5 != null) {
         var2.l6("office:version", this.n5);
      }

      if (this.l6 != null) {
         this.l6.n5("office", var2, "scripts");
      }

      if (this.k5 != null) {
         this.k5.n5("office", var2, "font-face-decls");
      }

      if (this.u3 != null) {
         this.u3.n5("office", var2, "automatic-styles");
      }

      this.a6.n5("office", var2, "body");
      var2.s7();
   }

   public final e1u n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <automatic_styles> element can be added.");
      }

      this.u3 = new e1u();
      return this.u3;
   }

   public final e1u l6() {
      return this.u3;
   }

   public final r1l k5() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(y9t var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static d1w n5(y9t var0, d1w var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static m8y n5(y9t var0, m8y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static e1u n5(y9t var0, e1u var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static r1l n5(y9t var0, r1l var1) {
      return var0.a6 = var1;
   }
}
