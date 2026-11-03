package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class c1h extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private byte u3;
   private String a6;
   private String u9;
   private String h0;
   private int c8;
   private String t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private String z3;
   private String m1;
   private String k7;
   private String m3;
   private String z8;
   private String j5;
   private String w1;
   private String r4;
   private String c4;
   private String y2;
   private String y1;
   private String a0;
   private String d2;
   private String d5;
   private int s3;
   private String p8;
   private String f2;
   private long i1;
   private int e5;
   private String b3;
   private int o0;
   private int z7;
   private String v4;
   private String u6;
   private long t1;
   private String a5;
   private byte h2;
   private byte v0;
   private byte f0;
   private List<g7> a3;
   private List<h0> p3;
   private static final com.aspose.slides.internal.v6g.u9 x9 = new com.aspose.slides.internal.v6g.u9(
      "fo:page-width",
      "fo:page-height",
      "style:num-format",
      "style:num-letter-sync",
      "style:num-prefix",
      "style:num-suffix",
      "style:paper-tray-name",
      "style:print-orientation",
      "fo:margin-left",
      "fo:margin-right",
      "fo:margin-top",
      "fo:margin-bottom",
      "fo:margin",
      "fo:border",
      "fo:border-top",
      "fo:border-bottom",
      "fo:border-left",
      "fo:border-right",
      "style:border-line-width",
      "style:border-line-width-top",
      "style:border-line-width-bottom",
      "style:border-line-width-left",
      "style:border-line-width-right",
      "fo:padding",
      "fo:padding-top",
      "fo:padding-bottom",
      "fo:padding-left",
      "fo:padding-right",
      "style:shadow",
      "fo:background-color",
      "style:register-truth-ref-style-name",
      "style:print",
      "style:print-page-order",
      "style:first-page-number",
      "style:scale-to",
      "style:scale-to-pages",
      "style:table-centering",
      "style:footnote-max-height",
      "style:writing-mode",
      "style:layout-grid-mode",
      "style:layout-grid-base-height",
      "style:layout-grid-ruby-height",
      "style:layout-grid-lines",
      "style:layout-grid-color",
      "style:layout-grid-ruby-below",
      "style:layout-grid-print",
      "style:layout-grid-display",
      "background-image",
      "columns",
      "footnote-sep"
   );

   public c1h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      c1h$1 var2 = new c1h$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (x9.n5(var1.n3())) {
                  case 47:
                     v9d var5 = new v9d(var1);
                     this.a3.addItem(new g7("background-image", var5));
                     break;
                  case 48:
                     t2f var6 = new t2f(var1);
                     this.a3.addItem(new g7("columns", var6));
                     break;
                  case 49:
                     o9a var7 = new o9a(var1);
                     this.a3.addItem(new g7("footnote-sep", var7));
                     break;
                  default:
                     h0 var8 = new h0(var1);
                     this.p3.addItem(var8);
                     var4 = true;
               }
            }
         }
      }
   }

   public c1h() {
      this.a6();
   }

   private void a6() {
      this.u3 = -1;
      this.c8 = 0;
      this.s3 = 0;
      this.i1 = 4294967295L;
      this.e5 = 0;
      this.o0 = 0;
      this.z7 = 0;
      this.t1 = 4294967295L;
      this.h2 = -1;
      this.v0 = -1;
      this.f0 = -1;
      this.a3 = new List<>();
      this.p3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("fo:page-width", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("fo:page-height", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("style:num-format", this.k5);
      }

      if (this.u3 != -1) {
         var2.l6("style:num-letter-sync", this.u3 == 1 ? "true" : "false");
      }

      if (this.a6 != null) {
         var2.l6("style:num-prefix", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("style:num-suffix", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("style:paper-tray-name", this.h0);
      }

      if (this.c8 != 0) {
         var2.l6("style:print-orientation", v9o.n5(this.c8));
      }

      if (this.t2 != null) {
         var2.l6("fo:margin-left", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("fo:margin-right", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("fo:margin-top", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("fo:margin-bottom", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("fo:margin", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("fo:border", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("fo:border-top", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("fo:border-bottom", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("fo:border-left", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("fo:border-right", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("style:border-line-width", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("style:border-line-width-top", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("style:border-line-width-bottom", this.k7);
      }

      if (this.m3 != null) {
         var2.l6("style:border-line-width-left", this.m3);
      }

      if (this.z8 != null) {
         var2.l6("style:border-line-width-right", this.z8);
      }

      if (this.j5 != null) {
         var2.l6("fo:padding", this.j5);
      }

      if (this.w1 != null) {
         var2.l6("fo:padding-top", this.w1);
      }

      if (this.r4 != null) {
         var2.l6("fo:padding-bottom", this.r4);
      }

      if (this.c4 != null) {
         var2.l6("fo:padding-left", this.c4);
      }

      if (this.y2 != null) {
         var2.l6("fo:padding-right", this.y2);
      }

      if (this.y1 != null) {
         var2.l6("style:shadow", this.y1);
      }

      if (this.a0 != null) {
         var2.l6("fo:background-color", this.a0);
      }

      if (this.d2 != null) {
         var2.l6("style:register-truth-ref-style-name", this.d2);
      }

      if (this.d5 != null) {
         var2.l6("style:print", this.d5);
      }

      if (this.s3 != 0) {
         var2.l6("style:print-page-order", c7t.n5(this.s3));
      }

      if (this.p8 != null) {
         var2.l6("style:first-page-number", this.p8);
      }

      if (this.f2 != null) {
         var2.l6("style:scale-to", this.f2);
      }

      if ((this.i1 & 4294967295L) != 4294967295L) {
         var2.l6("style:scale-to-pages", com.aspose.slides.ms.System.Xml.f4.l6(this.i1));
      }

      if (this.e5 != 0) {
         var2.l6("style:table-centering", w5s.n5(this.e5));
      }

      if (this.b3 != null) {
         var2.l6("style:footnote-max-height", this.b3);
      }

      if (this.o0 != 0) {
         var2.l6("style:writing-mode", w6i.n5(this.o0));
      }

      if (this.z7 != 0) {
         var2.l6("style:layout-grid-mode", o5b.n5(this.z7));
      }

      if (this.v4 != null) {
         var2.l6("style:layout-grid-base-height", this.v4);
      }

      if (this.u6 != null) {
         var2.l6("style:layout-grid-ruby-height", this.u6);
      }

      if ((this.t1 & 4294967295L) != 4294967295L) {
         var2.l6("style:layout-grid-lines", com.aspose.slides.ms.System.Xml.f4.l6(this.t1));
      }

      if (this.a5 != null) {
         var2.l6("style:layout-grid-color", this.a5);
      }

      if (this.h2 != -1) {
         var2.l6("style:layout-grid-ruby-below", this.h2 == 1 ? "true" : "false");
      }

      if (this.v0 != -1) {
         var2.l6("style:layout-grid-print", this.v0 == 1 ? "true" : "false");
      }

      if (this.f0 != -1) {
         var2.l6("style:layout-grid-display", this.f0 == 1 ? "true" : "false");
      }

      List$Enumerator var4 = this.a3.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (x9.n5(var5.n5())) {
               case 47:
                  ((v9d)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 48:
                  ((t2f)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 49:
                  ((o9a)var5.k5()).n5("style", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.p3.iterator();

      try {
         while (var14.hasNext()) {
            h0 var6 = (h0)var14.next();
            var6.n5("", var2, "");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.c8;
   }

   public final void n5(int var1) {
      this.c8 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return x9;
   }

   // $VF: synthetic method
   static String n5(c1h var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(c1h var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(c1h var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte n5(c1h var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(c1h var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(c1h var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(c1h var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int n5(c1h var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String h0(c1h var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String c8(c1h var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String t2(c1h var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String s7(c1h var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String x8(c1h var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String n3(c1h var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String y4(c1h var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String e2(c1h var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String t9(c1h var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String z1(c1h var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String t4(c1h var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String q0(c1h var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String z3(c1h var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String m1(c1h var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String k7(c1h var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String m3(c1h var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String z8(c1h var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static String j5(c1h var0, String var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String w1(c1h var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static String r4(c1h var0, String var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static String c4(c1h var0, String var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static String y2(c1h var0, String var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static String y1(c1h var0, String var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static String a0(c1h var0, String var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static int l6(c1h var0, int var1) {
      return var0.s3 = var1;
   }

   // $VF: synthetic method
   static String d2(c1h var0, String var1) {
      return var0.p8 = var1;
   }

   // $VF: synthetic method
   static String d5(c1h var0, String var1) {
      return var0.f2 = var1;
   }

   // $VF: synthetic method
   static long n5(c1h var0, long var1) {
      return var0.i1 = var1;
   }

   // $VF: synthetic method
   static int k5(c1h var0, int var1) {
      return var0.e5 = var1;
   }

   // $VF: synthetic method
   static String s3(c1h var0, String var1) {
      return var0.b3 = var1;
   }

   // $VF: synthetic method
   static int u3(c1h var0, int var1) {
      return var0.o0 = var1;
   }

   // $VF: synthetic method
   static int a6(c1h var0, int var1) {
      return var0.z7 = var1;
   }

   // $VF: synthetic method
   static String p8(c1h var0, String var1) {
      return var0.v4 = var1;
   }

   // $VF: synthetic method
   static String f2(c1h var0, String var1) {
      return var0.u6 = var1;
   }

   // $VF: synthetic method
   static long l6(c1h var0, long var1) {
      return var0.t1 = var1;
   }

   // $VF: synthetic method
   static String i1(c1h var0, String var1) {
      return var0.a5 = var1;
   }

   // $VF: synthetic method
   static byte l6(c1h var0, byte var1) {
      return var0.h2 = var1;
   }

   // $VF: synthetic method
   static byte k5(c1h var0, byte var1) {
      return var0.v0 = var1;
   }

   // $VF: synthetic method
   static byte u3(c1h var0, byte var1) {
      return var0.f0 = var1;
   }
}
