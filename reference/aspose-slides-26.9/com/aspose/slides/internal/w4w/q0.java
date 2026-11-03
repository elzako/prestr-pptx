package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.h2;
import com.aspose.slides.ms.System.i6;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class q0 {
   static boolean n5(String var0, int var1, h2 var2, boolean var3, long[] var4, RuntimeException[] var5) {
      var4[0] = 0L;
      var5[0] = null;
      if (var0 == null) {
         if (!var3) {
            var5[0] = new ArgumentNullException("s");
         }

         return false;
      } else if (var0.length() == 0) {
         if (!var3) {
            var5[0] = new FormatException();
         }

         return false;
      } else {
         com.aspose.slides.internal.x7n.s7 var6 = null;
         if (var2 != null) {
            var6 = com.aspose.slides.internal.x7n.s7.n5(var2);
         }

         if (var6 == null) {
            var6 = com.aspose.slides.internal.x7n.l6.u3().e2();
         }

         if (!x8.n5(var1, var3, var5)) {
            return false;
         }

         boolean var7 = (var1 & 256) != 0;
         boolean var8 = (var1 & 512) != 0;
         boolean var9 = (var1 & 64) != 0;
         boolean var10 = (var1 & 32) != 0;
         boolean var11 = (var1 & 16) != 0;
         boolean var12 = (var1 & 8) != 0;
         boolean var13 = (var1 & 4) != 0;
         boolean var14 = (var1 & 2) != 0;
         boolean var15 = (var1 & 1) != 0;
         boolean var16 = (var1 & 128) != 0;
         int var17 = 0;
         int[] var18 = new int[]{0};
         boolean var19 = var15 && !x8.n5(var18, var0, true, var3, var5);
         var17 = var18[0];
         if (var19) {
            return false;
         }

         boolean var20 = false;
         boolean var21 = false;
         boolean var22 = false;
         boolean var23 = false;
         if (var11 && var0.charAt(var17) == '(') {
            var20 = true;
            var22 = true;
            var21 = true;
            var18[0] = ++var17;
            boolean var24 = var15 && !x8.n5(var18, var0, true, var3, var5);
            var17 = var18[0];
            if (var24) {
               return false;
            }

            if (d1.a6(d1.l6(var0, var17, var6.z1().length()), var6.z1())) {
               if (!var3) {
                  var5[0] = x8.n5();
               }

               return false;
            }

            if (d1.a6(d1.l6(var0, var17, var6.s3().length()), var6.s3())) {
               if (!var3) {
                  var5[0] = x8.n5();
               }

               return false;
            }
         }

         if (var13 && !var22) {
            var18[0] = var17;
            boolean[] var44 = new boolean[]{var22};
            boolean[] var25 = new boolean[]{var21};
            x8.n5(var18, var0, var6, var44, var25);
            var17 = var18[0];
            var22 = var44[0];
            var21 = var25[0];
            if (var22) {
               var18[0] = var17;
               boolean var26 = var15 && !x8.n5(var18, var0, true, var3, var5);
               var17 = var18[0];
               if (var26) {
                  return false;
               }

               if (var7) {
                  var18[0] = var17;
                  boolean[] var27 = new boolean[]{false};
                  x8.n5(var18, var0, var6, var27);
                  var17 = var18[0];
                  var23 = var27[0];
                  var18[0] = var17;
                  boolean var28 = var23 && var15 && !x8.n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var28) {
                     return false;
                  }
               }
            }
         }

         if (var7 && !var23) {
            var18[0] = var17;
            boolean[] var45 = new boolean[]{var23};
            x8.n5(var18, var0, var6, var45);
            var17 = var18[0];
            var23 = var45[0];
            if (var23) {
               var18[0] = var17;
               boolean var47 = var15 && !x8.n5(var18, var0, true, var3, var5);
               var17 = var18[0];
               if (var47) {
                  return false;
               }

               if (var23 && !var22 && var13) {
                  var18[0] = var17;
                  boolean[] var49 = new boolean[]{var22};
                  boolean[] var51 = new boolean[]{var21};
                  x8.n5(var18, var0, var6, var49, var51);
                  var17 = var18[0];
                  var22 = var49[0];
                  var21 = var51[0];
                  var18[0] = var17;
                  boolean var53 = var22 && var15 && !x8.n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var53) {
                     return false;
                  }
               }
            }
         }

         i6 var46 = new i6(0);
         int var48 = 0;
         boolean var50 = false;
         int var29 = 0;

         do {
            if (!x8.n5(var0.charAt(var17), var8)) {
               var18[0] = var17;
               boolean var30 = var9 && (x8.n5(var18, var0, var6.z3()) || x8.n5(var18, var0, var6.u3()));
               var17 = var18[0];
               if (!var30) {
                  var18[0] = var17;
                  boolean var31 = !var50 && var10 && (x8.n5(var18, var0, var6.q0()) || x8.n5(var18, var0, var6.k5()));
                  var17 = var18[0];
                  if (!var31) {
                     break;
                  }

                  var50 = true;
               }
            } else if (var8) {
               var48++;
               char var54 = var0.charAt(var17++);
               i6 var52;
               if (com.aspose.slides.ms.System.t9.u3(var54)) {
                  var52 = new i6(var54 - '0');
               } else if (com.aspose.slides.ms.System.t9.c8(var54)) {
                  var52 = new i6(var54 - 'a' + 10);
               } else {
                  var52 = new i6(var54 - 'A' + 10);
               }

               if (var3) {
                  boolean var55 = var46.n5(new i6(65535)) > 0;
                  var46 = i6.u3(i6.u9(var46, new i6(16)), var52);
                  if (var55 && var46.n5(new i6(16)) < 0) {
                     return false;
                  }
               } else {
                  BigInteger var56 = new BigInteger(var46.toString()).multiply(BigInteger.valueOf(16L)).add(new BigInteger(var52.toString()));
                  if (var56.compareTo(new BigInteger("18446744073709551615")) > 0 || var56.compareTo(BigInteger.ZERO) < 0) {
                     throw new OverflowException();
                  }

                  var46 = new i6(var56.longValue());
               }
            } else if (var50) {
               var48++;
               if (var0.charAt(var17++) != '0') {
                  if (!var3) {
                     var5[0] = new OverflowException("Value too large or too small.");
                  }

                  return false;
               }
            } else {
               var48++;
               BigInteger var57 = new BigInteger(var46.toString());
               var57 = var57.multiply(BigInteger.valueOf(10L)).add(BigInteger.valueOf(var0.charAt(var17++) - '0'));
               if (var57.compareTo(new BigInteger("18446744073709551615")) > 0 || var57.compareTo(BigInteger.ZERO) < 0) {
                  if (!var3) {
                     var5[0] = new OverflowException("Value too large or too small.");
                  }

                  return false;
               }

               var46 = new i6(var57.longValue());
            }
         } while (var17 < var0.length());

         if (var48 == 0) {
            if (!var3) {
               var5[0] = x8.n5();
            }

            return false;
         } else {
            if (var16) {
               var18[0] = var17;
               int[] var59 = new int[]{0};
               boolean var63 = x8.n5(var18, var0, var59, var3, var5) && var5[0] != null;
               var17 = var18[0];
               var29 = var59[0];
               if (var63) {
                  return false;
               }
            }

            if (var12 && !var22) {
               var18[0] = var17;
               boolean[] var60 = new boolean[]{var22};
               boolean[] var64 = new boolean[]{var21};
               x8.n5(var18, var0, var6, var60, var64);
               var17 = var18[0];
               var22 = var60[0];
               var21 = var64[0];
               if (var22 && var17 < var0.length()) {
                  var18[0] = var17;
                  boolean var32 = var14 && !x8.n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var32) {
                     return false;
                  }
               }
            }

            if (var7 && !var23) {
               var18[0] = var17;
               boolean var61 = var14 && var17 < var0.length() && !x8.n5(var18, var0, false, var3, var5);
               var17 = var18[0];
               if (var61) {
                  return false;
               }

               var18[0] = var17;
               boolean[] var65 = new boolean[]{var23};
               x8.n5(var18, var0, var6, var65);
               var17 = var18[0];
               var23 = var65[0];
               if (var23 && var17 < var0.length()) {
                  var18[0] = var17;
                  boolean var68 = var14 && !x8.n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var68) {
                     return false;
                  }

                  if (!var22 && var12) {
                     var18[0] = var17;
                     boolean[] var33 = new boolean[]{var22};
                     boolean[] var34 = new boolean[]{var21};
                     x8.n5(var18, var0, var6, var33, var34);
                     var17 = var18[0];
                     var22 = var33[0];
                     var21 = var34[0];
                  }
               }
            }

            var18[0] = var17;
            boolean var62 = var14 && var17 < var0.length() && !x8.n5(var18, var0, false, var3, var5);
            var17 = var18[0];
            if (var62) {
               return false;
            }

            if (var20) {
               if (var17 >= var0.length() || var0.charAt(var17++) != ')') {
                  if (!var3) {
                     var5[0] = x8.n5();
                  }

                  return false;
               }

               var18[0] = var17;
               boolean var66 = var14 && var17 < var0.length() && !x8.n5(var18, var0, false, var3, var5);
               var17 = var18[0];
               if (var66) {
                  return false;
               }
            }

            if (var17 < var0.length() && var0.charAt(var17) != 0) {
               if (!var3) {
                  var5[0] = x8.n5();
               }

               return false;
            } else if (var21 && var46.n5(new i6(0)) > 0) {
               if (!var3) {
                  var5[0] = new OverflowException("Negative number");
               }

               return false;
            } else {
               if (var29 > 0) {
                  BigDecimal var67 = BigDecimal.valueOf(Math.pow(10.0, var29)).multiply(new BigDecimal(var46.toString()));
                  if (var67.compareTo(new BigDecimal(Integer.MIN_VALUE)) < 0 || var67.compareTo(new BigDecimal(Integer.MAX_VALUE)) > 0) {
                     if (!var3) {
                        var5[0] = new OverflowException("Value too large or too small.");
                     }

                     return false;
                  }

                  var46 = new i6(var67.longValue());
               }

               var4[0] = var46.longValue();
               return true;
            }
         }
      }
   }

   public static long n5(String var0, int var1, h2 var2) {
      RuntimeException var3 = null;
      long var4 = 0L;
      long[] var6 = new long[]{0L};
      RuntimeException[] var7 = new RuntimeException[]{var3};
      boolean var8 = !n5(var0, var1, var2, false, var6, var7);
      var4 = var6[0];
      var3 = var7[0];
      if (var8) {
         throw var3;
      } else {
         return var4;
      }
   }
}
