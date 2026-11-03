package com.aspose.slides.internal.k4y;

public class d8b extends b3 {
   private String n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("number:calendar");

   public d8b(com.aspose.slides.ms.System.Xml.c7 var1) {
      d8b$1 var2 = new d8b$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public d8b() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0") == null) {
            var2.u3("xmlns", "odfnum", null, "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0");
         }

         var2.l6("number:calendar", this.n5);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static String n5(d8b var0, String var1) {
      return var0.n5 = var1;
   }
}
