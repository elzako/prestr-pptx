package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class d5f extends b3 {
   private int n5;
   private String l6;
   private List<g7> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "text:outline-level", "text:style-name", "index-entry-chapter", "index-entry-page-number", "index-entry-text", "index-entry-span", "index-entry-tab-stop"
   );

   public d5f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d5f$1 var2 = new d5f$1(this);
      n5(var1, var2);
      n5(var1, new d5f$2(this, var1));
   }

   public d5f() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:outline-level", d7g.n5(this.n5));
      var2.l6("text:style-name", this.l6);
      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u3.n5(var5.n5())) {
               case 2:
                  ((k6y)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 3:
                  ((c4b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 4:
                  ((l1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 5:
                  ((s5b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 6:
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
      return u3;
   }

   // $VF: synthetic method
   static int n5(d5f var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(d5f var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(d5f var0) {
      return var0.k5;
   }
}
