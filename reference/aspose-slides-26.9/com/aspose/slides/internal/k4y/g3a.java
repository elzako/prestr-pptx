package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class g3a extends b3 {
   private String l6;
   private String k5;
   private int u3;
   private boolean a6;
   private boolean u9;
   private String h0;
   private String c8;
   private boolean t2;
   private boolean s7;
   private g7 x8;
   private List<q7g> n3;
   public static final int n5 = b1i.n5("both");
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "table:name",
      "table:application-data",
      "table:grand-total",
      "table:ignore-empty-rows",
      "table:identify-categories",
      "table:target-range-address",
      "table:buttons",
      "table:show-filter-button",
      "table:drill-down-on-double-click",
      "database-source-sql",
      "database-source-query",
      "database-source-table",
      "source-service",
      "source-cell-range",
      "data-pilot-field"
   );

   public g3a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      g3a$1 var2 = new g3a$1(this);
      n5(var1, var2);
      n5(var1, new g3a$2(this, var1));
   }

   public g3a() {
      this.l6();
   }

   private void l6() {
      this.u3 = n5;
      this.a6 = false;
      this.u9 = false;
      this.t2 = true;
      this.s7 = true;
      this.n3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:name", this.l6);
      if (this.k5 != null) {
         var2.l6("table:application-data", this.k5);
      }

      if (this.u3 != n5) {
         var2.l6("table:grand-total", b1i.n5(this.u3));
      }

      if (this.a6) {
         var2.l6("table:ignore-empty-rows", this.a6 ? "true" : "false");
      }

      if (this.u9) {
         var2.l6("table:identify-categories", this.u9 ? "true" : "false");
      }

      var2.l6("table:target-range-address", this.h0);
      if (this.c8 != null) {
         var2.l6("table:buttons", this.c8);
      }

      if (!this.t2) {
         var2.l6("table:show-filter-button", this.t2 ? "true" : "false");
      }

      if (!this.s7) {
         var2.l6("table:drill-down-on-double-click", this.s7 ? "true" : "false");
      }

      if (this.x8 != null) {
         switch (y4.n5(this.x8.n5())) {
            case 9:
               ((q5o)this.x8.k5()).n5("table", var2, this.x8.n5());
               break;
            case 10:
               ((g3d)this.x8.k5()).n5("table", var2, this.x8.n5());
               break;
            case 11:
               ((h8k)this.x8.k5()).n5("table", var2, this.x8.n5());
               break;
            case 12:
               ((k4w)this.x8.k5()).n5("table", var2, this.x8.n5());
               break;
            case 13:
               ((g2l)this.x8.k5()).n5("table", var2, this.x8.n5());
         }
      }

      List$Enumerator var4 = this.n3.iterator();

      try {
         while (var4.hasNext()) {
            q7g var5 = (q7g)var4.next();
            var5.n5("table", var2, "data-pilot-field");
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
      return y4;
   }

   // $VF: synthetic method
   static String n5(g3a var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(g3a var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(g3a var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(g3a var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(g3a var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(g3a var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(g3a var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean k5(g3a var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean u3(g3a var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static g7 n5(g3a var0, g7 var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static List n5(g3a var0) {
      return var0.n3;
   }
}
