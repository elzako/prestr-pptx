package com.aspose.slides.internal.r6a;

public class t2 {
   public static int[] n5;
   public static int[] l6;
   public static int[] k5;
   public static int[] u3;

   private static int n5(double var0) {
      return (int)(var0 * 8192.0 + 0.5);
   }

   private static void n5() {
      u3 = new int[256];
      n5 = new int[256];
      k5 = new int[256];
      l6 = new int[256];
      int var0 = 0;

      for (int var1 = -128; var0 <= 255; var1++) {
         u3[var0] = n5(1.402) * var1 + 4096 >> 13;
         n5[var0] = n5(1.772) * var1 + 4096 >> 13;
         k5[var0] = -n5(0.71414) * var1;
         l6[var0] = -n5(0.34414) * var1 + 4096;
         var0++;
      }
   }

   static {
      n5();
   }
}
