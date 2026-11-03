package com.aspose.slides.internal.d3v;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.r1x.o5;

class l6$k5 extends l6$q0 {
   private final com.aspose.slides.internal.b8u.a6 n5;
   private final o5 l6;
   private int k5;

   public l6$k5(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4, com.aspose.slides.internal.b8u.a6 var5) {
      super(var1, var2, var3, var4, 16);
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
      int var7 = this.k5;
      int var8 = l6(var4.n5());
      int var9 = 16 - var8;
      long var10 = this.u9;

      for (int var12 = 0; var12 < var3; var12++) {
         int var13 = var1[var2++];
         int var14 = var4.n5(var13);
         int var15 = var14 - var7 << var9 & 65535;
         var5[var6++] = (byte)(var15 >> 8 & 0xFF);
         var5[var6++] = (byte)(var15 & 0xFF);
         if (--var10 % this.a6 == 0L) {
            var7 = 0;
         } else {
            var7 = var14;
         }
      }

      this.c8 = var6;
      this.k5 = var7;
   }
}
