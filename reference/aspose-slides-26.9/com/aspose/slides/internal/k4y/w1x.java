package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class w1x extends b3 {
   private long l6;
   private String k5;
   private String u3;
   private int a6;
   private List<g7> u9;
   public static final int n5 = n7p.n5("visible");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "table:number-rows-repeated", "table:style-name", "table:default-cell-style-name", "table:visibility", "table-cell", "covered-table-cell"
   );

   public w1x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      w1x$1 var2 = new w1x$1(this);
      n5(var1, var2);
      n5(var1, new w1x$2(this, var1));
   }

   public w1x() {
      this.a6();
   }

   private void a6() {
      this.l6 = 1L;
      this.a6 = n5;
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.l6 & 4294967295L) != 1L) {
         var2.l6("table:number-rows-repeated", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("table:style-name", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("table:default-cell-style-name", this.u3);
      }

      if (this.a6 != n5) {
         var2.l6("table:visibility", n7p.n5(this.a6));
      }

      List$Enumerator var4 = this.u9.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (h0.n5(var5.n5())) {
               case 4:
                  ((p6d)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 5:
                  ((s6g)var5.k5()).n5("table", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (h0.n5(var1)) {
         case 4:
            var2 = new g7("table-cell", new p6d());
            break;
         case 5:
            var2 = new g7("covered-table-cell", new s6g());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.u9.addItem(var2);
      return var2;
   }

   public final String n5() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final String l6() {
      return this.u3;
   }

   public final List<g7> k5() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return h0;
   }

   // $VF: synthetic method
   static long n5(w1x var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(w1x var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(w1x var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(w1x var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static List n5(w1x var0) {
      return var0.u9;
   }
}
