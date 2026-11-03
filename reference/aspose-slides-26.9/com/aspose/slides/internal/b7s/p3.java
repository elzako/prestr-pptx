package com.aspose.slides.internal.b7s;

import com.aspose.slides.ms.System.d1;

public class p3 {
   public byte n5;
   public int[] l6;
   public byte k5 = 63;
   public byte u3;
   private int[] a6 = new int[10];
   private int u9;
   private int h0;
   private int c8;

   public p3(byte var1, byte var2, int var3, int var4, int var5) {
      this(var1, var2, var3, var4, new int[var5]);
   }

   public p3(byte var1, byte var2, int var3, int var4, int[] var5) {
      this.n5(var3);
      this.l6(var4);
      this.u3 = var1;
      this.k5 = var2;
      this.l6 = var5;
   }

   public p3() {
   }

   public final int n5() {
      return (byte)((this.n5 & 0xFF) >> 4) & 0xFF;
   }

   public final void n5(int var1) {
      this.n5 = (byte)(this.n5 & 0xFF | var1 << 4);
   }

   public final int l6() {
      return (byte)(this.n5 & 0xFF & 15) & 0xFF;
   }

   public final void l6(int var1) {
      this.n5 = (byte)(this.n5 & 0xFF & 240 | var1);
   }

   public final int[] k5() {
      return this.a6;
   }

   public final void n5(int[] var1) {
      this.a6 = var1;
   }

   public final int u3() {
      return this.u9;
   }

   public final void k5(int var1) {
      this.u9 = var1;
   }

   public final int a6() {
      return this.h0;
   }

   public final void u3(int var1) {
      this.h0 = var1;
   }

   public final int u9() {
      return this.c8;
   }

   public final void a6(int var1) {
      this.c8 = var1;
   }

   public static p3 n5(h2 var0, t4 var1) {
      p3 var2 = new p3();
      var0.l6(2);
      int var3 = 0;
      int[] var4 = new int[]{0};
      var0.l6(var4);
      var3 = var4[0];
      var2.l6 = new int[var3];

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = 0;
         int[] var7 = new int[]{0};
         var0.l6(var7);
         var6 = var7[0];
         boolean var8 = false;
         int var9 = 0;

         for (int var10 = 0; var10 < var1.l6().length; var10++) {
            if ((var1.l6()[var10].u9() & 255) == var6) {
               var8 = true;
               var9 = var10;
               break;
            }
         }

         if (!var8) {
            throw new com.aspose.slides.internal.z3b.k5(
               d1.n5, new com.aspose.slides.internal.z3b.a6("Corrupted Jpeg scan component id definition. Cannot load image.")
            );
         }

         var2.l6[var5] = var6;
         int var22 = 0;
         int[] var11 = new int[]{0};
         var0.l6(var11);
         var22 = var11[0];
         var1.l6()[var9].n5((byte)var22 & 255);
      }

      int var13 = 0;
      int var16 = 0;
      int var18 = 0;
      int[] var20 = new int[]{0};
      var0.l6(var20);
      var13 = var20[0];
      int[] var21 = new int[]{0};
      var0.l6(var21);
      var16 = var21[0];
      int[] var24 = new int[]{0};
      var0.l6(var24);
      var18 = var24[0];
      var2.u3 = (byte)var13;
      var2.k5 = (byte)var16;
      var2.n5 = (byte)var18;
      return var2;
   }

   public static void n5(y0 var0, t4 var1, p3 var2) {
      var0.n5((byte)-1);
      var0.n5((byte)-38);
      var0.n5(6 + 2 * var2.l6.length & 65535);
      var0.n5((byte)var2.l6.length);

      for (int var3 = 0; var3 < var2.l6.length; var3++) {
         n3 var4 = var1.l6()[var2.l6[var3]];
         byte var5 = (byte)((var4.l6() & 255) << 4 | var4.n5() & 0xFF);
         var0.n5(var4.u9());
         var0.n5(var5);
      }

      var0.n5(var2.u3);
      var0.n5(var2.k5);
      var0.n5(var2.n5);
   }
}
