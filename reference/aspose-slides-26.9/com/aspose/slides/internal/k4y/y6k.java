package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class y6k extends b3 {
   private boolean n5;
   private List<g0h> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("and", "customFilter");

   public y6k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y6k$1 var2 = new y6k$1(this);
      n5(var1, var2);
      n5(var1, new y6k$2(this, var1));
   }

   public y6k() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("and", this.n5 ? "1" : "0");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g0h var5 = (g0h)var4.next();
            var5.n5("ssml", var2, "customFilter");
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
   static boolean n5(y6k var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(y6k var0) {
      return var0.l6;
   }
}
