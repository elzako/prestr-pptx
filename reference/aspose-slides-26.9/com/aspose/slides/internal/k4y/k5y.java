package com.aspose.slides.internal.k4y;

public class k5y extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private boolean u9;
   private boolean h0;
   private String c8;
   private boolean t2;
   private boolean s7;
   private long x8;
   private boolean n3;
   private String y4;
   private String e2;
   private String t9;
   private int z1;
   private int t4;
   private int q0;
   private l7j z3;
   private c6x m1;
   public static final int n5 = x2v.n5("center");
   private static final com.aspose.slides.internal.v6g.u9 k7 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:current-selected",
      "form:disabled",
      "form:label",
      "form:printable",
      "form:selected",
      "form:tab-index",
      "form:tab-stop",
      "form:title",
      "form:value",
      "form:data-field",
      "form:visual-effect",
      "form:image-position",
      "form:image-align",
      "properties",
      "event-listeners"
   );

   public k5y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      k5y$1 var2 = new k5y$1(this);
      n5(var1, var2);
      n5(var1, new k5y$2(this, var1));
   }

   public k5y() {
      this.l6();
   }

   private void l6() {
      this.u9 = false;
      this.h0 = false;
      this.t2 = true;
      this.s7 = false;
      this.x8 = 0L;
      this.n3 = true;
      this.z1 = 0;
      this.t4 = 0;
      this.q0 = n5;
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

      if (this.u9) {
         var2.l6("form:current-selected", this.u9 ? "true" : "false");
      }

      if (this.h0) {
         var2.l6("form:disabled", this.h0 ? "true" : "false");
      }

      if (this.c8 != null) {
         var2.l6("form:label", this.c8);
      }

      if (!this.t2) {
         var2.l6("form:printable", this.t2 ? "true" : "false");
      }

      if (this.s7) {
         var2.l6("form:selected", this.s7 ? "true" : "false");
      }

      if ((this.x8 & 4294967295L) != 0L) {
         var2.l6("form:tab-index", com.aspose.slides.ms.System.Xml.f4.l6(this.x8));
      }

      if (!this.n3) {
         var2.l6("form:tab-stop", this.n3 ? "true" : "false");
      }

      if (this.y4 != null) {
         var2.l6("form:title", this.y4);
      }

      var2.l6("form:value", this.e2);
      if (this.t9 != null) {
         var2.l6("form:data-field", this.t9);
      }

      if (this.z1 != 0) {
         var2.l6("form:visual-effect", z4k.n5(this.z1));
      }

      if (this.t4 != 0) {
         var2.l6("form:image-position", p3o.n5(this.t4));
      }

      if (this.q0 != n5) {
         var2.l6("form:image-align", x2v.n5(this.q0));
      }

      if (this.z3 != null) {
         this.z3.n5("form", var2, "properties");
      }

      if (this.m1 != null) {
         this.m1.n5("office", var2, "event-listeners");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k7;
   }

   // $VF: synthetic method
   static String n5(k5y var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(k5y var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(k5y var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(k5y var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(k5y var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(k5y var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String a6(k5y var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean k5(k5y var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean u3(k5y var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static long n5(k5y var0, long var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean a6(k5y var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String u9(k5y var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String h0(k5y var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String c8(k5y var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static int n5(k5y var0, int var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static int l6(k5y var0, int var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int k5(k5y var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static l7j n5(k5y var0, l7j var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static c6x n5(k5y var0, c6x var1) {
      return var0.m1 = var1;
   }
}
