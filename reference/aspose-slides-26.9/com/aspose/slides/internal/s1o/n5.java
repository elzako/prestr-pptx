package com.aspose.slides.internal.s1o;

import com.aspose.slides.internal.n2z.k5;
import com.aspose.slides.internal.p7x.l6;
import java.io.IOException;

public class n5 extends k5 {
   private byte[] n5;
   private int l6;

   public n5(int var1) {
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
}
