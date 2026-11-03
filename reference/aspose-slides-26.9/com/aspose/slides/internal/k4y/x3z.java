package com.aspose.slides.internal.k4y;

public class x3z extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private boolean u9;
   private long h0;
   private boolean c8;
   private boolean t2;
   private long s7;
   private boolean x8;
   private String n3;
   private String y4;
   private l7j e2;
   private c6x t9;
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:current-value",
      "form:disabled",
      "form:max-length",
      "form:printable",
      "form:readonly",
      "form:tab-index",
      "form:tab-stop",
      "form:title",
      "form:value",
      "properties",
      "event-listeners"
   );

   public x3z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x3z$1 var2 = new x3z$1(this);
      n5(var1, var2);
      n5(var1, new x3z$2(this, var1));
   }

   public x3z() {
      this.l6();
   }

   private void l6() {
      this.u9 = false;
      this.h0 = 4294967295L;
      this.c8 = true;
      this.t2 = false;
      this.s7 = 0L;
      this.x8 = true;
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

      var2.l6("form:current-value", this.a6);
      if (this.u9) {
         var2.l6("form:disabled", this.u9 ? "true" : "false");
      }

      if ((this.h0 & 4294967295L) != 4294967295L) {
         var2.l6("form:max-length", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if (!this.c8) {
         var2.l6("form:printable", this.c8 ? "true" : "false");
      }

      if (this.t2) {
         var2.l6("form:readonly", this.t2 ? "true" : "false");
      }

      if ((this.s7 & 4294967295L) != 0L) {
         var2.l6("form:tab-index", com.aspose.slides.ms.System.Xml.f4.l6(this.s7));
      }

      if (!this.x8) {
         var2.l6("form:tab-stop", this.x8 ? "true" : "false");
      }

      if (this.n3 != null) {
         var2.l6("form:title", this.n3);
      }

      var2.l6("form:value", this.y4);
      if (this.e2 != null) {
         this.e2.n5("form", var2, "properties");
      }

      if (this.t9 != null) {
         this.t9.n5("office", var2, "event-listeners");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return z1;
   }

   // $VF: synthetic method
   static String n5(x3z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(x3z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(x3z var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(x3z var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(x3z var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(x3z var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long n5(x3z var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean l6(x3z var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean k5(x3z var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static long l6(x3z var0, long var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean u3(x3z var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String u9(x3z var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String h0(x3z var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static l7j n5(x3z var0, l7j var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static c6x n5(x3z var0, c6x var1) {
      return var0.t9 = var1;
   }
}
