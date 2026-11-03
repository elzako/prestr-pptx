package com.aspose.slides.internal.k4y;

public class h3g extends b3 {
   private com.aspose.slides.ms.System.o0 k5 = new com.aspose.slides.ms.System.o0();
   private long u3;
   private long a6;
   private boolean u9;
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
   private boolean t4;
   private int q0;
   private boolean z3;
   private int m1;
   private boolean k7;
   private String m3;
   private c5r z8;
   private t4w j5;
   private h3v w1;
   private h3v r4;
   private q2r c4;
   private i1l y2;
   private a6f y1;
   private t6r a0;
   private b4o d2;
   private l0k d5;
   public static final int n5 = f9h.n5("visible");
   public static final int l6 = o9z.n5("normal");
   private static final com.aspose.slides.internal.v6g.u9 s3 = new com.aspose.slides.internal.v6g.u9(
      "guid",
      "scale",
      "colorId",
      "showPageBreaks",
      "showFormulas",
      "showGridLines",
      "showRowCol",
      "outlineSymbols",
      "zeroValues",
      "fitToPage",
      "printArea",
      "filter",
      "showAutoFilter",
      "hiddenRows",
      "hiddenColumns",
      "state",
      "filterUnique",
      "view",
      "showRuler",
      "topLeftCell",
      "pane",
      "selection",
      "rowBreaks",
      "colBreaks",
      "pageMargins",
      "printOptions",
      "pageSetup",
      "headerFooter",
      "autoFilter",
      "extLst"
   );

   public h3g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      h3g$1 var2 = new h3g$1(this);
      n5(var1, var2);
      n5(var1, new h3g$2(this, var1));
   }

   public h3g() {
      this.l6();
   }

   private void l6() {
      com.aspose.slides.ms.System.o0.n5.k5(this.k5);
      this.u3 = 100L;
      this.a6 = 64L;
      this.u9 = false;
      this.h0 = false;
      this.c8 = true;
      this.t2 = true;
      this.s7 = true;
      this.x8 = true;
      this.n3 = false;
      this.y4 = false;
      this.e2 = false;
      this.t9 = false;
      this.z1 = false;
      this.t4 = false;
      this.q0 = n5;
      this.z3 = false;
      this.m1 = l6;
      this.k7 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("guid", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.k5.k5())), "}"}));
      if ((this.u3 & 4294967295L) != 100L) {
         var2.l6("scale", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if ((this.a6 & 4294967295L) != 64L) {
         var2.l6("colorId", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      if (this.u9) {
         var2.l6("showPageBreaks", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("showFormulas", this.h0 ? "1" : "0");
      }

      if (!this.c8) {
         var2.l6("showGridLines", this.c8 ? "1" : "0");
      }

      if (!this.t2) {
         var2.l6("showRowCol", this.t2 ? "1" : "0");
      }

      if (!this.s7) {
         var2.l6("outlineSymbols", this.s7 ? "1" : "0");
      }

      if (!this.x8) {
         var2.l6("zeroValues", this.x8 ? "1" : "0");
      }

      if (this.n3) {
         var2.l6("fitToPage", this.n3 ? "1" : "0");
      }

      if (this.y4) {
         var2.l6("printArea", this.y4 ? "1" : "0");
      }

      if (this.e2) {
         var2.l6("filter", this.e2 ? "1" : "0");
      }

      if (this.t9) {
         var2.l6("showAutoFilter", this.t9 ? "1" : "0");
      }

      if (this.z1) {
         var2.l6("hiddenRows", this.z1 ? "1" : "0");
      }

      if (this.t4) {
         var2.l6("hiddenColumns", this.t4 ? "1" : "0");
      }

      if (this.q0 != n5) {
         var2.l6("state", f9h.n5(this.q0));
      }

      if (this.z3) {
         var2.l6("filterUnique", this.z3 ? "1" : "0");
      }

      if (this.m1 != l6) {
         var2.l6("view", o9z.n5(this.m1));
      }

      if (!this.k7) {
         var2.l6("showRuler", this.k7 ? "1" : "0");
      }

      if (this.m3 != null) {
         var2.l6("topLeftCell", this.m3);
      }

      if (this.z8 != null) {
         this.z8.n5("ssml", var2, "pane");
      }

      if (this.j5 != null) {
         this.j5.n5("ssml", var2, "selection");
      }

      if (this.w1 != null) {
         this.w1.n5("ssml", var2, "rowBreaks");
      }

      if (this.r4 != null) {
         this.r4.n5("ssml", var2, "colBreaks");
      }

      if (this.c4 != null) {
         this.c4.n5("ssml", var2, "pageMargins");
      }

      if (this.y2 != null) {
         this.y2.n5("ssml", var2, "printOptions");
      }

      if (this.y1 != null) {
         this.y1.n5("ssml", var2, "pageSetup");
      }

      if (this.a0 != null) {
         this.a0.n5("ssml", var2, "headerFooter");
      }

      if (this.d2 != null) {
         this.d2.n5("ssml", var2, "autoFilter");
      }

      if (this.d5 != null) {
         this.d5.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s3;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(h3g var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long n5(h3g var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long l6(h3g var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(h3g var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(h3g var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean k5(h3g var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean u3(h3g var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean a6(h3g var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean u9(h3g var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean h0(h3g var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean c8(h3g var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean t2(h3g var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static boolean s7(h3g var0, boolean var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean x8(h3g var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static boolean n3(h3g var0, boolean var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static int n5(h3g var0, int var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static boolean y4(h3g var0, boolean var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static int l6(h3g var0, int var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static boolean e2(h3g var0, boolean var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String n5(h3g var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static c5r n5(h3g var0, c5r var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static t4w n5(h3g var0, t4w var1) {
      return var0.j5 = var1;
   }

   // $VF: synthetic method
   static h3v n5(h3g var0, h3v var1) {
      return var0.w1 = var1;
   }

   // $VF: synthetic method
   static h3v l6(h3g var0, h3v var1) {
      return var0.r4 = var1;
   }

   // $VF: synthetic method
   static q2r n5(h3g var0, q2r var1) {
      return var0.c4 = var1;
   }

   // $VF: synthetic method
   static i1l n5(h3g var0, i1l var1) {
      return var0.y2 = var1;
   }

   // $VF: synthetic method
   static a6f n5(h3g var0, a6f var1) {
      return var0.y1 = var1;
   }

   // $VF: synthetic method
   static t6r n5(h3g var0, t6r var1) {
      return var0.a0 = var1;
   }

   // $VF: synthetic method
   static b4o n5(h3g var0, b4o var1) {
      return var0.d2 = var1;
   }

   // $VF: synthetic method
   static l0k n5(h3g var0, l0k var1) {
      return var0.d5 = var1;
   }
}
