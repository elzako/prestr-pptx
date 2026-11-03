package com.aspose.slides;

class c7t {
   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0) {
      o3 var1 = o3.n5(var0);
      return l5g.n5(var1, n5(var1));
   }

   private static byte n5(o3 var0) {
      float[] var1 = new float[256];
      int[] var2 = l6(var0);

      for (int var3 = 1; var3 < 255; var3++) {
         float var4 = n5(0, var3, var2);
         float var5 = n5(var3 + 1, 255, var2);
         float var6 = var4 * var5;
         if (var6 == 0.0F) {
            var6 = 1.0F;
         }

         float var7 = l6(0, var3, var2) * var5 - l6(var3 + 1, 255, var2) * var4;
         var1[var3] = var7 * var7 / var6;
      }

      return (byte)n5(var1, 256);
   }

   private static int[] l6(o3 var0) {
      int[] var1 = new int[256];

      for (int var2 = 0; var2 < var0.l6(); var2++) {
         for (int var3 = 0; var3 < var0.n5(); var3++) {
            var1[var0.n5(var3, var2) & 0xFF]++;
         }
      }

      return var1;
   }

   private static float n5(int var0, int var1, int[] var2) {
      int var3 = 0;

      for (int var4 = var0; var4 <= var1; var4++) {
         var3 += var2[var4];
      }

      return var3;
   }

   private static float l6(int var0, int var1, int[] var2) {
      int var3 = 0;

      for (int var4 = var0; var4 <= var1; var4++) {
         var3 += var4 * var2[var4];
      }

      return var3;
   }

   private static int n5(float[] var0, int var1) {
      float var2 = 0.0F;
      int var3 = 0;

      for (int var4 = 1; var4 < var1 - 1; var4++) {
         if (var0[var4] > var2) {
            var2 = var0[var4];
            var3 = var4;
         }
      }

      return var3;
   }
}
