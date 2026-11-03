package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class p6d extends b3 {
   private long k5;
   private String u3;
   private String a6;
   private String u9;
   private int h0;
   private double c8;
   private String t2;
   private com.aspose.slides.ms.System.j5 s7 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.s4 x8 = new com.aspose.slides.ms.System.s4();
   private byte n3;
   private String y4;
   private boolean e2;
   private long t9;
   private long z1;
   private long t4;
   private long q0;
   private b3d z3;
   private j8d m1;
   private k3m k7;
   private List<g7> m3;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   public static final com.aspose.slides.ms.System.s4 l6 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 z8 = new com.aspose.slides.internal.v6g.u9(
      "table:number-columns-repeated",
      "table:style-name",
      "table:content-validation-name",
      "table:formula",
      "office:value-type",
      "office:value",
      "office:currency",
      "office:date-value",
      "office:time-value",
      "office:boolean-value",
      "office:string-value",
      "table:protect",
      "table:number-columns-spanned",
      "table:number-rows-spanned",
      "table:number-matrix-columns-spanned",
      "table:number-matrix-rows-spanned",
      "cell-range-source",
      "annotation",
      "detective",
      "h",
      "p",
      "list",
      "numbered-paragraph",
      "table",
      "a",
      "section",
      "soft-page-break",
      "table-of-content",
      "illustration-index",
      "table-index",
      "object-index",
      "user-index",
      "alphabetical-index",
      "bibliography",
      "rect",
      "line",
      "polyline",
      "polygon",
      "regular-polygon",
      "path",
      "circle",
      "ellipse",
      "g",
      "page-thumbnail",
      "frame",
      "measure",
      "caption",
      "connector",
      "control",
      "scene",
      "custom-shape",
      "change",
      "change-start",
      "change-end"
   );

   public p6d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.y4();
      p6d$1 var2 = new p6d$1(this);
      n5(var1, var2);
      n5(var1, new p6d$2(this, var1));
   }

   public p6d() {
      this.y4();
   }

   private void y4() {
      this.k5 = 1L;
      this.h0 = 0;
      this.c8 = Double.NaN;
      n5.u3(this.s7);
      l6.u3(this.x8);
      this.n3 = -1;
      this.e2 = false;
      this.t9 = 1L;
      this.z1 = 1L;
      this.t4 = 4294967295L;
      this.q0 = 4294967295L;
      this.m3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.k5 & 4294967295L) != 1L) {
         var2.l6("table:number-columns-repeated", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("table:style-name", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("table:content-validation-name", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("table:formula", this.u9);
      }

      if (this.h0 != 0) {
         var2.l6("office:value-type", x6e.n5(this.h0));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.c8)) {
         var2.l6("office:value", com.aspose.slides.ms.System.Xml.f4.n5(this.c8));
      }

      if (this.t2 != null) {
         var2.l6("office:currency", this.t2);
      }

      if (com.aspose.slides.ms.System.j5.c8(this.s7, n5)) {
         var2.l6("office:date-value", com.aspose.slides.ms.System.Xml.f4.n5(this.s7.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      if (com.aspose.slides.ms.System.s4.a6(this.x8, l6)) {
         var2.l6("office:time-value", n5(this.x8.n3()));
      }

      if (this.n3 != -1) {
         var2.l6("office:boolean-value", this.n3 == 1 ? "true" : "false");
      }

      if (this.y4 != null) {
         var2.l6("office:string-value", this.y4);
      }

      if (this.e2) {
         var2.l6("table:protect", this.e2 ? "true" : "false");
      }

      if ((this.t9 & 4294967295L) != 1L) {
         var2.l6("table:number-columns-spanned", com.aspose.slides.ms.System.Xml.f4.l6(this.t9));
      }

      if ((this.z1 & 4294967295L) != 1L) {
         var2.l6("table:number-rows-spanned", com.aspose.slides.ms.System.Xml.f4.l6(this.z1));
      }

      if ((this.t4 & 4294967295L) != 4294967295L) {
         var2.l6("table:number-matrix-columns-spanned", com.aspose.slides.ms.System.Xml.f4.l6(this.t4));
      }

      if ((this.q0 & 4294967295L) != 4294967295L) {
         var2.l6("table:number-matrix-rows-spanned", com.aspose.slides.ms.System.Xml.f4.l6(this.q0));
      }

      if (this.z3 != null) {
         this.z3.n5("table", var2, "cell-range-source");
      }

      if (this.m1 != null) {
         this.m1.n5("office", var2, "annotation");
      }

      if (this.k7 != null) {
         this.k7.n5("table", var2, "detective");
      }

      List$Enumerator var4 = this.m3.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (z8.n5(var5.n5())) {
               case 19:
                  ((m2v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 20:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 21:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 22:
                  ((e2q)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 23:
                  ((y7e)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 24:
                  ((y3o)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 25:
                  ((x6o)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 26:
                  ((j0v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 27:
                  ((o1b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 28:
                  ((e1e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 29:
                  ((i6x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 30:
                  ((i2e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 31:
                  ((q5c)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 32:
                  ((s1f)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 33:
                  ((z4m)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 34:
                  ((e6x)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 35:
                  ((j6v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 36:
                  ((u5l)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 37:
                  ((s4p)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 38:
                  ((z7d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 39:
                  ((c5w)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 40:
                  ((f1h)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 41:
                  ((d2z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 42:
                  ((c4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 43:
                  ((h4i)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 44:
                  ((b4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 45:
                  ((v6z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 46:
                  ((v8v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 47:
                  ((l3d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 48:
                  ((w4a)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 49:
                  ((d8f)var5.k5()).n5("dr3d", var2, var5.n5());
                  break;
               case 50:
                  ((g3c)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 51:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 52:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 53:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (z8.n5(var1)) {
         case 19:
            var2 = new g7("h", new m2v());
            break;
         case 20:
            var2 = new g7("p", new u1x());
            break;
         case 21:
            var2 = new g7("list", new u0y());
            break;
         case 22:
            var2 = new g7("numbered-paragraph", new e2q());
            break;
         case 23:
            var2 = new g7("table", new y7e());
            break;
         case 24:
            var2 = new g7("a", new y3o());
            break;
         case 25:
            var2 = new g7("section", new x6o());
            break;
         case 26:
            var2 = new g7("soft-page-break", new j0v());
            break;
         case 27:
            var2 = new g7("table-of-content", new o1b());
            break;
         case 28:
            var2 = new g7("illustration-index", new e1e());
            break;
         case 29:
            var2 = new g7("table-index", new i6x());
            break;
         case 30:
            var2 = new g7("object-index", new i2e());
            break;
         case 31:
            var2 = new g7("user-index", new q5c());
            break;
         case 32:
            var2 = new g7("alphabetical-index", new s1f());
            break;
         case 33:
            var2 = new g7("bibliography", new z4m());
            break;
         case 34:
            var2 = new g7("rect", new e6x());
            break;
         case 35:
            var2 = new g7("line", new j6v());
            break;
         case 36:
            var2 = new g7("polyline", new u5l());
            break;
         case 37:
            var2 = new g7("polygon", new s4p());
            break;
         case 38:
            var2 = new g7("regular-polygon", new z7d());
            break;
         case 39:
            var2 = new g7("path", new c5w());
            break;
         case 40:
            var2 = new g7("circle", new f1h());
            break;
         case 41:
            var2 = new g7("ellipse", new d2z());
            break;
         case 42:
            var2 = new g7("g", new c4f());
            break;
         case 43:
            var2 = new g7("page-thumbnail", new h4i());
            break;
         case 44:
            var2 = new g7("frame", new b4f());
            break;
         case 45:
            var2 = new g7("measure", new v6z());
            break;
         case 46:
            var2 = new g7("caption", new v8v());
            break;
         case 47:
            var2 = new g7("connector", new l3d());
            break;
         case 48:
            var2 = new g7("control", new w4a());
            break;
         case 49:
            var2 = new g7("scene", new d8f());
            break;
         case 50:
            var2 = new g7("custom-shape", new g3c());
            break;
         case 51:
            var2 = new g7("change", new t2s());
            break;
         case 52:
            var2 = new g7("change-start", new t2s());
            break;
         case 53:
            var2 = new g7("change-end", new t2s());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.m3.addItem(var2);
      return var2;
   }

   public final String n5() {
      return this.u3;
   }

   public final void l6(String var1) {
      this.u3 = var1;
   }

   public final int l6() {
      return this.h0;
   }

   public final double k5() {
      return this.c8;
   }

   public final String u3() {
      return this.t2;
   }

   public final com.aspose.slides.ms.System.j5 a6() {
      return this.s7;
   }

   public final com.aspose.slides.ms.System.s4 u9() {
      return this.x8;
   }

   public final byte h0() {
      return this.n3;
   }

   public final String c8() {
      return this.y4;
   }

   public final long t2() {
      return this.t9;
   }

   public final void n5(long var1) {
      this.t9 = var1;
   }

   public final long s7() {
      return this.z1;
   }

   public final void l6(long var1) {
      this.z1 = var1;
   }

   public final List<g7> x8() {
      return this.m3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return z8;
   }

   // $VF: synthetic method
   static long n5(p6d var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(p6d var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(p6d var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(p6d var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int n5(p6d var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static double n5(p6d var0, double var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u3(p6d var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(p6d var0) {
      return var0.s7;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 l6(p6d var0) {
      return var0.x8;
   }

   // $VF: synthetic method
   static byte n5(p6d var0, byte var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String a6(p6d var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean n5(p6d var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static long l6(p6d var0, long var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static long k5(p6d var0, long var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static long u3(p6d var0, long var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static long a6(p6d var0, long var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static b3d n5(p6d var0, b3d var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static j8d n5(p6d var0, j8d var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static k3m n5(p6d var0, k3m var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static List k5(p6d var0) {
      return var0.m3;
   }
}
