package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class r6d extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private int c8;
   private String t2;
   private String s7;
   private String x8;
   private int n3;
   private String y4;
   private String e2;
   private long t9;
   private int z1;
   private String t4;
   private boolean q0;
   private String z3;
   private List<d5k> m1;
   private List<m3z> k7;
   private List<m4k> m3;
   private k2a z8;
   private t3n j5;
   private q8v w1;
   private h2i r4;
   private s1a c4;
   private s8d y2;
   public static final int n5 = n1r.n5("none");
   private static final com.aspose.slides.internal.v6g.u9 y1 = new com.aspose.slides.internal.v6g.u9(
      "svg:x",
      "svg:y",
      "svg:width",
      "svg:height",
      "chart:style-name",
      "table:cell-range-address",
      "chart:data-source-has-labels",
      "dr3d:vrp",
      "dr3d:vpn",
      "dr3d:vup",
      "dr3d:projection",
      "dr3d:distance",
      "dr3d:focal-length",
      "dr3d:shadow-slant",
      "dr3d:shade-mode",
      "dr3d:ambient-color",
      "dr3d:lighting-mode",
      "dr3d:transform",
      "light",
      "axis",
      "series",
      "stock-gain-marker",
      "stock-loss-marker",
      "stock-range-line",
      "wall",
      "floor",
      "coordinate-region"
   );

   public r6d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.x8();
      r6d$1 var2 = new r6d$1(this);
      n5(var1, var2);
      n5(var1, new r6d$2(this, var1));
   }

   public r6d() {
      this.x8();
   }

   private void x8() {
      this.c8 = n5;
      this.n3 = 0;
      this.t9 = 4294967295L;
      this.z1 = 0;
      this.m1 = new List<>();
      this.k7 = new List<>();
      this.m3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("svg:x", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("svg:y", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("svg:width", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("svg:height", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("chart:style-name", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("table:cell-range-address", this.h0);
      }

      if (this.c8 != n5) {
         var2.l6("chart:data-source-has-labels", n1r.n5(this.c8));
      }

      if (this.t2 != null) {
         var2.l6("dr3d:vrp", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("dr3d:vpn", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("dr3d:vup", this.x8);
      }

      if (this.n3 != 0) {
         var2.l6("dr3d:projection", h6h.n5(this.n3));
      }

      if (this.y4 != null) {
         var2.l6("dr3d:distance", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("dr3d:focal-length", this.e2);
      }

      if ((this.t9 & 4294967295L) != 4294967295L) {
         var2.l6("dr3d:shadow-slant", com.aspose.slides.ms.System.Xml.f4.l6(this.t9));
      }

      if (this.z1 != 0) {
         var2.l6("dr3d:shade-mode", q2k.n5(this.z1));
      }

      if (this.t4 != null) {
         var2.l6("dr3d:ambient-color", this.t4);
      }

      var2.l6("dr3d:lighting-mode", this.q0 ? "true" : "false");
      if (this.z3 != null) {
         var2.l6("dr3d:transform", this.z3);
      }

      List$Enumerator var4 = this.m1.iterator();

      try {
         while (var4.hasNext()) {
            d5k var5 = (d5k)var4.next();
            var5.n5("dr3d", var2, "light");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var21 = this.k7.iterator();

      try {
         while (var21.hasNext()) {
            m3z var6 = (m3z)var21.next();
            var6.n5("chart", var2, "axis");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
            var21.dispose();
         }
      }

      List$Enumerator var22 = this.m3.iterator();

      try {
         while (var22.hasNext()) {
            m4k var7 = (m4k)var22.next();
            var7.n5("chart", var2, "series");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }

      if (this.z8 != null) {
         this.z8.n5("chart", var2, "stock-gain-marker");
      }

      if (this.j5 != null) {
         this.j5.n5("chart", var2, "stock-loss-marker");
      }

      if (this.w1 != null) {
         this.w1.n5("chart", var2, "stock-range-line");
      }

      if (this.r4 != null) {
         this.r4.n5("chart", var2, "wall");
      }

      if (this.c4 != null) {
         this.c4.n5("chart", var2, "floor");
      }

      if (this.y2 != null) {
         this.y2.n5("chart", var2, "coordinate-region");
      }

      var2.s7();
   }

   public final String n5() {
      return this.u9;
   }

   public final m3z[] l6() {
      return this.k7.toArray(new m3z[0]);
   }

   public final m4k[] k5() {
      return this.m3.toArray(new m4k[0]);
   }

   public final k2a u3() {
      return this.z8;
   }

   public final t3n a6() {
      return this.j5;
   }

   public final q8v u9() {
      return this.w1;
   }

   public final h2i h0() {
      return this.r4;
   }

   public final s1a c8() {
      return this.c4;
   }

   public final s8d t2() {
      return this.y2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return y1;
   }

   // $VF: synthetic method
   static String n5(r6d var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(r6d var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(r6d var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(r6d var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(r6d var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(r6d var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int n5(r6d var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String h0(r6d var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String c8(r6d var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String t2(r6d var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int l6(r6d var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String s7(r6d var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String x8(r6d var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static long n5(r6d var0, long var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static int k5(r6d var0, int var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String n3(r6d var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static boolean n5(r6d var0, boolean var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String y4(r6d var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static List n5(r6d var0) {
      return var0.m1;
   }

   // $VF: synthetic method
   static List l6(r6d var0) {
      return var0.k7;
   }

   // $VF: synthetic method
   static List k5(r6d var0) {
      return var0.m3;
   }

   // $VF: synthetic method
   static k2a n5(r6d var0, k2a var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static t3n n5(r6d var0, t3n var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static q8v n5(r6d var0, q8v var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static h2i n5(r6d var0, h2i var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static s1a n5(r6d var0, s1a var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static s8d n5(r6d var0, s8d var1) {
      return var0.y2 = var1;
   }
}
