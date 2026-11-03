package com.aspose.slides.internal.k4y;

public class q7u extends b3 {
   private String n5;
   private String l6;
   private a2i k5;
   private v3c u3;
   private d1w a6;
   private m8y u9;
   private y1m h0;
   private e1u c8;
   private o5r t2;
   private r1l s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "office:mimetype", "office:version", "meta", "settings", "scripts", "font-face-decls", "styles", "automatic-styles", "master-styles", "body"
   );

   public q7u(com.aspose.slides.ms.System.Xml.c7 var1) {
      q7u$1 var2 = new q7u$1(this);
      n5(var1, var2);
      n5(var1, new q7u$2(this, var1));
   }

   public q7u() {
      this.s7 = new r1l();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("office", var3, "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
      var2.u3("xmlns", "ooo", null, "http://openoffice.org/2004/office");
      var2.u3("xmlns", "officeooo", null, "http://openoffice.org/2009/office");
      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:meta:1.0") == null) {
         var2.u3("xmlns", "meta", null, "urn:oasis:names:tc:opendocument:xmlns:meta:1.0");
      }

      if (var2.n5("http://purl.org/dc/elements/1.1/") == null) {
         var2.u3("xmlns", "dc", null, "http://purl.org/dc/elements/1.1/");
      }

      if (var2.n5("http://www.w3.org/1999/xlink") == null) {
         var2.u3("xmlns", "xlink", null, "http://www.w3.org/1999/xlink");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
         var2.u3("xmlns", "text", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:config:1.0") == null) {
         var2.u3("xmlns", "config", null, "urn:oasis:names:tc:opendocument:xmlns:config:1.0");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:script:1.0") == null) {
         var2.u3("xmlns", "script", null, "urn:oasis:names:tc:opendocument:xmlns:script:1.0");
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

      if (var2.n5("http://openoffice.org/2010/draw") == null) {
         var2.u3("xmlns", "drawooo", null, "http://openoffice.org/2010/draw");
      }

      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:animation:1.0") == null) {
         var2.u3("xmlns", "anim", null, "urn:oasis:names:tc:opendocument:xmlns:animation:1.0");
      }

      var2.l6("office:mimetype", this.n5);
      if (this.l6 != null) {
         var2.l6("office:version", this.l6);
      }

      if (this.k5 != null) {
         this.k5.n5("office", var2, "meta");
      }

      if (this.u3 != null) {
         this.u3.n5("office", var2, "settings");
      }

      if (this.a6 != null) {
         this.a6.n5("office", var2, "scripts");
      }

      if (this.u9 != null) {
         this.u9.n5("office", var2, "font-face-decls");
      }

      if (this.h0 != null) {
         this.h0.n5("office", var2, "styles");
      }

      if (this.c8 != null) {
         this.c8.n5("office", var2, "automatic-styles");
      }

      if (this.t2 != null) {
         this.t2.n5("office", var2, "master-styles");
      }

      this.s7.n5("office", var2, "body");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return x8;
   }

   // $VF: synthetic method
   static String n5(q7u var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(q7u var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static a2i n5(q7u var0, a2i var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static v3c n5(q7u var0, v3c var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static d1w n5(q7u var0, d1w var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static m8y n5(q7u var0, m8y var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static y1m n5(q7u var0, y1m var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static e1u n5(q7u var0, e1u var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static o5r n5(q7u var0, o5r var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static r1l n5(q7u var0, r1l var1) {
      return var0.s7 = var1;
   }
}
