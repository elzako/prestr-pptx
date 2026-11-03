package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class e1u extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "style", "list-style", "number-style", "currency-style", "percentage-style", "date-style", "time-style", "boolean-style", "text-style", "page-layout"
   );

   public e1u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new e1u$1(this, var1));
   }

   public e1u() {
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
                  ((y2i)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 1:
                  ((a8r)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 2:
                  ((c1s)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 3:
                  ((b2y)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 4:
                  ((h1s)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 5:
                  ((b6l)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 6:
                  ((l7y)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 7:
                  ((j4b)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 8:
                  ((r1f)var5.k5()).n5("number", var2, var5.n5());
                  break;
               case 9:
                  ((j4k)var5.k5()).n5("style", var2, var5.n5());
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
            var2 = new g7("style", new y2i());
            break;
         case 1:
            var2 = new g7("list-style", new a8r());
            break;
         case 2:
            var2 = new g7("number-style", new c1s());
            break;
         case 3:
            var2 = new g7("currency-style", new b2y());
            break;
         case 4:
            var2 = new g7("percentage-style", new h1s());
            break;
         case 5:
            var2 = new g7("date-style", new b6l());
            break;
         case 6:
            var2 = new g7("time-style", new l7y());
            break;
         case 7:
            var2 = new g7("boolean-style", new j4b());
            break;
         case 8:
            var2 = new g7("text-style", new r1f());
            break;
         case 9:
            var2 = new g7("page-layout", new j4k());
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
   static List n5(e1u var0) {
      return var0.n5;
   }
}
