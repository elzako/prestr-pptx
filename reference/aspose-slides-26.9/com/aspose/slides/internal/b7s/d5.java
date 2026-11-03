package com.aspose.slides.internal.b7s;

public class d5 {
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private p8 t2;
   private int s7 = 0;
   private byte[] x8;
   private byte[] n3;
   private int[] y4;
   private int[] e2;
   private byte t9;
   public byte n5;

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final int l6() {
      return this.k5;
   }

   public final void l6(int var1) {
      this.k5 = var1;
   }

   public final int k5() {
      return this.u3;
   }

   public final void k5(int var1) {
      this.u3 = var1;
   }

   public final int u3() {
      return this.a6;
   }

   public final void u3(int var1) {
      this.a6 = var1;
   }

   public final int a6() {
      return this.u9;
   }

   public final void a6(int var1) {
      this.u9 = var1;
   }

   public final int u9() {
      return this.h0;
   }

   public final void u9(int var1) {
      this.h0 = var1;
   }

   public final int h0() {
      return this.c8;
   }

   public final void h0(int var1) {
      this.c8 = var1;
   }

   public final p8 c8() {
      return this.t2;
   }

   public final void n5(p8 var1) {
      this.t2 = var1;
   }

   public final int t2() {
      return this.s7;
   }

   public final byte[] s7() {
      return this.x8;
   }

   public final void n5(byte[] var1) {
      this.x8 = var1;
   }

   public final byte[] x8() {
      return this.n3;
   }

   public final void l6(byte[] var1) {
      this.n3 = var1;
   }

   public final byte n3() {
      return this.t9;
   }

   public final void n5(byte var1) {
      this.t9 = var1;
   }

   public final byte y4() {
      return this.n5;
   }

   public final void l6(byte var1) {
      this.n5 = var1;
   }

   public final int[] e2() {
      return this.y4;
   }

   public final void n5(int[] var1) {
      this.y4 = var1;
   }

   public final int[] t9() {
      return this.e2;
   }

   public final void l6(int[] var1) {
      this.e2 = var1;
   }

   public final void z1() {
      int var1 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < this.a6(); var3++) {
         if ((this.s7()[var3] & 255) > var1) {
            var1 = this.s7()[var3] & 255;
         }

         if ((this.x8()[var3] & 255) > var2) {
            var2 = this.x8()[var3] & 255;
         }
      }

      this.n5((byte)var1);
      this.l6((byte)var2);
      this.n5(new int[this.a6()]);
      this.l6(new int[this.a6()]);

      for (int var4 = 0; var4 < this.a6(); var4++) {
         this.e2()[var4] = com.aspose.slides.internal.n5p.h0.n5((this.s7()[var4] & 255) * this.n5(), var1);
         this.t9()[var4] = com.aspose.slides.internal.n5p.h0.n5((this.x8()[var4] & 255) * this.l6(), var2);
      }
   }
}
