package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class b4o extends b3 {
   private String n5;
   private List<d5t> l6;
   private m0y k5;
   private l0k u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("ref", "filterColumn", "sortState", "extLst");

   public b4o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      b4o$1 var2 = new b4o$1(this);
      n5(var1, var2);
      n5(var1, new b4o$2(this, var1));
   }

   public b4o() {
      this.l6();
   }

   private void l6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("ref", this.n5);
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            d5t var5 = (d5t)var4.next();
            var5.n5("ssml", var2, "filterColumn");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.k5 != null) {
         this.k5.n5("ssml", var2, "sortState");
      }

      if (this.u3 != null) {
         this.u3.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(b4o var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(b4o var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static m0y n5(b4o var0, m0y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l0k n5(b4o var0, l0k var1) {
      return var0.u3 = var1;
   }
}
