package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class d8f extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private int u3;
   private String a6;
   private String u9;
   private long h0;
   private int c8;
   private String t2;
   private boolean s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private long z3;
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
   private List<d5k> d5;
   private List<g7> s3;
   private static final com.aspose.slides.internal.v6g.u9 p8 = new com.aspose.slides.internal.v6g.u9(
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
      "svg:x",
      "svg:y",
      "svg:width",
      "svg:height",
      "draw:style-name",
      "draw:class-names",
      "presentation:style-name",
      "presentation:class-names",
      "draw:z-index",
      "draw:id",
      "draw:layer",
      "table:end-cell-address",
      "table:end-x",
      "table:end-y",
      "table:table-background",
      "text:anchor-type",
      "text:anchor-page-number",
      "dr3d:transform",
      "draw:caption-id",
      "title",
      "desc",
      "light",
      "scene",
      "extrude",
      "sphere",
      "rotate",
      "cube"
   );

   public d8f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d8f$1 var2 = new d8f$1(this);
      n5(var1, var2);
      n5(var1, new d8f$2(this, var1));
   }

   public d8f() {
      this.l6();
   }

   private void l6() {
      this.u3 = 0;
      this.h0 = 4294967295L;
      this.c8 = 0;
      this.z3 = 4294967295L;
      this.w1 = -1;
      this.r4 = 0;
      this.c4 = 4294967295L;
      this.d5 = new List<>();
      this.s3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("dr3d:vrp", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("dr3d:vpn", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("dr3d:vup", this.k5);
      }

      if (this.u3 != 0) {
         var2.l6("dr3d:projection", h6h.n5(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("dr3d:distance", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("dr3d:focal-length", this.u9);
      }

      if ((this.h0 & 4294967295L) != 4294967295L) {
         var2.l6("dr3d:shadow-slant", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("dr3d:shade-mode", q2k.n5(this.c8));
      }

      if (this.t2 != null) {
         var2.l6("dr3d:ambient-color", this.t2);
      }

      var2.l6("dr3d:lighting-mode", this.s7 ? "true" : "false");
      if (this.x8 != null) {
         var2.l6("svg:x", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("svg:y", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("svg:width", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("svg:height", this.e2);
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

      if ((this.z3 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.z3));
      }

      if (this.m1 != null) {
         var2.l6("draw:id", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("draw:layer", this.k7);
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
         var2.l6("dr3d:transform", this.y2);
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

      List$Enumerator var4 = this.d5.iterator();

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

      List$Enumerator var14 = this.s3.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (p8.n5(var6.n5())) {
               case 32:
                  ((d8f)var6.k5()).n5("dr3d", var2, var6.n5());
                  break;
               case 33:
                  ((d1l)var6.k5()).n5("dr3d", var2, var6.n5());
                  break;
               case 34:
                  ((f2d)var6.k5()).n5("dr3d", var2, var6.n5());
                  break;
               case 35:
                  ((y9k)var6.k5()).n5("dr3d", var2, var6.n5());
                  break;
               case 36:
                  ((w4j)var6.k5()).n5("dr3d", var2, var6.n5());
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
      return p8;
   }

   // $VF: synthetic method
   static String n5(d8f var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(d8f var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(d8f var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(d8f var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(d8f var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(d8f var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long n5(d8f var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int l6(d8f var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u9(d8f var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d8f var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String h0(d8f var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String c8(d8f var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String t2(d8f var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String s7(d8f var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String x8(d8f var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String n3(d8f var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String y4(d8f var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String e2(d8f var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static long l6(d8f var0, long var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String t9(d8f var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String z1(d8f var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String t4(d8f var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String q0(d8f var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String z3(d8f var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static byte n5(d8f var0, byte var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static int k5(d8f var0, int var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static long k5(d8f var0, long var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static String m1(d8f var0, String var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static String k7(d8f var0, String var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static String m3(d8f var0, String var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static String n5(d8f var0) {
      return var0.a0;
   }

   // $VF: synthetic method
   static String z8(d8f var0, String var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static String l6(d8f var0) {
      return var0.d2;
   }

   // $VF: synthetic method
   static List k5(d8f var0) {
      return var0.d5;
   }

   // $VF: synthetic method
   static List u3(d8f var0) {
      return var0.s3;
   }
}
