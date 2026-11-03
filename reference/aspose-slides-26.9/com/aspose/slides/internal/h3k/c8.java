package com.aspose.slides.internal.h3k;

public class c8 {
   private final byte[] n5 = new byte[256];
   private int l6;
   private int k5;

   public final void n5(byte[] var1) {
      this.n5(var1, 0, var1.length, var1, 0);
   }

   public final void n5(byte[] var1, byte[] var2) {
      this.n5(var1, 0, var1.length, var2, 0);
   }

   public final void n5(byte[] var1, int var2, int var3) {
      this.n5(var1, var2, var3, var1, var2);
   }

   public final void n5(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      int var6 = var3 + var2;

      for (int var7 = var2; var7 < var6; var7++) {
         this.l6 = this.l6 + 1 & 0xFF;
         this.k5 = (this.n5[this.l6] & 255) + this.k5 & 0xFF;
         byte var8 = this.n5[this.l6];
         this.n5[this.l6] = this.n5[this.k5];
         this.n5[this.k5] = var8;
         var4[var7 - var2 + var5] = (byte)(var1[var7] & 0xFF ^ this.n5[(this.n5[this.l6] & 255) + (this.n5[this.k5] & 255) & 0xFF] & 0xFF);
      }
   }

   public final void l6(byte[] var1) {
      this.l6(var1, 0, var1.length);
   }

   public final void l6(byte[] var1, int var2, int var3) {
      int var4 = 0;
      int var5 = 0;

      for (int var6 = 0; var6 < 256; var6++) {
         this.n5[var6] = (byte)var6;
      }

      this.l6 = 0;
      this.k5 = 0;

      for (int var8 = 0; var8 < 256; var8++) {
         var5 = (var1[var4 + var2] & 255) + (this.n5[var8] & 255) + var5 & 0xFF;
         byte var7 = this.n5[var8];
         this.n5[var8] = this.n5[var5];
         this.n5[var5] = var7;
         var4 = (var4 + 1) % var3;
      }
   }
}
