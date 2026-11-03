package com.aspose.slides.internal.l3e;

import com.aspose.slides.internal.b7s.h2;
import com.aspose.slides.internal.b7s.i1;
import com.aspose.slides.internal.b7s.o0;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.v3;

public final class u9 extends l6 {
   private byte[][] u3;

   public final void n5(h2 var1, y2 var2) {
      v3 var3 = var1.u3;
      var3.n5(0L);
      o0 var4 = new o0();
      var4.n5(var2.n3());
      byte[][] var5 = var4.n5(var3);
      this.u3 = i1.n5(var5, var4.n5(), var4.l6().n3());
      this.n5(var4.n5().k5());
   }

   public final byte[][] n5() {
      return this.u3;
   }

   private void n5(int var1) {
      if (var1 < 8) {
         int var2 = (1 << var1) - 1;
         short var3 = 255;

         for (int var4 = 0; var4 < this.u3.length; var4++) {
            byte[] var5 = this.u3[var4];

            for (int var6 = 0; var6 < var5.length; var6++) {
               var5[var6] = (byte)((var5[var6] & 255) * var3 / var2);
            }
         }
      }
   }
}
