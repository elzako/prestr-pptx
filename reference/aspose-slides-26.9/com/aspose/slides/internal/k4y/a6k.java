package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class a6k extends b3 {
   private String n5;
   private List<g7> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "name", "alg", "shape", "presOf", "constrLst", "ruleLst", "forEach", "layoutNode", "choose", "extLst"
   );

   public a6k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      a6k$1 var2 = new a6k$1(this);
      n5(var1, var2);
      n5(var1, new a6k$2(this, var1));
   }

   public a6k() {
      this.k5();
   }

   private void k5() {
      this.n5 = "";
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"".equals(this.n5)) {
         var2.l6("name", this.n5);
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (k5.n5(var5.n5())) {
               case 1:
                  ((p5i)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 2:
                  ((r6v)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 3:
                  ((d4w)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 4:
                  ((n8z)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 5:
                  ((k5r)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 6:
                  ((c5z)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 7:
                  ((y5g)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 8:
                  ((i9l)var5.k5()).n5("dgm", var2, var5.n5());
                  break;
               case 9:
                  ((l8r)var5.k5()).n5("dgm", var2, var5.n5());
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
   static String n5(a6k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(a6k var0) {
      return var0.l6;
   }
}
