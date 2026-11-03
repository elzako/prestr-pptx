package com.aspose.slides.internal.q2c;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;

class l6$k5 extends l6$n5 {
   private final byte[] s7;

   l6$k5(BufferedImage var1, BufferedImage var2) {
      super(var1, var2);
      DataBufferByte var3 = (DataBufferByte)var1.getRaster().getDataBuffer();
      this.s7 = var3.getData();
   }

   @Override
   protected void n5(int var1) {
   }

   @Override
   protected void n5(int var1, int var2, float[] var3) {
      int var4 = 4 * (var2 * this.k5 + var1);
      var3[0] = this.s7[var4] & 0xFF;
      var3[1] = this.s7[var4 + 3] & 0xFF;
      var3[2] = this.s7[var4 + 2] & 0xFF;
      var3[3] = this.s7[var4 + 1] & 0xFF;
   }
}
