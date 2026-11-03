package com.aspose.slides.internal.k4y;

public class x5n extends b3 {
   private int l6;
   private String k5;
   public static final int n5 = g3g.n5("short");
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("number:style", "number:calendar");

   public x5n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x5n$1 var2 = new x5n$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x5n() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("number:style", g3g.n5(this.l6));
      }

      if (this.k5 != null) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0") == null) {
            var2.u3("xmlns", "odfnum", null, "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0");
         }

         var2.l6("number:calendar", this.k5);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(x5n var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(x5n var0, String var1) {
      return var0.k5 = var1;
   }
}
