package com.aspose.slides.internal.k4y;

public class e8s extends b3 {
   private boolean l6;
   private boolean k5;
   private int u3;
   private String a6;
   public static final int n5 = g3g.n5("short");
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "number:textual", "number:possessive-form", "number:style", "number:calendar"
   );

   public e8s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e8s$1 var2 = new e8s$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public e8s() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = false;
      this.u3 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:textual", this.l6 ? "true" : "false");
      }

      if (this.k5) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:possessive-form", this.k5 ? "true" : "false");
      }

      if (this.u3 != n5) {
         var2.l6("number:style", g3g.n5(this.u3));
      }

      if (this.a6 != null) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0") == null) {
            var2.u3("xmlns", "odfnum", null, "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0");
         }

         var2.l6("number:calendar", this.a6);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static boolean n5(e8s var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(e8s var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(e8s var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(e8s var0, String var1) {
      return var0.a6 = var1;
   }
}
