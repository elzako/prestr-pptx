package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class b4k extends b3 {
   private k4b n5;
   private k4b l6;
   private List<y4q> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("result", "default", "listEntry");

   public b4k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new b4k$1(this, var1));
   }

   public b4k() {
      this.l6();
   }

   private void l6() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("w", var2, "result");
      }

      if (this.l6 != null) {
         this.l6.n5("w", var2, "default");
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            y4q var5 = (y4q)var4.next();
            var5.n5("w", var2, "listEntry");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static k4b n5(b4k var0, k4b var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static k4b l6(b4k var0, k4b var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(b4k var0) {
      return var0.k5;
   }
}
