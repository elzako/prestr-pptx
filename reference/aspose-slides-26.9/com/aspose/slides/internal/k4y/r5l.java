package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class r5l extends b3 {
   private boolean n5;
   private String l6;
   private boolean k5;
   private String u3;
   private String a6;
   private String u9;
   private List<h2g> h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "table:bind-styles-to-content", "table:target-range-address", "table:case-sensitive", "table:language", "table:country", "table:algorithm", "sort-by"
   );

   public r5l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      r5l$1 var2 = new r5l$1(this);
      n5(var1, var2);
      n5(var1, new r5l$2(this, var1));
   }

   public r5l() {
      this.l6();
   }

   private void l6() {
      this.n5 = true;
      this.h0 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("table:bind-styles-to-content", this.n5 ? "true" : "false");
      }

      if (this.l6 != null) {
         var2.l6("table:target-range-address", this.l6);
      }

      var2.l6("table:case-sensitive", this.k5 ? "true" : "false");
      if (this.u3 != null) {
         var2.l6("table:language", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("table:country", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("table:algorithm", this.u9);
      }

      List$Enumerator var4 = this.h0.iterator();

      try {
         while (var4.hasNext()) {
            h2g var5 = (h2g)var4.next();
            var5.n5("table", var2, "sort-by");
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
      return c8;
   }

   // $VF: synthetic method
   static boolean n5(r5l var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(r5l var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(r5l var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(r5l var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(r5l var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(r5l var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static List n5(r5l var0) {
      return var0.h0;
   }
}
