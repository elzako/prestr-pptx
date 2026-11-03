package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p4z extends b3 {
   private int n5;
   private String l6;
   private List<g7> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "text:bibliography-type", "text:style-name", "index-entry-span", "index-entry-tab-stop", "index-entry-bibliography"
   );

   public p4z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      p4z$1 var2 = new p4z$1(this);
      n5(var1, var2);
      n5(var1, new p4z$2(this, var1));
   }

   public p4z() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:bibliography-type", g4i.n5(this.n5));
      var2.l6("text:style-name", this.l6);
      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u3.n5(var5.n5())) {
               case 2:
                  ((s5b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 3:
                  ((i0d)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 4:
                  ((d6m)var5.k5()).n5("text", var2, var5.n5());
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
   static int n5(p4z var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(p4z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(p4z var0) {
      return var0.k5;
   }
}
