package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class k1i extends b3 {
   private List<Long> n5 = new List<>();
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("idx");

   public k1i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      n5(var1, new k1i$1(this, var1));
   }

   public k1i() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            long var5 = com.aspose.slides.internal.v6g.k5.u3(var4.next(), long.class);
            var2.n5("cx", "idx", null);
            var2.l6("val", com.aspose.slides.ms.System.Xml.f4.l6(var5));
            var2.s7();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(long var1) {
      this.n5.addItem(var1);
   }

   public final long[] n5() {
      return com.aspose.slides.internal.n8e.v4.u9(this.n5);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(k1i var0) {
      return var0.n5;
   }
}
