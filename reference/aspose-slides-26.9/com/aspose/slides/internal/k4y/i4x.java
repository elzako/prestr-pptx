package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class i4x extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private b4i s7;
   private List<g7> x8;
   private g7 n3;
   private p0i y4;
   private List<p3p> e2;
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9(
      "presentation:use-header-name",
      "presentation:use-footer-name",
      "presentation:use-date-time-name",
      "draw:name",
      "draw:style-name",
      "draw:master-page-name",
      "presentation:presentation-page-layout-name",
      "draw:id",
      "draw:nav-order",
      "forms",
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
      "animations",
      "animate",
      "set",
      "animateMotion",
      "animateColor",
      "animateTransform",
      "transitionFilter",
      "par",
      "seq",
      "iterate",
      "audio",
      "command",
      "notes",
      "annotation"
   );

   public i4x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.e2();
      i4x$1 var2 = new i4x$1(this);
      n5(var1, var2);
      n5(var1, new i4x$2(this, var1));
   }

   public i4x() {
      this.e2();
   }

   private void e2() {
      this.x8 = new List<>();
      this.e2 = new List<>();
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
         var2.l6("draw:name", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("draw:style-name", this.a6);
      }

      var2.l6("draw:master-page-name", this.u9);
      if (this.h0 != null) {
         var2.l6("presentation:presentation-page-layout-name", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("draw:id", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("draw:nav-order", this.t2);
      }

      if (this.s7 != null) {
         this.s7.n5("office", var2, "forms");
      }

      List$Enumerator var4 = this.x8.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (t9.n5(var5.n5())) {
               case 10:
                  ((e6x)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 11:
                  ((j6v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 12:
                  ((u5l)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 13:
                  ((s4p)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 14:
                  ((z7d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 15:
                  ((c5w)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 16:
                  ((f1h)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 17:
                  ((d2z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 18:
                  ((c4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 19:
                  ((h4i)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 20:
                  ((b4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 21:
                  ((v6z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 22:
                  ((v8v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 23:
                  ((l3d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 24:
                  ((w4a)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 25:
                  ((d8f)var5.k5()).n5("dr3d", var2, var5.n5());
                  break;
               case 26:
                  ((g3c)var5.k5()).n5("draw", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.n3 != null) {
         switch (t9.n5(this.n3.n5())) {
            case 27:
               ((q1c)this.n3.k5()).n5("presentation", var2, this.n3.n5());
               break;
            case 28:
               ((r2z)this.n3.k5()).n5("anim", var2, this.n3.n5());
               break;
            case 29:
               ((y2d)this.n3.k5()).n5("anim", var2, this.n3.n5());
               break;
            case 30:
               ((c6q)this.n3.k5()).n5("anim", var2, this.n3.n5());
               break;
            case 31:
               ((z8y)this.n3.k5()).n5("anim", var2, this.n3.n5());
               break;
            case 32:
               ((a6l)this.n3.k5()).n5("anim", var2, this.n3.n5());
               break;
            case 33:
               ((r3k)this.n3.k5()).n5("anim", var2, this.n3.n5());
               break;
            case 34:
               ((g4z)this.n3.k5()).n5("anim", var2, this.n3.n5());
               break;
            case 35:
               ((n8k)this.n3.k5()).n5("anim", var2, this.n3.n5());
               break;
            case 36:
               ((p8u)this.n3.k5()).n5("anim", var2, this.n3.n5());
               break;
            case 37:
               ((y8g)this.n3.k5()).n5("anim", var2, this.n3.n5());
               break;
            case 38:
               ((k6o)this.n3.k5()).n5("anim", var2, this.n3.n5());
         }
      }

      if (this.y4 != null) {
         this.y4.n5("presentation", var2, "notes");
      }

      List$Enumerator var14 = this.e2.iterator();

      try {
         while (var14.hasNext()) {
            p3p var6 = (p3p)var14.next();
            var6.n5("officeooo", var2, "annotation");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   public final p0i n5() {
      if (this.y4 != null) {
         throw new Exception("Only one <notes> element can be added.");
      }

      this.y4 = new p0i();
      return this.y4;
   }

   public final p3p l6() {
      p3p var1 = new p3p();
      this.e2.addItem(var1);
      return var1;
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (t9.n5(var1)) {
         case 10:
            var2 = new g7("rect", new e6x());
            break;
         case 11:
            var2 = new g7("line", new j6v());
            break;
         case 12:
            var2 = new g7("polyline", new u5l());
            break;
         case 13:
            var2 = new g7("polygon", new s4p());
            break;
         case 14:
            var2 = new g7("regular-polygon", new z7d());
            break;
         case 15:
            var2 = new g7("path", new c5w());
            break;
         case 16:
            var2 = new g7("circle", new f1h());
            break;
         case 17:
            var2 = new g7("ellipse", new d2z());
            break;
         case 18:
            var2 = new g7("g", new c4f());
            break;
         case 19:
            var2 = new g7("page-thumbnail", new h4i());
            break;
         case 20:
            var2 = new g7("frame", new b4f());
            break;
         case 21:
            var2 = new g7("measure", new v6z());
            break;
         case 22:
            var2 = new g7("caption", new v8v());
            break;
         case 23:
            var2 = new g7("connector", new l3d());
            break;
         case 24:
            var2 = new g7("control", new w4a());
            break;
         case 25:
            var2 = new g7("scene", new d8f());
            break;
         case 26:
            var2 = new g7("custom-shape", new g3c());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.x8.addItem(var2);
      return var2;
   }

   public final String k5() {
      return this.l6;
   }

   public final String u3() {
      return this.k5;
   }

   public final String a6() {
      return this.u3;
   }

   public final void l6(String var1) {
      this.u3 = var1;
   }

   public final String u9() {
      return this.a6;
   }

   public final void k5(String var1) {
      this.a6 = var1;
   }

   public final String h0() {
      return this.u9;
   }

   public final void u3(String var1) {
      this.u9 = var1;
   }

   public final String c8() {
      return this.h0;
   }

   public final void a6(String var1) {
      this.c8 = var1;
   }

   public final List<g7> t2() {
      return this.x8;
   }

   public final g7 s7() {
      return this.n3;
   }

   public final p0i x8() {
      return this.y4;
   }

   public final p3p[] n3() {
      return this.e2.toArray(new p3p[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 y4() {
      return t9;
   }

   // $VF: synthetic method
   static String n5(i4x var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(i4x var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(i4x var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(i4x var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(i4x var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(i4x var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String h0(i4x var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String c8(i4x var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String t2(i4x var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static b4i n5(i4x var0, b4i var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static List n5(i4x var0) {
      return var0.x8;
   }

   // $VF: synthetic method
   static g7 n5(i4x var0, g7 var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static p0i n5(i4x var0, p0i var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static List l6(i4x var0) {
      return var0.e2;
   }
}
