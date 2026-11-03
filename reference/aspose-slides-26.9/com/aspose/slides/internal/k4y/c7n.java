package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class c7n extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private double u9;
   private int h0;
   private List<f1m> c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "table:source-field-name", "table:date-start", "table:start", "table:date-end", "table:end", "table:step", "table:grouped-by", "data-pilot-group"
   );

   public c7n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      c7n$1 var2 = new c7n$1(this);
      n5(var1, var2);
      n5(var1, new c7n$2(this, var1));
   }

   public c7n() {
      this.l6();
   }

   private void l6() {
      this.u9 = Double.NaN;
      this.h0 = 0;
      this.c8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:source-field-name", this.n5);
      if (this.l6 != null) {
         var2.l6("table:date-start", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("table:start", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("table:date-end", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("table:end", this.a6);
      }

      var2.l6("table:step", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      var2.l6("table:grouped-by", w5d.n5(this.h0));
      List$Enumerator var4 = this.c8.iterator();

      try {
         while (var4.hasNext()) {
            f1m var5 = (f1m)var4.next();
            var5.n5("table", var2, "data-pilot-group");
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
      return t2;
   }

   // $VF: synthetic method
   static String n5(c7n var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(c7n var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(c7n var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(c7n var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(c7n var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double n5(c7n var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int n5(c7n var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static List n5(c7n var0) {
      return var0.c8;
   }
}
