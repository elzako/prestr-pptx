package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z1c extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
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

   public z1c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new z1c$1(this, var1));
   }

   public z1c() {
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
                  ((e6x)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 1:
                  ((j6v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 2:
                  ((u5l)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 3:
                  ((s4p)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 4:
                  ((z7d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 5:
                  ((c5w)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 6:
                  ((f1h)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 7:
                  ((d2z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 8:
                  ((c4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 9:
                  ((h4i)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 10:
                  ((b4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 11:
                  ((v6z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 12:
                  ((v8v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 13:
                  ((l3d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 14:
                  ((w4a)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 15:
                  ((d8f)var5.k5()).n5("dr3d", var2, var5.n5());
                  break;
               case 16:
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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(z1c var0) {
      return var0.n5;
   }
}
