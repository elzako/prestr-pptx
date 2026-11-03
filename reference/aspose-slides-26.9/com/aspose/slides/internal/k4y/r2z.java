package com.aspose.slides.internal.k4y;

public class r2z extends b3 {
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private int n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private String z3;
   private int m1;
   private int k7;
   private int m3;
   private int z8;
   private double j5;
   private double w1;
   private boolean r4;
   private int c4;
   private int y2;
   public static final int n5 = x7h.n5("discrete");
   public static final int l6 = q5x.n5("default");
   public static final int k5 = z5q.n5("inherit");
   private static final com.aspose.slides.internal.v6g.u9 y1 = new com.aspose.slides.internal.v6g.u9(
      "smil:targetElement",
      "anim:sub-item",
      "smil:attributeName",
      "smil:values",
      "anim:formula",
      "smil:to",
      "smil:from",
      "smil:by",
      "smil:calcMode",
      "smil:keyTimes",
      "smil:keySplines",
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
      "smil:autoReverse",
      "smil:accumulate",
      "smil:additive"
   );

   public r2z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.z8();
      r2z$1 var2 = new r2z$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public r2z() {
      this.z8();
   }

   private void z8() {
      this.n3 = n5;
      this.m1 = l6;
      this.k7 = k5;
      this.m3 = 0;
      this.z8 = 0;
      this.j5 = 0.0;
      this.w1 = 0.0;
      this.r4 = false;
      this.c4 = 0;
      this.y2 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.u3 != null) {
         var2.l6("smil:targetElement", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("anim:sub-item", this.a6);
      }

      var2.l6("smil:attributeName", this.u9);
      if (this.h0 != null) {
         var2.l6("smil:values", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("anim:formula", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("smil:to", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("smil:from", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("smil:by", this.x8);
      }

      if (this.n3 != n5) {
         var2.l6("smil:calcMode", x7h.n5(this.n3));
      }

      if (this.y4 != null) {
         var2.l6("smil:keyTimes", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("smil:keySplines", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("smil:begin", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("smil:end", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("smil:dur", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("smil:repeatDur", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("smil:repeatCount", this.z3);
      }

      if (this.m1 != l6) {
         var2.l6("smil:restart", q5x.n5(this.m1));
      }

      if (this.k7 != k5) {
         var2.l6("smil:restartDefault", z5q.n5(this.k7));
      }

      if (this.m3 != 0) {
         var2.l6("smil:fill", o7g.n5(this.m3));
      }

      if (this.z8 != 0) {
         var2.l6("smil:fillDefault", d1k.n5(this.z8));
      }

      if (this.j5 != 0.0) {
         var2.l6("smil:accelerate", com.aspose.slides.ms.System.Xml.f4.n5(this.j5));
      }

      if (this.w1 != 0.0) {
         var2.l6("smil:decelerate", com.aspose.slides.ms.System.Xml.f4.n5(this.w1));
      }

      if (this.r4) {
         var2.l6("smil:autoReverse", this.r4 ? "true" : "false");
      }

      if (this.c4 != 0) {
         var2.l6("smil:accumulate", f7i.n5(this.c4));
      }

      if (this.y2 != 0) {
         var2.l6("smil:additive", z6o.n5(this.y2));
      }

      var2.s7();
   }

   public final String n5() {
      return this.u3;
   }

   public final String l6() {
      return this.a6;
   }

   public final String k5() {
      return this.u9;
   }

   public final String u3() {
      return this.h0;
   }

   public final String a6() {
      return this.c8;
   }

   public final String u9() {
      return this.t2;
   }

   public final String h0() {
      return this.y4;
   }

   public final String c8() {
      return this.t9;
   }

   public final String t2() {
      return this.z1;
   }

   public final String s7() {
      return this.t4;
   }

   public final String x8() {
      return this.q0;
   }

   public final String n3() {
      return this.z3;
   }

   public final int y4() {
      return this.m1;
   }

   public final int e2() {
      return this.k7;
   }

   public final int t9() {
      return this.m3;
   }

   public final int z1() {
      return this.z8;
   }

   public final double t4() {
      return this.j5;
   }

   public final double q0() {
      return this.w1;
   }

   public final boolean z3() {
      return this.r4;
   }

   public final int m1() {
      return this.c4;
   }

   public final int k7() {
      return this.y2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 m3() {
      return y1;
   }

   // $VF: synthetic method
   static String n5(r2z var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(r2z var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(r2z var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u3(r2z var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String a6(r2z var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u9(r2z var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String h0(r2z var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String c8(r2z var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int n5(r2z var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String t2(r2z var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String s7(r2z var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String x8(r2z var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String n3(r2z var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String y4(r2z var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String e2(r2z var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String t9(r2z var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int l6(r2z var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static int k5(r2z var0, int var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static int u3(r2z var0, int var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static int a6(r2z var0, int var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static double n5(r2z var0, double var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static double l6(r2z var0, double var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static boolean n5(r2z var0, boolean var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static int u9(r2z var0, int var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static int h0(r2z var0, int var1) {
      return var0.y2 = var1;
   }
}
