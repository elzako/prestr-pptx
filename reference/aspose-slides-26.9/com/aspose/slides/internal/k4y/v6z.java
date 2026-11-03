package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class v6z extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private long a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private byte t4;
   private int q0;
   private long z3;
   private String m1;
   private String k7;
   private String m3;
   private String z8;
   private c6x j5;
   private List<l4y> w1;
   private List<g7> r4;
   private static final com.aspose.slides.internal.v6g.u9 c4 = new com.aspose.slides.internal.v6g.u9(
      "svg:x1",
      "svg:y1",
      "svg:x2",
      "svg:y2",
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

   public v6z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      v6z$1 var2 = new v6z$1(this);
      n5(var1, var2);
      n5(var1, new v6z$2(this, var1));
   }

   public v6z() {
      this.l6();
   }

   private void l6() {
      this.a6 = 4294967295L;
      this.t4 = -1;
      this.q0 = 0;
      this.z3 = 4294967295L;
      this.w1 = new List<>();
      this.r4 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("svg:x1", this.n5);
      var2.l6("svg:y1", this.l6);
      var2.l6("svg:x2", this.k5);
      var2.l6("svg:y2", this.u3);
      if ((this.a6 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("draw:id", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("draw:layer", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("draw:style-name", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("draw:class-names", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("presentation:style-name", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("presentation:class-names", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("draw:transform", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("draw:name", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("table:end-cell-address", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("table:end-x", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("table:end-y", this.z1);
      }

      if (this.t4 != -1) {
         var2.l6("table:table-background", this.t4 == 1 ? "true" : "false");
      }

      if (this.q0 != 0) {
         var2.l6("text:anchor-type", k7p.n5(this.q0));
      }

      if ((this.z3 & 4294967295L) != 4294967295L) {
         var2.l6("text:anchor-page-number", com.aspose.slides.ms.System.Xml.f4.l6(this.z3));
      }

      if (this.m1 != null) {
         var2.l6("draw:text-style-name", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("draw:caption-id", this.k7);
      }

      if (this.m3 != null) {
         this.n5("svg", var2, "title", this.m3, false);
      }

      if (this.z8 != null) {
         this.n5("svg", var2, "desc", this.z8, false);
      }

      if (this.j5 != null) {
         this.j5.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.w1.iterator();

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

      List$Enumerator var14 = this.r4.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (c4.n5(var6.n5())) {
               case 25:
                  ((u1x)var6.k5()).n5("text", var2, var6.n5());
                  break;
               case 26:
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
      return c4;
   }

   // $VF: synthetic method
   static String n5(v6z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(v6z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(v6z var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(v6z var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long n5(v6z var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(v6z var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(v6z var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(v6z var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(v6z var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String t2(v6z var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String s7(v6z var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String x8(v6z var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String n3(v6z var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String y4(v6z var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String e2(v6z var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String t9(v6z var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static byte n5(v6z var0, byte var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int n5(v6z var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static long l6(v6z var0, long var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String z1(v6z var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String t4(v6z var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String q0(v6z var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String n5(v6z var0) {
      return var0.m3;
   }

   // $VF: synthetic method
   static String z3(v6z var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String l6(v6z var0) {
      return var0.z8;
   }

   // $VF: synthetic method
   static c6x n5(v6z var0, c6x var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static List k5(v6z var0) {
      return var0.w1;
   }

   // $VF: synthetic method
   static List u3(v6z var0) {
      return var0.r4;
   }
}
