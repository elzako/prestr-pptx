package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.h2;
import java.math.BigInteger;

public final class n3 {
   static boolean n5(String var0, boolean var1, long[] var2, RuntimeException[] var3) {
      long var4 = 0L;
      byte var6 = 1;
      boolean var7 = false;
      var2[0] = 0L;
      var3[0] = null;
      com.aspose.slides.internal.x7n.s7 var8 = com.aspose.slides.internal.x7n.l6.u3().e2();
      if (var0 == null) {
         if (!var1) {
            var3[0] = new ArgumentNullException("s");
         }

         return false;
      } else {
         int var9 = var0.length();

         int var10;
         for (var10 = 0; var10 < var9; var10++) {
            char var11 = var0.charAt(var10);
            if (!com.aspose.slides.ms.System.t9.t9(var11)) {
               break;
            }
         }

         if (var10 == var9) {
            if (!var1) {
               var3[0] = x8.n5();
            }

            return false;
         } else {
            if (d1.n5(var0, var10, var8.s3(), 0, var8.s3().length()) == 0) {
               var10 += var8.s3().length();
            } else if (d1.n5(var0, var10, var8.z1(), 0, var8.z1().length()) == 0) {
               var6 = -1;
               var10 += var8.z1().length();
            }

            for (; var10 < var9; var10++) {
               char var14 = var0.charAt(var10);
               if (var14 >= '0' && var14 <= '9') {
                  byte var12 = (byte)(var14 - '0');
                  if (var4 > 922337203685477580L) {
                     if (!var1) {
                        var3[0] = new OverflowException("Value is too large");
                     }

                     return false;
                  }

                  if (var4 == 922337203685477580L) {
                     if ((var12 & 0xFF) <= 7L || var6 != 1 && (var12 & 0xFF) <= 8L) {
                        if (var6 == -1) {
                           var4 = var4 * var6 * 10L - (var12 & 0xFF);
                        } else {
                           var4 = var4 * 10L + (var12 & 0xFF);
                        }

                        if (x8.n5(var1, var0, var10 + 1, var3)) {
                           var2[0] = var4;
                           return true;
                        }

                        if (!var1) {
                           var3[0] = new OverflowException("Value is too large");
                        }

                        return false;
                     }

                     if (!var1) {
                        var3[0] = new OverflowException("Value is too large");
                     }

                     return false;
                  }

                  var4 = var4 * 10L + (var12 & 0xFF);
                  var7 = true;
               } else if (!x8.n5(var1, var0, var10, var3)) {
                  return false;
               }
            }

            if (!var7) {
               if (!var1) {
                  var3[0] = x8.n5();
               }

               return false;
            } else {
               if (var6 == -1) {
                  var2[0] = var4 * var6;
               } else {
                  var2[0] = var4;
               }

               return true;
            }
         }
      }
   }

   public static long n5(String var0, int var1) {
      return n5(var0, var1, null);
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
            boolean[] var49 = new boolean[]{var22};
            boolean[] var25 = new boolean[]{var21};
            x8.n5(var18, var0, var6, var49, var25);
            var17 = var18[0];
            var22 = var49[0];
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
            boolean[] var50 = new boolean[]{var23};
            x8.n5(var18, var0, var6, var50);
            var17 = var18[0];
            var23 = var50[0];
            if (var23) {
               var18[0] = var17;
               boolean var51 = var15 && !x8.n5(var18, var0, true, var3, var5);
               var17 = var18[0];
               if (var51) {
                  return false;
               }

               if (var23 && !var22 && var13) {
                  var18[0] = var17;
                  boolean[] var52 = new boolean[]{var22};
                  boolean[] var54 = new boolean[]{var21};
                  x8.n5(var18, var0, var6, var52, var54);
                  var17 = var18[0];
                  var22 = var52[0];
                  var21 = var54[0];
                  var18[0] = var17;
                  boolean var56 = var22 && var15 && !x8.n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var56) {
                     return false;
                  }
               }
            }
         }

         long var29 = 0L;
         int var53 = 0;
         boolean var55 = false;
         int var31 = 0;

         do {
            if (!x8.n5(var0.charAt(var17), var8)) {
               var18[0] = var17;
               boolean var32 = var9 && (x8.n5(var18, var0, var6.z3()) || x8.n5(var18, var0, var6.u3()));
               var17 = var18[0];
               if (!var32) {
                  var18[0] = var17;
                  boolean var33 = !var55 && var10 && (x8.n5(var18, var0, var6.q0()) || x8.n5(var18, var0, var6.k5()));
                  var17 = var18[0];
                  if (var33) {
                     var55 = true;
                  } else {
                     if (!var7) {
                        break;
                     }

                     var18[0] = var17;
                     var33 = var7 && x8.n5(var18, var0, var6.t2());
                     var17 = var18[0];
                     if (!var33) {
                        break;
                     }
                  }
               }
            } else if (var8) {
               var53++;
               char var34 = var0.charAt(var17++);
               int var57;
               if (com.aspose.slides.ms.System.t9.u3(var34)) {
                  var57 = var34 - '0';
               } else if (com.aspose.slides.ms.System.t9.c8(var34)) {
                  var57 = var34 - 'a' + 10;
               } else {
                  var57 = var34 - 'A' + 10;
               }

               BigInteger var58 = BigInteger.valueOf(var29);
               BigInteger var65 = var58.multiply(BigInteger.valueOf(16L)).add(BigInteger.valueOf(var57));
               var29 = var65.longValue();
               if (var29 == 0L && !var58.equals(BigInteger.ZERO)) {
                  if (!var3) {
                     var5[0] = new OverflowException("Value too large or too small.");
                  }

                  return false;
               }
            } else if (var55) {
               var53++;
               if (var0.charAt(var17++) != '0') {
                  if (!var3) {
                     var5[0] = new OverflowException(d1.n5(new String[]{"Value too large or too ", "small."}));
                  }

                  return false;
               }
            } else {
               var53++;
               BigInteger var59 = BigInteger.valueOf(var29 * 10L).subtract(BigInteger.valueOf(var0.charAt(var17++) - '0'));
               if (var59.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0 || var59.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                  if (!var3) {
                     var5[0] = new OverflowException("Value too large or too small.");
                  }

                  return false;
               }

               var29 = var59.longValue();
            }
         } while (var17 < var0.length());

         if (var53 == 0) {
            if (!var3) {
               var5[0] = x8.n5();
            }

            return false;
         } else {
            if (var16) {
               var18[0] = var17;
               int[] var60 = new int[]{0};
               boolean var66 = x8.n5(var18, var0, var60, var3, var5) && var5[0] != null;
               var17 = var18[0];
               var31 = var60[0];
               if (var66) {
                  return false;
               }
            }

            if (var12 && !var22) {
               var18[0] = var17;
               boolean[] var61 = new boolean[]{var22};
               boolean[] var67 = new boolean[]{var21};
               x8.n5(var18, var0, var6, var61, var67);
               var17 = var18[0];
               var22 = var61[0];
               var21 = var67[0];
               if (var22 && var17 < var0.length()) {
                  var18[0] = var17;
                  boolean var35 = var14 && !x8.n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var35) {
                     return false;
                  }
               }
            }

            if (var7 && !var23) {
               var18[0] = var17;
               boolean var62 = var14 && var17 < var0.length() && !x8.n5(var18, var0, false, var3, var5);
               var17 = var18[0];
               if (var62) {
                  return false;
               }

               var18[0] = var17;
               boolean[] var68 = new boolean[]{var23};
               x8.n5(var18, var0, var6, var68);
               var17 = var18[0];
               var23 = var68[0];
               if (var23 && var17 < var0.length()) {
                  var18[0] = var17;
                  boolean var72 = var14 && !x8.n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var72) {
                     return false;
                  }

                  if (!var22 && var12) {
                     var18[0] = var17;
                     boolean[] var36 = new boolean[]{var22};
                     boolean[] var37 = new boolean[]{var21};
                     x8.n5(var18, var0, var6, var36, var37);
                     var17 = var18[0];
                     var22 = var36[0];
                     var21 = var37[0];
                  }
               }
            }

            var18[0] = var17;
            boolean var63 = var14 && var17 < var0.length() && !x8.n5(var18, var0, false, var3, var5);
            var17 = var18[0];
            if (var63) {
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
               boolean var69 = var14 && var17 < var0.length() && !x8.n5(var18, var0, false, var3, var5);
               var17 = var18[0];
               if (var69) {
                  return false;
               }
            }

            if (var17 < var0.length() && var0.charAt(var17) != 0) {
               if (!var3) {
                  var5[0] = x8.n5();
               }

               return false;
            } else {
               if (!var21 && !var8) {
                  BigInteger var70 = BigInteger.valueOf(var29);
                  var70 = var70.negate();
                  if (var70.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 || var70.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) {
                     if (!var3) {
                        var5[0] = new OverflowException();
                     }

                     return false;
                  }

                  var29 = var70.longValue();
               }

               if (var31 > 0) {
                  double var38 = Math.pow(10.0, var31) * var29;
                  if (var38 < -2.1474836E9F || var38 > 2.147483647E9) {
                     if (!var3) {
                        var5[0] = new OverflowException("Value too large or too small.");
                     }

                     return false;
                  }

                  var29 = (long)var38;
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
}
