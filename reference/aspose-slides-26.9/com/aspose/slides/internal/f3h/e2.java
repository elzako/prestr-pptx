package com.aspose.slides.internal.f3h;

final class e2 {
   int n5;
   int l6;
   int[] k5;
   int u3 = 0;
   int a6;
   int u9;
   int h0;
   int c8;
   byte t2;
   byte s7;
   int[] x8;
   int n3;
   int[] y4;
   int e2;

   void n5(int var1, int var2, int[] var3, int var4, int[] var5, int var6) {
      this.n5 = 0;
      this.t2 = (byte)var1;
      this.s7 = (byte)var2;
      this.x8 = var3;
      this.n3 = var4;
      this.y4 = var5;
      this.e2 = var6;
      this.k5 = null;
   }

   int n5(y4 var1, int var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      u3 var6 = var1.s7;
      var5 = var6.l6;
      int var7 = var6.k5;
      var3 = var1.n3;
      var4 = var1.x8;
      int var8 = var1.t4;
      int var9 = var8 < var1.z1 ? var1.z1 - var8 - 1 : var1.t9 - var8;

      while (true) {
         switch (this.n5) {
            case 0:
               if (var9 >= 258 && var7 >= 10) {
                  var1.n3 = var3;
                  var1.x8 = var4;
                  var6.k5 = var7;
                  var6.u3 = var6.u3 + (var5 - var6.l6);
                  var6.l6 = var5;
                  var1.t4 = var8;
                  var2 = this.n5(this.t2 & 255, this.s7 & 255, this.x8, this.n3, this.y4, this.e2, var1, var6);
                  var5 = var6.l6;
                  var7 = var6.k5;
                  var3 = var1.n3;
                  var4 = var1.x8;
                  var8 = var1.t4;
                  var9 = var8 < var1.z1 ? var1.z1 - var8 - 1 : var1.t9 - var8;
                  if (var2 != 0) {
                     this.n5 = var2 == 1 ? 7 : 9;
                     break;
                  }
               }

               this.a6 = this.t2 & 255;
               this.k5 = this.x8;
               this.u3 = this.n3;
               this.n5 = 1;
            case 1:
               int var26;
               for (var26 = this.a6; var4 < var26; var4 += 8) {
                  if (var7 == 0) {
                     var1.n3 = var3;
                     var1.x8 = var4;
                     var6.k5 = var7;
                     var6.u3 = var6.u3 + (var5 - var6.l6);
                     var6.l6 = var5;
                     var1.t4 = var8;
                     return var1.l6(var2);
                  }

                  var2 = 0;
                  var7--;
                  var3 |= (var6.n5[var5++] & 255 & 0xFF) << var4;
               }

               int var27 = (this.u3 + (var3 & t4.n5[var26])) * 3;
               var3 >>= this.k5[var27 + 1];
               var4 -= this.k5[var27 + 1];
               int var28 = this.k5[var27];
               if (var28 == 0) {
                  this.u9 = this.k5[var27 + 2];
                  this.n5 = 6;
               } else if ((var28 & 16) != 0) {
                  this.h0 = var28 & 15;
                  this.l6 = this.k5[var27 + 2];
                  this.n5 = 2;
               } else if ((var28 & 64) == 0) {
                  this.a6 = var28;
                  this.u3 = var27 / 3 + this.k5[var27 + 2];
               } else {
                  if ((var28 & 32) == 0) {
                     this.n5 = 9;
                     var6.t2 = "invalid literal/length code";
                     byte var20 = -3;
                     var1.n3 = var3;
                     var1.x8 = var4;
                     var6.k5 = var7;
                     var6.u3 = var6.u3 + (var5 - var6.l6);
                     var6.l6 = var5;
                     var1.t4 = var8;
                     return var1.l6(var20);
                  }

                  this.n5 = 7;
               }
               break;
            case 2:
               int var24;
               for (var24 = this.h0; var4 < var24; var4 += 8) {
                  if (var7 == 0) {
                     var1.n3 = var3;
                     var1.x8 = var4;
                     var6.k5 = var7;
                     var6.u3 = var6.u3 + (var5 - var6.l6);
                     var6.l6 = var5;
                     var1.t4 = var8;
                     return var1.l6(var2);
                  }

                  var2 = 0;
                  var7--;
                  var3 |= (var6.n5[var5++] & 255 & 0xFF) << var4;
               }

               this.l6 = this.l6 + (var3 & t4.n5[var24]);
               var3 >>= var24;
               var4 -= var24;
               this.a6 = this.s7 & 255;
               this.k5 = this.y4;
               this.u3 = this.e2;
               this.n5 = 3;
            case 3:
               int var25;
               for (var25 = this.a6; var4 < var25; var4 += 8) {
                  if (var7 == 0) {
                     var1.n3 = var3;
                     var1.x8 = var4;
                     var6.k5 = var7;
                     var6.u3 = var6.u3 + (var5 - var6.l6);
                     var6.l6 = var5;
                     var1.t4 = var8;
                     return var1.l6(var2);
                  }

                  var2 = 0;
                  var7--;
                  var3 |= (var6.n5[var5++] & 255 & 0xFF) << var4;
               }

               int var11 = (this.u3 + (var3 & t4.n5[var25])) * 3;
               var3 >>= this.k5[var11 + 1];
               var4 -= this.k5[var11 + 1];
               int var12 = this.k5[var11];
               if ((var12 & 16) != 0) {
                  this.h0 = var12 & 15;
                  this.c8 = this.k5[var11 + 2];
                  this.n5 = 4;
               } else {
                  if ((var12 & 64) != 0) {
                     this.n5 = 9;
                     var6.t2 = "invalid distance code";
                     byte var19 = -3;
                     var1.n3 = var3;
                     var1.x8 = var4;
                     var6.k5 = var7;
                     var6.u3 = var6.u3 + (var5 - var6.l6);
                     var6.l6 = var5;
                     var1.t4 = var8;
                     return var1.l6(var19);
                  }

                  this.a6 = var12;
                  this.u3 = var11 / 3 + this.k5[var11 + 2];
               }
               break;
            case 4:
               int var10;
               for (var10 = this.h0; var4 < var10; var4 += 8) {
                  if (var7 == 0) {
                     var1.n3 = var3;
                     var1.x8 = var4;
                     var6.k5 = var7;
                     var6.u3 = var6.u3 + (var5 - var6.l6);
                     var6.l6 = var5;
                     var1.t4 = var8;
                     return var1.l6(var2);
                  }

                  var2 = 0;
                  var7--;
                  var3 |= (var6.n5[var5++] & 255 & 0xFF) << var4;
               }

               this.c8 = this.c8 + (var3 & t4.n5[var10]);
               var3 >>= var10;
               var4 -= var10;
               this.n5 = 5;
            case 5:
               int var13 = var8 - this.c8;

               while (var13 < 0) {
                  var13 += var1.t9;
               }

               for (; this.l6 != 0; this.l6--) {
                  if (var9 == 0) {
                     if (var8 == var1.t9 && var1.z1 != 0) {
                        var8 = 0;
                        var9 = var8 < var1.z1 ? var1.z1 - var8 - 1 : var1.t9 - var8;
                     }

                     if (var9 == 0) {
                        var1.t4 = var8;
                        var2 = var1.l6(var2);
                        var8 = var1.t4;
                        var9 = var8 < var1.z1 ? var1.z1 - var8 - 1 : var1.t9 - var8;
                        if (var8 == var1.t9 && var1.z1 != 0) {
                           var8 = 0;
                           var9 = var8 < var1.z1 ? var1.z1 - var8 - 1 : var1.t9 - var8;
                        }

                        if (var9 == 0) {
                           var1.n3 = var3;
                           var1.x8 = var4;
                           var6.k5 = var7;
                           var6.u3 = var6.u3 + (var5 - var6.l6);
                           var6.l6 = var5;
                           var1.t4 = var8;
                           return var1.l6(var2);
                        }
                     }
                  }

                  var1.e2[var8++] = var1.e2[var13++];
                  var9--;
                  if (var13 == var1.t9) {
                     var13 = 0;
                  }
               }

               this.n5 = 0;
               break;
            case 6:
               if (var9 == 0) {
                  if (var8 == var1.t9 && var1.z1 != 0) {
                     var8 = 0;
                     var9 = var8 < var1.z1 ? var1.z1 - var8 - 1 : var1.t9 - var8;
                  }

                  if (var9 == 0) {
                     var1.t4 = var8;
                     var2 = var1.l6(var2);
                     var8 = var1.t4;
                     var9 = var8 < var1.z1 ? var1.z1 - var8 - 1 : var1.t9 - var8;
                     if (var8 == var1.t9 && var1.z1 != 0) {
                        var8 = 0;
                        var9 = var8 < var1.z1 ? var1.z1 - var8 - 1 : var1.t9 - var8;
                     }

                     if (var9 == 0) {
                        var1.n3 = var3;
                        var1.x8 = var4;
                        var6.k5 = var7;
                        var6.u3 = var6.u3 + (var5 - var6.l6);
                        var6.l6 = var5;
                        var1.t4 = var8;
                        return var1.l6(var2);
                     }
                  }
               }

               var2 = 0;
               var1.e2[var8++] = (byte)this.u9;
               var9--;
               this.n5 = 0;
               break;
            case 7:
               if (var4 > 7) {
                  var4 -= 8;
                  var7++;
                  var5--;
               }

               var1.t4 = var8;
               var2 = var1.l6(var2);
               var8 = var1.t4;
               if (var8 < var1.z1) {
                  int var10000 = var1.z1 - var8 - 1;
               } else {
                  int var29 = var1.t9 - var8;
               }

               if (var1.z1 != var1.t4) {
                  var1.n3 = var3;
                  var1.x8 = var4;
                  var6.k5 = var7;
                  var6.u3 = var6.u3 + (var5 - var6.l6);
                  var6.l6 = var5;
                  var1.t4 = var8;
                  return var1.l6(var2);
               }

               this.n5 = 8;
            case 8:
               byte var17 = 1;
               var1.n3 = var3;
               var1.x8 = var4;
               var6.k5 = var7;
               var6.u3 = var6.u3 + (var5 - var6.l6);
               var6.l6 = var5;
               var1.t4 = var8;
               return var1.l6(var17);
            case 9:
               byte var15 = -3;
               var1.n3 = var3;
               var1.x8 = var4;
               var6.k5 = var7;
               var6.u3 = var6.u3 + (var5 - var6.l6);
               var6.l6 = var5;
               var1.t4 = var8;
               return var1.l6(var15);
            default:
               byte var14 = -2;
               var1.n3 = var3;
               var1.x8 = var4;
               var6.k5 = var7;
               var6.u3 = var6.u3 + (var5 - var6.l6);
               var6.l6 = var5;
               var1.t4 = var8;
               return var1.l6(var14);
         }
      }
   }

   int n5(int var1, int var2, int[] var3, int var4, int[] var5, int var6, y4 var7, u3 var8) {
      int var9 = var8.l6;
      int var10 = var8.k5;
      int var11 = var7.n3;
      int var12 = var7.x8;
      int var13 = var7.t4;
      int var14 = var13 < var7.z1 ? var7.z1 - var13 - 1 : var7.t9 - var13;
      int var15 = t4.n5[var1];
      int var16 = t4.n5[var2];

      label141:
      do {
         while (var12 < 20) {
            var10--;
            var11 |= (var8.n5[var9++] & 255) << var12;
            var12 += 8;
         }

         int var17 = var11 & var15;
         int[] var18 = var3;
         int var19 = var4;
         int var20 = (var19 + var17) * 3;
         int var21;
         if ((var21 = var18[var20]) == 0) {
            var11 >>= var18[var20 + 1];
            var12 -= var18[var20 + 1];
            var7.e2[var13++] = (byte)var18[var20 + 2];
            var14--;
         } else {
            do {
               var11 >>= var18[var20 + 1];
               var12 -= var18[var20 + 1];
               if ((var21 & 16) != 0) {
                  var21 &= 15;
                  int var54 = var18[var20 + 2] + (var11 & t4.n5[var21]);
                  var11 >>= var21;

                  for (var12 -= var21; var12 < 15; var12 += 8) {
                     var10--;
                     var11 |= (var8.n5[var9++] & 255) << var12;
                  }

                  var17 = var11 & var16;
                  var18 = var5;
                  var19 = var6;
                  var20 = (var19 + var17) * 3;
                  var21 = var18[var20];

                  while (true) {
                     var11 >>= var18[var20 + 1];
                     var12 -= var18[var20 + 1];
                     if ((var21 & 16) != 0) {
                        for (var21 &= 15; var12 < var21; var12 += 8) {
                           var10--;
                           var11 |= (var8.n5[var9++] & 255) << var12;
                        }

                        int var23 = var18[var20 + 2] + (var11 & t4.n5[var21]);
                        var11 >>= var21;
                        var12 -= var21;
                        var14 -= var54;
                        int var24;
                        if (var13 >= var23) {
                           var24 = var13 - var23;
                           if (var13 - var24 > 0 && 2 > var13 - var24) {
                              var7.e2[var13++] = var7.e2[var24++];
                              var7.e2[var13++] = var7.e2[var24++];
                              var54 -= 2;
                           } else {
                              System.arraycopy(var7.e2, var24, var7.e2, var13, 2);
                              var13 += 2;
                              var24 += 2;
                              var54 -= 2;
                           }
                        } else {
                           var24 = var13 - var23;

                           do {
                              var24 += var7.t9;
                           } while (var24 < 0);

                           var21 = var7.t9 - var24;
                           if (var54 > var21) {
                              var54 -= var21;
                              if (var13 - var24 > 0 && var21 > var13 - var24) {
                                 do {
                                    var7.e2[var13++] = var7.e2[var24++];
                                 } while (--var21 != 0);
                              } else {
                                 System.arraycopy(var7.e2, var24, var7.e2, var13, var21);
                                 var13 += var21;
                                 var24 += var21;
                                 boolean var50 = false;
                              }

                              var24 = 0;
                           }
                        }

                        if (var13 - var24 > 0 && var54 > var13 - var24) {
                           while (true) {
                              var7.e2[var13++] = var7.e2[var24++];
                              if (--var54 == 0) {
                                 continue label141;
                              }
                           }
                        } else {
                           System.arraycopy(var7.e2, var24, var7.e2, var13, var54);
                           var13 += var54;
                           var24 += var54;
                           boolean var57 = false;
                           continue label141;
                        }
                     }

                     if ((var21 & 64) != 0) {
                        var8.t2 = "invalid distance code";
                        var54 = var8.k5 - var10;
                        var54 = var12 >> 3 < var54 ? var12 >> 3 : var54;
                        var10 += var54;
                        var9 -= var54;
                        var12 -= var54 << 3;
                        var7.n3 = var11;
                        var7.x8 = var12;
                        var8.k5 = var10;
                        var8.u3 = var8.u3 + (var9 - var8.l6);
                        var8.l6 = var9;
                        var7.t4 = var13;
                        return -3;
                     }

                     int var42 = var17 + var18[var20 + 2];
                     var17 = var42 + (var11 & t4.n5[var21]);
                     var20 = (var19 + var17) * 3;
                     var21 = var18[var20];
                  }
               }

               if ((var21 & 64) != 0) {
                  if ((var21 & 32) != 0) {
                     int var52 = var8.k5 - var10;
                     var52 = var12 >> 3 < var52 ? var12 >> 3 : var52;
                     var10 += var52;
                     var9 -= var52;
                     var12 -= var52 << 3;
                     var7.n3 = var11;
                     var7.x8 = var12;
                     var8.k5 = var10;
                     var8.u3 = var8.u3 + (var9 - var8.l6);
                     var8.l6 = var9;
                     var7.t4 = var13;
                     return 1;
                  }

                  var8.t2 = "invalid literal/length code";
                  int var22 = var8.k5 - var10;
                  var22 = var12 >> 3 < var22 ? var12 >> 3 : var22;
                  var10 += var22;
                  var9 -= var22;
                  var12 -= var22 << 3;
                  var7.n3 = var11;
                  var7.x8 = var12;
                  var8.k5 = var10;
                  var8.u3 = var8.u3 + (var9 - var8.l6);
                  var8.l6 = var9;
                  var7.t4 = var13;
                  return -3;
               }

               int var40 = var17 + var18[var20 + 2];
               var17 = var40 + (var11 & t4.n5[var21]);
               var20 = (var19 + var17) * 3;
            } while ((var21 = var18[var20]) != 0);

            var11 >>= var18[var20 + 1];
            var12 -= var18[var20 + 1];
            var7.e2[var13++] = (byte)var18[var20 + 2];
            var14--;
         }
      } while (var14 >= 258 && var10 >= 10);

      int var58 = var8.k5 - var10;
      var58 = var12 >> 3 < var58 ? var12 >> 3 : var58;
      var10 += var58;
      var9 -= var58;
      var12 -= var58 << 3;
      var7.n3 = var11;
      var7.x8 = var12;
      var8.k5 = var10;
      var8.u3 = var8.u3 + (var9 - var8.l6);
      var8.l6 = var9;
      var7.t4 = var13;
      return 0;
   }
}
