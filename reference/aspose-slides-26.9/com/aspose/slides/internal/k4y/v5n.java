package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class v5n extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private byte u3;
   private int a6;
   private int u9;
   private byte h0;
   private int c8;
   private long t2;
   private long s7;
   private String x8;
   private int n3;
   private String y4;
   private byte e2;
   private String t9;
   private String z1;
   private String t4;
   private byte q0;
   private String z3;
   private String m1;
   private String k7;
   private int m3;
   private int z8;
   private String j5;
   private String w1;
   private String r4;
   private String c4;
   private String y2;
   private String y1;
   private String a0;
   private String d2;
   private String d5;
   private String s3;
   private String p8;
   private String f2;
   private String i1;
   private String e5;
   private String b3;
   private String o0;
   private String z7;
   private int v4;
   private boolean u6;
   private long t1;
   private int a5;
   private int h2;
   private int v0;
   private int f0;
   private int a3;
   private byte p3;
   private byte x9;
   private String y0;
   private String j9;
   private List<g7> z6;
   private List<h0> e9;
   private static final com.aspose.slides.internal.v6g.u9 o5 = new com.aspose.slides.internal.v6g.u9(
      "fo:line-height",
      "style:line-height-at-least",
      "style:line-spacing",
      "style:font-independent-line-spacing",
      "fo:text-align",
      "fo:text-align-last",
      "style:justify-single-word",
      "fo:keep-together",
      "fo:widows",
      "fo:orphans",
      "style:tab-stop-distance",
      "fo:hyphenation-keep",
      "fo:hyphenation-ladder-count",
      "style:register-true",
      "fo:margin-left",
      "fo:margin-right",
      "fo:text-indent",
      "style:auto-text-indent",
      "fo:margin-top",
      "fo:margin-bottom",
      "fo:margin",
      "fo:break-before",
      "fo:break-after",
      "fo:background-color",
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
      "fo:keep-with-next",
      "text:number-lines",
      "text:line-number",
      "style:text-autospace",
      "style:punctuation-wrap",
      "style:line-break",
      "style:vertical-align",
      "style:writing-mode",
      "style:writing-mode-automatic",
      "style:snap-to-layout-grid",
      "style:page-number",
      "style:background-transparency",
      "tab-stops",
      "drop-cap",
      "background-image"
   );

   public v5n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.m3();
      v5n$1 var2 = new v5n$1(this);
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
               switch (o5.n5(var1.n3())) {
                  case 52:
                     e6f var5 = new e6f(var1);
                     this.z6.addItem(new g7("tab-stops", var5));
                     break;
                  case 53:
                     l5x var6 = new l5x(var1);
                     this.z6.addItem(new g7("drop-cap", var6));
                     break;
                  case 54:
                     v9d var7 = new v9d(var1);
                     this.z6.addItem(new g7("background-image", var7));
                     break;
                  default:
                     h0 var8 = new h0(var1);
                     this.e9.addItem(var8);
                     var4 = true;
               }
            }
         }
      }
   }

   public v5n() {
      this.m3();
   }

   private void m3() {
      this.u3 = -1;
      this.a6 = 0;
      this.u9 = 0;
      this.h0 = -1;
      this.c8 = 0;
      this.t2 = 4294967295L;
      this.s7 = 4294967295L;
      this.n3 = 0;
      this.e2 = -1;
      this.q0 = -1;
      this.m3 = 0;
      this.z8 = 0;
      this.v4 = 0;
      this.u6 = false;
      this.t1 = 4294967295L;
      this.a5 = 0;
      this.h2 = 0;
      this.v0 = 0;
      this.f0 = 0;
      this.a3 = 0;
      this.p3 = -1;
      this.x9 = -1;
      this.z6 = new List<>();
      this.e9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("fo:line-height", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("style:line-height-at-least", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("style:line-spacing", this.k5);
      }

      if (this.u3 != -1) {
         var2.l6("style:font-independent-line-spacing", this.u3 == 1 ? "true" : "false");
      }

      if (this.a6 != 0) {
         var2.l6("fo:text-align", g6k.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("fo:text-align-last", r4v.n5(this.u9));
      }

      if (this.h0 != -1) {
         var2.l6("style:justify-single-word", this.h0 == 1 ? "true" : "false");
      }

      if (this.c8 != 0) {
         var2.l6("fo:keep-together", i3z.n5(this.c8));
      }

      if ((this.t2 & 4294967295L) != 4294967295L) {
         var2.l6("fo:widows", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      if ((this.s7 & 4294967295L) != 4294967295L) {
         var2.l6("fo:orphans", com.aspose.slides.ms.System.Xml.f4.l6(this.s7));
      }

      if (this.x8 != null) {
         var2.l6("style:tab-stop-distance", this.x8);
      }

      if (this.n3 != 0) {
         var2.l6("fo:hyphenation-keep", r9a.n5(this.n3));
      }

      if (this.y4 != null) {
         var2.l6("fo:hyphenation-ladder-count", this.y4);
      }

      if (this.e2 != -1) {
         var2.l6("style:register-true", this.e2 == 1 ? "true" : "false");
      }

      if (this.t9 != null) {
         var2.l6("fo:margin-left", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("fo:margin-right", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("fo:text-indent", this.t4);
      }

      if (this.q0 != -1) {
         var2.l6("style:auto-text-indent", this.q0 == 1 ? "true" : "false");
      }

      if (this.z3 != null) {
         var2.l6("fo:margin-top", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("fo:margin-bottom", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("fo:margin", this.k7);
      }

      if (this.m3 != 0) {
         var2.l6("fo:break-before", g4c.n5(this.m3));
      }

      if (this.z8 != 0) {
         var2.l6("fo:break-after", w7s.n5(this.z8));
      }

      if (this.j5 != null) {
         var2.l6("fo:background-color", this.j5);
      }

      if (this.w1 != null) {
         var2.l6("fo:border", this.w1);
      }

      if (this.r4 != null) {
         var2.l6("fo:border-top", this.r4);
      }

      if (this.c4 != null) {
         var2.l6("fo:border-bottom", this.c4);
      }

      if (this.y2 != null) {
         var2.l6("fo:border-left", this.y2);
      }

      if (this.y1 != null) {
         var2.l6("fo:border-right", this.y1);
      }

      if (this.a0 != null) {
         var2.l6("style:border-line-width", this.a0);
      }

      if (this.d2 != null) {
         var2.l6("style:border-line-width-top", this.d2);
      }

      if (this.d5 != null) {
         var2.l6("style:border-line-width-bottom", this.d5);
      }

      if (this.s3 != null) {
         var2.l6("style:border-line-width-left", this.s3);
      }

      if (this.p8 != null) {
         var2.l6("style:border-line-width-right", this.p8);
      }

      if (this.f2 != null) {
         var2.l6("fo:padding", this.f2);
      }

      if (this.i1 != null) {
         var2.l6("fo:padding-top", this.i1);
      }

      if (this.e5 != null) {
         var2.l6("fo:padding-bottom", this.e5);
      }

      if (this.b3 != null) {
         var2.l6("fo:padding-left", this.b3);
      }

      if (this.o0 != null) {
         var2.l6("fo:padding-right", this.o0);
      }

      if (this.z7 != null) {
         var2.l6("style:shadow", this.z7);
      }

      if (this.v4 != 0) {
         var2.l6("fo:keep-with-next", i7r.n5(this.v4));
      }

      if (this.u6) {
         var2.l6("text:number-lines", this.u6 ? "true" : "false");
      }

      if ((this.t1 & 4294967295L) != 4294967295L) {
         var2.l6("text:line-number", com.aspose.slides.ms.System.Xml.f4.l6(this.t1));
      }

      if (this.a5 != 0) {
         var2.l6("style:text-autospace", q4x.n5(this.a5));
      }

      if (this.h2 != 0) {
         var2.l6("style:punctuation-wrap", n7q.n5(this.h2));
      }

      if (this.v0 != 0) {
         var2.l6("style:line-break", x3w.n5(this.v0));
      }

      if (this.f0 != 0) {
         var2.l6("style:vertical-align", g0u.n5(this.f0));
      }

      if (this.a3 != 0) {
         var2.l6("style:writing-mode", w6i.n5(this.a3));
      }

      if (this.p3 != -1) {
         var2.l6("style:writing-mode-automatic", this.p3 == 1 ? "true" : "false");
      }

      if (this.x9 != -1) {
         var2.l6("style:snap-to-layout-grid", this.x9 == 1 ? "true" : "false");
      }

      if (this.y0 != null) {
         var2.l6("style:page-number", this.y0);
      }

      if (this.j9 != null) {
         var2.l6("style:background-transparency", this.j9);
      }

      List$Enumerator var4 = this.z6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (o5.n5(var5.n5())) {
               case 52:
                  ((e6f)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 53:
                  ((l5x)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 54:
                  ((v9d)var5.k5()).n5("style", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.e9.iterator();

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

   public final g7 n5(String var1) {
      g7 var2;
      switch (o5.n5(var1)) {
         case 52:
            var2 = new g7("tab-stops", new e6f());
            break;
         case 53:
            var2 = new g7("drop-cap", new l5x());
            break;
         case 54:
            var2 = new g7("background-image", new v9d());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.z6.addItem(var2);
      return var2;
   }

   public final String n5() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.n5 = var1;
   }

   public final byte l6() {
      return this.u3;
   }

   public final void n5(byte var1) {
      this.u3 = var1;
   }

   public final int k5() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final void k5(String var1) {
      this.x8 = var1;
   }

   public final String u3() {
      return this.t9;
   }

   public final void u3(String var1) {
      this.t9 = var1;
   }

   public final String a6() {
      return this.z1;
   }

   public final void a6(String var1) {
      this.z1 = var1;
   }

   public final String u9() {
      return this.t4;
   }

   public final void u9(String var1) {
      this.t4 = var1;
   }

   public final String h0() {
      return this.z3;
   }

   public final void h0(String var1) {
      this.z3 = var1;
   }

   public final String c8() {
      return this.m1;
   }

   public final void c8(String var1) {
      this.m1 = var1;
   }

   public final String t2() {
      return this.w1;
   }

   public final String s7() {
      return this.r4;
   }

   public final void t2(String var1) {
      this.r4 = var1;
   }

   public final String x8() {
      return this.c4;
   }

   public final void s7(String var1) {
      this.c4 = var1;
   }

   public final String n3() {
      return this.y2;
   }

   public final void x8(String var1) {
      this.y2 = var1;
   }

   public final String y4() {
      return this.y1;
   }

   public final void n3(String var1) {
      this.y1 = var1;
   }

   public final String e2() {
      return this.i1;
   }

   public final String t9() {
      return this.e5;
   }

   public final String z1() {
      return this.b3;
   }

   public final String t4() {
      return this.o0;
   }

   public final int q0() {
      return this.h2;
   }

   public final void l6(int var1) {
      this.h2 = var1;
   }

   public final int z3() {
      return this.f0;
   }

   public final void k5(int var1) {
      this.f0 = var1;
   }

   public final int m1() {
      return this.a3;
   }

   public final void u3(int var1) {
      this.a3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k7() {
      return o5;
   }

   // $VF: synthetic method
   static String n5(v5n var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(v5n var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(v5n var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte n5(v5n var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(v5n var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(v5n var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static byte l6(v5n var0, byte var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int k5(v5n var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long n5(v5n var0, long var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static long l6(v5n var0, long var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String u3(v5n var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int u3(v5n var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String a6(v5n var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static byte k5(v5n var0, byte var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String u9(v5n var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String h0(v5n var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String c8(v5n var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static byte u3(v5n var0, byte var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String t2(v5n var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String s7(v5n var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String x8(v5n var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static int a6(v5n var0, int var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static int u9(v5n var0, int var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String n3(v5n var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String y4(v5n var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static String e2(v5n var0, String var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String t9(v5n var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static String z1(v5n var0, String var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static String t4(v5n var0, String var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static String q0(v5n var0, String var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static String z3(v5n var0, String var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static String m1(v5n var0, String var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static String k7(v5n var0, String var1) {
      return var0.s3 = var1;
   }

   // $VF: synthetic method
   static String m3(v5n var0, String var1) {
      return var0.p8 = var1;
   }

   // $VF: synthetic method
   static String z8(v5n var0, String var1) {
      return var0.f2 = var1;
   }

   // $VF: synthetic method
   static String j5(v5n var0, String var1) {
      return var0.i1 = var1;
   }

   // $VF: synthetic method
   static String w1(v5n var0, String var1) {
      return var0.e5 = var1;
   }

   // $VF: synthetic method
   static String r4(v5n var0, String var1) {
      return var0.b3 = var1;
   }

   // $VF: synthetic method
   static String c4(v5n var0, String var1) {
      return var0.o0 = var1;
   }

   // $VF: synthetic method
   static String y2(v5n var0, String var1) {
      return var0.z7 = var1;
   }

   // $VF: synthetic method
   static int h0(v5n var0, int var1) {
      return var0.v4 = var1;
   }

   // $VF: synthetic method
   static boolean n5(v5n var0, boolean var1) {
      return var0.u6 = var1;
   }

   // $VF: synthetic method
   static long k5(v5n var0, long var1) {
      return var0.t1 = var1;
   }

   // $VF: synthetic method
   static int c8(v5n var0, int var1) {
      return var0.a5 = var1;
   }

   // $VF: synthetic method
   static int t2(v5n var0, int var1) {
      return var0.h2 = var1;
   }

   // $VF: synthetic method
   static int s7(v5n var0, int var1) {
      return var0.v0 = var1;
   }

   // $VF: synthetic method
   static int x8(v5n var0, int var1) {
      return var0.f0 = var1;
   }

   // $VF: synthetic method
   static int n3(v5n var0, int var1) {
      return var0.a3 = var1;
   }

   // $VF: synthetic method
   static byte a6(v5n var0, byte var1) {
      return var0.p3 = var1;
   }

   // $VF: synthetic method
   static byte u9(v5n var0, byte var1) {
      return var0.x9 = var1;
   }

   // $VF: synthetic method
   static String y1(v5n var0, String var1) {
      return var0.y0 = var1;
   }

   // $VF: synthetic method
   static String a0(v5n var0, String var1) {
      return var0.j9 = var1;
   }
}
