package com.aspose.slides;

class x1z implements x4j {
   private com.aspose.slides.internal.o9b.t4 n5;
   private com.aspose.slides.internal.o9b.t4 l6;
   private com.aspose.slides.internal.w0.t4 k5 = new com.aspose.slides.internal.w0.t4();

   public final com.aspose.slides.internal.o9b.t4 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.o9b.t4 var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.o9b.t4 l6() {
      return this.l6;
   }

   public final void l6(com.aspose.slides.internal.o9b.t4 var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.w0.t4 k5() {
      return this.k5.n5();
   }

   public final void n5(com.aspose.slides.internal.w0.t4 var1) {
      this.k5 = var1.n5();
   }

   @Override
   public final void n5(float var1, com.aspose.slides.internal.o9b.z1 var2) {
      var2.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var2.l6(this.n5(), 0, 0);
      if (this.l6() != null) {
         int var3 = com.aspose.slides.internal.v6g.k5.u3(var1 * this.k5().k5, 13);
         int var4 = com.aspose.slides.internal.v6g.k5.u3(var1 * this.k5().u3, 13);
         var2.l6(this.l6(), var3, var4);
      }
   }
}
