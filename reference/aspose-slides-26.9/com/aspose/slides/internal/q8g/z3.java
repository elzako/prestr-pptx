package com.aspose.slides.internal.q8g;

import java.awt.Point;
import java.io.IOException;

public final class z3 extends com.aspose.slides.internal.s2b.u3 {
   com.aspose.slides.internal.c4t.n3 n5;

   public z3() {
   }

   public z3(com.aspose.slides.internal.c4t.n3 var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      int var4 = com.aspose.slides.internal.l1b.k5.k5(var1, var2);
      var2 += 2;
      this.n5 = new com.aspose.slides.internal.c4t.y4();
      this.n5.n5(com.aspose.slides.internal.c4t.n3.n5(var1, var2, var4));
      var2 += (var4 + 1) / 2 * 2;
      this.n5.n5(new Point(com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 2), com.aspose.slides.internal.l1b.k5.l6(var1, var2)));
   }

   @Override
   public int n5() {
      return 1313;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.n5(var2, this.n5, 2, 0.0F, 0.0F);
      super.n5(var1, var2, var3);
   }
}
