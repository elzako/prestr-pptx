package com.aspose.slides.internal.b7s;

public class n3 {
   public int n5;
   public byte l6;
   private int k5;
   private int u3;
   private byte a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private byte x8;
   private int n3;
   private int y4;
   private int e2;
   private com.aspose.slides.internal.t7p.x8 t9;

   public n3() {
   }

   public n3(byte var1, byte var2, byte var3, byte var4, byte var5, byte var6) {
      this.a6 = var1;
      this.k5(var2);
      this.u9(var3);
      this.x8 = var4;
      this.l6(var5);
      this.n5(var6);
   }

   public final byte n5() {
      return (byte)(this.k5() & 15);
   }

   public final void n5(byte var1) {
      this.n5((byte)(this.k5() & 240 | var1 & 0xFF) & 255);
   }

   public final byte l6() {
      return (byte)(this.k5() >> 4);
   }

   public final void l6(byte var1) {
      this.n5((byte)(this.k5() | (var1 & 255) << 4) & 255);
   }

   public final int k5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final byte u3() {
      return (byte)((this.l6 & 255) >> 4);
   }

   public final void k5(byte var1) {
      this.l6 = (byte)(this.l6 & 0xFF | (var1 & 255) << 4);
   }

   public final int a6() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final byte u9() {
      return this.a6;
   }

   public final void u3(byte var1) {
      this.a6 = var1;
   }

   public final void k5(int var1) {
      this.u9 = var1;
   }

   public final int h0() {
      return this.h0;
   }

   public final void u3(int var1) {
      this.h0 = var1;
   }

   public final int c8() {
      return this.c8;
   }

   public final void a6(int var1) {
      this.c8 = var1;
   }

   public final int t2() {
      return this.t2;
   }

   public final void u9(int var1) {
      this.t2 = var1;
   }

   public final int s7() {
      return this.s7;
   }

   public final void h0(int var1) {
      this.s7 = var1;
   }

   public final byte x8() {
      return this.x8;
   }

   public final void a6(byte var1) {
      this.x8 = var1;
   }

   public final byte n3() {
      return (byte)(this.l6 & 0xFF & 15);
   }

   public final void u9(byte var1) {
      this.l6 = (byte)(this.l6 & 0xFF & 240 | var1 & 0xFF);
   }

   public final int y4() {
      return this.n3;
   }

   public final void c8(int var1) {
      this.n3 = var1;
   }

   public final void t2(int var1) {
      this.y4 = var1;
   }

   public final int e2() {
      return this.e2;
   }

   public final void s7(int var1) {
      this.e2 = var1;
   }

   public final com.aspose.slides.internal.t7p.x8 t9() {
      return this.t9;
   }

   public final void n5(com.aspose.slides.internal.t7p.x8 var1) {
      this.t9 = var1;
   }
}
