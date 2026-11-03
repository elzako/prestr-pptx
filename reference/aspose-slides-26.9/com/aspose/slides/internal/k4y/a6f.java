package com.aspose.slides.internal.k4y;

public class a6f extends b3 {
   private long a6;
   private long u9;
   private long h0;
   private long c8;
   private long t2;
   private int s7;
   private int x8;
   private boolean n3;
   private boolean y4;
   private boolean e2;
   private int t9;
   private boolean z1;
   private int t4;
   private long q0;
   private long z3;
   private long m1;
   private String k7;
   public static final int n5 = g1u.n5("downThenOver");
   public static final int l6 = t7t.n5("default");
   public static final int k5 = u0i.n5("none");
   public static final int u3 = a6b.n5("displayed");
   private static final com.aspose.slides.internal.v6g.u9 m3 = new com.aspose.slides.internal.v6g.u9(
      "paperSize",
      "scale",
      "firstPageNumber",
      "fitToWidth",
      "fitToHeight",
      "pageOrder",
      "orientation",
      "usePrinterDefaults",
      "blackAndWhite",
      "draft",
      "cellComments",
      "useFirstPageNumber",
      "errors",
      "horizontalDpi",
      "verticalDpi",
      "copies",
      "r:id"
   );

   public a6f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      a6f$1 var2 = new a6f$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public a6f() {
      this.l6();
   }

   private void l6() {
      this.a6 = 1L;
      this.u9 = 100L;
      this.h0 = 1L;
      this.c8 = 1L;
      this.t2 = 1L;
      this.s7 = n5;
      this.x8 = l6;
      this.n3 = true;
      this.y4 = false;
      this.e2 = false;
      this.t9 = k5;
      this.z1 = false;
      this.t4 = u3;
      this.q0 = 600L;
      this.z3 = 600L;
      this.m1 = 1L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.a6 & 4294967295L) != 1L) {
         var2.l6("paperSize", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      if ((this.u9 & 4294967295L) != 100L) {
         var2.l6("scale", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      if ((this.h0 & 4294967295L) != 1L) {
         var2.l6("firstPageNumber", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if ((this.c8 & 4294967295L) != 1L) {
         var2.l6("fitToWidth", com.aspose.slides.ms.System.Xml.f4.l6(this.c8));
      }

      if ((this.t2 & 4294967295L) != 1L) {
         var2.l6("fitToHeight", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      if (this.s7 != n5) {
         var2.l6("pageOrder", g1u.n5(this.s7));
      }

      if (this.x8 != l6) {
         var2.l6("orientation", t7t.n5(this.x8));
      }

      if (!this.n3) {
         var2.l6("usePrinterDefaults", this.n3 ? "1" : "0");
      }

      if (this.y4) {
         var2.l6("blackAndWhite", this.y4 ? "1" : "0");
      }

      if (this.e2) {
         var2.l6("draft", this.e2 ? "1" : "0");
      }

      if (this.t9 != k5) {
         var2.l6("cellComments", u0i.n5(this.t9));
      }

      if (this.z1) {
         var2.l6("useFirstPageNumber", this.z1 ? "1" : "0");
      }

      if (this.t4 != u3) {
         var2.l6("errors", a6b.n5(this.t4));
      }

      if ((this.q0 & 4294967295L) != 600L) {
         var2.l6("horizontalDpi", com.aspose.slides.ms.System.Xml.f4.l6(this.q0));
      }

      if ((this.z3 & 4294967295L) != 600L) {
         var2.l6("verticalDpi", com.aspose.slides.ms.System.Xml.f4.l6(this.z3));
      }

      if ((this.m1 & 4294967295L) != 1L) {
         var2.l6("copies", com.aspose.slides.ms.System.Xml.f4.l6(this.m1));
      }

      if (this.k7 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:id", this.k7);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return m3;
   }

   // $VF: synthetic method
   static long n5(a6f var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long l6(a6f var0, long var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long k5(a6f var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static long u3(a6f var0, long var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long a6(a6f var0, long var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int n5(a6f var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int l6(a6f var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean n5(a6f var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean l6(a6f var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean k5(a6f var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int k5(a6f var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean u3(a6f var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static int u3(a6f var0, int var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static long u9(a6f var0, long var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static long h0(a6f var0, long var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static long c8(a6f var0, long var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String n5(a6f var0, String var1) {
      return var0.k7 = var1;
   }
}
