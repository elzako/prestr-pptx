package com.aspose.slides.internal.k4y;

public class q7g extends b3 {
   private String n5;
   private int l6;
   private String k5;
   private String u3;
   private String a6;
   private int u9;
   private s1h h0;
   private j0b c8;
   private c7n t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "table:source-field-name",
      "table:orientation",
      "table:selected-page",
      "table:is-data-layout-field",
      "table:function",
      "table:used-hierarchy",
      "data-pilot-level",
      "data-pilot-field-reference",
      "data-pilot-groups"
   );

   public q7g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      q7g$1 var2 = new q7g$1(this);
      n5(var1, var2);
      n5(var1, new q7g$2(this, var1));
   }

   public q7g() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.u3 = "false";
      this.u9 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:source-field-name", this.n5);
      var2.l6("table:orientation", h6k.n5(this.l6));
      if (this.k5 != null) {
         var2.l6("table:selected-page", this.k5);
      }

      if (!"false".equals(this.u3)) {
         var2.l6("table:is-data-layout-field", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("table:function", this.a6);
      }

      if (this.u9 != -1) {
         var2.l6("table:used-hierarchy", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      }

      if (this.h0 != null) {
         this.h0.n5("table", var2, "data-pilot-level");
      }

      if (this.c8 != null) {
         this.c8.n5("table", var2, "data-pilot-field-reference");
      }

      if (this.t2 != null) {
         this.t2.n5("table", var2, "data-pilot-groups");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static String n5(q7g var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(q7g var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(q7g var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(q7g var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(q7g var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(q7g var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static s1h n5(q7g var0, s1h var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static j0b n5(q7g var0, j0b var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static c7n n5(q7g var0, c7n var1) {
      return var0.t2 = var1;
   }
}
