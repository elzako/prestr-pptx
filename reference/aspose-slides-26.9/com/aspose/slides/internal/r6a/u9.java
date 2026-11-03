package com.aspose.slides.internal.r6a;

import java.awt.image.BufferedImage;

public abstract class u9 {
   public final int l6;
   public final int k5;
   protected final BufferedImage u3;

   protected u9(int var1, int var2, BufferedImage var3) {
      this.k5 = var1;
      this.l6 = var2;
      this.u3 = var3;
   }

   public void l6(byte[][] var1, int var2) {
      this.n5(var1, var2);
   }

   protected abstract void n5(byte[][] var1, int var2);
}
