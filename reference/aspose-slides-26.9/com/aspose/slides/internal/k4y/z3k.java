package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z3k extends b3 {
   private List<j0p> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("channel");

   public z3k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new z3k$1(this, var1));
   }

   public z3k() {
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
            j0p var5 = (j0p)var4.next();
            var5.n5("inkml", var2, "channel");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(j0p var1) {
      this.n5.addItem(var1);
   }

   public final j0p[] n5() {
      return this.n5.toArray(new j0p[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(z3k var0) {
      return var0.n5;
   }
}
