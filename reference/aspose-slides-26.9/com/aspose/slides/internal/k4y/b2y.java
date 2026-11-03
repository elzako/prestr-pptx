package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class b2y extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private byte u9;
   private String h0;
   private String c8;
   private String t2;
   private int s7;
   private boolean x8;
   private j9d n3;
   private List<g7> y4;
   private List<j3t> e2;
   public static final int n5 = o2o.n5("short");
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9(
      "style:name",
      "number:language",
      "number:country",
      "number:title",
      "style:volatile",
      "number:transliteration-format",
      "number:transliteration-language",
      "number:transliteration-country",
      "number:transliteration-style",
      "number:automatic-order",
      "text-properties",
      "text",
      "number",
      "currency-symbol",
      "map"
   );

   public b2y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      b2y$1 var2 = new b2y$1(this);
      n5(var1, var2);
      n5(var1, new b2y$2(this, var1));
   }

   public b2y() {
      this.l6();
   }

   private void l6() {
      this.u9 = -1;
      this.h0 = "1";
      this.s7 = n5;
      this.x8 = false;
      this.y4 = new List<>();
      this.e2 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:name", this.l6);
      if (this.k5 != null) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:language", this.k5);
      }

      if (this.u3 != null) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:country", this.u3);
      }

      if (this.a6 != null) {
         if (var2.n5("http://www.w3.org/2001/XMLSchema") == null) {
            var2.u3("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
         }

         var2.l6("number:title", this.a6);
      }

      if (this.u9 != -1) {
         var2.l6("style:volatile", this.u9 == 1 ? "true" : "false");
      }

      if (!"1".equals(this.h0)) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:transliteration-format", this.h0);
      }

      if (this.c8 != null) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:transliteration-language", this.c8);
      }

      if (this.t2 != null) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:transliteration-country", this.t2);
      }

      if (this.s7 != n5) {
         var2.l6("number:transliteration-style", o2o.n5(this.s7));
      }

      if (this.x8) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:automatic-order", this.x8 ? "true" : "false");
      }

      if (this.n3 != null) {
         this.n3.n5("style", var2, "text-properties");
      }

      List$Enumerator var4 = this.y4.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (t9.n5(var5.n5())) {
               case 11:
                  this.n5("number", var2, "text", (String)var5.k5(), false);
                  break;
               case 12:
                  ((o3q)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 13:
                  ((m0g)var5.k5()).n5("number", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.e2.iterator();

      try {
         while (var14.hasNext()) {
            j3t var6 = (j3t)var14.next();
            var6.n5("style", var2, "map");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t9;
   }

   // $VF: synthetic method
   static String n5(b2y var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(b2y var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(b2y var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(b2y var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static byte n5(b2y var0, byte var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String a6(b2y var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u9(b2y var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String h0(b2y var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int n5(b2y var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean n5(b2y var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static j9d n5(b2y var0, j9d var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static List n5(b2y var0) {
      return var0.y4;
   }

   // $VF: synthetic method
   static List l6(b2y var0) {
      return var0.e2;
   }
}
