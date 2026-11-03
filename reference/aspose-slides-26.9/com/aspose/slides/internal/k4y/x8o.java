package com.aspose.slides.internal.k4y;

public class x8o extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private long u3;
   private long a6;
   private String u9;
   private String h0;
   private String c8;
   private long t2;
   private String s7;
   private long x8;
   private String n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "cryptProviderType",
      "cryptAlgorithmClass",
      "cryptAlgorithmType",
      "cryptAlgorithmSid",
      "spinCount",
      "saltData",
      "hashData",
      "cryptProvider",
      "algIdExt",
      "algIdExtSource",
      "cryptProviderTypeExt",
      "cryptProviderTypeExtSource"
   );

   public x8o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      x8o$1 var2 = new x8o$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x8o() {
      this.c8();
   }

   private void c8() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.t2 = 4294967295L;
      this.x8 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("cryptProviderType", o2f.n5(this.n5));
      var2.l6("cryptAlgorithmClass", f5l.n5(this.l6));
      var2.l6("cryptAlgorithmType", b4t.n5(this.k5));
      var2.l6("cryptAlgorithmSid", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      var2.l6("spinCount", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      var2.l6("saltData", this.u9);
      var2.l6("hashData", this.h0);
      if (this.c8 != null) {
         var2.l6("cryptProvider", this.c8);
      }

      if ((this.t2 & 4294967295L) != 4294967295L) {
         var2.l6("algIdExt", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      if (this.s7 != null) {
         var2.l6("algIdExtSource", this.s7);
      }

      if ((this.x8 & 4294967295L) != 4294967295L) {
         var2.l6("cryptProviderTypeExt", com.aspose.slides.ms.System.Xml.f4.l6(this.x8));
      }

      if (this.n3 != null) {
         var2.l6("cryptProviderTypeExtSource", this.n3);
      }

      var2.s7();
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int n5() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final int l6() {
      return this.k5;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }

   public final long k5() {
      return this.u3;
   }

   public final void n5(long var1) {
      this.u3 = var1;
   }

   public final long u3() {
      return this.a6;
   }

   public final void l6(long var1) {
      this.a6 = var1;
   }

   public final String a6() {
      return this.u9;
   }

   public final void n5(String var1) {
      this.u9 = var1;
   }

   public final String u9() {
      return this.h0;
   }

   public final void l6(String var1) {
      this.h0 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return y4;
   }

   // $VF: synthetic method
   static int n5(x8o var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(x8o var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(x8o var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long n5(x8o var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long l6(x8o var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String n5(x8o var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String l6(x8o var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String k5(x8o var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long k5(x8o var0, long var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u3(x8o var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static long u3(x8o var0, long var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String a6(x8o var0, String var1) {
      return var0.n3 = var1;
   }
}
