package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class d1w extends b3 {
   private List<t4x> n5;
   private c6x l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("script", "event-listeners");

   public d1w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new d1w$1(this, var1));
   }

   public d1w() {
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
            t4x var5 = (t4x)var4.next();
            var5.n5("office", var2, "script");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.l6 != null) {
         this.l6.n5("office", var2, "event-listeners");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static List n5(d1w var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static c6x n5(d1w var0, c6x var1) {
      return var0.l6 = var1;
   }
}
