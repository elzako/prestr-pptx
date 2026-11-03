package com.aspose.slides.internal.q8g;

import java.awt.Rectangle;
import java.io.IOException;

public final class x8 extends com.aspose.slides.internal.s2b.u3 {
   Rectangle n5;
   int l6;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.n5 = new Rectangle(
         com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 6),
         com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 4),
         com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 2),
         com.aspose.slides.internal.l1b.k5.l6(var1, var2)
      );
   }

   @Override
   public int n5() {
      return 1565;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.n5(this.l6, null, this.n5, this.n5);
      super.n5(var1, var2, var3);
   }
}
