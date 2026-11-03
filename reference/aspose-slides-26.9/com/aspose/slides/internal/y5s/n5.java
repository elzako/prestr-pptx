package com.aspose.slides.internal.y5s;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.ms.System.j8;

public class n5 {
   private static int n5;

   public static int n5() {
      return n5;
   }

   public static byte[] n5(long var0) {
      if (var0 <= 0L) {
         throw new ArgumentOutOfRangeException("bytesCount", "Expected positive number of bytes.");
      }

      long var2 = var0;
      byte[] var4 = null;
      byte var5 = 2;

      while (var4 == null) {
         try {
            if (n5() > 0 && var2 > n5()) {
               throw new OutOfMemoryException();
            }

            var4 = new byte[(int)var2];
         } catch (OutOfMemoryError var9) {
            long var7 = var2 / var5;
            if (var2 > 1L && var7 == 0L) {
               var7 = 1L;
            }

            var2 = var7;
            var5 <<= 1;
            if (var2 == 0L) {
               throw var9;
            }
         }
      }

      return var4;
   }

   public static byte[] n5(byte[] var0, int var1, int var2, byte[] var3, j5 var4, boolean var5) {
      int var6 = var4.t2();
      int var7 = var4.h0();
      int var8 = var4.c8();
      int var9 = var4.s7();
      int var10 = var4.a6();
      int var11 = var4.u9();
      if (var7 == 0 && var6 == var1 && var8 == 0 && var9 == var2) {
         if (var5) {
            int var16 = var1 * var2;
            com.aspose.slides.ms.System.y4.n5(var0, 0, var3, 0, var16);
         } else {
            var3 = var0;
         }
      } else {
         boolean var12 = var7 == 0 && var6 == var1;
         if (var12) {
            int var13 = var8 * var1;
            int var14 = var10 * var11;
            com.aspose.slides.ms.System.y4.n5(var0, var13, var3, 0, var14);
         } else {
            int var17 = var8 * var1 + var7;

            for (int var18 = 0; var18 < var11; var18++) {
               int var15 = var17 + var18 * var1;
               com.aspose.slides.ms.System.y4.n5(var0, var15, var3, var18 * var10, var10);
            }
         }
      }

      return var3;
   }

   public static boolean l6(long var0) {
      boolean var2 = false;
      List var3 = new List();

      try {
         while (var0 > 0L) {
            long var4 = var0;
            if (var4 > 2147483646L) {
               var4 = 2147483646L;
            }

            var0 -= var4;
            byte[] var6 = new byte[(int)var4];
            var3.addItem(var6);
         }

         var2 = true;
      } catch (OutOfMemoryError var12) {
      } finally {
         if (!j8.l6(var3, null)) {
            for (int var9 = var3.size() - 1; var9 >= 0; var9--) {
               var3.set_Item(var9, null);
            }

            Object var14 = null;
         }
      }

      return var2;
   }
}
