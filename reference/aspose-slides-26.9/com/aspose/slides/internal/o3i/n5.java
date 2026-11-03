package com.aspose.slides.internal.o3i;

import com.aspose.slides.internal.n2z.k5;
import java.awt.Color;
import java.io.IOException;

public final class n5 extends k5 {
   Color[] n5;

   @Override
   public void n5(byte[] var1, int var2, int var3) throws com.aspose.slides.internal.p7x.l6, IOException {
      int var4 = com.aspose.slides.internal.l1b.k5.u3(var1, var2 + var3 - 4);
      if (var4 != 0) {
         int var5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 4;
         int var6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 4;
         if (var5 > 0) {
            if (var6 < var2 || var6 + var5 * 4 > var2 + var3 - 4) {
               throw new IOException("Error reading palette");
            }

            this.n5 = new Color[var5];

            for (int var7 = 0; var7 < var5; var6 += 4) {
               this.n5[var7] = com.aspose.slides.internal.l1b.k5.n3(var1, var6);
               var7++;
            }
         }
      }
   }

   @Override
   public int n5() {
      return 14;
   }
}
