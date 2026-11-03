package com.aspose.slides.internal.b8c;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;

public class f2i extends com.aspose.slides.internal.v6g.h0<f2i> {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private long h0;

   public f2i() {
   }

   public f2i(boolean var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("years");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("months");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("days");
      }

      if (var5 < 0) {
         throw new ArgumentOutOfRangeException("hours");
      }

      if (var6 < 0) {
         throw new ArgumentOutOfRangeException("minutes");
      }

      if (var7 < 0) {
         throw new ArgumentOutOfRangeException("seconds");
      }

      if (var8 >= 0 && var8 <= 999999999) {
         this.n5 = var2;
         this.l6 = var3;
         this.k5 = var4;
         this.u3 = var5;
         this.a6 = var6;
         this.u9 = var7;
         this.h0 = var8 & 4294967295L;
         if (var1) {
            this.h0 = (this.h0 | 2147483648L) & 4294967295L;
         }
      } else {
         throw new ArgumentOutOfRangeException("nanoseconds");
      }
   }

   public f2i(com.aspose.slides.ms.System.s4 var1, int var2) {
      long var3 = var1.a6();
      boolean var5;
      long var6;
      if (var3 < 0L) {
         var5 = true;
         var6 = com.aspose.slides.internal.v6g.k5.h0(-var3, 11);
      } else {
         var5 = false;
         var6 = com.aspose.slides.internal.v6g.k5.h0(var3, 11);
      }

      if (var2 == 1) {
         int var8 = (int)(var6 / (com.aspose.slides.internal.v6g.k5.h0(864000000000L, 11) * 365L));
         int var9 = (int)(
            var6 % (com.aspose.slides.internal.v6g.k5.h0(864000000000L, 11) * 365L) / (com.aspose.slides.internal.v6g.k5.h0(864000000000L, 11) * 30L)
         );
         if (var9 == 12) {
            var8++;
            var9 = 0;
         }

         new f2i(var5, var8, var9, 0, 0, 0, 0, 0).n5(this);
      } else {
         this.h0 = (var6 % 10000000L & 4294967295L) * 100L & 4294967295L;
         if (var5) {
            this.h0 = (this.h0 | 2147483648L) & 4294967295L;
         }

         this.n5 = 0;
         this.l6 = 0;
         this.k5 = (int)(var6 / com.aspose.slides.internal.v6g.k5.h0(864000000000L, 11));
         this.u3 = (int)(var6 / com.aspose.slides.internal.v6g.k5.h0(36000000000L, 11) % 24L);
         this.a6 = (int)(var6 / com.aspose.slides.internal.v6g.k5.h0(600000000L, 11) % 60L);
         this.u9 = (int)(var6 / com.aspose.slides.internal.v6g.k5.h0(10000000L, 11) % 60L);
      }
   }

   public f2i(String var1, int var2) {
      f2i var3 = new f2i();
      f2i[] var4 = new f2i[]{var3};
      RuntimeException var5 = n5(var1, var2, var4);
      var4[0].n5(var3);
      if (var5 != null) {
         throw var5;
      }

      this.n5 = var3.l6();
      this.l6 = var3.k5();
      this.k5 = var3.u3();
      this.u3 = var3.a6();
      this.a6 = var3.u9();
      this.u9 = var3.h0();
      this.h0 = var3.c8() & 4294967295L;
      if (var3.n5()) {
         this.h0 = (this.h0 | 2147483648L) & 4294967295L;
      }
   }

   public final boolean n5() {
      return (this.h0 & 2147483648L & 4294967295L) != 0L;
   }

   public final int l6() {
      return this.n5;
   }

   public final int k5() {
      return this.l6;
   }

   public final int u3() {
      return this.k5;
   }

   public final int a6() {
      return this.u3;
   }

   public final int u9() {
      return this.a6;
   }

   public final int h0() {
      return this.u9;
   }

   public final int c8() {
      return (int)(this.h0 & 2147483647L);
   }

   public final com.aspose.slides.ms.System.s4 n5(int var1) {
      com.aspose.slides.ms.System.s4 var2 = new com.aspose.slides.ms.System.s4();
      com.aspose.slides.ms.System.s4[] var3 = new com.aspose.slides.ms.System.s4[]{var2};
      RuntimeException var4 = this.n5(var1, var3);
      var3[0].u3(var2);
      if (var4 != null) {
         throw var4;
      } else {
         return var2;
      }
   }

   public final RuntimeException n5(com.aspose.slides.ms.System.s4[] var1) {
      return this.n5(0, var1);
   }

   public final RuntimeException n5(int var1, com.aspose.slides.ms.System.s4[] var2) {
      Object var3 = null;
      long var4 = 0L;

      try {
         if (var1 != 2) {
            var4 += (com.aspose.slides.internal.v6g.k5.h0(this.n5, 9) + com.aspose.slides.internal.v6g.k5.h0(this.l6, 9) / 12L) * 365L;
            var4 += com.aspose.slides.internal.v6g.k5.h0(this.l6, 9) % 12L * 30L;
         }

         if (var1 != 1) {
            var4 += com.aspose.slides.internal.v6g.k5.h0(this.k5, 9);
            var4 *= 24L;
            var4 += com.aspose.slides.internal.v6g.k5.h0(this.u3, 9);
            var4 *= 60L;
            var4 += com.aspose.slides.internal.v6g.k5.h0(this.a6, 9);
            var4 *= 60L;
            var4 += com.aspose.slides.internal.v6g.k5.h0(this.u9, 9);
            var4 *= com.aspose.slides.internal.v6g.k5.h0(10000000L, 11);
            var4 += com.aspose.slides.internal.v6g.k5.h0(this.c8(), 9) / 100L;
         } else {
            var4 *= com.aspose.slides.internal.v6g.k5.h0(864000000000L, 11);
         }

         if (this.n5()) {
            if (var4 == com.aspose.slides.internal.v6g.k5.h0(Long.MAX_VALUE, 11) + 1L) {
               var2[0] = new com.aspose.slides.ms.System.s4(Long.MIN_VALUE);
            } else {
               var2[0] = new com.aspose.slides.ms.System.s4(-var4);
            }
         } else {
            var2[0] = new com.aspose.slides.ms.System.s4(var4);
         }

         return null;
      } catch (OverflowException var7) {
         com.aspose.slides.ms.System.s4.l6.u3(var2[0]);
         return new OverflowException(com.aspose.slides.ms.System.Xml.v3.n5("Value '{0}' was either too large or too small for {1}.", var1, "TimeSpan"));
      }
   }

   @Override
   public String toString() {
      return this.l6(0);
   }

   public final String l6(int var1) {
      com.aspose.slides.internal.l7h.a5 var2 = new com.aspose.slides.internal.l7h.a5(20);
      if (this.n5()) {
         var2.n5('-');
      }

      var2.n5('P');
      if (var1 != 2) {
         if (this.n5 != 0) {
            var2.n5(com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
            var2.n5('Y');
         }

         if (this.l6 != 0) {
            var2.n5(com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
            var2.n5('M');
         }
      }

      if (var1 != 1) {
         if (this.k5 != 0) {
            var2.n5(com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
            var2.n5('D');
         }

         if (this.u3 != 0 || this.a6 != 0 || this.u9 != 0 || this.c8() != 0) {
            var2.n5('T');
            if (this.u3 != 0) {
               var2.n5(com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
               var2.n5('H');
            }

            if (this.a6 != 0) {
               var2.n5(com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
               var2.n5('M');
            }

            int var3 = this.c8();
            if (this.u9 != 0 || var3 != 0) {
               var2.n5(com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
               if (var3 != 0) {
                  var2.n5('.');
                  int var4 = var2.l6();
                  var2.n5(var2.l6() + 9);
                  int var5 = var2.l6() - 1;

                  for (int var6 = var5; var6 >= var4; var6--) {
                     int var7 = var3 % 10;
                     var2.n5(var6, (char)(var7 + 48));
                     if (var5 == var6 && var7 == 0) {
                        var5--;
                     }

                     var3 /= 10;
                  }

                  var2.n5(var5 + 1);
               }

               var2.n5('S');
            }
         }

         if (var2.l6(var2.l6() - 1) == 'P') {
            var2.n5("T0S");
         }
      } else if (var2.l6(var2.l6() - 1) == 'P') {
         var2.n5("0M");
      }

      return var2.toString();
   }

   public static RuntimeException n5(String var0, f2i[] var1) {
      return n5(var0, 0, var1);
   }

   public static RuntimeException n5(String var0, int var1, f2i[] var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      var2[0] = new f2i();
      var0 = com.aspose.slides.ms.System.d1.l6(var0);
      int var6 = var0.length();
      int var7 = 0;
      var4 = 0;
      if (var7 >= var6) {
         return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
      }

      if (var0.charAt(var7) == '-') {
         var7++;
         var2[0].h0 = 2147483648L;
      } else {
         var2[0].h0 = 0L;
      }

      if (var7 >= var6) {
         return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
      }

      if (var0.charAt(var7++) != 'P') {
         return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
      }

      int[] var8 = new int[]{var7};
      int[] var9 = new int[]{0};
      int[] var10 = new int[]{0};
      String var11 = n5(var0, var8, false, var9, var10);
      var7 = var8[0];
      var3 = var9[0];
      var4 = var10[0];
      if (var11 != null) {
         return new OverflowException(com.aspose.slides.ms.System.Xml.v3.n5("Value '{0}' was either too large or too small for {1}.", var0, var1));
      }

      if (var7 >= var6) {
         return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
      }

      if (var0.charAt(var7) == 'Y') {
         if (var4 == 0) {
            return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
         }

         var5 |= 1;
         var2[0].n5 = var3;
         if (++var7 == var6) {
            if (var5 == 0) {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }

            if (var1 == 2) {
               if ((var5 & 3) != 0) {
                  return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
               }
            } else if (var1 == 1 && (var5 & -4) != 0) {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }

            return null;
         }

         var8[0] = var7;
         var9[0] = var3;
         var10[0] = var4;
         var11 = n5(var0, var8, false, var9, var10);
         var7 = var8[0];
         var3 = var9[0];
         var4 = var10[0];
         if (var11 != null) {
            return new OverflowException(com.aspose.slides.ms.System.Xml.v3.n5("Value '{0}' was either too large or too small for {1}.", var0, var1));
         }

         if (var7 >= var6) {
            return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
         }
      }

      if (var0.charAt(var7) == 'M') {
         if (var4 == 0) {
            return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
         }

         var5 |= 2;
         var2[0].l6 = var3;
         if (++var7 == var6) {
            if (var5 == 0) {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }

            if (var1 == 2) {
               if ((var5 & 3) != 0) {
                  return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
               }
            } else if (var1 == 1 && (var5 & -4) != 0) {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }

            return null;
         }

         var8[0] = var7;
         var9[0] = var3;
         var10[0] = var4;
         var11 = n5(var0, var8, false, var9, var10);
         var7 = var8[0];
         var3 = var9[0];
         var4 = var10[0];
         if (var11 != null) {
            return new OverflowException(com.aspose.slides.ms.System.Xml.v3.n5("Value '{0}' was either too large or too small for {1}.", var0, var1));
         }

         if (var7 >= var6) {
            return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
         }
      }

      if (var0.charAt(var7) == 'D') {
         if (var4 == 0) {
            return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
         }

         var5 |= 4;
         var2[0].k5 = var3;
         if (++var7 == var6) {
            if (var5 == 0) {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }

            if (var1 == 2) {
               if ((var5 & 3) != 0) {
                  return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
               }
            } else if (var1 == 1 && (var5 & -4) != 0) {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }

            return null;
         }

         var8[0] = var7;
         var9[0] = var3;
         var10[0] = var4;
         var11 = n5(var0, var8, false, var9, var10);
         var7 = var8[0];
         var3 = var9[0];
         var4 = var10[0];
         if (var11 != null) {
            return new OverflowException(com.aspose.slides.ms.System.Xml.v3.n5("Value '{0}' was either too large or too small for {1}.", var0, var1));
         }

         if (var7 >= var6) {
            return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
         }
      }

      if (var0.charAt(var7) == 'T') {
         if (var4 != 0) {
            return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
         }

         var8[0] = ++var7;
         var9[0] = var3;
         var10[0] = var4;
         var11 = n5(var0, var8, false, var9, var10);
         var7 = var8[0];
         var3 = var9[0];
         var4 = var10[0];
         if (var11 != null) {
            return new OverflowException(com.aspose.slides.ms.System.Xml.v3.n5("Value '{0}' was either too large or too small for {1}.", var0, var1));
         }

         if (var7 >= var6) {
            return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
         }

         if (var0.charAt(var7) == 'H') {
            if (var4 == 0) {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }

            var5 |= 8;
            var2[0].u3 = var3;
            if (++var7 == var6) {
               if (var5 == 0) {
                  return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
               }

               if (var1 == 2) {
                  if ((var5 & 3) != 0) {
                     return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
                  }
               } else if (var1 == 1 && (var5 & -4) != 0) {
                  return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
               }

               return null;
            }

            var8[0] = var7;
            var9[0] = var3;
            var10[0] = var4;
            var11 = n5(var0, var8, false, var9, var10);
            var7 = var8[0];
            var3 = var9[0];
            var4 = var10[0];
            if (var11 != null) {
               return new OverflowException(com.aspose.slides.ms.System.Xml.v3.n5("Value '{0}' was either too large or too small for {1}.", var0, var1));
            }

            if (var7 >= var6) {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }
         }

         if (var0.charAt(var7) == 'M') {
            if (var4 == 0) {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }

            var5 |= 16;
            var2[0].a6 = var3;
            if (++var7 == var6) {
               if (var5 == 0) {
                  return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
               }

               if (var1 == 2) {
                  if ((var5 & 3) != 0) {
                     return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
                  }
               } else if (var1 == 1 && (var5 & -4) != 0) {
                  return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
               }

               return null;
            }

            var8[0] = var7;
            var9[0] = var3;
            var10[0] = var4;
            var11 = n5(var0, var8, false, var9, var10);
            var7 = var8[0];
            var3 = var9[0];
            var4 = var10[0];
            if (var11 != null) {
               return new OverflowException(com.aspose.slides.ms.System.Xml.v3.n5("Value '{0}' was either too large or too small for {1}.", var0, var1));
            }

            if (var7 >= var6) {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }
         }

         if (var0.charAt(var7) == '.') {
            var7++;
            var5 |= 32;
            var2[0].u9 = var3;
            var8[0] = var7;
            var9[0] = var3;
            var10[0] = var4;
            var11 = n5(var0, var8, true, var9, var10);
            var7 = var8[0];
            var3 = var9[0];
            var4 = var10[0];
            if (var11 != null) {
               return new OverflowException(com.aspose.slides.ms.System.Xml.v3.n5("Value '{0}' was either too large or too small for {1}.", var0, var1));
            }

            if (var4 == 0) {
               var3 = 0;
            }

            while (var4 > 9) {
               var3 /= 10;
               var4--;
            }

            while (var4 < 9) {
               var3 *= 10;
               var4++;
            }

            var2[0].h0 = (var2[0].h0 | var3 & 4294967295L) & 4294967295L;
            if (var7 >= var6) {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }

            if (var0.charAt(var7) != 'S') {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }

            if (++var7 == var6) {
               if (var5 == 0) {
                  return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
               }

               if (var1 == 2) {
                  if ((var5 & 3) != 0) {
                     return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
                  }
               } else if (var1 == 1 && (var5 & -4) != 0) {
                  return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
               }

               return null;
            }
         } else if (var0.charAt(var7) == 'S') {
            if (var4 == 0) {
               return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
            }

            var5 |= 32;
            var2[0].u9 = var3;
            if (++var7 == var6) {
               if (var5 == 0) {
                  return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
               }

               if (var1 == 2) {
                  if ((var5 & 3) != 0) {
                     return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
                  }
               } else if (var1 == 1 && (var5 & -4) != 0) {
                  return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
               }

               return null;
            }
         }
      }

      if (var4 != 0) {
         return new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1));
      } else {
         return var7 != var6 ? new FormatException(com.aspose.slides.ms.System.Xml.v3.n5("The string '{0}' is not a valid {1} value.", var0, var1)) : null;
      }
   }

   private static String n5(String var0, int[] var1, boolean var2, int[] var3, int[] var4) {
      int var5 = var1[0];
      int var6 = var0.length();
      var3[0] = 0;

      for (var4[0] = 0; var1[0] < var6 && var0.charAt(var1[0]) >= '0' && var0.charAt(var1[0]) <= '9'; var1[0]++) {
         int var7 = var0.charAt(var1[0]) - '0';
         if (var3[0] > (Integer.MAX_VALUE - var7) / 10) {
            if (!var2) {
               return "Value '{0}' was either too large or too small for {1}.";
            }

            var4[0] = var1[0] - var5;

            while (var1[0] < var6 && var0.charAt(var1[0]) >= '0' && var0.charAt(var1[0]) <= '9') {
               var1[0]++;
            }

            return null;
         }

         var3[0] = var3[0] * 10 + var7;
      }

      var4[0] = var1[0] - var5;
      return null;
   }

   public void n5(f2i var1) {
      var1 = var1 == null ? new f2i() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      var1.h0 = this.h0;
   }

   public f2i t2() {
      f2i var1 = new f2i();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.t2();
   }

   private boolean l6(f2i var1) {
      return var1.n5 == this.n5
         && var1.l6 == this.l6
         && var1.k5 == this.k5
         && var1.u3 == this.u3
         && var1.a6 == this.a6
         && var1.u9 == this.u9
         && var1.h0 == this.h0;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof f2i) ? false : this.l6((f2i)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public f2i Clone() {
      return this.t2();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(f2i bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
