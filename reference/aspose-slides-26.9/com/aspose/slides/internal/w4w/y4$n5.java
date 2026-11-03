package com.aspose.slides.internal.w4w;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;

class y4$n5 {
   public boolean n5 = false;
   public int l6 = 0;
   public int k5 = -1;
   public int u3 = 0;
   public int a6 = 0;
   public int u9 = 0;
   public int h0 = 0;
   public boolean c8 = false;
   public int t2 = 0;
   public int s7 = 0;
   public boolean x8 = true;
   public int n3 = 0;
   public int y4 = 0;
   public int e2 = 0;

   private y4$n5() {
   }

   public static void n5(String var0, boolean[] var1, boolean var2, int[] var3, int[] var4) {
      int[] var5 = new int[3];
      int var6 = 0;
      int var7 = 0;
      char var8 = 0;

      for (int var9 = 0; var9 < var0.length(); var9++) {
         char var10 = var0.charAt(var9);
         if (var10 != var8 && (var8 != 0 || var10 != '"' && var10 != '\'')) {
            if (var8 == 0 && var0.charAt(var9) == ';' && (var9 == 0 || var0.charAt(var9 - 1) != '\\')) {
               var5[var6++] = var9 - var7;
               var7 = var9 + 1;
               if (var6 == 3) {
                  break;
               }
            }
         } else if (var8 == 0) {
            var8 = var10;
         } else {
            var8 = 0;
         }
      }

      if (var6 == 0) {
         var3[0] = 0;
         var4[0] = var0.length();
      } else if (var6 == 1) {
         if (!var1[0] && !var2) {
            if (var5[0] + 1 < var0.length()) {
               var1[0] = true;
               var3[0] = var5[0] + 1;
               var4[0] = var0.length() - var3[0];
            } else {
               var3[0] = 0;
               var4[0] = var5[0];
            }
         } else {
            var3[0] = 0;
            var4[0] = var5[0];
         }
      } else if (var6 == 2) {
         if (var2) {
            var3[0] = var5[0] + var5[1] + 2;
            var4[0] = var0.length() - var3[0];
         } else if (var1[0]) {
            var3[0] = 0;
            var4[0] = var5[0];
         } else if (var5[1] > 0) {
            var1[0] = true;
            var3[0] = var5[0] + 1;
            var4[0] = var5[1];
         } else {
            var3[0] = 0;
            var4[0] = var5[0];
         }
      } else if (var6 == 3) {
         if (var2) {
            var3[0] = var5[0] + var5[1] + 2;
            var4[0] = var5[2];
         } else if (var1[0]) {
            var3[0] = 0;
            var4[0] = var5[0];
         } else if (var5[1] > 0) {
            var1[0] = true;
            var3[0] = var5[0] + 1;
            var4[0] = var5[1];
         } else {
            var3[0] = 0;
            var4[0] = var5[0];
         }
      } else {
         throw new ArgumentException();
      }
   }

   public static y4$n5 n5(String var0, int var1, int var2, com.aspose.slides.internal.x7n.s7 var3) {
      char var4 = 0;
      boolean var5 = true;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = true;
      y4$n5 var9 = new y4$n5();
      int var10 = 0;

      for (int var11 = var1; var11 - var1 < var2; var11++) {
         char var12 = var0.charAt(var11);
         if (var12 == var4 && var12 != 0) {
            var4 = 0;
         } else if (var4 == 0) {
            if (var7 && var12 != 0 && var12 != '0' && var12 != '#') {
               var7 = false;
               var5 = var9.k5 < 0;
               var6 = !var5;
               var11--;
            } else {
               switch (var12) {
                  case '"':
                  case '\'':
                     if (var12 == '"' || var12 == '\'') {
                        var4 = var12;
                     }
                     break;
                  case '#':
                  case '0':
                     if (var12 == '#') {
                        if (var8 && var5) {
                           var9.u9++;
                        } else if (var6) {
                           var9.u3++;
                        } else if (var7) {
                           var9.s7++;
                        }
                     }

                     if (var12 != '#') {
                        var8 = false;
                        if (var6) {
                           var9.u3 = 0;
                        } else if (var7) {
                           var9.s7 = 0;
                        }
                     }

                     if (var9.h0 == -1) {
                        var9.h0 = var11;
                     }

                     if (var5) {
                        var9.a6++;
                        if (var10 > 0) {
                           var9.n5 = true;
                        }

                        var10 = 0;
                     } else if (var6) {
                        var9.l6++;
                     } else if (var7) {
                        var9.t2++;
                     }
                     break;
                  case '%':
                     var9.y4++;
                     break;
                  case ',':
                     if (var5 && var9.a6 > 0) {
                        var10++;
                     }
                     break;
                  case '.':
                     var5 = false;
                     var6 = true;
                     var7 = false;
                     if (var9.k5 == -1) {
                        var9.k5 = var11;
                     }
                     break;
                  case 'E':
                  case 'e':
                     if (!var9.c8) {
                        var9.c8 = true;
                        var5 = false;
                        var6 = false;
                        var7 = true;
                        if (var11 + 1 - var1 < var2) {
                           char var13 = var0.charAt(var11 + 1);
                           if (var13 == '+') {
                              var9.x8 = false;
                           }

                           if (var13 == '+' || var13 == '-') {
                              var11++;
                           } else if (var13 != '0' && var13 != '#') {
                              var9.c8 = false;
                              if (var9.k5 < 0) {
                                 var5 = true;
                              }
                           }
                        }
                     }
                     break;
                  case '\\':
                     var11++;
                     break;
                  case '‰':
                     var9.e2++;
               }
            }
         }
      }

      if (var9.t2 == 0) {
         var9.c8 = false;
      } else {
         var9.u9 = 0;
      }

      if (var9.l6 == 0) {
         var9.k5 = -1;
      }

      var9.n3 += var10 * 3;
      return var9;
   }

   public String n5(String var1, int var2, int var3, com.aspose.slides.internal.x7n.s7 var4, boolean var5, a5 var6, a5 var7, a5 var8) {
      a5 var9;
      char var10;
      boolean var11;
      boolean var12;
      int var13;
      int var14;
      int var15;
      int[] var16;
      String var17;
      int var18;
      int var20;
      int var21;
      int var22;
      var9 = new a5();
      var10 = 0;
      var11 = true;
      var12 = false;
      var13 = 0;
      var14 = 0;
      var15 = 0;
      var16 = var4.m1();
      var17 = var4.z3();
      var18 = 0;
      int var19 = 0;
      var20 = 0;
      var21 = 0;
      var22 = 0;
      if (this.n5 && var16.length > 0) {
         var18 = var6.l6();

         for (int var23 = 0; var23 < var16.length; var23++) {
            var19 += var16[var23];
            if (var19 <= var18) {
               var20 = var23;
            }
         }

         var22 = var16[var20];
         int var28 = var18 > var19 ? var18 - var19 : 0;
         if (var22 == 0) {
            while (var20 >= 0 && var16[var20] == 0) {
               var20--;
            }

            var22 = var28 > 0 ? var28 : var16[var20];
         }

         if (var28 == 0) {
            var21 = var22;
         } else {
            var20 += var28 / var22;
            var21 = var28 % var22;
            if (var21 == 0) {
               var21 = var22;
            } else {
               var20++;
            }
         }
      } else {
         this.n5 = false;
      }

      for (int var29 = var2; var29 - var2 < var3; var29++) {
         char var24 = var1.charAt(var29);
         if (var24 == var10 && var24 != 0) {
            var10 = 0;
         } else if (var10 != 0) {
            var9.n5(var24);
         } else {
            switch (var24) {
               case '"':
               case '\'':
                  if (var24 == '"' || var24 == '\'') {
                     var10 = var24;
                  }
                  break;
               case '#':
               case '0':
                  if (var11) {
                     if (this.a6 - ++var13 < var6.l6() + var14 || var24 == '0') {
                        while (this.a6 - var13 + var14 < var6.l6()) {
                           var9.n5(var6.l6(var14++));
                           if (this.n5) {
                              if (--var18 > 0) {
                                 if (--var21 == 0) {
                                    var9.n5(var17);
                                    var20--;
                                    if (var20 < var16.length && var20 >= 0) {
                                       var22 = var16[var20];
                                    }

                                    var21 = var22;
                                 }
                              }
                           }
                        }
                     }
                  } else if (var12) {
                     if (var15 < var7.l6()) {
                        var9.n5(var7.l6(var15++));
                     }
                  } else {
                     var9.n5(var24);
                  }
                  break;
               case '%':
                  var9.n5(var4.a0());
               case ',':
                  break;
               case '.':
                  if (this.k5 == var29) {
                     if (this.l6 > 0) {
                        while (var14 < var6.l6()) {
                           var9.n5(var6.l6(var14++));
                        }
                     }

                     if (var7.l6() > 0) {
                        var9.n5(var4.q0());
                     }
                  }

                  var11 = false;
                  var12 = true;
                  break;
               case 'E':
               case 'e':
                  if (var8 != null && this.c8) {
                     boolean var25 = true;
                     boolean var26 = false;

                     int var27;
                     for (var27 = var29 + 1; var27 - var2 < var3; var27++) {
                        if (var1.charAt(var27) == '0') {
                           var26 = true;
                        } else if (var27 != var29 + 1 || var1.charAt(var27) != '+' && var1.charAt(var27) != '-') {
                           if (!var26) {
                              var25 = false;
                           }
                           break;
                        }
                     }

                     if (var25) {
                        var29 = var27 - 1;
                        var11 = this.k5 < 0;
                        var12 = !var11;
                        var9.n5(var24);
                        var9.n5((Object)var8);
                        var8 = null;
                     } else {
                        var9.n5(var24);
                     }
                     break;
                  }

                  var9.n5(var24);
                  break;
               case '\\':
                  if (++var29 - var2 < var3) {
                     var9.n5(var1.charAt(var29));
                  }
                  break;
               case '‰':
                  var9.n5(var4.d2());
                  break;
               default:
                  var9.n5(var24);
            }
         }
      }

      if (!var5) {
         var9.n5(0, var4.z1());
      }

      String var30 = var9.toString();
      if (var30.equals("()")) {
         var30 = "";
      }

      return var30;
   }
}
