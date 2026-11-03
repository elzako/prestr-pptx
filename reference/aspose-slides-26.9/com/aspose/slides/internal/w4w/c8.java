package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.h2;

public final class c8 {
   public static byte n5(String var0, h2 var1) {
      return n5(var0, 7, var1);
   }

   public static byte n5(String var0, int var1, h2 var2) {
      long var3 = t4.n5(var0, var1, var2);
      if (var3 > 255L) {
         throw new OverflowException("Value too large.");
      } else {
         return (byte)(var3 & 4294967295L);
      }
   }
}
