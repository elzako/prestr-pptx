package com.aspose.slides.internal.a6z;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;

@j3
public class l6 {
   private int[] k5;
   private int u3;
   private long a6 = 0L;
   public static l6 n5 = n5("::1");
   public static l6 l6 = n5("::");

   public l6(int[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("addr");
      }

      if (var1.length != 8) {
         throw new ArgumentException("addr");
      }

      this.k5 = var1;
   }

   public l6(int[] var1, int var2) {
      this(var1);
      if (var2 >= 0 && var2 <= 128) {
         this.u3 = var2;
      } else {
         throw new ArgumentException("prefixLength");
      }
   }

   public l6(int[] var1, int var2, int var3) {
      this(var1, var2);
      this.a6 = var3;
   }

   public static l6 n5(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("ipString");
      } else {
         l6 var1 = null;
         l6[] var2 = new l6[]{var1};
         boolean var3 = n5(var0, var2);
         var1 = var2[0];
         if (var3) {
            return var1;
         } else {
            throw new FormatException("Not a valid IPv6 address");
         }
      }
   }

   static int n5(int[] var0, String var1) {
      int var2 = 0;
      int var3 = 0;
      if (var1.length() == 0) {
         return 0;
      }

      if (d1.u9(var1, "::", (short)4) != -1) {
         return -1;
      }

      for (int var4 = 0; var4 < var1.length(); var4++) {
         char var5 = var1.charAt(var4);
         if (var5 == ':') {
            if (var4 == var1.length() - 1) {
               return -1;
            }

            if (var3 == 8) {
               return -1;
            }

            var0[var3++] = var2;
            var2 = 0;
         } else {
            int var6;
            if ('0' <= var5 && var5 <= '9') {
               var6 = var5 - '0';
            } else if ('a' <= var5 && var5 <= 'f') {
               var6 = var5 - 'a' + 10;
            } else {
               if ('A' > var5 || var5 > 'F') {
                  return -1;
               }

               var6 = var5 - 'A' + 10;
            }

            var2 = (var2 << 4) + var6;
            if (var2 > 65535) {
               return -1;
            }
         }
      }

      if (var3 == 8) {
         return -1;
      }

      var0[var3++] = var2;
      return var3;
   }

   static boolean n5(String var0, int[] var1) {
      try {
         var1[0] = a3.n5(var0, 7, com.aspose.slides.internal.x7n.l6.k5());
         return true;
      } catch (Exception var3) {
         var1[0] = -1;
         return false;
      }
   }

   public static boolean n5(String var0, l6[] var1) {
      var1[0] = null;
      if (var0 == null) {
         return false;
      }

      if (var0.length() > 2 && var0.charAt(0) == '[' && var0.charAt(var0.length() - 1) == ']') {
         var0 = d1.l6(var0, 1, var0.length() - 2);
      }

      if (var0.length() < 2) {
         return false;
      }

      int var2 = 0;
      int var3 = 0;
      int var4 = d1.k5(var0, '/');
      if (var4 != -1) {
         String var5 = d1.k5(var0, var4 + 1);
         int[] var6 = new int[]{0};
         boolean var7 = !n5(var5, var6);
         var2 = var6[0];
         if (var7) {
            var2 = -1;
         }

         if (var2 < 0 || var2 > 128) {
            return false;
         }

         var0 = d1.l6(var0, 0, var4);
      } else {
         var4 = d1.k5(var0, '%');
         if (var4 != -1) {
            String var16 = d1.k5(var0, var4 + 1);
            int[] var18 = new int[]{0};
            boolean var20 = !n5(var16, var18);
            var3 = var18[0];
            if (var20) {
               var3 = 0;
            }

            var0 = d1.l6(var0, 0, var4);
         }
      }

      int[] var17 = new int[8];
      boolean var19 = false;
      int var21 = d1.k5(var0, ':');
      if (var21 == -1) {
         return false;
      }

      byte var8 = 0;
      if (var21 < var0.length() - 1) {
         String var9 = d1.k5(var0, var21 + 1);
         if (d1.u3(var9, '.') != -1) {
            n5 var10 = null;
            n5[] var11 = new n5[]{var10};
            boolean var12 = !com.aspose.slides.internal.a6z.n5.n5(var9, var11);
            var10 = var11[0];
            if (var12) {
               return false;
            }

            long var13 = var10.n5();
            var17[6] = ((int)(var13 & 255L) << 8) + (int)(var13 >> 8 & 255L);
            var17[7] = ((int)(var13 >> 16 & 255L) << 8) + (int)(var13 >> 24 & 255L);
            if (var21 > 0 && var0.charAt(var21 - 1) == ':') {
               var0 = d1.l6(var0, 0, var21 + 1);
            } else {
               var0 = d1.l6(var0, 0, var21);
            }

            var19 = true;
            var8 = 2;
         }
      }

      int var22 = d1.u9(var0, "::", (short)4);
      if (var22 != -1) {
         int var24 = n5(var17, d1.k5(var0, var22 + 2));
         if (var24 == -1) {
            return false;
         }

         if (var24 + var8 > 8) {
            return false;
         }

         int var26 = 8 - var8 - var24;

         for (int var29 = var24; var29 > 0; var29--) {
            var17[var29 + var26 - 1] = var17[var29 - 1];
            var17[var29 - 1] = 0;
         }

         int var30 = n5(var17, d1.l6(var0, 0, var22));
         if (var30 == -1) {
            return false;
         }

         if (var30 + var24 + var8 > 7) {
            return false;
         }
      } else if (n5(var17, var0) != 8 - var8) {
         return false;
      }

      boolean var25 = false;

      for (int var27 = 0; var27 < var8; var27++) {
         if ((var17[var27] & 65535) != 0 || var27 == 5 && (var17[var27] & 65535) != 65535) {
            var25 = true;
         }
      }

      if (var19 && !var25) {
         for (int var28 = 0; var28 < 5; var28++) {
            if ((var17[var28] & 65535) != 0) {
               return false;
            }
         }

         if ((var17[5] & 65535) != 0 && (var17[5] & 65535) != 65535) {
            return false;
         }
      }

      var1[0] = new l6(var17, var2, var3);
      return true;
   }

   public int[] n5() {
      return this.k5;
   }

   public long l6() {
      return this.a6;
   }

   public void n5(long var1) {
      this.a6 = var1;
   }

   public static boolean n5(l6 var0) {
      if ((var0.k5[7] & 65535) != 1) {
         return false;
      }

      int var1 = (var0.k5[6] & 65535) >> 8;
      if (var1 != 127 && var1 != 0) {
         return false;
      }

      for (int var2 = 0; var2 < 4; var2++) {
         if ((var0.k5[var2] & 65535) != 0) {
            return false;
         }
      }

      return (var0.k5[5] & 65535) == 0 || (var0.k5[5] & 65535) == 65535;
   }

   private static int n5(int var0) {
      return ((var0 & 65535) >> 8 & 0xFF) + ((var0 & 65535) << 8 & 0xFF00);
   }

   private int a6() {
      return ((n5(this.k5[7]) & 65535) << 16) + (n5(this.k5[6]) & 65535);
   }

   public boolean k5() {
      for (int var1 = 0; var1 < 6; var1++) {
         if ((this.k5[var1] & 65535) != 0) {
            return false;
         }
      }

      return this.a6() > 1;
   }

   public boolean u3() {
      for (int var1 = 0; var1 < 5; var1++) {
         if ((this.k5[var1] & 65535) != 0) {
            return false;
         }
      }

      return (this.k5[5] & 65535) == 65535;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      if (!this.k5() && !this.u3()) {
         int var2 = -1;
         int var3 = 0;
         int var4 = 0;

         for (int var5 = 0; var5 < 8; var5++) {
            if ((this.k5[var5] & 65535) != 0) {
               if (var4 > var3 && var4 > 1) {
                  var3 = var4;
                  var2 = var5 - var4;
               }

               var4 = 0;
            } else {
               var4++;
            }
         }

         if (var4 > var3 && var4 > 1) {
            var3 = var4;
            var2 = 8 - var4;
         }

         if (var2 == 0) {
            var1.n5(":");
         }

         for (int var6 = 0; var6 < 8; var6++) {
            if (var6 == var2) {
               var1.n5(":");
               var6 += var3 - 1;
            } else {
               var1.n5("{0:x}", this.k5[var6]);
               if (var6 < 7) {
                  var1.n5(':');
               }
            }
         }

         if (this.a6 != 0L) {
            var1.n5('%').n5(this.a6);
         }

         return var1.toString();
      } else {
         var1.n5("::");
         if (this.u3()) {
            var1.n5("ffff:");
         }

         var1.n5(new n5(this.a6()).toString());
         return var1.toString();
      }
   }

   public String n5(boolean var1) {
      if (!var1) {
         return this.toString();
      }

      a5 var2 = new a5();

      for (int var3 = 0; var3 < this.k5.length - 1; var3++) {
         var2.n5("{0:X4}:", this.k5[var3]);
      }

      var2.n5("{0:X4}", this.k5[this.k5.length - 1]);
      return var2.toString();
   }

   @Override
   public boolean equals(Object other) {
      l6 var2 = other instanceof l6 ? (l6)other : null;
      if (var2 != null) {
         for (int var7 = 0; var7 < 8; var7++) {
            if (this.k5[var7] != var2.k5[var7]) {
               return false;
            }
         }

         return true;
      } else {
         n5 var3 = other instanceof n5 ? (n5)other : null;
         if (var3 != null) {
            for (int var4 = 0; var4 < 5; var4++) {
               if ((this.k5[var4] & 65535) != 0) {
                  return false;
               }
            }

            if ((this.k5[5] & 65535) != 0 && (this.k5[5] & 65535) != 65535) {
               return false;
            }

            long var5 = var3.n5();
            return this.k5[6] == ((int)(var5 & 255L) << 8) + (int)(var5 >> 8 & 255L)
               && this.k5[7] == ((int)(var5 >> 16 & 255L) << 8) + (int)(var5 >> 24 & 255L);
         } else {
            return false;
         }
      }
   }

   @Override
   public int hashCode() {
      return n5(
         ((this.k5[0] & 65535) << 16) + (this.k5[1] & 65535),
         ((this.k5[2] & 65535) << 16) + (this.k5[3] & 65535),
         ((this.k5[4] & 65535) << 16) + (this.k5[5] & 65535),
         ((this.k5[6] & 65535) << 16) + (this.k5[7] & 65535)
      );
   }

   private static int n5(int var0, int var1, int var2, int var3) {
      return var0 ^ (var1 << 13 | var1 >> 19) ^ (var2 << 26 | var2 >> 6) ^ (var3 << 7 | var3 >> 25);
   }
}
