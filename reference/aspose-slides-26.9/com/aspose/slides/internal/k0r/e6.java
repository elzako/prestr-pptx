package com.aspose.slides.internal.k0r;

public final class e6 extends v2 {
   private long n5;
   private String l6;
   private com.aspose.slides.ms.System.o5<com.aspose.slides.ms.System.o0> k5 = new com.aspose.slides.ms.System.o5<>();
   private com.aspose.slides.ms.System.o5<Long> u3 = new com.aspose.slides.ms.System.o5<>();
   private com.aspose.slides.ms.System.o5<Long> a6 = new com.aspose.slides.ms.System.o5<>();

   @Override
   public com.aspose.slides.ms.System.o0 n5() {
      return e7.n5;
   }

   public final long l6() {
      long var1 = com.aspose.slides.internal.l7h.j5.z1().u3(this.a6()).length + 1 & 4294967295L;
      return this.k5.l6() && this.u3.l6() && this.a6.l6() ? (var1 & 4294967295L) + 24L & 4294967295L : var1;
   }

   public final String a6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   @Override
   public long k5() {
      return this.l6();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.n5(this.l6(var1));
      int var2 = com.aspose.slides.internal.l7h.j5.z1().u3(this.a6()).length + 1;
      if ((this.n5 & 4294967295L) == var2 + 24) {
         this.k5 = new com.aspose.slides.ms.System.o5<>(new com.aspose.slides.ms.System.o0(var1.c8(16)));
         this.u3 = new com.aspose.slides.ms.System.o5<>(var1.c4());
         this.a6 = new com.aspose.slides.ms.System.o5<>(var1.c4());
      } else if ((this.n5 & 4294967295L) > var2) {
         var1.c8((int)this.n5 - var2);
      }
   }

   private String l6(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5();
      char var3 = var1.q0();

      char var4;
      do {
         if (var3 != 0) {
            var2.n5(var3);
         }

         var4 = var3;
         var3 = var1.q0();
      } while (var4 != 0 || var3 != 0);

      return var2.toString();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.l6());
      var1.n5(com.aspose.slides.internal.l7h.j5.z1().u3(this.a6()));
      var1.n5((byte)0);
      if (this.k5.l6() && this.u3.l6() && this.a6.l6()) {
         var1.n5(this.k5.n5().n5());
         var1.n5(this.u3.n5());
         var1.n5(this.a6.n5());
      }
   }

   @Override
   public String u3() {
      return this.a6();
   }
}
