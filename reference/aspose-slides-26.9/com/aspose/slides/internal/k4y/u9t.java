package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class u9t extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private h6j u9;
   private m1g h0;
   private i4v c8;
   private x0a t2;
   private b4i s7;
   private List<y2i> x8;
   private List<g7> n3;
   private p0i y4;
   private static final com.aspose.slides.internal.v6g.u9 e2 = new com.aspose.slides.internal.v6g.u9(
      "style:name",
      "style:display-name",
      "style:page-layout-name",
      "draw:style-name",
      "style:next-style-name",
      "header",
      "header-left",
      "footer",
      "footer-left",
      "forms",
      "style",
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
      "notes"
   );

   public u9t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      u9t$1 var2 = new u9t$1(this);
      n5(var1, var2);
      n5(var1, new u9t$2(this, var1));
   }

   public u9t() {
      this.h0();
      this.u9 = new h6j();
      this.c8 = new i4v();
   }

   private void h0() {
      this.x8 = new List<>();
      this.n3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:name", this.n5);
      if (this.l6 != null) {
         var2.l6("style:display-name", this.l6);
      }

      var2.l6("style:page-layout-name", this.k5);
      if (this.u3 != null) {
         var2.l6("draw:style-name", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("style:next-style-name", this.a6);
      }

      if (this.u9 != null) {
         this.u9.n5("style", var2, "header");
      }

      if (this.h0 != null) {
         this.h0.n5("style", var2, "header-left");
      }

      if (this.c8 != null) {
         this.c8.n5("style", var2, "footer");
      }

      if (this.t2 != null) {
         this.t2.n5("style", var2, "footer-left");
      }

      if (this.s7 != null) {
         this.s7.n5("office", var2, "forms");
      }

      List$Enumerator var4 = this.x8.iterator();

      try {
         while (var4.hasNext()) {
            y2i var5 = (y2i)var4.next();
            var5.n5("style", var2, "style");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.n3.iterator();

      try {
         while (var14.hasNext()) {
            g7 var6 = (g7)var14.next();
            switch (e2.n5(var6.n5())) {
               case 11:
                  ((e6x)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 12:
                  ((j6v)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 13:
                  ((u5l)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 14:
                  ((s4p)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 15:
                  ((z7d)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 16:
                  ((c5w)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 17:
                  ((f1h)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 18:
                  ((d2z)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 19:
                  ((c4f)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 20:
                  ((h4i)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 21:
                  ((b4f)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 22:
                  ((v6z)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 23:
                  ((v8v)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 24:
                  ((l3d)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 25:
                  ((w4a)var6.k5()).n5("draw", var2, var6.n5());
                  break;
               case 26:
                  ((d8f)var6.k5()).n5("dr3d", var2, var6.n5());
                  break;
               case 27:
                  ((g3c)var6.k5()).n5("draw", var2, var6.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.y4 != null) {
         this.y4.n5("presentation", var2, "notes");
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (e2.n5(var1)) {
         case 11:
            var2 = new g7("rect", new e6x());
            break;
         case 12:
            var2 = new g7("line", new j6v());
            break;
         case 13:
            var2 = new g7("polyline", new u5l());
            break;
         case 14:
            var2 = new g7("polygon", new s4p());
            break;
         case 15:
            var2 = new g7("regular-polygon", new z7d());
            break;
         case 16:
            var2 = new g7("path", new c5w());
            break;
         case 17:
            var2 = new g7("circle", new f1h());
            break;
         case 18:
            var2 = new g7("ellipse", new d2z());
            break;
         case 19:
            var2 = new g7("g", new c4f());
            break;
         case 20:
            var2 = new g7("page-thumbnail", new h4i());
            break;
         case 21:
            var2 = new g7("frame", new b4f());
            break;
         case 22:
            var2 = new g7("measure", new v6z());
            break;
         case 23:
            var2 = new g7("caption", new v8v());
            break;
         case 24:
            var2 = new g7("connector", new l3d());
            break;
         case 25:
            var2 = new g7("control", new w4a());
            break;
         case 26:
            var2 = new g7("scene", new d8f());
            break;
         case 27:
            var2 = new g7("custom-shape", new g3c());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.n3.addItem(var2);
      return var2;
   }

   public final String n5() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.n5 = var1;
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

   public final List<g7> u3() {
      return this.n3;
   }

   public final p0i a6() {
      return this.y4;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return e2;
   }

   // $VF: synthetic method
   static String n5(u9t var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(u9t var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(u9t var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(u9t var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(u9t var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static h6j n5(u9t var0, h6j var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static m1g n5(u9t var0, m1g var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static i4v n5(u9t var0, i4v var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static x0a n5(u9t var0, x0a var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static b4i n5(u9t var0, b4i var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static List n5(u9t var0) {
      return var0.x8;
   }

   // $VF: synthetic method
   static List l6(u9t var0) {
      return var0.n3;
   }

   // $VF: synthetic method
   static p0i n5(u9t var0, p0i var1) {
      return var0.y4 = var1;
   }
}
