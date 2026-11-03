package com.aspose.slides.internal.k4y;

public class n4k extends b3 {
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private int h0;
   private boolean c8;
   private String t2;
   private String s7;
   private boolean x8;
   private long n3;
   private boolean y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private int q0;
   private int z3;
   private boolean m1;
   private byte k7;
   private byte m3;
   private String z8;
   private l7j j5;
   private c6x w1;
   public static final int n5 = b5u.n5("push");
   public static final int l6 = x2v.n5("center");
   private static final com.aspose.slides.internal.v6g.u9 r4 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:button-type",
      "form:disabled",
      "form:label",
      "form:image-data",
      "form:printable",
      "form:tab-index",
      "form:tab-stop",
      "office:target-frame",
      "xlink:href",
      "form:title",
      "form:value",
      "form:image-position",
      "form:image-align",
      "form:default-button",
      "form:toggle",
      "form:focus-on-click",
      "form:xforms-submission",
      "properties",
      "event-listeners"
   );

   public n4k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n4k$1 var2 = new n4k$1(this);
      n5(var1, var2);
      n5(var1, new n4k$2(this, var1));
   }

   public n4k() {
      this.l6();
   }

   private void l6() {
      this.h0 = n5;
      this.c8 = false;
      this.x8 = true;
      this.n3 = 0L;
      this.y4 = true;
      this.e2 = "_blank";
      this.q0 = 0;
      this.z3 = l6;
      this.m1 = false;
      this.k7 = -1;
      this.m3 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != null) {
         var2.l6("form:name", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("form:control-implementation", this.u3);
      }

      var2.l6("form:id", this.a6);
      if (this.u9 != null) {
         var2.l6("xforms:bind", this.u9);
      }

      if (this.h0 != n5) {
         var2.l6("form:button-type", b5u.n5(this.h0));
      }

      if (this.c8) {
         var2.l6("form:disabled", this.c8 ? "true" : "false");
      }

      if (this.t2 != null) {
         var2.l6("form:label", this.t2);
      }

      if (this.s7 != null) {
         var2.l6("form:image-data", this.s7);
      }

      if (!this.x8) {
         var2.l6("form:printable", this.x8 ? "true" : "false");
      }

      if ((this.n3 & 4294967295L) != 0L) {
         var2.l6("form:tab-index", com.aspose.slides.ms.System.Xml.f4.l6(this.n3));
      }

      if (!this.y4) {
         var2.l6("form:tab-stop", this.y4 ? "true" : "false");
      }

      if (!"_blank".equals(this.e2)) {
         var2.l6("office:target-frame", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("xlink:href", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("form:title", this.z1);
      }

      var2.l6("form:value", this.t4);
      if (this.q0 != 0) {
         var2.l6("form:image-position", p3o.n5(this.q0));
      }

      if (this.z3 != l6) {
         var2.l6("form:image-align", x2v.n5(this.z3));
      }

      if (this.m1) {
         var2.l6("form:default-button", this.m1 ? "true" : "false");
      }

      if (this.k7 != -1) {
         var2.l6("form:toggle", this.k7 == 1 ? "true" : "false");
      }

      if (this.m3 != -1) {
         var2.l6("form:focus-on-click", this.m3 == 1 ? "true" : "false");
      }

      if (this.z8 != null) {
         var2.l6("form:xforms-submission", this.z8);
      }

      if (this.j5 != null) {
         this.j5.n5("form", var2, "properties");
      }

      if (this.w1 != null) {
         this.w1.n5("office", var2, "event-listeners");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return r4;
   }

   // $VF: synthetic method
   static String n5(n4k var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(n4k var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(n4k var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(n4k var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int n5(n4k var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean n5(n4k var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(n4k var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(n4k var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean l6(n4k var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static long n5(n4k var0, long var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(n4k var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String h0(n4k var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String c8(n4k var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String t2(n4k var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String s7(n4k var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int l6(n4k var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int k5(n4k var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static boolean u3(n4k var0, boolean var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static byte n5(n4k var0, byte var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static byte l6(n4k var0, byte var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String x8(n4k var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static l7j n5(n4k var0, l7j var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static c6x n5(n4k var0, c6x var1) {
      return var0.w1 = var1;
   }
}
