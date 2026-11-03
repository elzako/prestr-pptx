package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class m3i extends b3 {
   private int n5;
   private List<g7> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "style:family",
      "chart-properties",
      "graphic-properties",
      "table-cell-properties",
      "paragraph-properties",
      "text-properties",
      "section-properties",
      "ruby-properties",
      "table-properties",
      "table-column-properties",
      "table-row-properties",
      "drawing-page-properties"
   );

   public m3i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      m3i$1 var2 = new m3i$1(this);
      n5(var1, var2);
      n5(var1, new m3i$2(this, var1));
   }

   public m3i() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0;
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:family", j1r.n5(this.n5));
      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (k5.n5(var5.n5())) {
               case 1:
                  ((a8k)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 2:
                  ((p3w)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 3:
                  ((b4u)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 4:
                  ((v5n)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 5:
                  ((j9d)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 6:
                  ((d5z)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 7:
                  ((r1w)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 8:
                  ((m3y)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 9:
                  ((n0l)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 10:
                  ((s6j)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 11:
                  ((r9l)var5.k5()).n5("style", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final int n5() {
      return this.n5;
   }

   public final List<g7> l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(m3i var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(m3i var0) {
      return var0.l6;
   }
}
