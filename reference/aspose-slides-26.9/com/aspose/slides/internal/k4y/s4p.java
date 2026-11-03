package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class s4p extends b3 {
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
   private static final com.aspose.slides.internal.v6g.u9 y1 = new com.aspose.slides.internal.v6g.u9(
      "draw:points",
      "svg:x",
      "svg:y",
      "svg:width",
      "svg:height",
      "svg:viewBox",
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

   public s4p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t9();
      s4p$1 var2 = new s4p$1(this);
      n5(var1, var2);
      n5(var1, new s4p$2(this, var1));
   }

   public s4p() {
      this.t9();
   }

   private void t9() {
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
      var2.l6("draw:points", this.n5);
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

      var2.l6("svg:viewBox", this.u9);
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
            switch (y1.n5(var6.n5())) {
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

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public final String u3() {
      return this.u3;
   }

   public final String a6() {
      return this.a6;
   }

   public final String u9() {
      return this.u9;
   }

   public final String h0() {
      return this.c8;
   }

   public final String c8() {
      return this.t2;
   }

   public final String t2() {
      return this.s7;
   }

   public final String s7() {
      return this.n3;
   }

   public final String x8() {
      return this.e2;
   }

   public final String n3() {
      return this.t9;
   }

   public final String y4() {
      return this.w1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 e2() {
      return y1;
   }

   // $VF: synthetic method
   static String n5(s4p var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(s4p var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(s4p var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(s4p var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(s4p var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(s4p var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long n5(s4p var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(s4p var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(s4p var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String t2(s4p var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String s7(s4p var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String x8(s4p var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String n3(s4p var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String y4(s4p var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String e2(s4p var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String t9(s4p var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String z1(s4p var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String t4(s4p var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static byte n5(s4p var0, byte var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int n5(s4p var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static long l6(s4p var0, long var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String q0(s4p var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String z3(s4p var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String m1(s4p var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String n5(s4p var0) {
      return var0.j5;
   }

   // $VF: synthetic method
   static String k7(s4p var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static String l6(s4p var0) {
      return var0.w1;
   }

   // $VF: synthetic method
   static c6x n5(s4p var0, c6x var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static List k5(s4p var0) {
      return var0.c4;
   }

   // $VF: synthetic method
   static List u3(s4p var0) {
      return var0.y2;
   }
}
