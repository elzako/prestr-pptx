package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class u7g extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
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

   public u7g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new u7g$1(this, var1));
   }

   public u7g() {
      this.l6();
   }

   private void l6() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (l6.n5(var5.n5())) {
               case 0:
                  ((m2v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 1:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 2:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 3:
                  ((e2q)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 4:
                  ((y7e)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 5:
                  ((y3o)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 6:
                  ((x6o)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 7:
                  ((j0v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 8:
                  ((o1b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 9:
                  ((e1e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 10:
                  ((i6x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 11:
                  ((i2e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 12:
                  ((q5c)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 13:
                  ((s1f)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 14:
                  ((z4m)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 15:
                  ((e6x)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 16:
                  ((j6v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 17:
                  ((u5l)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 18:
                  ((s4p)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 19:
                  ((z7d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 20:
                  ((c5w)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 21:
                  ((f1h)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 22:
                  ((d2z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 23:
                  ((c4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 24:
                  ((h4i)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 25:
                  ((b4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 26:
                  ((v6z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 27:
                  ((v8v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 28:
                  ((l3d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 29:
                  ((w4a)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 30:
                  ((d8f)var5.k5()).n5("dr3d", var2, var5.n5());
                  break;
               case 31:
                  ((g3c)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 32:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 33:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 34:
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
      return l6;
   }

   // $VF: synthetic method
   static List n5(u7g var0) {
      return var0.n5;
   }
}
