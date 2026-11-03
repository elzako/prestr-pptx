package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class o2i extends b3 {
   private List<w2e> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("channelProperty");

   public o2i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new o2i$1(this, var1));
   }

   public o2i() {
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
            w2e var5 = (w2e)var4.next();
            var5.n5("inkml", var2, "channelProperty");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(w2e var1) {
      this.n5.addItem(var1);
   }

   public final w2e[] n5() {
      return this.n5.toArray(new w2e[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(o2i var0) {
      return var0.n5;
   }
}
