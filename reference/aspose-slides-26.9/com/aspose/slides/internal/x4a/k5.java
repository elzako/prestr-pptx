package com.aspose.slides.internal.x4a;

import java.io.IOException;

public final class k5 extends com.aspose.slides.internal.s2b.u3 {
   byte[] n5;

   @Override
   public int n5() {
      return 247;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = new byte[var3];
      System.arraycopy(var1, var2 + 0, this.n5, 0, var3);
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.n5(this.n5);
      super.n5(var1, var2, var3);
   }
}
