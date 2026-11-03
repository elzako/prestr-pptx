package com.aspose.slides.internal.k4y;

public class l1z extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private boolean u9;
   private boolean h0;
   private long c8;
   private boolean t2;
   private String s7;
   private String x8;
   private String n3;
   private String y4;
   private long e2;
   private long t9;
   private com.aspose.slides.ms.System.s4 z1 = new com.aspose.slides.ms.System.s4();
   private int t4;
   private l7j q0;
   private c6x z3;
   public static final com.aspose.slides.ms.System.s4 n5 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 m1 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:disabled",
      "form:printable",
      "form:tab-index",
      "form:tab-stop",
      "form:title",
      "form:value",
      "form:max-value",
      "form:min-value",
      "form:step-size",
      "form:page-step-size",
      "form:delay-for-repeat",
      "form:orientation",
      "properties",
      "event-listeners"
   );

   public l1z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l1z$1 var2 = new l1z$1(this);
      n5(var1, var2);
      n5(var1, new l1z$2(this, var1));
   }

   public l1z() {
      this.l6();
   }

   private void l6() {
      this.u9 = false;
      this.h0 = true;
      this.c8 = 0L;
      this.t2 = true;
      this.e2 = 4294967295L;
      this.t9 = 4294967295L;
      n5.u3(this.z1);
      this.t4 = 0;
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
         var2.l6("form:disabled", this.u9 ? "true" : "false");
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
      var2.l6("form:max-value", this.n3);
      var2.l6("form:min-value", this.y4);
      if ((this.e2 & 4294967295L) != 4294967295L) {
         var2.l6("form:step-size", com.aspose.slides.ms.System.Xml.f4.l6(this.e2));
      }

      if ((this.t9 & 4294967295L) != 4294967295L) {
         var2.l6("form:page-step-size", com.aspose.slides.ms.System.Xml.f4.l6(this.t9));
      }

      if (com.aspose.slides.ms.System.s4.a6(this.z1, n5)) {
         var2.l6("form:delay-for-repeat", n5(this.z1.n3()));
      }

      if (this.t4 != 0) {
         var2.l6("form:orientation", p6f.n5(this.t4));
      }

      if (this.q0 != null) {
         this.q0.n5("form", var2, "properties");
      }

      if (this.z3 != null) {
         this.z3.n5("office", var2, "event-listeners");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return m1;
   }

   // $VF: synthetic method
   static String n5(l1z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(l1z var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(l1z var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(l1z var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(l1z var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(l1z var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static long n5(l1z var0, long var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean k5(l1z var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String a6(l1z var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String u9(l1z var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String h0(l1z var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String c8(l1z var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static long l6(l1z var0, long var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static long k5(l1z var0, long var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 n5(l1z var0) {
      return var0.z1;
   }

   // $VF: synthetic method
   static int n5(l1z var0, int var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static l7j n5(l1z var0, l7j var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static c6x n5(l1z var0, c6x var1) {
      return var0.z3 = var1;
   }
}
