package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class a1v extends b3 {
   private o3m n5;
   private List<n3p> l6;
   private b9y k5;
   private h6m u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("plotAreaRegion", "axis", "spPr", "extLst");

   public a1v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      n5(var1, new a1v$1(this, var1));
   }

   public a1v() {
      this.h0();
      this.n5 = new o3m();
   }

   private void h0() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("cx", var2, "plotAreaRegion");
      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            n3p var5 = (n3p)var4.next();
            var5.n5("cx", var2, "axis");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "spPr");
      }

      if (this.u3 != null) {
         this.u3.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final n3p n5() {
      n3p var1 = new n3p();
      this.l6.addItem(var1);
      return var1;
   }

   public final void n5(b9y var1) {
      this.k5 = var1;
   }

   public final void n5(h6m var1) {
      this.u3 = var1;
   }

   public final o3m l6() {
      return this.n5;
   }

   public final n3p[] k5() {
      return this.l6.toArray(new n3p[0]);
   }

   public final b9y u3() {
      return this.k5;
   }

   public final h6m a6() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return a6;
   }

   // $VF: synthetic method
   static o3m n5(a1v var0, o3m var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(a1v var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static b9y n5(a1v var0, b9y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static h6m n5(a1v var0, h6m var1) {
      return var0.u3 = var1;
   }
}
