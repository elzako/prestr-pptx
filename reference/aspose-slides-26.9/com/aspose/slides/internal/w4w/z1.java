package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.h2;
import com.aspose.slides.ms.System.l4;

public final class z1 {
   public static int n5(String var0, int var1) {
      return n5(var0, var1, null);
   }

   public static int n5(String var0, int var1, h2 var2) {
      long var3 = l4.n5(var0, var1, var2);
      if (var3 > 65535L) {
         throw new OverflowException("Value too large.");
      } else {
         return (int)(var3 & 4294967295L);
      }
   }
}
