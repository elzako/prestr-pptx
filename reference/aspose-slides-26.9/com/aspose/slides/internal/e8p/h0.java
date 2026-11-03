package com.aspose.slides.internal.e8p;

import java.awt.image.BufferedImage;

public class h0 extends u9 {
   private boolean k5;
   private int u3 = 0;

   public h0(com.aspose.slides.internal.c5e.x8 var1, BufferedImage var2) {
      super(var1, var2);
      this.k5 = var1.l6().u3() != null;
      if (this.k5) {
         int[] var3 = var1.l6().u3().l6();
         this.u3 = var3[0] << 16 | var3[1] << 8 | var3[2];
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.c5e.k5 var1, int[] var2) {
      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = com.aspose.slides.internal.c5e.u3.l6(var1, var3);
         if (!this.k5 || var2[var3] != this.u3) {
            var2[var3] |= -16777216;
         }
      }
   }
}
