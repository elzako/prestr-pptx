package com.aspose.slides.internal.k4y;

public class s4e extends b3 {
   private long n5;
   private double l6;
   private double k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private byte c8;
   private byte t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "baseColWidth", "defaultColWidth", "defaultRowHeight", "customHeight", "zeroHeight", "thickTop", "thickBottom", "outlineLevelRow", "outlineLevelCol"
   );

   public s4e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      s4e$1 var2 = new s4e$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public s4e() {
      this.u3();
   }

   private void u3() {
      this.n5 = 8L;
      this.l6 = Double.NaN;
      this.k5 = Double.NaN;
      this.u3 = false;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
      this.c8 = 0;
      this.t2 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 8L) {
         var2.l6("baseColWidth", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.l6)) {
         var2.l6("defaultColWidth", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      var2.l6("defaultRowHeight", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      if (this.u3) {
         var2.l6("customHeight", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("zeroHeight", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("thickTop", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("thickBottom", this.h0 ? "1" : "0");
      }

      if ((this.c8 & 255) != 0) {
         var2.l6("outlineLevelRow", com.aspose.slides.ms.System.Xml.f4.l6(this.c8));
      }

      if ((this.t2 & 255) != 0) {
         var2.l6("outlineLevelCol", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      var2.s7();
   }

   public final double n5() {
      return this.l6;
   }

   public final double l6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return s7;
   }

   // $VF: synthetic method
   static long n5(s4e var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double n5(s4e var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double l6(s4e var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(s4e var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean l6(s4e var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(s4e var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean u3(s4e var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static byte n5(s4e var0, byte var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static byte l6(s4e var0, byte var1) {
      return var0.t2 = var1;
   }
}
