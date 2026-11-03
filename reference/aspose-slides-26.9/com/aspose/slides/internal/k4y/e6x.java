package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class e6x extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private long u9;
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
   private String t4;
   private byte q0;
   private int z3;
   private long m1;
   private String k7;
   private String m3;
   private String z8;
   private String j5;
   private c6x w1;
   private List<l4y> r4;
   private List<g7> c4;
   private static final com.aspose.slides.internal.v6g.u9 y2 = new com.aspose.slides.internal.v6g.u9(
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
      "draw:caption-id",
      "title",
      "desc",
      "event-listeners",
      "glue-point",
      "p",
      "list"
   );

   public e6x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t9();
      e6x$1 var2 = new e6x$1(this);
      n5(var1, var2);
      n5(var1, new e6x$2(this, var1));
   }

   public e6x() {
      this.t9();
   }

   private void t9() {
      this.u9 = 4294967295L;
      this.q0 = -1;
      this.z3 = 0;
      this.m1 = 4294967295L;
      this.r4 = new List<>();
      this.c4 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("draw:corner-radius", this.n5);
      }

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

      if ((this.u9 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("draw:id", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("draw:layer", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("draw:style-name", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("draw:class-names", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("presentation:style-name", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("presentation:class-names", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("draw:transform", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("draw:name", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("table:end-cell-address", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("table:end-x", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("table:end-y", this.t4);
      }

      if (this.q0 != -1) {
         var2.l6("table:table-background", this.q0 == 1 ? "true" : "false");
      }

      if (this.z3 != 0) {
         var2.l6("text:anchor-type", k7p.n5(this.z3));
      }

      if ((this.m1 & 4294967295L) != 4294967295L) {
         var2.l6("text:anchor-page-number", com.aspose.slides.ms.System.Xml.f4.l6(this.m1));
      }

      if (this.k7 != null) {
         var2.l6("draw:text-style-name", this.k7);
      }

      if (this.m3 != null) {
         var2.l6("draw:caption-id", this.m3);
      }

      if (this.z8 != null) {
         this.n5("svg", var2, "title", this.z8, false);
      }

      if (this.j5 != null) {
         this.n5("svg", var2, "desc", this.j5, false);
      }

      if (this.w1 != null) {
         this.w1.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.r4.iterator();

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

      List$Enumerator var14 = this.c4.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (y2.n5(var6.n5())) {
               case 26:
                  ((u1x)var6.k5()).n5("text", var2, var6.n5());
                  break;
               case 27:
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
      switch (y2.n5(var1)) {
         case 26:
            var2 = new g7("p", new u1x());
            break;
         case 27:
            var2 = new g7("list", new u0y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.c4.addItem(var2);
      return var2;
   }

   public final String n5() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void u3(String var1) {
      this.u3 = var1;
   }

   public final String u3() {
      return this.a6;
   }

   public final void a6(String var1) {
      this.a6 = var1;
   }

   public final String a6() {
      return this.h0;
   }

   public final String u9() {
      return this.c8;
   }

   public final String h0() {
      return this.t2;
   }

   public final void u9(String var1) {
      this.t2 = var1;
   }

   public final String c8() {
      return this.x8;
   }

   public final String t2() {
      return this.y4;
   }

   public final void h0(String var1) {
      this.y4 = var1;
   }

   public final String s7() {
      return this.e2;
   }

   public final void c8(String var1) {
      this.e2 = var1;
   }

   public final String x8() {
      return this.k7;
   }

   public final String n3() {
      return this.j5;
   }

   public final void t2(String var1) {
      this.j5 = var1;
   }

   public final List<g7> y4() {
      return this.c4;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 e2() {
      return y2;
   }

   // $VF: synthetic method
   static String n5(e6x var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(e6x var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(e6x var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(e6x var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(e6x var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long n5(e6x var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(e6x var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(e6x var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(e6x var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String t2(e6x var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String s7(e6x var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String x8(e6x var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String n3(e6x var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String y4(e6x var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String e2(e6x var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String t9(e6x var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String z1(e6x var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static byte n5(e6x var0, byte var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int n5(e6x var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static long l6(e6x var0, long var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String t4(e6x var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String q0(e6x var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String z3(e6x var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String n5(e6x var0) {
      return var0.z8;
   }

   // $VF: synthetic method
   static String m1(e6x var0, String var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static String l6(e6x var0) {
      return var0.j5;
   }

   // $VF: synthetic method
   static c6x n5(e6x var0, c6x var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static List k5(e6x var0) {
      return var0.r4;
   }

   // $VF: synthetic method
   static List u3(e6x var0) {
      return var0.c4;
   }
}
