package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class b6l extends b3 {
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private byte h0;
   private String c8;
   private String t2;
   private String s7;
   private int x8;
   private boolean n3;
   private int y4;
   private j9d e2;
   private List<g7> t9;
   private List<j3t> z1;
   public static final int n5 = o2o.n5("short");
   public static final int l6 = s3w.n5("fixed");
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
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
      "number:format-source",
      "text-properties",
      "day",
      "month",
      "year",
      "era",
      "day-of-week",
      "week-of-year",
      "quarter",
      "hours",
      "am-pm",
      "minutes",
      "seconds",
      "text",
      "map"
   );

   public b6l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      b6l$1 var2 = new b6l$1(this);
      n5(var1, var2);
      n5(var1, new b6l$2(this, var1));
   }

   public b6l() {
      this.l6();
   }

   private void l6() {
      this.h0 = -1;
      this.c8 = "1";
      this.x8 = n5;
      this.n3 = false;
      this.y4 = l6;
      this.t9 = new List<>();
      this.z1 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:name", this.k5);
      if (this.u3 != null) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:language", this.u3);
      }

      if (this.a6 != null) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:country", this.a6);
      }

      if (this.u9 != null) {
         if (var2.n5("http://www.w3.org/2001/XMLSchema") == null) {
            var2.u3("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
         }

         var2.l6("number:title", this.u9);
      }

      if (this.h0 != -1) {
         var2.l6("style:volatile", this.h0 == 1 ? "true" : "false");
      }

      if (!"1".equals(this.c8)) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:transliteration-format", this.c8);
      }

      if (this.t2 != null) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:transliteration-language", this.t2);
      }

      if (this.s7 != null) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:transliteration-country", this.s7);
      }

      if (this.x8 != n5) {
         var2.l6("number:transliteration-style", o2o.n5(this.x8));
      }

      if (this.n3) {
         if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
            var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
         }

         var2.l6("number:automatic-order", this.n3 ? "true" : "false");
      }

      if (this.y4 != l6) {
         var2.l6("number:format-source", s3w.n5(this.y4));
      }

      if (this.e2 != null) {
         this.e2.n5("style", var2, "text-properties");
      }

      List$Enumerator var4 = this.t9.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (t4.n5(var5.n5())) {
               case 12:
                  ((x3f)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 13:
                  ((e8s)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 14:
                  ((c8r)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 15:
                  ((x5n)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 16:
                  ((t7e)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 17:
                  ((d8b)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 18:
                  ((p1e)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 19:
                  ((h5m)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 20:
                  ((k6m)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 21:
                  ((v1l)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 22:
                  ((m2d)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 23:
                  this.n5("number", var2, "text", (String)var5.k5(), false);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.z1.iterator();

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
      return t4;
   }

   // $VF: synthetic method
   static String n5(b6l var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(b6l var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(b6l var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(b6l var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static byte n5(b6l var0, byte var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String a6(b6l var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u9(b6l var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String h0(b6l var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int n5(b6l var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean n5(b6l var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static int l6(b6l var0, int var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static j9d n5(b6l var0, j9d var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static List n5(b6l var0) {
      return var0.t9;
   }

   // $VF: synthetic method
   static List l6(b6l var0) {
      return var0.z1;
   }
}
