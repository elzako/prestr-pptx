package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class n6s extends b3 {
   private int l6;
   private boolean k5;
   private boolean u3;
   private String a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private boolean n3;
   private String y4;
   private String e2;
   private String t9;
   private s4r z1;
   private List<d5f> t4;
   public static final int n5 = e6v.n5("document");
   private static final com.aspose.slides.internal.v6g.u9 q0 = new com.aspose.slides.internal.v6g.u9(
      "text:index-scope",
      "text:relative-tab-stop-position",
      "text:ignore-case",
      "text:main-entry-style-name",
      "text:alphabetical-separators",
      "text:combine-entries",
      "text:combine-entries-with-dash",
      "text:combine-entries-with-pp",
      "text:use-keys-as-entries",
      "text:capitalize-entries",
      "text:comma-separated",
      "fo:language",
      "fo:country",
      "text:sort-algorithm",
      "index-title-template",
      "alphabetical-index-entry-template"
   );

   public n6s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n6s$1 var2 = new n6s$1(this);
      n5(var1, var2);
      n5(var1, new n6s$2(this, var1));
   }

   public n6s() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
      this.k5 = true;
      this.u3 = false;
      this.u9 = false;
      this.h0 = true;
      this.c8 = false;
      this.t2 = true;
      this.s7 = false;
      this.x8 = false;
      this.n3 = false;
      this.t4 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("text:index-scope", e6v.n5(this.l6));
      }

      if (!this.k5) {
         var2.l6("text:relative-tab-stop-position", this.k5 ? "true" : "false");
      }

      if (this.u3) {
         var2.l6("text:ignore-case", this.u3 ? "true" : "false");
      }

      if (this.a6 != null) {
         var2.l6("text:main-entry-style-name", this.a6);
      }

      if (this.u9) {
         var2.l6("text:alphabetical-separators", this.u9 ? "true" : "false");
      }

      if (!this.h0) {
         var2.l6("text:combine-entries", this.h0 ? "true" : "false");
      }

      if (this.c8) {
         var2.l6("text:combine-entries-with-dash", this.c8 ? "true" : "false");
      }

      if (!this.t2) {
         var2.l6("text:combine-entries-with-pp", this.t2 ? "true" : "false");
      }

      if (this.s7) {
         var2.l6("text:use-keys-as-entries", this.s7 ? "true" : "false");
      }

      if (this.x8) {
         var2.l6("text:capitalize-entries", this.x8 ? "true" : "false");
      }

      if (this.n3) {
         var2.l6("text:comma-separated", this.n3 ? "true" : "false");
      }

      if (this.y4 != null) {
         var2.l6("fo:language", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("fo:country", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("text:sort-algorithm", this.t9);
      }

      if (this.z1 != null) {
         this.z1.n5("text", var2, "index-title-template");
      }

      List$Enumerator var4 = this.t4.iterator();

      try {
         while (var4.hasNext()) {
            d5f var5 = (d5f)var4.next();
            var5.n5("text", var2, "alphabetical-index-entry-template");
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
      return q0;
   }

   // $VF: synthetic method
   static int n5(n6s var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(n6s var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(n6s var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(n6s var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(n6s var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean u3(n6s var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean a6(n6s var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean u9(n6s var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean h0(n6s var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean c8(n6s var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean t2(n6s var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String l6(n6s var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String k5(n6s var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String u3(n6s var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static s4r n5(n6s var0, s4r var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static List n5(n6s var0) {
      return var0.t4;
   }
}
