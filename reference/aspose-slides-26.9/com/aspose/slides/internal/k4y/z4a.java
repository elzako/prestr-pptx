package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z4a extends b3 {
   private int n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private long u9;
   private String h0;
   private String c8;
   private String t2;
   private byte s7;
   private int x8;
   private int n3;
   private List<g7> y4;
   private static final com.aspose.slides.internal.v6g.u9 e2 = new com.aspose.slides.internal.v6g.u9(
      "text:note-class",
      "text:citation-style-name",
      "text:citation-body-style-name",
      "text:default-style-name",
      "text:master-page-name",
      "text:start-value",
      "style:num-prefix",
      "style:num-suffix",
      "style:num-format",
      "style:num-letter-sync",
      "text:start-numbering-at",
      "text:footnotes-position",
      "note-continuation-notice-forward",
      "note-continuation-notice-backward"
   );

   public z4a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      z4a$1 var2 = new z4a$1(this);
      n5(var1, var2);
      n5(var1, new z4a$2(this, var1));
   }

   public z4a() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.u9 = 4294967295L;
      this.s7 = -1;
      this.x8 = 0;
      this.n3 = 0;
      this.y4 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:note-class", u6f.n5(this.n5));
      if (this.l6 != null) {
         var2.l6("text:citation-style-name", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("text:citation-body-style-name", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("text:default-style-name", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("text:master-page-name", this.a6);
      }

      if ((this.u9 & 4294967295L) != 4294967295L) {
         var2.l6("text:start-value", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("style:num-prefix", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("style:num-suffix", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("style:num-format", this.t2);
      }

      if (this.s7 != -1) {
         var2.l6("style:num-letter-sync", this.s7 == 1 ? "true" : "false");
      }

      if (this.x8 != 0) {
         var2.l6("text:start-numbering-at", n6u.n5(this.x8));
      }

      if (this.n3 != 0) {
         var2.l6("text:footnotes-position", f6g.n5(this.n3));
      }

      List$Enumerator var4 = this.y4.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (e2.n5(var5.n5())) {
               case 12:
                  this.n5("text", var2, "note-continuation-notice-forward", (String)var5.k5(), false);
                  break;
               case 13:
                  this.n5("text", var2, "note-continuation-notice-backward", (String)var5.k5(), false);
            }
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
      return e2;
   }

   // $VF: synthetic method
   static int n5(z4a var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(z4a var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(z4a var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(z4a var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(z4a var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long n5(z4a var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String a6(z4a var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u9(z4a var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String h0(z4a var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static byte n5(z4a var0, byte var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int l6(z4a var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int k5(z4a var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static List n5(z4a var0) {
      return var0.y4;
   }
}
