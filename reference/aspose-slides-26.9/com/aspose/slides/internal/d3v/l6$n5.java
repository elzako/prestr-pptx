package com.aspose.slides.internal.d3v;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.r1x.o5;

class l6$n5 extends l6$q0 {
   private final com.aspose.slides.internal.b8u.a6 n5;
   private final o5 l6;

   public l6$n5(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4, com.aspose.slides.internal.b8u.a6 var5) {
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
      int var7 = l6(var4.n5());
      int var8 = 16 - var7;

      for (int var9 = 0; var9 < var3; var9++) {
         int var10 = var1[var2++];
         int var11 = var4.n5(var10);
         int var12 = var11 << var8 & 65535;
         var5[var6++] = (byte)(var12 >> 8 & 0xFF);
         var5[var6++] = (byte)(var12 & 0xFF);
      }

      this.c8 = var6;
   }
}
