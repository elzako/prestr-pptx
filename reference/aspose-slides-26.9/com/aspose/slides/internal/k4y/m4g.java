package com.aspose.slides.internal.k4y;

public class m4g extends b3 {
   private String n5;
   private boolean l6;
   private boolean k5;
   private String u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private String c8;
   private byte t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "table:scenario-ranges",
      "table:is-active",
      "table:display-border",
      "table:border-color",
      "table:copy-back",
      "table:copy-styles",
      "table:copy-formulas",
      "table:comment",
      "table:protected"
   );

   public m4g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m4g$1 var2 = new m4g$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m4g() {
      this.l6();
   }

   private void l6() {
      this.k5 = true;
      this.a6 = true;
      this.u9 = true;
      this.h0 = true;
      this.t2 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:scenario-ranges", this.n5);
      var2.l6("table:is-active", this.l6 ? "true" : "false");
      if (!this.k5) {
         var2.l6("table:display-border", this.k5 ? "true" : "false");
      }

      if (this.u3 != null) {
         var2.l6("table:border-color", this.u3);
      }

      if (!this.a6) {
         var2.l6("table:copy-back", this.a6 ? "true" : "false");
      }

      if (!this.u9) {
         var2.l6("table:copy-styles", this.u9 ? "true" : "false");
      }

      if (!this.h0) {
         var2.l6("table:copy-formulas", this.h0 ? "true" : "false");
      }

      if (this.c8 != null) {
         var2.l6("table:comment", this.c8);
      }

      if (this.t2 != -1) {
         var2.l6("table:protected", this.t2 == 1 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static String n5(m4g var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(m4g var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(m4g var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(m4g var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(m4g var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean u3(m4g var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean a6(m4g var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String k5(m4g var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static byte n5(m4g var0, byte var1) {
      return var0.t2 = var1;
   }
}
