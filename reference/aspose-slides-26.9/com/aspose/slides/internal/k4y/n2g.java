package com.aspose.slides.internal.k4y;

public class n2g extends b3 {
   private int l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private int h0;
   private int c8;
   private long t2;
   private long s7;
   private long x8;
   private long n3;
   private long y4;
   private boolean e2;
   private l0k t9;
   public static final int n5 = t3d.n5("visible");
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "visibility",
      "minimized",
      "showHorizontalScroll",
      "showVerticalScroll",
      "showSheetTabs",
      "xWindow",
      "yWindow",
      "windowWidth",
      "windowHeight",
      "tabRatio",
      "firstSheet",
      "activeTab",
      "autoFilterDateGrouping",
      "extLst"
   );

   public n2g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n2g$1 var2 = new n2g$1(this);
      n5(var1, var2);
      n5(var1, new n2g$2(this, var1));
   }

   public n2g() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
      this.k5 = false;
      this.u3 = true;
      this.a6 = true;
      this.u9 = true;
      this.h0 = 0;
      this.c8 = 0;
      this.t2 = 4294967295L;
      this.s7 = 4294967295L;
      this.x8 = 600L;
      this.n3 = 0L;
      this.y4 = 0L;
      this.e2 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("visibility", t3d.n5(this.l6));
      }

      if (this.k5) {
         var2.l6("minimized", this.k5 ? "1" : "0");
      }

      if (!this.u3) {
         var2.l6("showHorizontalScroll", this.u3 ? "1" : "0");
      }

      if (!this.a6) {
         var2.l6("showVerticalScroll", this.a6 ? "1" : "0");
      }

      if (!this.u9) {
         var2.l6("showSheetTabs", this.u9 ? "1" : "0");
      }

      if (this.h0 != 0) {
         var2.l6("xWindow", com.aspose.slides.ms.System.Xml.f4.n5(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("yWindow", com.aspose.slides.ms.System.Xml.f4.n5(this.c8));
      }

      if ((this.t2 & 4294967295L) != 4294967295L) {
         var2.l6("windowWidth", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      if ((this.s7 & 4294967295L) != 4294967295L) {
         var2.l6("windowHeight", com.aspose.slides.ms.System.Xml.f4.l6(this.s7));
      }

      if ((this.x8 & 4294967295L) != 600L) {
         var2.l6("tabRatio", com.aspose.slides.ms.System.Xml.f4.l6(this.x8));
      }

      if ((this.n3 & 4294967295L) != 0L) {
         var2.l6("firstSheet", com.aspose.slides.ms.System.Xml.f4.l6(this.n3));
      }

      if ((this.y4 & 4294967295L) != 0L) {
         var2.l6("activeTab", com.aspose.slides.ms.System.Xml.f4.l6(this.y4));
      }

      if (!this.e2) {
         var2.l6("autoFilterDateGrouping", this.e2 ? "1" : "0");
      }

      if (this.t9 != null) {
         this.t9.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return z1;
   }

   // $VF: synthetic method
   static int n5(n2g var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(n2g var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(n2g var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(n2g var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean u3(n2g var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int l6(n2g var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int k5(n2g var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long n5(n2g var0, long var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static long l6(n2g var0, long var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static long k5(n2g var0, long var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static long u3(n2g var0, long var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static long a6(n2g var0, long var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean a6(n2g var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static l0k n5(n2g var0, l0k var1) {
      return var0.t9 = var1;
   }
}
