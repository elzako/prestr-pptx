package com.aspose.slides.internal.k4y;

public class y4t extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private boolean u9;
   private String h0;
   private boolean c8;
   private String t2;
   private boolean s7;
   private l7j x8;
   private c6x n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:for",
      "form:disabled",
      "form:label",
      "form:printable",
      "form:title",
      "form:multi-line",
      "properties",
      "event-listeners"
   );

   public y4t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y4t$1 var2 = new y4t$1(this);
      n5(var1, var2);
      n5(var1, new y4t$2(this, var1));
   }

   public y4t() {
      this.l6();
   }

   private void l6() {
      this.u9 = false;
      this.c8 = true;
      this.s7 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("form:name", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("form:control-implementation", this.l6);
      }

      var2.l6("form:id", this.k5);
      if (this.u3 != null) {
         var2.l6("xforms:bind", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("form:for", this.a6);
      }

      if (this.u9) {
         var2.l6("form:disabled", this.u9 ? "true" : "false");
      }

      if (this.h0 != null) {
         var2.l6("form:label", this.h0);
      }

      if (!this.c8) {
         var2.l6("form:printable", this.c8 ? "true" : "false");
      }

      if (this.t2 != null) {
         var2.l6("form:title", this.t2);
      }

      if (this.s7) {
         var2.l6("form:multi-line", this.s7 ? "true" : "false");
      }

      if (this.x8 != null) {
         this.x8.n5("form", var2, "properties");
      }

      if (this.n3 != null) {
         this.n3.n5("office", var2, "event-listeners");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return y4;
   }

   // $VF: synthetic method
   static String n5(y4t var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(y4t var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(y4t var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(y4t var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(y4t var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(y4t var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(y4t var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean l6(y4t var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String h0(y4t var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean k5(y4t var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static l7j n5(y4t var0, l7j var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static c6x n5(y4t var0, c6x var1) {
      return var0.n3 = var1;
   }
}
