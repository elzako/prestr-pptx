package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class x6o extends b3 {
   private String n5;
   private String l6;
   private byte k5;
   private String u3;
   private int a6;
   private String u9;
   private g7 h0;
   private List<g7> c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "text:style-name",
      "text:name",
      "text:protected",
      "text:protection-key",
      "text:display",
      "text:condition",
      "section-source",
      "dde-source",
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

   public x6o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x6o$1 var2 = new x6o$1(this);
      n5(var1, var2);
      n5(var1, new x6o$2(this, var1));
   }

   public x6o() {
      this.l6();
   }

   private void l6() {
      this.k5 = -1;
      this.a6 = 0;
      this.c8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("text:style-name", this.n5);
      }

      var2.l6("text:name", this.l6);
      if (this.k5 != -1) {
         var2.l6("text:protected", this.k5 == 1 ? "true" : "false");
      }

      if (this.u3 != null) {
         var2.l6("text:protection-key", this.u3);
      }

      if (this.a6 != 0) {
         var2.l6("text:display", q2i.n5(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("text:condition", this.u9);
      }

      if (this.h0 != null) {
         switch (t2.n5(this.h0.n5())) {
            case 6:
               ((d0f)this.h0.k5()).n5("text", var2, this.h0.n5());
               break;
            case 7:
               ((p3x)this.h0.k5()).n5("office", var2, this.h0.n5());
         }
      }

      List$Enumerator var4 = this.c8.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (t2.n5(var5.n5())) {
               case 8:
                  ((m2v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 9:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 10:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 11:
                  ((e2q)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 12:
                  ((y7e)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 13:
                  ((y3o)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 14:
                  ((x6o)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 15:
                  ((j0v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 16:
                  ((o1b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 17:
                  ((e1e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 18:
                  ((i6x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 19:
                  ((i2e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 20:
                  ((q5c)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 21:
                  ((s1f)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 22:
                  ((z4m)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 23:
                  ((e6x)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 24:
                  ((j6v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 25:
                  ((u5l)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 26:
                  ((s4p)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 27:
                  ((z7d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 28:
                  ((c5w)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 29:
                  ((f1h)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 30:
                  ((d2z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 31:
                  ((c4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 32:
                  ((h4i)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 33:
                  ((b4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 34:
                  ((v6z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 35:
                  ((v8v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 36:
                  ((l3d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 37:
                  ((w4a)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 38:
                  ((d8f)var5.k5()).n5("dr3d", var2, var5.n5());
                  break;
               case 39:
                  ((g3c)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 40:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 41:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 42:
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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(x6o var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(x6o var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte n5(x6o var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(x6o var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(x6o var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(x6o var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static g7 n5(x6o var0, g7 var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static List n5(x6o var0) {
      return var0.c8;
   }
}
