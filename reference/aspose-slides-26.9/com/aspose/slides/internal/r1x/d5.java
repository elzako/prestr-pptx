package com.aspose.slides.internal.r1x;

public class d5 {
   public static long n5(long var0) {
      long var2 = var0;
      long var4 = 4L - ((var0 & 4294967295L) % 4L & 4294967295L) & 4294967295L;
      if ((var4 & 4294967295L) != 4L) {
         var2 = (var2 & 4294967295L) + (var4 & 4294967295L) & 4294967295L;
      }

      return var2;
   }
}
