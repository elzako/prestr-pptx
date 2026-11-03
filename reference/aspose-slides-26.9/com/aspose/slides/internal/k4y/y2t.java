package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class y2t extends b3 {
   private List<q3h> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("track");

   public y2t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new y2t$1(this, var1));
   }

   public y2t() {
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
            q3h var5 = (q3h)var4.next();
            var5.n5("p173", var2, "track");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(q3h var1) {
      this.n5.addItem(var1);
   }

   public final q3h[] n5() {
      return this.n5.toArray(new q3h[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(y2t var0) {
      return var0.n5;
   }
}
