package com.aspose.slides.internal.k4y;

public class y8s extends b3 {
   private long l6;
   private long k5;
   private int u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private int c8;
   private int t2;
   private long s7;
   public static final int n5 = f5m.n5("default");
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "paperSize", "firstPageNumber", "orientation", "blackAndWhite", "draft", "useFirstPageNumber", "horizontalDpi", "verticalDpi", "copies"
   );

   public y8s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y8s$1 var2 = new y8s$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public y8s() {
      this.l6();
   }

   private void l6() {
      this.l6 = 1L;
      this.k5 = 1L;
      this.u3 = n5;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
      this.c8 = 600;
      this.t2 = 600;
      this.s7 = 1L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.l6 & 4294967295L) != 1L) {
         var2.l6("paperSize", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if ((this.k5 & 4294967295L) != 1L) {
         var2.l6("firstPageNumber", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (this.u3 != n5) {
         var2.l6("orientation", f5m.n5(this.u3));
      }

      if (this.a6) {
         var2.l6("blackAndWhite", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("draft", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("useFirstPageNumber", this.h0 ? "1" : "0");
      }

      if (this.c8 != 600) {
         var2.l6("horizontalDpi", com.aspose.slides.ms.System.Xml.f4.n5(this.c8));
      }

      if (this.t2 != 600) {
         var2.l6("verticalDpi", com.aspose.slides.ms.System.Xml.f4.n5(this.t2));
      }

      if ((this.s7 & 4294967295L) != 1L) {
         var2.l6("copies", com.aspose.slides.ms.System.Xml.f4.l6(this.s7));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return x8;
   }

   // $VF: synthetic method
   static long n5(y8s var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long l6(y8s var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(y8s var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(y8s var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(y8s var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean k5(y8s var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int l6(y8s var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int k5(y8s var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static long k5(y8s var0, long var1) {
      return var0.s7 = var1;
   }
}
