package com.aspose.slides.internal.g4u;

import java.io.IOException;

public final class u3 extends com.aspose.slides.internal.n2z.k5 {
   int n5;
   com.aspose.slides.internal.d2n.k5 l6;
   byte[] k5;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      this.l6 = new com.aspose.slides.internal.d2n.k5();
      var2 += this.l6.n5(var1, var2);
      this.k5 = new byte[var3 - var2];
      System.arraycopy(var1, var2, this.k5, 0, var3 - var2);
   }

   @Override
   public int n5() {
      return 82;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.d2n.l6 var4 = new com.aspose.slides.internal.d2n.l6(var1, this.l6);
      var1.n5(this.n5, var4);
   }
}
