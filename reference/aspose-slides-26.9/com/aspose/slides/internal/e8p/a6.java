package com.aspose.slides.internal.e8p;

import com.aspose.slides.internal.c5e.k5$n5;
import com.aspose.slides.internal.f7v.a5;
import java.awt.image.BufferedImage;

public class a6 extends u9 {
   private boolean k5;
   private int[] u3;

   public a6(com.aspose.slides.internal.c5e.x8 var1, BufferedImage var2) {
      super(var1, var2);
      this.k5 = var1.l6().u3() != null;
      if (this.k5) {
         this.u3 = var1.l6().u3().u3();
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.c5e.k5 var1, int[] var2) {
      if (!var1.t2) {
         var1 = var1.l6();
      }

      boolean var3 = var1.c8 == k5$n5.l6;
      a5 var4 = this.n5.l6().k5();
      int[] var5 = new int[3];

      for (int var6 = 0; var6 < var2.length; var6++) {
         int var7 = var3 ? var1.k5[var6] & 0xFF : var1.l6[var6];
         if (var7 >= var4.l6()) {
            var5[0] = var5[1] = var5[2] = 0;
         } else {
            var4.n5(var7, var5);
         }

         var2[var6] = var5[0] << 16 | var5[1] << 8 | var5[2];
         if (this.k5) {
            int var8 = var7 < this.u3.length ? this.u3[var7] : 255;
            var2[var6] |= var8 << 24;
         } else {
            var2[var6] |= -16777216;
         }
      }
   }
}
