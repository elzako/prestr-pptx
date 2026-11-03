package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p0w extends b3 {
   private boolean n5;
   private List<g7> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "table:display", "table-row-group", "table-rows", "table-row", "table-header-rows", "soft-page-break"
   );

   public p0w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      p0w$1 var2 = new p0w$1(this);
      n5(var1, var2);
      n5(var1, new p0w$2(this, var1));
   }

   public p0w() {
      this.k5();
   }

   private void k5() {
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
                  ((p0w)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 2:
                  ((h6i)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 3:
                  ((w1x)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 4:
                  ((u1j)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 5:
                  ((j0v)var5.k5()).n5("text", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final List<g7> n5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static boolean n5(p0w var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(p0w var0) {
      return var0.l6;
   }
}
