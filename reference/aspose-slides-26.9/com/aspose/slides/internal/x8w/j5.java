package com.aspose.slides.internal.x8w;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.o8m.a7;
import com.aspose.slides.internal.o8m.f2;
import com.aspose.slides.internal.o8m.i9;
import com.aspose.slides.internal.o8m.l4;
import com.aspose.slides.internal.o8m.r1;
import com.aspose.slides.internal.o8m.s4;
import com.aspose.slides.internal.o8m.z6;
import com.aspose.slides.ms.System.w5;

public final class j5 {
   private static byte[] n5 = new byte[]{-38, 57, -93, -18, 94, 107, 75, 13, 50, 85, -65, -17, -107, 96, 24, -112, -81, -40, 7, 9};
   private static byte[] l6 = new byte[]{
      -29, -80, -60, 66, -104, -4, 28, 20, -102, -5, -12, -56, -103, 111, -71, 36, 39, -82, 65, -28, 100, -101, -109, 76, -92, -107, -103, 27, 120, 82, -72, 85
   };
   private static byte[] k5 = new byte[]{
      56,
      -80,
      96,
      -89,
      81,
      -84,
      -106,
      56,
      76,
      -39,
      50,
      126,
      -79,
      -79,
      -29,
      106,
      33,
      -3,
      -73,
      17,
      20,
      -66,
      7,
      67,
      76,
      12,
      -57,
      -65,
      99,
      -10,
      -31,
      -38,
      39,
      78,
      -34,
      -65,
      -25,
      111,
      101,
      -5,
      -43,
      26,
      -46,
      -15,
      72,
      -104,
      -71,
      91
   };
   private static byte[] u3 = new byte[]{
      -49,
      -125,
      -31,
      53,
      126,
      -17,
      -72,
      -67,
      -15,
      84,
      40,
      80,
      -42,
      109,
      -128,
      7,
      -42,
      32,
      -28,
      5,
      11,
      87,
      21,
      -36,
      -125,
      -12,
      -87,
      33,
      -45,
      108,
      -23,
      -50,
      71,
      -48,
      -47,
      60,
      93,
      -123,
      -14,
      -80,
      -1,
      -125,
      24,
      -46,
      -121,
      126,
      -20,
      47,
      99,
      -71,
      49,
      -67,
      71,
      65,
      122,
      -127,
      -91,
      56,
      50,
      122,
      -7,
      39,
      -38,
      62
   };

   private static boolean n5(byte[] var0, byte[] var1) {
      boolean var2 = var0.length == var1.length;
      if (var2) {
         for (int var3 = 0; var3 < var0.length; var3++) {
            if (var0[var3] != var1[var3]) {
               return false;
            }
         }
      }

      return var2;
   }

   private static byte[] l6(byte[] var0, byte[] var1) {
      byte[] var2 = new byte[var0.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = (byte)(var0[var3] & 0xFF ^ var1[var3] & 0xFF);
      }

      return var2;
   }

   private static byte[] n5(f2 var0) {
      if (var0 instanceof s4) {
         return n5;
      } else if (var0 instanceof l4) {
         return l6;
      } else if (var0 instanceof a7) {
         return k5;
      } else {
         return var0 instanceof r1 ? u3 : var0.l6((byte[])null);
      }
   }

   public static byte[] n5(int var0, int var1) {
      byte[] var2 = com.aspose.slides.ms.System.x8.l6(var0);
      w5.n5(var2, 0, var2.length);
      return n5(var2, var1);
   }

   public static byte[] n5(byte[] var0, int var1) {
      byte[] var2 = new byte[var1];
      com.aspose.slides.ms.System.y4.n5(var0, 0, var2, var2.length - var0.length, var0.length);
      return var2;
   }

   public static byte[] n5(byte[] var0) {
      int var1 = 0;

      while (var0[var1++] == 0 && var1 < var0.length) {
      }

      if (--var1 > 0) {
         byte[] var2 = new byte[var0.length - var1];
         com.aspose.slides.ms.System.y4.n5(var0, var1, var2, 0, var2.length);
         return var2;
      } else {
         return var0;
      }
   }

   public static byte[] n5(z6 var0, byte[] var1) {
      return var0.n5(var1);
   }

   public static byte[] l6(z6 var0, byte[] var1) {
      return var0.l6(var1);
   }

   public static byte[] k5(z6 var0, byte[] var1) {
      return var0.l6(var1);
   }

   public static byte[] u3(z6 var0, byte[] var1) {
      return var0.n5(var1);
   }

   public static byte[] n5(z6 var0, f2 var1, byte[] var2) {
      int var3 = var0.n5() / 8;
      int var4 = var1.y4() / 8;
      if (var3 >= 2 * var4 + 2 && var2.length == var3) {
         byte[] var5 = n5(var2);
         byte[] var6 = l6(var0, var5);
         byte[] var7 = n5(var6, var3);
         byte[] var8 = new byte[var4];
         com.aspose.slides.ms.System.y4.n5(var7, 1, var8, 0, var8.length);
         byte[] var9 = new byte[var3 - var4 - 1];
         com.aspose.slides.ms.System.y4.n5(var7, var7.length - var9.length, var9, 0, var9.length);
         byte[] var10 = l6(var1, var9, var4);
         byte[] var11 = l6(var8, var10);
         byte[] var12 = l6(var1, var11, var3 - var4 - 1);
         byte[] var13 = l6(var9, var12);
         byte[] var14 = n5(var1);
         byte[] var15 = new byte[var14.length];
         com.aspose.slides.ms.System.y4.n5(var13, 0, var15, 0, var15.length);
         boolean var16 = n5(var14, var15);
         int var17 = var14.length;

         while (var13[var17] == 0) {
            var17++;
         }

         int var18 = var13.length - var17 - 1;
         byte[] var19 = new byte[var18];
         com.aspose.slides.ms.System.y4.n5(var13, var17 + 1, var19, 0, var18);
         return var7[0] == 0 && var16 && var13[var17] == 1 ? var19 : null;
      } else {
         throw new CryptographicException("decryption error");
      }
   }

   public static byte[] n5(z6 var0, i9 var1, byte[] var2) {
      int var3 = var0.n5() / 8;
      if (var2.length > var3 - 11) {
         throw new CryptographicException("message too long");
      }

      int var4 = Math.max(8, var3 - var2.length - 3);
      byte[] var5 = new byte[var4];
      var1.l6(var5);
      byte[] var6 = new byte[var3];
      var6[1] = 2;
      com.aspose.slides.ms.System.y4.n5(var5, 0, var6, 2, var4);
      com.aspose.slides.ms.System.y4.n5(var2, 0, var6, var3 - var2.length, var2.length);
      byte[] var7 = n5(var6);
      byte[] var8 = n5(var0, var7);
      return n5(var8, var3);
   }

   public static byte[] a6(z6 var0, byte[] var1) {
      int var2 = var0.n5() >> 3;
      if (var2 >= 11 && var1.length <= var2) {
         byte[] var3 = n5(var1);
         byte[] var4 = l6(var0, var3);
         byte[] var5 = n5(var4, var2);
         if (var5[0] == 0 && var5[1] == 2) {
            int var6 = 10;

            while (var5[var6] != 0 && var6 < var5.length) {
               var6++;
            }

            if (var5[var6] != 0) {
               return null;
            }

            var6++;
            byte[] var7 = new byte[var5.length - var6];
            com.aspose.slides.ms.System.y4.n5(var5, var6, var7, 0, var7.length);
            return var7;
         } else {
            return null;
         }
      } else {
         throw new CryptographicException("decryption error");
      }
   }

   public static byte[] l6(z6 var0, f2 var1, byte[] var2) {
      int var3 = var0.n5() >> 3;
      byte[] var4 = n5(var1, var2, var3);
      byte[] var5 = n5(var4);
      byte[] var6 = k5(var0, var5);
      return n5(var6, var3);
   }

   public static boolean n5(z6 var0, f2 var1, byte[] var2, byte[] var3) {
      return n5(var0, var1, var2, var3, false);
   }

   public static boolean n5(z6 var0, f2 var1, byte[] var2, byte[] var3, boolean var4) {
      int var5 = var0.n5() >> 3;
      byte[] var6 = n5(var3);
      byte[] var7 = u3(var0, var6);
      byte[] var8 = n5(var7, var5);
      byte[] var9 = n5(var1, var2, var5);
      boolean var10 = n5(var9, var8);
      if (!var10 && var4) {
         if (var8[0] == 0 && var8[1] == 1) {
            int var11;
            for (var11 = 2; var11 < var8.length - var2.length - 1; var11++) {
               if ((var8[var11] & 255) != 255) {
                  return false;
               }
            }

            if (var8[var11++] != 0) {
               return false;
            }

            byte[] var12 = new byte[var2.length];
            com.aspose.slides.ms.System.y4.n5(var8, var11, var12, 0, var12.length);
            return n5(var12, var2);
         } else {
            return false;
         }
      } else {
         return var10;
      }
   }

   public static byte[] n5(f2 var0, byte[] var1, int var2) {
      if (var1.length != var0.y4() >> 3) {
         throw new CryptographicException("bad hash length for " + var0.toString());
      }

      byte[] var3 = null;
      String var4 = com.aspose.slides.internal.o8m.y4.l6(var0.toString());
      if (var4 != null) {
         l6 var5 = new l6((byte)48);
         var5.n5(new l6(com.aspose.slides.internal.o8m.y4.k5(var4)));
         var5.n5(new l6((byte)5));
         l6 var6 = new l6((byte)4, var1);
         l6 var7 = new l6((byte)48);
         var7.n5(var5);
         var7.n5(var6);
         var3 = var7.a6();
      } else {
         var3 = var1;
      }

      com.aspose.slides.ms.System.y4.n5(var1, 0, var3, var3.length - var1.length, var1.length);
      int var9 = Math.max(8, var2 - var3.length - 3);
      byte[] var10 = new byte[var9 + var3.length + 3];
      var10[1] = 1;

      for (int var11 = 2; var11 < var9 + 2; var11++) {
         var10[var11] = -1;
      }

      com.aspose.slides.ms.System.y4.n5(var3, 0, var10, var9 + 3, var3.length);
      return var10;
   }

   public static byte[] l6(f2 var0, byte[] var1, int var2) {
      if (var2 < 0) {
         throw new OverflowException();
      }

      int var3 = var1.length;
      int var4 = var0.y4() >> 3;
      int var5 = var2 / var4;
      if (var2 % var4 != 0) {
         var5++;
      }

      byte[] var6 = new byte[var5 * var4];
      byte[] var7 = new byte[var3 + 4];
      int var8 = 0;

      for (int var9 = 0; var9 < var5; var9++) {
         byte[] var10 = n5(var9, 4);
         com.aspose.slides.ms.System.y4.n5(var1, 0, var7, 0, var3);
         com.aspose.slides.ms.System.y4.n5(var10, 0, var7, var3, 4);
         byte[] var11 = var0.l6(var7);
         com.aspose.slides.ms.System.y4.n5(var11, 0, var6, var8, var4);
         var8 += var3;
      }

      byte[] var12 = new byte[var2];
      com.aspose.slides.ms.System.y4.n5(var6, 0, var12, 0, var2);
      return var12;
   }
}
