package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class d1t extends b3 {
   private String n5;
   private List<g7> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("provider", "binary", "clear");

   public d1t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d1t$1 var2 = new d1t$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (k5.n5(var1.n3())) {
                  case 1:
                     l6m var5 = new l6m(var1);
                     this.l6.addItem(new g7("binary", var5));
                     var4 = true;
                     break;
                  case 2:
                     a8m var6 = new a8m(var1);
                     this.l6.addItem(new g7("clear", var6));
                     break;
                  default:
                     var1.r4();
                     var4 = true;
               }
            }
         }
      }
   }

   public d1t() {
      this.l6();
   }

   private void l6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("provider", this.n5);
      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (k5.n5(var5.n5())) {
               case 1:
                  ((l6m)var5.k5()).n5("cx", var2, var5.n5());
                  break;
               case 2:
                  ((a8m)var5.k5()).n5("cx", var2, var5.n5());
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
   static String n5(d1t var0, String var1) {
      return var0.n5 = var1;
   }
}
