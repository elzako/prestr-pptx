package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class f1h extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private int a6;
   private double u9;
   private double h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private long n3;
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
   private String z8;
   private byte j5;
   private int w1;
   private long r4;
   private String c4;
   private String y2;
   private String y1;
   private String a0;
   private c6x d2;
   private List<l4y> d5;
   private List<g7> s3;
   public static final int n5 = i4f.n5("full");
   private static final com.aspose.slides.internal.v6g.u9 p8 = new com.aspose.slides.internal.v6g.u9(
      "svg:r",
      "svg:cx",
      "svg:cy",
      "draw:kind",
      "draw:start-angle",
      "draw:end-angle",
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

   public f1h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t9();
      f1h$1 var2 = new f1h$1(this);
      n5(var1, var2);
      n5(var1, new f1h$2(this, var1));
   }

   public f1h() {
      this.t9();
   }

   private void t9() {
      this.a6 = n5;
      this.u9 = Double.NaN;
      this.h0 = Double.NaN;
      this.n3 = 4294967295L;
      this.j5 = -1;
      this.w1 = 0;
      this.r4 = 4294967295L;
      this.d5 = new List<>();
      this.s3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("svg:r", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("svg:cx", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("svg:cy", this.u3);
      }

      if (this.a6 != n5) {
         var2.l6("draw:kind", i4f.n5(this.a6));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.u9)) {
         var2.l6("draw:start-angle", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.h0)) {
         var2.l6("draw:end-angle", com.aspose.slides.ms.System.Xml.f4.n5(this.h0));
      }

      if (this.c8 != null) {
         var2.l6("svg:x", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("svg:y", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("svg:width", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("svg:height", this.x8);
      }

      if ((this.n3 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.n3));
      }

      if (this.y4 != null) {
         var2.l6("draw:id", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("draw:layer", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("draw:style-name", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("draw:class-names", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("presentation:style-name", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("presentation:class-names", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("draw:transform", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("draw:name", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("table:end-cell-address", this.k7);
      }

      if (this.m3 != null) {
         var2.l6("table:end-x", this.m3);
      }

      if (this.z8 != null) {
         var2.l6("table:end-y", this.z8);
      }

      if (this.j5 != -1) {
         var2.l6("table:table-background", this.j5 == 1 ? "true" : "false");
      }

      if (this.w1 != 0) {
         var2.l6("text:anchor-type", k7p.n5(this.w1));
      }

      if ((this.r4 & 4294967295L) != 4294967295L) {
         var2.l6("text:anchor-page-number", com.aspose.slides.ms.System.Xml.f4.l6(this.r4));
      }

      if (this.c4 != null) {
         var2.l6("draw:text-style-name", this.c4);
      }

      if (this.y2 != null) {
         var2.l6("draw:caption-id", this.y2);
      }

      if (this.y1 != null) {
         this.n5("svg", var2, "title", this.y1, false);
      }

      if (this.a0 != null) {
         this.n5("svg", var2, "desc", this.a0, false);
      }

      if (this.d2 != null) {
         this.d2.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.d5.iterator();

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

      List$Enumerator var14 = this.s3.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (p8.n5(var6.n5())) {
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

   public final String n5() {
      return this.c8;
   }

   public final String l6() {
      return this.t2;
   }

   public final String k5() {
      return this.s7;
   }

   public final String u3() {
      return this.x8;
   }

   public final String a6() {
      return this.y4;
   }

   public final String u9() {
      return this.e2;
   }

   public final String h0() {
      return this.t9;
   }

   public final String c8() {
      return this.t4;
   }

   public final String t2() {
      return this.z3;
   }

   public final String s7() {
      return this.m1;
   }

   public final String x8() {
      return this.c4;
   }

   public final String n3() {
      return this.a0;
   }

   public final List<g7> y4() {
      return this.s3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 e2() {
      return p8;
   }

   // $VF: synthetic method
   static String n5(f1h var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(f1h var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(f1h var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(f1h var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double n5(f1h var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static double l6(f1h var0, double var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(f1h var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(f1h var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(f1h var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String h0(f1h var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static long n5(f1h var0, long var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String c8(f1h var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String t2(f1h var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String s7(f1h var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String x8(f1h var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String n3(f1h var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String y4(f1h var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String e2(f1h var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String t9(f1h var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String z1(f1h var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String t4(f1h var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String q0(f1h var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static byte n5(f1h var0, byte var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static int l6(f1h var0, int var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static long l6(f1h var0, long var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String z3(f1h var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static String m1(f1h var0, String var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static String k7(f1h var0, String var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static String n5(f1h var0) {
      return var0.y1;
   }

   // $VF: synthetic method
   static String m3(f1h var0, String var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static String l6(f1h var0) {
      return var0.a0;
   }

   // $VF: synthetic method
   static c6x n5(f1h var0, c6x var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static List k5(f1h var0) {
      return var0.d5;
   }

   // $VF: synthetic method
   static List u3(f1h var0) {
      return var0.s3;
   }
}
