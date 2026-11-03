package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class l3d extends b3 {
   private int n5;
   private String l6;
   private String k5;
   private String u3;
   private long a6;
   private String u9;
   private String h0;
   private String c8;
   private long t2;
   private String s7;
   private long x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private String z3;
   private String m1;
   private String k7;
   private String m3;
   private byte z8;
   private int j5;
   private long w1;
   private String r4;
   private String c4;
   private String y2;
   private String y1;
   private c6x a0;
   private List<l4y> d2;
   private List<g7> d5;
   private static final com.aspose.slides.internal.v6g.u9 s3 = new com.aspose.slides.internal.v6g.u9(
      "draw:type",
      "svg:x1",
      "svg:y1",
      "draw:start-shape",
      "draw:start-glue-point",
      "svg:x2",
      "svg:y2",
      "draw:end-shape",
      "draw:end-glue-point",
      "draw:line-skew",
      "draw:z-index",
      "draw:id",
      "draw:layer",
      "draw:style-name",
      "draw:class-names",
      "presentation:style-name",
      "presentation:class-names",
      "draw:transform",
      "draw:name",
      "table:end-cell-address",
      "table:end-x",
      "table:end-y",
      "table:table-background",
      "text:anchor-type",
      "text:anchor-page-number",
      "draw:text-style-name",
      "draw:caption-id",
      "title",
      "desc",
      "event-listeners",
      "glue-point",
      "p",
      "list"
   );

   public l3d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.z1();
      l3d$1 var2 = new l3d$1(this);
      n5(var1, var2);
      n5(var1, new l3d$2(this, var1));
   }

   public l3d() {
      this.z1();
   }

   private void z1() {
      this.n5 = 0;
      this.a6 = 4294967295L;
      this.t2 = 4294967295L;
      this.x8 = 4294967295L;
      this.z8 = -1;
      this.j5 = 0;
      this.w1 = 4294967295L;
      this.d2 = new List<>();
      this.d5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:type", t8r.n5(this.n5));
      if (this.l6 != null) {
         var2.l6("svg:x1", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("svg:y1", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("draw:start-shape", this.u3);
      }

      if ((this.a6 & 4294967295L) != 4294967295L) {
         var2.l6("draw:start-glue-point", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("svg:x2", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("svg:y2", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("draw:end-shape", this.c8);
      }

      if ((this.t2 & 4294967295L) != 4294967295L) {
         var2.l6("draw:end-glue-point", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      if (this.s7 != null) {
         var2.l6("draw:line-skew", this.s7);
      }

      if ((this.x8 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.x8));
      }

      if (this.n3 != null) {
         var2.l6("draw:id", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("draw:layer", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("draw:style-name", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("draw:class-names", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("presentation:style-name", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("presentation:class-names", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("draw:transform", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("draw:name", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("table:end-cell-address", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("table:end-x", this.k7);
      }

      if (this.m3 != null) {
         var2.l6("table:end-y", this.m3);
      }

      if (this.z8 != -1) {
         var2.l6("table:table-background", this.z8 == 1 ? "true" : "false");
      }

      if (this.j5 != 0) {
         var2.l6("text:anchor-type", k7p.n5(this.j5));
      }

      if ((this.w1 & 4294967295L) != 4294967295L) {
         var2.l6("text:anchor-page-number", com.aspose.slides.ms.System.Xml.f4.l6(this.w1));
      }

      if (this.r4 != null) {
         var2.l6("draw:text-style-name", this.r4);
      }

      if (this.c4 != null) {
         var2.l6("draw:caption-id", this.c4);
      }

      if (this.y2 != null) {
         this.n5("svg", var2, "title", this.y2, false);
      }

      if (this.y1 != null) {
         this.n5("svg", var2, "desc", this.y1, false);
      }

      if (this.a0 != null) {
         this.a0.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.d2.iterator();

      try {
         while (var4.hasNext()) {
            l4y var5 = (l4y)var4.next();
            var5.n5("draw", var2, "glue-point");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.d5.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (s3.n5(var6.n5())) {
               case 31:
                  ((u1x)var6.k5()).n5("text", var2, var6.n5());
                  break;
               case 32:
                  ((u0y)var6.k5()).n5("text", var2, var6.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final String u3() {
      return this.u3;
   }

   public final long a6() {
      return this.a6;
   }

   public final String u9() {
      return this.u9;
   }

   public final void k5(String var1) {
      this.u9 = var1;
   }

   public final String h0() {
      return this.h0;
   }

   public final void u3(String var1) {
      this.h0 = var1;
   }

   public final String c8() {
      return this.c8;
   }

   public final long t2() {
      return this.t2;
   }

   public final String s7() {
      return this.n3;
   }

   public final String x8() {
      return this.y4;
   }

   public final String n3() {
      return this.e2;
   }

   public final void a6(String var1) {
      this.e2 = var1;
   }

   public final String y4() {
      return this.z3;
   }

   public final void u9(String var1) {
      this.z3 = var1;
   }

   public final String e2() {
      return this.y1;
   }

   public final void h0(String var1) {
      this.y1 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t9() {
      return s3;
   }

   // $VF: synthetic method
   static int n5(l3d var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(l3d var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(l3d var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(l3d var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long n5(l3d var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(l3d var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String a6(l3d var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u9(l3d var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long l6(l3d var0, long var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String h0(l3d var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static long k5(l3d var0, long var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String c8(l3d var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String t2(l3d var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String s7(l3d var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String x8(l3d var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String n3(l3d var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String y4(l3d var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String e2(l3d var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String t9(l3d var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String z1(l3d var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String t4(l3d var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String q0(l3d var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static byte n5(l3d var0, byte var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static int l6(l3d var0, int var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static long u3(l3d var0, long var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static String z3(l3d var0, String var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String m1(l3d var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static String k7(l3d var0, String var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static String n5(l3d var0) {
      return var0.y2;
   }

   // $VF: synthetic method
   static String m3(l3d var0, String var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static String l6(l3d var0) {
      return var0.y1;
   }

   // $VF: synthetic method
   static c6x n5(l3d var0, c6x var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static List k5(l3d var0) {
      return var0.d2;
   }

   // $VF: synthetic method
   static List u3(l3d var0) {
      return var0.d5;
   }
}
