package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.h2;
import java.math.BigInteger;

public final class t4 {
   static boolean n5(String var0, boolean var1, long[] var2, RuntimeException[] var3) {
      long var4 = 0L;
      boolean var6 = false;
      boolean var7 = false;
      var2[0] = 0L;
      var3[0] = null;
      if (var0 == null) {
         if (!var1) {
            var3[0] = new ArgumentNullException("s");
         }

         return false;
      } else {
         int var8 = var0.length();

         int var9;
         for (var9 = 0; var9 < var8; var9++) {
            char var10 = var0.charAt(var9);
            if (!com.aspose.slides.ms.System.t9.t9(var10)) {
               break;
            }
         }

         if (var9 == var8) {
            if (!var1) {
               var3[0] = x8.n5();
            }

            return false;
         } else {
            if (var0.charAt(var9) == '+') {
               var9++;
            } else if (var0.charAt(var9) == '-') {
               var9++;
               var7 = true;
            }

            for (; var9 < var8; var9++) {
               char var13 = var0.charAt(var9);
               if (var13 >= '0' && var13 <= '9') {
                  long var11 = var13 - '0';
                  if ((var4 & 4294967295L) > 429496729L || (var4 & 4294967295L) == 429496729L && (var11 & 4294967295L) > 5L) {
                     if (!var1) {
                        var3[0] = new OverflowException("Value is too large");
                     }

                     return false;
                  }

                  var4 = (var4 & 4294967295L) * 10L + (var11 & 4294967295L);
                  var6 = true;
               } else if (!x8.n5(var1, var0, var9, var3)) {
                  return false;
               }
            }

            if (!var6) {
               if (!var1) {
                  var3[0] = x8.n5();
               }

               return false;
            } else if (var7 && (var4 & 4294967295L) > 0L) {
               if (!var1) {
                  var3[0] = new OverflowException("Negative number");
               }

               return false;
            } else {
               var2[0] = var4;
               return true;
            }
         }
      }
   }

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
            var5[0] = x8.n5();
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
            boolean[] var53 = new boolean[]{var22};
            boolean[] var25 = new boolean[]{var21};
            x8.n5(var18, var0, var6, var53, var25);
            var17 = var18[0];
            var22 = var53[0];
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
            boolean[] var54 = new boolean[]{var23};
            x8.n5(var18, var0, var6, var54);
            var17 = var18[0];
            var23 = var54[0];
            if (var23) {
               var18[0] = var17;
               boolean var55 = var15 && !x8.n5(var18, var0, true, var3, var5);
               var17 = var18[0];
               if (var55) {
                  return false;
               }

               if (var23 && !var22 && var13) {
                  var18[0] = var17;
                  boolean[] var56 = new boolean[]{var22};
                  boolean[] var58 = new boolean[]{var21};
                  x8.n5(var18, var0, var6, var56, var58);
                  var17 = var18[0];
                  var22 = var56[0];
                  var21 = var58[0];
                  var18[0] = var17;
                  boolean var60 = var22 && var15 && !x8.n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var60) {
                     return false;
                  }
               }
            }
         }

         long var29 = 0L;
         int var57 = 0;
         boolean var59 = false;
         int var31 = 0;

         do {
            if (!x8.n5(var0.charAt(var17), var8)) {
               var18[0] = var17;
               boolean var32 = var9 && (x8.n5(var18, var0, var6.z3()) || x8.n5(var18, var0, var6.u3()));
               var17 = var18[0];
               if (!var32) {
                  var18[0] = var17;
                  boolean var33 = !var59 && var10 && (x8.n5(var18, var0, var6.q0()) || x8.n5(var18, var0, var6.k5()));
                  var17 = var18[0];
                  if (!var33) {
                     break;
                  }

                  var59 = true;
               }
            } else if (var8) {
               var57++;
               char var34 = var0.charAt(var17++);
               long var35;
               if (com.aspose.slides.ms.System.t9.u3(var34)) {
                  var35 = var34 - '0';
               } else if (com.aspose.slides.ms.System.t9.c8(var34)) {
                  var35 = var34 - 'a' + 10;
               } else {
                  var35 = var34 - 'A' + 10;
               }

               if (var3) {
                  long var37 = (var29 & 4294967295L) * 16L + (var35 & 4294967295L);
                  if (var37 > 4294967295L) {
                     return false;
                  }

                  var29 = var37;
               } else {
                  BigInteger var61 = BigInteger.valueOf((var29 & 4294967295L) * 16L + (var35 & 4294967295L));
                  if (var61.compareTo(BigInteger.valueOf(4294967295L)) > 0 || var61.compareTo(BigInteger.valueOf(0L)) < 0) {
                     throw new OverflowException();
                  }

                  var29 = var61.longValue();
               }
            } else if (var59) {
               var57++;
               if (var0.charAt(var17++) != '0') {
                  if (!var3) {
                     var5[0] = new OverflowException("Value too large or too small.");
                  }

                  return false;
               }
            } else {
               var57++;
               BigInteger var62 = BigInteger.valueOf(var29);
               BigInteger var67 = var62.multiply(BigInteger.valueOf(10L)).add(BigInteger.valueOf(var0.charAt(var17++) - '0'));
               if (var67.compareTo(BigInteger.valueOf(4294967295L)) > 0 || var67.compareTo(BigInteger.valueOf(0L)) < 0) {
                  if (!var3) {
                     var5[0] = new OverflowException("Value too large or too small.");
                  }

                  return false;
               }

               var29 = var67.longValue();
            }
         } while (var17 < var0.length());

         if (var57 == 0) {
            if (!var3) {
               var5[0] = x8.n5();
            }

            return false;
         } else {
            if (var16) {
               var18[0] = var17;
               int[] var63 = new int[]{0};
               boolean var68 = x8.n5(var18, var0, var63, var3, var5) && var5[0] != null;
               var17 = var18[0];
               var31 = var63[0];
               if (var68) {
                  return false;
               }
            }

            if (var12 && !var22) {
               var18[0] = var17;
               boolean[] var64 = new boolean[]{var22};
               boolean[] var69 = new boolean[]{var21};
               x8.n5(var18, var0, var6, var64, var69);
               var17 = var18[0];
               var22 = var64[0];
               var21 = var69[0];
               if (var22 && var17 < var0.length()) {
                  var18[0] = var17;
                  boolean var39 = var14 && !x8.n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var39) {
                     return false;
                  }
               }
            }

            if (var7 && !var23) {
               var18[0] = var17;
               boolean var65 = var14 && var17 < var0.length() && !x8.n5(var18, var0, false, var3, var5);
               var17 = var18[0];
               if (var65) {
                  return false;
               }

               var18[0] = var17;
               boolean[] var70 = new boolean[]{var23};
               x8.n5(var18, var0, var6, var70);
               var17 = var18[0];
               var23 = var70[0];
               if (var23 && var17 < var0.length()) {
                  var18[0] = var17;
                  boolean var72 = var14 && !x8.n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var72) {
                     return false;
                  }

                  if (!var22 && var12) {
                     var18[0] = var17;
                     boolean[] var40 = new boolean[]{var22};
                     boolean[] var41 = new boolean[]{var21};
                     x8.n5(var18, var0, var6, var40, var41);
                     var17 = var18[0];
                     var22 = var40[0];
                     var21 = var41[0];
                  }
               }
            }

            var18[0] = var17;
            boolean var66 = var14 && var17 < var0.length() && !x8.n5(var18, var0, false, var3, var5);
            var17 = var18[0];
            if (var66) {
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
               boolean var71 = var14 && var17 < var0.length() && !x8.n5(var18, var0, false, var3, var5);
               var17 = var18[0];
               if (var71) {
                  return false;
               }
            }

            if (var17 < var0.length() && var0.charAt(var17) != 0) {
               if (!var3) {
                  var5[0] = x8.n5();
               }

               return false;
            } else if (var21 && (var29 & 4294967295L) > 0L) {
               if (!var3) {
                  var5[0] = new OverflowException("Negative number");
               }

               return false;
            } else {
               if (var31 > 0) {
                  double var42 = Math.pow(10.0, var31) * (var29 & 4294967295L);
                  if (var42 < -2.1474836E9F || var42 > 2.147483647E9) {
                     if (!var3) {
                        var5[0] = new OverflowException("Value too large or too small.");
                     }

                     return false;
                  }

                  var29 = (long)var42;
               }

               var4[0] = var29;
               return true;
            }
         }
      }
   }

   public static long n5(String var0) {
      RuntimeException var1 = null;
      long var2 = 0L;
      long[] var4 = new long[]{0L};
      RuntimeException[] var5 = new RuntimeException[]{var1};
      boolean var6 = !n5(var0, false, var4, var5);
      var2 = var4[0];
      var1 = var5[0];
      if (var6) {
         throw var1;
      } else {
         return var2;
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

   public static long n5(String var0, int var1) {
      return n5(var0, var1, null);
   }
}
