package com.aspose.slides.internal.k4y;

public class f9e extends b3 {
   private com.aspose.slides.ms.System.j5 n5 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.j5 l6 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.j5 k5 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.j5 u3 = new com.aspose.slides.ms.System.j5();
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private boolean t2;
   private long s7;
   private boolean x8;
   private boolean n3;
   private long y4;
   private boolean e2;
   private String t9;
   private boolean z1;
   private String t4;
   private l7j q0;
   private c6x z3;
   private static final com.aspose.slides.internal.v6g.u9 m1 = new com.aspose.slides.internal.v6g.u9(
      "form:value",
      "form:current-value",
      "form:min-value",
      "form:max-value",
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:disabled",
      "form:max-length",
      "form:printable",
      "form:readonly",
      "form:tab-index",
      "form:tab-stop",
      "form:title",
      "form:convert-empty-to-null",
      "form:data-field",
      "properties",
      "event-listeners"
   );

   public f9e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f9e$1 var2 = new f9e$1(this);
      n5(var1, var2);
      n5(var1, new f9e$2(this, var1));
   }

   public f9e() {
      this.l6();
   }

   private void l6() {
      com.aspose.slides.ms.System.j5.l6.u3(this.n5);
      com.aspose.slides.ms.System.j5.l6.u3(this.l6);
      com.aspose.slides.ms.System.j5.l6.u3(this.k5);
      com.aspose.slides.ms.System.j5.l6.u3(this.u3);
      this.t2 = false;
      this.s7 = 4294967295L;
      this.x8 = true;
      this.n3 = false;
      this.y4 = 0L;
      this.e2 = true;
      this.z1 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("form:value", com.aspose.slides.ms.System.Xml.f4.n5(this.n5.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      var2.l6("form:current-value", com.aspose.slides.ms.System.Xml.f4.n5(this.l6.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      var2.l6("form:min-value", com.aspose.slides.ms.System.Xml.f4.n5(this.k5.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      var2.l6("form:max-value", com.aspose.slides.ms.System.Xml.f4.n5(this.u3.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      if (this.a6 != null) {
         var2.l6("form:name", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("form:control-implementation", this.u9);
      }

      var2.l6("form:id", this.h0);
      if (this.c8 != null) {
         var2.l6("xforms:bind", this.c8);
      }

      if (this.t2) {
         var2.l6("form:disabled", this.t2 ? "true" : "false");
      }

      if ((this.s7 & 4294967295L) != 4294967295L) {
         var2.l6("form:max-length", com.aspose.slides.ms.System.Xml.f4.l6(this.s7));
      }

      if (!this.x8) {
         var2.l6("form:printable", this.x8 ? "true" : "false");
      }

      if (this.n3) {
         var2.l6("form:readonly", this.n3 ? "true" : "false");
      }

      if ((this.y4 & 4294967295L) != 0L) {
         var2.l6("form:tab-index", com.aspose.slides.ms.System.Xml.f4.l6(this.y4));
      }

      if (!this.e2) {
         var2.l6("form:tab-stop", this.e2 ? "true" : "false");
      }

      if (this.t9 != null) {
         var2.l6("form:title", this.t9);
      }

      if (this.z1) {
         var2.l6("form:convert-empty-to-null", this.z1 ? "true" : "false");
      }

      if (this.t4 != null) {
         var2.l6("form:data-field", this.t4);
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
   static com.aspose.slides.ms.System.j5 n5(f9e var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 l6(f9e var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 k5(f9e var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 u3(f9e var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static String n5(f9e var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(f9e var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(f9e var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(f9e var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean n5(f9e var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static long n5(f9e var0, long var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean l6(f9e var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean k5(f9e var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static long l6(f9e var0, long var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean u3(f9e var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String a6(f9e var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean a6(f9e var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String u9(f9e var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static l7j n5(f9e var0, l7j var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static c6x n5(f9e var0, c6x var1) {
      return var0.z3 = var1;
   }
}
