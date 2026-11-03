package com.aspose.slides.internal.k4y;

public class s1h extends b3 {
   private byte n5;
   private m5o l6;
   private e5r k5;
   private v3q u3;
   private o4u a6;
   private e2c u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "table:show-empty", "data-pilot-subtotals", "data-pilot-members", "data-pilot-display-info", "data-pilot-sort-info", "data-pilot-layout-info"
   );

   public s1h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      s1h$1 var2 = new s1h$1(this);
      n5(var1, var2);
      n5(var1, new s1h$2(this, var1));
   }

   public s1h() {
      this.l6();
   }

   private void l6() {
      this.n5 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("table:show-empty", this.n5 == 1 ? "true" : "false");
      }

      if (this.l6 != null) {
         this.l6.n5("table", var2, "data-pilot-subtotals");
      }

      if (this.k5 != null) {
         this.k5.n5("table", var2, "data-pilot-members");
      }

      if (this.u3 != null) {
         this.u3.n5("table", var2, "data-pilot-display-info");
      }

      if (this.a6 != null) {
         this.a6.n5("table", var2, "data-pilot-sort-info");
      }

      if (this.u9 != null) {
         this.u9.n5("table", var2, "data-pilot-layout-info");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static byte n5(s1h var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static m5o n5(s1h var0, m5o var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static e5r n5(s1h var0, e5r var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static v3q n5(s1h var0, v3q var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static o4u n5(s1h var0, o4u var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static e2c n5(s1h var0, e2c var1) {
      return var0.u9 = var1;
   }
}
