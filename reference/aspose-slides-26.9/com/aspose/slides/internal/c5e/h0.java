package com.aspose.slides.internal.c5e;

import com.aspose.slides.internal.l7h.j5;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

public class h0 {
   public static j5 n5 = j5.k5("ISO-8859-1");
   public static j5 l6 = j5.k5("UTF-8");
   static boolean k5 = false;
   private static final ThreadLocal<CRC32> u3 = new c8();

   public static byte[] n5() {
      return new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
   }

   public static int n5(double var0) {
      return (int)(var0 * 100000.0 + 0.5);
   }

   public static double n5(int var0) {
      return var0 / 100000.0;
   }

   public static int n5(InputStream var0) {
      try {
         return var0.read();
      } catch (IOException var2) {
         throw new z1("error reading byte", var2);
      }
   }

   public static int l6(InputStream var0) {
      try {
         int var1 = var0.read();
         int var2 = var0.read();
         int var3 = var0.read();
         int var4 = var0.read();
         return var1 != -1 && var2 != -1 && var3 != -1 && var4 != -1 ? (var1 << 24) + (var2 << 16) + (var3 << 8) + var4 : -1;
      } catch (IOException var5) {
         throw new z1("error reading readInt4", var5);
      }
   }

   public static int n5(byte[] var0, int var1) {
      return var0[var1] & 0xFF;
   }

   public static int l6(byte[] var0, int var1) {
      return (var0[var1] & 0xFF) << 8 | var0[var1 + 1] & 0xFF;
   }

   public static int k5(byte[] var0, int var1) {
      return (var0[var1] & 0xFF) << 24 | (var0[var1 + 1] & 0xFF) << 16 | (var0[var1 + 2] & 0xFF) << 8 | var0[var1 + 3] & 0xFF;
   }

   public static void n5(InputStream var0, byte[] var1, int var2, int var3) {
      if (var3 != 0) {
         try {
            int var4 = 0;

            while (var4 < var3) {
               int var5 = var0.read(var1, var2 + var4, var3 - var4);
               if (var5 < 1) {
                  throw new z1("error reading bytes, " + var5 + " !=" + var3);
               }

               var4 += var5;
            }
         } catch (IOException var6) {
            throw new z1("error reading", var6);
         }
      }
   }

   public static void n5(InputStream var0, int var1) {
      byte[] var2 = new byte[32768];
      int var3 = var1;

      try {
         while (var3 > 0) {
            int var4 = var0.read(var2, 0, var3 > var2.length ? var2.length : var3);
            if (var4 < 0) {
               throw new z1("error reading (skipping) : EOF");
            }

            var3 -= var4;
         }
      } catch (IOException var6) {
         throw new z1("error reading (skipping)", var6);
      }
   }

   public static CRC32 l6() {
      return u3.get();
   }

   static final int n5(int var0, int var1, int var2) {
      int var3 = var0 + var1 - var2;
      int var4 = var3 >= var0 ? var3 - var0 : var0 - var3;
      int var5 = var3 >= var1 ? var3 - var1 : var1 - var3;
      int var6 = var3 >= var2 ? var3 - var2 : var2 - var3;
      if (var4 <= var5 && var4 <= var6) {
         return var0;
      } else {
         return var5 <= var6 ? var1 : var2;
      }
   }
}
