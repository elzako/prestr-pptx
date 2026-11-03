package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p1f extends b3 {
   private long n5;
   private List<w2x> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("count", "webPublishItem");

   public p1f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      p1f$1 var2 = new p1f$1(this);
      n5(var1, var2);
      n5(var1, new p1f$2(this, var1));
   }

   public p1f() {
      this.l6();
   }

   private void l6() {
      this.n5 = 4294967295L;
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("count", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            w2x var5 = (w2x)var4.next();
            var5.n5("ssml", var2, "webPublishItem");
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
   static long n5(p1f var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(p1f var0) {
      return var0.l6;
   }
}
