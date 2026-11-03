package com.aspose.slides.internal.a6z;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.p3;
import com.aspose.slides.ms.System.r8;

@j3
public class n5 {
   private long c8;
   private int t2;
   private int[] s7;
   private long x8;
   public static n5 n5 = new n5(0L);
   public static n5 l6 = n5("255.255.255.255");
   public static n5 k5 = n5("127.0.0.1");
   public static n5 u3 = n5("255.255.255.255");
   public static n5 a6 = k5("::");
   public static n5 u9 = k5("::1");
   public static n5 h0 = k5("::");

   private static short k5(short var0) {
      return (short)(var0 >> 8 & 0xFF | var0 << 8 & 0xFF00);
   }

   public static short n5(short var0) {
      return k5(var0);
   }

   public static short l6(short var0) {
      return k5(var0);
   }

   public n5(long var1) {
      this.c8 = var1;
      this.t2 = 2;
   }

   n5(int[] var1, long var2) {
      this.s7 = var1;

      for (int var4 = 0; var4 < 8; var4++) {
         this.s7[var4] = n5((short)(this.s7[var4] & 65535));
      }

      this.t2 = 23;
      this.x8 = var2;
   }

   public static n5 n5(String var0) {
      n5 var1 = null;
      n5[] var2 = new n5[]{var1};
      boolean var3 = n5(var0, var2);
      var1 = var2[0];
      if (var3) {
         return var1;
      } else {
         throw new FormatException("An invalid IP address was specified.");
      }
   }

   public static boolean n5(String var0, n5[] var1) {
      if (var0 == null) {
         throw new ArgumentNullException("ipString");
      } else {
         return (var1[0] = l6(var0)) != null || (var1[0] = k5(var0)) != null;
      }
   }

   private static n5 l6(String var0) {
      int var1 = d1.u3(var0, ' ');
      if (var1 != -1) {
         var0 = d1.l6(var0, 0, var1);
      }

      if (var0.length() != 0 && var0.charAt(var0.length() - 1) != '.') {
         String[] var2 = d1.u9(var0, '.');
         if (var2.length > 4) {
            return null;
         }

         try {
            long var3 = 0L;
            long var5 = 0L;

            for (int var7 = 0; var7 < var2.length; var7++) {
               String var8 = var2[var7];
               if (3 > var8.length() || var8.length() > 4 || var8.charAt(0) != '0' || var8.charAt(1) != 'x' && var8.charAt(1) != 'X') {
                  if (var8.length() == 0) {
                     return null;
                  }

                  if (var8.charAt(0) == '0') {
                     var5 = 0L;

                     for (int var9 = 1; var9 < var8.length(); var9++) {
                        if ('0' > var8.charAt(var9) || var8.charAt(var9) > '7') {
                           return null;
                        }

                        var5 = (var5 << 3) + var8.charAt(var9) - 48L;
                     }
                  } else {
                     var5 = p3.n5(var8, 0);
                  }
               } else if (var8.length() == 3) {
                  var5 = (byte)r8.n5(var8.charAt(2)) & 0xFF;
               } else {
                  var5 = (byte)(r8.n5(var8.charAt(2)) << 4 | r8.n5(var8.charAt(3))) & 0xFF;
               }

               if (var7 == var2.length - 1) {
                  if (var7 != 0 && var5 >= 256 << (3 - var7) * 8) {
                     return null;
                  }

                  if (var5 > 17179869182L) {
                     return null;
                  }

                  var7 = 3;
               } else if (var5 >= 256L) {
                  return null;
               }

               int var13 = 0;

               while (var5 > 0L) {
                  var3 |= (var5 & 255L) << (var7 - var13 << 3);
                  var13++;
                  var5 /= 256L;
               }
            }

            return new n5(var3);
         } catch (Exception var11) {
            return null;
         }
      } else {
         return null;
      }
   }

   private static n5 k5(String var0) {
      l6 var1 = null;
      l6[] var2 = new l6[]{var1};
      boolean var3 = com.aspose.slides.internal.a6z.l6.n5(var0, var2);
      var1 = var2[0];
      return var3 ? new n5(var1.n5(), var1.l6()) : null;
   }

   long n5() {
      return this.c8;
   }

   public long l6() {
      if (this.t2 != 23) {
         throw new com.aspose.slides.internal.n6d.n5(10045);
      } else {
         return this.x8;
      }
   }

   public int k5() {
      return this.t2;
   }

   @Override
   public String toString() {
      if (this.t2 == 2) {
         return n5(this.c8);
      }

      int[] var1 = com.aspose.slides.internal.v6g.k5.n5(this.s7.clone(), int[].class);

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = l6((short)(var1[var2] & 65535));
      }

      l6 var3 = new l6(var1);
      var3.n5(this.l6());
      return var3.toString();
   }

   static String n5(long var0) {
      return d1.n5(p3.l6(var0 & 255L), ".", p3.l6(var0 >> 8 & 255L), ".", p3.l6(var0 >> 16 & 255L), ".", p3.l6(var0 >> 24 & 255L));
   }

   @Override
   public boolean equals(Object comparand) {
      n5 var2 = comparand instanceof n5 ? (n5)comparand : null;
      if (var2 != null) {
         if (this.k5() != var2.k5()) {
            return false;
         }

         if (this.k5() == 2) {
            return this.c8 == var2.c8;
         }

         int[] var3 = var2.s7;

         for (int var4 = 0; var4 < 8; var4++) {
            if (this.s7[var4] != var3[var4]) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.t2 == 2
         ? (int)this.c8
         : n5(
            ((this.s7[0] & 65535) << 16) + (this.s7[1] & 65535),
            ((this.s7[2] & 65535) << 16) + (this.s7[3] & 65535),
            ((this.s7[4] & 65535) << 16) + (this.s7[5] & 65535),
            ((this.s7[6] & 65535) << 16) + (this.s7[7] & 65535)
         );
   }

   private static int n5(int var0, int var1, int var2, int var3) {
      return var0 ^ (var1 << 13 | var1 >> 19) ^ (var2 << 26 | var2 >> 6) ^ (var3 << 7 | var3 >> 25);
   }
}
