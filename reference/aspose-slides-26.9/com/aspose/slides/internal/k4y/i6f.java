package com.aspose.slides.internal.k4y;

public class i6f extends b3 {
   private String n5;
   private String l6;
   private long k5;
   private long u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "manifest:key-derivation-name", "manifest:salt", "manifest:iteration-count", "manifest:key-size"
   );

   public i6f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      i6f$1 var2 = new i6f$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public i6f() {
      this.u9();
   }

   private void u9() {
      this.u3 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("manifest:key-derivation-name", this.n5);
      var2.l6("manifest:salt", this.l6);
      var2.l6("manifest:iteration-count", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      if ((this.u3 & 4294967295L) != 4294967295L) {
         var2.l6("manifest:key-size", com.aspose.slides.ms.System.Xml.f4.l6(this.u3));
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final long u3() {
      return this.u3;
   }

   public final void l6(long var1) {
      this.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(i6f var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(i6f var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(i6f var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static long l6(i6f var0, long var1) {
      return var0.u3 = var1;
   }
}
