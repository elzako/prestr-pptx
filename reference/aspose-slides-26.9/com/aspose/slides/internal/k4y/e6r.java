package com.aspose.slides.internal.k4y;

public class e6r extends b3 {
   private long n5;
   private long l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("id", "idx");

   public e6r(com.aspose.slides.ms.System.Xml.c7 var1) {
      e6r$1 var2 = new e6r$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public e6r() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.l6("idx", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      var2.s7();
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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static long n5(e6r var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(e6r var0, long var1) {
      return var0.l6 = var1;
   }
}
