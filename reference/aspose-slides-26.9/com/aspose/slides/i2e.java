package com.aspose.slides;

class i2e implements x4j {
   private com.aspose.slides.internal.o9b.t4 n5;
   private com.aspose.slides.internal.o9b.t4 l6;
   private com.aspose.slides.internal.o9b.p8 k5 = new com.aspose.slides.internal.o9b.p8();
   private boolean u3;

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

   public final com.aspose.slides.internal.o9b.p8 k5() {
      return this.k5.u3();
   }

   public final void n5(com.aspose.slides.internal.o9b.p8 var1) {
      this.k5 = var1.u3();
   }

   public final boolean u3() {
      return this.u3;
   }

   public final void n5(boolean var1) {
      this.u3 = var1;
   }

   @Override
   public final void n5(float var1, com.aspose.slides.internal.o9b.z1 var2) {
      var2.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      com.aspose.slides.internal.o9b.j5 var3 = new com.aspose.slides.internal.o9b.j5(0, 0);
      var3.n5(-com.aspose.slides.internal.v6g.k5.u3(var1 * this.k5().l6(), 13));
      var3.l6(-com.aspose.slides.internal.v6g.k5.u3(var1 * this.k5().k5(), 13));
      if (this.n5() != null) {
         if (this.u3()) {
            var2.l6(this.n5(), 0, 0);
         } else {
            var2.l6(this.n5(), var3.n5(), var3.l6());
         }
      }

      var2.l6(this.l6(), var3.n5() + this.k5().l6(), var3.l6() + this.k5().k5());
   }
}
