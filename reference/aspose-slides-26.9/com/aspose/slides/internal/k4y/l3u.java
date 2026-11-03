package com.aspose.slides.internal.k4y;

public class l3u extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private boolean a6;
   private long u9;
   private boolean h0;
   private long c8;
   private boolean t2;
   private String s7;
   private String x8;
   private boolean n3;
   private char y4;
   private l7j e2;
   private c6x t9;
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:disabled",
      "form:max-length",
      "form:printable",
      "form:tab-index",
      "form:tab-stop",
      "form:title",
      "form:value",
      "form:convert-empty-to-null",
      "form:echo-char",
      "properties",
      "event-listeners"
   );

   public l3u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l3u$1 var2 = new l3u$1(this);
      n5(var1, var2);
      n5(var1, new l3u$2(this, var1));
   }

   public l3u() {
      this.l6();
   }

   private void l6() {
      this.a6 = false;
      this.u9 = 4294967295L;
      this.h0 = true;
      this.c8 = 0L;
      this.t2 = true;
      this.n3 = false;
      this.y4 = '*';
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

      if ((this.u9 & 4294967295L) != 4294967295L) {
         var2.l6("form:max-length", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      if (!this.h0) {
         var2.l6("form:printable", this.h0 ? "true" : "false");
      }

      if ((this.c8 & 4294967295L) != 0L) {
         var2.l6("form:tab-index", com.aspose.slides.ms.System.Xml.f4.l6(this.c8));
      }

      if (!this.t2) {
         var2.l6("form:tab-stop", this.t2 ? "true" : "false");
      }

      if (this.s7 != null) {
         var2.l6("form:title", this.s7);
      }

      var2.l6("form:value", this.x8);
      if (this.n3) {
         var2.l6("form:convert-empty-to-null", this.n3 ? "true" : "false");
      }

      if (this.y4 != '*') {
         var2.l6("form:echo-char", com.aspose.slides.ms.System.Xml.f4.n5(this.y4));
      }

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
   static String n5(l3u var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(l3u var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(l3u var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(l3u var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(l3u var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long n5(l3u var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(l3u var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static long l6(l3u var0, long var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean k5(l3u var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String a6(l3u var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String u9(l3u var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean u3(l3u var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static char n5(l3u var0, char var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static l7j n5(l3u var0, l7j var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static c6x n5(l3u var0, c6x var1) {
      return var0.t9 = var1;
   }
}
