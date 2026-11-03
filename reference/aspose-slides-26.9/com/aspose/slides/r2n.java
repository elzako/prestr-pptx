package com.aspose.slides;

final class r2n extends i8 implements x4j {
   private final s7k l6;
   private com.aspose.slides.internal.o9b.t4 k5;

   public r2n(com.aspose.slides.internal.o9b.p8 var1, int var2) {
      super(var1.u3());
      float var3 = com.aspose.slides.ms.System.q1.n5(var1.l6(), var1.k5());
      d2k var4 = new d2k(var3, var3);
      this.l6 = new s7k(var2);
      this.l6.n5(d2k.n5(new d2k(var1.l6(), var1.k5()), 2).u3(), var4.u3());
   }

   public final com.aspose.slides.internal.o9b.t4 l6() {
      return this.k5;
   }

   public final void l6(com.aspose.slides.internal.o9b.t4 var1) {
      this.k5 = var1;
   }

   @Override
   public final void n5(float var1, com.aspose.slides.internal.o9b.z1 var2) {
      this.l6.n5(var1);
      if (this.n5() != null) {
         var2.l6(this.n5(), 0, 0);
      } else {
         var2.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      }

      var2.n5(this.l6.n5, 0);
      var2.l6(this.l6(), 0, 0);
      var2.u3();
   }
}
