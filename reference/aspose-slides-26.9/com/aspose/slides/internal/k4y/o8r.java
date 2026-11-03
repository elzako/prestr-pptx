package com.aspose.slides.internal.k4y;

public class o8r extends b3 {
   private long n5;
   private String l6;
   private String k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("idx", "formatCode", "v");

   public o8r(com.aspose.slides.ms.System.Xml.c7 var1) {
      o8r$1 var2 = new o8r$1(this);
      n5(var1, var2);
      n5(var1, new o8r$2(this, var1));
   }

   public o8r() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("idx", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6 != null) {
         var2.l6("formatCode", this.l6);
      }

      this.n5("c", var2, "v", this.k5, false);
      var2.s7();
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static long n5(o8r var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(o8r var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(o8r var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(o8r var0) {
      return var0.k5;
   }
}
