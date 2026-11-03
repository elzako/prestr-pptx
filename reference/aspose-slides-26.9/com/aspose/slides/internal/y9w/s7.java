package com.aspose.slides.internal.y9w;

public class s7 {
   public static long n5(long var0, boolean var2) {
      return var2 ? ((var0 & 4294967295L) + 1L & 4294967295L) * 512L & 4294967295L : (var0 & 4294967295L) * 64L & 4294967295L;
   }

   public static long l6(long var0, boolean var2) {
      return var2 ? var0 / 512L - 1L & 4294967295L : var0 / 64L & 4294967295L;
   }

   public static void n5(com.aspose.slides.internal.z0k.l6 var0) {
      while (var0.n5().getPosition() % 512L != 0L) {
         var0.n5(4294967295L);
      }
   }
}
