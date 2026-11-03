package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;

@com.aspose.slides.ms.System.j3
class o0 {
   private int[] k5;
   private int u3;
   private long a6 = com.aspose.slides.internal.v6g.k5.u9(0, 9);
   public static final o0 n5 = n5("::1");
   public static final o0 l6 = n5("::");

   public o0(int[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("addr");
      }

      if (com.aspose.slides.ms.System.u3.n5(var1).a6() != 8) {
         throw new ArgumentException("addr");
      }

      this.k5 = var1;
   }

   public o0(int[] var1, int var2) {
      this(var1);
      if (var2 >= 0 && var2 <= 128) {
         this.u3 = var2;
      } else {
         throw new ArgumentException("prefixLength");
      }
   }

   public o0(int[] var1, int var2, int var3) {
      this(var1, var2);
      this.a6 = com.aspose.slides.internal.v6g.k5.u9(var3, 9);
   }

   public static o0 n5(String var0) {
      if (var0 == null) {
         throw new ArgumentNullException("ipString");
      } else {
         o0 var1 = null;
         o0[] var2 = new o0[]{var1};
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
      int var4 = 0;
      if (var1.length() == 0) {
         return 0;
      }

      if (com.aspose.slides.ms.System.d1.u9(var1, "::", (short)4) != -1) {
         return -1;
      }

      for (int var5 = 0; var5 < var1.length(); var5++) {
         char var6 = var1.charAt(var5);
         if (var6 == ':') {
            if (var5 == 0) {
               return -1;
            }

            if (var5 == var1.length() - 1) {
               return -1;
            }

            if (var4 == 8) {
               return -1;
            }

            var0[var4++] = com.aspose.slides.internal.v6g.k5.k5(var2, 9);
            var2 = 0;
            var3 = 0;
         } else {
            if (++var3 > 4) {
               return -1;
            }

            int var7;
            if ('0' <= var6 && var6 <= '9') {
               var7 = com.aspose.slides.internal.v6g.k5.u3(var6, 4) - com.aspose.slides.internal.v6g.k5.u3('0', 4);
            } else if ('a' <= var6 && var6 <= 'f') {
               var7 = com.aspose.slides.internal.v6g.k5.u3(var6, 4) - com.aspose.slides.internal.v6g.k5.u3('a', 4) + 10;
            } else {
               if ('A' > var6 || var6 > 'F') {
                  return -1;
               }

               var7 = com.aspose.slides.internal.v6g.k5.u3(var6, 4) - com.aspose.slides.internal.v6g.k5.u3('A', 4) + 10;
            }

            var2 = (var2 << 4) + var7;
            if (var2 > com.aspose.slides.internal.v6g.k5.k5(65535, 8)) {
               return -1;
            }
         }
      }

      if (var4 == 8) {
         return -1;
      }

      var0[var4++] = com.aspose.slides.internal.v6g.k5.k5(var2, 9);
      return var4;
   }

   static boolean n5(String var0, int[] var1) {
      return com.aspose.slides.ms.System.a3.n5(var0, 7, com.aspose.slides.internal.x7n.l6.k5(), var1);
   }

   public static boolean n5(String var0, o0[] var1) {
      var1[0] = null;
      if (var0 == null) {
         return false;
      }

      if (var0.length() > 2 && var0.charAt(0) == '[' && var0.charAt(var0.length() - 1) == ']') {
         var0 = com.aspose.slides.ms.System.d1.l6(var0, 1, var0.length() - 2);
      }

      if (var0.length() < 2) {
         return false;
      }

      int var2 = 0;
      int var3 = 0;
      int var4 = com.aspose.slides.ms.System.d1.k5(var0, '/');
      if (var4 != -1) {
         String var5 = com.aspose.slides.ms.System.d1.k5(var0, var4 + 1);
         int[] var6 = new int[]{0};
         boolean var7 = !n5(var5, var6);
         var2 = var6[0];
         if (var7) {
            var2 = -1;
         }

         if (var2 < 0 || var2 > 128) {
            return false;
         }

         var0 = com.aspose.slides.ms.System.d1.l6(var0, 0, var4);
      } else {
         var4 = com.aspose.slides.ms.System.d1.k5(var0, '%');
         if (var4 != -1) {
            String var15 = com.aspose.slides.ms.System.d1.k5(var0, var4 + 1);
            int[] var17 = new int[]{0};
            boolean var19 = !n5(var15, var17);
            var3 = var17[0];
            if (var19) {
               var3 = 0;
            }

            var0 = com.aspose.slides.ms.System.d1.l6(var0, 0, var4);
         }
      }

      int[] var16 = new int[8];
      int var18 = com.aspose.slides.ms.System.d1.k5(var0, ':');
      if (var18 == -1) {
         return false;
      }

      byte var20 = 0;
      if (var18 < var0.length() - 1) {
         String var8 = com.aspose.slides.ms.System.d1.k5(var0, var18 + 1);
         if (com.aspose.slides.ms.System.d1.u3(var8, '.') != -1) {
            i1 var9 = null;
            i1[] var10 = new i1[]{var9};
            boolean var11 = !i1.n5(var8, var10);
            var9 = var10[0];
            if (var11) {
               return false;
            }

            long var12 = var9.l6();
            var16[6] = com.aspose.slides.internal.v6g.k5.k5(
               (com.aspose.slides.internal.v6g.k5.u3(var12 & com.aspose.slides.internal.v6g.k5.u9(255, 9), 11) << 8)
                  + com.aspose.slides.internal.v6g.k5.u3(var12 >> 8 & com.aspose.slides.internal.v6g.k5.u9(255, 9), 11),
               9
            );
            var16[7] = com.aspose.slides.internal.v6g.k5.k5(
               (com.aspose.slides.internal.v6g.k5.u3(var12 >> 16 & com.aspose.slides.internal.v6g.k5.u9(255, 9), 11) << 8)
                  + com.aspose.slides.internal.v6g.k5.u3(var12 >> 24 & com.aspose.slides.internal.v6g.k5.u9(255, 9), 11),
               9
            );
            if (var18 > 0 && var0.charAt(var18 - 1) == ':') {
               var0 = com.aspose.slides.ms.System.d1.l6(var0, 0, var18 + 1);
            } else {
               var0 = com.aspose.slides.ms.System.d1.l6(var0, 0, var18);
            }

            var20 = 2;
         }
      }

      int var21 = com.aspose.slides.ms.System.d1.u9(var0, "::", (short)4);
      if (var21 != -1) {
         int var23 = n5(var16, com.aspose.slides.ms.System.d1.k5(var0, var21 + 2));
         if (var23 == -1) {
            return false;
         }

         if (var23 + var20 > 8) {
            return false;
         }

         int var24 = 8 - var20 - var23;

         for (int var25 = var23; var25 > 0; var25--) {
            var16[var25 + var24 - 1] = var16[var25 - 1];
            var16[var25 - 1] = com.aspose.slides.internal.v6g.k5.k5(0, 9);
         }

         int var26 = n5(var16, com.aspose.slides.ms.System.d1.l6(var0, 0, var21));
         if (var26 == -1) {
            return false;
         }

         if (var26 + var23 + var20 > 7) {
            return false;
         }
      } else if (n5(var16, var0) != 8 - var20) {
         return false;
      }

      var1[0] = new o0(var16, var2, var3);
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

   private static int n5(int var0) {
      return com.aspose.slides.internal.v6g.k5.k5((var0 >> 8 & 0xFF) + (var0 << 8 & 0xFF00), 9);
   }

   private long a6() {
      return com.aspose.slides.internal.v6g.k5.a6((n5(this.k5[7]) << 16) + n5(this.k5[6]), 9);
   }

   public boolean k5() {
      for (int var1 = 0; var1 < 6; var1++) {
         if (com.aspose.slides.internal.v6g.k5.k5(this.k5[var1], 8) != 0) {
            return false;
         }
      }

      return com.aspose.slides.internal.v6g.k5.k5(this.k5[6], 8) == 0 ? false : com.aspose.slides.internal.v6g.k5.a6(this.a6(), 10) > 1L;
   }

   public boolean u3() {
      for (int var1 = 0; var1 < 5; var1++) {
         if (com.aspose.slides.internal.v6g.k5.k5(this.k5[var1], 8) != 0) {
            return false;
         }
      }

      return com.aspose.slides.internal.v6g.k5.k5(this.k5[6], 8) == 0 ? false : com.aspose.slides.internal.v6g.k5.k5(this.k5[5], 8) == 65535;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      if (!this.k5() && !this.u3()) {
         int var2 = -1;
         int var3 = 0;
         int var4 = 0;

         for (int var5 = 0; var5 < 8; var5++) {
            if (com.aspose.slides.internal.v6g.k5.k5(this.k5[var5], 8) != 0) {
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
               var1.n5("{0:x}", com.aspose.slides.internal.v6g.k5.l6(this.k5[var6]));
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

         var1.n5(new i1(this.a6()).toString());
         return var1.toString();
      }
   }

   @Override
   public boolean equals(Object other) {
      o0 var2 = com.aspose.slides.internal.v6g.k5.n5(other, o0.class);
      if (var2 != null) {
         for (int var7 = 0; var7 < 8; var7++) {
            if (com.aspose.slides.internal.v6g.k5.k5(this.k5[var7], 8) != com.aspose.slides.internal.v6g.k5.k5(var2.k5[var7], 8)) {
               return false;
            }
         }

         return true;
      } else {
         i1 var3 = com.aspose.slides.internal.v6g.k5.n5(other, i1.class);
         if (var3 != null) {
            for (int var4 = 0; var4 < 5; var4++) {
               if (com.aspose.slides.internal.v6g.k5.k5(this.k5[var4], 8) != 0) {
                  return false;
               }
            }

            if (com.aspose.slides.internal.v6g.k5.k5(this.k5[5], 8) != 0 && com.aspose.slides.internal.v6g.k5.k5(this.k5[5], 8) != 65535) {
               return false;
            }

            long var5 = var3.l6();
            return com.aspose.slides.internal.v6g.k5.k5(this.k5[6], 8)
                  == com.aspose.slides.internal.v6g.k5.k5(
                     com.aspose.slides.internal.v6g.k5.k5(
                        (com.aspose.slides.internal.v6g.k5.u3(var5 & com.aspose.slides.internal.v6g.k5.u9(255, 9), 11) << 8)
                           + com.aspose.slides.internal.v6g.k5.u3(var5 >> 8 & com.aspose.slides.internal.v6g.k5.u9(255, 9), 11),
                        9
                     ),
                     8
                  )
               && com.aspose.slides.internal.v6g.k5.k5(this.k5[7], 8)
                  == com.aspose.slides.internal.v6g.k5.k5(
                     com.aspose.slides.internal.v6g.k5.k5(
                        (com.aspose.slides.internal.v6g.k5.u3(var5 >> 16 & com.aspose.slides.internal.v6g.k5.u9(255, 9), 11) << 8)
                           + com.aspose.slides.internal.v6g.k5.u3(var5 >> 24 & com.aspose.slides.internal.v6g.k5.u9(255, 9), 11),
                        9
                     ),
                     8
                  );
         } else {
            return false;
         }
      }
   }

   @Override
   public int hashCode() {
      return n5(
         (com.aspose.slides.internal.v6g.k5.u3(this.k5[0], 8) << 16) + com.aspose.slides.internal.v6g.k5.u3(this.k5[1], 8),
         (com.aspose.slides.internal.v6g.k5.u3(this.k5[2], 8) << 16) + com.aspose.slides.internal.v6g.k5.u3(this.k5[3], 8),
         (com.aspose.slides.internal.v6g.k5.u3(this.k5[4], 8) << 16) + com.aspose.slides.internal.v6g.k5.u3(this.k5[5], 8),
         (com.aspose.slides.internal.v6g.k5.u3(this.k5[6], 8) << 16) + com.aspose.slides.internal.v6g.k5.u3(this.k5[7], 8)
      );
   }

   private static int n5(int var0, int var1, int var2, int var3) {
      return var0 ^ (var1 << 13 | var1 >> 19) ^ (var2 << 26 | var2 >> 6) ^ (var3 << 7 | var3 >> 25);
   }
}
