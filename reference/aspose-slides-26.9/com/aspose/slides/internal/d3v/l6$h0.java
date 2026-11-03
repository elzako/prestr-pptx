package com.aspose.slides.internal.d3v;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.r1x.o5;

class l6$h0 extends l6$q0 {
   private final com.aspose.slides.internal.b8u.a6 n5;
   private byte l6;
   private final o5 k5;

   public l6$h0(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, com.aspose.slides.internal.b8u.a6 var4) {
      super(var1, var2, var3, 1, 8);
      if (var4 == null) {
         throw new ArgumentNullException("palette");
      }

      this.n5 = var4;
      this.k5 = new o5(var4);
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      o5 var4 = this.k5;
      byte[] var5 = this.h0;
      int var6 = this.c8;
      byte var7 = this.l6;

      for (int var8 = 0; var8 < var3; var8++) {
         byte var9 = (byte)var4.n5(var1[var2++]);
         var5[var6++] = (byte)((var9 & 255) - (var7 & 255));
         var7 = var9;
      }

      this.c8 = var6;
      if (this.u9 - var3 == 0L) {
         this.l6 = 0;
      } else {
         this.l6 = var7;
      }
   }
}
