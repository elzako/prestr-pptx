package com.aspose.slides.internal.g4u;

import java.io.IOException;

public final class l6 extends com.aspose.slides.internal.n2z.k5 {
   int n5;
   com.aspose.slides.internal.d2n.n5 l6;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.l6 = new com.aspose.slides.internal.d2n.n5();
      var2 += this.l6.l6(var1, var2);
   }

   @Override
   public int n5() {
      return 39;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.n5(this.n5, this.l6.n5());
   }
}
