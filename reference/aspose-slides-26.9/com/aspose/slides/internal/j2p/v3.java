package com.aspose.slides.internal.j2p;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.o8m.q1;
import com.aspose.slides.internal.o8m.u8;
import com.aspose.slides.ms.System.IDisposable;

public class v3 {
   private static final byte[] n5 = new byte[]{74, -35, -94, 44, 121, -24, 33, 5};
   private static final byte[] l6 = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};

   public static byte[] n5(byte[] var0, byte[] var1) {
      if (var1.length != 32 && var1.length != 40 && var1.length != 48) {
         throw new CryptographicException("The length of the encrypted data in Key Wrap is either 32, 40 or 48 bytes.");
      }

      q1 var2 = null;
      com.aspose.slides.internal.o8m.i1 var3 = null;
      com.aspose.slides.internal.o8m.i1 var4 = null;

      try {
         var2 = q1.k5();
         var2.u3(1);
         var3 = var2.l6(var0, n5);
         byte[] var5 = var3.n5(var1, 0, var1.length);
         com.aspose.slides.internal.w4w.l6.n5(var5);
         byte[] var6 = new byte[8];
         System.arraycopy(var5, 0, var6, 0, 8);
         byte[] var7 = new byte[var5.length - var6.length];
         System.arraycopy(var5, 8, var7, 0, var7.length);
         var4 = var2.l6(var0, var6);
         byte[] var8 = var4.n5(var7, 0, var7.length);
         byte[] var9 = new byte[var8.length - 8];
         System.arraycopy(var8, 0, var9, 0, var9.length);
         com.aspose.slides.internal.o8m.s4 var10 = com.aspose.slides.internal.o8m.s4.a6();

         try {
            byte[] var11 = var10.l6(var9);
            int var12 = var9.length;

            for (int var13 = 0; var12 < var8.length; var13++) {
               if ((var8[var12] & 255) != (var11[var13] & 255)) {
                  throw new CryptographicException("Bad wrapped key size.");
               }

               var12++;
            }

            return var9;
         } finally {
            if (var10 != null && com.aspose.slides.internal.v6g.k5.l6(var10, IDisposable.class)) {
               var10.dispose();
            }
         }
      } finally {
         if (var4 != null && com.aspose.slides.internal.v6g.k5.l6(var4, IDisposable.class)) {
            var4.dispose();
         }

         if (var3 != null && com.aspose.slides.internal.v6g.k5.l6(var3, IDisposable.class)) {
            var3.dispose();
         }

         if (var2 != null && com.aspose.slides.internal.v6g.k5.l6(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public static byte[] l6(byte[] var0, byte[] var1) {
      int var2 = (var1.length >> 3) - 1;
      if (var1.length % 8 == 0 && var2 > 0) {
         byte[] var3 = new byte[var2 << 3];
         u8 var4 = null;
         com.aspose.slides.internal.o8m.i1 var5 = null;

         try {
            var4 = com.aspose.slides.internal.o8m.n5.z1();
            var4.k5(var0);
            var4.k5(2);
            var4.u3(1);
            var5 = var4.e2();
            if (var2 == 1) {
               byte[] var6 = var5.n5(var1, 0, var1.length);

               for (int var7 = 0; var7 < 8; var7++) {
                  if ((var6[var7] & 255) != (l6[var7] & 255)) {
                     throw new CryptographicException("Bad wrapped key size.");
                  }
               }

               System.arraycopy(var6, 8, var3, 0, 8);
               return var3;
            } else {
               long var8 = 0L;
               System.arraycopy(var1, 8, var3, 0, var3.length);
               byte[] var10 = new byte[8];
               byte[] var11 = new byte[16];
               System.arraycopy(var1, 0, var10, 0, 8);

               for (int var12 = 5; var12 >= 0; var12--) {
                  for (int var13 = var2; var13 >= 1; var13--) {
                     var8 = var13 + var12 * var2;

                     for (int var14 = 0; var14 < 8; var14++) {
                        byte var15 = (byte)(var8 >> 8 * (7 - var14) & 255L);
                        var10[var14] = (byte)(var10[var14] & 0xFF ^ var15 & 0xFF);
                     }

                     System.arraycopy(var10, 0, var11, 0, 8);
                     System.arraycopy(var3, 8 * (var13 - 1), var11, 8, 8);
                     byte[] var21 = var5.n5(var11, 0, 16);
                     System.arraycopy(var21, 8, var3, 8 * (var13 - 1), 8);
                     System.arraycopy(var21, 0, var10, 0, 8);
                  }
               }

               for (int var20 = 0; var20 < 8; var20++) {
                  if ((var10[var20] & 255) != (l6[var20] & 255)) {
                     throw new CryptographicException("Bad wrapped key size.");
                  }
               }

               return var3;
            }
         } finally {
            if (var5 != null && com.aspose.slides.internal.v6g.k5.l6(var5, IDisposable.class)) {
               var5.dispose();
            }

            if (var4 != null && com.aspose.slides.internal.v6g.k5.l6(var5, IDisposable.class)) {
               var4.dispose();
            }
         }
      } else {
         throw new CryptographicException("The length of the encrypted data in Key Wrap is either 32, 40 or 48 bytes.");
      }
   }
}
