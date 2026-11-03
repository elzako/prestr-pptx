package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p3p extends b3 {
   private byte n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private long t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private String z3;
   private String m1;
   private byte k7;
   private int m3;
   private long z8;
   private String j5;
   private String w1;
   private String r4;
   private String c4;
   private List<g7> y2;
   private static final com.aspose.slides.internal.v6g.u9 y1 = new com.aspose.slides.internal.v6g.u9(
      "office:display",
      "draw:caption-point-x",
      "draw:caption-point-y",
      "draw:corner-radius",
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
      "creator",
      "date",
      "date-string",
      "p",
      "list"
   );

   public p3p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      p3p$1 var2 = new p3p$1(this);
      n5(var1, var2);
      n5(var1, new p3p$2(this, var1));
   }

   public p3p() {
      this.h0();
   }

   private void h0() {
      this.n5 = -1;
      this.t2 = 4294967295L;
      this.k7 = -1;
      this.m3 = 0;
      this.z8 = 4294967295L;
      this.y2 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("office:display", this.n5 == 1 ? "true" : "false");
      }

      if (this.l6 != null) {
         var2.l6("draw:caption-point-x", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("draw:caption-point-y", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("draw:corner-radius", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("svg:x", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("svg:y", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("svg:width", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("svg:height", this.c8);
      }

      if ((this.t2 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      if (this.s7 != null) {
         var2.l6("draw:id", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("draw:layer", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("draw:style-name", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("draw:class-names", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("presentation:style-name", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("presentation:class-names", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("draw:transform", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("draw:name", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("table:end-cell-address", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("table:end-x", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("table:end-y", this.m1);
      }

      if (this.k7 != -1) {
         var2.l6("table:table-background", this.k7 == 1 ? "true" : "false");
      }

      if (this.m3 != 0) {
         var2.l6("text:anchor-type", k7p.n5(this.m3));
      }

      if ((this.z8 & 4294967295L) != 4294967295L) {
         var2.l6("text:anchor-page-number", com.aspose.slides.ms.System.Xml.f4.l6(this.z8));
      }

      if (this.j5 != null) {
         var2.l6("draw:text-style-name", this.j5);
      }

      if (this.w1 != null) {
         this.n5("dc", var2, "creator", this.w1, false);
      }

      if (this.r4 != null) {
         this.n5("dc", var2, "date", this.r4, false);
      }

      if (this.c4 != null) {
         this.n5("meta", var2, "date-string", this.c4, false);
      }

      List$Enumerator var4 = this.y2.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (y1.n5(var5.n5())) {
               case 27:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 28:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(g7 var1) {
      this.y2.addItem(var1);
   }

   public final String n5() {
      return this.a6;
   }

   public final void n5(String var1) {
      this.a6 = var1;
   }

   public final String l6() {
      return this.u9;
   }

   public final void l6(String var1) {
      this.u9 = var1;
   }

   public final String k5() {
      return this.w1;
   }

   public final void k5(String var1) {
      this.w1 = var1;
   }

   public final String u3() {
      return this.r4;
   }

   public final void u3(String var1) {
      this.r4 = var1;
   }

   public final List<g7> a6() {
      return this.y2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return y1;
   }

   // $VF: synthetic method
   static byte n5(p3p var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(p3p var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(p3p var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(p3p var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(p3p var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(p3p var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(p3p var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(p3p var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long n5(p3p var0, long var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String c8(p3p var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String t2(p3p var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String s7(p3p var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String x8(p3p var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String n3(p3p var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String y4(p3p var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String e2(p3p var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String t9(p3p var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String z1(p3p var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String t4(p3p var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String q0(p3p var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static byte l6(p3p var0, byte var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static int n5(p3p var0, int var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static long l6(p3p var0, long var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String z3(p3p var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String m1(p3p var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static String n5(p3p var0) {
      return var0.w1;
   }

   // $VF: synthetic method
   static String k7(p3p var0, String var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String l6(p3p var0) {
      return var0.r4;
   }

   // $VF: synthetic method
   static String m3(p3p var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static String k5(p3p var0) {
      return var0.c4;
   }

   // $VF: synthetic method
   static List u3(p3p var0) {
      return var0.y2;
   }
}
