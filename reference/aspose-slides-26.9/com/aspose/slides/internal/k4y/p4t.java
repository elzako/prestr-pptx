package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class p4t extends b3 {
   private b8n n5;
   private List<l6j> l6;
   private a9t k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("ptCount", "pt", "extLst");

   public p4t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      n5(var1, new p4t$1(this, var1));
   }

   public p4t() {
      this.h0();
   }

   private void h0() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "ptCount");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            l6j var5 = (l6j)var4.next();
            var5.n5("c", var2, "pt");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final b8n n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <ptCount> element can be added.");
      }

      this.n5 = new b8n();
      return this.n5;
   }

   public final l6j l6() {
      l6j var1 = new l6j();
      this.l6.addItem(var1);
      return var1;
   }

   public final b8n k5() {
      return this.n5;
   }

   public final l6j[] u3() {
      return this.l6.toArray(new l6j[0]);
   }

   public final x8 a6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u3;
   }

   // $VF: synthetic method
   static b8n n5(p4t var0, b8n var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(p4t var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static a9t n5(p4t var0, a9t var1) {
      return var0.k5 = var1;
   }
}
