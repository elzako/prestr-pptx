package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class m4n extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private List<g7> h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "presentation:use-header-name",
      "presentation:use-footer-name",
      "presentation:use-date-time-name",
      "presentation:presentation-page-layout-name",
      "style:page-layout-name",
      "draw:style-name",
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

   public m4n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      m4n$1 var2 = new m4n$1(this);
      n5(var1, var2);
      n5(var1, new m4n$2(this, var1));
   }

   public m4n() {
      this.u3();
   }

   private void u3() {
      this.h0 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("presentation:use-header-name", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("presentation:use-footer-name", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("presentation:use-date-time-name", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("presentation:presentation-page-layout-name", this.u3);
      }

      var2.l6("style:page-layout-name", this.a6);
      if (this.u9 != null) {
         var2.l6("draw:style-name", this.u9);
      }

      List$Enumerator var4 = this.h0.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (c8.n5(var5.n5())) {
               case 6:
                  ((e6x)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 7:
                  ((j6v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 8:
                  ((u5l)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 9:
                  ((s4p)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 10:
                  ((z7d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 11:
                  ((c5w)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 12:
                  ((f1h)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 13:
                  ((d2z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 14:
                  ((c4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 15:
                  ((h4i)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 16:
                  ((b4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 17:
                  ((v6z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 18:
                  ((v8v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 19:
                  ((l3d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 20:
                  ((w4a)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 21:
                  ((d8f)var5.k5()).n5("dr3d", var2, var5.n5());
                  break;
               case 22:
                  ((g3c)var5.k5()).n5("draw", var2, var5.n5());
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
      switch (c8.n5(var1)) {
         case 6:
            var2 = new g7("rect", new e6x());
            break;
         case 7:
            var2 = new g7("line", new j6v());
            break;
         case 8:
            var2 = new g7("polyline", new u5l());
            break;
         case 9:
            var2 = new g7("polygon", new s4p());
            break;
         case 10:
            var2 = new g7("regular-polygon", new z7d());
            break;
         case 11:
            var2 = new g7("path", new c5w());
            break;
         case 12:
            var2 = new g7("circle", new f1h());
            break;
         case 13:
            var2 = new g7("ellipse", new d2z());
            break;
         case 14:
            var2 = new g7("g", new c4f());
            break;
         case 15:
            var2 = new g7("page-thumbnail", new h4i());
            break;
         case 16:
            var2 = new g7("frame", new b4f());
            break;
         case 17:
            var2 = new g7("measure", new v6z());
            break;
         case 18:
            var2 = new g7("caption", new v8v());
            break;
         case 19:
            var2 = new g7("connector", new l3d());
            break;
         case 20:
            var2 = new g7("control", new w4a());
            break;
         case 21:
            var2 = new g7("scene", new d8f());
            break;
         case 22:
            var2 = new g7("custom-shape", new g3c());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.h0.addItem(var2);
      return var2;
   }

   public final void l6(String var1) {
      this.a6 = var1;
   }

   public final String n5() {
      return this.u9;
   }

   public final void k5(String var1) {
      this.u9 = var1;
   }

   public final List<g7> l6() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(m4n var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(m4n var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(m4n var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(m4n var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(m4n var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(m4n var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static List n5(m4n var0) {
      return var0.h0;
   }
}
