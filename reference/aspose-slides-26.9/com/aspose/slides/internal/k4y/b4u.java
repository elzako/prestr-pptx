package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class b4u extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
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
   private int r4;
   private long c4;
   private int y2;
   private String y1;
   private byte a0;
   private long d2;
   private byte d5;
   private byte s3;
   private v9d p8;
   private List<h0> f2;
   private static final com.aspose.slides.internal.v6g.u9 i1 = new com.aspose.slides.internal.v6g.u9(
      "style:vertical-align",
      "style:text-align-source",
      "style:direction",
      "style:glyph-orientation-vertical",
      "style:shadow",
      "fo:background-color",
      "fo:border",
      "fo:border-top",
      "fo:border-bottom",
      "fo:border-left",
      "fo:border-right",
      "style:diagonal-tl-br",
      "style:diagonal-tl-br-widths",
      "style:diagonal-bl-tr",
      "style:diagonal-bl-tr-widths",
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
      "fo:wrap-option",
      "style:rotation-angle",
      "style:rotation-align",
      "style:cell-protect",
      "style:print-content",
      "style:decimal-places",
      "style:repeat-content",
      "style:shrink-to-fit",
      "background-image"
   );

   public b4u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.e2();
      b4u$1 var2 = new b4u$1(this);
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
               switch (i1.n5(var1.n3())) {
                  case 33:
                     this.p8 = new v9d(var1);
                     break;
                  default:
                     h0 var5 = new h0(var1);
                     this.f2.addItem(var5);
                     var4 = true;
               }
            }
         }
      }
   }

   public b4u() {
      this.e2();
   }

   private void e2() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.r4 = 0;
      this.c4 = 4294967295L;
      this.y2 = 0;
      this.a0 = -1;
      this.d2 = 4294967295L;
      this.d5 = -1;
      this.s3 = -1;
      this.f2 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:vertical-align", s3l.n5(this.n5));
      if (this.l6 != 0) {
         var2.l6("style:text-align-source", a6m.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("style:direction", p0j.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("style:glyph-orientation-vertical", b4g.n5(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("style:shadow", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("fo:background-color", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("fo:border", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("fo:border-top", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("fo:border-bottom", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("fo:border-left", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("fo:border-right", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("style:diagonal-tl-br", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("style:diagonal-tl-br-widths", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("style:diagonal-bl-tr", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("style:diagonal-bl-tr-widths", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("style:border-line-width", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("style:border-line-width-top", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("style:border-line-width-bottom", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("style:border-line-width-left", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("style:border-line-width-right", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("fo:padding", this.k7);
      }

      if (this.m3 != null) {
         var2.l6("fo:padding-top", this.m3);
      }

      if (this.z8 != null) {
         var2.l6("fo:padding-bottom", this.z8);
      }

      if (this.j5 != null) {
         var2.l6("fo:padding-left", this.j5);
      }

      if (this.w1 != null) {
         var2.l6("fo:padding-right", this.w1);
      }

      if (this.r4 != 0) {
         var2.l6("fo:wrap-option", j2n.n5(this.r4));
      }

      if ((this.c4 & 4294967295L) != 4294967295L) {
         var2.l6("style:rotation-angle", com.aspose.slides.ms.System.Xml.f4.l6(this.c4));
      }

      if (this.y2 != 0) {
         var2.l6("style:rotation-align", f2w.n5(this.y2));
      }

      if (this.y1 != null) {
         var2.l6("style:cell-protect", this.y1);
      }

      if (this.a0 != -1) {
         var2.l6("style:print-content", this.a0 == 1 ? "true" : "false");
      }

      if ((this.d2 & 4294967295L) != 4294967295L) {
         var2.l6("style:decimal-places", com.aspose.slides.ms.System.Xml.f4.l6(this.d2));
      }

      if (this.d5 != -1) {
         var2.l6("style:repeat-content", this.d5 == 1 ? "true" : "false");
      }

      if (this.s3 != -1) {
         var2.l6("style:shrink-to-fit", this.s3 == 1 ? "true" : "false");
      }

      if (this.p8 != null) {
         this.p8.n5("style", var2, "background-image");
      }

      List$Enumerator var4 = this.f2.iterator();

      try {
         while (var4.hasNext()) {
            h0 var5 = (h0)var4.next();
            var5.n5("", var2, "");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.u9;
   }

   public final void n5(String var1) {
      this.u9 = var1;
   }

   public final String k5() {
      return this.h0;
   }

   public final String u3() {
      return this.c8;
   }

   public final void l6(String var1) {
      this.c8 = var1;
   }

   public final String a6() {
      return this.t2;
   }

   public final void k5(String var1) {
      this.t2 = var1;
   }

   public final String u9() {
      return this.s7;
   }

   public final void u3(String var1) {
      this.s7 = var1;
   }

   public final String h0() {
      return this.x8;
   }

   public final void a6(String var1) {
      this.x8 = var1;
   }

   public final String c8() {
      return this.m3;
   }

   public final void u9(String var1) {
      this.m3 = var1;
   }

   public final String t2() {
      return this.z8;
   }

   public final void h0(String var1) {
      this.z8 = var1;
   }

   public final String s7() {
      return this.j5;
   }

   public final void c8(String var1) {
      this.j5 = var1;
   }

   public final String x8() {
      return this.w1;
   }

   public final void t2(String var1) {
      this.w1 = var1;
   }

   public final v9d n3() {
      return this.p8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 y4() {
      return i1;
   }

   // $VF: synthetic method
   static int n5(b4u var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(b4u var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(b4u var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int u3(b4u var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(b4u var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(b4u var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(b4u var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(b4u var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(b4u var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(b4u var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String h0(b4u var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String c8(b4u var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String t2(b4u var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String s7(b4u var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String x8(b4u var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String n3(b4u var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String y4(b4u var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String e2(b4u var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String t9(b4u var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String z1(b4u var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String t4(b4u var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String q0(b4u var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String z3(b4u var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String m1(b4u var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String k7(b4u var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static int a6(b4u var0, int var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static long n5(b4u var0, long var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static int u9(b4u var0, int var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static String m3(b4u var0, String var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static byte n5(b4u var0, byte var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static long l6(b4u var0, long var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static byte l6(b4u var0, byte var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static byte k5(b4u var0, byte var1) {
      return var0.s3 = var1;
   }
}
