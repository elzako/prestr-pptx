package com.aspose.slides.internal.o5k;

import java.awt.Point;
import java.awt.Rectangle;
import java.io.IOException;

public final class n5 extends com.aspose.slides.internal.s2b.u3 {
   Point n5;
   Rectangle l6;
   int k5;
   com.aspose.slides.internal.c4t.n5 u3;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.k5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.l6 = new Rectangle(
         com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 2),
         com.aspose.slides.internal.l1b.k5.l6(var1, var2),
         com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 6),
         com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 4)
      );
      var2 += 8;
      this.n5 = new Point(com.aspose.slides.internal.l1b.k5.l6(var1, var2 + 2), com.aspose.slides.internal.l1b.k5.l6(var1, var2));
      var2 += 4;
      this.u3 = new com.aspose.slides.internal.c4t.n5();
      this.u3.n5(var1, var2, var3);
   }

   @Override
   public int n5() {
      return 2338;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.n5(this.k5, this.u3.n5(), new Rectangle(this.n5.x, this.n5.y, this.l6.width, this.l6.height), this.l6);
      super.n5(var1, var2, var3);
   }
}
