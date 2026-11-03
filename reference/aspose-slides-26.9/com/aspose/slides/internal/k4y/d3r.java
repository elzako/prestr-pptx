package com.aspose.slides.internal.k4y;

public class d3r extends b3 {
   private String k5;
   private com.aspose.slides.ms.System.o0 u3 = new com.aspose.slides.ms.System.o0();
   private boolean a6;
   private long u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private boolean n3;
   private boolean y4;
   private boolean e2;
   private boolean t9;
   private boolean z1;
   private int t4;
   private int q0;
   private long z3;
   private long m1;
   private long k7;
   private long m3;
   private boolean z8;
   private boolean j5;
   private int w1;
   private int r4;
   private l0k c4;
   public static final int n5 = l5c.n5("commIndicator");
   public static final int l6 = x0z.n5("all");
   private static final com.aspose.slides.internal.v6g.u9 y2 = new com.aspose.slides.internal.v6g.u9(
      "name",
      "guid",
      "autoUpdate",
      "mergeInterval",
      "changesSavedWin",
      "onlySync",
      "personalView",
      "includePrintSettings",
      "includeHiddenRowCol",
      "maximized",
      "minimized",
      "showHorizontalScroll",
      "showVerticalScroll",
      "showSheetTabs",
      "xWindow",
      "yWindow",
      "windowWidth",
      "windowHeight",
      "tabRatio",
      "activeSheetId",
      "showFormulaBar",
      "showStatusbar",
      "showComments",
      "showObjects",
      "extLst"
   );

   public d3r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d3r$1 var2 = new d3r$1(this);
      n5(var1, var2);
      n5(var1, new d3r$2(this, var1));
   }

   public d3r() {
      this.l6();
   }

   private void l6() {
      com.aspose.slides.ms.System.o0.n5.k5(this.u3);
      this.a6 = false;
      this.u9 = 4294967295L;
      this.h0 = false;
      this.c8 = false;
      this.t2 = false;
      this.s7 = true;
      this.x8 = true;
      this.n3 = false;
      this.y4 = false;
      this.e2 = true;
      this.t9 = true;
      this.z1 = true;
      this.t4 = 0;
      this.q0 = 0;
      this.k7 = 600L;
      this.z8 = true;
      this.j5 = true;
      this.w1 = n5;
      this.r4 = l6;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("name", this.k5);
      var2.l6("guid", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.u3.k5())), "}"}));
      if (this.a6) {
         var2.l6("autoUpdate", this.a6 ? "1" : "0");
      }

      if ((this.u9 & 4294967295L) != 4294967295L) {
         var2.l6("mergeInterval", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      if (this.h0) {
         var2.l6("changesSavedWin", this.h0 ? "1" : "0");
      }

      if (this.c8) {
         var2.l6("onlySync", this.c8 ? "1" : "0");
      }

      if (this.t2) {
         var2.l6("personalView", this.t2 ? "1" : "0");
      }

      if (!this.s7) {
         var2.l6("includePrintSettings", this.s7 ? "1" : "0");
      }

      if (!this.x8) {
         var2.l6("includeHiddenRowCol", this.x8 ? "1" : "0");
      }

      if (this.n3) {
         var2.l6("maximized", this.n3 ? "1" : "0");
      }

      if (this.y4) {
         var2.l6("minimized", this.y4 ? "1" : "0");
      }

      if (!this.e2) {
         var2.l6("showHorizontalScroll", this.e2 ? "1" : "0");
      }

      if (!this.t9) {
         var2.l6("showVerticalScroll", this.t9 ? "1" : "0");
      }

      if (!this.z1) {
         var2.l6("showSheetTabs", this.z1 ? "1" : "0");
      }

      if (this.t4 != 0) {
         var2.l6("xWindow", com.aspose.slides.ms.System.Xml.f4.n5(this.t4));
      }

      if (this.q0 != 0) {
         var2.l6("yWindow", com.aspose.slides.ms.System.Xml.f4.n5(this.q0));
      }

      var2.l6("windowWidth", com.aspose.slides.ms.System.Xml.f4.l6(this.z3));
      var2.l6("windowHeight", com.aspose.slides.ms.System.Xml.f4.l6(this.m1));
      if ((this.k7 & 4294967295L) != 600L) {
         var2.l6("tabRatio", com.aspose.slides.ms.System.Xml.f4.l6(this.k7));
      }

      var2.l6("activeSheetId", com.aspose.slides.ms.System.Xml.f4.l6(this.m3));
      if (!this.z8) {
         var2.l6("showFormulaBar", this.z8 ? "1" : "0");
      }

      if (!this.j5) {
         var2.l6("showStatusbar", this.j5 ? "1" : "0");
      }

      if (this.w1 != n5) {
         var2.l6("showComments", l5c.n5(this.w1));
      }

      if (this.r4 != l6) {
         var2.l6("showObjects", x0z.n5(this.r4));
      }

      if (this.c4 != null) {
         this.c4.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return y2;
   }

   // $VF: synthetic method
   static String n5(d3r var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(d3r var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d3r var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long n5(d3r var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(d3r var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean k5(d3r var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean u3(d3r var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean a6(d3r var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean u9(d3r var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean h0(d3r var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean c8(d3r var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean t2(d3r var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static boolean s7(d3r var0, boolean var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean x8(d3r var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static int n5(d3r var0, int var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int l6(d3r var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static long l6(d3r var0, long var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static long k5(d3r var0, long var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static long u3(d3r var0, long var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static long a6(d3r var0, long var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static boolean n3(d3r var0, boolean var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static boolean y4(d3r var0, boolean var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static int k5(d3r var0, int var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static int u3(d3r var0, int var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static l0k n5(d3r var0, l0k var1) {
      return var0.c4 = var1;
   }
}
