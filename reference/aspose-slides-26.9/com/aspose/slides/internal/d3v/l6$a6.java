package com.aspose.slides.internal.d3v;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.r1x.o5;
import com.aspose.slides.ms.System.q1;

class l6$a6 extends l6$q0 {
   private final com.aspose.slides.internal.b8u.a6 n5;
   private final o5 l6;

   public l6$a6(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4, com.aspose.slides.internal.b8u.a6 var5) {
      super(var1, var2, var3, var4, 4);
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
      int var7 = this.t2;

      while (var3 > 0) {
         int var8 = q1.l6(var7 + 1 >> 2, var3);
         byte var9 = this.h0[var6];

         for (int var10 = 0; var10 < var8; var10++) {
            int var11 = var4.n5(var1[var2++]);
            int var12 = var7 - 3;
            var9 = (byte)(var9 & 0xFF & (byte)(~(15 << var12)) & 0xFF);
            var9 = (byte)(var9 & 0xFF | (byte)(var11 << var12) & 0xFF);
            var7 -= 4;
         }

         var5[var6] = var9;
         var3 -= var8;
         if (var7 < 0) {
            var7 = 7;
            var6++;
         }
      }

      this.c8 = var6;
      this.t2 = var7;
   }
}
