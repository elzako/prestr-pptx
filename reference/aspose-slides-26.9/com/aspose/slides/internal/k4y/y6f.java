package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class y6f extends b3 {
   private List<d2o> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("Cert");

   public y6f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new y6f$1(this, var1));
   }

   public y6f() {
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
            d2o var5 = (d2o)var4.next();
            var5.n5("xd", var2, "Cert");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final d2o n5() {
      d2o var1 = new d2o();
      this.n5.addItem(var1);
      return var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(y6f var0) {
      return var0.n5;
   }
}
