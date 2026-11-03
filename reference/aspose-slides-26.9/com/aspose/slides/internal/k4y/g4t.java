package com.aspose.slides.internal.k4y;

public class g4t extends b3 {
   private int n5;
   private int l6;
   private long k5;
   private byte u3;
   private long a6;
   private int u9;
   private byte h0;
   private byte c8;
   private long t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "horizontal", "vertical", "textRotation", "wrapText", "indent", "relativeIndent", "justifyLastLine", "shrinkToFit", "readingOrder"
   );

   public g4t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.x8();
      g4t$1 var2 = new g4t$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public g4t() {
      this.x8();
   }

   private void x8() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 4294967295L;
      this.u3 = -1;
      this.a6 = 4294967295L;
      this.u9 = 0;
      this.h0 = -1;
      this.c8 = -1;
      this.t2 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("horizontal", r6g.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("vertical", l4a.n5(this.l6));
      }

      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("textRotation", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (this.u3 != -1) {
         var2.l6("wrapText", this.u3 == 1 ? "1" : "0");
      }

      if ((this.a6 & 4294967295L) != 4294967295L) {
         var2.l6("indent", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("relativeIndent", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      }

      if (this.h0 != -1) {
         var2.l6("justifyLastLine", this.h0 == 1 ? "1" : "0");
      }

      if (this.c8 != -1) {
         var2.l6("shrinkToFit", this.c8 == 1 ? "1" : "0");
      }

      if ((this.t2 & 4294967295L) != 4294967295L) {
         var2.l6("readingOrder", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      var2.s7();
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final byte u3() {
      return this.u3;
   }

   public final void n5(byte var1) {
      this.u3 = var1;
   }

   public final long a6() {
      return this.a6;
   }

   public final void l6(long var1) {
      this.a6 = var1;
   }

   public final int u9() {
      return this.u9;
   }

   public final void k5(int var1) {
      this.u9 = var1;
   }

   public final byte h0() {
      return this.h0;
   }

   public final void l6(byte var1) {
      this.h0 = var1;
   }

   public final byte c8() {
      return this.c8;
   }

   public final void k5(byte var1) {
      this.c8 = var1;
   }

   public final long t2() {
      return this.t2;
   }

   public final void k5(long var1) {
      this.t2 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return s7;
   }

   // $VF: synthetic method
   static int n5(g4t var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(g4t var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(g4t var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte n5(g4t var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long l6(g4t var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(g4t var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static byte l6(g4t var0, byte var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static byte k5(g4t var0, byte var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long k5(g4t var0, long var1) {
      return var0.t2 = var1;
   }
}
