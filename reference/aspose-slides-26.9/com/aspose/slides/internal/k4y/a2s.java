package com.aspose.slides.internal.k4y;

public class a2s extends b3 {
   private long k5;
   private int u3;
   private boolean a6;
   private int u9;
   private boolean h0;
   private long c8;
   private double t2;
   private boolean s7;
   private boolean x8;
   private boolean n3;
   private boolean y4;
   private long e2;
   private byte t9;
   public static final int n5 = z2z.n5("auto");
   public static final int l6 = k5e.n5("A1");
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "calcId",
      "calcMode",
      "fullCalcOnLoad",
      "refMode",
      "iterate",
      "iterateCount",
      "iterateDelta",
      "fullPrecision",
      "calcCompleted",
      "calcOnSave",
      "concurrentCalc",
      "concurrentManualCount",
      "forceFullCalc"
   );

   public a2s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      a2s$1 var2 = new a2s$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public a2s() {
      this.l6();
   }

   private void l6() {
      this.k5 = 4294967295L;
      this.u3 = n5;
      this.a6 = false;
      this.u9 = l6;
      this.h0 = false;
      this.c8 = 100L;
      this.t2 = 0.001;
      this.s7 = true;
      this.x8 = true;
      this.n3 = true;
      this.y4 = true;
      this.e2 = 4294967295L;
      this.t9 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("calcId", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (this.u3 != n5) {
         var2.l6("calcMode", z2z.n5(this.u3));
      }

      if (this.a6) {
         var2.l6("fullCalcOnLoad", this.a6 ? "1" : "0");
      }

      if (this.u9 != l6) {
         var2.l6("refMode", k5e.n5(this.u9));
      }

      if (this.h0) {
         var2.l6("iterate", this.h0 ? "1" : "0");
      }

      if ((this.c8 & 4294967295L) != 100L) {
         var2.l6("iterateCount", com.aspose.slides.ms.System.Xml.f4.l6(this.c8));
      }

      if (this.t2 != 0.001) {
         var2.l6("iterateDelta", com.aspose.slides.ms.System.Xml.f4.n5(this.t2));
      }

      if (!this.s7) {
         var2.l6("fullPrecision", this.s7 ? "1" : "0");
      }

      if (!this.x8) {
         var2.l6("calcCompleted", this.x8 ? "1" : "0");
      }

      if (!this.n3) {
         var2.l6("calcOnSave", this.n3 ? "1" : "0");
      }

      if (!this.y4) {
         var2.l6("concurrentCalc", this.y4 ? "1" : "0");
      }

      if ((this.e2 & 4294967295L) != 4294967295L) {
         var2.l6("concurrentManualCount", com.aspose.slides.ms.System.Xml.f4.l6(this.e2));
      }

      if (this.t9 != -1) {
         var2.l6("forceFullCalc", this.t9 == 1 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return z1;
   }

   // $VF: synthetic method
   static long n5(a2s var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(a2s var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(a2s var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(a2s var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(a2s var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static long l6(a2s var0, long var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static double n5(a2s var0, double var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean k5(a2s var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean u3(a2s var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean a6(a2s var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean u9(a2s var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static long k5(a2s var0, long var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static byte n5(a2s var0, byte var1) {
      return var0.t9 = var1;
   }
}
