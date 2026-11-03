package com.aspose.slides.internal.z6e;

import java.awt.Color;
import java.awt.Point;
import java.io.IOException;

public final class h0 extends com.aspose.slides.internal.n2z.k5 {
   Point n5;
   Color l6;
   int k5;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.c8(var1, var2);
      var2 += 8;
      this.l6 = com.aspose.slides.internal.l1b.k5.n3(var1, var2);
      var2 += 4;
      this.k5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
   }

   @Override
   public int n5() {
      return 53;
   }
}
