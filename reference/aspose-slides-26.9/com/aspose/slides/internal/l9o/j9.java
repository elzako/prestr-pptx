package com.aspose.slides.internal.l9o;

import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;

public class j9 extends n5 {
   private final double t2 = 0.212655;
   private final double s7 = 0.715158;
   private final double x8 = 0.072187;

   public j9(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2) {
      super(var1, var2);
   }

   @Override
   protected void k5(byte[] var1) {
      if (this.a6 % 8 == 0) {
         this.n5(var1, this.a6, this.u9, this.h0, this.c8);
      } else {
         WritableRaster var2 = this.k5();
         com.aspose.slides.internal.p4t.l6 var3 = this.n5(var1);
         var3.n5(new z6(this, var2));
      }
   }

   private void n5(byte[] var1, int var2, int var3, int var4, int var5) {
      DataBufferByte var6 = (DataBufferByte)this.u3();
      byte[] var7 = var6.getData();
      int var8 = (int)Math.ceil(this.l6().getWidth() / 8.0F);
      int var9 = (int)Math.ceil(var4 / 8.0F);
      int var10 = var4 % 8;
      int var11 = var2 / 8;
      int var12 = var11 + var3 * var8;
      int var13 = 0;

      for (int var14 = 0; var14 < var5; var14++) {
         if (var10 == 0) {
            System.arraycopy(var7, var12, var1, var13, var9);
         } else {
            System.arraycopy(var7, var12, var1, var13, var9 - 1);
            int var15 = var12 + var9 - 1;
            int var16 = var13 + var9 - 1;
            byte var17 = var7[var15];
            var1[var16] = (byte)(var17 & 255 << 8 - var10 & 0xFF);
         }

         var12 += var8;
         var13 += this.k5 + var9;
      }
   }

   @Override
   protected com.aspose.slides.internal.p4t.u3 l6(byte[] var1) {
      return new com.aspose.slides.internal.p4t.a6(this.h0, this.k5, var1);
   }

   @Override
   protected void n5(int var1, com.aspose.slides.internal.p4t.u3 var2) {
      var2.n5((byte)var1);
   }

   private boolean n5(int var1, int var2, int var3) {
      return var1 < 176 && var2 < 128 && var3 < 96
         || var1 < 176 && var2 < 96 && var3 < 128
         || var3 < 176 && var2 < 128 && var1 < 96
         || var3 < 176 && var2 < 96 && var1 < 128
         || var2 < 176 && var1 < 128 && var3 < 96
         || var2 < 176 && var1 < 96 && var3 < 128;
   }

   private float l6(int var1, int var2, int var3) {
      return (var1 + var2 + var3) / 3.0F;
   }

   @Override
   protected int k5(int var1) {
      int var2 = var1 >> 16 & 0xFF;
      int var3 = var1 >> 8 & 0xFF;
      int var4 = var1 & 0xFF;
      boolean var5 = this.l6(var2, var3, var4) > 127.0F;
      return var5 && !this.n5(var2, var3, var4) ? 1 : 0;
   }
}
