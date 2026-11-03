package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.NotImplementedException;

@Deprecated
public final class l6 {
   private static final String[] n5 = new String[]{
      "",
      "0",
      "00",
      "000",
      "0000",
      "00000",
      "000000",
      "0000000",
      "00000000",
      "000000000",
      "0000000000",
      "0000 0000000",
      "000000000000",
      "0000000000000",
      "00000000000000",
      "00000000000000",
      "0000000000000000"
   };

   public static short n5(byte[] var0, int var1, boolean var2) {
      return (short)n5(var0, var1, 2, var2);
   }

   public static int l6(byte[] var0, int var1, boolean var2) {
      return (int)n5(var0, var1, 4, var2);
   }

   public static float k5(byte[] var0, int var1, boolean var2) {
      return Float.intBitsToFloat(l6(var0, var1, var2));
   }

   public static long u3(byte[] var0, int var1, boolean var2) {
      return n5(var0, var1, 8, var2);
   }

   public static double a6(byte[] var0, int var1, boolean var2) {
      return Double.longBitsToDouble(u3(var0, var1, var2));
   }

   public static int n5(short var0, byte[] var1, int var2, boolean var3) {
      return n5(var0, var1, var2, 2, var3);
   }

   public static int n5(int var0, byte[] var1, int var2, boolean var3) {
      return n5(var0, var1, var2, 4, var3);
   }

   public static int n5(float var0, byte[] var1, int var2, boolean var3) {
      return n5(Float.floatToIntBits(var0), var1, var2, 4, var3);
   }

   public static int n5(long var0, byte[] var2, int var3, boolean var4) {
      return n5(var0, var2, var3, 8, var4);
   }

   public static int n5(double var0, byte[] var2, int var3, boolean var4) {
      return n5(Double.doubleToLongBits(var0), var2, var3, 8, var4);
   }

   public static byte[] n5(short var0, boolean var1) {
      byte[] var2 = new byte[2];
      n5(var0, var2, 0, var1);
      return var2;
   }

   public static byte[] n5(int var0, boolean var1) {
      byte[] var2 = new byte[4];
      n5(var0, var2, 0, var1);
      return var2;
   }

   public static byte[] n5(float var0, boolean var1) {
      byte[] var2 = new byte[4];
      n5(var0, var2, 0, var1);
      return var2;
   }

   public static byte[] n5(long var0, boolean var2) {
      byte[] var3 = new byte[8];
      n5(var0, var3, 0, var2);
      return var3;
   }

   public static byte[] n5(double var0, boolean var2) {
      byte[] var3 = new byte[8];
      n5(var0, var3, 0, var2);
      return var3;
   }

   private static long n5(byte[] var0, int var1, int var2, boolean var3) {
      long var4 = 0L;
      if (var3) {
         if (var1 % 8 != 0) {
            throw new NotImplementedException();
         }

         int var17 = var1 / 8;

         for (int var19 = var2 - 1; var19 >= 0; var19--) {
            var4 <<= 8;
            var4 |= var0[var17 + var19] & 0xFF;
         }

         return var4;
      } else if (var1 % 8 == 0) {
         int var16 = var1 / 8;

         for (int var18 = 0; var18 < var2; var18++) {
            var4 <<= 8;
            var4 |= var0[var16 + var18] & 0xFF;
         }

         return var4;
      } else {
         int var6 = var1 % 8;
         int var7 = 8 - var6;
         int var8 = var1 / 8;

         for (int var9 = 0; var9 < var2; var9++) {
            var4 <<= 8;
            byte var10 = var0[var8 + var9];
            byte var11 = var0[var8 + var9 + 1];
            var10 = (byte)(var10 << var6);
            var11 = (byte)((var11 & 255) >> var7);
            var4 |= var10 & 0xFF;
            var4 |= var11 & 0xFF;
         }

         return var4;
      }
   }

   private static int n5(long var0, byte[] var2, int var3, int var4, boolean var5) {
      int var6 = var3 / 8;
      if (var5) {
         if (var3 % 8 != 0) {
            throw new NotImplementedException();
         }

         for (int var7 = 0; var7 < var4; var7++) {
            var2[var6 + var7] = (byte)(var0 & 255L);
            var0 >>>= 8;
         }
      } else if (var3 % 8 == 0) {
         for (int var15 = var4 - 1; var15 >= 0; var15--) {
            var2[var6 + var15] = (byte)(var0 & 255L);
            var0 >>>= 8;
         }
      } else {
         int var16 = var3 % 8;
         int var8 = 8 - var16;
         byte var9 = (byte)(255 << var8);
         byte var10 = (byte)(255 >>> var16);

         for (int var11 = var4 - 1; var11 >= 0; var11--) {
            byte var12 = var2[var6 + var11 + 1];
            byte var13 = var2[var6 + var11];
            byte var14 = (byte)(var0 & 255L);
            var12 = (byte)(var12 & var10);
            var13 = (byte)(var13 & var9);
            var12 = (byte)(var12 | var14 << var8);
            var13 = (byte)(var13 | (var14 & 255) >> var16);
            var2[var6 + var11 + 1] = var12;
            var2[var6 + var11] = var13;
            var0 >>>= 8;
         }
      }

      return var4;
   }

   public static String n5(byte[] var0, l6$l6 var1, l6$k5 var2, boolean var3, l6$n5 var4) {
      if (var0 == null) {
         return "<NULL>";
      }

      StringBuffer var5 = new StringBuffer();
      var3 = var3 || var4 == l6$n5.l6 || var4 == l6$n5.k5;
      if (var3) {
         var5.append("{ ");
      }

      for (int var6 = 0; var6 < var0.length; var6++) {
         byte var7 = var0[var6];
         if (var6 != 0) {
            var5.append(var2.n5());
         }

         if (l6$l6.n5 == var1) {
            String var8 = Integer.toHexString(var7 & 255);
            if (var8.length() < 2) {
               var5.append("0");
            }

            var5.append(var8.toUpperCase());
         } else if (l6$l6.l6 == var1) {
            var5.append("0x");
            String var13 = Integer.toHexString(var7 & 255);
            if (var13.length() < 2) {
               var5.append("0");
            }

            var5.append(var13.toUpperCase());
         } else if (l6$l6.k5 == var1) {
            var5.append("(byte)0x");
            String var14 = Integer.toHexString(var7 & 255);
            if (var14.length() < 2) {
               var5.append("0");
            }

            var5.append(var14.toUpperCase());
         } else if (l6$l6.u3 == var1) {
            var5.append(Long.toString(var7));
         }
      }

      if (var3) {
         var5.append(" }");
      }

      String var10 = var4.n5();
      if (var10 != null && !"".equals(var10)) {
         var10 = var10.replace("${0}", "" + var0.length);
         var10 = var10.replace("${1}", "" + 8 * var0.length);
         return var10.replace("${2}", var5.toString());
      } else {
         return var5.toString();
      }
   }

   public static void n5(byte[] var0) {
      if (var0 != null) {
         int var1 = 0;

         for (int var2 = var0.length - 1; var2 > var1; var1++) {
            byte var3 = var0[var2];
            var0[var2] = var0[var1];
            var0[var1] = var3;
            var2--;
         }
      }
   }
}
