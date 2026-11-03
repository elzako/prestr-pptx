package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class c4f extends b3 {
   private String n5;
   private long l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private byte n3;
   private int y4;
   private long e2;
   private String t9;
   private String z1;
   private String t4;
   private c6x q0;
   private List<l4y> z3;
   private List<g7> m1;
   private static final com.aspose.slides.internal.v6g.u9 k7 = new com.aspose.slides.internal.v6g.u9(
      "svg:y",
      "draw:z-index",
      "draw:name",
      "draw:id",
      "draw:style-name",
      "draw:class-names",
      "presentation:style-name",
      "presentation:class-names",
      "table:end-cell-address",
      "table:end-x",
      "table:end-y",
      "table:table-background",
      "text:anchor-type",
      "text:anchor-page-number",
      "draw:caption-id",
      "title",
      "desc",
      "event-listeners",
      "glue-point",
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
      "custom-shape"
   );

   public c4f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      c4f$1 var2 = new c4f$1(this);
      n5(var1, var2);
      n5(var1, new c4f$2(this, var1));
   }

   public c4f() {
      this.u9();
   }

   private void u9() {
      this.l6 = 4294967295L;
      this.n3 = -1;
      this.y4 = 0;
      this.e2 = 4294967295L;
      this.z3 = new List<>();
      this.m1 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("svg:y", this.n5);
      }

      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("draw:z-index", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("draw:name", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("draw:id", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("draw:style-name", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("draw:class-names", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("presentation:style-name", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("presentation:class-names", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("table:end-cell-address", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("table:end-x", this.s7);
      }

      if (this.x8 != null) {
         var2.l6("table:end-y", this.x8);
      }

      if (this.n3 != -1) {
         var2.l6("table:table-background", this.n3 == 1 ? "true" : "false");
      }

      if (this.y4 != 0) {
         var2.l6("text:anchor-type", k7p.n5(this.y4));
      }

      if ((this.e2 & 4294967295L) != 4294967295L) {
         var2.l6("text:anchor-page-number", com.aspose.slides.ms.System.Xml.f4.l6(this.e2));
      }

      if (this.t9 != null) {
         var2.l6("draw:caption-id", this.t9);
      }

      if (this.z1 != null) {
         this.n5("svg", var2, "title", this.z1, false);
      }

      if (this.t4 != null) {
         this.n5("svg", var2, "desc", this.t4, false);
      }

      if (this.q0 != null) {
         this.q0.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.z3.iterator();

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

      List$Enumerator var14 = this.m1.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (k7.n5(var6.n5())) {
               case 19:
                  ((e6x)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 20:
                  ((j6v)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 21:
                  ((u5l)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 22:
                  ((s4p)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 23:
                  ((z7d)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 24:
                  ((c5w)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 25:
                  ((f1h)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 26:
                  ((d2z)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 27:
                  ((c4f)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 28:
                  ((h4i)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 29:
                  ((b4f)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 30:
                  ((v6z)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 31:
                  ((v8v)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 32:
                  ((l3d)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 33:
                  ((w4a)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 34:
                  ((d8f)var6.k5()).n5("dr3d", var2, var6.n5());
                  break;
               case 35:
                  ((g3c)var6.k5()).n5("draw", var2, var6.n5());
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
      switch (k7.n5(var1)) {
         case 19:
            var2 = new g7("rect", new e6x());
            break;
         case 20:
            var2 = new g7("line", new j6v());
            break;
         case 21:
            var2 = new g7("polyline", new u5l());
            break;
         case 22:
            var2 = new g7("polygon", new s4p());
            break;
         case 23:
            var2 = new g7("regular-polygon", new z7d());
            break;
         case 24:
            var2 = new g7("path", new c5w());
            break;
         case 25:
            var2 = new g7("circle", new f1h());
            break;
         case 26:
            var2 = new g7("ellipse", new d2z());
            break;
         case 27:
            var2 = new g7("g", new c4f());
            break;
         case 28:
            var2 = new g7("page-thumbnail", new h4i());
            break;
         case 29:
            var2 = new g7("frame", new b4f());
            break;
         case 30:
            var2 = new g7("measure", new v6z());
            break;
         case 31:
            var2 = new g7("caption", new v8v());
            break;
         case 32:
            var2 = new g7("connector", new l3d());
            break;
         case 33:
            var2 = new g7("control", new w4a());
            break;
         case 34:
            var2 = new g7("scene", new d8f());
            break;
         case 35:
            var2 = new g7("custom-shape", new g3c());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.m1.addItem(var2);
      return var2;
   }

   public final String n5() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final String l6() {
      return this.u3;
   }

   public final String k5() {
      return this.t4;
   }

   public final void k5(String var1) {
      this.t4 = var1;
   }

   public final List<g7> u3() {
      return this.m1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return k7;
   }

   // $VF: synthetic method
   static String n5(c4f var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(c4f var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(c4f var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(c4f var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(c4f var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(c4f var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(c4f var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(c4f var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(c4f var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String t2(c4f var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String s7(c4f var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static byte n5(c4f var0, byte var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static int n5(c4f var0, int var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static long l6(c4f var0, long var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String x8(c4f var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String n3(c4f var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String n5(c4f var0) {
      return var0.z1;
   }

   // $VF: synthetic method
   static String y4(c4f var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String l6(c4f var0) {
      return var0.t4;
   }

   // $VF: synthetic method
   static c6x n5(c4f var0, c6x var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static List k5(c4f var0) {
      return var0.z3;
   }

   // $VF: synthetic method
   static List u3(c4f var0) {
      return var0.m1;
   }
}
