package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class n8k extends b3 {
   private int a6;
   private String u9;
   private String h0;
   private int c8;
   private String t2;
   private String s7;
   private String x8;
   private int n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private int q0;
   private int z3;
   private int m1;
   private int k7;
   private double m3;
   private double z8;
   private boolean j5;
   private List<g7> w1;
   public static final int n5 = p3r.n5("default");
   public static final int l6 = v1e.n5("custom");
   public static final int k5 = q5x.n5("default");
   public static final int u3 = z5q.n5("inherit");
   private static final com.aspose.slides.internal.v6g.u9 r4 = new com.aspose.slides.internal.v6g.u9(
      "presentation:node-type",
      "presentation:preset-id",
      "presentation:preset-sub-type",
      "presentation:preset-class",
      "presentation:master-element",
      "presentation:group-id",
      "anim:id",
      "smil:endsync",
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

   public n8k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n8k$1 var2 = new n8k$1(this);
      n5(var1, var2);
      n5(var1, new n8k$2(this, var1));
   }

   public n8k() {
      this.u3();
   }

   private void u3() {
      this.a6 = n5;
      this.c8 = l6;
      this.n3 = 0;
      this.q0 = k5;
      this.z3 = u3;
      this.m1 = 0;
      this.k7 = 0;
      this.m3 = 0.0;
      this.z8 = 0.0;
      this.j5 = false;
      this.w1 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.a6 != n5) {
         var2.l6("presentation:node-type", p3r.n5(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("presentation:preset-id", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("presentation:preset-sub-type", this.h0);
      }

      if (this.c8 != l6) {
         var2.l6("presentation:preset-class", v1e.n5(this.c8));
      }

      if (this.t2 != null) {
         var2.l6("presentation:master-element", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("presentation:group-id", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("anim:id", this.x8);
      }

      if (this.n3 != 0) {
         var2.l6("smil:endsync", y3e.n5(this.n3));
      }

      if (this.y4 != null) {
         var2.l6("smil:begin", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("smil:end", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("smil:dur", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("smil:repeatDur", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("smil:repeatCount", this.t4);
      }

      if (this.q0 != k5) {
         var2.l6("smil:restart", q5x.n5(this.q0));
      }

      if (this.z3 != u3) {
         var2.l6("smil:restartDefault", z5q.n5(this.z3));
      }

      if (this.m1 != 0) {
         var2.l6("smil:fill", o7g.n5(this.m1));
      }

      if (this.k7 != 0) {
         var2.l6("smil:fillDefault", d1k.n5(this.k7));
      }

      if (this.m3 != 0.0) {
         var2.l6("smil:accelerate", com.aspose.slides.ms.System.Xml.f4.n5(this.m3));
      }

      if (this.z8 != 0.0) {
         var2.l6("smil:decelerate", com.aspose.slides.ms.System.Xml.f4.n5(this.z8));
      }

      if (this.j5) {
         var2.l6("smil:autoReverse", this.j5 ? "true" : "false");
      }

      List$Enumerator var4 = this.w1.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (r4.n5(var5.n5())) {
               case 20:
                  ((r2z)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 21:
                  ((y2d)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 22:
                  ((c6q)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 23:
                  ((z8y)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 24:
                  ((a6l)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 25:
                  ((r3k)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 26:
                  ((g4z)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 27:
                  ((n8k)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 28:
                  ((p8u)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 29:
                  ((y8g)var5.k5()).n5("anim", var2, var5.n5());
                  break;
               case 30:
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
      return this.a6;
   }

   public final List<g7> l6() {
      return this.w1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return r4;
   }

   // $VF: synthetic method
   static int n5(n8k var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String n5(n8k var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String l6(n8k var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int l6(n8k var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String k5(n8k var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u3(n8k var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String a6(n8k var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int k5(n8k var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String u9(n8k var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String h0(n8k var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String c8(n8k var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String t2(n8k var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String s7(n8k var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int u3(n8k var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int a6(n8k var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int u9(n8k var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static int h0(n8k var0, int var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static double n5(n8k var0, double var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static double l6(n8k var0, double var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static boolean n5(n8k var0, boolean var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static List n5(n8k var0) {
      return var0.w1;
   }
}
