package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class w9f extends b3 {
   private j9g n5;
   private List<g7> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "change-info",
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

   public w9f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new w9f$1(this, var1));
   }

   public w9f() {
      this.l6();
      this.n5 = new j9g();
   }

   private void l6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("office", var2, "change-info");
      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (k5.n5(var5.n5())) {
               case 1:
                  ((m2v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 2:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 3:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 4:
                  ((e2q)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 5:
                  ((y7e)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 6:
                  ((y3o)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 7:
                  ((x6o)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 8:
                  ((j0v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 9:
                  ((o1b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 10:
                  ((e1e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 11:
                  ((i6x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 12:
                  ((i2e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 13:
                  ((q5c)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 14:
                  ((s1f)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 15:
                  ((z4m)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 16:
                  ((e6x)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 17:
                  ((j6v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 18:
                  ((u5l)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 19:
                  ((s4p)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 20:
                  ((z7d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 21:
                  ((c5w)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 22:
                  ((f1h)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 23:
                  ((d2z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 24:
                  ((c4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 25:
                  ((h4i)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 26:
                  ((b4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 27:
                  ((v6z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 28:
                  ((v8v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 29:
                  ((l3d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 30:
                  ((w4a)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 31:
                  ((d8f)var5.k5()).n5("dr3d", var2, var5.n5());
                  break;
               case 32:
                  ((g3c)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 33:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 34:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 35:
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
      return k5;
   }

   // $VF: synthetic method
   static j9g n5(w9f var0, j9g var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(w9f var0) {
      return var0.l6;
   }
}
