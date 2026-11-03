package com.aspose.slides;

class e9j {
   private com.aspose.slides.internal.z0k.n5 n5;
   private com.aspose.slides.internal.o9b.j5 l6 = new com.aspose.slides.internal.o9b.j5(0, 0);
   private com.aspose.slides.internal.o9b.p8 k5 = new com.aspose.slides.internal.o9b.p8(0, 0);

   public e9j(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1;
   }

   final void n5(com.aspose.slides.internal.k0r.z6z var1) {
      com.aspose.slides.internal.k0r.q9 var2 = new com.aspose.slides.internal.k0r.q9();
      var2.n5(this.n5, var1);
      this.l6 = new com.aspose.slides.internal.o9b.j5(var2.l6(), var2.k5());
      this.k5 = new com.aspose.slides.internal.o9b.p8(var2.u3(), var2.a6());
   }

   final com.aspose.slides.internal.o9b.j5 n5(com.aspose.slides.internal.o9b.j5 var1) {
      return new com.aspose.slides.internal.o9b.j5(this.l6.n5() + var1.n5(), this.l6.l6() + var1.l6());
   }
}
