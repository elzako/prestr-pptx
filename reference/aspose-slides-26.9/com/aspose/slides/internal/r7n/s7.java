package com.aspose.slides.internal.r7n;

import java.io.IOException;

abstract class s7 extends com.aspose.slides.internal.s2b.u3 {
   short n5;
   short l6;
   short k5;
   short u3;

   protected s7() {
   }

   protected s7(short var1, short var2, short var3, short var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.u3 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.k5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.l6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.n5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
   }
}
