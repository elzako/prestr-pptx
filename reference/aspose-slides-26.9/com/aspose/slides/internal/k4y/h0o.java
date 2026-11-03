package com.aspose.slides.internal.k4y;

public class h0o extends b3 {
   private int l6;
   private int k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private String s7;
   private boolean x8;
   private int n3;
   private long y4;
   private n8v e2;
   private l0k t9;
   public static final int n5 = h2p.n5("normal");
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "field",
      "type",
      "dataOnly",
      "labelOnly",
      "grandRow",
      "grandCol",
      "cacheIndex",
      "outline",
      "offset",
      "collapsedLevelsAreSubtotals",
      "axis",
      "fieldPosition",
      "references",
      "extLst"
   );

   public h0o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      h0o$1 var2 = new h0o$1(this);
      n5(var1, var2);
      n5(var1, new h0o$2(this, var1));
   }

   public h0o() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.k5 = n5;
      this.u3 = true;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
      this.t2 = true;
      this.x8 = false;
      this.n3 = 0;
      this.y4 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != 0) {
         var2.l6("field", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (this.k5 != n5) {
         var2.l6("type", h2p.n5(this.k5));
      }

      if (!this.u3) {
         var2.l6("dataOnly", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("labelOnly", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("grandRow", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("grandCol", this.h0 ? "1" : "0");
      }

      if (this.c8) {
         var2.l6("cacheIndex", this.c8 ? "1" : "0");
      }

      if (!this.t2) {
         var2.l6("outline", this.t2 ? "1" : "0");
      }

      if (this.s7 != null) {
         var2.l6("offset", this.s7);
      }

      if (this.x8) {
         var2.l6("collapsedLevelsAreSubtotals", this.x8 ? "1" : "0");
      }

      if (this.n3 != 0) {
         var2.l6("axis", w7m.n5(this.n3));
      }

      if ((this.y4 & 4294967295L) != 4294967295L) {
         var2.l6("fieldPosition", com.aspose.slides.ms.System.Xml.f4.l6(this.y4));
      }

      if (this.e2 != null) {
         this.e2.n5("ssml", var2, "references");
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
   static int n5(h0o var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(h0o var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(h0o var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean l6(h0o var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(h0o var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean u3(h0o var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean a6(h0o var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean u9(h0o var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String n5(h0o var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean h0(h0o var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int k5(h0o var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static long n5(h0o var0, long var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static n8v n5(h0o var0, n8v var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static l0k n5(h0o var0, l0k var1) {
      return var0.t9 = var1;
   }
}
