package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class x9m extends b3 {
   private String n5;
   private List<g7> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "text:style-name", "index-entry-page-number", "index-entry-text", "index-entry-span", "index-entry-tab-stop"
   );

   public x9m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x9m$1 var2 = new x9m$1(this);
      n5(var1, var2);
      n5(var1, new x9m$2(this, var1));
   }

   public x9m() {
      this.l6();
   }

   private void l6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:style-name", this.n5);
      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (k5.n5(var5.n5())) {
               case 1:
                  ((c4b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 2:
                  ((l1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 3:
                  ((s5b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 4:
                  ((i0d)var5.k5()).n5("text", var2, var5.n5());
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
   static String n5(x9m var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(x9m var0) {
      return var0.l6;
   }
}
