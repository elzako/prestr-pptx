package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class y1z extends b3 {
   private String u9;
   private String h0;
   private boolean c8;
   private boolean t2;
   private String s7;
   private String x8;
   private double n3;
   private boolean y4;
   private boolean e2;
   private boolean t9;
   private boolean z1;
   private String t4;
   private String q0;
   private String z3;
   private int m1;
   private boolean k7;
   private boolean m3;
   private boolean z8;
   private String j5;
   private String w1;
   private String r4;
   private String c4;
   private boolean y2;
   private int y1;
   private String a0;
   private String d2;
   private String d5;
   private String s3;
   private String p8;
   private int f2;
   private String i1;
   private String e5;
   private boolean b3;
   private String o0;
   private double z7;
   private double v4;
   private String u6;
   private String t1;
   private int a5;
   private String h2;
   private boolean v0;
   private int f0;
   private int a3;
   private boolean p3;
   private String x9;
   private List<j2l> y0;
   private List<m1f> j9;
   public static final int n5 = q2k.n5("flat");
   public static final int l6 = h6h.n5("parallel");
   public static final int k5 = t2u.n5("none");
   public static final int u3 = r9x.n5("normal");
   public static final int a6 = u5x.n5("path");
   private static final com.aspose.slides.internal.v6g.u9 z6 = new com.aspose.slides.internal.v6g.u9(
      "draw:type",
      "svg:viewBox",
      "draw:mirror-vertical",
      "draw:mirror-horizontal",
      "drawooo:sub-view-size",
      "drawooo:enhanced-path",
      "draw:text-rotate-angle",
      "draw:extrusion-allowed",
      "draw:text-path-allowed",
      "draw:concentric-gradient-fill-allowed",
      "draw:extrusion",
      "draw:extrusion-brightness",
      "draw:extrusion-depth",
      "draw:extrusion-diffusion",
      "draw:extrusion-number-of-line-segments",
      "draw:extrusion-light-face",
      "draw:extrusion-first-light-harsh",
      "draw:extrusion-second-light-harsh",
      "draw:extrusion-first-light-level",
      "draw:extrusion-second-light-level",
      "draw:extrusion-first-light-direction",
      "draw:extrusion-second-light-direction",
      "draw:extrusion-metal",
      "dr3d:shade-mode",
      "draw:extrusion-rotation-angle",
      "draw:extrusion-rotation-center",
      "draw:extrusion-shininess",
      "draw:extrusion-skew",
      "draw:extrusion-specularity",
      "dr3d:projection",
      "draw:extrusion-viewpoint",
      "draw:extrusion-origin",
      "draw:extrusion-color",
      "draw:enhanced-path",
      "draw:path-stretchpoint-x",
      "draw:path-stretchpoint-y",
      "draw:text-areas",
      "draw:glue-points",
      "draw:glue-point-type",
      "draw:glue-point-leaving-directions",
      "draw:text-path",
      "draw:text-path-mode",
      "draw:text-path-scale",
      "draw:text-path-same-letter-heights",
      "draw:modifiers",
      "equation",
      "handle"
   );

   public y1z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t9();
      y1z$1 var2 = new y1z$1(this);
      n5(var1, var2);
      n5(var1, new y1z$2(this, var1));
   }

   public y1z() {
      this.t9();
   }

   private void t9() {
      this.c8 = false;
      this.t2 = false;
      this.n3 = 0.0;
      this.y4 = false;
      this.e2 = false;
      this.t9 = false;
      this.z1 = false;
      this.t4 = "33%";
      this.q0 = "36pt 0";
      this.z3 = "0%";
      this.m1 = 30;
      this.k7 = true;
      this.m3 = true;
      this.z8 = true;
      this.j5 = "66%";
      this.w1 = "66%";
      this.r4 = "(5 0 1)";
      this.c4 = "(-5 0 1)";
      this.y2 = false;
      this.y1 = n5;
      this.a0 = "0 0";
      this.d5 = "50%";
      this.s3 = "50 45";
      this.p8 = "0%";
      this.f2 = l6;
      this.i1 = "3.5cm -3.5cm 25cm";
      this.e5 = "0.5 -0.5";
      this.b3 = false;
      this.z7 = 0.0;
      this.v4 = 0.0;
      this.a5 = k5;
      this.v0 = false;
      this.f0 = u3;
      this.a3 = a6;
      this.p3 = false;
      this.y0 = new List<>();
      this.j9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:type", this.u9);
      if (this.h0 != null) {
         var2.l6("svg:viewBox", this.h0);
      }

      if (this.c8) {
         var2.l6("draw:mirror-vertical", this.c8 ? "true" : "false");
      }

      if (this.t2) {
         var2.l6("draw:mirror-horizontal", this.t2 ? "true" : "false");
      }

      if (this.s7 != null) {
         var2.l6("drawooo:sub-view-size", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("drawooo:enhanced-path", this.x8);
      }

      if (this.n3 != 0.0) {
         var2.l6("draw:text-rotate-angle", com.aspose.slides.ms.System.Xml.f4.n5(this.n3));
      }

      if (this.y4) {
         var2.l6("draw:extrusion-allowed", this.y4 ? "true" : "false");
      }

      if (this.e2) {
         var2.l6("draw:text-path-allowed", this.e2 ? "true" : "false");
      }

      if (this.t9) {
         var2.l6("draw:concentric-gradient-fill-allowed", this.t9 ? "true" : "false");
      }

      if (this.z1) {
         var2.l6("draw:extrusion", this.z1 ? "true" : "false");
      }

      if (!"33%".equals(this.t4)) {
         var2.l6("draw:extrusion-brightness", this.t4);
      }

      if (!"36pt 0".equals(this.q0)) {
         var2.l6("draw:extrusion-depth", this.q0);
      }

      if (!"0%".equals(this.z3)) {
         var2.l6("draw:extrusion-diffusion", this.z3);
      }

      if (this.m1 != 30) {
         var2.l6("draw:extrusion-number-of-line-segments", com.aspose.slides.ms.System.Xml.f4.n5(this.m1));
      }

      if (!this.k7) {
         var2.l6("draw:extrusion-light-face", this.k7 ? "true" : "false");
      }

      if (!this.m3) {
         var2.l6("draw:extrusion-first-light-harsh", this.m3 ? "true" : "false");
      }

      if (!this.z8) {
         var2.l6("draw:extrusion-second-light-harsh", this.z8 ? "true" : "false");
      }

      if (!"66%".equals(this.j5)) {
         var2.l6("draw:extrusion-first-light-level", this.j5);
      }

      if (!"66%".equals(this.w1)) {
         var2.l6("draw:extrusion-second-light-level", this.w1);
      }

      if (!"(5 0 1)".equals(this.r4)) {
         var2.l6("draw:extrusion-first-light-direction", this.r4);
      }

      if (!"(-5 0 1)".equals(this.c4)) {
         var2.l6("draw:extrusion-second-light-direction", this.c4);
      }

      if (this.y2) {
         var2.l6("draw:extrusion-metal", this.y2 ? "true" : "false");
      }

      if (this.y1 != n5) {
         var2.l6("dr3d:shade-mode", q2k.n5(this.y1));
      }

      if (!"0 0".equals(this.a0)) {
         var2.l6("draw:extrusion-rotation-angle", this.a0);
      }

      if (this.d2 != null) {
         var2.l6("draw:extrusion-rotation-center", this.d2);
      }

      if (!"50%".equals(this.d5)) {
         var2.l6("draw:extrusion-shininess", this.d5);
      }

      if (!"50 45".equals(this.s3)) {
         var2.l6("draw:extrusion-skew", this.s3);
      }

      if (!"0%".equals(this.p8)) {
         var2.l6("draw:extrusion-specularity", this.p8);
      }

      if (this.f2 != l6) {
         var2.l6("dr3d:projection", h6h.n5(this.f2));
      }

      if (!"3.5cm -3.5cm 25cm".equals(this.i1)) {
         var2.l6("draw:extrusion-viewpoint", this.i1);
      }

      if (!"0.5 -0.5".equals(this.e5)) {
         var2.l6("draw:extrusion-origin", this.e5);
      }

      if (this.b3) {
         var2.l6("draw:extrusion-color", this.b3 ? "true" : "false");
      }

      if (this.o0 != null) {
         var2.l6("draw:enhanced-path", this.o0);
      }

      if (this.z7 != 0.0) {
         var2.l6("draw:path-stretchpoint-x", com.aspose.slides.ms.System.Xml.f4.n5(this.z7));
      }

      if (this.v4 != 0.0) {
         var2.l6("draw:path-stretchpoint-y", com.aspose.slides.ms.System.Xml.f4.n5(this.v4));
      }

      if (this.u6 != null) {
         var2.l6("draw:text-areas", this.u6);
      }

      if (this.t1 != null) {
         var2.l6("draw:glue-points", this.t1);
      }

      if (this.a5 != k5) {
         var2.l6("draw:glue-point-type", t2u.n5(this.a5));
      }

      if (this.h2 != null) {
         var2.l6("draw:glue-point-leaving-directions", this.h2);
      }

      if (this.v0) {
         var2.l6("draw:text-path", this.v0 ? "true" : "false");
      }

      if (this.f0 != u3) {
         var2.l6("draw:text-path-mode", r9x.n5(this.f0));
      }

      if (this.a3 != a6) {
         var2.l6("draw:text-path-scale", u5x.n5(this.a3));
      }

      if (this.p3) {
         var2.l6("draw:text-path-same-letter-heights", this.p3 ? "true" : "false");
      }

      if (this.x9 != null) {
         var2.l6("draw:modifiers", this.x9);
      }

      List$Enumerator var4 = this.y0.iterator();

      try {
         while (var4.hasNext()) {
            j2l var5 = (j2l)var4.next();
            var5.n5("draw", var2, "equation");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.j9.iterator();

      try {
         while (var14.hasNext()) {
            m1f var6 = (m1f)var14.next();
            var6.n5("draw", var2, "handle");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   public final j2l n5() {
      j2l var1 = new j2l();
      this.y0.addItem(var1);
      return var1;
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

   public final void l6(String var1) {
      this.h0 = var1;
   }

   public final boolean u3() {
      return this.c8;
   }

   public final boolean a6() {
      return this.t2;
   }

   public final String u9() {
      return this.s7;
   }

   public final String h0() {
      return this.o0;
   }

   public final void k5(String var1) {
      this.o0 = var1;
   }

   public final double c8() {
      return this.z7;
   }

   public final double t2() {
      return this.v4;
   }

   public final String s7() {
      return this.u6;
   }

   public final boolean x8() {
      return this.v0;
   }

   public final String n3() {
      return this.x9;
   }

   public final void u3(String var1) {
      this.x9 = var1;
   }

   public final j2l[] y4() {
      return this.y0.toArray(new j2l[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 e2() {
      return z6;
   }

   // $VF: synthetic method
   static String n5(y1z var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String l6(y1z var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean n5(y1z var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean l6(y1z var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String k5(y1z var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String u3(y1z var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static double n5(y1z var0, double var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(y1z var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean u3(y1z var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static boolean a6(y1z var0, boolean var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean u9(y1z var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String a6(y1z var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String u9(y1z var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String h0(y1z var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int n5(y1z var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static boolean h0(y1z var0, boolean var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static boolean c8(y1z var0, boolean var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static boolean t2(y1z var0, boolean var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String c8(y1z var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String t2(y1z var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static String s7(y1z var0, String var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String x8(y1z var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static boolean s7(y1z var0, boolean var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static int l6(y1z var0, int var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static String n3(y1z var0, String var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static String y4(y1z var0, String var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static String e2(y1z var0, String var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static String t9(y1z var0, String var1) {
      return var0.s3 = var1;
   }

   // $VF: synthetic method
   static String z1(y1z var0, String var1) {
      return var0.p8 = var1;
   }

   // $VF: synthetic method
   static int k5(y1z var0, int var1) {
      return var0.f2 = var1;
   }

   // $VF: synthetic method
   static String t4(y1z var0, String var1) {
      return var0.i1 = var1;
   }

   // $VF: synthetic method
   static String q0(y1z var0, String var1) {
      return var0.e5 = var1;
   }

   // $VF: synthetic method
   static boolean x8(y1z var0, boolean var1) {
      return var0.b3 = var1;
   }

   // $VF: synthetic method
   static String z3(y1z var0, String var1) {
      return var0.o0 = var1;
   }

   // $VF: synthetic method
   static double l6(y1z var0, double var1) {
      return var0.z7 = var1;
   }

   // $VF: synthetic method
   static double k5(y1z var0, double var1) {
      return var0.v4 = var1;
   }

   // $VF: synthetic method
   static String m1(y1z var0, String var1) {
      return var0.u6 = var1;
   }

   // $VF: synthetic method
   static String k7(y1z var0, String var1) {
      return var0.t1 = var1;
   }

   // $VF: synthetic method
   static int u3(y1z var0, int var1) {
      return var0.a5 = var1;
   }

   // $VF: synthetic method
   static String m3(y1z var0, String var1) {
      return var0.h2 = var1;
   }

   // $VF: synthetic method
   static boolean n3(y1z var0, boolean var1) {
      return var0.v0 = var1;
   }

   // $VF: synthetic method
   static int a6(y1z var0, int var1) {
      return var0.f0 = var1;
   }

   // $VF: synthetic method
   static int u9(y1z var0, int var1) {
      return var0.a3 = var1;
   }

   // $VF: synthetic method
   static boolean y4(y1z var0, boolean var1) {
      return var0.p3 = var1;
   }

   // $VF: synthetic method
   static String z8(y1z var0, String var1) {
      return var0.x9 = var1;
   }

   // $VF: synthetic method
   static List n5(y1z var0) {
      return var0.y0;
   }

   // $VF: synthetic method
   static List l6(y1z var0) {
      return var0.j9;
   }
}
