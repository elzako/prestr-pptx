package com.aspose.slides.internal.r6a;

import com.aspose.slides.internal.r1x.k7;
import com.aspose.slides.internal.r1x.v3;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

public class c8 extends u9 {
   protected com.aspose.slides.internal.g7i.n5 n5 = new com.aspose.slides.internal.n6h.n5();

   public c8(int var1, int var2, v3 var3, v3 var4, BufferedImage var5) {
      super(var1, var2, var5);

      try {
         this.n5.n5(var3.k5());
      } catch (com.aspose.slides.internal.d3l.h0 var8) {
         this.n5.n5(k7.n5().n5());
      }

      try {
         this.n5.n5(var4.k5());
      } catch (com.aspose.slides.internal.d3l.h0 var7) {
         this.n5.n5(k7.l6().n5());
      }
   }

   @Override
   protected void n5(byte[][] var1, int var2) {
      byte var3 = 4;
      byte var4 = 3;
      int var5 = 0;
      int var6 = 0;
      double[] var7 = new double[var3];
      double[] var8 = new double[var4];
      DataBufferByte var9 = (DataBufferByte)this.u3.getRaster().getDataBuffer();
      byte[] var10 = var9.getData();

      for (int var11 = 0; var11 < this.l6; var11++) {
         for (int var12 = 0; var12 < this.k5; var12++) {
            int var13 = 255 - (var1[0][var5] & 255);
            int var14 = 255 - (var1[1][var5] & 255);
            int var15 = 255 - (var1[2][var5] & 255);
            int var16 = 255 - (var1[3][var5] & 255);
            double var17 = 255.0 - (var13 + var15 * 1.402 - 179.456);
            double var19 = 255.0 - (var13 - 0.34414 * var14 - 0.71414 * var15 + 135.45984);
            double var21 = 255.0 - (var13 + 1.7718 * var14 - 226.816);
            var7[0] = var17 / 255.0;
            var7[1] = var19 / 255.0;
            var7[2] = var21 / 255.0;
            var7[3] = var16 / 255.0;
            this.n5.n5(var7, var8);

            for (int var23 = 0; var23 < var4; var23++) {
               var10[var6++] = (byte)(var8[var23] * 255.0);
            }

            var5++;
         }

         var5 += var2 - this.k5;
      }
   }
}
