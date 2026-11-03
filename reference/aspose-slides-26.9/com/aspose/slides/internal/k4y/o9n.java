package com.aspose.slides.internal.k4y;

public class o9n extends b3 {
   private long l6;
   private com.aspose.slides.ms.System.o0 k5 = new com.aspose.slides.ms.System.o0();
   public static final com.aspose.slides.ms.System.o0 n5 = com.aspose.slides.ms.System.o0.n5.k5();
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("id", "creationId");

   public o9n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      o9n$1 var2 = new o9n$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public o9n() {
      this.k5();
   }

   private void k5() {
      n5.k5(this.k5);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      if (com.aspose.slides.ms.System.o0.l6(this.k5, n5)) {
         var2.l6(
            "creationId", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.k5.k5())), "}"})
         );
      }

      var2.s7();
   }

   public final long n5() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return u3;
   }

   // $VF: synthetic method
   static long n5(o9n var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(o9n var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.k5 = var1;
   }
}
