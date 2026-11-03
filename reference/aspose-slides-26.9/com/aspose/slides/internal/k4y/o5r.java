package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class o5r extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("master-page", "handout-master", "layer-set");

   public o5r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new o5r$1(this, var1));
   }

   public o5r() {
      this.k5();
   }

   private void k5() {
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
                  ((u9t)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 1:
                  ((m4n)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 2:
                  ((g6b)var5.k5()).n5("draw", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (l6.n5(var1)) {
         case 0:
            var2 = new g7("master-page", new u9t());
            break;
         case 1:
            var2 = new g7("handout-master", new m4n());
            break;
         case 2:
            var2 = new g7("layer-set", new g6b());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.n5.addItem(var2);
      return var2;
   }

   public final List<g7> n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(o5r var0) {
      return var0.n5;
   }
}
