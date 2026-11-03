package com.aspose.slides.internal.k4y;

public class q8e extends b3 {
   private byte u3;
   private byte a6;
   private byte u9;
   private long h0;
   private boolean c8;
   private j9y t2;
   public static final byte n5 = y6.n5("obj");
   public static final byte l6 = q1.n5("horz");
   public static final byte k5 = d6.n5("full");
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9("type", "orient", "sz", "idx", "hasCustomPrompt", "extLst");

   public q8e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      q8e$1 var2 = new q8e$1(this);
      n5(var1, var2);
      n5(var1, new q8e$2(this, var1));
   }

   public q8e() {
      this.c8();
   }

   private void c8() {
      this.u3 = n5;
      this.a6 = l6;
      this.u9 = k5;
      this.h0 = 0L;
      this.c8 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.u3 != n5) {
         var2.l6("type", y6.n5(this.u3));
      }

      if (this.a6 != l6) {
         var2.l6("orient", q1.n5(this.a6));
      }

      if (this.u9 != k5) {
         var2.l6("sz", d6.n5(this.u9));
      }

      if ((this.h0 & 4294967295L) != 0L) {
         var2.l6("idx", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if (this.c8) {
         var2.l6("hasCustomPrompt", this.c8 ? "1" : "0");
      }

      if (this.t2 != null) {
         this.t2.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.t2 = (j9y)var1;
   }

   public final byte n5() {
      return this.u3;
   }

   public final void n5(byte var1) {
      this.u3 = var1;
   }

   public final byte l6() {
      return this.a6;
   }

   public final void l6(byte var1) {
      this.a6 = var1;
   }

   public final byte k5() {
      return this.u9;
   }

   public final void k5(byte var1) {
      this.u9 = var1;
   }

   public final long u3() {
      return this.h0;
   }

   public final void n5(long var1) {
      this.h0 = var1;
   }

   public final boolean a6() {
      return this.c8;
   }

   public final void n5(boolean var1) {
      this.c8 = var1;
   }

   public final x8 u9() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return s7;
   }

   // $VF: synthetic method
   static byte n5(q8e var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static byte l6(q8e var0, byte var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static byte k5(q8e var0, byte var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long n5(q8e var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean n5(q8e var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static j9y n5(q8e var0, j9y var1) {
      return var0.t2 = var1;
   }
}
