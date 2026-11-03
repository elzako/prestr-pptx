package com.aspose.slides.internal.n8e;

class t1 {
   public static byte[] n5(byte[] var0) {
      int var1 = 0;

      while (var1 < var0.length - 1 && var0[var1] == 0) {
         var1++;
      }

      if (var1 > 0) {
         byte[] var2 = new byte[var0.length - var1];
         n5(var0, var1, var2, 0, var2.length);
         return var2;
      } else {
         return var0;
      }
   }

   public static byte[] n5(byte[] var0, int var1) {
      byte[] var2 = new byte[var1];
      n5(var0, 0, var2, var2.length - var0.length, var0.length);
      return var2;
   }

   public static byte[] n5(j8 var0, byte[] var1) {
      return var0.n5(var1);
   }

   private static void n5(Object var0, int var1, Object var2, int var3, int var4) {
      if (var3 < 0) {
         System.arraycopy(var0, var1 - var3, var2, 0, var4 + var3);
      } else {
         System.arraycopy(var0, var1, var2, var3, var4);
      }
   }
}
