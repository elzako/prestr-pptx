package com.aspose.slides.internal.z4;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;

public class z3 extends a0 {
   public z3(c8 var1) {
      super(var1);
   }

   public static String n5(String var0, String var1, String var2) {
      return !com.aspose.slides.internal.n2d.t4.l6(var2)
         ? d1.n5
         : d1.n5(new String[]{
            "<",
            var0,
            var1.length() == 0 ? d1.n5 : d1.n5(new String[]{" ", var1}),
            ">",
            d1.l6(var2, "<") ? "\n" : d1.n5,
            var2,
            d1.k5(var2, ">") ? "\n" : d1.n5,
            "</",
            var0,
            ">\n"
         });
   }

   public static String n5(String var0, String var1) {
      return n5(var0, d1.n5, var1);
   }

   public static String n5(String var0, com.aspose.slides.ms.System.j5 var1) {
      return com.aspose.slides.ms.System.j5.h0(var1, com.aspose.slides.ms.System.j5.l6) ? d1.n5 : n5(var0, d1.n5, d1.n5(new String[]{var1.n5("s"), "Z"}));
   }

   private static String a6(String var0) {
      return !com.aspose.slides.internal.n2d.t4.l6(var0) ? var0 : d1.n5(d1.n5(d1.n5(var0, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
   }

   @Override
   public void n5(t4 var1) {
      String var2 = d1.n5(
         "<?xpacket begin=\"{0}\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?>\n", new Object[]{com.aspose.slides.internal.l7h.j5.z3().l6(new byte[]{-17, -69, -65})}
      );
      String var3 = "<?xpacket end=\"w\"?>\n";
      com.aspose.slides.internal.b8.u9 var4 = this.l6.c8();
      String var5 = n5(
         "rdf:Description",
         "rdf:about=\"\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\"",
         d1.n5(new String[]{n5("xmp:CreateDate", var4.n3().m3()), n5("xmp:ModifyDate", var4.y4().m3()), n5("xmp:CreatorTool", a6(var4.a6()))})
      );
      String var6 = n5(
         "rdf:Description",
         "rdf:about=\"\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\"",
         d1.n5(new String[]{
            n5("dc:format", "application/pdf"),
            n5("dc:title", n5("rdf:Alt", n5("rdf:li", "xml:lang=\"x-default\"", a6(var4.l6())))),
            n5("dc:creator", n5("rdf:Seq", n5("rdf:li", a6(var4.k5())))),
            n5("dc:description", n5("rdf:Alt", n5("rdf:li", "xml:lang=\"x-default\"", a6(var4.u3()))))
         })
      );
      String var7 = n5(
         "rdf:Description",
         "rdf:about=\"\" xmlns:pdf=\"http://ns.adobe.com/pdf/1.3/\"",
         d1.n5(new String[]{n5("pdf:Keywords", a6(var4.u9())), n5("pdf:Producer", a6(var4.n5()))})
      );
      String var8 = d1.n5;
      if (this.l6.e2()) {
         var8 = n5(
            "rdf:Description",
            "rdf:about=\"\" xmlns:pdfaid=\"http://www.aiim.org/pdfa/ns/id/\"",
            d1.n5(new String[]{n5("pdfaid:part", l6(this.l6.l6().x8())), n5("pdfaid:conformance", n5(this.l6.l6().x8()))})
         );
      } else if (this.l6.l6().x8() == 9) {
         var8 = n5("rdf:Description", "rdf:about=\"\" xmlns:pdfuaid=\"http://www.aiim.org/pdfua/ns/id/\"", n5("pdfuaid:part", "1"));
      }

      String var9 = n5("rdf:RDF", "xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"", d1.n5(new String[]{var5, var6, var7, var8}));
      String var10 = d1.n5(new String[]{var2, n5("x:xmpmeta", "xmlns:x=\"adobe:ns:meta/\" x:xmptk=\"PDFNet\"", var9), "<?xpacket end=\"w\"?>\n"});
      byte[] var11 = com.aspose.slides.internal.l7h.j5.z3().u3(var10);
      this.n5(var11, 0, var11.length);
      super.n5(var1);
   }

   private static String n5(int var0) {
      switch (var0) {
         case 3:
         case 5:
         case 7:
            return "A";
         case 4:
         case 6:
         case 8:
            return "B";
         case 9:
         default:
            throw new ArgumentOutOfRangeException("compliance");
         case 10:
            return "U";
      }
   }

   private static String l6(int var0) {
      switch (var0) {
         case 3:
         case 4:
            return "1";
         case 5:
         case 6:
         case 10:
            return "2";
         case 7:
         case 8:
            return "3";
         case 9:
         default:
            throw new ArgumentOutOfRangeException("compliance");
      }
   }

   @Override
   public void l6(t4 var1) {
      var1.k5("/Type", "/Metadata");
      var1.k5("/Subtype", "/XML");
   }
}
