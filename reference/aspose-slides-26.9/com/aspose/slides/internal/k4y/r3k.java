package com.aspose.slides.internal.k4y;

public class r3k extends b3 {
   private String u9;
   private String h0;
   private int c8;
   private int t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private int t9;
   private String z1;
   private String t4;
   private int q0;
   private int z3;
   private int m1;
   private String k7;
   private String m3;
   private String z8;
   private String j5;
   private String w1;
   private int r4;
   private int c4;
   private int y2;
   private int y1;
   private double a0;
   private double d2;
   private boolean d5;
   public static final int n5 = x7h.n5("discrete");
   public static final int l6 = q8k.n5("forward");
   public static final int k5 = h2k.n5("in");
   public static final int u3 = q5x.n5("default");
   public static final int a6 = z5q.n5("inherit");
   private static final com.aspose.slides.internal.v6g.u9 s3 = new com.aspose.slides.internal.v6g.u9(
      "smil:targetElement",
      "anim:sub-item",
      "smil:accumulate",
      "smil:additive",
      "smil:values",
      "anim:formula",
      "smil:to",
      "smil:from",
      "smil:by",
      "smil:calcMode",
      "smil:type",
      "smil:subtype",
      "smil:direction",
      "smil:fadeColor",
      "smil:mode",
      "smil:begin",
      "smil:end",
      "smil:dur",
      "smil:repeatDur",
      "smil:repeatCount",
      "smil:restart",
      "smil:restartDefault",
      "smil:fill",
      "smil:fillDefault",
      "smil:accelerate",
      "smil:decelerate",
      "smil:autoReverse"
   );

   public r3k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.z3();
      r3k$1 var2 = new r3k$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public r3k() {
      this.z3();
   }

   private void z3() {
      this.c8 = 0;
      this.t2 = 0;
      this.t9 = n5;
      this.q0 = l6;
      this.z3 = 0;
      this.m1 = k5;
      this.r4 = u3;
      this.c4 = a6;
      this.y2 = 0;
      this.y1 = 0;
      this.a0 = 0.0;
      this.d2 = 0.0;
      this.d5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.u9 != null) {
         var2.l6("smil:targetElement", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("anim:sub-item", this.h0);
      }

      if (this.c8 != 0) {
         var2.l6("smil:accumulate", f7i.n5(this.c8));
      }

      if (this.t2 != 0) {
         var2.l6("smil:additive", z6o.n5(this.t2));
      }

      if (this.s7 != null) {
         var2.l6("smil:values", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("anim:formula", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("smil:to", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("smil:from", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("smil:by", this.e2);
      }

      if (this.t9 != n5) {
         var2.l6("smil:calcMode", x7h.n5(this.t9));
      }

      var2.l6("smil:type", this.z1);
      if (this.t4 != null) {
         var2.l6("smil:subtype", this.t4);
      }

      if (this.q0 != l6) {
         var2.l6("smil:direction", q8k.n5(this.q0));
      }

      var2.l6("smil:fadeColor", l4h.n5(this.z3));
      if (this.m1 != k5) {
         var2.l6("smil:mode", h2k.n5(this.m1));
      }

      if (this.k7 != null) {
         var2.l6("smil:begin", this.k7);
      }

      if (this.m3 != null) {
         var2.l6("smil:end", this.m3);
      }

      if (this.z8 != null) {
         var2.l6("smil:dur", this.z8);
      }

      if (this.j5 != null) {
         var2.l6("smil:repeatDur", this.j5);
      }

      if (this.w1 != null) {
         var2.l6("smil:repeatCount", this.w1);
      }

      if (this.r4 != u3) {
         var2.l6("smil:restart", q5x.n5(this.r4));
      }

      if (this.c4 != a6) {
         var2.l6("smil:restartDefault", z5q.n5(this.c4));
      }

      if (this.y2 != 0) {
         var2.l6("smil:fill", o7g.n5(this.y2));
      }

      if (this.y1 != 0) {
         var2.l6("smil:fillDefault", d1k.n5(this.y1));
      }

      if (this.a0 != 0.0) {
         var2.l6("smil:accelerate", com.aspose.slides.ms.System.Xml.f4.n5(this.a0));
      }

      if (this.d2 != 0.0) {
         var2.l6("smil:decelerate", com.aspose.slides.ms.System.Xml.f4.n5(this.d2));
      }

      if (this.d5) {
         var2.l6("smil:autoReverse", this.d5 ? "true" : "false");
      }

      var2.s7();
   }

   public final String n5() {
      return this.u9;
   }

   public final String l6() {
      return this.h0;
   }

   public final int k5() {
      return this.c8;
   }

   public final int u3() {
      return this.t2;
   }

   public final String a6() {
      return this.z1;
   }

   public final String u9() {
      return this.t4;
   }

   public final int h0() {
      return this.m1;
   }

   public final String c8() {
      return this.z8;
   }

   public final String t2() {
      return this.j5;
   }

   public final String s7() {
      return this.w1;
   }

   public final int x8() {
      return this.r4;
   }

   public final int n3() {
      return this.c4;
   }

   public final int y4() {
      return this.y2;
   }

   public final int e2() {
      return this.y1;
   }

   public final double t9() {
      return this.a0;
   }

   public final double z1() {
      return this.d2;
   }

   public final boolean t4() {
      return this.d5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 q0() {
      return s3;
   }

   // $VF: synthetic method
   static String n5(r3k var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String l6(r3k var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int n5(r3k var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int l6(r3k var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String k5(r3k var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String u3(r3k var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String a6(r3k var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String u9(r3k var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String h0(r3k var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int k5(r3k var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String c8(r3k var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String t2(r3k var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int u3(r3k var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int a6(r3k var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int u9(r3k var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String s7(r3k var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String x8(r3k var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String n3(r3k var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String y4(r3k var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String e2(r3k var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static int h0(r3k var0, int var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static int c8(r3k var0, int var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static int t2(r3k var0, int var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static int s7(r3k var0, int var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static double n5(r3k var0, double var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static double l6(r3k var0, double var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static boolean n5(r3k var0, boolean var1) {
      return var0.d5 = var1;
   }
}
