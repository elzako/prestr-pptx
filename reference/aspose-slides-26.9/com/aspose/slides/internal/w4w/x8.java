package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.h2;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class x8 {
   public static boolean n5(boolean var0, String var1, int var2, RuntimeException[] var3) {
      int var4 = var1.length();

      for (int var5 = var2; var5 < var4; var5++) {
         char var6 = var1.charAt(var5);
         if (var6 != 0 && !com.aspose.slides.ms.System.t9.t9(var6)) {
            if (!var0) {
               var3[0] = n5();
            }

            return false;
         }
      }

      return true;
   }

   static boolean n5(String var0, boolean var1, int[] var2, RuntimeException[] var3) {
      int var4 = 0;
      byte var5 = 1;
      boolean var6 = false;
      var2[0] = 0;
      var3[0] = null;
      com.aspose.slides.internal.x7n.s7 var7 = com.aspose.slides.internal.x7n.l6.u3().e2();
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
               var3[0] = n5();
            }

            return false;
         } else {
            if (d1.n5(var0, var9, var7.s3(), 0, var7.s3().length()) == 0) {
               var9 += var7.s3().length();
            } else if (d1.n5(var0, var9, var7.z1(), 0, var7.z1().length()) == 0) {
               var5 = -1;
               var9 += var7.z1().length();
            }

            for (; var9 < var8; var9++) {
               char var13 = var0.charAt(var9);
               if (var13 == 0) {
                  var9 = var8;
               } else if (var13 >= '0' && var13 <= '9') {
                  byte var11 = (byte)(var13 - '0');
                  if (var4 > 214748364) {
                     if (!var1) {
                        var3[0] = new OverflowException("Value is too large");
                     }

                     return false;
                  }

                  if (var4 == 214748364) {
                     if ((var11 & 255) <= 7 || var5 != 1 && (var11 & 255) <= 8) {
                        if (var5 == -1) {
                           var4 = var4 * var5 * 10 - (var11 & 255);
                        } else {
                           var4 = var4 * 10 + (var11 & 255);
                        }

                        if (n5(var1, var0, var9 + 1, var3)) {
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

                  var4 = var4 * 10 + (var11 & 255);
                  var6 = true;
               } else if (!n5(var1, var0, var9, var3)) {
                  return false;
               }
            }

            if (!var6) {
               if (!var1) {
                  var3[0] = n5();
               }

               return false;
            } else {
               if (var5 == -1) {
                  var2[0] = var4 * var5;
               } else {
                  var2[0] = var4;
               }

               return true;
            }
         }
      }
   }

   public static int n5(String var0, h2 var1) {
      return n5(var0, 7, var1);
   }

   public static int n5(String var0, int var1) {
      return n5(var0, var1, null);
   }

   static boolean n5(int var0, boolean var1, RuntimeException[] var2) {
      if ((var0 & 512) != 0) {
         int var3 = var0 ^ 512;
         if ((var3 & 1) != 0) {
            var3 ^= 1;
         }

         if ((var3 & 2) != 0) {
            var3 ^= 2;
         }

         if (var3 != 0) {
            if (!var1) {
               var2[0] = new ArgumentException(d1.n5(new String[]{"With AllowHexSpecifier only ", "AllowLeadingWhite and AllowTrailingWhite ", "are permitted."}));
            }

            return false;
         }
      } else if (var0 > 511) {
         if (!var1) {
            var2[0] = new ArgumentException("Not a valid number style");
         }

         return false;
      }

      return true;
   }

   static boolean n5(int[] var0, String var1, boolean var2, boolean var3, RuntimeException[] var4) {
      while (var0[0] < var1.length() && com.aspose.slides.ms.System.t9.t9(var1.charAt(var0[0]))) {
         var0[0]++;
      }

      if (var2 && var0[0] >= var1.length()) {
         if (!var3) {
            var4[0] = n5();
         }

         return false;
      } else {
         return true;
      }
   }

   static void n5(int[] var0, String var1, com.aspose.slides.internal.x7n.s7 var2, boolean[] var3, boolean[] var4) {
      if (var0[0] + var2.z1().length() <= var1.length() && d1.l6(var1, var2.z1(), var0[0], var2.z1().length(), (short)4) == var0[0]) {
         var4[0] = true;
         var3[0] = true;
         var0[0] += var2.z1().length();
      } else if (var0[0] + var2.s3().length() <= var1.length() && d1.l6(var1, var2.s3(), var0[0], var2.s3().length(), (short)4) == var0[0]) {
         var4[0] = false;
         var0[0] += var2.s3().length();
         var3[0] = true;
      }
   }

   static void n5(int[] var0, String var1, com.aspose.slides.internal.x7n.s7 var2, boolean[] var3) {
      if (var0[0] + var2.t2().length() <= var1.length() && d1.a6(d1.l6(var1, var0[0], var2.t2().length()), var2.t2())) {
         var3[0] = true;
         var0[0] += var2.t2().length();
      }
   }

   static boolean n5(int[] var0, String var1, int[] var2, boolean var3, RuntimeException[] var4) {
      var2[0] = 0;
      long var5 = 0L;
      int var7 = d1.n5(var1, new char[]{'e', 'E'}, var0[0]);
      if (var7 < 0) {
         var4[0] = null;
         return false;
      }

      if (++var7 == var1.length()) {
         var4[0] = var3 ? null : n5();
         return true;
      }

      if (var1.charAt(var7) == '-') {
         var4[0] = var3 ? null : new OverflowException("Value too large or too small.");
         return true;
      }

      if (var1.charAt(var7) == '+') {
         if (++var7 == var1.length()) {
            var4[0] = var3 ? null : n5();
            return true;
         }
      }

      while (var7 < var1.length()) {
         if (!com.aspose.slides.ms.System.t9.u3(var1.charAt(var7))) {
            var4[0] = var3 ? null : n5();
            return true;
         }

         BigInteger var8 = BigInteger.valueOf(10L * var5);
         var8 = var8.subtract(BigInteger.valueOf(var1.charAt(var7) - '0'));
         if (var8.compareTo(BigInteger.valueOf(-2147483648L)) < 0 || var8.compareTo(BigInteger.valueOf(2147483647L)) > 0) {
            var4[0] = var3 ? null : new OverflowException("Value too large or too small.");
            return true;
         }

         var5 = var8.longValue();
         var7++;
      }

      var5 = -var5;
      var4[0] = null;
      var2[0] = (int)var5;
      var0[0] = var7;
      return true;
   }

   static boolean n5(int[] var0, String var1, String var2) {
      if (var0[0] + var2.length() <= var1.length() && d1.a6(d1.l6(var1, var0[0], var2.length()), var2)) {
         var0[0] += var2.length();
         return true;
      } else {
         return false;
      }
   }

   static boolean n5(char var0, boolean var1) {
      return !var1
         ? com.aspose.slides.ms.System.t9.u3(var0)
         : com.aspose.slides.ms.System.t9.u3(var0) || var0 >= 'A' && var0 <= 'F' || var0 >= 'a' && var0 <= 'f';
   }

   static Exception n5() {
      return new FormatException("Input string was not in the correct format");
   }

   static boolean n5(String var0, int var1, h2 var2, boolean var3, int[] var4, RuntimeException[] var5) {
      var4[0] = 0;
      var5[0] = null;
      if (var0 == null) {
         if (!var3) {
            var5[0] = new ArgumentNullException("s");
         }

         return false;
      } else if (var0.length() == 0) {
         if (!var3) {
            var5[0] = n5();
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

         if (!n5(var1, var3, var5)) {
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
         boolean var19 = var15 && !n5(var18, var0, true, var3, var5);
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
            boolean var24 = var15 && !n5(var18, var0, true, var3, var5);
            var17 = var18[0];
            if (var24) {
               return false;
            }

            if (d1.a6(d1.l6(var0, var17, var6.z1().length()), var6.z1())) {
               if (!var3) {
                  var5[0] = n5();
               }

               return false;
            }

            if (d1.a6(d1.l6(var0, var17, var6.s3().length()), var6.s3())) {
               if (!var3) {
                  var5[0] = n5();
               }

               return false;
            }
         }

         if (var13 && !var22) {
            var18[0] = var17;
            boolean[] var48 = new boolean[]{var22};
            boolean[] var25 = new boolean[]{var21};
            n5(var18, var0, var6, var48, var25);
            var17 = var18[0];
            var22 = var48[0];
            var21 = var25[0];
            if (var22) {
               int var26 = var17;
               var18[0] = var17;
               boolean var27 = var15 && !n5(var18, var0, true, var3, var5);
               var17 = var18[0];
               if (var27) {
                  return false;
               }

               if (var21 && var17 > var26) {
                  return false;
               }

               if (var7) {
                  var18[0] = var17;
                  boolean[] var28 = new boolean[]{false};
                  n5(var18, var0, var6, var28);
                  var17 = var18[0];
                  var23 = var28[0];
                  var18[0] = var17;
                  boolean var29 = var23 && var15 && !n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var29) {
                     return false;
                  }
               }
            }
         }

         if (var7 && !var23) {
            var18[0] = var17;
            boolean[] var49 = new boolean[]{var23};
            n5(var18, var0, var6, var49);
            var17 = var18[0];
            var23 = var49[0];
            if (var23) {
               var18[0] = var17;
               boolean var51 = var15 && !n5(var18, var0, true, var3, var5);
               var17 = var18[0];
               if (var51) {
                  return false;
               }

               if (var23 && !var22 && var13) {
                  var18[0] = var17;
                  boolean[] var53 = new boolean[]{var22};
                  boolean[] var55 = new boolean[]{var21};
                  n5(var18, var0, var6, var53, var55);
                  var17 = var18[0];
                  var22 = var53[0];
                  var21 = var55[0];
                  var18[0] = var17;
                  boolean var57 = var22 && var15 && !n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var57) {
                     return false;
                  }
               }
            }
         }

         int var50 = 0;
         int var52 = 0;
         boolean var54 = false;
         int var59 = 0;

         do {
            if (!n5(var0.charAt(var17), var8)) {
               var18[0] = var17;
               boolean var30 = var9 && (n5(var18, var0, var6.z3()) || n5(var18, var0, var6.u3()));
               var17 = var18[0];
               if (!var30) {
                  var18[0] = var17;
                  boolean var31 = !var54 && var10 && (n5(var18, var0, var6.q0()) || n5(var18, var0, var6.k5()));
                  var17 = var18[0];
                  if (var31) {
                     var54 = true;
                  } else {
                     if (!var7) {
                        break;
                     }

                     var18[0] = var17;
                     var31 = var7 && n5(var18, var0, var6.t2());
                     var17 = var18[0];
                     if (!var31) {
                        break;
                     }
                  }
               }
            } else if (var8) {
               var52++;
               char var58 = var0.charAt(var17++);
               int var56;
               if (com.aspose.slides.ms.System.t9.u3(var58)) {
                  var56 = var58 - '0';
               } else if (com.aspose.slides.ms.System.t9.c8(var58)) {
                  var56 = var58 - 'a' + 10;
               } else {
                  var56 = var58 - 'A' + 10;
               }

               long var32 = var50;
               if (var3) {
                  if ((var32 & 4294967295L & 4026531840L) != 0L) {
                     return false;
                  }

                  var50 = (int)((var32 & 4294967295L) * 16L + (var56 & 4294967295L));
               } else {
                  var50 = (int)((var32 & 4294967295L) * 16L + (var56 & 4294967295L) & 4294967295L);
                  if (var50 == 0 && var32 != 0L) {
                     var5[0] = new OverflowException("Value too large or too small.");
                     return false;
                  }
               }
            } else if (var54) {
               var52++;
               if (var0.charAt(var17++) != '0') {
                  if (!var3) {
                     var5[0] = new OverflowException("Value too large or too small.");
                  }

                  return false;
               }
            } else {
               var52++;
               BigInteger var60 = BigInteger.valueOf(var50);
               BigInteger var66 = var60.multiply(BigInteger.valueOf(10L)).subtract(BigInteger.valueOf(var0.charAt(var17++) - '0'));
               if (var66.compareTo(BigInteger.valueOf(2147483647L)) > 0 || var66.compareTo(BigInteger.valueOf(-2147483648L)) < 0) {
                  if (!var3) {
                     var5[0] = new OverflowException("Value too large or too small.");
                  }

                  return false;
               }

               var50 = var66.intValue();
            }
         } while (var17 < var0.length());

         if (var52 == 0) {
            if (!var3) {
               var5[0] = n5();
            }

            return false;
         } else {
            if (var16) {
               var18[0] = var17;
               int[] var61 = new int[]{0};
               boolean var67 = n5(var18, var0, var61, var3, var5) && var5[0] != null;
               var17 = var18[0];
               var59 = var61[0];
               if (var67) {
                  return false;
               }
            }

            if (var12 && !var22) {
               var18[0] = var17;
               boolean[] var62 = new boolean[]{var22};
               boolean[] var68 = new boolean[]{var21};
               n5(var18, var0, var6, var62, var68);
               var17 = var18[0];
               var22 = var62[0];
               var21 = var68[0];
               if (var22 && var17 < var0.length()) {
                  var18[0] = var17;
                  boolean var34 = var14 && !n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var34) {
                     return false;
                  }
               }
            }

            if (var7 && !var23) {
               var18[0] = var17;
               boolean var63 = var14 && var17 < var0.length() && !n5(var18, var0, false, var3, var5);
               var17 = var18[0];
               if (var63) {
                  return false;
               }

               var18[0] = var17;
               boolean[] var69 = new boolean[]{var23};
               n5(var18, var0, var6, var69);
               var17 = var18[0];
               var23 = var69[0];
               if (var23 && var17 < var0.length()) {
                  var18[0] = var17;
                  boolean var73 = var14 && !n5(var18, var0, true, var3, var5);
                  var17 = var18[0];
                  if (var73) {
                     return false;
                  }

                  if (!var22 && var12) {
                     var18[0] = var17;
                     boolean[] var35 = new boolean[]{var22};
                     boolean[] var36 = new boolean[]{var21};
                     n5(var18, var0, var6, var35, var36);
                     var17 = var18[0];
                     var22 = var35[0];
                     var21 = var36[0];
                  }
               }
            }

            var18[0] = var17;
            boolean var64 = var14 && var17 < var0.length() && !n5(var18, var0, false, var3, var5);
            var17 = var18[0];
            if (var64) {
               return false;
            }

            if (var20) {
               if (var17 >= var0.length() || var0.charAt(var17++) != ')') {
                  if (!var3) {
                     var5[0] = n5();
                  }

                  return false;
               }

               var18[0] = var17;
               boolean var70 = var14 && var17 < var0.length() && !n5(var18, var0, false, var3, var5);
               var17 = var18[0];
               if (var70) {
                  return false;
               }
            }

            if (var17 < var0.length() && var0.charAt(var17) != 0) {
               if (!var3) {
                  var5[0] = n5();
               }

               return false;
            } else {
               if (!var21 && !var8) {
                  if (var3) {
                     long var37 = -var50;
                     if (var37 < -2147483648L || var37 > 2147483647L) {
                        return false;
                     }

                     var50 = (int)var37;
                  } else {
                     long var74 = -var50;
                     if (var74 > 2147483647L || var74 < -2147483648L) {
                        var5[0] = new OverflowException("Value too large or too small.");
                        return false;
                     }

                     var50 = -var50;
                  }
               }

               if (var59 > 0) {
                  BigDecimal var71 = BigDecimal.valueOf(Math.pow(10.0, var59));
                  var71 = var71.multiply(BigDecimal.valueOf(var50));
                  if (var71.compareTo(BigDecimal.valueOf(-2147483648L)) < 0 || var71.compareTo(BigDecimal.valueOf(2147483647L)) > 0) {
                     if (!var3) {
                        var5[0] = new OverflowException("Value too large or too small.");
                     }

                     return false;
                  }

                  var50 = var71.intValue();
               }

               var4[0] = var50;
               return true;
            }
         }
      }
   }

   public static int n5(String var0) {
      RuntimeException var1 = null;
      int var2 = 0;
      int[] var3 = new int[]{0};
      RuntimeException[] var4 = new RuntimeException[]{var1};
      boolean var5 = !n5(var0, false, var3, var4);
      var2 = var3[0];
      var1 = var4[0];
      if (var5) {
         throw var1;
      } else {
         return var2;
      }
   }

   public static int n5(String var0, int var1, h2 var2) {
      RuntimeException var3 = null;
      int var4 = 0;
      int[] var5 = new int[]{0};
      RuntimeException[] var6 = new RuntimeException[]{var3};
      boolean var7 = !n5(var0, var1, var2, false, var5, var6);
      var4 = var5[0];
      var3 = var6[0];
      if (var7) {
         throw var3;
      } else {
         return var4;
      }
   }
}
