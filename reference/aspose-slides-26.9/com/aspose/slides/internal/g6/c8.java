package com.aspose.slides.internal.g6;

public class c8 {
   private final n5 n5 = new n5();
   private final boolean l6 = false;
   private int k5;
   private h0 u3;
   private h0 a6;
   private h0 u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private byte[] y4;
   private c8$n5[] e2;

   private c8() {
   }

   private void l6(byte[] var1) {
      this.n5.n5(this.l6);
      this.k5 = var1.length;
      this.n5(this.k5);
      this.u3 = new h0(this.n5, 8);
      this.a6 = new h0(this.n5, 8);
      this.u9 = new h0(this.n5, this.n3);
      this.y4 = new byte[7168 + this.k5];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.y4)), 7168, this.k5);
      this.l6();
      this.n5.n5();
   }

   private void n5(int var1) {
      this.h0 = 1;

      for (this.c8 = 1 + (1 << 3 * this.h0) - 1; this.c8 < var1; this.c8 = 1 + (1 << 3 * this.h0) - 1) {
         this.h0++;
      }

      this.t2 = 256 + 8 * this.h0;
      this.s7 = this.t2 + 1;
      this.x8 = this.s7 + 1;
      this.n3 = this.x8 + 1;
   }

   private void l6() {
      this.k5();
      this.n5.n5(this.k5, 24);
      int var1 = this.k5 + 7168;
      int var2 = 7168;

      while (var2 < var1) {
         int var3 = var2;
         int var4 = 0;
         int[] var5 = new int[]{0};
         int var6 = this.n5(var2++, var5);
         var4 = var5[0];
         if (var6 > 0) {
            int var10 = l6(var4);
            this.n5(var6, var4, var10);
            this.n5(var4, var10);

            for (int var8 = 1; var8 < var6; var8++) {
               this.k5(var2++);
            }
         } else {
            byte var7 = this.y4[var3];
            if (var3 >= 2 && var7 == this.y4[var3 - 2]) {
               this.u9.l6(this.t2);
            } else if (var3 >= 4 && var7 == this.y4[var3 - 4]) {
               this.u9.l6(this.s7);
            } else if (var3 >= 6 && var7 == this.y4[var3 - 6]) {
               this.u9.l6(this.x8);
            } else {
               this.u9.l6(this.y4[var3] & 255 & 0xFF);
            }
         }
      }
   }

   private void k5() {
      int var1 = 65536;
      this.e2 = new c8$n5[var1];
      int var2 = 0;

      for (int var3 = 0; var3 < 32; var3++) {
         for (int var4 = 0; var4 < 96; var4++) {
            this.y4[var2] = (byte)var3;
            this.k5(var2++);
            this.y4[var2] = (byte)var4;
            this.k5(var2++);
         }
      }

      for (int var9 = 0; var2 < 7168 && var9 < 256; var9++) {
         this.y4[var2] = (byte)var9;
         this.k5(var2++);
         this.y4[var2] = (byte)var9;
         this.k5(var2++);
         this.y4[var2] = (byte)var9;
         this.k5(var2++);
         this.y4[var2] = (byte)var9;
         this.k5(var2++);
      }
   }

   private int n5(int var1, int[] var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = var1;
      int[] var7 = new int[]{0};
      int[] var8 = new int[]{0};
      int[] var9 = new int[]{0};
      int var10 = this.n5(var1, var7, var8, var9);
      var3 = var7[0];
      var4 = var8[0];
      var5 = var9[0];
      this.k5(var1++);
      if (var4 > 0) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         int[] var14 = new int[]{0};
         int[] var15 = new int[]{0};
         int[] var16 = new int[]{0};
         int var17 = this.n5(var1, var14, var15, var16);
         var11 = var14[0];
         var12 = var15[0];
         var13 = var16[0];
         int var18 = this.u9.n5(this.y4[var6] & 255 & 0xFF);
         if (var12 >= var4 && var5 > (var13 * var17 + var18) / (var17 + 1)) {
            var10 = 0;
         } else if (var10 > 3) {
            var14[0] = var11;
            var15[0] = var12;
            var16[0] = var13;
            var17 = this.n5(var6 + var10, var14, var15, var16);
            var11 = var14[0];
            var12 = var15[0];
            var13 = var16[0];
            if (var17 >= 2) {
               int var19 = 0;
               int var20 = 0;
               int var21 = 0;
               int[] var22 = new int[]{0};
               int[] var23 = new int[]{0};
               int[] var24 = new int[]{0};
               int var25 = this.n5(var6 + var10 - 1, var22, var23, var24);
               var19 = var22[0];
               var20 = var23[0];
               var21 = var24[0];
               if (var25 > var17 && var21 < var13) {
                  int var26 = l6(var3 + 1);
                  int var27 = this.l6(var10 - 1, var3 + 1, var26);
                  int var28 = this.l6(var3 + 1, var26);
                  int var29 = var27 + var28 + var21 * var25;
                  int var30 = var5 * var10 + var13 * var17;
                  if (var30 / (var10 + var17) > var29 / (var10 - 1 + var25)) {
                     var10--;
                     var3++;
                  }
               }
            }
         }

         if (var10 == 2) {
            if (var6 >= 2 && this.y4[var6] == this.y4[var6 - 2]) {
               int var44 = this.u9.n5(this.t2);
               if (var5 * 2 > var44 + this.u9.n5(this.y4[var6 + 1] & 255 & 0xFF)) {
                  var10 = 0;
               }
            } else if (var6 >= 1 && var6 + 1 < this.y4.length && this.y4[var6 + 1] == this.y4[var6 - 1]) {
               int var43 = this.u9.n5(this.t2);
               if (var5 * 2 > var18 + var43) {
                  var10 = 0;
               }
            }
         }
      }

      var2[0] = var3;
      return var10;
   }

   private int n5(int var1, int[] var2, int[] var3, int[] var4) {
      byte var5 = 32;
      int[] var6 = new int[33];
      int var7 = this.y4.length - var1;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      if (var7 > 1) {
         int var13 = (this.y4[var1] & 255 & 0xFF) << 8 | this.y4[var1 + 1] & 255 & 0xFF;
         c8$n5 var14 = null;
         int var15 = 0;

         for (c8$n5 var16 = this.e2[var13]; var16 != null; var16 = var16.l6) {
            int var17 = var16.n5;
            int var18 = var1 - var17;
            var15++;
            if (var15 > 256 || var18 > Integer.MAX_VALUE || var18 > this.c8) {
               if (this.e2[var13] == var16) {
                  this.e2[var13] = null;
               } else {
                  var14.l6 = null;
               }
               break;
            }

            int var19 = var1 - var17;
            if (var7 < var19) {
               var19 = var7;
            }

            if (var19 >= 2) {
               var17 += 2;
               int var20 = 2;

               for (var20 = 2; var20 < var19 && this.y4[var17] == this.y4[var1 + var20]; var20++) {
                  var17++;
               }

               if (var20 >= 2) {
                  var18 = var18 - var20 + 1;
                  if (var18 <= this.c8
                     && (var20 != 2 || var18 < 512)
                     && (var20 > var8 || var18 <= var9 || var20 > var8 - 2 && (var18 <= var9 << 3 || var20 >= var8 && var18 <= var9 << 4))) {
                     int var21 = 0;
                     if (var20 <= var12) {
                        var21 = var6[var20];
                     } else {
                        int var22 = var20;
                        if (var22 > 32) {
                           var22 = 32;
                        }

                        for (int var26 = var12; var26 < var22; var26++) {
                           byte var23 = this.y4[var1 + var26];
                           var6[var26 + 1] = var6[var26] + this.u9.n5(var23 & 255 & 0xFF);
                        }

                        var12 = var22;
                        if (var20 > 32) {
                           var21 = var6[32];
                           var21 += var21 / 32 * (var20 - 32);
                        } else {
                           var21 = var6[var20];
                        }
                     }

                     if (var21 > var10) {
                        int var31 = l6(var18);
                        int var32 = this.l6(var20, var18, var31);
                        if (var21 - var32 - (var31 << 16) > var10) {
                           var32 += this.l6(var18, var31);
                           int var24 = var21 - var32;
                           if (var24 > var10) {
                              var10 = var24;
                              var8 = var20;
                              var9 = var18;
                              var11 = var32;
                           }
                        }
                     }
                  }
               }
            }

            var14 = var16;
         }
      }

      var4[0] = var8 > 0 ? var11 / var8 : 0;
      var2[0] = var9;
      var3[0] = var10;
      return var8;
   }

   private static int l6(int var0) {
      int var1 = com.aspose.slides.internal.g6.h0.k5(var0 - 1);
      return (var1 + 3 - 1) / 3;
   }

   private void n5(int var1, int var2, int var3) {
      if (var2 >= 512) {
         var1 -= 3;
      } else {
         var1 -= 2;
      }

      int var4 = com.aspose.slides.internal.g6.h0.k5(var1);
      byte var5 = 2;

      while (var5 < var4) {
         var5 += 2;
      }

      int var6 = 1 << var5 - 1;
      int var7 = var4 > 2 ? 2 : 0;
      if ((var1 & var6) != 0) {
         var7 |= 1;
      }

      var6 >>= 1;
      var7 <<= 1;
      if ((var1 & var6) != 0) {
         var7 |= 1;
      }

      var6 >>= 1;
      this.u9.l6(256 + var7 + (var3 - 1) * 8);

      for (int var9 = var4 - 2; var9 >= 1; var9 -= 2) {
         var7 = var9 > 2 ? 2 : 0;
         if ((var1 & var6) != 0) {
            var7 |= 1;
         }

         var6 >>= 1;
         var7 <<= 1;
         if ((var1 & var6) != 0) {
            var7 |= 1;
         }

         var6 >>= 1;
         this.a6.l6(var7);
      }
   }

   private int l6(int var1, int var2, int var3) {
      if (var2 >= 512) {
         var1 -= 3;
      } else {
         var1 -= 2;
      }

      int var4 = com.aspose.slides.internal.g6.h0.k5(var1);
      byte var5 = 2;

      while (var5 < var4) {
         var5 += 2;
      }

      int var6 = 1 << var5 - 1;
      int var7 = var4 > 2 ? 2 : 0;
      if ((var1 & var6) != 0) {
         var7 |= 1;
      }

      var6 >>= 1;
      var7 <<= 1;
      if ((var1 & var6) != 0) {
         var7 |= 1;
      }

      var6 >>= 1;
      int var8 = this.u9.n5(256 + var7 + (var3 - 1) * 8);

      for (int var10 = var4 - 2; var10 >= 1; var10 -= 2) {
         var7 = var10 > 2 ? 2 : 0;
         if ((var1 & var6) != 0) {
            var7 |= 1;
         }

         var6 >>= 1;
         var7 <<= 1;
         if ((var1 & var6) != 0) {
            var7 |= 1;
         }

         var6 >>= 1;
         var8 += this.a6.n5(var7);
      }

      return var8;
   }

   private void n5(int var1, int var2) {
      var1--;
      byte var3 = 7;

      for (int var4 = (var2 - 1) * 3; var4 >= 0; var4 -= 3) {
         this.u3.l6(var1 >> var4 & var3);
      }
   }

   private int l6(int var1, int var2) {
      int var3 = 0;
      var1--;
      byte var4 = 7;

      for (int var5 = (var2 - 1) * 3; var5 >= 0; var5 -= 3) {
         var3 += this.u3.n5(var1 >> var5 & var4);
      }

      return var3;
   }

   private void k5(int var1) {
      byte var2 = this.y4[var1];
      if (var1 > 0) {
         c8$n5 var3 = new c8$n5(null);
         byte var4 = this.y4[var1 - 1];
         int var5 = (var4 & 255 & 0xFF) << 8 | var2 & 255 & 0xFF;
         var3.n5 = var1 - 1;
         var3.l6 = this.e2[var5];
         this.e2[var5] = var3;
      }
   }

   private byte[] u3() {
      return this.n5.l6();
   }

   public static byte[] n5(byte[] var0) {
      c8 var1 = new c8();
      var1.l6(var0);
      return var1.u3();
   }

   public static int n5() {
      return 7168;
   }
}
