package com.aspose.slides.internal.r5w;

public class s7 {
   public static int n5(int var0) {
      return var0 >> 16 & 32768 | var0 >> 9 & 31744 | var0 >> 6 & 992 | var0 >> 3 & 31;
   }

   public static int l6(int var0) {
      int var1 = var0 >> 10 & 31;
      var1 = var1 << 3 | var1 >> 2;
      int var2 = var0 >> 5 & 31;
      var2 = var2 << 3 | var2 >> 2;
      int var3 = var0 & 31;
      var3 = var3 << 3 | var3 >> 2;
      int var4 = (var0 >> 15 & 1) == 1 ? 255 : 0;
      return var4 << 24 | var1 << 16 | var2 << 8 | var3;
   }

   public static int k5(int var0) {
      return var0 >> 9 & 31744 | var0 >> 6 & 992 | var0 >> 3 & 31;
   }

   public static int u3(int var0) {
      int var1 = var0 >> 10 & 31;
      var1 = var1 << 3 | var1 >> 2;
      int var2 = var0 >> 5 & 31;
      var2 = var2 << 3 | var2 >> 2;
      int var3 = var0 & 31;
      var3 = var3 << 3 | var3 >> 2;
      return 0xFF000000 | var1 << 16 | var2 << 8 | var3;
   }

   public static int a6(int var0) {
      return var0 >> 8 & 63488 | var0 >> 5 & 2016 | var0 >> 3 & 31;
   }

   public static int u9(int var0) {
      int var1 = var0 >> 11 & 31;
      var1 = var1 << 3 | var1 >> 2;
      int var2 = var0 >> 5 & 63;
      var2 = var2 << 2 | var2 >> 4;
      int var3 = var0 & 31;
      var3 = var3 << 3 | var3 >> 2;
      return 0xFF000000 | var1 << 16 | var2 << 8 | var3;
   }
}
