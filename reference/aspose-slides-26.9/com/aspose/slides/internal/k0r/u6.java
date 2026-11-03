package com.aspose.slides.internal.k0r;

public class u6 extends e6r {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private long h0;
   private long c8;
   private int t2;
   private short s7;
   private boolean n3;
   private boolean y4;
   private boolean e2;
   private boolean t9;

   public u6() {
      this.w1().n5((byte)1);
      this.w1().n5((short)0);
      this.w1().n5(1001);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      this.l6 = var1.m3();
      this.k5 = var1.m3();
      this.u3 = var1.m3();
      this.a6 = var1.m3();
      this.u9 = var1.m3();
      this.h0 = var1.c4();
      this.c8 = var1.c4();
      this.t2 = var1.r4();
      this.s7 = var1.k7();
      this.n3 = (var1.z1() & 255) == 1;
      this.y4 = (var1.z1() & 255) == 1;
      this.e2 = (var1.z1() & 255) == 1;
      this.t9 = (var1.z1() & 255) == 1;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.l6(this.n5);
      var1.l6(this.l6);
      var1.l6(this.k5);
      var1.l6(this.u3);
      var1.l6(this.a6);
      var1.l6(this.u9);
      var1.n5(this.h0 & 4294967295L);
      var1.n5(this.c8 & 4294967295L);
      var1.n5(com.aspose.slides.internal.n8e.v4.n5(this.t2));
      var1.n5(this.s7);
      var1.n5((byte)(this.n3 ? 1 : 0));
      var1.n5((byte)(this.y4 ? 1 : 0));
      var1.n5((byte)(this.e2 ? 1 : 0));
      var1.n5((byte)(this.t9 ? 1 : 0));
   }

   @Override
   public int n5() {
      return 40;
   }

   public final com.aspose.slides.internal.o9b.p8 l6() {
      return new com.aspose.slides.internal.o9b.p8(this.n5, this.l6);
   }

   public final void n5(com.aspose.slides.internal.o9b.p8 var1) {
      this.n5 = var1.l6();
      this.l6 = var1.k5();
   }

   public final com.aspose.slides.internal.o9b.p8 k5() {
      return new com.aspose.slides.internal.o9b.p8(this.k5, this.u3);
   }

   public final void l6(com.aspose.slides.internal.o9b.p8 var1) {
      this.k5 = var1.l6();
      this.u3 = var1.k5();
   }

   public final com.aspose.slides.internal.o9b.p8 u3() {
      return new com.aspose.slides.internal.o9b.p8(this.a6, this.u9);
   }

   public final void k5(com.aspose.slides.internal.o9b.p8 var1) {
      this.a6 = var1.l6();
      this.u9 = var1.k5();
   }

   public final long a6() {
      return this.h0;
   }

   public final void n5(long var1) {
      this.h0 = var1;
   }

   public final long u9() {
      return this.c8;
   }

   public final void l6(long var1) {
      this.c8 = var1;
   }

   public final int h0() {
      return this.t2;
   }

   public final void n5(int var1) {
      this.t2 = var1;
   }

   public final int c8() {
      return this.s7;
   }

   public final void l6(int var1) {
      this.s7 = (short)var1;
   }

   public final boolean t2() {
      return this.n3;
   }

   public final void n5(boolean var1) {
      this.n3 = var1;
   }

   public final boolean s7() {
      return this.y4;
   }

   public final void l6(boolean var1) {
      this.y4 = var1;
   }

   public final boolean x8() {
      return this.e2;
   }

   public final void k5(boolean var1) {
      this.e2 = var1;
   }

   public final boolean n3() {
      return this.t9;
   }

   public final void u3(boolean var1) {
      this.t9 = var1;
   }
}
