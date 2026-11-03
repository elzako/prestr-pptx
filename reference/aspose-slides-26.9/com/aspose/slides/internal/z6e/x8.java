package com.aspose.slides.internal.z6e;

import java.awt.Rectangle;
import java.io.IOException;

public final class x8 extends com.aspose.slides.internal.n2z.k5 {
   Rectangle n5;
   int l6;
   com.aspose.slides.internal.d2n.u9 k5;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      var2 += 4;
      this.l6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.k5 = new com.aspose.slides.internal.d2n.u9();
      var2 += this.k5.n5(var1, var2);
   }

   @Override
   public int n5() {
      return 71;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.a6();
      var1.t4(this.l6);
      var1.u9(this.k5);
      var1.u9(-1);
   }
}
