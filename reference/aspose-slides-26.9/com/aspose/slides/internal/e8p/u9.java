package com.aspose.slides.internal.e8p;

import com.aspose.slides.exceptions.NotImplementedException;
import java.awt.image.BufferedImage;

public abstract class u9 {
   protected com.aspose.slides.internal.c5e.x8 n5;
   protected BufferedImage l6;

   protected u9(com.aspose.slides.internal.c5e.x8 var1, BufferedImage var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public void n5() {
      int var1 = this.n5.n5.n5;
      int var2 = this.n5.n5.l6;
      int[] var3 = new int[this.n5.n5.n5];

      for (int var4 = 0; var4 < var2; var4++) {
         com.aspose.slides.internal.c5e.k5 var5 = this.n5.n5(var4);
         this.n5(var5, var3);
         this.l6.setRGB(0, var4, var1, 1, var3, 0, 1);
      }
   }

   protected abstract void n5(com.aspose.slides.internal.c5e.k5 var1, int[] var2);

   protected void n5(com.aspose.slides.internal.c5e.k5 var1, BufferedImage var2) {
      throw new NotImplementedException();
   }
}
