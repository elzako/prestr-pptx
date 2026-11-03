package com.aspose.slides.internal.k4y;

public class d0u extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private boolean a6;
   private int u9;
   private k8n h0;
   private m0i c8;
   private c6x t2;
   private g7 s7;
   public static final int n5 = t2q.n5("unsorted");
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "table:name",
      "table:condition",
      "table:base-cell-address",
      "table:allow-empty-cell",
      "table:display-list",
      "help-message",
      "error-message",
      "error-macro",
      "event-listeners"
   );

   public d0u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d0u$1 var2 = new d0u$1(this);
      n5(var1, var2);
      n5(var1, new d0u$2(this, var1));
   }

   public d0u() {
      this.l6();
      this.c8 = new m0i();
   }

   private void l6() {
      this.a6 = true;
      this.u9 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:name", this.l6);
      if (this.k5 != null) {
         var2.l6("table:condition", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("table:base-cell-address", this.u3);
      }

      if (!this.a6) {
         var2.l6("table:allow-empty-cell", this.a6 ? "true" : "false");
      }

      if (this.u9 != n5) {
         var2.l6("table:display-list", t2q.n5(this.u9));
      }

      if (this.h0 != null) {
         this.h0.n5("table", var2, "help-message");
      }

      if (this.s7 != null) {
         switch (x8.n5(this.s7.n5())) {
            case 6:
               ((a1f)this.s7.k5()).n5("table", var2, this.s7.n5());
         }
      }

      this.c8.n5("table", var2, "error-macro");
      if (this.t2 != null) {
         this.t2.n5("office", var2, "event-listeners");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return x8;
   }

   // $VF: synthetic method
   static String n5(d0u var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(d0u var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(d0u var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d0u var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int n5(d0u var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static k8n n5(d0u var0, k8n var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static g7 n5(d0u var0, g7 var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static m0i n5(d0u var0, m0i var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static c6x n5(d0u var0, c6x var1) {
      return var0.t2 = var1;
   }
}
