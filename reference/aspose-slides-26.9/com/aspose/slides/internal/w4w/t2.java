package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d2;
import com.aspose.slides.ms.System.h2;

public final class t2 {
   public static double n5(String var0) {
      return n5(var0, 231, null);
   }

   public static double n5(String var0, h2 var1) {
      return n5(var0, 231, var1);
   }

   public static double n5(String var0, int var1, h2 var2) {
      RuntimeException var3 = null;
      double var4 = 0.0;
      double[] var6 = new double[]{0.0};
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

   static boolean n5(String var0, int var1, h2 var2, boolean var3, double[] var4, RuntimeException[] var5) {
      var4[0] = 0.0;
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
         if ((var1 & 512) != 0) {
            String var21 = d1.n5("Double doesn't support parsing with '{0}'.", new Object[]{"AllowHexSpecifier"});
            throw new ArgumentException(var21);
         }

         if (var1 > 511) {
            if (!var3) {
               var5[0] = new ArgumentException();
            }

            return false;
         } else {
            com.aspose.slides.internal.x7n.s7 var6 = com.aspose.slides.internal.x7n.s7.n5(var2);
            if (var6 == null) {
               throw new Exception("How did this happen?");
            }

            int var7 = var0.length();
            byte var8 = 0;
            int var9 = 0;
            boolean var10 = (var1 & 1) != 0;
            boolean var11 = (var1 & 2) != 0;
            if (var10) {
               while (var9 < var7 && com.aspose.slides.ms.System.t9.t9(var0.charAt(var9))) {
                  var9++;
               }

               if (var9 == var7) {
                  if (!var3) {
                     var5[0] = x8.n5();
                  }

                  return false;
               }
            }

            int var12 = var0.length() - 1;
            if (var11) {
               while (com.aspose.slides.ms.System.t9.t9(var0.charAt(var12))) {
                  var12--;
               }
            }

            if (n5(var6.n3(), var0, var9, var12)) {
               var4[0] = Double.NaN;
               return true;
            }

            if (n5(var6.d5(), var0, var9, var12)) {
               var4[0] = Double.POSITIVE_INFINITY;
               return true;
            }

            if (n5(var6.t9(), var0, var9, var12)) {
               var4[0] = Double.NEGATIVE_INFINITY;
               return true;
            }

            byte[] var13 = new byte[var7 + 1];
            char[] var14 = new char[var7 + 1];
            t2$n5 var15 = new t2$n5(var1, var6, var0, var13, var14, var9, var8, var3);
            t2$n5.n5(var15, 6);

            for (; t2$n5.n5(var15) <= var12; t2$n5.l6(var15)) {
               t2$n5.n5(var15, var0.charAt(t2$n5.n5(var15)));
               if (t2$n5.k5(var15) == 0) {
                  t2$n5.l6(var15, var7);
               } else {
                  switch (var15.u9()) {
                     case 6:
                        t2$n5$n5 var16 = t2$n5.u3(var15);
                        if (var16 == t2$n5$n5.u3) {
                           var5[0] = var15.n5();
                           return false;
                        }

                        if (var16 == t2$n5$n5.l6) {
                           break;
                        }

                        if (var16 == t2$n5$n5.k5) {
                           continue;
                        }
                     case 1:
                        t2$n5$n5 var22 = var15.l6();
                        if (var22 == t2$n5$n5.u3) {
                           var5[0] = var15.n5();
                           return false;
                        }

                        if (var22 == t2$n5$n5.l6) {
                           break;
                        }

                        if (var22 == t2$n5$n5.k5) {
                           continue;
                        }
                     case 2:
                        t2$n5$n5 var23 = var15.k5();
                        if (var23 == t2$n5$n5.u3) {
                           var5[0] = var15.n5();
                           return false;
                        }

                        if (var23 == t2$n5$n5.l6) {
                           break;
                        }

                        if (var23 == t2$n5$n5.k5) {
                           continue;
                        }
                     case 3:
                        t2$n5$n5 var24 = t2$n5.a6(var15);
                        if (var24 == t2$n5$n5.u3) {
                           var5[0] = var15.n5();
                           return false;
                        }

                        if (var24 == t2$n5$n5.l6) {
                           break;
                        }

                        if (var24 == t2$n5$n5.k5) {
                           continue;
                        }
                     case 4:
                        t2$n5$n5 var25 = var15.u3();
                        if (var25 == t2$n5$n5.u3) {
                           var5[0] = var15.n5();
                           return false;
                        }

                        if (var25 == t2$n5$n5.l6) {
                           break;
                        }

                        if (var25 == t2$n5$n5.k5) {
                           continue;
                        }
                     case 5:
                        t2$n5$n5 var26 = var15.a6();
                        if (var26 == t2$n5$n5.u3) {
                           var5[0] = var15.n5();
                           return false;
                        }

                        if (var26 != t2$n5$n5.l6 && var26 == t2$n5$n5.k5) {
                           continue;
                        }
                  }

                  if (t2$n5.u9(var15) == 7) {
                     break;
                  }
               }
            }

            t2$n5.h0(var15)[t2$n5.c8(var15)] = 0;
            t2$n5.t2(var15)[t2$n5.c8(var15)] = 0;
            boolean var27 = false;
            double var17 = 0.0;

            try {
               var17 = Double.parseDouble(d1.n5(var14));
               if (t2$n5.s7(var15)) {
                  var17 = -var17;
               }
            } catch (RuntimeException var20) {
               var27 = true;
            }

            if (var27) {
               if (!var3) {
                  var5[0] = x8.n5();
               }

               return false;
            } else {
               if (!d2.a6(var17) && !d2.u3(var17)) {
                  var4[0] = var17;
                  return true;
               }

               if (!var3) {
                  var5[0] = new OverflowException();
               }

               return false;
            }
         }
      }
   }

   static boolean n5(String var0, String var1, int var2, int var3) {
      return var3 - var2 + 1 == var0.length() && d1.l6(var0, 0, var1, var2, var0.length()) == 0;
   }
}
