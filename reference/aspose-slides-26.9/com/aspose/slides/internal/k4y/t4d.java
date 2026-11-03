package com.aspose.slides.internal.k4y;

public class t4d extends b3 {
   private long n5;
   private long l6;
   private long k5;
   private long u3;
   private long a6;
   private boolean u9;
   private boolean h0;
   private byte c8;
   private byte t2;
   private byte s7;
   private byte x8;
   private byte n3;
   private byte y4;
   private g4t e2;
   private b1w t9;
   private l0k z1;
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
      "numFmtId",
      "fontId",
      "fillId",
      "borderId",
      "xfId",
      "quotePrefix",
      "pivotButton",
      "applyNumberFormat",
      "applyFont",
      "applyFill",
      "applyBorder",
      "applyAlignment",
      "applyProtection",
      "alignment",
      "protection",
      "extLst"
   );

   public t4d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.q0();
      t4d$1 var2 = new t4d$1(this);
      n5(var1, var2);
      n5(var1, new t4d$2(this, var1));
   }

   public t4d() {
      this.q0();
   }

   private void q0() {
      this.n5 = 4294967295L;
      this.l6 = 4294967295L;
      this.k5 = 4294967295L;
      this.u3 = 4294967295L;
      this.a6 = 4294967295L;
      this.u9 = false;
      this.h0 = false;
      this.c8 = -1;
      this.t2 = -1;
      this.s7 = -1;
      this.x8 = -1;
      this.n3 = -1;
      this.y4 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("numFmtId", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("fontId", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("fillId", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("borderId", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      if ((this.a6 & 4294967295L) != 4294967295L) {
         var2.l6("xfId", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      if (this.u9) {
         var2.l6("quotePrefix", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("pivotButton", this.h0 ? "1" : "0");
      }

      if (this.c8 != -1) {
         var2.l6("applyNumberFormat", this.c8 == 1 ? "1" : "0");
      }

      if (this.t2 != -1) {
         var2.l6("applyFont", this.t2 == 1 ? "1" : "0");
      }

      if (this.s7 != -1) {
         var2.l6("applyFill", this.s7 == 1 ? "1" : "0");
      }

      if (this.x8 != -1) {
         var2.l6("applyBorder", this.x8 == 1 ? "1" : "0");
      }

      if (this.n3 != -1) {
         var2.l6("applyAlignment", this.n3 == 1 ? "1" : "0");
      }

      if (this.y4 != -1) {
         var2.l6("applyProtection", this.y4 == 1 ? "1" : "0");
      }

      if (this.e2 != null) {
         this.e2.n5("ssml", var2, "alignment");
      }

      if (this.t9 != null) {
         this.t9.n5("ssml", var2, "protection");
      }

      if (this.z1 != null) {
         this.z1.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(g4t var1) {
      this.e2 = var1;
   }

   public final void n5(b1w var1) {
      this.t9 = var1;
   }

   public final void n5(l0k var1) {
      this.z1 = var1;
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void k5(long var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void u3(long var1) {
      this.u3 = var1;
   }

   public final long a6() {
      return this.a6;
   }

   public final void a6(long var1) {
      this.a6 = var1;
   }

   public final boolean u9() {
      return this.u9;
   }

   public final void n5(boolean var1) {
      this.u9 = var1;
   }

   public final boolean h0() {
      return this.h0;
   }

   public final void l6(boolean var1) {
      this.h0 = var1;
   }

   public final byte c8() {
      return this.c8;
   }

   public final void n5(byte var1) {
      this.c8 = var1;
   }

   public final byte t2() {
      return this.t2;
   }

   public final void l6(byte var1) {
      this.t2 = var1;
   }

   public final byte s7() {
      return this.s7;
   }

   public final void k5(byte var1) {
      this.s7 = var1;
   }

   public final byte x8() {
      return this.x8;
   }

   public final void u3(byte var1) {
      this.x8 = var1;
   }

   public final byte n3() {
      return this.n3;
   }

   public final void a6(byte var1) {
      this.n3 = var1;
   }

   public final byte y4() {
      return this.y4;
   }

   public final void u9(byte var1) {
      this.y4 = var1;
   }

   public final g4t e2() {
      return this.e2;
   }

   public final b1w t9() {
      return this.t9;
   }

   public final l0k z1() {
      return this.z1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t4() {
      return t4;
   }

   // $VF: synthetic method
   static long n5(t4d var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(t4d var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long k5(t4d var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long u3(t4d var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long a6(t4d var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(t4d var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(t4d var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static byte n5(t4d var0, byte var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static byte l6(t4d var0, byte var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static byte k5(t4d var0, byte var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static byte u3(t4d var0, byte var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static byte a6(t4d var0, byte var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static byte u9(t4d var0, byte var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static g4t n5(t4d var0, g4t var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static b1w n5(t4d var0, b1w var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static l0k n5(t4d var0, l0k var1) {
      return var0.z1 = var1;
   }
}
