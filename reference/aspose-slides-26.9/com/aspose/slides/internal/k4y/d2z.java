package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class d2z extends b3 {
   private String l6;
   private String k5;
   private int u3;
   private double a6;
   private double u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private String n3;
   private long y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private String z3;
   private String m1;
   private String k7;
   private String m3;
   private String z8;
   private String j5;
   private byte w1;
   private int r4;
   private long c4;
   private String y2;
   private String y1;
   private String a0;
   private String d2;
   private c6x d5;
   private List<l4y> s3;
   private List<g7> p8;
   public static final int n5 = i4f.n5("full");
   private static final com.aspose.slides.internal.v6g.u9 f2 = new com.aspose.slides.internal.v6g.u9(
      "svg:cx",
      "svg:cy",
      "draw:kind",
      "draw:start-angle",
      "draw:end-angle",
      "svg:rx",
      "svg:ry",
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
      "list"
   );

   public d2z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t9();
      d2z$1 var2 = new d2z$1(this);
      n5(var1, var2);
      n5(var1, new d2z$2(this, var1));
   }

   public d2z() {
      this.t9();
   }

   private void t9() {
      this.u3 = n5;
      this.a6 = Double.NaN;
      this.u9 = Double.NaN;
      this.y4 = 4294967295L;
      this.w1 = -1;
      this.r4 = 0;
      this.c4 = 4294967295L;
      this.s3 = new List<>();
      this.p8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("svg:cx", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("svg:cy", this.k5);
      }

      if (this.u3 != n5) {
         var2.l6("draw:kind", i4f.n5(this.u3));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.a6)) {
         var2.l6("draw:start-angle", com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.u9)) {
         var2.l6("draw:end-angle", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("svg:rx", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("svg:ry", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("svg:x", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("svg:y", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("svg:width", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("svg:height", this.n3);
      }

      if ((this.y4 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.y4));
      }

      if (this.e2 != null) {
         var2.l6("draw:id", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("draw:layer", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("draw:style-name", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("draw:class-names", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("presentation:style-name", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("presentation:class-names", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("draw:transform", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("draw:name", this.k7);
      }

      if (this.m3 != null) {
         var2.l6("table:end-cell-address", this.m3);
      }

      if (this.z8 != null) {
         var2.l6("table:end-x", this.z8);
      }

      if (this.j5 != null) {
         var2.l6("table:end-y", this.j5);
      }

      if (this.w1 != -1) {
         var2.l6("table:table-background", this.w1 == 1 ? "true" : "false");
      }

      if (this.r4 != 0) {
         var2.l6("text:anchor-type", k7p.n5(this.r4));
      }

      if ((this.c4 & 4294967295L) != 4294967295L) {
         var2.l6("text:anchor-page-number", com.aspose.slides.ms.System.Xml.f4.l6(this.c4));
      }

      if (this.y2 != null) {
         var2.l6("draw:text-style-name", this.y2);
      }

      if (this.y1 != null) {
         var2.l6("draw:caption-id", this.y1);
      }

      if (this.a0 != null) {
         this.n5("svg", var2, "title", this.a0, false);
      }

      if (this.d2 != null) {
         this.n5("svg", var2, "desc", this.d2, false);
      }

      if (this.d5 != null) {
         this.d5.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.s3.iterator();

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

      List$Enumerator var14 = this.p8.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (f2.n5(var6.n5())) {
               case 32:
                  ((u1x)var6.k5()).n5("text", var2, var6.n5());
                  break;
               case 33:
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

   public final g7 n5(String var1) {
      g7 var2;
      switch (f2.n5(var1)) {
         case 32:
            var2 = new g7("p", new u1x());
            break;
         case 33:
            var2 = new g7("list", new u0y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.p8.addItem(var2);
      return var2;
   }

   public final String n5() {
      return this.t2;
   }

   public final void l6(String var1) {
      this.t2 = var1;
   }

   public final String l6() {
      return this.s7;
   }

   public final void k5(String var1) {
      this.s7 = var1;
   }

   public final String k5() {
      return this.x8;
   }

   public final void u3(String var1) {
      this.x8 = var1;
   }

   public final String u3() {
      return this.n3;
   }

   public final void a6(String var1) {
      this.n3 = var1;
   }

   public final String a6() {
      return this.e2;
   }

   public final String u9() {
      return this.t9;
   }

   public final String h0() {
      return this.z1;
   }

   public final void u9(String var1) {
      this.z1 = var1;
   }

   public final String c8() {
      return this.q0;
   }

   public final String t2() {
      return this.m1;
   }

   public final void h0(String var1) {
      this.m1 = var1;
   }

   public final String s7() {
      return this.k7;
   }

   public final void c8(String var1) {
      this.k7 = var1;
   }

   public final String x8() {
      return this.y2;
   }

   public final String n3() {
      return this.d2;
   }

   public final void t2(String var1) {
      this.d2 = var1;
   }

   public final List<g7> y4() {
      return this.p8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 e2() {
      return f2;
   }

   // $VF: synthetic method
   static String n5(d2z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(d2z var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(d2z var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double n5(d2z var0, double var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double l6(d2z var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(d2z var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(d2z var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(d2z var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(d2z var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String h0(d2z var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String c8(d2z var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static long n5(d2z var0, long var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String t2(d2z var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String s7(d2z var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String x8(d2z var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String n3(d2z var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String y4(d2z var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String e2(d2z var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String t9(d2z var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String z1(d2z var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String t4(d2z var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String q0(d2z var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String z3(d2z var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static byte n5(d2z var0, byte var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static int l6(d2z var0, int var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static long l6(d2z var0, long var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static String m1(d2z var0, String var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static String k7(d2z var0, String var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static String m3(d2z var0, String var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static String n5(d2z var0) {
      return var0.a0;
   }

   // $VF: synthetic method
   static String z8(d2z var0, String var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static String l6(d2z var0) {
      return var0.d2;
   }

   // $VF: synthetic method
   static c6x n5(d2z var0, c6x var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static List k5(d2z var0) {
      return var0.s3;
   }

   // $VF: synthetic method
   static List u3(d2z var0) {
      return var0.p8;
   }
}
