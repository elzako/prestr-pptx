package com.aspose.slides.internal.q2c;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

class l6$u9 extends l6$n5 {
   private final int[] s7;

   protected l6$u9(BufferedImage var1, BufferedImage var2) {
      super(var1, var2);
      DataBufferInt var3 = (DataBufferInt)var1.getRaster().getDataBuffer();
      this.s7 = var3.getData();
   }

   @Override
   protected void n5(int var1) {
   }

   @Override
   protected void n5(int var1, int var2, float[] var3) {
      int var4 = this.s7[var2 * this.k5 + var1];
      var3[0] = 255.0F;
      var3[1] = var4 >> 16 & 0xFF;
      var3[2] = var4 >> 8 & 0xFF;
      var3[3] = var4 & 0xFF;
   }
}
