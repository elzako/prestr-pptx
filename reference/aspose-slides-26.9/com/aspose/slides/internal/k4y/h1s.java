package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class h1s extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private byte u9;
   private String h0;
   private String c8;
   private String t2;
   private int s7;
   private j9d x8;
   private List<g7> n3;
   private List<j3t> y4;
   public static final int n5 = o2o.n5("short");
   private static final com.aspose.slides.internal.v6g.u9 e2 = new com.aspose.slides.internal.v6g.u9(
      "style:name",
      "number:language",
      "number:country",
      "number:title",
      "style:volatile",
      "number:transliteration-format",
      "number:transliteration-language",
      "number:transliteration-country",
      "number:transliteration-style",
      "text-properties",
      "number",
      "text",
      "map"
   );

   public h1s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      h1s$1 var2 = new h1s$1(this);
      n5(var1, var2);
      n5(var1, new h1s$2(this, var1));
   }

   public h1s() {
      this.l6();
   }

   private void l6() {
      this.u9 = -1;
      this.h0 = "1";
      this.s7 = n5;
      this.n3 = new List<>();
      this.y4 = new List<>();
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

      if (this.x8 != null) {
         this.x8.n5("style", var2, "text-properties");
      }

      List$Enumerator var4 = this.n3.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (e2.n5(var5.n5())) {
               case 10:
                  ((o3q)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 11:
                  this.n5("number", var2, "text", (String)var5.k5(), false);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.y4.iterator();

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
      return e2;
   }

   // $VF: synthetic method
   static String n5(h1s var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(h1s var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(h1s var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(h1s var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static byte n5(h1s var0, byte var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String a6(h1s var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u9(h1s var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String h0(h1s var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int n5(h1s var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static j9d n5(h1s var0, j9d var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static List n5(h1s var0) {
      return var0.n3;
   }

   // $VF: synthetic method
   static List l6(h1s var0) {
      return var0.y4;
   }
}
