package com.aspose.slides.internal.n2d;

public class a6 {
   public static int n5(int var0) {
      return (int)n5(var0 & 4294967295L);
   }

   public static long n5(long var0) {
      return (
            (var0 & 4294967295L & 255L & 4294967295L) << 24
               | (var0 & 4294967295L & 65280L & 4294967295L) << 8
               | (var0 & 4294967295L & 16711680L & 4294967295L) >> 8
               | (var0 & 4278190080L & 4294967295L) >> 24
         )
         & 4294967295L;
   }

   public static short n5(short var0) {
      return (short)l6(var0 & 65535);
   }

   public static int l6(int var0) {
      return ((var0 & 65535 & 0xFF) << 8 | (var0 & 65535 & 0xFF00) >> 8) & 65535;
   }
}
