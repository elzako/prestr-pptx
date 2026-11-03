package com.aspose.slides.internal.k4y;

public class l1p extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private int u9;
   private boolean h0;
   private String c8;
   private boolean t2;
   private long s7;
   private boolean x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private l7j z1;
   private c6x t4;
   public static final int n5 = b5u.n5("push");
   private static final com.aspose.slides.internal.v6g.u9 q0 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:button-type",
      "form:disabled",
      "form:image-data",
      "form:printable",
      "form:tab-index",
      "form:tab-stop",
      "office:target-frame",
      "xlink:href",
      "form:title",
      "form:value",
      "properties",
      "event-listeners"
   );

   public l1p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l1p$1 var2 = new l1p$1(this);
      n5(var1, var2);
      n5(var1, new l1p$2(this, var1));
   }

   public l1p() {
      this.l6();
   }

   private void l6() {
      this.u9 = n5;
      this.h0 = false;
      this.t2 = true;
      this.s7 = 0L;
      this.x8 = true;
      this.n3 = "_blank";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("form:name", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("form:control-implementation", this.k5);
      }

      var2.l6("form:id", this.u3);
      if (this.a6 != null) {
         var2.l6("xforms:bind", this.a6);
      }

      if (this.u9 != n5) {
         var2.l6("form:button-type", b5u.n5(this.u9));
      }

      if (this.h0) {
         var2.l6("form:disabled", this.h0 ? "true" : "false");
      }

      if (this.c8 != null) {
         var2.l6("form:image-data", this.c8);
      }

      if (!this.t2) {
         var2.l6("form:printable", this.t2 ? "true" : "false");
      }

      if ((this.s7 & 4294967295L) != 0L) {
         var2.l6("form:tab-index", com.aspose.slides.ms.System.Xml.f4.l6(this.s7));
      }

      if (!this.x8) {
         var2.l6("form:tab-stop", this.x8 ? "true" : "false");
      }

      if (!"_blank".equals(this.n3)) {
         var2.l6("office:target-frame", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("xlink:href", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("form:title", this.e2);
      }

      var2.l6("form:value", this.t9);
      if (this.z1 != null) {
         this.z1.n5("form", var2, "properties");
      }

      if (this.t4 != null) {
         this.t4.n5("office", var2, "event-listeners");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return q0;
   }

   // $VF: synthetic method
   static String n5(l1p var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(l1p var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(l1p var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(l1p var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int n5(l1p var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean n5(l1p var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String a6(l1p var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean l6(l1p var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static long n5(l1p var0, long var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean k5(l1p var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String u9(l1p var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String h0(l1p var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String c8(l1p var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String t2(l1p var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static l7j n5(l1p var0, l7j var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static c6x n5(l1p var0, c6x var1) {
      return var0.t4 = var1;
   }
}
