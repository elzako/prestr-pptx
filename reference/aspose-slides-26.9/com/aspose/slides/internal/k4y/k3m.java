package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class k3m extends b3 {
   private List<l6g> n5;
   private List<k1x> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("highlighted-range", "operation");

   public k3m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new k3m$1(this, var1));
   }

   public k3m() {
      this.l6();
   }

   private void l6() {
      this.n5 = new List<>();
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            l6g var5 = (l6g)var4.next();
            var5.n5("table", var2, "highlighted-range");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.l6.iterator();

      try {
         while (var14.hasNext()) {
            k1x var6 = (k1x)var14.next();
            var6.n5("table", var2, "operation");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static List n5(k3m var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static List l6(k3m var0) {
      return var0.l6;
   }
}
