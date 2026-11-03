package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.Exception;

class f2 {
   static byte[] n5(byte[] var0) {
      try {
         f2$l6 var1 = new f2$l6(var0, 0);
         if (var1.h0 == 0) {
            var1.h0 = ((var1.l6 * var1.a6 + 31 & -32) >> 3) * com.aspose.slides.ms.System.q1.n5(var1.k5);
         }

         if (var1.s7 == 0 && var1.a6 < 16) {
            var1.s7 = 1 << var1.a6;
         }

         f2$n5 var2 = new f2$n5(null);
         byte var3 = 14;
         int var4 = var1.n5 + var1.s7 * 4 + var1.h0;
         var2.n5 = new char[]{'B', 'M'};
         var2.l6 = var3 + var4;
         var2.a6 = var3 + var1.n5 + var1.s7 * 4;
         byte[] var5 = new byte[var2.l6];
         var2.n5(var5, 0);
         System.arraycopy(var0, 0, var5, var3, var4);
         return var5;
      } catch (Exception var6) {
         com.aspose.slides.internal.n8e.v4.n5(var6);
         return null;
      }
   }
}
