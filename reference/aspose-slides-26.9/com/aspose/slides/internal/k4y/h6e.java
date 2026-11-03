package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class h6e extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "name", "enabled", "calcOnExit", "entryMacro", "exitMacro", "helpText", "statusText", "checkBox", "ddList", "textInput"
   );

   public h6e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new h6e$1(this, var1));
   }

   public h6e() {
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
                  ((n3k)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 1:
                  ((a5j)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 2:
                  ((a5j)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 3:
                  ((y6u)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 4:
                  ((y6u)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 5:
                  ((s2z)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 6:
                  ((a9g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 7:
                  ((w4y)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 8:
                  ((b4k)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 9:
                  ((k2d)var5.k5()).n5("w", var2, var5.n5());
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
   static List n5(h6e var0) {
      return var0.n5;
   }
}
