package com.aspose.slides.internal.k4y;

public class i7t extends b3 {
   private boolean n5;
   private boolean l6;
   private String k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private String h0;
   private boolean c8;
   private boolean t2;
   private v6p s7;
   private w0v x8;
   private i7q n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "syncHorizontal",
      "syncVertical",
      "syncRef",
      "transitionEvaluation",
      "transitionEntry",
      "published",
      "codeName",
      "filterMode",
      "enableFormatConditionsCalculation",
      "tabColor",
      "outlinePr",
      "pageSetUpPr"
   );

   public i7t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i7t$1 var2 = new i7t$1(this);
      n5(var1, var2);
      n5(var1, new i7t$2(this, var1));
   }

   public i7t() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.l6 = false;
      this.u3 = false;
      this.a6 = false;
      this.u9 = true;
      this.c8 = false;
      this.t2 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("syncHorizontal", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("syncVertical", this.l6 ? "1" : "0");
      }

      if (this.k5 != null) {
         var2.l6("syncRef", this.k5);
      }

      if (this.u3) {
         var2.l6("transitionEvaluation", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("transitionEntry", this.a6 ? "1" : "0");
      }

      if (!this.u9) {
         var2.l6("published", this.u9 ? "1" : "0");
      }

      if (this.h0 != null) {
         var2.l6("codeName", this.h0);
      }

      if (this.c8) {
         var2.l6("filterMode", this.c8 ? "1" : "0");
      }

      if (!this.t2) {
         var2.l6("enableFormatConditionsCalculation", this.t2 ? "1" : "0");
      }

      if (this.s7 != null) {
         this.s7.n5("ssml", var2, "tabColor");
      }

      if (this.x8 != null) {
         this.x8.n5("ssml", var2, "outlinePr");
      }

      if (this.n3 != null) {
         this.n3.n5("ssml", var2, "pageSetUpPr");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return y4;
   }

   // $VF: synthetic method
   static boolean n5(i7t var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(i7t var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(i7t var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean k5(i7t var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean u3(i7t var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean a6(i7t var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String l6(i7t var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean u9(i7t var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean h0(i7t var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static v6p n5(i7t var0, v6p var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static w0v n5(i7t var0, w0v var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static i7q n5(i7t var0, i7q var1) {
      return var0.n3 = var1;
   }
}
