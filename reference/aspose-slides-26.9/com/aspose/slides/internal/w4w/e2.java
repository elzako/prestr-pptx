package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.h2;

public final class e2 {
   public static byte n5(String var0, int var1, h2 var2) {
      int var3 = x8.n5(var0, var1, var2);
      if ((var1 & 512) != 0) {
         if (var3 >= 0 && var3 <= 255) {
            return (byte)var3;
         }
      } else if (var3 <= 127 && var3 >= -128) {
         return (byte)var3;
      }

      throw new OverflowException("Value too large or too small.");
   }
}
