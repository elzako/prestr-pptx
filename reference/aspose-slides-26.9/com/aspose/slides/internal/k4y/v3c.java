package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class v3c extends b3 {
   private List<r4q> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("config-item-set");

   public v3c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new v3c$1(this, var1));
   }

   public v3c() {
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
            r4q var5 = (r4q)var4.next();
            var5.n5("config", var2, "config-item-set");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final r4q n5() {
      r4q var1 = new r4q();
      this.n5.addItem(var1);
      return var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(v3c var0) {
      return var0.n5;
   }
}
