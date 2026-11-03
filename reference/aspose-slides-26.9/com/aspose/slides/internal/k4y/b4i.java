package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class b4i extends b3 {
   private boolean n5;
   private boolean l6;
   private List<g7> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "form:automatic-focus", "form:apply-design-mode", "form", "model"
   );

   public b4i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      b4i$1 var2 = new b4i$1(this);
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
               switch (u3.n5(var1.n3())) {
                  case 2:
                     g2n var5 = new g2n(var1);
                     this.k5.addItem(new g7("form", var5));
                     break;
                  case 3:
                     i1w var6 = new i1w(var1);
                     this.k5.addItem(new g7("model", var6));
                     var4 = true;
                     break;
                  default:
                     var1.r4();
                     var4 = true;
               }
            }
         }
      }
   }

   public b4i() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.l6 = true;
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("form:automatic-focus", this.n5 ? "true" : "false");
      }

      if (!this.l6) {
         var2.l6("form:apply-design-mode", this.l6 ? "true" : "false");
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u3.n5(var5.n5())) {
               case 2:
                  ((g2n)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 3:
                  ((i1w)var5.k5()).n5("xforms", var2, var5.n5());
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
   static boolean n5(b4i var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(b4i var0, boolean var1) {
      return var0.l6 = var1;
   }
}
