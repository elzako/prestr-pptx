package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class a7z extends b3 {
   private String n5;
   private a2i l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("office:version", "meta");

   public a7z(com.aspose.slides.ms.System.Xml.c7 var1) {
      a7z$1 var2 = new a7z$1(this);
      n5(var1, var2);
      n5(var1, new a7z$2(this, var1));
   }

   public a7z() {
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

      if (this.n5 != null) {
         var2.l6("office:version", this.n5);
      }

      if (this.l6 != null) {
         this.l6.n5("office", var2, "meta");
      }

      var2.s7();
   }

   public final a2i n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <meta> element can be added.");
      }

      this.l6 = new a2i();
      return this.l6;
   }

   public final a2i l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(a7z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static a2i n5(a7z var0, a2i var1) {
      return var0.l6 = var1;
   }
}
