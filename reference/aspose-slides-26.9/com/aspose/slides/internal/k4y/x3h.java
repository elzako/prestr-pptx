package com.aspose.slides.internal.k4y;

public class x3h extends b3 {
   private boolean k5;
   private int u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private int x8;
   private String n3;
   private boolean y4;
   private boolean e2;
   private boolean t9;
   private boolean z1;
   private boolean t4;
   private boolean q0;
   private boolean z3;
   private long m1;
   public static final int n5 = x0z.n5("all");
   public static final int l6 = t1i.n5("userSet");
   private static final com.aspose.slides.internal.v6g.u9 k7 = new com.aspose.slides.internal.v6g.u9(
      "date1904",
      "showObjects",
      "showBorderUnselectedTables",
      "filterPrivacy",
      "promptedSolutions",
      "showInkAnnotation",
      "backupFile",
      "saveExternalLinkValues",
      "updateLinks",
      "codeName",
      "hidePivotFieldList",
      "showPivotChartFilter",
      "allowRefreshQuery",
      "publishItems",
      "checkCompatibility",
      "autoCompressPictures",
      "refreshAllConnections",
      "defaultThemeVersion"
   );

   public x3h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x3h$1 var2 = new x3h$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x3h() {
      this.l6();
   }

   private void l6() {
      this.k5 = false;
      this.u3 = n5;
      this.a6 = true;
      this.u9 = false;
      this.h0 = false;
      this.c8 = true;
      this.t2 = false;
      this.s7 = true;
      this.x8 = l6;
      this.y4 = false;
      this.e2 = false;
      this.t9 = false;
      this.z1 = false;
      this.t4 = false;
      this.q0 = true;
      this.z3 = false;
      this.m1 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5) {
         var2.l6("date1904", this.k5 ? "1" : "0");
      }

      if (this.u3 != n5) {
         var2.l6("showObjects", x0z.n5(this.u3));
      }

      if (!this.a6) {
         var2.l6("showBorderUnselectedTables", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("filterPrivacy", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("promptedSolutions", this.h0 ? "1" : "0");
      }

      if (!this.c8) {
         var2.l6("showInkAnnotation", this.c8 ? "1" : "0");
      }

      if (this.t2) {
         var2.l6("backupFile", this.t2 ? "1" : "0");
      }

      if (!this.s7) {
         var2.l6("saveExternalLinkValues", this.s7 ? "1" : "0");
      }

      if (this.x8 != l6) {
         var2.l6("updateLinks", t1i.n5(this.x8));
      }

      if (this.n3 != null) {
         var2.l6("codeName", this.n3);
      }

      if (this.y4) {
         var2.l6("hidePivotFieldList", this.y4 ? "1" : "0");
      }

      if (this.e2) {
         var2.l6("showPivotChartFilter", this.e2 ? "1" : "0");
      }

      if (this.t9) {
         var2.l6("allowRefreshQuery", this.t9 ? "1" : "0");
      }

      if (this.z1) {
         var2.l6("publishItems", this.z1 ? "1" : "0");
      }

      if (this.t4) {
         var2.l6("checkCompatibility", this.t4 ? "1" : "0");
      }

      if (!this.q0) {
         var2.l6("autoCompressPictures", this.q0 ? "1" : "0");
      }

      if (this.z3) {
         var2.l6("refreshAllConnections", this.z3 ? "1" : "0");
      }

      if ((this.m1 & 4294967295L) != 4294967295L) {
         var2.l6("defaultThemeVersion", com.aspose.slides.ms.System.Xml.f4.l6(this.m1));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k7;
   }

   // $VF: synthetic method
   static boolean n5(x3h var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(x3h var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean l6(x3h var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(x3h var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean u3(x3h var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean a6(x3h var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean u9(x3h var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean h0(x3h var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int l6(x3h var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String n5(x3h var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean c8(x3h var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean t2(x3h var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static boolean s7(x3h var0, boolean var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean x8(x3h var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static boolean n3(x3h var0, boolean var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static boolean y4(x3h var0, boolean var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static boolean e2(x3h var0, boolean var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static long n5(x3h var0, long var1) {
      return var0.m1 = var1;
   }
}
