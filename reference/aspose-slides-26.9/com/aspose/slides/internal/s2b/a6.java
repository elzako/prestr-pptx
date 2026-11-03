package com.aspose.slides.internal.s2b;

import java.awt.Rectangle;
import java.io.IOException;

public abstract class a6 extends u3 {
   protected Rectangle n5;

   protected a6() {
   }

   public a6(Rectangle var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      short var4 = com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 6);
      short var5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 4);
      short var6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 2);
      short var7 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      this.n5 = new Rectangle(var4, var5 < var7 ? var5 : var7, var6 - var4, var5 < var7 ? var7 - var5 : var5 - var7);
   }
}
