package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class j3b extends b3 {
   private double n5;
   private List<w3k> l6;
   private l8r k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("h", "tc", "extLst");

   public j3b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      j3b$1 var2 = new j3b$1(this);
      n5(var1, var2);
      n5(var1, new j3b$2(this, var1));
   }

   public j3b() {
      this.u9();
   }

   private void u9() {
      this.n5 = Double.NaN;
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("h", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14)));
      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            w3k var5 = (w3k)var4.next();
            var5.n5("a", var2, "tc");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final w3k n5() {
      w3k var1 = new w3k();
      this.l6.addItem(var1);
      return var1;
   }

   public final void n5(x8 var1) {
      this.k5 = (l8r)var1;
   }

   public final double l6() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final w3k[] k5() {
      return this.l6.toArray(new w3k[0]);
   }

   public final x8 u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static double n5(j3b var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(j3b var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static l8r n5(j3b var0, l8r var1) {
      return var0.k5 = var1;
   }
}
