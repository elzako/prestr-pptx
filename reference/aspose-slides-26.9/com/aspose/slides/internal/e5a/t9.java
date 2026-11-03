package com.aspose.slides.internal.e5a;

public final class t9 {
   private static final int[] m3 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
   public static final int[] n5 = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public int[] u9;
   public int[] h0 = new int[1];
   public int[] c8 = new int[1];
   public z1 t2 = new z1();
   public int s7;
   public p8 x8;
   public int n3;
   public int y4;
   public int[] e2;
   public byte[] t9;
   public int z1;
   public int t4;
   public int q0;
   public Object z3;
   public long m1;
   public e2 k7 = new e2();

   public t9(p8 var1, Object var2, int var3) {
      this.x8 = var1;
      this.e2 = new int[4320];
      this.t9 = new byte[var3];
      this.z1 = var3;
      this.z3 = var2;
      this.l6 = 0;
      this.n5(null);
   }

   public final void n5(long[] var1) {
      if (var1 != null) {
         var1[0] = this.m1;
      }

      if (this.l6 != 4 && this.l6 == 5) {
      }

      if (this.l6 == 6) {
      }

      this.l6 = 0;
      this.n3 = 0;
      this.y4 = 0;
      this.t4 = this.q0 = 0;
      if (this.z3 != null) {
         long var2 = com.aspose.slides.internal.e5a.l6.n5(0L, null, 0, 0);
         this.m1 = var2;
         this.x8.n3 = var2;
      }
   }

   public final int n5(int var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      var5 = this.x8.l6;
      var6 = this.x8.k5;
      var3 = this.y4;
      var4 = this.n3;
      var7 = this.q0;
      var8 = var7 < this.t4 ? this.t4 - var7 - 1 : this.z1 - var7;

      label291:
      while (true) {
         switch (this.l6) {
            case 0:
               while (var4 < 3) {
                  if (var6 == 0) {
                     this.y4 = var3;
                     this.n3 = var4;
                     this.x8.k5 = var6;
                     this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                     this.x8.l6 = var5;
                     this.q0 = var7;
                     return this.l6(var1);
                  }

                  var1 = 0;
                  var6--;
                  var3 |= (this.x8.n5[var5++] & 255 & 0xFF) << var4;
                  var4 += 8;
               }

               var2 = var3 & 7;
               this.s7 = var2 & 1;
               switch (com.aspose.slides.internal.e5a.m3.n5(var2, 1)) {
                  case 0:
                     var3 = com.aspose.slides.internal.e5a.m3.n5(var3, 3);
                     var4 -= 3;
                     var2 = var4 & 7;
                     var3 = com.aspose.slides.internal.e5a.m3.n5(var3, var2);
                     var4 -= var2;
                     this.l6 = 1;
                     continue;
                  case 1:
                     int[] var51 = new int[1];
                     int[] var54 = new int[1];
                     int[][] var57 = new int[1][];
                     int[][] var58 = new int[1][];
                     com.aspose.slides.internal.e5a.e2.n5(var51, var54, var57, var58, this.x8);
                     this.t2.n5(var51[0], var54[0], var57[0], 0, var58[0], 0);
                     var3 = com.aspose.slides.internal.e5a.m3.n5(var3, 3);
                     var4 -= 3;
                     this.l6 = 6;
                     continue;
                  case 2:
                     var3 = com.aspose.slides.internal.e5a.m3.n5(var3, 3);
                     var4 -= 3;
                     this.l6 = 3;
                     continue;
                  case 3:
                     var3 = com.aspose.slides.internal.e5a.m3.n5(var3, 3);
                     var4 -= 3;
                     this.l6 = 9;
                     this.x8.t2 = "invalid block type";
                     byte var23 = -3;
                     this.y4 = var3;
                     this.n3 = var4;
                     this.x8.k5 = var6;
                     this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                     this.x8.l6 = var5;
                     this.q0 = var7;
                     return this.l6(var23);
                  default:
                     continue;
               }
            case 1:
               while (var4 < 32) {
                  if (var6 == 0) {
                     this.y4 = var3;
                     this.n3 = var4;
                     this.x8.k5 = var6;
                     this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                     this.x8.l6 = var5;
                     this.q0 = var7;
                     return this.l6(var1);
                  }

                  var1 = 0;
                  var6--;
                  var3 |= (this.x8.n5[var5++] & 255 & 0xFF) << var4;
                  var4 += 8;
               }

               if ((com.aspose.slides.internal.e5a.m3.n5(~var3, 16) & 65535) != (var3 & 65535)) {
                  this.l6 = 9;
                  this.x8.t2 = "invalid stored block lengths";
                  byte var22 = -3;
                  this.y4 = var3;
                  this.n3 = var4;
                  this.x8.k5 = var6;
                  this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                  this.x8.l6 = var5;
                  this.q0 = var7;
                  return this.l6(var22);
               }

               this.k5 = var3 & 65535;
               var4 = 0;
               var3 = 0;
               this.l6 = this.k5 != 0 ? 2 : (this.s7 != 0 ? 7 : 0);
               break;
            case 2:
               if (var6 == 0) {
                  this.y4 = var3;
                  this.n3 = var4;
                  this.x8.k5 = var6;
                  this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                  this.x8.l6 = var5;
                  this.q0 = var7;
                  return this.l6(var1);
               }

               if (var8 == 0) {
                  if (var7 == this.z1 && this.t4 != 0) {
                     var7 = 0;
                     var8 = var7 < this.t4 ? this.t4 - var7 - 1 : this.z1 - var7;
                  }

                  if (var8 == 0) {
                     this.q0 = var7;
                     var1 = this.l6(var1);
                     var7 = this.q0;
                     var8 = var7 < this.t4 ? this.t4 - var7 - 1 : this.z1 - var7;
                     if (var7 == this.z1 && this.t4 != 0) {
                        var7 = 0;
                        var8 = var7 < this.t4 ? this.t4 - var7 - 1 : this.z1 - var7;
                     }

                     if (var8 == 0) {
                        this.y4 = var3;
                        this.n3 = var4;
                        this.x8.k5 = var6;
                        this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                        this.x8.l6 = var5;
                        this.q0 = var7;
                        return this.l6(var1);
                     }
                  }
               }

               var1 = 0;
               var2 = this.k5;
               if (var2 > var6) {
                  var2 = var6;
               }

               if (var2 > var8) {
                  var2 = var8;
               }

               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.x8.n5)), var5, com.aspose.slides.ms.System.u3.n5((Object)(this.t9)), var7, var2);
               var5 += var2;
               var6 -= var2;
               var7 += var2;
               var8 -= var2;
               if ((this.k5 -= var2) == 0) {
                  this.l6 = this.s7 != 0 ? 7 : 0;
               }
               break;
            case 3:
               while (var4 < 14) {
                  if (var6 == 0) {
                     this.y4 = var3;
                     this.n3 = var4;
                     this.x8.k5 = var6;
                     this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                     this.x8.l6 = var5;
                     this.q0 = var7;
                     return this.l6(var1);
                  }

                  var1 = 0;
                  var6--;
                  var3 |= (this.x8.n5[var5++] & 255 & 0xFF) << var4;
                  var4 += 8;
               }

               this.u3 = var2 = var3 & 16383;
               if ((var2 & 31) <= 29 && (var2 >> 5 & 31) <= 29) {
                  var2 = 258 + (var2 & 31) + (var2 >> 5 & 31);
                  if (this.u9 != null && this.u9.length >= var2) {
                     for (int var50 = 0; var50 < var2; var50++) {
                        this.u9[var50] = 0;
                     }
                  } else {
                     this.u9 = new int[var2];
                  }

                  var3 = com.aspose.slides.internal.e5a.m3.n5(var3, 14);
                  var4 -= 14;
                  this.a6 = 0;
                  this.l6 = 4;
                  break;
               }

               this.l6 = 9;
               this.x8.t2 = "too many length or distance symbols";
               byte var20 = -3;
               this.y4 = var3;
               this.n3 = var4;
               this.x8.k5 = var6;
               this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
               this.x8.l6 = var5;
               this.q0 = var7;
               return this.l6(var20);
            case 4:
               while (this.a6 < 4 + com.aspose.slides.internal.e5a.m3.n5(this.u3, 10)) {
                  while (var4 < 3) {
                     if (var6 == 0) {
                        this.y4 = var3;
                        this.n3 = var4;
                        this.x8.k5 = var6;
                        this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                        this.x8.l6 = var5;
                        this.q0 = var7;
                        return this.l6(var1);
                     }

                     var1 = 0;
                     var6--;
                     var3 |= (this.x8.n5[var5++] & 255 & 0xFF) << var4;
                     var4 += 8;
                  }

                  this.u9[n5[this.a6++]] = var3 & 7;
                  var3 = com.aspose.slides.internal.e5a.m3.n5(var3, 3);
                  var4 -= 3;
               }

               while (this.a6 < 19) {
                  this.u9[n5[this.a6++]] = 0;
               }

               this.h0[0] = 7;
               var2 = this.k7.n5(this.u9, this.h0, this.c8, this.e2, this.x8);
               if (var2 != 0) {
                  var1 = var2;
                  if (var1 == -3) {
                     this.u9 = null;
                     this.l6 = 9;
                  }

                  this.y4 = var3;
                  this.n3 = var4;
                  this.x8.k5 = var6;
                  this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                  this.x8.l6 = var5;
                  this.q0 = var7;
                  return this.l6(var1);
               }

               this.a6 = 0;
               this.l6 = 5;
               break;
            case 5:
               while (true) {
                  var2 = this.u3;
                  if (this.a6 >= 258 + (var2 & 31) + (var2 >> 5 & 31)) {
                     this.c8[0] = -1;
                     int[] var49 = new int[]{9};
                     int[] var53 = new int[]{6};
                     int[] var56 = new int[1];
                     int[] var12 = new int[1];
                     var2 = this.u3;
                     var2 = this.k7.n5(257 + (var2 & 31), 1 + (var2 >> 5 & 31), this.u9, var49, var53, var56, var12, this.e2, this.x8);
                     if (var2 != 0) {
                        if (var2 == -3) {
                           this.u9 = null;
                           this.l6 = 9;
                        }

                        var1 = var2;
                        this.y4 = var3;
                        this.n3 = var4;
                        this.x8.k5 = var6;
                        this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                        this.x8.l6 = var5;
                        this.q0 = var7;
                        return this.l6(var1);
                     }

                     this.t2.n5(var49[0], var53[0], this.e2, var56[0], this.e2, var12[0]);
                     this.l6 = 6;
                     continue label291;
                  }

                  for (var2 = this.h0[0]; var4 < var2; var4 += 8) {
                     if (var6 == 0) {
                        this.y4 = var3;
                        this.n3 = var4;
                        this.x8.k5 = var6;
                        this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                        this.x8.l6 = var5;
                        this.q0 = var7;
                        return this.l6(var1);
                     }

                     var1 = 0;
                     var6--;
                     var3 |= (this.x8.n5[var5++] & 255 & 0xFF) << var4;
                  }

                  var2 = this.e2[(this.c8[0] + (var3 & m3[var2])) * 3 + 1];
                  int var11 = this.e2[(this.c8[0] + (var3 & m3[var2])) * 3 + 2];
                  if (var11 >= 16) {
                     int var9 = var11 == 18 ? 7 : var11 - 14;
                     int var10 = var11 == 18 ? 11 : 3;

                     while (var4 < var2 + var9) {
                        if (var6 == 0) {
                           this.y4 = var3;
                           this.n3 = var4;
                           this.x8.k5 = var6;
                           this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                           this.x8.l6 = var5;
                           this.q0 = var7;
                           return this.l6(var1);
                        }

                        var1 = 0;
                        var6--;
                        var3 |= (this.x8.n5[var5++] & 255 & 0xFF) << var4;
                        var4 += 8;
                     }

                     var3 = com.aspose.slides.internal.e5a.m3.n5(var3, var2);
                     var4 -= var2;
                     var10 += var3 & m3[var9];
                     var3 = com.aspose.slides.internal.e5a.m3.n5(var3, var9);
                     var4 -= var9;
                     var9 = this.a6;
                     var2 = this.u3;
                     if (var9 + var10 > 258 + (var2 & 31) + (var2 >> 5 & 31) || var11 == 16 && var9 < 1) {
                        this.u9 = null;
                        this.l6 = 9;
                        this.x8.t2 = "invalid bit length repeat";
                        byte var17 = -3;
                        this.y4 = var3;
                        this.n3 = var4;
                        this.x8.k5 = var6;
                        this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                        this.x8.l6 = var5;
                        this.q0 = var7;
                        return this.l6(var17);
                     }

                     var11 = var11 == 16 ? this.u9[var9 - 1] : 0;

                     do {
                        this.u9[var9++] = var11;
                     } while (--var10 != 0);

                     this.a6 = var9;
                  } else {
                     var3 = com.aspose.slides.internal.e5a.m3.n5(var3, var2);
                     var4 -= var2;
                     this.u9[this.a6++] = var11;
                  }
               }
            case 6:
               this.y4 = var3;
               this.n3 = var4;
               this.x8.k5 = var6;
               this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
               this.x8.l6 = var5;
               this.q0 = var7;
               if ((var1 = this.t2.n5(this, var1)) != 1) {
                  return this.l6(var1);
               }

               var1 = 0;
               var5 = this.x8.l6;
               var6 = this.x8.k5;
               var3 = this.y4;
               var4 = this.n3;
               var7 = this.q0;
               var8 = var7 < this.t4 ? this.t4 - var7 - 1 : this.z1 - var7;
               if (this.s7 == 0) {
                  this.l6 = 0;
               } else {
                  this.l6 = 7;
               }
               break;
            case 7:
               this.q0 = var7;
               var1 = this.l6(var1);
               var7 = this.q0;
               var8 = var7 < this.t4 ? this.t4 - var7 - 1 : this.z1 - var7;
               if (this.t4 != this.q0) {
                  this.y4 = var3;
                  this.n3 = var4;
                  this.x8.k5 = var6;
                  this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
                  this.x8.l6 = var5;
                  this.q0 = var7;
                  return this.l6(var1);
               }

               this.l6 = 8;
               break;
            case 8:
               byte var15 = 1;
               this.y4 = var3;
               this.n3 = var4;
               this.x8.k5 = var6;
               this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
               this.x8.l6 = var5;
               this.q0 = var7;
               return this.l6(var15);
            case 9:
               byte var14 = -3;
               this.y4 = var3;
               this.n3 = var4;
               this.x8.k5 = var6;
               this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
               this.x8.l6 = var5;
               this.q0 = var7;
               return this.l6(var14);
            default:
               byte var13 = -2;
               this.y4 = var3;
               this.n3 = var4;
               this.x8.k5 = var6;
               this.x8.u3 = this.x8.u3 + (var5 - this.x8.l6);
               this.x8.l6 = var5;
               this.q0 = var7;
               return this.l6(var13);
         }
      }
   }

   public final void n5() {
      this.n5(null);
      this.t9 = null;
      this.e2 = null;
   }

   public final int l6(int var1) {
      int var2 = this.x8.u9;
      int var3 = this.t4;
      int var4 = (var3 <= this.q0 ? this.q0 : this.z1) - var3;
      if (var4 > this.x8.h0) {
         var4 = this.x8.h0;
      }

      if (var1 == -5) {
         var1 = 0;
      }

      this.x8.h0 -= var4;
      this.x8.c8 += var4;
      if (this.z3 != null) {
         long var5 = com.aspose.slides.internal.e5a.l6.n5(this.m1, this.t9, var3, var4);
         this.m1 = var5;
         this.x8.n3 = var5;
      }

      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.t9)), var3, com.aspose.slides.ms.System.u3.n5((Object)(this.x8.a6)), var2, var4);
      var2 += var4;
      var3 += var4;
      if (var3 == this.z1) {
         byte var9 = 0;
         if (this.q0 == this.z1) {
            this.q0 = 0;
         }

         var4 = this.q0 - var9;
         if (var4 > this.x8.h0) {
            var4 = this.x8.h0;
         }

         if (var4 != 0 && var1 == -5) {
            var1 = 0;
         }

         this.x8.h0 -= var4;
         this.x8.c8 += var4;
         if (this.z3 != null) {
            long var11 = com.aspose.slides.internal.e5a.l6.n5(this.m1, this.t9, var9, var4);
            this.m1 = var11;
            this.x8.n3 = var11;
         }

         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.t9)), var9, com.aspose.slides.ms.System.u3.n5((Object)(this.x8.a6)), var2, var4);
         var2 += var4;
         var3 = var9 + var4;
      }

      this.x8.u9 = var2;
      this.t4 = var3;
      return var1;
   }
}
