package com.aspose.slides.internal.b7s;

public class t4 {
   private n3[] n5;
   private byte l6 = 8;
   private byte k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;

   public t4(byte var1, n3[] var2) {
      this.k5 = var1;
      this.n5 = var2;
   }

   public final byte n5() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final n3[] l6() {
      return this.n5;
   }

   final void n5(n3[] var1) {
      this.n5 = var1;
   }

   public final byte k5() {
      return this.k5;
   }

   public final int u3() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final boolean a6() {
      return this.k5 == -62 || this.k5 == -58 || this.k5 == -54 || this.k5 == -50;
   }

   public final int u9() {
      return this.a6;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final int h0() {
      return this.u9;
   }

   public final void k5(int var1) {
      this.u9 = var1;
   }

   public final int c8() {
      return this.h0;
   }

   public final void u3(int var1) {
      this.h0 = var1;
   }

   public final int t2() {
      return this.c8;
   }

   public final void a6(int var1) {
      this.c8 = var1;
   }

   public static t4 n5(h2 var0, byte var1) {
      var0.l6(2);
      int var2 = 0;
      int var3 = 0;
      int[] var4 = new int[]{0};
      var0.l6(var4);
      var2 = var4[0];
      int var5 = 0;
      int var6 = 0;
      int[] var7 = new int[]{0};
      var0.n5(var7);
      var6 = var7[0];
      int[] var8 = new int[]{0};
      var0.n5(var8);
      var5 = var8[0];
      int[] var9 = new int[]{0};
      var0.l6(var9);
      var3 = var9[0];
      n3[] var10 = new n3[var3];

      for (int var11 = 0; var11 < var3; var11++) {
         n3 var12 = new n3();
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         int[] var16 = new int[]{0};
         var0.l6(var16);
         var13 = var16[0];
         int[] var17 = new int[]{0};
         var0.l6(var17);
         var14 = var17[0];
         int[] var18 = new int[]{0};
         var0.l6(var18);
         var15 = var18[0];
         var12.u3((byte)var13);
         var12.l6 = (byte)var14;
         var12.a6((byte)var15);
         var10[var11] = var12;
      }

      t4 var23 = new t4(var1, var10);
      var23.n5((byte)var2);
      var23.u3(var5 & 65535);
      var23.a6(var6 & 65535);
      var23.n5(var10);
      return var23;
   }

   static void n5(y0 var0, t4 var1) {
      var0.n5((byte)-1);
      var0.n5(var1.k5());
      var0.n5(var1.l6().length * 3 + 8 & 65535);
      var0.n5(var1.l6);
      var0.n5(var1.t2());
      var0.n5(var1.c8());
      var0.n5((byte)var1.l6().length);

      for (n3 var5 : var1.l6()) {
         var0.n5(var5.u9());
         var0.n5(var5.l6);
         var0.n5(var5.x8());
      }
   }
}
