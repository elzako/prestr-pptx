package com.aspose.slides.internal.d3v;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.internal.r2q.c8;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.s3;

public class k5 extends com.aspose.slides.internal.u2w.k5 {
   private final com.aspose.slides.internal.r2q.k5 u9 = new com.aspose.slides.internal.r2q.k5(this.u9(), this.c8().y2() == 0);
   private int[] h0;
   private int[] c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private int y4;
   private int e2;
   private c8 t9;

   public k5(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(int[] var1, y2 var2, com.aspose.slides.internal.b8u.n5 var3) {
      if (this.t9 == null) {
         this.t9 = new c8(var3, this.u9());
      }

      switch (this.t2()) {
         case 2:
            this.n5(var1, 0, var1.length, this.u9(), this.t9, null, 0);
            break;
         case 3:
            long var4 = this.c8().b3();
            boolean var15 = (var4 & 4L) == 4L;
            int var17 = 1;
            if ((var4 & 1L) == 1L) {
               var17 = this.s7();
            } else if ((var4 & 2L) == 2L) {
               throw new NotSupportedException("The Uncompressed options are not supported by CCITT codec at the moment.");
            }

            for (int var19 = 0; var19 < var1.length; var19 += this.u9()) {
               int var9 = q1.l6(var1.length, var19 + this.u9());
               if (this.x8 % this.u9() == 0) {
                  if (var15) {
                     int var10 = this.t9.n5() % 8;
                     int var11 = var10 - 4;
                     if (var11 < 0) {
                        var11 += 8;
                     }

                     com.aspose.slides.internal.r2q.l6 var12 = new com.aspose.slides.internal.r2q.l6();
                     var12.l6(0);
                     var12.n5(var11);
                     this.t9.n5(var12);
                  }

                  this.n5(this.t9, var4, var17, this.x8 / this.u9());
                  this.s7 = 0;
               }

               if (this.x8 % (this.u9() * var17) < this.u9()) {
                  if (this.x8 % this.u9() == 0) {
                     this.h0 = new int[this.u9() + 1];
                  }

                  this.x8 = this.x8 + this.n5(var1, var19, var9, this.u9(), this.t9, this.h0, this.s7);
               } else if (this.x8 % (this.u9() * var17) < this.u9() * (var17 - 1)) {
                  if (this.x8 % this.u9() == 0) {
                     this.c8 = new int[this.u9() + 1];
                     this.t2 = 0;
                  }

                  int[] var20 = new int[]{this.s7};
                  int[] var22 = new int[]{this.t2};
                  this.x8 = this.x8 + this.n5(var1, var19, var9, this.u9(), this.t9, this.h0, var20, this.c8, var22, true);
                  this.s7 = var20[0];
                  this.t2 = var22[0];
                  this.h0 = this.c8;
               } else {
                  int[] var21 = new int[]{this.s7};
                  int[] var23 = new int[]{this.t2};
                  this.x8 = this.x8 + this.n5(var1, var19, var9, this.u9(), this.t9, this.h0, var21, null, var23, true);
                  this.s7 = var21[0];
                  this.t2 = var23[0];
               }
            }
            break;
         case 4:
            int var13 = 0;
            int var14 = this.s7();

            while (var13 < var1.length) {
               if (this.x8 % this.u9() == 0) {
                  this.s7 = 0;
               }

               int var6 = q1.l6(var1.length, var13 + this.u9());
               if (this.x8 % (this.u9() * var14) == 0) {
                  this.h0 = new int[1];
                  this.h0[0] = this.u9();
               }

               if (this.x8 < (this.h0() - 1) * this.u9() && this.x8 % (this.u9() * var14) < this.u9() * (var14 - 1)) {
                  if (this.x8 % this.u9() == 0) {
                     this.c8 = new int[this.u9() + 1];
                     this.t2 = 0;
                  }

                  int[] var16 = new int[]{this.s7};
                  int[] var18 = new int[]{this.t2};
                  this.x8 = this.x8 + this.n5(var1, var13, var6, this.u9(), this.t9, this.h0, var16, this.c8, var18, false);
                  this.s7 = var16[0];
                  this.t2 = var18[0];
                  this.h0 = this.c8;
               } else {
                  int[] var7 = new int[]{this.s7};
                  int[] var8 = new int[]{this.t2};
                  this.x8 = this.x8 + this.n5(var1, var13, var6, this.u9(), this.t9, this.h0, var7, null, var8, true);
                  this.s7 = var7[0];
                  this.t2 = var8[0];
               }

               var13 += this.u9();
            }
            break;
         default:
            throw new ArgumentOutOfRangeException(
               d1.n5("Compression {0} is not supported", new Object[]{s3.n5(com.aspose.slides.internal.w2a.a6.class, this.t2())})
            );
      }
   }

   private static boolean n5(int var0, int[] var1, int[] var2, int[] var3, int[] var4, c8 var5) {
      boolean var6 = false;
      int var7 = var0 + var1[0];
      boolean var8 = true;

      while (var8) {
         var8 = false;
         if (var4[0] < var3.length) {
            var2[0] += var3[var4[0]++];
         }

         while (var2[0] > var0 && var4[0] > 2 && var2[0] - var3[var4[0] - 1] - var3[var4[0] - 2] > var0) {
            var2[0] -= var3[var4[0] - 1] + var3[var4[0] - 2];
            var4[0] -= 2;
         }

         while (var0 > 0 && var2[0] <= var0 && var4[0] < var3.length - 1) {
            var2[0] += var3[var4[0]++];
            var2[0] += var3[var4[0]++];
         }

         int var9 = var2[0];
         if (var4[0] < var3.length) {
            var9 += var3[var4[0]];
         }

         if (var9 < var7) {
            var5.n5(com.aspose.slides.internal.r2q.l6.l6());
            var1[0] -= var9 - var0;
            var0 = var9;
            var2[0] = var9;
            var4[0]++;
            var8 = true;
         }
      }

      int var11 = var2[0] - var7;
      if (var11 >= -3 && var11 <= 3) {
         com.aspose.slides.internal.r2q.l6 var10 = com.aspose.slides.internal.r2q.l6.u3(var11);
         var5.n5(var10);
      } else {
         var2[0] -= var3[--var4[0]];
         var6 = true;
      }

      return var6;
   }

   private static void n5(c8 var0, com.aspose.slides.internal.r2q.k5 var1, int var2, int var3) {
      var0.n5(com.aspose.slides.internal.r2q.l6.n5());
      n5(var0, var1.l6(), var2);
      n5(var0, var1.k5(), var3);
   }

   private int n5(int[] var1, int var2, int var3, int var4, c8 var5, int[] var6, int[] var7, int[] var8, int[] var9, boolean var10) {
      int var11 = this.u9.n5();
      int var12 = this.y4;
      int var13 = 0;
      boolean var14 = false;

      for (int var15 = var2; var15 < var3; var15++) {
         int var16 = var1[var15];
         int var17 = var16 >> 16 & 0xFF;
         int var18 = var16 >> 8 & 0xFF;
         int var19 = var16 & 0xFF;
         int var20 = q1.n5(var17 * 30 + var18 * 59 + var19 * 11 - var11);
         if (var20 > 12750) {
            if (var8 != null) {
               var8[var9[0]++] = var12;
            }

            if (var14) {
               n5(var5, this.u9, var13, var12);
               var14 = false;
            } else {
               int[] var21 = new int[]{var12};
               int[] var22 = new int[]{this.e2};
               var14 = n5(this.n3 - var21[0], var21, var22, var6, var7, var5);
               var12 = var21[0];
               this.e2 = var22[0];
               if (var14) {
                  var13 = var12;
               }
            }

            this.u9.u9();
            var11 = this.u9.n5();
            var12 = 0;
         }

         var12++;
         this.n3++;
         if (this.n3 == var4) {
            if (var8 != null) {
               var8[var9[0]++] = var12;
            }

            if (var14) {
               n5(var5, this.u9, var13, var12);
               var14 = false;
            } else {
               int[] var25 = new int[]{var12};
               int[] var26 = new int[]{this.e2};
               var14 = n5(this.n3 - var25[0], var25, var26, var6, var7, var5);
               var12 = var25[0];
               this.e2 = var26[0];
               if (var14) {
                  this.u9.u9();
                  n5(var5, this.u9, var12, 0);
               }
            }

            this.u9.a6();
            var11 = this.u9.n5();
            if (var10) {
               var5.u3();
            }

            var5.a6();
            var12 = 0;
            this.n3 = 0;
            this.e2 = 0;
         }
      }

      this.y4 = var12;
      return var3 - var2;
   }

   private int n5(int[] var1, int var2, int var3, int var4, c8 var5, int[] var6, int var7) {
      int var8 = this.u9.n5();
      int var9 = this.y4;

      for (int var10 = var2; var10 < var3; var10++) {
         int var11 = var1[var10];
         int var12 = var11 >> 16 & 0xFF;
         int var13 = var11 >> 8 & 0xFF;
         int var14 = var11 & 0xFF;
         int var15 = var12 * 30 + var13 * 59 + var14 * 11 - var8;
         if (var15 < 0) {
            var15 = -var15;
         }

         if (var15 > 12750) {
            if (var6 != null) {
               var6[var7++] = var9;
            }

            n5(var5, this.u9.k5(), var9);
            this.u9.u9();
            var8 = this.u9.n5();
            var9 = 0;
         }

         var9++;
         this.n3++;
         if (this.n3 == var4) {
            if (var6 != null) {
               var6[var7++] = var9;
            }

            n5(var5, this.u9.k5(), var9);
            var5.u3();
            var5.a6();
            this.u9.a6();
            var8 = this.u9.n5();
            var9 = 0;
            this.n3 = 0;
         }
      }

      this.y4 = var9;
      return var3 - var2;
   }

   private void n5(c8 var1, long var2, int var4, int var5) {
      com.aspose.slides.internal.r2q.l6 var6 = new com.aspose.slides.internal.r2q.l6();
      var6.l6(1);
      var6.n5(12);
      if ((var2 & 1L) == 1L) {
         var6.l6(var6.u3() * 2);
         if (var5 % var4 == 0) {
            var6.l6(var6.u3() + 1);
         }

         var6.n5(var6.k5() + 1);
      }

      var1.n5(var6);
   }

   private static void n5(c8 var0, int var1, int var2) {
      int[] var3;
      if (var1 == 0) {
         var3 = com.aspose.slides.internal.e0w.n5.n5();
      } else {
         var3 = com.aspose.slides.internal.e0w.n5.l6();
      }

      com.aspose.slides.internal.r2q.l6 var4 = com.aspose.slides.internal.r2q.l6.n5(com.aspose.slides.internal.e0w.n5.k5(), 12);

      while (var2 >= var4.a6()) {
         var2 -= var4.a6();
         var0.n5(var4);
      }

      com.aspose.slides.internal.r2q.l6 var5 = com.aspose.slides.internal.r2q.l6.n5(com.aspose.slides.internal.e0w.n5.k5(), 0);
      if (var2 >= var5.a6()) {
         int var6 = (var2 >> 6) - 28;
         var5 = com.aspose.slides.internal.r2q.l6.n5(com.aspose.slides.internal.e0w.n5.k5(), var6);
         var0.n5(var5);
         var2 -= var5.a6();
      }

      com.aspose.slides.internal.r2q.l6 var9 = com.aspose.slides.internal.r2q.l6.n5(var3, 64);
      if (var2 >= var9.a6()) {
         int var7 = (var2 >> 6) + 63;
         var9 = com.aspose.slides.internal.r2q.l6.n5(var3, var7);
         var0.n5(var9);
         var2 -= var9.a6();
      }

      com.aspose.slides.internal.r2q.l6 var11 = com.aspose.slides.internal.r2q.l6.n5(var3, var2);
      var0.n5(var11);
   }

   @Override
   public void n5(byte[] var1, y2 var2, com.aspose.slides.internal.b8u.n5 var3, z6 var4) {
      throw new NotImplementedException();
   }
}
