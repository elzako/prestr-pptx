package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class r9l extends b3 {
   private int k5;
   private String u3;
   private String a6;
   private String u9;
   private long h0;
   private String c8;
   private byte t2;
   private String s7;
   private int x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private int z1;
   private String t4;
   private String q0;
   private String z3;
   private int m1;
   private int k7;
   private int m3;
   private int z8;
   private String j5;
   private String w1;
   private int r4;
   private String c4;
   private com.aspose.slides.ms.System.s4 y2 = new com.aspose.slides.ms.System.s4();
   private int y1;
   private int a0;
   private byte d2;
   private byte d5;
   private byte s3;
   private byte p8;
   private byte f2;
   private byte i1;
   private e8v e5;
   private List<h0> b3;
   public static final int n5 = q8k.n5("forward");
   public static final com.aspose.slides.ms.System.s4 l6 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 o0 = new com.aspose.slides.internal.v6g.u9(
      "draw:fill",
      "draw:fill-color",
      "draw:secondary-fill-color",
      "draw:fill-gradient-name",
      "draw:gradient-step-count",
      "draw:fill-hatch-name",
      "draw:fill-hatch-solid",
      "draw:fill-image-name",
      "style:repeat",
      "draw:fill-image-width",
      "draw:fill-image-height",
      "draw:fill-image-ref-point-x",
      "draw:fill-image-ref-point-y",
      "draw:fill-image-ref-point",
      "draw:tile-repeat-offset",
      "draw:opacity",
      "draw:opacity-name",
      "svg:fill-rule",
      "presentation:transition-type",
      "presentation:transition-style",
      "presentation:transition-speed",
      "smil:type",
      "smil:subtype",
      "smil:direction",
      "smil:fadeColor",
      "presentation:duration",
      "presentation:visibility",
      "draw:background-size",
      "presentation:background-objects-visible",
      "presentation:background-visible",
      "presentation:display-header",
      "presentation:display-footer",
      "presentation:display-page-number",
      "presentation:display-date-time",
      "sound"
   );

   public r9l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.z3();
      r9l$1 var2 = new r9l$1(this);
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
               switch (o0.n5(var1.n3())) {
                  case 34:
                     this.e5 = new e8v(var1);
                     break;
                  default:
                     h0 var5 = new h0(var1);
                     this.b3.addItem(var5);
                     var4 = true;
               }
            }
         }
      }
   }

   public r9l() {
      this.z3();
   }

   private void z3() {
      this.k5 = 0;
      this.h0 = 4294967295L;
      this.t2 = -1;
      this.x8 = 0;
      this.z1 = 0;
      this.m1 = 0;
      this.k7 = 0;
      this.m3 = 0;
      this.z8 = 0;
      this.r4 = n5;
      l6.u3(this.y2);
      this.y1 = 0;
      this.a0 = 0;
      this.d2 = -1;
      this.d5 = -1;
      this.s3 = -1;
      this.p8 = -1;
      this.f2 = -1;
      this.i1 = -1;
      this.b3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != 0) {
         var2.l6("draw:fill", w9q.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("draw:fill-color", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("draw:secondary-fill-color", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("draw:fill-gradient-name", this.u9);
      }

      if ((this.h0 & 4294967295L) != 4294967295L) {
         var2.l6("draw:gradient-step-count", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if (this.c8 != null) {
         var2.l6("draw:fill-hatch-name", this.c8);
      }

      if (this.t2 != -1) {
         var2.l6("draw:fill-hatch-solid", this.t2 == 1 ? "true" : "false");
      }

      if (this.s7 != null) {
         var2.l6("draw:fill-image-name", this.s7);
      }

      if (this.x8 != 0) {
         var2.l6("style:repeat", k0p.n5(this.x8));
      }

      if (this.n3 != null) {
         var2.l6("draw:fill-image-width", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("draw:fill-image-height", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("draw:fill-image-ref-point-x", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("draw:fill-image-ref-point-y", this.t9);
      }

      if (this.z1 != 0) {
         var2.l6("draw:fill-image-ref-point", j4u.n5(this.z1));
      }

      if (this.t4 != null) {
         var2.l6("draw:tile-repeat-offset", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("draw:opacity", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("draw:opacity-name", this.z3);
      }

      if (this.m1 != 0) {
         var2.l6("svg:fill-rule", f9r.n5(this.m1));
      }

      if (this.k7 != 0) {
         var2.l6("presentation:transition-type", n3e.n5(this.k7));
      }

      if (this.m3 != 0) {
         var2.l6("presentation:transition-style", d7r.n5(this.m3));
      }

      if (this.z8 != 0) {
         var2.l6("presentation:transition-speed", u9i.n5(this.z8));
      }

      if (this.j5 != null) {
         var2.l6("smil:type", this.j5);
      }

      if (this.w1 != null) {
         var2.l6("smil:subtype", this.w1);
      }

      if (this.r4 != n5) {
         var2.l6("smil:direction", q8k.n5(this.r4));
      }

      if (this.c4 != null) {
         var2.l6("smil:fadeColor", this.c4);
      }

      if (com.aspose.slides.ms.System.s4.a6(this.y2, l6)) {
         var2.l6("presentation:duration", n5(this.y2.n3()));
      }

      if (this.y1 != 0) {
         var2.l6("presentation:visibility", m7d.n5(this.y1));
      }

      if (this.a0 != 0) {
         var2.l6("draw:background-size", g3b.n5(this.a0));
      }

      if (this.d2 != -1) {
         var2.l6("presentation:background-objects-visible", this.d2 == 1 ? "true" : "false");
      }

      if (this.d5 != -1) {
         var2.l6("presentation:background-visible", this.d5 == 1 ? "true" : "false");
      }

      if (this.s3 != -1) {
         var2.l6("presentation:display-header", this.s3 == 1 ? "true" : "false");
      }

      if (this.p8 != -1) {
         var2.l6("presentation:display-footer", this.p8 == 1 ? "true" : "false");
      }

      if (this.f2 != -1) {
         var2.l6("presentation:display-page-number", this.f2 == 1 ? "true" : "false");
      }

      if (this.i1 != -1) {
         var2.l6("presentation:display-date-time", this.i1 == 1 ? "true" : "false");
      }

      if (this.e5 != null) {
         this.e5.n5("presentation", var2, "sound");
      }

      List$Enumerator var4 = this.b3.iterator();

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
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final String l6() {
      return this.u3;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }

   public final String k5() {
      return this.u9;
   }

   public final void l6(String var1) {
      this.u9 = var1;
   }

   public final String u3() {
      return this.s7;
   }

   public final void k5(String var1) {
      this.s7 = var1;
   }

   public final int a6() {
      return this.x8;
   }

   public final void l6(int var1) {
      this.x8 = var1;
   }

   public final String u9() {
      return this.n3;
   }

   public final void u3(String var1) {
      this.n3 = var1;
   }

   public final String h0() {
      return this.y4;
   }

   public final void a6(String var1) {
      this.y4 = var1;
   }

   public final String c8() {
      return this.e2;
   }

   public final void u9(String var1) {
      this.e2 = var1;
   }

   public final String t2() {
      return this.t9;
   }

   public final void h0(String var1) {
      this.t9 = var1;
   }

   public final int s7() {
      return this.z1;
   }

   public final void k5(int var1) {
      this.z1 = var1;
   }

   public final String x8() {
      return this.q0;
   }

   public final void c8(String var1) {
      this.q0 = var1;
   }

   public final String n3() {
      return this.z3;
   }

   public final void t2(String var1) {
      this.z3 = var1;
   }

   public final int y4() {
      return this.y1;
   }

   public final void u3(int var1) {
      this.y1 = var1;
   }

   public final byte e2() {
      return this.d2;
   }

   public final void n5(byte var1) {
      this.d2 = var1;
   }

   public final void l6(byte var1) {
      this.d5 = var1;
   }

   public final void k5(byte var1) {
      this.s3 = var1;
   }

   public final byte t9() {
      return this.p8;
   }

   public final void u3(byte var1) {
      this.p8 = var1;
   }

   public final byte z1() {
      return this.f2;
   }

   public final void a6(byte var1) {
      this.f2 = var1;
   }

   public final byte t4() {
      return this.i1;
   }

   public final void u9(byte var1) {
      this.i1 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 q0() {
      return o0;
   }

   // $VF: synthetic method
   static int n5(r9l var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(r9l var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(r9l var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(r9l var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long n5(r9l var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(r9l var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static byte n5(r9l var0, byte var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String a6(r9l var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int l6(r9l var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String u9(r9l var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String h0(r9l var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String c8(r9l var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String t2(r9l var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static int k5(r9l var0, int var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String s7(r9l var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String x8(r9l var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String n3(r9l var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int u3(r9l var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static int a6(r9l var0, int var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static int u9(r9l var0, int var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static int h0(r9l var0, int var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String y4(r9l var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String e2(r9l var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static int c8(r9l var0, int var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String t9(r9l var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 n5(r9l var0) {
      return var0.y2;
   }

   // $VF: synthetic method
   static int t2(r9l var0, int var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static int s7(r9l var0, int var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static byte l6(r9l var0, byte var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static byte k5(r9l var0, byte var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static byte u3(r9l var0, byte var1) {
      return var0.s3 = var1;
   }

   // $VF: synthetic method
   static byte a6(r9l var0, byte var1) {
      return var0.p8 = var1;
   }

   // $VF: synthetic method
   static byte u9(r9l var0, byte var1) {
      return var0.f2 = var1;
   }

   // $VF: synthetic method
   static byte h0(r9l var0, byte var1) {
      return var0.i1 = var1;
   }
}
