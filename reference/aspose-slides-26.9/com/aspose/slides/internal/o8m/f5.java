package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class f5 extends r4 {
   private int n5;
   private byte[] l6;
   private d2 k5;
   private byte[] u3;
   private int a6;
   private int u9;

   public f5(byte[] var1, byte[] var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("password");
      }

      this.n5(var2);
      this.l6(var3);
      this.k5 = new d2(var1);
   }

   public void l6(int var1) {
      if (var1 < 1) {
         throw new ArgumentOutOfRangeException("value", "IterationCount < 1");
      }

      this.n5 = var1;
   }

   public void n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Salt");
      }

      if (var1.length < 8) {
         throw new ArgumentException("Salt < 8 bytes");
      }

      this.l6 = (byte[])var1.clone();
   }

   private byte[] n5(byte[] var1, int var2, int var3) {
      var1[var1.length - 4] = (byte)(var3 >> 24);
      var1[var1.length - 3] = (byte)(var3 >> 16);
      var1[var1.length - 2] = (byte)(var3 >> 8);
      var1[var1.length - 1] = (byte)var3;
      byte[] var4 = this.k5.l6(var1);
      byte[] var5 = var4;

      for (int var6 = 1; var6 < var2; var6++) {
         byte[] var7 = this.k5.l6(var5);

         for (int var8 = 0; var8 < 20; var8++) {
            var4[var8] = (byte)(var4[var8] & 0xFF ^ var7[var8] & 0xFF);
         }

         var5 = var7;
      }

      return var4;
   }

   @Override
   public byte[] n5(int var1) {
      if (var1 < 1) {
         throw new ArgumentOutOfRangeException("cb");
      }

      int var2 = var1 / 20;
      int var3 = var1 % 20;
      if (var3 != 0) {
         var2++;
      }

      byte[] var4 = new byte[var1];
      int var5 = 0;
      if (this.a6 > 0) {
         int var6 = Math.min(20 - this.a6, var1);
         com.aspose.slides.ms.System.y4.n5(this.u3, this.a6, var4, 0, var6);
         if (var6 >= var1) {
            return var4;
         }

         if ((var2 - 1) * 20 + var6 > var4.length) {
            var2--;
         }

         this.a6 = 0;
         var5 = var6;
      }

      byte[] var9 = new byte[this.l6.length + 4];
      com.aspose.slides.ms.System.y4.n5(this.l6, 0, var9, 0, this.l6.length);

      for (int var7 = 1; var7 <= var2; var7++) {
         this.u3 = this.n5(var9, this.n5, ++this.u9);
         int var8 = var7 == var2 ? var4.length - var5 : 20;
         com.aspose.slides.ms.System.y4.n5(this.u3, this.a6, var4, var5, var8);
         var5 += this.a6 + var8;
         this.a6 = var8 == 20 ? 0 : var8;
      }

      return var4;
   }
}
