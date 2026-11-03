package com.aspose.slides.internal.y2o;

import com.aspose.slides.ms.System.q1;

class n5 {
   public static byte n5(byte var0, byte var1, byte var2) {
      int var3 = (var0 & 255) + (var1 & 255) - (var2 & 255);
      int var4 = q1.n5(var3 - (var0 & 255));
      int var5 = q1.n5(var3 - (var1 & 255));
      int var6 = q1.n5(var3 - (var2 & 255));
      if (var4 <= var5 && var4 <= var6) {
         return var0;
      } else {
         return var5 <= var6 ? var1 : var2;
      }
   }
}
