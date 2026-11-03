package com.aspose.slides.internal.r6a;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

public class k5 extends u9 {
   public k5(int var1, int var2, BufferedImage var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void n5(byte[][] var1, int var2) {
      int var3 = 0;
      int var4 = 0;
      DataBufferByte var5 = (DataBufferByte)this.u3.getRaster().getDataBuffer();
      byte[] var6 = var5.getData();
      if (var2 == this.k5) {
         System.arraycopy(var1[0], 0, var6, 0, var6.length);
      } else {
         for (int var7 = 0; var7 < this.l6; var7++) {
            System.arraycopy(var1[0], var3, var6, var4, this.k5);
            var3 += this.k5;
            var4 += this.k5;
            var3 += var2 - this.k5;
         }
      }
   }
}
