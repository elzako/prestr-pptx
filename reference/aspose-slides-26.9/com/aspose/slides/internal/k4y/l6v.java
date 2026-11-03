package com.aspose.slides.internal.k4y;

public class l6v extends b3 {
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private boolean h0;
   private String c8;
   private boolean t2;
   private long s7;
   private boolean x8;
   private String n3;
   private String y4;
   private String e2;
   private int t9;
   private int z1;
   private int t4;
   private int q0;
   private boolean z3;
   private int m1;
   private l7j k7;
   private c6x m3;
   public static final int n5 = x2v.n5("center");
   public static final int l6 = n7d.n5("unchecked");
   private static final com.aspose.slides.internal.v6g.u9 z8 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:disabled",
      "form:label",
      "form:printable",
      "form:tab-index",
      "form:tab-stop",
      "form:title",
      "form:value",
      "form:data-field",
      "form:visual-effect",
      "form:image-position",
      "form:image-align",
      "form:current-state",
      "form:is-tristate",
      "form:state",
      "properties",
      "event-listeners"
   );

   public l6v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l6v$1 var2 = new l6v$1(this);
      n5(var1, var2);
      n5(var1, new l6v$2(this, var1));
   }

   public l6v() {
      this.l6();
   }

   private void l6() {
      this.h0 = false;
      this.t2 = true;
      this.s7 = 0L;
      this.x8 = true;
      this.t9 = 0;
      this.z1 = 0;
      this.t4 = n5;
      this.q0 = 0;
      this.z3 = false;
      this.m1 = l6;
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

      if (this.h0) {
         var2.l6("form:disabled", this.h0 ? "true" : "false");
      }

      if (this.c8 != null) {
         var2.l6("form:label", this.c8);
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

      if (this.n3 != null) {
         var2.l6("form:title", this.n3);
      }

      var2.l6("form:value", this.y4);
      if (this.e2 != null) {
         var2.l6("form:data-field", this.e2);
      }

      if (this.t9 != 0) {
         var2.l6("form:visual-effect", z4k.n5(this.t9));
      }

      if (this.z1 != 0) {
         var2.l6("form:image-position", p3o.n5(this.z1));
      }

      if (this.t4 != n5) {
         var2.l6("form:image-align", x2v.n5(this.t4));
      }

      if (this.q0 != 0) {
         var2.l6("form:current-state", n7d.n5(this.q0));
      }

      if (this.z3) {
         var2.l6("form:is-tristate", this.z3 ? "true" : "false");
      }

      if (this.m1 != l6) {
         var2.l6("form:state", n7d.n5(this.m1));
      }

      if (this.k7 != null) {
         this.k7.n5("form", var2, "properties");
      }

      if (this.m3 != null) {
         this.m3.n5("office", var2, "event-listeners");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return z8;
   }

   // $VF: synthetic method
   static String n5(l6v var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(l6v var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(l6v var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(l6v var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean n5(l6v var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String a6(l6v var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean l6(l6v var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static long n5(l6v var0, long var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean k5(l6v var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String u9(l6v var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String h0(l6v var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String c8(l6v var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int n5(l6v var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static int l6(l6v var0, int var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static int k5(l6v var0, int var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int u3(l6v var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static boolean u3(l6v var0, boolean var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int a6(l6v var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static l7j n5(l6v var0, l7j var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static c6x n5(l6v var0, c6x var1) {
      return var0.m3 = var1;
   }
}
