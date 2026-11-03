package com.aspose.slides.internal.c5e;

public class u3 {
   public static int n5(k5 var0, int var1) {
      int var2 = var1 * var0.a6;
      return (var0.l6[var2] << 16) + (var0.l6[var2 + 1] << 8) + var0.l6[var2 + 2];
   }

   public static int l6(k5 var0, int var1) {
      int var2 = var1 * var0.a6;
      int var3 = var0.l6[var2] >> 8 & 0xFF;
      int var4 = var0.l6[var2 + 1] >> 8 & 0xFF;
      int var5 = var0.l6[var2 + 2] >> 8 & 0xFF;
      return (var3 << 16) + (var4 << 8) + var5;
   }

   public static int k5(k5 var0, int var1) {
      int var2 = var1 * var0.a6;
      return (var0.l6[var2 + 3] << 24) + (var0.l6[var2] << 16) + (var0.l6[var2 + 1] << 8) + var0.l6[var2 + 2];
   }

   public static int u3(k5 var0, int var1) {
      int var2 = var1 * var0.a6;
      int var3 = var0.l6[var2] >> 8 & 0xFF;
      int var4 = var0.l6[var2 + 1] >> 8 & 0xFF;
      int var5 = var0.l6[var2 + 2] >> 8 & 0xFF;
      int var6 = var0.l6[var2 + 3] >> 8 & 0xFF;
      return (var6 << 24) + (var3 << 16) + (var4 << 8) + var5;
   }

   static int n5(int var0) {
      if (var0 == 4) {
         return 15;
      } else {
         return var0 == 2 ? 3 : 1;
      }
   }
}
