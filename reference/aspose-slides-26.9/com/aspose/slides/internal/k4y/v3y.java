package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class v3y extends b3 {
   private q7j n5;
   private List<g1i> l6;
   private h6m k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("externalData", "data", "extLst");

   public v3y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      n5(var1, new v3y$1(this, var1));
   }

   public v3y() {
      this.a6();
   }

   private void a6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "externalData");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g1i var5 = (g1i)var4.next();
            var5.n5("cx", var2, "data");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(q7j var1) {
      this.n5 = var1;
   }

   public final g1i n5() {
      g1i var1 = new g1i();
      this.l6.addItem(var1);
      return var1;
   }

   public final q7j l6() {
      return this.n5;
   }

   public final g1i[] k5() {
      return this.l6.toArray(new g1i[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static q7j n5(v3y var0, q7j var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(v3y var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static h6m n5(v3y var0, h6m var1) {
      return var0.k5 = var1;
   }
}
