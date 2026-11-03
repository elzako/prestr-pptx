package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p8x extends b3 {
   private long n5;
   private List<w3m> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("text:outline-level", "index-source-style");

   public p8x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      p8x$1 var2 = new p8x$1(this);
      n5(var1, var2);
      n5(var1, new p8x$2(this, var1));
   }

   public p8x() {
      this.l6();
   }

   private void l6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:outline-level", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            w3m var5 = (w3m)var4.next();
            var5.n5("text", var2, "index-source-style");
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
   static long n5(p8x var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(p8x var0) {
      return var0.l6;
   }
}
