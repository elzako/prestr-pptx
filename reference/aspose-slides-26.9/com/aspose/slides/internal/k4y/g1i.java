package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class g1i extends b3 {
   private long n5;
   private List<g7> l6;
   private h6m k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("id", "numDim", "strDim", "extLst");

   public g1i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      g1i$1 var2 = new g1i$1(this);
      n5(var1, var2);
      n5(var1, new g1i$2(this, var1));
   }

   public g1i() {
      this.u3();
   }

   private void u3() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u3.n5(var5.n5())) {
               case 1:
                  ((o8n)var5.k5()).n5("cx", var2, var5.n5());
                  break;
               case 2:
                  ((a9k)var5.k5()).n5("cx", var2, var5.n5());
            }
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

   public final g7 n5(String var1) {
      g7 var2;
      switch (u3.n5(var1)) {
         case 1:
            var2 = new g7("numDim", new o8n());
            break;
         case 2:
            var2 = new g7("strDim", new a9k());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.l6.addItem(var2);
      return var2;
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final List<g7> l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static long n5(g1i var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(g1i var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static h6m n5(g1i var0, h6m var1) {
      return var0.k5 = var1;
   }
}
