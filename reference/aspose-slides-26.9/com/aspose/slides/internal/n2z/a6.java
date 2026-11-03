package com.aspose.slides.internal.n2z;

import java.awt.Rectangle;
import java.io.IOException;

public abstract class a6 extends k5 {
   Rectangle n5;
   public com.aspose.slides.internal.d2n.u9 l6;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      var2 += 4;
      this.l6 = new com.aspose.slides.internal.d2n.u9();
      this.l6.n5(var1, var2);
   }
}
