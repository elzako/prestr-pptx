package com.aspose.slides.internal.k4y;

public class h1v extends b3 {
   private long n5;
   private long l6;
   private double k5;
   private long u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private byte t2;
   private boolean s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "min", "max", "width", "style", "hidden", "bestFit", "customWidth", "phonetic", "outlineLevel", "collapsed"
   );

   public h1v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      h1v$1 var2 = new h1v$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public h1v() {
      this.h0();
   }

   private void h0() {
      this.k5 = Double.NaN;
      this.u3 = 0L;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
      this.t2 = 0;
      this.s7 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("min", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.l6("max", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      if (!com.aspose.slides.ms.System.d2.k5(this.k5)) {
         var2.l6("width", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      if ((this.u3 & 4294967295L) != 0L) {
         var2.l6("style", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if (this.a6) {
         var2.l6("hidden", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("bestFit", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("customWidth", this.h0 ? "1" : "0");
      }

      if (this.c8) {
         var2.l6("phonetic", this.c8 ? "1" : "0");
      }

      if ((this.t2 & 255) != 0) {
         var2.l6("outlineLevel", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      if (this.s7) {
         var2.l6("collapsed", this.s7 ? "1" : "0");
      }

      var2.s7();
   }

   public final long n5() {
      return this.n5;
   }

   public final long l6() {
      return this.l6;
   }

   public final double k5() {
      return this.k5;
   }

   public final boolean u3() {
      return this.a6;
   }

   public final boolean a6() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return x8;
   }

   // $VF: synthetic method
   static long n5(h1v var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(h1v var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double n5(h1v var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long k5(h1v var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(h1v var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(h1v var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean k5(h1v var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean u3(h1v var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static byte n5(h1v var0, byte var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean a6(h1v var0, boolean var1) {
      return var0.s7 = var1;
   }
}
