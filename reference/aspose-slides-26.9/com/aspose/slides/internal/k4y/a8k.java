package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class a8k extends b3 {
   private boolean c8;
   private byte t2;
   private byte s7;
   private int x8;
   private int n3;
   private String y4;
   private String e2;
   private boolean t9;
   private boolean z1;
   private int t4;
   private int q0;
   private boolean z3;
   private int m1;
   private long k7;
   private long m3;
   private long z8;
   private boolean j5;
   private int w1;
   private boolean r4;
   private boolean c4;
   private byte y2;
   private byte y1;
   private byte a0;
   private double d2;
   private double d5;
   private double s3;
   private double p8;
   private long f2;
   private byte i1;
   private byte e5;
   private byte b3;
   private byte o0;
   private byte z7;
   private byte v4;
   private byte u6;
   private int t1;
   private int a5;
   private long h2;
   private int v0;
   private byte f0;
   private byte a3;
   private byte p3;
   private int x9;
   private double y0;
   private double j9;
   private double z6;
   private double e9;
   private byte o5;
   private byte j8;
   private int w2;
   private int s0;
   private boolean v8;
   private String v3;
   private int g7;
   private long j4;
   private double i9;
   private byte f5;
   private byte j3;
   private r6s n1;
   private List<h0> p6;
   public static final int n5 = y6j.n5("none");
   public static final int l6 = q3e.n5("cuboid");
   public static final int k5 = y9g.n5("side-by-side");
   public static final int u3 = r6f.n5("none");
   public static final int a6 = l7m.n5("columns");
   public static final int u9 = c4d.n5("none");
   public static final int h0 = t1o.n5("near-axis");
   private static final com.aspose.slides.internal.v6g.u9 d1 = new com.aspose.slides.internal.v6g.u9(
      "chart:scale-text",
      "chart:three-dimensional",
      "chart:deep",
      "chart:symbol-type",
      "chart:symbol-name",
      "chart:symbol-width",
      "chart:symbol-height",
      "chart:vertical",
      "chart:connect-bars",
      "chart:gap-width",
      "chart:overlap",
      "chart:japanese-candle-stick",
      "chart:interpolation",
      "chart:spline-order",
      "chart:spline-resolution",
      "chart:pie-offset",
      "chart:lines",
      "chart:solid-type",
      "chart:stacked",
      "chart:percentage",
      "chart:link-data-style-to-source",
      "chart:visible",
      "chart:logarithmic",
      "chart:maximum",
      "chart:minimum",
      "chart:origin",
      "chart:interval-major",
      "chart:interval-minor-divisor",
      "chart:tick-marks-major-inner",
      "chart:tick-marks-major-outer",
      "chart:tick-marks-minor-inner",
      "chart:tick-marks-minor-outer",
      "chart:display-label",
      "chart:text-overlap",
      "text:line-break",
      "chart:label-arrangement",
      "style:direction",
      "style:rotation-angle",
      "chart:data-label-number",
      "chart:data-label-text",
      "chart:data-label-symbol",
      "chart:mean-value",
      "chart:error-category",
      "chart:error-percentage",
      "chart:error-margin",
      "chart:error-lower-limit",
      "chart:error-upper-limit",
      "chart:error-upper-indicator",
      "chart:error-lower-indicator",
      "chart:series-source",
      "chart:regression-type",
      "chart:reverse-direction",
      "chart:axis-position",
      "chart:axis-label-position",
      "chart:angle-offset",
      "loext:major-origin",
      "chart:auto-position",
      "chart:auto-size",
      "symbol-image"
   );

   public a8k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.d5();
      a8k$1 var2 = new a8k$1(this);
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
               switch (d1.n5(var1.n3())) {
                  case 58:
                     this.n1 = new r6s(var1);
                     break;
                  default:
                     h0 var5 = new h0(var1);
                     this.p6.addItem(var5);
                     var4 = true;
               }
            }
         }
      }
   }

   public a8k() {
      this.d5();
   }

   private void d5() {
      this.c8 = true;
      this.t2 = -1;
      this.s7 = -1;
      this.x8 = 0;
      this.n3 = 0;
      this.t9 = false;
      this.z1 = false;
      this.t4 = 0;
      this.q0 = 0;
      this.z3 = false;
      this.m1 = n5;
      this.k7 = 2L;
      this.m3 = 20L;
      this.z8 = 0L;
      this.j5 = false;
      this.w1 = l6;
      this.r4 = false;
      this.c4 = false;
      this.y2 = -1;
      this.y1 = -1;
      this.a0 = -1;
      this.d2 = Double.NaN;
      this.d5 = Double.NaN;
      this.s3 = Double.NaN;
      this.p8 = Double.NaN;
      this.f2 = 4294967295L;
      this.i1 = -1;
      this.e5 = -1;
      this.b3 = -1;
      this.o0 = -1;
      this.z7 = -1;
      this.v4 = -1;
      this.u6 = -1;
      this.t1 = k5;
      this.a5 = 0;
      this.h2 = 4294967295L;
      this.v0 = 0;
      this.f0 = -1;
      this.a3 = -1;
      this.p3 = -1;
      this.x9 = u3;
      this.y0 = Double.NaN;
      this.j9 = Double.NaN;
      this.z6 = Double.NaN;
      this.e9 = Double.NaN;
      this.o5 = -1;
      this.j8 = -1;
      this.w2 = a6;
      this.s0 = u9;
      this.v8 = false;
      this.v3 = "start";
      this.g7 = h0;
      this.j4 = 4294967295L;
      this.i9 = Double.NaN;
      this.f5 = -1;
      this.j3 = -1;
      this.p6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.c8) {
         var2.l6("chart:scale-text", this.c8 ? "true" : "false");
      }

      if (this.t2 != -1) {
         var2.l6("chart:three-dimensional", this.t2 == 1 ? "true" : "false");
      }

      if (this.s7 != -1) {
         var2.l6("chart:deep", this.s7 == 1 ? "true" : "false");
      }

      if (this.x8 != 0) {
         var2.l6("chart:symbol-type", b6a.n5(this.x8));
      }

      if (this.n3 != 0) {
         var2.l6("chart:symbol-name", y4i.n5(this.n3));
      }

      if (this.y4 != null) {
         var2.l6("chart:symbol-width", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("chart:symbol-height", this.e2);
      }

      if (this.t9) {
         var2.l6("chart:vertical", this.t9 ? "true" : "false");
      }

      if (this.z1) {
         var2.l6("chart:connect-bars", this.z1 ? "true" : "false");
      }

      if (this.t4 != 0) {
         var2.l6("chart:gap-width", com.aspose.slides.ms.System.Xml.f4.n5(this.t4));
      }

      if (this.q0 != 0) {
         var2.l6("chart:overlap", com.aspose.slides.ms.System.Xml.f4.n5(this.q0));
      }

      if (this.z3) {
         var2.l6("chart:japanese-candle-stick", this.z3 ? "true" : "false");
      }

      if (this.m1 != n5) {
         var2.l6("chart:interpolation", y6j.n5(this.m1));
      }

      if ((this.k7 & 4294967295L) != 2L) {
         var2.l6("chart:spline-order", com.aspose.slides.ms.System.Xml.f4.l6(this.k7));
      }

      if ((this.m3 & 4294967295L) != 20L) {
         var2.l6("chart:spline-resolution", com.aspose.slides.ms.System.Xml.f4.l6(this.m3));
      }

      if ((this.z8 & 4294967295L) != 0L) {
         var2.l6("chart:pie-offset", com.aspose.slides.ms.System.Xml.f4.l6(this.z8));
      }

      if (this.j5) {
         var2.l6("chart:lines", this.j5 ? "true" : "false");
      }

      if (this.w1 != l6) {
         var2.l6("chart:solid-type", q3e.n5(this.w1));
      }

      if (this.r4) {
         var2.l6("chart:stacked", this.r4 ? "true" : "false");
      }

      if (this.c4) {
         var2.l6("chart:percentage", this.c4 ? "true" : "false");
      }

      if (this.y2 != -1) {
         var2.l6("chart:link-data-style-to-source", this.y2 == 1 ? "true" : "false");
      }

      if (this.y1 != -1) {
         var2.l6("chart:visible", this.y1 == 1 ? "true" : "false");
      }

      if (this.a0 != -1) {
         var2.l6("chart:logarithmic", this.a0 == 1 ? "true" : "false");
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.d2)) {
         var2.l6("chart:maximum", com.aspose.slides.ms.System.Xml.f4.n5(this.d2));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.d5)) {
         var2.l6("chart:minimum", com.aspose.slides.ms.System.Xml.f4.n5(this.d5));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.s3)) {
         var2.l6("chart:origin", com.aspose.slides.ms.System.Xml.f4.n5(this.s3));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.p8)) {
         var2.l6("chart:interval-major", com.aspose.slides.ms.System.Xml.f4.n5(this.p8));
      }

      if ((this.f2 & 4294967295L) != 4294967295L) {
         var2.l6("chart:interval-minor-divisor", com.aspose.slides.ms.System.Xml.f4.l6(this.f2));
      }

      if (this.i1 != -1) {
         var2.l6("chart:tick-marks-major-inner", this.i1 == 1 ? "true" : "false");
      }

      if (this.e5 != -1) {
         var2.l6("chart:tick-marks-major-outer", this.e5 == 1 ? "true" : "false");
      }

      if (this.b3 != -1) {
         var2.l6("chart:tick-marks-minor-inner", this.b3 == 1 ? "true" : "false");
      }

      if (this.o0 != -1) {
         var2.l6("chart:tick-marks-minor-outer", this.o0 == 1 ? "true" : "false");
      }

      if (this.z7 != -1) {
         var2.l6("chart:display-label", this.z7 == 1 ? "true" : "false");
      }

      if (this.v4 != -1) {
         var2.l6("chart:text-overlap", this.v4 == 1 ? "true" : "false");
      }

      if (this.u6 != -1) {
         var2.l6("text:line-break", this.u6 == 1 ? "true" : "false");
      }

      if (this.t1 != k5) {
         var2.l6("chart:label-arrangement", y9g.n5(this.t1));
      }

      if (this.a5 != 0) {
         var2.l6("style:direction", p0j.n5(this.a5));
      }

      if ((this.h2 & 4294967295L) != 4294967295L) {
         var2.l6("style:rotation-angle", com.aspose.slides.ms.System.Xml.f4.l6(this.h2));
      }

      if (this.v0 != 0) {
         var2.l6("chart:data-label-number", z1k.n5(this.v0));
      }

      if (this.f0 != -1) {
         var2.l6("chart:data-label-text", this.f0 == 1 ? "true" : "false");
      }

      if (this.a3 != -1) {
         var2.l6("chart:data-label-symbol", this.a3 == 1 ? "true" : "false");
      }

      if (this.p3 != -1) {
         var2.l6("chart:mean-value", this.p3 == 1 ? "true" : "false");
      }

      if (this.x9 != u3) {
         var2.l6("chart:error-category", r6f.n5(this.x9));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.y0)) {
         var2.l6("chart:error-percentage", com.aspose.slides.ms.System.Xml.f4.n5(this.y0));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.j9)) {
         var2.l6("chart:error-margin", com.aspose.slides.ms.System.Xml.f4.n5(this.j9));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.z6)) {
         var2.l6("chart:error-lower-limit", com.aspose.slides.ms.System.Xml.f4.n5(this.z6));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.e9)) {
         var2.l6("chart:error-upper-limit", com.aspose.slides.ms.System.Xml.f4.n5(this.e9));
      }

      if (this.o5 != -1) {
         var2.l6("chart:error-upper-indicator", this.o5 == 1 ? "true" : "false");
      }

      if (this.j8 != -1) {
         var2.l6("chart:error-lower-indicator", this.j8 == 1 ? "true" : "false");
      }

      if (this.w2 != a6) {
         var2.l6("chart:series-source", l7m.n5(this.w2));
      }

      if (this.s0 != u9) {
         var2.l6("chart:regression-type", c4d.n5(this.s0));
      }

      if (this.v8) {
         var2.l6("chart:reverse-direction", this.v8 ? "true" : "false");
      }

      if (!"start".equals(this.v3)) {
         var2.l6("chart:axis-position", this.v3);
      }

      if (this.g7 != h0) {
         var2.l6("chart:axis-label-position", t1o.n5(this.g7));
      }

      if ((this.j4 & 4294967295L) != 4294967295L) {
         var2.l6("chart:angle-offset", com.aspose.slides.ms.System.Xml.f4.l6(this.j4));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.i9)) {
         var2.l6("loext:major-origin", com.aspose.slides.ms.System.Xml.f4.n5(this.i9));
      }

      if (this.f5 != -1) {
         var2.l6("chart:auto-position", this.f5 == 1 ? "true" : "false");
      }

      if (this.j3 != -1) {
         var2.l6("chart:auto-size", this.j3 == 1 ? "true" : "false");
      }

      if (this.n1 != null) {
         this.n1.n5("chart", var2, "symbol-image");
      }

      List$Enumerator var4 = this.p6.iterator();

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

   public final byte n5() {
      return this.t2;
   }

   public final int l6() {
      return this.x8;
   }

   public final int k5() {
      return this.n3;
   }

   public final String u3() {
      return this.y4;
   }

   public final String a6() {
      return this.e2;
   }

   public final boolean u9() {
      return this.t9;
   }

   public final int h0() {
      return this.t4;
   }

   public final int c8() {
      return this.q0;
   }

   public final int t2() {
      return this.m1;
   }

   public final long s7() {
      return this.z8;
   }

   public final int x8() {
      return this.w1;
   }

   public final boolean n3() {
      return this.r4;
   }

   public final boolean y4() {
      return this.c4;
   }

   public final byte e2() {
      return this.y1;
   }

   public final byte t9() {
      return this.a0;
   }

   public final double z1() {
      return this.d2;
   }

   public final double t4() {
      return this.d5;
   }

   public final double q0() {
      return this.p8;
   }

   public final long z3() {
      return this.f2;
   }

   public final byte m1() {
      return this.i1;
   }

   public final byte k7() {
      return this.b3;
   }

   public final byte m3() {
      return this.z7;
   }

   public final long z8() {
      return this.h2;
   }

   public final boolean j5() {
      return this.v8;
   }

   public final String w1() {
      return this.v3;
   }

   public final int r4() {
      return this.g7;
   }

   public final long c4() {
      return this.j4;
   }

   public final double y2() {
      return this.i9;
   }

   public final byte y1() {
      return this.f5;
   }

   public final byte a0() {
      return this.j3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 d2() {
      return d1;
   }

   // $VF: synthetic method
   static boolean n5(a8k var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static byte n5(a8k var0, byte var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static byte l6(a8k var0, byte var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int n5(a8k var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int l6(a8k var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String n5(a8k var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String l6(a8k var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static boolean l6(a8k var0, boolean var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean k5(a8k var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static int k5(a8k var0, int var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int u3(a8k var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static boolean u3(a8k var0, boolean var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int a6(a8k var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static long n5(a8k var0, long var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static long l6(a8k var0, long var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static long k5(a8k var0, long var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static boolean a6(a8k var0, boolean var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static int u9(a8k var0, int var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static boolean u9(a8k var0, boolean var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static boolean h0(a8k var0, boolean var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static byte k5(a8k var0, byte var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static byte u3(a8k var0, byte var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static byte a6(a8k var0, byte var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static double n5(a8k var0, double var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static double l6(a8k var0, double var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static double k5(a8k var0, double var1) {
      return var0.s3 = var1;
   }

   // $VF: synthetic method
   static double u3(a8k var0, double var1) {
      return var0.p8 = var1;
   }

   // $VF: synthetic method
   static long u3(a8k var0, long var1) {
      return var0.f2 = var1;
   }

   // $VF: synthetic method
   static byte u9(a8k var0, byte var1) {
      return var0.i1 = var1;
   }

   // $VF: synthetic method
   static byte h0(a8k var0, byte var1) {
      return var0.e5 = var1;
   }

   // $VF: synthetic method
   static byte c8(a8k var0, byte var1) {
      return var0.b3 = var1;
   }

   // $VF: synthetic method
   static byte t2(a8k var0, byte var1) {
      return var0.o0 = var1;
   }

   // $VF: synthetic method
   static byte s7(a8k var0, byte var1) {
      return var0.z7 = var1;
   }

   // $VF: synthetic method
   static byte x8(a8k var0, byte var1) {
      return var0.v4 = var1;
   }

   // $VF: synthetic method
   static byte n3(a8k var0, byte var1) {
      return var0.u6 = var1;
   }

   // $VF: synthetic method
   static int h0(a8k var0, int var1) {
      return var0.t1 = var1;
   }

   // $VF: synthetic method
   static int c8(a8k var0, int var1) {
      return var0.a5 = var1;
   }

   // $VF: synthetic method
   static long a6(a8k var0, long var1) {
      return var0.h2 = var1;
   }

   // $VF: synthetic method
   static int t2(a8k var0, int var1) {
      return var0.v0 = var1;
   }

   // $VF: synthetic method
   static byte y4(a8k var0, byte var1) {
      return var0.f0 = var1;
   }

   // $VF: synthetic method
   static byte e2(a8k var0, byte var1) {
      return var0.a3 = var1;
   }

   // $VF: synthetic method
   static byte t9(a8k var0, byte var1) {
      return var0.p3 = var1;
   }

   // $VF: synthetic method
   static int s7(a8k var0, int var1) {
      return var0.x9 = var1;
   }

   // $VF: synthetic method
   static double a6(a8k var0, double var1) {
      return var0.y0 = var1;
   }

   // $VF: synthetic method
   static double u9(a8k var0, double var1) {
      return var0.j9 = var1;
   }

   // $VF: synthetic method
   static double h0(a8k var0, double var1) {
      return var0.z6 = var1;
   }

   // $VF: synthetic method
   static double c8(a8k var0, double var1) {
      return var0.e9 = var1;
   }

   // $VF: synthetic method
   static byte z1(a8k var0, byte var1) {
      return var0.o5 = var1;
   }

   // $VF: synthetic method
   static byte t4(a8k var0, byte var1) {
      return var0.j8 = var1;
   }

   // $VF: synthetic method
   static int x8(a8k var0, int var1) {
      return var0.w2 = var1;
   }

   // $VF: synthetic method
   static int n3(a8k var0, int var1) {
      return var0.s0 = var1;
   }

   // $VF: synthetic method
   static boolean c8(a8k var0, boolean var1) {
      return var0.v8 = var1;
   }

   // $VF: synthetic method
   static String k5(a8k var0, String var1) {
      return var0.v3 = var1;
   }

   // $VF: synthetic method
   static int y4(a8k var0, int var1) {
      return var0.g7 = var1;
   }

   // $VF: synthetic method
   static long u9(a8k var0, long var1) {
      return var0.j4 = var1;
   }

   // $VF: synthetic method
   static double t2(a8k var0, double var1) {
      return var0.i9 = var1;
   }

   // $VF: synthetic method
   static byte q0(a8k var0, byte var1) {
      return var0.f5 = var1;
   }

   // $VF: synthetic method
   static byte z3(a8k var0, byte var1) {
      return var0.j3 = var1;
   }
}
