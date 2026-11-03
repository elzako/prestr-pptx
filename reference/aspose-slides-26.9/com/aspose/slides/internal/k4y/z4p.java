package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z4p extends b3 {
   private List<n3z> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("cat");

   public z4p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new z4p$1(this, var1));
   }

   public z4p() {
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
            n3z var5 = (n3z)var4.next();
            var5.n5("dgm", var2, "cat");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final n3z[] n5() {
      return this.n5.toArray(new n3z[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(z4p var0) {
      return var0.n5;
   }
}
