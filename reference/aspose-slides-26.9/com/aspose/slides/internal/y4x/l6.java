package com.aspose.slides.internal.y4x;

import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.x4g.a6;

public class l6 {
   private final c8[] n5;
   private final boolean l6;

   public l6(double var1, a6 var3, boolean var4) {
      c8[] var5 = var3.n5();
      int var6 = var5.length - 1;
      if (var6 == 1) {
         k5 var7 = new k5(256);
         this.n5 = var7.n5(var5[0], var5[1]);
      } else {
         u3 var8 = new u3(4096, 256);
         this.n5 = var8.n5(var5, var3.l6(), var1);
      }

      this.l6 = var4;
   }

   public c8 n5(double var1) {
      var1 = Math.max(Math.min(var1, 1.0), 0.0);
      c8 var3 = this.n5[(int)Math.round(var1 * (this.n5.length - 1))];
      if (this.l6) {
         var3 = c8.n5(com.aspose.slides.internal.r5w.n5.n5(var3.h0(), 0.45454545454545453));
      }

      return var3;
   }
}
