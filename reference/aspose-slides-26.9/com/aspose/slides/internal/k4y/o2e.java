package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class o2e extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private List<g7> c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "draw:chain-next-name",
      "draw:corner-radius",
      "fo:min-height",
      "fo:min-width",
      "fo:max-height",
      "fo:max-width",
      "text:id",
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

   public o2e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      o2e$1 var2 = new o2e$1(this);
      n5(var1, var2);
      n5(var1, new o2e$2(this, var1));
   }

   public o2e() {
      this.k5();
   }

   private void k5() {
      this.c8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("draw:chain-next-name", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("draw:corner-radius", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("fo:min-height", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("fo:min-width", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("fo:max-height", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("fo:max-width", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("text:id", this.h0);
      }

      List$Enumerator var4 = this.c8.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (t2.n5(var5.n5())) {
               case 7:
                  ((m2v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 8:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 9:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 10:
                  ((e2q)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 11:
                  ((y7e)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 12:
                  ((y3o)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 13:
                  ((x6o)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 14:
                  ((j0v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 15:
                  ((o1b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 16:
                  ((e1e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 17:
                  ((i6x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 18:
                  ((i2e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 19:
                  ((q5c)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 20:
                  ((s1f)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 21:
                  ((z4m)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 22:
                  ((e6x)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 23:
                  ((j6v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 24:
                  ((u5l)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 25:
                  ((s4p)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 26:
                  ((z7d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 27:
                  ((c5w)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 28:
                  ((f1h)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 29:
                  ((d2z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 30:
                  ((c4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 31:
                  ((h4i)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 32:
                  ((b4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 33:
                  ((v6z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 34:
                  ((v8v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 35:
                  ((l3d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 36:
                  ((w4a)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 37:
                  ((d8f)var5.k5()).n5("dr3d", var2, var5.n5());
                  break;
               case 38:
                  ((g3c)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 39:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 40:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 41:
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
      switch (t2.n5(var1)) {
         case 7:
            var2 = new g7("h", new m2v());
            break;
         case 8:
            var2 = new g7("p", new u1x());
            break;
         case 9:
            var2 = new g7("list", new u0y());
            break;
         case 10:
            var2 = new g7("numbered-paragraph", new e2q());
            break;
         case 11:
            var2 = new g7("table", new y7e());
            break;
         case 12:
            var2 = new g7("a", new y3o());
            break;
         case 13:
            var2 = new g7("section", new x6o());
            break;
         case 14:
            var2 = new g7("soft-page-break", new j0v());
            break;
         case 15:
            var2 = new g7("table-of-content", new o1b());
            break;
         case 16:
            var2 = new g7("illustration-index", new e1e());
            break;
         case 17:
            var2 = new g7("table-index", new i6x());
            break;
         case 18:
            var2 = new g7("object-index", new i2e());
            break;
         case 19:
            var2 = new g7("user-index", new q5c());
            break;
         case 20:
            var2 = new g7("alphabetical-index", new s1f());
            break;
         case 21:
            var2 = new g7("bibliography", new z4m());
            break;
         case 22:
            var2 = new g7("rect", new e6x());
            break;
         case 23:
            var2 = new g7("line", new j6v());
            break;
         case 24:
            var2 = new g7("polyline", new u5l());
            break;
         case 25:
            var2 = new g7("polygon", new s4p());
            break;
         case 26:
            var2 = new g7("regular-polygon", new z7d());
            break;
         case 27:
            var2 = new g7("path", new c5w());
            break;
         case 28:
            var2 = new g7("circle", new f1h());
            break;
         case 29:
            var2 = new g7("ellipse", new d2z());
            break;
         case 30:
            var2 = new g7("g", new c4f());
            break;
         case 31:
            var2 = new g7("page-thumbnail", new h4i());
            break;
         case 32:
            var2 = new g7("frame", new b4f());
            break;
         case 33:
            var2 = new g7("measure", new v6z());
            break;
         case 34:
            var2 = new g7("caption", new v8v());
            break;
         case 35:
            var2 = new g7("connector", new l3d());
            break;
         case 36:
            var2 = new g7("control", new w4a());
            break;
         case 37:
            var2 = new g7("scene", new d8f());
            break;
         case 38:
            var2 = new g7("custom-shape", new g3c());
            break;
         case 39:
            var2 = new g7("change", new t2s());
            break;
         case 40:
            var2 = new g7("change-start", new t2s());
            break;
         case 41:
            var2 = new g7("change-end", new t2s());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.c8.addItem(var2);
      return var2;
   }

   public final List<g7> n5() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(o2e var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(o2e var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(o2e var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(o2e var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(o2e var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(o2e var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String h0(o2e var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static List n5(o2e var0) {
      return var0.c8;
   }
}
