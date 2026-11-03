package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z2x extends b3 {
   private List<d1x> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("cond");

   public z2x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new z2x$1(this, var1));
   }

   public z2x() {
      this.u3();
   }

   private void u3() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            d1x var5 = (d1x)var4.next();
            var5.n5("p", var2, "cond");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final d1x n5() {
      d1x var1 = new d1x();
      this.n5.addItem(var1);
      return var1;
   }

   public final d1x[] l6() {
      return this.n5.toArray(new d1x[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(z2x var0) {
      return var0.n5;
   }
}
