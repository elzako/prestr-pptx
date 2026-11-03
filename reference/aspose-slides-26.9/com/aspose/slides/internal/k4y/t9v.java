package com.aspose.slides.internal.k4y;

public class t9v extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private boolean a6;
   private String u9;
   private boolean h0;
   private boolean c8;
   private String t2;
   private String s7;
   private l7j x8;
   private c6x n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:disabled",
      "form:image-data",
      "form:printable",
      "form:readonly",
      "form:title",
      "form:data-field",
      "properties",
      "event-listeners"
   );

   public t9v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      t9v$1 var2 = new t9v$1(this);
      n5(var1, var2);
      n5(var1, new t9v$2(this, var1));
   }

   public t9v() {
      this.l6();
   }

   private void l6() {
      this.a6 = false;
      this.h0 = true;
      this.c8 = false;
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

      if (this.a6) {
         var2.l6("form:disabled", this.a6 ? "true" : "false");
      }

      if (this.u9 != null) {
         var2.l6("form:image-data", this.u9);
      }

      if (!this.h0) {
         var2.l6("form:printable", this.h0 ? "true" : "false");
      }

      if (this.c8) {
         var2.l6("form:readonly", this.c8 ? "true" : "false");
      }

      if (this.t2 != null) {
         var2.l6("form:title", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("form:data-field", this.s7);
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
   static String n5(t9v var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(t9v var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(t9v var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(t9v var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(t9v var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(t9v var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(t9v var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean k5(t9v var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String u9(t9v var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String h0(t9v var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static l7j n5(t9v var0, l7j var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static c6x n5(t9v var0, c6x var1) {
      return var0.n3 = var1;
   }
}
