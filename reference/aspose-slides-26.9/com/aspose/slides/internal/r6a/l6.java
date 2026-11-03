package com.aspose.slides.internal.r6a;

import com.aspose.slides.internal.r1x.k7;
import com.aspose.slides.internal.r1x.v3;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

public class l6 extends u9 {
   protected com.aspose.slides.internal.g7i.n5 n5 = new com.aspose.slides.internal.n6h.n5();

   public l6(int var1, int var2, v3 var3, v3 var4, BufferedImage var5) {
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
            for (int var13 = 0; var13 < var3; var13++) {
               var7[var13] = (var1[var13][var5] & 0xFF) / 255.0;
            }

            this.n5.n5(var7, var8);

            for (int var14 = 0; var14 < var4; var14++) {
               var10[var6++] = (byte)(var8[var14] * 255.0);
            }

            var5++;
         }

         var5 += var2 - this.k5;
      }
   }
}
