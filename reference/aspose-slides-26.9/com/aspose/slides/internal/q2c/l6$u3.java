package com.aspose.slides.internal.q2c;

import java.awt.image.BufferedImage;

class l6$u3 extends l6$n5 {
   private int[] s7;

   public l6$u3(BufferedImage var1, BufferedImage var2) {
      super(var1, var2);
   }

   @Override
   protected void n5(int var1) {
      this.s7 = com.aspose.slides.internal.t2h.n5.n5(this.l6, var1, this.s7);
   }

   @Override
   protected void n5(int var1, int var2, float[] var3) {
      int var4 = this.s7[var1];
      var3[0] = this.n5 ? var4 >> 24 & 0xFF : 255.0F;
      var3[1] = var4 >> 16 & 0xFF;
      var3[2] = var4 >> 8 & 0xFF;
      var3[3] = var4 & 0xFF;
   }
}
