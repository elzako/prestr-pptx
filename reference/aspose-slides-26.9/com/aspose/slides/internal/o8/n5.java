package com.aspose.slides.internal.o8;

import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.z0k.t4;

public class n5 {
   private final t4 n5;

   public n5(t4 var1) {
      this.n5 = var1;
   }

   public final void n5(b3[] var1) {
      for (b3 var5 : var1) {
         long var6 = this.n5.getPosition();
         l6.n5(var5, this.n5);
         l6 var8 = k5.n5(var5.t4());
         var8.l6(var5, this.n5);
         int var9 = (int)(this.n5.getPosition() - var6);
         int var10 = var5.h0() - var9;
         if (var10 > 0) {
            this.n5.seek(var10, 1);
         } else if (var10 < 0) {
            throw new com.aspose.slides.internal.p5.n5("Writed more bytes than the record size.");
         }
      }
   }
}
