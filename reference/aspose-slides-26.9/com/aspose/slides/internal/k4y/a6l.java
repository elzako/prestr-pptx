package com.aspose.slides.internal.k4y;

public class a6l extends b3 {
   private String k5;
   private String u3;
   private String a6;
   private int u9;
   private int h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private String n3;
   private int y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private int z3;
   private int m1;
   private int k7;
   private int m3;
   private double z8;
   private double j5;
   private boolean w1;
   public static final int n5 = q5x.n5("default");
   public static final int l6 = z5q.n5("inherit");
   private static final com.aspose.slides.internal.v6g.u9 r4 = new com.aspose.slides.internal.v6g.u9(
      "smil:targetElement",
      "anim:sub-item",
      "smil:attributeName",
      "smil:accumulate",
      "smil:additive",
      "smil:values",
      "anim:formula",
      "smil:to",
      "smil:from",
      "smil:by",
      "svg:type",
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

   public a6l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      a6l$1 var2 = new a6l$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public a6l() {
      this.l6();
   }

   private void l6() {
      this.u9 = 0;
      this.h0 = 0;
      this.y4 = 0;
      this.z3 = n5;
      this.m1 = l6;
      this.k7 = 0;
      this.m3 = 0;
      this.z8 = 0.0;
      this.j5 = 0.0;
      this.w1 = false;
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
      if (this.u9 != 0) {
         var2.l6("smil:accumulate", f7i.n5(this.u9));
      }

      if (this.h0 != 0) {
         var2.l6("smil:additive", z6o.n5(this.h0));
      }

      if (this.c8 != null) {
         var2.l6("smil:values", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("anim:formula", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("smil:to", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("smil:from", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("smil:by", this.n3);
      }

      var2.l6("svg:type", t6s.n5(this.y4));
      if (this.e2 != null) {
         var2.l6("smil:begin", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("smil:end", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("smil:dur", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("smil:repeatDur", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("smil:repeatCount", this.q0);
      }

      if (this.z3 != n5) {
         var2.l6("smil:restart", q5x.n5(this.z3));
      }

      if (this.m1 != l6) {
         var2.l6("smil:restartDefault", z5q.n5(this.m1));
      }

      if (this.k7 != 0) {
         var2.l6("smil:fill", o7g.n5(this.k7));
      }

      if (this.m3 != 0) {
         var2.l6("smil:fillDefault", d1k.n5(this.m3));
      }

      if (this.z8 != 0.0) {
         var2.l6("smil:accelerate", com.aspose.slides.ms.System.Xml.f4.n5(this.z8));
      }

      if (this.j5 != 0.0) {
         var2.l6("smil:decelerate", com.aspose.slides.ms.System.Xml.f4.n5(this.j5));
      }

      if (this.w1) {
         var2.l6("smil:autoReverse", this.w1 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return r4;
   }

   // $VF: synthetic method
   static String n5(a6l var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(a6l var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(a6l var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int n5(a6l var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int l6(a6l var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(a6l var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(a6l var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(a6l var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String h0(a6l var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String c8(a6l var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static int k5(a6l var0, int var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String t2(a6l var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String s7(a6l var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String x8(a6l var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String n3(a6l var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String y4(a6l var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int u3(a6l var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int a6(a6l var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static int u9(a6l var0, int var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static int h0(a6l var0, int var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static double n5(a6l var0, double var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static double l6(a6l var0, double var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(a6l var0, boolean var1) {
      return var0.w1 = var1;
   }
}
