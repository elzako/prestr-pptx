package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class x5z extends b3 {
   private String n5;
   private List<h4r> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("w_LastValue", "listItem");

   public x5z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x5z$1 var2 = new x5z$1(this);
      n5(var1, var2);
      n5(var1, new x5z$2(this, var1));
   }

   public x5z() {
      this.l6();
   }

   private void l6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("w:lastValue", this.n5);
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            h4r var5 = (h4r)var4.next();
            var5.n5("w", var2, "listItem");
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
   static String n5(x5z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(x5z var0) {
      return var0.l6;
   }
}
