package com.aspose.slides.internal.k4y;

public class y2d extends b3 {
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private int n3;
   private int y4;
   private int e2;
   private int t9;
   private double z1;
   private double t4;
   private boolean q0;
   private int z3;
   private int m1;
   public static final int n5 = q5x.n5("default");
   public static final int l6 = z5q.n5("inherit");
   private static final com.aspose.slides.internal.v6g.u9 k7 = new com.aspose.slides.internal.v6g.u9(
      "smil:targetElement",
      "anim:sub-item",
      "smil:attributeName",
      "smil:to",
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

   public y2d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.m1();
      y2d$1 var2 = new y2d$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public y2d() {
      this.m1();
   }

   private void m1() {
      this.n3 = n5;
      this.y4 = l6;
      this.e2 = 0;
      this.t9 = 0;
      this.z1 = 0.0;
      this.t4 = 0.0;
      this.q0 = false;
      this.z3 = 0;
      this.m1 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != null) {
         var2.l6("smil:targetElement", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("anim:sub-item", this.u3);
      }

      var2.l6("smil:attributeName", this.a6);
      if (this.u9 != null) {
         var2.l6("smil:to", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("smil:begin", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("smil:end", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("smil:dur", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("smil:repeatDur", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("smil:repeatCount", this.x8);
      }

      if (this.n3 != n5) {
         var2.l6("smil:restart", q5x.n5(this.n3));
      }

      if (this.y4 != l6) {
         var2.l6("smil:restartDefault", z5q.n5(this.y4));
      }

      if (this.e2 != 0) {
         var2.l6("smil:fill", o7g.n5(this.e2));
      }

      if (this.t9 != 0) {
         var2.l6("smil:fillDefault", d1k.n5(this.t9));
      }

      if (this.z1 != 0.0) {
         var2.l6("smil:accelerate", com.aspose.slides.ms.System.Xml.f4.n5(this.z1));
      }

      if (this.t4 != 0.0) {
         var2.l6("smil:decelerate", com.aspose.slides.ms.System.Xml.f4.n5(this.t4));
      }

      if (this.q0) {
         var2.l6("smil:autoReverse", this.q0 ? "true" : "false");
      }

      if (this.z3 != 0) {
         var2.l6("smil:accumulate", f7i.n5(this.z3));
      }

      if (this.m1 != 0) {
         var2.l6("smil:additive", z6o.n5(this.m1));
      }

      var2.s7();
   }

   public final String n5() {
      return this.k5;
   }

   public final String l6() {
      return this.u3;
   }

   public final String k5() {
      return this.a6;
   }

   public final String u3() {
      return this.u9;
   }

   public final String a6() {
      return this.h0;
   }

   public final String u9() {
      return this.c8;
   }

   public final String h0() {
      return this.t2;
   }

   public final String c8() {
      return this.s7;
   }

   public final String t2() {
      return this.x8;
   }

   public final int s7() {
      return this.n3;
   }

   public final int x8() {
      return this.y4;
   }

   public final int n3() {
      return this.e2;
   }

   public final int y4() {
      return this.t9;
   }

   public final double e2() {
      return this.z1;
   }

   public final double t9() {
      return this.t4;
   }

   public final boolean z1() {
      return this.q0;
   }

   public final int t4() {
      return this.z3;
   }

   public final int q0() {
      return this.m1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 z3() {
      return k7;
   }

   // $VF: synthetic method
   static String n5(y2d var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(y2d var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(y2d var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(y2d var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String a6(y2d var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u9(y2d var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String h0(y2d var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String c8(y2d var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String t2(y2d var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int n5(y2d var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static int l6(y2d var0, int var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static int k5(y2d var0, int var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int u3(y2d var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static double n5(y2d var0, double var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static double l6(y2d var0, double var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static boolean n5(y2d var0, boolean var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int a6(y2d var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int u9(y2d var0, int var1) {
      return var0.m1 = var1;
   }
}
