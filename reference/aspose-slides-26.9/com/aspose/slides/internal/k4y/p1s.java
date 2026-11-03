package com.aspose.slides.internal.k4y;

public class p1s extends b3 {
   private String n5;
   private boolean l6;
   private String k5;
   private com.aspose.slides.ms.System.o0 u3 = new com.aspose.slides.ms.System.o0();
   private long a6;
   private boolean u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "id", "enabled", "method", "siteId", "contentBits", "removed"
   );

   public p1s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      p1s$1 var2 = new p1s$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public p1s() {
      this.c8();
   }

   private void c8() {
      com.aspose.slides.ms.System.o0.n5.k5(this.u3);
      this.a6 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      com.aspose.slides.internal.f8y.n5.n5(this.n5 != null, "Required property \"Id\" is uninitialized.");
      var2.l6("id", this.n5);
      var2.l6("enabled", this.l6 ? "1" : "0");
      com.aspose.slides.internal.f8y.n5.n5(this.k5 != null, "Required property \"Method\" is uninitialized.");
      var2.l6("method", this.k5);
      var2.l6("siteId", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.Xml.f4.n5(this.u3.k5()), "}"}));
      if ((this.a6 & 4294967295L) != 4294967295L) {
         var2.l6("contentBits", com.aspose.slides.ms.System.Xml.f4.l6(this.a6));
      }

      var2.l6("removed", this.u9 ? "1" : "0");
      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.ms.System.o0 u3() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.u3);
   }

   public final long a6() {
      return this.a6;
   }

   public final void n5(long var1) {
      this.a6 = var1;
   }

   public final boolean u9() {
      return this.u9;
   }

   public final void l6(boolean var1) {
      this.u9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(p1s var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(p1s var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(p1s var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(p1s var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static long n5(p1s var0, long var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(p1s var0, boolean var1) {
      return var0.u9 = var1;
   }
}
