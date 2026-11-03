package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z7d extends b3 {
   private int n5;
   private String l6;
   private long k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private long c8;
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
   private String z3;
   private byte m1;
   private int k7;
   private long m3;
   private String z8;
   private String j5;
   private String w1;
   private String r4;
   private c6x c4;
   private List<l4y> y2;
   private List<g7> y1;
   private static final com.aspose.slides.internal.v6g.u9 a0 = new com.aspose.slides.internal.v6g.u9(
      "draw:concave",
      "draw:sharpness",
      "draw:corners",
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

   public z7d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      z7d$1 var2 = new z7d$1(this);
      n5(var1, var2);
      n5(var1, new z7d$2(this, var1));
   }

   public z7d() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.c8 = 4294967295L;
      this.m1 = -1;
      this.k7 = 0;
      this.m3 = 4294967295L;
      this.y2 = new List<>();
      this.y1 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:concave", o4t.n5(this.n5));
      if (this.l6 != null) {
         var2.l6("draw:sharpness", this.l6);
      }

      var2.l6("draw:corners", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      if (this.u3 != null) {
         var2.l6("svg:x", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("svg:y", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("svg:width", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("svg:height", this.h0);
      }

      if ((this.c8 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.c8));
      }

      if (this.t2 != null) {
         var2.l6("draw:id", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("draw:layer", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("draw:style-name", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("draw:class-names", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("presentation:style-name", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("presentation:class-names", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("draw:transform", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("draw:name", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("table:end-cell-address", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("table:end-x", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("table:end-y", this.z3);
      }

      if (this.m1 != -1) {
         var2.l6("table:table-background", this.m1 == 1 ? "true" : "false");
      }

      if (this.k7 != 0) {
         var2.l6("text:anchor-type", k7p.n5(this.k7));
      }

      if ((this.m3 & 4294967295L) != 4294967295L) {
         var2.l6("text:anchor-page-number", com.aspose.slides.ms.System.Xml.f4.l6(this.m3));
      }

      if (this.z8 != null) {
         var2.l6("draw:text-style-name", this.z8);
      }

      if (this.j5 != null) {
         var2.l6("draw:caption-id", this.j5);
      }

      if (this.w1 != null) {
         this.n5("svg", var2, "title", this.w1, false);
      }

      if (this.r4 != null) {
         this.n5("svg", var2, "desc", this.r4, false);
      }

      if (this.c4 != null) {
         this.c4.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.y2.iterator();

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

      List$Enumerator var14 = this.y1.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (a0.n5(var6.n5())) {
               case 28:
                  ((u1x)var6.k5()).n5("text", var2, var6.n5());
                  break;
               case 29:
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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a0;
   }

   // $VF: synthetic method
   static int n5(z7d var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(z7d var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(z7d var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(z7d var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(z7d var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(z7d var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String a6(z7d var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static long l6(z7d var0, long var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u9(z7d var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String h0(z7d var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String c8(z7d var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String t2(z7d var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String s7(z7d var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String x8(z7d var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String n3(z7d var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String y4(z7d var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String e2(z7d var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String t9(z7d var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String z1(z7d var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static byte n5(z7d var0, byte var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static int l6(z7d var0, int var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static long k5(z7d var0, long var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String t4(z7d var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String q0(z7d var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String z3(z7d var0, String var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static String n5(z7d var0) {
      return var0.w1;
   }

   // $VF: synthetic method
   static String m1(z7d var0, String var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String l6(z7d var0) {
      return var0.r4;
   }

   // $VF: synthetic method
   static c6x n5(z7d var0, c6x var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static List k5(z7d var0) {
      return var0.y2;
   }

   // $VF: synthetic method
   static List u3(z7d var0) {
      return var0.y1;
   }
}
