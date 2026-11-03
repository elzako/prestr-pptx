package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class h5h extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("bldP", "bldDgm", "bldOleChart", "bldGraphic");

   public h5h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new h5h$1(this, var1));
   }

   public h5h() {
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
                  ((m7f)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 1:
                  ((k8b)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 2:
                  ((m0m)var5.k5()).n5("p", var2, var5.n5());
                  break;
               case 3:
                  ((l0n)var5.k5()).n5("p", var2, var5.n5());
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
            var2 = new g7("bldP", new m7f());
            break;
         case 1:
            var2 = new g7("bldDgm", new k8b());
            break;
         case 2:
            var2 = new g7("bldOleChart", new m0m());
            break;
         case 3:
            var2 = new g7("bldGraphic", new l0n());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.n5.addItem(var2);
      return var2;
   }

   public final void n5(g7 var1) {
      this.n5.addItem(var1);
   }

   public final List<g7> n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(h5h var0) {
      return var0.n5;
   }
}
