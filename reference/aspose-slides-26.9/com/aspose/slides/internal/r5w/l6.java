package com.aspose.slides.internal.r5w;

public final class l6 {
   public static byte[] n5(int[] var0, byte[] var1) {
      if (var0 == null) {
         return null;
      }

      if (var0.length == 0) {
         return new byte[0];
      }

      byte[] var2 = var1 == null ? new byte[var0.length] : var1;

      for (int var3 = 0; var3 < var0.length; var3++) {
         var2[var3] = (byte)var0[var3];
      }

      return var2;
   }
}
