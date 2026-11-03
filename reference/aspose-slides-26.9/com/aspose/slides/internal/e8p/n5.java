package com.aspose.slides.internal.e8p;

import java.awt.image.BufferedImage;

public class n5 extends u9 {
   private byte[] k5;
   private boolean u3 = false;
   private int a6 = 0;

   public n5(com.aspose.slides.internal.c5e.x8 var1, BufferedImage var2) {
      super(var1, var2);
      this.k5 = com.aspose.slides.internal.v4y.n5.n5(var1.n5.t2);
      this.u3 = var1.l6().u3() != null;
      if (this.u3) {
         this.a6 = var1.l6().u3().k5();
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.c5e.k5 var1, int[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         int var4 = var1.l6[var3];
         int var5 = this.k5[var4] & 255;
         if (this.u3 && var4 == this.a6) {
            var2[var3] = 0;
         } else {
            var2[var3] = 0xFF000000 | var5 << 16 | var5 << 8 | var5;
         }
      }
   }
}
