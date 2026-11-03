package com.aspose.slides.internal.x4a;

import java.io.IOException;

public abstract class u3 extends com.aspose.slides.internal.s2b.u3 {
   short n5;
   short l6;
   com.aspose.slides.internal.c4t.n5 k5;

   u3() {
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.l6 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.k5 = new com.aspose.slides.internal.c4t.n5();
      this.k5.n5(var1, var2, var3 - var2, false);
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.c4t.k5 var4 = new com.aspose.slides.internal.c4t.k5(this.k5.n5());
      var1.n5(var4);
      super.n5(var1, var2, var3);
   }
}
