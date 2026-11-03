package com.aspose.slides.internal.g2x;

import com.aspose.slides.internal.o6t.k5;
import com.aspose.slides.internal.p7x.l6;
import com.aspose.slides.internal.s2b.u3;
import java.io.IOException;

public final class n5 extends u3 {
   private byte[] n5;
   private short l6;

   public n5(short var1) {
      this.l6 = var1;
      this.n5 = null;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3) throws l6, IOException {
      this.n5 = new byte[var3];
      System.arraycopy(var1, var2 + 0, this.n5, 0, var3);
   }

   @Override
   public int n5() {
      return this.l6;
   }

   @Override
   public void n5(k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws l6 {
      super.n5(var1, var2, var3);
   }
}
