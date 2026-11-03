package com.aspose.slides.internal.q8g;

import java.awt.Point;
import java.io.IOException;

public final class e2 extends com.aspose.slides.internal.s2b.u3 {
   Point[][] n5;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      short var4 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
      var2 += 2;
      this.n5 = new Point[var4][];
      short var5 = 0;

      for (int var6 = 0; var6 < var4; var6++) {
         short var7 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
         var2 += 2;
         this.n5[var6] = new Point[var7];
         var5 += var7;
      }

      for (int var9 = 0; var9 < this.n5.length; var9++) {
         for (int var10 = 0; var10 < this.n5[var9].length; var2 += 4) {
            this.n5[var9][var10] = com.aspose.slides.internal.l1b.k5.t2(var1, var2);
            var10++;
         }
      }
   }

   @Override
   public int n5() {
      return 1336;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.k5(this.n5);
      super.n5(var1, var2, var3);
   }
}
