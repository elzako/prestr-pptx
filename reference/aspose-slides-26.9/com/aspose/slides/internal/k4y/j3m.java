package com.aspose.slides.internal.k4y;

public class j3m extends b3 {
   private String n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private int u9;
   private boolean h0;
   private boolean c8;
   private String t2;
   private boolean s7;
   private g7 x8;
   private z8r n3;
   private r5l y4;
   private i0j e2;
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9(
      "table:name",
      "table:is-selection",
      "table:on-update-keep-styles",
      "table:on-update-keep-size",
      "table:has-persistent-data",
      "table:orientation",
      "table:contains-header",
      "table:display-filter-buttons",
      "table:target-range-address",
      "table:refresh-delay",
      "database-source-sql",
      "database-source-query",
      "database-source-table",
      "filter",
      "sort",
      "subtotal-rules"
   );

   public j3m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      j3m$1 var2 = new j3m$1(this);
      n5(var1, var2);
      n5(var1, new j3m$2(this, var1));
   }

   public j3m() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = false;
      this.u3 = true;
      this.a6 = true;
      this.u9 = 0;
      this.h0 = true;
      this.c8 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:name", this.n5);
      if (this.l6) {
         var2.l6("table:is-selection", this.l6 ? "true" : "false");
      }

      if (this.k5) {
         var2.l6("table:on-update-keep-styles", this.k5 ? "true" : "false");
      }

      if (!this.u3) {
         var2.l6("table:on-update-keep-size", this.u3 ? "true" : "false");
      }

      if (!this.a6) {
         var2.l6("table:has-persistent-data", this.a6 ? "true" : "false");
      }

      var2.l6("table:orientation", x2p.n5(this.u9));
      if (!this.h0) {
         var2.l6("table:contains-header", this.h0 ? "true" : "false");
      }

      if (this.c8) {
         var2.l6("table:display-filter-buttons", this.c8 ? "true" : "false");
      }

      var2.l6("table:target-range-address", this.t2);
      var2.l6("table:refresh-delay", this.s7 ? "true" : "false");
      if (this.x8 != null) {
         switch (t9.n5(this.x8.n5())) {
            case 10:
               ((q5o)this.x8.k5()).n5("table", var2, this.x8.n5());
               break;
            case 11:
               ((g3d)this.x8.k5()).n5("table", var2, this.x8.n5());
               break;
            case 12:
               ((h8k)this.x8.k5()).n5("table", var2, this.x8.n5());
         }
      }

      if (this.n3 != null) {
         this.n3.n5("table", var2, "filter");
      }

      if (this.y4 != null) {
         this.y4.n5("table", var2, "sort");
      }

      if (this.e2 != null) {
         this.e2.n5("table", var2, "subtotal-rules");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t9;
   }

   // $VF: synthetic method
   static String n5(j3m var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(j3m var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(j3m var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean k5(j3m var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean u3(j3m var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int n5(j3m var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean a6(j3m var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean u9(j3m var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String l6(j3m var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean h0(j3m var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static g7 n5(j3m var0, g7 var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static z8r n5(j3m var0, z8r var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static r5l n5(j3m var0, r5l var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static i0j n5(j3m var0, i0j var1) {
      return var0.e2 = var1;
   }
}
