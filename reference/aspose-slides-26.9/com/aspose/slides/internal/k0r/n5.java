package com.aspose.slides.internal.k0r;

public class n5 extends e6r {
   private m1 n5;
   private int l6;
   private long k5;
   private int u3;
   private short a6;
   private int u9;
   private byte h0;
   private byte c8;
   private byte t2;
   private byte s7;
   private byte n3;
   private byte y4;
   private byte e2;
   private byte t9;

   public n5() {
      this.w1().n5(4081);
      this.w1().n5((byte)1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = new m1(var1.c4());
      this.l6 = var1.m3();
      this.k5 = var1.c4();
      this.u3 = var1.m3();
      this.a6 = var1.k7();
      this.u9 = var1.r4();
      this.h0 = var1.z1();
      this.c8 = var1.z1();
      this.t2 = var1.z1();
      this.s7 = var1.z1();
      this.n3 = var1.z1();
      this.y4 = var1.z1();
      this.e2 = var1.z1();
      this.t9 = var1.z1();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5.k5() & 4294967295L);
      var1.l6(this.l6);
      var1.n5(this.k5 & 4294967295L);
      var1.l6(this.u3);
      var1.n5(this.a6);
      var1.n5(com.aspose.slides.internal.n8e.v4.n5(this.u9));
      var1.n5(this.h0);
      var1.n5(this.c8);
      var1.n5(this.t2);
      var1.n5(this.s7);
      var1.n5(this.n3);
      var1.n5(this.y4);
      var1.n5(this.e2);
      var1.n5(this.t9);
   }

   @Override
   public int n5() {
      return 28;
   }

   public final m1 l6() {
      return this.n5;
   }

   public final void n5(m1 var1) {
      this.n5 = var1;
   }

   public final int k5() {
      return this.l6;
   }

   public final boolean u3() {
      return this.k5(2);
   }

   public final void n5(boolean var1) {
      this.n5(var1, 2);
   }

   public final void l6(boolean var1) {
      this.n5(var1, 6);
   }

   public final void k5(boolean var1) {
      this.n5(var1, 8);
   }

   public final void u3(boolean var1) {
      this.n5(var1, 10);
   }

   public final boolean a6() {
      return this.k5(14);
   }

   public final void a6(boolean var1) {
      this.n5(var1, 14);
   }

   public final long u9() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final int h0() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final short c8() {
      return this.a6;
   }

   public final void n5(short var1) {
      this.a6 = var1;
   }

   public final void l6(int var1) {
      this.u9 = var1;
   }

   public final byte t2() {
      return this.h0;
   }

   public final void n5(byte var1) {
      this.h0 = var1;
   }

   public final byte s7() {
      return this.c8;
   }

   public final void l6(byte var1) {
      this.c8 = var1;
   }

   public final byte x8() {
      return this.t2;
   }

   public final void k5(byte var1) {
      this.t2 = var1;
   }

   public final byte n3() {
      return this.s7;
   }

   public final void u3(byte var1) {
      this.s7 = var1;
   }

   public final void a6(byte var1) {
      this.n3 = var1;
   }

   public final byte y4() {
      return this.y4;
   }

   public final void u9(byte var1) {
      this.y4 = var1;
   }

   private boolean k5(int var1) {
      return (this.l6 & 1 << var1) != 0;
   }

   private void n5(boolean var1, int var2) {
      if (var1) {
         this.l6 |= 1 << var2;
      } else {
         this.l6 &= ~(1 << var2);
      }
   }
}
