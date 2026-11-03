package com.aspose.slides.internal.r6a;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

public class h0 extends u9 {
   private final com.aspose.slides.internal.x2y.n5 n5 = com.aspose.slides.internal.s0i.n5.n5();

   public h0(int var1, int var2, BufferedImage var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void n5(byte[][] var1, int var2) {
      int var3 = this.n5.n5();
      byte[] var4 = this.n5.l6();
      DataBufferByte var5 = (DataBufferByte)this.u3.getRaster().getDataBuffer();
      byte[] var6 = var5.getData();
      int var7 = 0;
      int var8 = 0;

      for (int var9 = 0; var9 < this.l6; var9++) {
         for (int var10 = 0; var10 < this.k5; var10++) {
            short var11 = (short)(var1[0][var7] & 0xFF);
            short var12 = (short)(var1[1][var7] & 0xFF);
            short var13 = (short)(var1[2][var7] & 0xFF);
            var6[var8++] = var4[var3 + var11 + t2.n5[var12]];
            var6[var8++] = var4[var3 + var11 + com.aspose.slides.internal.x5h.n5.n5(t2.l6[var12] + t2.k5[var13], 13)];
            var6[var8++] = var4[var3 + var11 + t2.u3[var13]];
            var7++;
         }

         var7 += var2 - this.k5;
      }
   }
}
