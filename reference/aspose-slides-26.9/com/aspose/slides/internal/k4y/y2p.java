package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class y2p extends b3 {
   private boolean n5;
   private List<g7> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "table:display", "table-column-group", "table-columns", "table-column", "table-header-columns"
   );

   public y2p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y2p$1 var2 = new y2p$1(this);
      n5(var1, var2);
      n5(var1, new y2p$2(this, var1));
   }

   public y2p() {
      this.l6();
   }

   private void l6() {
      this.n5 = true;
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("table:display", this.n5 ? "true" : "false");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (k5.n5(var5.n5())) {
               case 1:
                  ((y2p)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 2:
                  ((v0q)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 3:
                  ((l5h)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 4:
                  ((w2c)var5.k5()).n5("table", var2, var5.n5());
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
   static boolean n5(y2p var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(y2p var0) {
      return var0.l6;
   }
}
