package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class b4f extends b3 {
   private long n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private String n3;
   private byte y4;
   private int e2;
   private long t9;
   private String z1;
   private String t4;
   private String q0;
   private String z3;
   private String m1;
   private String k7;
   private String m3;
   private String z8;
   private int j5;
   private byte w1;
   private byte r4;
   private String c4;
   private List<g7> y2;
   private c6x y1;
   private List<l4y> a0;
   private o7s d2;
   private String d5;
   private String s3;
   private g7 p8;
   private static final com.aspose.slides.internal.v6g.u9 f2 = new com.aspose.slides.internal.v6g.u9(
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
      "svg:x",
      "svg:y",
      "svg:width",
      "svg:height",
      "style:rel-width",
      "style:rel-height",
      "draw:caption-id",
      "presentation:class",
      "presentation:placeholder",
      "presentation:user-transformed",
      "draw:copy-of",
      "text-box",
      "image",
      "object",
      "object-ole",
      "applet",
      "floating-frame",
      "plugin",
      "table",
      "event-listeners",
      "glue-point",
      "image-map",
      "title",
      "desc",
      "contour-polygon",
      "contour-path"
   );

   public b4f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t4();
      b4f$1 var2 = new b4f$1(this);
      n5(var1, var2);
      n5(var1, new b4f$2(this, var1));
   }

   public b4f() {
      this.t4();
   }

   private void t4() {
      this.n5 = 4294967295L;
      this.y4 = -1;
      this.e2 = 0;
      this.t9 = 4294967295L;
      this.j5 = 0;
      this.w1 = -1;
      this.r4 = -1;
      this.y2 = new List<>();
      this.a0 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("draw:id", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("draw:layer", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("draw:style-name", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("draw:class-names", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("presentation:style-name", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("presentation:class-names", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("draw:transform", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("draw:name", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("table:end-cell-address", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("table:end-x", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("table:end-y", this.n3);
      }

      if (this.y4 != -1) {
         var2.l6("table:table-background", this.y4 == 1 ? "true" : "false");
      }

      if (this.e2 != 0) {
         var2.l6("text:anchor-type", k7p.n5(this.e2));
      }

      if ((this.t9 & 4294967295L) != 4294967295L) {
         var2.l6("text:anchor-page-number", com.aspose.slides.ms.System.Xml.f4.l6(this.t9));
      }

      if (this.z1 != null) {
         var2.l6("draw:text-style-name", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("svg:x", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("svg:y", this.q0);
      }

      if (this.z3 != null) {
         var2.l6("svg:width", this.z3);
      }

      if (this.m1 != null) {
         var2.l6("svg:height", this.m1);
      }

      if (this.k7 != null) {
         var2.l6("style:rel-width", this.k7);
      }

      if (this.m3 != null) {
         var2.l6("style:rel-height", this.m3);
      }

      if (this.z8 != null) {
         var2.l6("draw:caption-id", this.z8);
      }

      if (this.j5 != 0) {
         var2.l6("presentation:class", w6n.n5(this.j5));
      }

      if (this.w1 != -1) {
         var2.l6("presentation:placeholder", this.w1 == 1 ? "true" : "false");
      }

      if (this.r4 != -1) {
         var2.l6("presentation:user-transformed", this.r4 == 1 ? "true" : "false");
      }

      if (this.c4 != null) {
         var2.l6("draw:copy-of", this.c4);
      }

      List$Enumerator var4 = this.y2.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (f2.n5(var5.n5())) {
               case 27:
                  ((o2e)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 28:
                  ((s3o)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 29:
                  ((n6k)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 30:
                  ((j1a)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 31:
                  ((w3i)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 32:
                  ((f2f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 33:
                  ((h9p)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 34:
                  ((y7e)var5.k5()).n5("table", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.y1 != null) {
         this.y1.n5("office", var2, "event-listeners");
      }

      List$Enumerator var14 = this.a0.iterator();

      try {
         while (var14.hasNext()) {
            l4y var6 = (l4y)var14.next();
            var6.n5("draw", var2, "glue-point");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.d2 != null) {
         this.d2.n5("draw", var2, "image-map");
      }

      if (this.d5 != null) {
         this.n5("svg", var2, "title", this.d5, false);
      }

      if (this.s3 != null) {
         this.n5("svg", var2, "desc", this.s3, false);
      }

      if (this.p8 != null) {
         switch (f2.n5(this.p8.n5())) {
            case 40:
               ((e5g)this.p8.k5()).n5("draw", var2, this.p8.n5());
               break;
            case 41:
               ((m3l)this.p8.k5()).n5("draw", var2, this.p8.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (f2.n5(var1)) {
         case 27:
            var2 = new g7("text-box", new o2e());
            break;
         case 28:
            var2 = new g7("image", new s3o());
            break;
         case 29:
            var2 = new g7("object", new n6k());
            break;
         case 30:
            var2 = new g7("object-ole", new j1a());
            break;
         case 31:
            var2 = new g7("applet", new w3i());
            break;
         case 32:
            var2 = new g7("floating-frame", new f2f());
            break;
         case 33:
            var2 = new g7("plugin", new h9p());
            break;
         case 34:
            var2 = new g7("table", new y7e());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.y2.addItem(var2);
      return var2;
   }

   public final String n5() {
      return this.l6;
   }

   public final String l6() {
      return this.k5;
   }

   public final String k5() {
      return this.u3;
   }

   public final void l6(String var1) {
      this.u3 = var1;
   }

   public final String u3() {
      return this.u9;
   }

   public final void k5(String var1) {
      this.u9 = var1;
   }

   public final String a6() {
      return this.c8;
   }

   public final void u3(String var1) {
      this.c8 = var1;
   }

   public final String u9() {
      return this.t2;
   }

   public final void a6(String var1) {
      this.t2 = var1;
   }

   public final String h0() {
      return this.z1;
   }

   public final void u9(String var1) {
      this.z1 = var1;
   }

   public final String c8() {
      return this.t4;
   }

   public final void h0(String var1) {
      this.t4 = var1;
   }

   public final String t2() {
      return this.q0;
   }

   public final void c8(String var1) {
      this.q0 = var1;
   }

   public final String s7() {
      return this.z3;
   }

   public final void t2(String var1) {
      this.z3 = var1;
   }

   public final String x8() {
      return this.m1;
   }

   public final void s7(String var1) {
      this.m1 = var1;
   }

   public final int n3() {
      return this.j5;
   }

   public final void n5(int var1) {
      this.j5 = var1;
   }

   public final void n5(byte var1) {
      this.w1 = var1;
   }

   public final byte y4() {
      return this.r4;
   }

   public final void l6(byte var1) {
      this.r4 = var1;
   }

   public final List<g7> e2() {
      return this.y2;
   }

   public final String t9() {
      return this.s3;
   }

   public final void x8(String var1) {
      this.s3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 z1() {
      return f2;
   }

   // $VF: synthetic method
   static long n5(b4f var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(b4f var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(b4f var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(b4f var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(b4f var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(b4f var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(b4f var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(b4f var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(b4f var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String t2(b4f var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String s7(b4f var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String x8(b4f var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static byte n5(b4f var0, byte var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static int n5(b4f var0, int var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static long l6(b4f var0, long var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String n3(b4f var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String y4(b4f var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String e2(b4f var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String t9(b4f var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String z1(b4f var0, String var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String t4(b4f var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String q0(b4f var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String z3(b4f var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static int l6(b4f var0, int var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static byte l6(b4f var0, byte var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static byte k5(b4f var0, byte var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static String m1(b4f var0, String var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static List n5(b4f var0) {
      return var0.y2;
   }

   // $VF: synthetic method
   static c6x n5(b4f var0, c6x var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static List l6(b4f var0) {
      return var0.a0;
   }

   // $VF: synthetic method
   static o7s n5(b4f var0, o7s var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static String k7(b4f var0, String var1) {
      return var0.d5 = var1;
   }

   // $VF: synthetic method
   static String k5(b4f var0) {
      return var0.d5;
   }

   // $VF: synthetic method
   static String m3(b4f var0, String var1) {
      return var0.s3 = var1;
   }

   // $VF: synthetic method
   static String u3(b4f var0) {
      return var0.s3;
   }

   // $VF: synthetic method
   static g7 n5(b4f var0, g7 var1) {
      return var0.p8 = var1;
   }
}
