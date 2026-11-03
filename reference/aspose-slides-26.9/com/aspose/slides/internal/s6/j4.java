package com.aspose.slides.internal.s6;

public final class j4 {
   private double n5;
   private double l6;
   private h2 k5;
   private com.aspose.slides.internal.o9b.w1 u3 = new com.aspose.slides.internal.o9b.w1();
   private a0 a6 = new a0();
   private j4[] u9;
   private boolean h0;
   private t9 c8;

   public final double n5() {
      return this.n5;
   }

   public final double l6() {
      return this.l6;
   }

   public final a0 k5() {
      return this.a6;
   }

   public final h2 u3() {
      return this.k5;
   }

   public final t9 a6() {
      return this.c8;
   }

   public j4(double var1, double var3) {
      this.n5 = var1;
      this.l6 = var3;
      this.a6 = new a0(var1, var3);
      this.u3 = new com.aspose.slides.internal.o9b.w1((float)var1, (float)var3);
      this.k5 = new h2();
      this.u9 = null;
      this.h0 = false;
      this.c8 = new t9();
   }

   public j4(j4 var1) {
      this(var1.n5(), var1.l6());
   }

   public final boolean n5(j4 var1) {
      return t4.n5(this.n5() - var1.n5(), 1.0E-5F) && t4.n5(this.l6() - var1.l6(), 1.0E-5F);
   }

   final j4[] u9() {
      return this.u9;
   }

   final void n5(j4[] var1) {
      this.u9 = var1;
   }

   final boolean h0() {
      return this.h0;
   }

   final void n5(boolean var1) {
      this.h0 = var1;
   }
}
