package com.aspose.slides.internal.s2b;

import java.awt.Point;
import java.io.IOException;

public abstract class k5 extends u3 {
   protected Point n5;

   protected k5() {
   }

   public k5(int var1, int var2) {
      this.n5 = new Point(var1, var2);
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = new Point(com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 2), com.aspose.slides.internal.l1b.k5.l6(var1, var2));
   }
}
