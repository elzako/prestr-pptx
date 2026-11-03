package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;

@com.aspose.slides.ms.System.j3
public class i1 {
   private long c8;
   private int t2;
   private int[] s7;
   private long x8;
   public static final i1 n5 = new i1(com.aspose.slides.internal.v6g.k5.u9(0, 9));
   public static final i1 l6 = n5("255.255.255.255");
   public static final i1 k5 = n5("127.0.0.1");
   public static final i1 u3 = n5("255.255.255.255");
   public static final i1 a6 = k5("::");
   public static final i1 u9 = k5("::1");
   public static final i1 h0 = k5("::");

   private static short k5(short var0) {
      return (short)(var0 >> 8 & 0xFF | var0 << 8 & 0xFF00);
   }

   public static short n5(short var0) {
      return k5(var0);
   }

   public static short l6(short var0) {
      return k5(var0);
   }

   public i1(long var1) {
      this.c8 = var1;
      this.t2 = 2;
   }

   i1(int[] var1, long var2) {
      this.s7 = var1;

      for (int var4 = 0; var4 < 8; var4++) {
         this.s7[var4] = com.aspose.slides.internal.v6g.k5.k5(n5(com.aspose.slides.internal.v6g.k5.l6(this.s7[var4], 8)), 7);
      }

      this.t2 = 23;
      this.x8 = var2;
   }

   public static i1 n5(String var0) {
      i1 var1 = null;
      i1[] var2 = new i1[]{var1};
      boolean var3 = n5(var0, var2);
      var1 = var2[0];
      if (var3) {
         return var1;
      } else {
         throw new FormatException("An invalid IP address was specified.");
      }
   }

   public static boolean n5(String var0, i1[] var1) {
      if (var0 == null) {
         throw new ArgumentNullException("ipString");
      } else {
         return (var1[0] = l6(var0)) != null || (var1[0] = k5(var0)) != null;
      }
   }

   private static i1 l6(String var0) {
      int var1 = com.aspose.slides.ms.System.d1.u3(var0, ' ');
      if (var1 != -1) {
         String[] var2 = com.aspose.slides.ms.System.d1.u9(com.aspose.slides.ms.System.d1.k5(var0, var1 + 1), '.');
         if (com.aspose.slides.ms.System.u3.n5((Object)(var2)).a6() > 0) {
            String var3 = var2[com.aspose.slides.ms.System.u3.n5((Object)(var2)).a6() - 1];
            if (var3.length() == 0) {
               return null;
            }

            for (int var4 = 0; var4 < var3.length(); var4++) {
               char var5 = var3.charAt(var4);
               if (!com.aspose.slides.ms.System.r8.k5(var5)) {
                  return null;
               }
            }
         }

         var0 = com.aspose.slides.ms.System.d1.l6(var0, 0, var1);
      }

      if (var0.length() != 0 && var0.charAt(var0.length() - 1) != '.') {
         String[] var15 = com.aspose.slides.ms.System.d1.u9(var0, '.');
         if (com.aspose.slides.ms.System.u3.n5((Object)(var15)).a6() > 4) {
            return null;
         }

         try {
            long var6 = com.aspose.slides.internal.v6g.k5.u9(0, 9);
            long var8 = com.aspose.slides.internal.v6g.k5.u9(0, 9);

            for (int var10 = 0; var10 < com.aspose.slides.ms.System.u3.n5((Object)(var15)).a6(); var10++) {
               String var11 = var15[var10];
               if (3 > var11.length() || var11.length() > 4 || var11.charAt(0) != '0' || var11.charAt(1) != 'x' && var11.charAt(1) != 'X') {
                  if (var11.length() == 0) {
                     return null;
                  }

                  if (var11.charAt(0) == '0') {
                     var8 = com.aspose.slides.internal.v6g.k5.u9(0, 9);

                     for (int var12 = 1; var12 < var11.length(); var12++) {
                        if ('0' > var11.charAt(var12) || var11.charAt(var12) > '7') {
                           return null;
                        }

                        var8 = (var8 << 3) + com.aspose.slides.internal.v6g.k5.u9(var11.charAt(var12), 4) - com.aspose.slides.internal.v6g.k5.u9('0', 4);
                     }
                  } else {
                     long[] var16 = new long[]{var8};
                     boolean var13 = !com.aspose.slides.ms.System.p3.n5(var11, 0, null, var16);
                     var8 = var16[0];
                     if (var13) {
                        return null;
                     }
                  }
               } else if (var11.length() == 3) {
                  var8 = com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.internal.v6g.k5.n5((Object)(com.aspose.slides.ms.System.r8.n5(var11.charAt(2))), 9), 6);
               } else {
                  var8 = com.aspose.slides.internal.v6g.k5.u9(
                     com.aspose.slides.internal.v6g.k5.n5(
                        (Object)(com.aspose.slides.ms.System.r8.n5(var11.charAt(2)) << 4 | com.aspose.slides.ms.System.r8.n5(var11.charAt(3))), 9
                     ),
                     6
                  );
               }

               if (var10 == com.aspose.slides.ms.System.u3.n5((Object)(var15)).a6() - 1) {
                  if (var10 != 0 && var8 >= 256 << (3 - var10) * 8) {
                     return null;
                  }

                  if (var8 > 17179869182L) {
                     return null;
                  }

                  var10 = 3;
               } else if (var8 >= 256L) {
                  return null;
               }

               int var17 = 0;

               while (var8 > 0L) {
                  var6 |= (var8 & com.aspose.slides.internal.v6g.k5.u9(255, 9)) << (var10 - var17 << 3);
                  var17++;
                  var8 /= com.aspose.slides.internal.v6g.k5.u9(256, 9);
               }
            }

            return new i1(var6);
         } catch (RuntimeException var14) {
            return null;
         }
      } else {
         return null;
      }
   }

   private static i1 k5(String var0) {
      o0 var1 = null;
      o0[] var2 = new o0[]{var1};
      boolean var3 = o0.n5(var0, var2);
      var1 = var2[0];
      return var3 ? new i1(var1.n5(), var1.l6()) : null;
   }

   @Deprecated
   public long n5() {
      if (this.t2 != 2) {
         throw new Exception("The attempted operation is not supported for the type of object referenced");
      } else {
         return this.c8;
      }
   }

   long l6() {
      return this.c8;
   }

   public long k5() {
      if (this.t2 != 23) {
         throw new com.aspose.slides.internal.p6w.q0(10045);
      } else {
         return this.x8;
      }
   }

   public byte[] u3() {
      return this.t2 == 23
         ? this.n5(this.s7)
         : new byte[]{
            com.aspose.slides.internal.v6g.k5.n5((Object)(this.c8 & com.aspose.slides.internal.v6g.k5.u9(255, 9)), 11),
            com.aspose.slides.internal.v6g.k5.n5((Object)(this.c8 >> 8 & com.aspose.slides.internal.v6g.k5.u9(255, 9)), 11),
            com.aspose.slides.internal.v6g.k5.n5((Object)(this.c8 >> 16 & com.aspose.slides.internal.v6g.k5.u9(255, 9)), 11),
            com.aspose.slides.internal.v6g.k5.n5((Object)(this.c8 >> 24), 11)
         };
   }

   public int a6() {
      return this.t2;
   }

   public static boolean n5(i1 var0) {
      if (var0.t2 == 2) {
         return (var0.c8 & com.aspose.slides.internal.v6g.k5.u9(255, 9)) == 127L;
      }

      for (int var1 = 0; var1 < 6; var1++) {
         if (com.aspose.slides.internal.v6g.k5.k5(var0.s7[var1], 8) != 0) {
            return false;
         }
      }

      return l6(com.aspose.slides.internal.v6g.k5.l6(var0.s7[7], 8)) == 1;
   }

   @Override
   public String toString() {
      if (this.t2 == 2) {
         return n5(this.c8);
      }

      int[] var1 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.s7)).deepClone(), int[].class);

      for (int var2 = 0; var2 < com.aspose.slides.ms.System.u3.n5((Object)(var1)).a6(); var2++) {
         var1[var2] = com.aspose.slides.internal.v6g.k5.k5(l6(com.aspose.slides.internal.v6g.k5.l6(var1[var2], 8)), 7);
      }

      o0 var3 = new o0(var1);
      var3.n5(this.k5());
      return var3.toString();
   }

   static String n5(long var0) {
      return com.aspose.slides.ms.System.d1.n5(
         com.aspose.slides.ms.System.p3.l6(var0 & com.aspose.slides.internal.v6g.k5.u9(255, 9)),
         ".",
         com.aspose.slides.ms.System.p3.l6(var0 >> 8 & com.aspose.slides.internal.v6g.k5.u9(255, 9)),
         ".",
         com.aspose.slides.ms.System.p3.l6(var0 >> 16 & com.aspose.slides.internal.v6g.k5.u9(255, 9)),
         ".",
         com.aspose.slides.ms.System.p3.l6(var0 >> 24 & com.aspose.slides.internal.v6g.k5.u9(255, 9))
      );
   }

   @Override
   public boolean equals(Object comparand) {
      i1 var2 = com.aspose.slides.internal.v6g.k5.n5(comparand, i1.class);
      if (var2 != null) {
         if (this.a6() != var2.a6()) {
            return false;
         }

         if (this.a6() == 2) {
            return this.c8 == var2.c8;
         }

         int[] var3 = var2.s7;

         for (int var4 = 0; var4 < 8; var4++) {
            if (com.aspose.slides.internal.v6g.k5.k5(this.s7[var4], 8) != com.aspose.slides.internal.v6g.k5.k5(var3[var4], 8)) {
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
         ? com.aspose.slides.internal.v6g.k5.u3(this.c8, 11)
         : n5(
            (com.aspose.slides.internal.v6g.k5.u3(this.s7[0], 8) << 16) + com.aspose.slides.internal.v6g.k5.u3(this.s7[1], 8),
            (com.aspose.slides.internal.v6g.k5.u3(this.s7[2], 8) << 16) + com.aspose.slides.internal.v6g.k5.u3(this.s7[3], 8),
            (com.aspose.slides.internal.v6g.k5.u3(this.s7[4], 8) << 16) + com.aspose.slides.internal.v6g.k5.u3(this.s7[5], 8),
            (com.aspose.slides.internal.v6g.k5.u3(this.s7[6], 8) << 16) + com.aspose.slides.internal.v6g.k5.u3(this.s7[7], 8)
         );
   }

   private static int n5(int var0, int var1, int var2, int var3) {
      return var0 ^ (var1 << 13 | var1 >> 19) ^ (var2 << 26 | var2 >> 6) ^ (var3 << 7 | var3 >> 25);
   }

   private byte[] n5(int[] var1) {
      byte[] var2 = new byte[var1.length * 2];
      short[] var3 = this.l6(var1);
      com.aspose.slides.ms.System.y4.n5(var3, 0, var2, 0, var2.length);
      return var2;
   }

   private short[] l6(int[] var1) {
      short[] var2 = new short[var1.length];

      for (int var3 = 0; var3 < var2.length; var3++) {
         var2[var3] = (short)var1[var3];
      }

      return var2;
   }
}
