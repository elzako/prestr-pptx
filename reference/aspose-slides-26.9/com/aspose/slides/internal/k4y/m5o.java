package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class m5o extends b3 {
   private List<m2a> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("data-pilot-subtotal");

   public m5o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new m5o$1(this, var1));
   }

   public m5o() {
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
            m2a var5 = (m2a)var4.next();
            var5.n5("table", var2, "data-pilot-subtotal");
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
   static List n5(m5o var0) {
      return var0.n5;
   }
}
