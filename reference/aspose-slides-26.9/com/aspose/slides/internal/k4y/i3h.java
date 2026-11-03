package com.aspose.slides.internal.k4y;

public class i3h extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private long u9;
   private q9o h0;
   private z8u c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "table:case-sensitive",
      "table:precision-as-shown",
      "table:search-criteria-must-apply-to-whole-cell",
      "table:automatic-find-labels",
      "table:use-regular-expressions",
      "table:null-year",
      "null-date",
      "iteration"
   );

   public i3h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i3h$1 var2 = new i3h$1(this);
      n5(var1, var2);
      n5(var1, new i3h$2(this, var1));
   }

   public i3h() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = true;
      this.u3 = true;
      this.a6 = true;
      this.u9 = 1930L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:case-sensitive", this.n5 ? "true" : "false");
      if (this.l6) {
         var2.l6("table:precision-as-shown", this.l6 ? "true" : "false");
      }

      if (!this.k5) {
         var2.l6("table:search-criteria-must-apply-to-whole-cell", this.k5 ? "true" : "false");
      }

      if (!this.u3) {
         var2.l6("table:automatic-find-labels", this.u3 ? "true" : "false");
      }

      if (!this.a6) {
         var2.l6("table:use-regular-expressions", this.a6 ? "true" : "false");
      }

      if ((this.u9 & 4294967295L) != 1930L) {
         var2.l6("table:null-year", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      if (this.h0 != null) {
         this.h0.n5("table", var2, "null-date");
      }

      if (this.c8 != null) {
         this.c8.n5("table", var2, "iteration");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static boolean n5(i3h var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(i3h var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(i3h var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean u3(i3h var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean a6(i3h var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long n5(i3h var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static q9o n5(i3h var0, q9o var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static z8u n5(i3h var0, z8u var1) {
      return var0.c8 = var1;
   }
}
