package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class g3c extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private long h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private byte z3;
   private int m1;
   private long k7;
   private String m3;
   private String z8;
   private String j5;
   private String w1;
   private c6x r4;
   private List<l4y> c4;
   private List<g7> y2;
   private y1z y1;
   private static final com.aspose.slides.internal.v6g.u9 a0 = new com.aspose.slides.internal.v6g.u9(
      "draw:engine",
      "draw:data",
      "svg:x",
      "svg:y",
      "svg:width",
      "svg:height",
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
      "list",
      "enhanced-geometry"
   );

   public g3c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t4();
      g3c$1 var2 = new g3c$1(this);
      n5(var1, var2);
      n5(var1, new g3c$2(this, var1));
   }

   public g3c() {
      this.t4();
   }

   private void t4() {
      this.h0 = 4294967295L;
      this.z3 = -1;
      this.m1 = 0;
      this.k7 = 4294967295L;
      this.c4 = new List<>();
      this.y2 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("draw:engine", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("draw:data", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("svg:x", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("svg:y", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("svg:width", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("svg:height", this.u9);
      }

      if ((this.h0 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if (this.c8 != null) {
         var2.l6("draw:id", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("draw:layer", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("draw:style-name", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("draw:class-names", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("presentation:style-name", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("presentation:class-names", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("draw:transform", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("draw:name", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("table:end-cell-address", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("table:end-x", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("table:end-y", this.q0);
      }

      if (this.z3 != -1) {
         var2.l6("table:table-background", this.z3 == 1 ? "true" : "false");
      }

      if (this.m1 != 0) {
         var2.l6("text:anchor-type", k7p.n5(this.m1));
      }

      if ((this.k7 & 4294967295L) != 4294967295L) {
         var2.l6("text:anchor-page-number", com.aspose.slides.ms.System.Xml.f4.l6(this.k7));
      }

      if (this.m3 != null) {
         var2.l6("draw:text-style-name", this.m3);
      }

      if (this.z8 != null) {
         var2.l6("draw:caption-id", this.z8);
      }

      if (this.j5 != null) {
         this.n5("svg", var2, "title", this.j5, false);
      }

      if (this.w1 != null) {
         this.n5("svg", var2, "desc", this.w1, false);
      }

      if (this.r4 != null) {
         this.r4.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.c4.iterator();

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

      List$Enumerator var14 = this.y2.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (a0.n5(var6.n5())) {
               case 27:
                  ((u1x)var6.k5()).n5("text", var2, var6.n5());
                  break;
               case 28:
                  ((u0y)var6.k5()).n5("text", var2, var6.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.y1 != null) {
         this.y1.n5("draw", var2, "enhanced-geometry");
      }

      var2.s7();
   }

   public final y1z n5() {
      if (this.y1 != null) {
         throw new Exception("Only one <enhanced_geometry> element can be added.");
      }

      this.y1 = new y1z();
      return this.y1;
   }

   public final void n5(y1z var1) {
      this.y1 = var1;
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (a0.n5(var1)) {
         case 27:
            var2 = new g7("p", new u1x());
            break;
         case 28:
            var2 = new g7("list", new u0y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.y2.addItem(var2);
      return var2;
   }

   public final String l6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void k5(String var1) {
      this.u3 = var1;
   }

   public final String u3() {
      return this.a6;
   }

   public final void u3(String var1) {
      this.a6 = var1;
   }

   public final String a6() {
      return this.u9;
   }

   public final void a6(String var1) {
      this.u9 = var1;
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

   public final void u9(String var1) {
      this.s7 = var1;
   }

   public final String t2() {
      return this.n3;
   }

   public final String s7() {
      return this.e2;
   }

   public final void h0(String var1) {
      this.e2 = var1;
   }

   public final String x8() {
      return this.t9;
   }

   public final void c8(String var1) {
      this.t9 = var1;
   }

   public final String n3() {
      return this.m3;
   }

   public final String y4() {
      return this.w1;
   }

   public final void t2(String var1) {
      this.w1 = var1;
   }

   public final List<g7> e2() {
      return this.y2;
   }

   public final y1z t9() {
      return this.y1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 z1() {
      return a0;
   }

   // $VF: synthetic method
   static String n5(g3c var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(g3c var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(g3c var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(g3c var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(g3c var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(g3c var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long n5(g3c var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(g3c var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(g3c var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String t2(g3c var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String s7(g3c var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String x8(g3c var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String n3(g3c var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String y4(g3c var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String e2(g3c var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String t9(g3c var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String z1(g3c var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String t4(g3c var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static byte n5(g3c var0, byte var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int n5(g3c var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static long l6(g3c var0, long var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String q0(g3c var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String z3(g3c var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String m1(g3c var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String n5(g3c var0) {
      return var0.j5;
   }

   // $VF: synthetic method
   static String k7(g3c var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static String l6(g3c var0) {
      return var0.w1;
   }

   // $VF: synthetic method
   static c6x n5(g3c var0, c6x var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static List k5(g3c var0) {
      return var0.c4;
   }

   // $VF: synthetic method
   static List u3(g3c var0) {
      return var0.y2;
   }

   // $VF: synthetic method
   static y1z n5(g3c var0, y1z var1) {
      return var0.y1 = var1;
   }
}
