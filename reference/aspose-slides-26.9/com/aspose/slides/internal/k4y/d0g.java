package com.aspose.slides.internal.k4y;

public class d0g extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private boolean a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "number:min-numerator-digits", "number:min-denominator-digits", "number:denominator-value", "number:min-integer-digits", "number:grouping"
   );

   public d0g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d0g$1 var2 = new d0g$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public d0g() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:min-numerator-digits", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      if (this.l6 != 0) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:min-denominator-digits", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (this.k5 != 0) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:denominator-value", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      if (this.u3 != 0) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:min-integer-digits", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      if (this.a6) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:grouping", this.a6 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static int n5(d0g var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(d0g var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(d0g var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int u3(d0g var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d0g var0, boolean var1) {
      return var0.a6 = var1;
   }
}
