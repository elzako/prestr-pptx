package com.aspose.slides.internal.n8e;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

class u9 {
   protected static final byte[] n5 = new byte[]{
      65,
      66,
      67,
      68,
      69,
      70,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      78,
      79,
      80,
      81,
      82,
      83,
      84,
      85,
      86,
      87,
      88,
      89,
      90,
      97,
      98,
      99,
      100,
      101,
      102,
      103,
      104,
      105,
      106,
      107,
      108,
      109,
      110,
      111,
      112,
      113,
      114,
      115,
      116,
      117,
      118,
      119,
      120,
      121,
      122,
      48,
      49,
      50,
      51,
      52,
      53,
      54,
      55,
      56,
      57,
      43,
      47
   };
   protected static final byte[] l6 = new byte[256];

   public static byte[] n5(byte[] var0) {
      return n5(var0, 0, var0.length, false);
   }

   public static byte[] n5(byte[] var0, int var1, int var2, boolean var3) {
      ByteArrayInputStream var4 = new ByteArrayInputStream(var0, var1, var2);
      int var5 = var0.length;
      int var6;
      if ((var6 = var5 % 3) != 0) {
         var5 += 3 - var6;
      }

      var5 = var5 * 4 / 3;
      ByteArrayOutputStream var7 = new ByteArrayOutputStream(var5);

      try {
         n5(var4, var7, var3);
      } catch (IOException var9) {
         throw new RuntimeException(var9);
      }

      return var7.toByteArray();
   }

   public static void n5(InputStream var0, OutputStream var1, boolean var2) throws IOException {
      int[] var3 = new int[3];
      byte var4 = 0;
      boolean var5 = false;

      while (!var5 && (var3[0] = var0.read()) != -1) {
         var3[1] = var0.read();
         var3[2] = var0.read();
         var1.write(n5[var3[0] >> 2]);
         if (var3[1] != -1) {
            var1.write(n5[var3[0] << 4 & 48 | var3[1] >> 4]);
            if (var3[2] != -1) {
               var1.write(n5[var3[1] << 2 & 60 | var3[2] >> 6]);
               var1.write(n5[var3[2] & 63]);
            } else {
               var1.write(n5[var3[1] << 2 & 60]);
               var1.write(61);
               var5 = true;
            }
         } else {
            var1.write(n5[var3[0] << 4 & 48]);
            var1.write(61);
            var1.write(61);
            var5 = true;
         }

         var4 += 4;
         if (var2 && var4 >= 76) {
            var1.write(10);
            var4 = 0;
         }
      }

      if (var2 && var4 >= 1) {
         var1.write(10);
         boolean var6 = false;
      }

      var1.flush();
   }

   public static byte[] n5(String var0) {
      return l6(var0.getBytes());
   }

   public static byte[] l6(byte[] var0) {
      ByteArrayInputStream var1 = new ByteArrayInputStream(var0);
      int var2 = var0.length;
      int var3;
      if ((var3 = var2 % 4) != 0) {
         var2 += 4 - var3;
      }

      var2 = var2 * 3 / 4;
      ByteArrayOutputStream var4 = new ByteArrayOutputStream(var2);

      try {
         l6(var1, var4, false);
      } catch (IOException var6) {
         throw new RuntimeException(var6);
      }

      return var4.toByteArray();
   }

   private static final int n5(InputStream var0, boolean var1) throws IOException {
      int var2 = 0;

      int var4;
      do {
         var4 = var0.read();
         if (var4 == -1) {
            return -1;
         }

         var4 = l6[(byte)var4];
         if (var1 && (var4 == -1 || var2 > 0 && var4 > -1)) {
            throw new IOException("Unexpected char");
         }

         if (var4 == -3) {
            var2++;
         }
      } while (var4 <= -1);

      return var4;
   }

   public static void l6(InputStream var0, OutputStream var1, boolean var2) throws IOException {
      int[] var3 = new int[4];
      boolean var4 = false;

      while (!var4 && (var3[0] = n5(var0, var2)) != -1 && (var3[1] = n5(var0, var2)) != -1) {
         var3[2] = n5(var0, var2);
         var3[3] = n5(var0, var2);
         var1.write(var3[0] << 2 | var3[1] >> 4);
         if (var3[2] != -1) {
            var1.write(var3[1] << 4 | var3[2] >> 2);
            if (var3[3] != -1) {
               var1.write(var3[2] << 6 | var3[3]);
            } else {
               var4 = true;
            }
         } else {
            var4 = true;
         }
      }

      var1.flush();
   }

   static {
      for (int var0 = 0; var0 < l6.length; var0++) {
         l6[var0] = -1;
      }

      byte var1 = 0;

      while (var1 < n5.length) {
         l6[n5[var1]] = var1++;
      }

      l6[32] = -2;
      l6[10] = -2;
      l6[13] = -2;
      l6[9] = -2;
      l6[12] = -2;
      l6[61] = -3;
   }
}
