package com.aspose.slides.internal.i2i;

import com.aspose.slides.internal.o8m.f2;

public class s7$n5 {
   private static byte[] n5 = new byte[]{
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1,
      1
   };
   private static byte[] l6 = new byte[]{
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2,
      2
   };
   private static byte[] k5 = new byte[]{
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3,
      3
   };
   private String u3;
   private int a6;
   private byte[] u9;
   private byte[] h0;

   public void n5(String var1) {
      this.u3 = var1;
   }

   public void n5(int var1) {
      this.a6 = var1;
   }

   public void n5(byte[] var1) {
      if (var1 == null) {
         this.u9 = new byte[0];
      } else {
         this.u9 = (byte[])var1.clone();
      }
   }

   public void l6(byte[] var1) {
      if (var1 != null) {
         this.h0 = (byte[])var1.clone();
      } else {
         this.h0 = null;
      }
   }

   private void n5(byte[] var1, int var2, byte[] var3) {
      int var4 = (var3[var3.length - 1] & 255 & 0xFF) + (var1[var2 + var3.length - 1] & 255 & 0xFF) + 1;
      var1[var2 + var3.length - 1] = (byte)var4;
      var4 >>= 8;

      for (int var5 = var3.length - 2; var5 >= 0; var5--) {
         var4 += (var3[var5] & 255 & 0xFF) + (var1[var2 + var5] & 255 & 0xFF);
         var1[var2 + var5] = (byte)var4;
         var4 >>= 8;
      }
   }

   private byte[] n5(byte[] var1, int var2) {
      f2 var3 = f2.k5(this.u3);
      int var4 = var3.y4() >> 3;
      byte var5 = 64;
      byte[] var6 = new byte[var2];
      byte[] var7;
      if (this.h0 != null && this.h0.length != 0) {
         var7 = new byte[var5 * ((this.h0.length + var5 - 1) / var5)];

         for (int var8 = 0; var8 != var7.length; var8++) {
            var7[var8] = this.h0[var8 % this.h0.length];
         }
      } else {
         var7 = new byte[0];
      }

      byte[] var15;
      if (this.u9 != null && this.u9.length != 0) {
         var15 = new byte[var5 * ((this.u9.length + var5 - 1) / var5)];

         for (int var9 = 0; var9 != var15.length; var9++) {
            var15[var9] = this.u9[var9 % this.u9.length];
         }
      } else {
         var15 = new byte[0];
      }

      byte[] var16 = new byte[var7.length + var15.length];
      com.aspose.slides.ms.System.y4.n5(var7, 0, var16, 0, var7.length);
      com.aspose.slides.ms.System.y4.n5(var15, 0, var16, var7.length, var15.length);
      byte[] var10 = new byte[var5];
      int var11 = (var2 + var4 - 1) / var4;

      for (int var12 = 1; var12 <= var11; var12++) {
         var3.n5(var1, 0, var1.length, var1, 0);
         var3.n5(var16, 0, var16.length);
         byte[] var13 = var3.n3();
         var3.t2();

         for (int var14 = 1; var14 != this.a6; var14++) {
            var13 = var3.k5(var13, 0, var13.length);
         }

         for (int var17 = 0; var17 != var10.length; var17++) {
            var10[var17] = var13[var17 % var13.length];
         }

         for (int var18 = 0; var18 != var16.length / var5; var18++) {
            this.n5(var16, var18 * var5, var10);
         }

         if (var12 == var11) {
            com.aspose.slides.ms.System.y4.n5(var13, 0, var6, (var12 - 1) * var4, var6.length - (var12 - 1) * var4);
         } else {
            com.aspose.slides.ms.System.y4.n5(var13, 0, var6, (var12 - 1) * var4, var13.length);
         }
      }

      return var6;
   }

   public byte[] l6(int var1) {
      return this.n5(n5, var1);
   }

   public byte[] k5(int var1) {
      return this.n5(l6, var1);
   }

   public byte[] u3(int var1) {
      return this.n5(k5, var1);
   }
}
