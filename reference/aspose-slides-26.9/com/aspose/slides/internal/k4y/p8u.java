package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p8u extends b3 {
   private int u9;
   private String h0;
   private String c8;
   private int t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private com.aspose.slides.ms.System.s4 z1 = new com.aspose.slides.ms.System.s4();
   private String t4;
   private String q0;
   private String z3;
   private String m1;
   private String k7;
   private int m3;
   private int z8;
   private int j5;
   private int w1;
   private double r4;
   private double c4;
   private boolean y2;
   private int y1;
   private List<g7> a0;
   public static final int n5 = p3r.n5("default");
   public static final int l6 = v1e.n5("custom");
   public static final com.aspose.slides.ms.System.s4 k5 = com.aspose.slides.ms.System.s4.k5.n3();
   public static final int u3 = q5x.n5("default");
   public static final int a6 = z5q.n5("inherit");
   private static final com.aspose.slides.internal.v6g.u9 d2 = new com.aspose.slides.internal.v6g.u9(
      "presentation:node-type",
      "presentation:preset-id",
      "presentation:preset-sub-type",
      "presentation:preset-class",
      "presentation:master-element",
      "presentation:group-id",
      "anim:id",
      "smil:targetElement",
      "anim:sub-item",
      "anim:iterate-type",
      "anim:iterate-interval",
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
      "smil:endsync",
      "animate",
      "set",
      "animateMotion",
      "animateColor",
      "animateTransform",
      "transitionFilter",
      "par",
      "seq",
      "iterate",
      "audio",
      "command"
   );

   public p8u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.y4();
      p8u$1 var2 = new p8u$1(this);
      n5(var1, var2);
      n5(var1, new p8u$2(this, var1));
   }

   public p8u() {
      this.y4();
   }

   private void y4() {
      this.u9 = n5;
      this.t2 = l6;
      k5.u3(this.z1);
      this.m3 = u3;
      this.z8 = a6;
      this.j5 = 0;
      this.w1 = 0;
      this.r4 = 0.0;
      this.c4 = 0.0;
      this.y2 = false;
      this.y1 = 0;
      this.a0 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.u9 != n5) {
         var2.l6("presentation:node-type", p3r.n5(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("presentation:preset-id", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("presentation:preset-sub-type", this.c8);
      }

      if (this.t2 != l6) {
         var2.l6("presentation:preset-class", v1e.n5(this.t2));
      }

      if (this.s7 != null) {
         var2.l6("presentation:master-element", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("presentation:group-id", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("anim:id", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("smil:targetElement", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("anim:sub-item", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("anim:iterate-type", this.t9);
      }

      if (com.aspose.slides.ms.System.s4.a6(this.z1, k5)) {
         var2.l6("anim:iterate-interval", n5(this.z1.n3()));
      }

      if (this.t4 != null) {
         var2.l6("smil:begin", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("smil:end", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("smil:dur", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("smil:repeatDur", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("smil:repeatCount", this.k7);
      }

      if (this.m3 != u3) {
         var2.l6("smil:restart", q5x.n5(this.m3));
      }

      if (this.z8 != a6) {
         var2.l6("smil:restartDefault", z5q.n5(this.z8));
      }

      if (this.j5 != 0) {
         var2.l6("smil:fill", o7g.n5(this.j5));
      }

      if (this.w1 != 0) {
         var2.l6("smil:fillDefault", d1k.n5(this.w1));
      }

      if (this.r4 != 0.0) {
         var2.l6("smil:accelerate", com.aspose.slides.ms.System.Xml.f4.n5(this.r4));
      }

      if (this.c4 != 0.0) {
         var2.l6("smil:decelerate", com.aspose.slides.ms.System.Xml.f4.n5(this.c4));
      }

      if (this.y2) {
         var2.l6("smil:autoReverse", this.y2 ? "true" : "false");
      }

      if (this.y1 != 0) {
         var2.l6("smil:endsync", y3e.n5(this.y1));
      }

      List$Enumerator var4 = this.a0.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (d2.n5(var5.n5())) {
               case 24:
                  ((r2z)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 25:
                  ((y2d)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 26:
                  ((c6q)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 27:
                  ((z8y)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 28:
                  ((a6l)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 29:
                  ((r3k)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 30:
                  ((g4z)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 31:
                  ((n8k)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 32:
                  ((p8u)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 33:
                  ((y8g)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 34:
                  ((k6o)var5.k5()).n5("anim", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final int n5() {
      return this.u9;
   }

   public final String l6() {
      return this.h0;
   }

   public final String k5() {
      return this.c8;
   }

   public final int u3() {
      return this.t2;
   }

   public final String a6() {
      return this.x8;
   }

   public final String u9() {
      return this.y4;
   }

   public final String h0() {
      return this.t9;
   }

   public final com.aspose.slides.ms.System.s4 c8() {
      return this.z1;
   }

   public final String t2() {
      return this.t4;
   }

   public final int s7() {
      return this.j5;
   }

   public final List<g7> x8() {
      return this.a0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return d2;
   }

   // $VF: synthetic method
   static int n5(p8u var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String n5(p8u var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String l6(p8u var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int l6(p8u var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String k5(p8u var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String u3(p8u var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String a6(p8u var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String u9(p8u var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String h0(p8u var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String c8(p8u var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 n5(p8u var0) {
      return var0.z1;
   }

   // $VF: synthetic method
   static String t2(p8u var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String s7(p8u var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String x8(p8u var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String n3(p8u var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String y4(p8u var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static int k5(p8u var0, int var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static int u3(p8u var0, int var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static int a6(p8u var0, int var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static int u9(p8u var0, int var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static double n5(p8u var0, double var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static double l6(p8u var0, double var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static boolean n5(p8u var0, boolean var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static int h0(p8u var0, int var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static List l6(p8u var0) {
      return var0.a0;
   }
}
