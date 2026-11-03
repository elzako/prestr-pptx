package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class o3q extends b3 {
   private String n5;
   private double l6;
   private int k5;
   private int u3;
   private boolean a6;
   private List<a9a> u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "number:decimal-replacement", "number:display-factor", "number:decimal-places", "number:min-integer-digits", "number:grouping", "embedded-text"
   );

   public o3q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      o3q$1 var2 = new o3q$1(this);
      n5(var1, var2);
      n5(var1, new o3q$2(this, var1));
   }

   public o3q() {
      this.l6();
   }

   private void l6() {
      this.l6 = 1.0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = false;
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         if (var2.n5("http://www.w3.org/2001/XMLSchema") == null) {
            var2.u3("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
         }

         var2.l6("number:decimal-replacement", this.n5);
      }

      if (this.l6 != 1.0) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:display-factor", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (this.k5 != 0) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:decimal-places", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
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

      List$Enumerator var4 = this.u9.iterator();

      try {
         while (var4.hasNext()) {
            a9a var5 = (a9a)var4.next();
            var5.n5("number", var2, "embedded-text");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(o3q var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double n5(o3q var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(o3q var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(o3q var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(o3q var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static List n5(o3q var0) {
      return var0.u9;
   }
}
