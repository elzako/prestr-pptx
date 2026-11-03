package com.aspose.slides.internal.k4y;

public class f1n extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private boolean u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "number:min-exponent-digits", "number:decimal-places", "number:min-integer-digits", "number:grouping"
   );

   public f1n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f1n$1 var2 = new f1n$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f1n() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:min-exponent-digits", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      if (this.l6 != 0) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:decimal-places", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (this.k5 != 0) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:min-integer-digits", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      if (this.u3) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:grouping", this.u3 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(f1n var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(f1n var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(f1n var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(f1n var0, boolean var1) {
      return var0.u3 = var1;
   }
}
