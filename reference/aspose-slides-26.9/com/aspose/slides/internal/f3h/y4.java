package com.aspose.slides.internal.f3h;

import java.util.Arrays;

final class y4 {
   static int[] n5 = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
   private int k7;
   int l6;
   int k5;
   int u3;
   int[] a6;
   int[] u9 = new int[1];
   int[] h0 = new int[1];
   e2 c8 = new e2();
   int t2;
   u3 s7;
   int x8;
   int n3;
   int[] y4;
   byte[] e2;
   int t9;
   int z1;
   int t4;
   Object q0;
   long z3;
   n3 m1 = new n3();

   y4(u3 var1, Object var2, int var3) {
      this.s7 = var1;
      this.y4 = new int[4320];
      this.e2 = new byte[var3];
      this.t9 = var3;
      this.q0 = var2;
      this.k7 = 0;
      this.n5();
   }

   long n5() {
      long var1 = this.z3;
      this.k7 = 0;
      this.x8 = 0;
      this.n3 = 0;
      this.z1 = this.t4 = 0;
      if (this.q0 != null) {
         this.s7.n3 = this.z3 = com.aspose.slides.internal.f3h.n5.n5(0L, null, 0, 0);
      }

      return var1;
   }

   int n5(int var1) {
      int var2 = this.s7.l6;
      int var3 = this.s7.k5;
      int var4 = this.n3;
      int var5 = this.x8;
      int var6 = this.t4;
      int var7 = var6 < this.z1 ? this.z1 - var6 - 1 : this.t9 - var6;

      label316:
      while (true) {
         label309:
         while (true) {
            label307: {
               label379: {
                  switch (this.k7) {
                     case 0:
                        while (var5 < 3) {
                           if (var3 == 0) {
                              this.n3 = var4;
                              this.x8 = var5;
                              this.s7.k5 = var3;
                              this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                              this.s7.l6 = var2;
                              this.t4 = var6;
                              return this.l6(var1);
                           }

                           var1 = 0;
                           var3--;
                           var4 |= (this.s7.n5[var2++] & 255 & 0xFF) << var5;
                           var5 += 8;
                        }

                        int var42 = var4 & 7;
                        this.t2 = var42 & 1;
                        long var9 = (var42 & 4294967295L) >> 1;
                        if (var9 == 0L) {
                           var4 >>= 3;
                           var5 -= 3;
                           var42 = var5 & 7;
                           var4 >>= var42;
                           var5 -= var42;
                           this.k7 = 1;
                        } else if (var9 == 1L) {
                           int[] var46 = new int[1];
                           int[] var49 = new int[1];
                           int[][] var52 = new int[1][];
                           int[][] var53 = new int[1][];
                           com.aspose.slides.internal.f3h.n3.n5(var46, var49, var52, var53, this.s7);
                           this.c8.n5(var46[0], var49[0], var52[0], 0, var53[0], 0);
                           var4 >>= 3;
                           var5 -= 3;
                           this.k7 = 6;
                        } else if (var9 == 2L) {
                           var4 >>= 3;
                           var5 -= 3;
                           this.k7 = 3;
                        } else if (var9 == 3L) {
                           var4 >>= 3;
                           var5 -= 3;
                           this.k7 = 9;
                           this.s7.t2 = "invalid block type";
                           byte var26 = -3;
                           this.n3 = var4;
                           this.x8 = var5;
                           this.s7.k5 = var3;
                           this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                           this.s7.l6 = var2;
                           this.t4 = var6;
                           return this.l6(var26);
                        }
                        continue;
                     case 1:
                        while (var5 < 32) {
                           if (var3 == 0) {
                              this.n3 = var4;
                              this.x8 = var5;
                              this.s7.k5 = var3;
                              this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                              this.s7.l6 = var2;
                              this.t4 = var6;
                              return this.l6(var1);
                           }

                           var1 = 0;
                           var3--;
                           var4 |= (this.s7.n5[var2++] & 255 & 0xFF) << var5;
                           var5 += 8;
                        }

                        if ((~var4 >> 16 & 65535) != (var4 & 65535)) {
                           this.k7 = 9;
                           this.s7.t2 = "invalid stored block lengths";
                           byte var25 = -3;
                           this.n3 = var4;
                           this.x8 = var5;
                           this.s7.k5 = var3;
                           this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                           this.s7.l6 = var2;
                           this.t4 = var6;
                           return this.l6(var25);
                        }

                        this.l6 = var4 & 65535;
                        var5 = 0;
                        var4 = 0;
                        this.k7 = this.l6 != 0 ? 2 : (this.t2 != 0 ? 7 : 0);
                        continue;
                     case 2:
                        if (var3 == 0) {
                           this.n3 = var4;
                           this.x8 = var5;
                           this.s7.k5 = var3;
                           this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                           this.s7.l6 = var2;
                           this.t4 = var6;
                           return this.l6(var1);
                        }

                        if (var7 == 0) {
                           if (var6 == this.t9 && this.z1 != 0) {
                              var6 = 0;
                              var7 = var6 < this.z1 ? this.z1 - var6 - 1 : this.t9 - var6;
                           }

                           if (var7 == 0) {
                              this.t4 = var6;
                              var1 = this.l6(var1);
                              var6 = this.t4;
                              var7 = var6 < this.z1 ? this.z1 - var6 - 1 : this.t9 - var6;
                              if (var6 == this.t9 && this.z1 != 0) {
                                 var6 = 0;
                                 var7 = var6 < this.z1 ? this.z1 - var6 - 1 : this.t9 - var6;
                              }

                              if (var7 == 0) {
                                 this.n3 = var4;
                                 this.x8 = var5;
                                 this.s7.k5 = var3;
                                 this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                                 this.s7.l6 = var2;
                                 this.t4 = var6;
                                 return this.l6(var1);
                              }
                           }
                        }

                        var1 = 0;
                        int var41 = this.l6;
                        if (var41 > var3) {
                           var41 = var3;
                        }

                        if (var41 > var7) {
                           var41 = var7;
                        }

                        System.arraycopy(this.s7.n5, var2, this.e2, var6, var41);
                        var2 += var41;
                        var3 -= var41;
                        var6 += var41;
                        var7 -= var41;
                        if ((this.l6 -= var41) == 0) {
                           this.k7 = this.t2 != 0 ? 7 : 0;
                        }
                        continue;
                     case 3:
                        while (var5 < 14) {
                           if (var3 == 0) {
                              this.n3 = var4;
                              this.x8 = var5;
                              this.s7.k5 = var3;
                              this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                              this.s7.l6 = var2;
                              this.t4 = var6;
                              return this.l6(var1);
                           }

                           var1 = 0;
                           var3--;
                           var4 |= (this.s7.n5[var2++] & 255 & 0xFF) << var5;
                           var5 += 8;
                        }

                        int var8;
                        this.k5 = var8 = var4 & 16383;
                        if ((var8 & 31) > 29 || (var8 >> 5 & 31) > 29) {
                           this.k7 = 9;
                           this.s7.t2 = "too many length or distance symbols";
                           byte var23 = -3;
                           this.n3 = var4;
                           this.x8 = var5;
                           this.s7.k5 = var3;
                           this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                           this.s7.l6 = var2;
                           this.t4 = var6;
                           return this.l6(var23);
                        }

                        var8 = 258 + (var8 & 31) + (var8 >> 5 & 31);
                        if (this.a6 != null && this.a6.length >= var8) {
                           Arrays.fill(this.a6, 0, var8, 0);
                        } else {
                           this.a6 = new int[var8];
                        }

                        var4 >>= 14;
                        var5 -= 14;
                        this.u3 = 0;
                        this.k7 = 4;
                     case 4:
                        break;
                     case 5:
                        break label379;
                     case 6:
                        break label307;
                     case 7:
                        break label309;
                     case 8:
                        break label316;
                     case 9:
                        byte var16 = -3;
                        this.n3 = var4;
                        this.x8 = var5;
                        this.s7.k5 = var3;
                        this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                        this.s7.l6 = var2;
                        this.t4 = var6;
                        return this.l6(var16);
                     default:
                        byte var15 = -2;
                        this.n3 = var4;
                        this.x8 = var5;
                        this.s7.k5 = var3;
                        this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                        this.s7.l6 = var2;
                        this.t4 = var6;
                        return this.l6(var15);
                  }

                  while (this.u3 < 4 + (this.k5 >> 10)) {
                     while (var5 < 3) {
                        if (var3 == 0) {
                           this.n3 = var4;
                           this.x8 = var5;
                           this.s7.k5 = var3;
                           this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                           this.s7.l6 = var2;
                           this.t4 = var6;
                           return this.l6(var1);
                        }

                        var1 = 0;
                        var3--;
                        var4 |= (this.s7.n5[var2++] & 255 & 0xFF) << var5;
                        var5 += 8;
                     }

                     this.a6[n5[this.u3++]] = var4 & 7;
                     var4 >>= 3;
                     var5 -= 3;
                  }

                  while (this.u3 < 19) {
                     this.a6[n5[this.u3++]] = 0;
                  }

                  this.u9[0] = 7;
                  int var34 = this.m1.n5(this.a6, this.u9, this.h0, this.y4, this.s7);
                  if (var34 != 0) {
                     var1 = var34;
                     if (var1 == -3) {
                        this.a6 = null;
                        this.k7 = 9;
                     }

                     this.n3 = var4;
                     this.x8 = var5;
                     this.s7.k5 = var3;
                     this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                     this.s7.l6 = var2;
                     this.t4 = var6;
                     return this.l6(var1);
                  }

                  this.u3 = 0;
                  this.k7 = 5;
               }

               while (true) {
                  int var35 = this.k5;
                  if (this.u3 >= 258 + (var35 & 31) + (var35 >> 5 & 31)) {
                     this.h0[0] = -1;
                     int[] var45 = new int[]{9};
                     int[] var48 = new int[]{6};
                     int[] var51 = new int[1];
                     int[] var14 = new int[1];
                     var35 = this.k5;
                     var35 = this.m1.n5(257 + (var35 & 31), 1 + (var35 >> 5 & 31), this.a6, var45, var48, var51, var14, this.y4, this.s7);
                     if (var35 != 0) {
                        if (var35 == -3) {
                           this.a6 = null;
                           this.k7 = 9;
                        }

                        var1 = var35;
                        this.n3 = var4;
                        this.x8 = var5;
                        this.s7.k5 = var3;
                        this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                        this.s7.l6 = var2;
                        this.t4 = var6;
                        return this.l6(var1);
                     }

                     this.c8.n5(var45[0], var48[0], this.y4, var51[0], this.y4, var14[0]);
                     this.k7 = 6;
                     break;
                  }

                  for (var35 = this.u9[0]; var5 < var35; var5 += 8) {
                     if (var3 == 0) {
                        this.n3 = var4;
                        this.x8 = var5;
                        this.s7.k5 = var3;
                        this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                        this.s7.l6 = var2;
                        this.t4 = var6;
                        return this.l6(var1);
                     }

                     var1 = 0;
                     var3--;
                     var4 |= (this.s7.n5[var2++] & 255 & 0xFF) << var5;
                  }

                  var35 = this.y4[(this.h0[0] + (var4 & com.aspose.slides.internal.f3h.t4.n5[var35])) * 3 + 1];
                  int var13 = this.y4[(this.h0[0] + (var4 & com.aspose.slides.internal.f3h.t4.n5[var35])) * 3 + 2];
                  if (var13 < 16) {
                     var4 >>= var35;
                     var5 -= var35;
                     this.a6[this.u3++] = var13;
                  } else {
                     int var11 = var13 == 18 ? 7 : var13 - 14;
                     int var12 = var13 == 18 ? 11 : 3;

                     while (var5 < var35 + var11) {
                        if (var3 == 0) {
                           this.n3 = var4;
                           this.x8 = var5;
                           this.s7.k5 = var3;
                           this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                           this.s7.l6 = var2;
                           this.t4 = var6;
                           return this.l6(var1);
                        }

                        var1 = 0;
                        var3--;
                        var4 |= (this.s7.n5[var2++] & 255 & 0xFF) << var5;
                        var5 += 8;
                     }

                     var4 >>= var35;
                     var5 -= var35;
                     var12 += var4 & com.aspose.slides.internal.f3h.t4.n5[var11];
                     var4 >>= var11;
                     var5 -= var11;
                     var11 = this.u3;
                     var35 = this.k5;
                     if (var11 + var12 > 258 + (var35 & 31) + (var35 >> 5 & 31) || var13 == 16 && var11 < 1) {
                        this.a6 = null;
                        this.k7 = 9;
                        this.s7.t2 = "invalid bit length repeat";
                        byte var17 = -3;
                        this.n3 = var4;
                        this.x8 = var5;
                        this.s7.k5 = var3;
                        this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
                        this.s7.l6 = var2;
                        this.t4 = var6;
                        return this.l6(var17);
                     }

                     var13 = var13 == 16 ? this.a6[var11 - 1] : 0;

                     do {
                        this.a6[var11++] = var13;
                     } while (--var12 != 0);

                     this.u3 = var11;
                  }
               }
            }

            this.n3 = var4;
            this.x8 = var5;
            this.s7.k5 = var3;
            this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
            this.s7.l6 = var2;
            this.t4 = var6;
            var1 = this.c8.n5(this, var1);
            if (var1 != 1) {
               return this.l6(var1);
            }

            var1 = 0;
            var2 = this.s7.l6;
            var3 = this.s7.k5;
            var4 = this.n3;
            var5 = this.x8;
            var6 = this.t4;
            var7 = var6 < this.z1 ? this.z1 - var6 - 1 : this.t9 - var6;
            if (this.t2 != 0) {
               this.k7 = 7;
               break;
            }

            this.k7 = 0;
         }

         this.t4 = var6;
         var1 = this.l6(var1);
         var6 = this.t4;
         if (var6 < this.z1) {
            int var10000 = this.z1 - var6 - 1;
         } else {
            int var54 = this.t9 - var6;
         }

         if (this.z1 != this.t4) {
            this.n3 = var4;
            this.x8 = var5;
            this.s7.k5 = var3;
            this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
            this.s7.l6 = var2;
            this.t4 = var6;
            return this.l6(var1);
         }

         this.k7 = 8;
         break;
      }

      byte var20 = 1;
      this.n3 = var4;
      this.x8 = var5;
      this.s7.k5 = var3;
      this.s7.u3 = this.s7.u3 + (var2 - this.s7.l6);
      this.s7.l6 = var2;
      this.t4 = var6;
      return this.l6(var20);
   }

   void l6() {
      this.n5();
      this.e2 = null;
      this.y4 = null;
   }

   int l6(int var1) {
      for (int var2 = 0; var2 < 2; var2++) {
         int var3;
         if (var2 == 0) {
            var3 = (this.z1 <= this.t4 ? this.t4 : this.t9) - this.z1;
         } else {
            var3 = this.t4 - this.z1;
         }

         if (var3 == 0) {
            if (var1 == -5) {
               var1 = 0;
            }

            return var1;
         }

         if (var3 > this.s7.h0) {
            var3 = this.s7.h0;
         }

         if (var3 != 0 && var1 == -5) {
            var1 = 0;
         }

         this.s7.h0 -= var3;
         this.s7.c8 += var3;
         if (this.q0 != null) {
            this.s7.n3 = this.z3 = com.aspose.slides.internal.f3h.n5.n5(this.z3, this.e2, this.z1, var3);
         }

         System.arraycopy(this.e2, this.z1, this.s7.a6, this.s7.u9, var3);
         this.s7.u9 += var3;
         this.z1 += var3;
         if (this.z1 == this.t9 && var2 == 0) {
            this.z1 = 0;
            if (this.t4 == this.t9) {
               this.t4 = 0;
            }
         } else {
            var2++;
         }
      }

      return var1;
   }
}
