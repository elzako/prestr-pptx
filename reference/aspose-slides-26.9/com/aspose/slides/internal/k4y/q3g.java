package com.aspose.slides.internal.k4y;

public class q3g extends b3 {
   private long l6;
   private com.aspose.slides.ms.System.j5 k5 = new com.aspose.slides.ms.System.j5();
   private long u3;
   private s2b a6;
   private String u9;
   private j9y h0;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9("authorId", "dt", "idx", "pos", "text", "extLst");

   public q3g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      q3g$1 var2 = new q3g$1(this);
      n5(var1, var2);
      n5(var1, new q3g$2(this, var1));
   }

   public q3g() {
      this.c8();
      this.a6 = new s2b();
   }

   private void c8() {
      n5.u3(this.k5);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("authorId", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      if (com.aspose.slides.ms.System.j5.c8(this.k5, n5)) {
         var2.l6("dt", com.aspose.slides.ms.System.Xml.f4.n5(this.k5.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      var2.l6("idx", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      this.a6.n5("p", var2, "pos");
      this.n5("p", var2, "text", this.u9, false);
      if (this.h0 != null) {
         this.h0.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.h0 = (j9y)var1;
   }

   public final long n5() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.ms.System.j5 l6() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.k5);
   }

   public final long k5() {
      return this.u3;
   }

   public final void l6(long var1) {
      this.u3 = var1;
   }

   public final s2b u3() {
      return this.a6;
   }

   public final String a6() {
      return this.u9;
   }

   public final void n5(String var1) {
      this.u9 = var1;
   }

   public final x8 u9() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return c8;
   }

   // $VF: synthetic method
   static long n5(q3g var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(q3g var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static long l6(q3g var0, long var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static s2b n5(q3g var0, s2b var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String n5(q3g var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String l6(q3g var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static j9y n5(q3g var0, j9y var1) {
      return var0.h0 = var1;
   }
}
