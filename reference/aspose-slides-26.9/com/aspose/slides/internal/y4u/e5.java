package com.aspose.slides.internal.y4u;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class e5 extends s7 {
   private byte[] z8;

   @Override
   protected void n5() {
      if (this.z1 == null) {
         throw new ArgumentNullException("SourcePalette");
      }

      if (this.t4 == null) {
         throw new ArgumentNullException("DestinationColorPalette");
      }

      this.z8 = new byte[256];
      int var1 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.a6(2.0, this.y4), 14);
      byte[] var2 = null;
      int var3 = 8 / this.y4;
      int var4 = var1 - 1;
      if (this.q0 == 2) {
         var2 = this.n5(this.z3, this.n3, this.n3, var1, var1);

         for (int var5 = 0; var5 < 256; var5++) {
            int var6 = 8 - this.y4;
            byte var7 = 0;

            for (int var8 = 0; var8 < var3; var8++) {
               int var9 = var5 >> var6 & var4;
               int var10 = var2[var9] & 255;
               var7 = (byte)(var7 & 0xFF | (byte)(var10 << var6) & 0xFF);
               var6 -= this.y4;
            }

            this.z8[var5] = var7;
         }
      } else {
         int[] var15 = n5(this.z1, this.y4).l6();
         com.aspose.slides.internal.r1x.o5 var16 = new com.aspose.slides.internal.r1x.o5(this.t4);

         for (int var17 = 0; var17 < 256; var17++) {
            int var18 = 8 - this.y4;
            byte var19 = 0;

            for (int var20 = 0; var20 < var3; var20++) {
               int var11 = var17 >> var18 & var4;
               int var12 = var15[var11];
               int var13 = var16.n5(var12);
               if (var13 > var4) {
                  var13 = this.m1;
               }

               var19 = (byte)(var19 & 0xFF | (byte)(var13 << var18) & 0xFF);
               var18 -= this.y4;
            }

            this.z8[var17] = var19;
         }
      }
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = (var3 + var4 * this.y4 - 1) / 8;
      int var10 = var3 / 8;
      int var11 = var9 - var10 + 1;

      for (int var12 = 0; var12 < var5; var12++) {
         int var13 = var2 + this.s7 * var12;
         int var14 = var12 * var8 + var7;

         for (int var15 = 0; var15 < var11; var15++) {
            byte var16 = this.z8[var1[var13 + var15] & 0xFF];
            var6[var14 + var15] = var16;
         }
      }
   }
}
