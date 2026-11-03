package com.aspose.slides.internal.y5s;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class l6 {
   public static void n5(int var0, byte[] var1, int var2) {
      var1[var2] = (byte)(var0 >> 24 & 0xFF);
      var1[var2 + 1] = (byte)(var0 >> 16 & 0xFF);
      var1[var2 + 2] = (byte)(var0 >> 8 & 0xFF);
      var1[var2 + 3] = (byte)var0;
   }

   public static void n5(long var0, byte[] var2, int var3) {
      var2[var3] = (byte)((var0 & 4294967295L) >> 24 & 255L);
      var2[var3 + 1] = (byte)((var0 & 4294967295L) >> 16 & 255L);
      var2[var3 + 2] = (byte)((var0 & 4294967295L) >> 8 & 255L);
      var2[var3 + 3] = (byte)(var0 & 4294967295L);
   }

   public static void l6(int var0, byte[] var1, int var2) {
      var1[var2] = (byte)((var0 & 65535) >> 8);
      var1[var2 + 1] = (byte)(var0 & 65535);
   }

   public static int n5(byte[] var0, int var1) {
      if (var0 == null) {
         throw new ArgumentNullException("bytes");
      } else if (var1 >= 0 && var1 + 4 <= var0.length) {
         return (var0[var1] & 0xFF) << 24 | (var0[var1 + 1] & 0xFF) << 16 | (var0[var1 + 2] & 0xFF) << 8 | var0[var1 + 3] & 0xFF;
      } else {
         throw new ArgumentOutOfRangeException("index", "The index falls outside the bytes array.");
      }
   }
}
