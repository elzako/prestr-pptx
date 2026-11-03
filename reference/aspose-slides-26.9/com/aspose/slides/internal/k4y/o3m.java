package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class o3m extends b3 {
   private e5s n5;
   private List<x1i> l6;
   private h6m k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("plotSurface", "series", "extLst");

   public o3m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      n5(var1, new o3m$1(this, var1));
   }

   public o3m() {
      this.h0();
   }

   private void h0() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "plotSurface");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            x1i var5 = (x1i)var4.next();
            var5.n5("cx", var2, "series");
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

   public final e5s n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <plotSurface> element can be added.");
      }

      this.n5 = new e5s();
      return this.n5;
   }

   public final x1i l6() {
      x1i var1 = new x1i();
      this.l6.addItem(var1);
      return var1;
   }

   public final void n5(h6m var1) {
      this.k5 = var1;
   }

   public final e5s k5() {
      return this.n5;
   }

   public final x1i[] u3() {
      return this.l6.toArray(new x1i[0]);
   }

   public final h6m a6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u3;
   }

   // $VF: synthetic method
   static e5s n5(o3m var0, e5s var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(o3m var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static h6m n5(o3m var0, h6m var1) {
      return var0.k5 = var1;
   }
}
