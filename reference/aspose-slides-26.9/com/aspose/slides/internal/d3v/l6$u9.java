package com.aspose.slides.internal.d3v;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.r1x.o5;

class l6$u9 extends l6$q0 {
   private final com.aspose.slides.internal.b8u.a6 n5;
   private final o5 l6;

   public l6$u9(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4, com.aspose.slides.internal.b8u.a6 var5) {
      super(var1, var2, var3, var4, 8);
      if (var5 == null) {
         throw new ArgumentNullException("palette");
      }

      this.n5 = var5;
      this.l6 = new o5(var5);
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      o5 var4 = this.l6;
      byte[] var5 = this.h0;
      int var6 = this.c8;

      for (int var7 = 0; var7 < var3; var7++) {
         byte var8 = (byte)var4.n5(var1[var2++]);
         var5[var6++] = var8;
      }

      this.c8 = var6;
   }
}
