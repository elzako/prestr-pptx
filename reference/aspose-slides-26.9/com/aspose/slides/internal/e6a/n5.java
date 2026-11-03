package com.aspose.slides.internal.e6a;

import com.aspose.slides.internal.l1b.k5;
import com.aspose.slides.internal.s2b.u3;
import java.io.IOException;

public final class n5 extends u3 {
   short n5;
   byte[] l6;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      this.n5 = k5.l6(var1, var2);
      var2 += 2;
      int var4 = k5.k5(var1, var2);
      var2 += 2;
      this.l6 = new byte[var4];

      for (int var5 = 0; var5 < this.l6.length; var2++) {
         this.l6[var5] = var1[var2];
         var5++;
      }
   }

   @Override
   public int n5() {
      return 1574;
   }

   public short l6() {
      return this.n5;
   }

   public byte[] k5() {
      return this.l6;
   }
}
