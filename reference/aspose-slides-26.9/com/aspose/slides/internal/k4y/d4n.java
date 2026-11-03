package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class d4n extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr"
   );

   public d4n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new d4n$1(this, var1));
   }

   public d4n() {
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
                  ((e4w)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 1:
                  ((e8p)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 2:
                  ((d0p)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 3:
                  ((s0i)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 4:
                  ((q4d)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 5:
                  ((x4a)var5.k5()).n5("a", var2, var5.n5());
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
            var2 = new g7("scrgbClr", new e4w());
            break;
         case 1:
            var2 = new g7("srgbClr", new e8p());
            break;
         case 2:
            var2 = new g7("hslClr", new d0p());
            break;
         case 3:
            var2 = new g7("sysClr", new s0i());
            break;
         case 4:
            var2 = new g7("schemeClr", new q4d());
            break;
         case 5:
            var2 = new g7("prstClr", new x4a());
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
   static List n5(d4n var0) {
      return var0.n5;
   }
}
