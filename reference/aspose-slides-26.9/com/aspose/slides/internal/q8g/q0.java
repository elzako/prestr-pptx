package com.aspose.slides.internal.q8g;

import java.awt.geom.RoundRectangle2D.Float;
import java.io.IOException;

public final class q0 extends com.aspose.slides.internal.s2b.a6 {
   short l6;
   short k5;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.k5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.l6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      super.n5(var1, var2, var3);
   }

   @Override
   public int n5() {
      return 1564;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      Float var4 = new Float(this.n5.x, this.n5.y, this.n5.width, this.n5.height, this.l6, this.k5);
      var1.u9(var4);
      if (var1.t9()) {
         var1.u3(var4);
      }

      super.n5(var1, var2, var3);
   }
}
