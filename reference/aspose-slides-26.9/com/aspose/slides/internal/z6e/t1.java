package com.aspose.slides.internal.z6e;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.geom.RoundRectangle2D.Float;
import java.io.IOException;

public final class t1 extends com.aspose.slides.internal.n2z.k5 {
   Rectangle n5;
   Dimension l6;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      this.l6 = com.aspose.slides.internal.l1b.k5.s7(var1, var2);
      var2 += 8;
   }

   @Override
   public int n5() {
      return 44;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      Float var4 = new Float(this.n5.x, this.n5.y, this.n5.width, this.n5.height, this.l6.width, this.l6.height);
      var1.u9(var4);
      if (var1.t9()) {
         var1.u3(var4);
      }
   }
}
