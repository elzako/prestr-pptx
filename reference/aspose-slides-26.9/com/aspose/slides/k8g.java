package com.aspose.slides;

class k8g {
   private t6k n5;
   private t6k l6;
   private t6k k5;

   public k8g(t6k var1, t6k var2, t6k var3) {
      this.n5(var1);
      this.l6(var2);
      this.k5(var3);
   }

   public final com.aspose.slides.internal.s6.v3[] n5(com.aspose.slides.internal.s6.s0 var1) {
      com.aspose.slides.internal.s6.v3 var2 = this.n5().l6().h0();
      com.aspose.slides.internal.s6.v3 var3 = this.l6().l6().h0();
      com.aspose.slides.internal.s6.v3 var4 = this.k5().l6().h0();
      return new com.aspose.slides.internal.s6.v3[]{
         new com.aspose.slides.internal.s6.v3(var2.n5() - var1.n5(), var1.l6() - var2.l6(), var2.k5()),
         new com.aspose.slides.internal.s6.v3(var3.n5() - var1.n5(), var1.l6() - var3.l6(), var3.k5()),
         new com.aspose.slides.internal.s6.v3(var4.n5() - var1.n5(), var1.l6() - var4.l6(), var4.k5())
      };
   }

   public final t6k n5() {
      return this.n5;
   }

   private void n5(t6k var1) {
      this.n5 = var1;
   }

   public final t6k l6() {
      return this.l6;
   }

   private void l6(t6k var1) {
      this.l6 = var1;
   }

   public final t6k k5() {
      return this.k5;
   }

   private void k5(t6k var1) {
      this.k5 = var1;
   }

   public final float u3() {
      return this.n5().n5();
   }

   public final float a6() {
      return this.l6().n5();
   }

   public final float u9() {
      return this.k5().n5();
   }

   public final int[] h0() {
      return new int[]{0, 1, 2};
   }

   public final com.aspose.slides.internal.s6.v3 c8() {
      com.aspose.slides.internal.s6.v3 var1 = this.n5().l6().h0();
      com.aspose.slides.internal.s6.v3 var2 = this.l6().l6().h0();
      com.aspose.slides.internal.s6.v3 var3 = this.k5().l6().h0();
      return com.aspose.slides.internal.s6.v3.u3(com.aspose.slides.internal.s6.v3.l6(var3, var1).h0(), com.aspose.slides.internal.s6.v3.l6(var3, var2).h0())
         .u9();
   }

   public final float t2() {
      return com.aspose.slides.ms.System.q1.n5((float)(this.u3()), (float)(com.aspose.slides.ms.System.q1.n5((float)(this.a6()), (float)(this.u9()))));
   }

   public final float s7() {
      return com.aspose.slides.ms.System.q1.l6(this.u3(), com.aspose.slides.ms.System.q1.l6(this.a6(), this.u9()));
   }
}
