package com.aspose.slides.internal.e5a;

public final class z1 {
   private static final int[] t9 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
   public int n5;
   public int l6;
   public int[] k5;
   public int u3 = 0;
   public int a6;
   public int u9;
   public int h0;
   public int c8;
   public byte t2;
   public byte s7;
   public int[] x8;
   public int n3;
   public int[] y4;
   public int e2;

   public final void n5(int var1, int var2, int[] var3, int var4, int[] var5, int var6) {
      this.n5 = 0;
      this.t2 = (byte)var1;
      this.s7 = (byte)var2;
      this.x8 = var3;
      this.n3 = var4;
      this.y4 = var5;
      this.e2 = var6;
      this.k5 = null;
   }

   public final int n5(t9 var1, int var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      p8 var13 = var1.x8;
      var8 = var13.l6;
      var9 = var13.k5;
      var6 = var1.y4;
      var7 = var1.n3;
      var10 = var1.q0;
      var11 = var10 < var1.t4 ? var1.t4 - var10 - 1 : var1.z1 - var10;

      while (true) {
         switch (this.n5) {
            case 0:
               if (var11 >= 258 && var9 >= 10) {
                  var1.y4 = var6;
                  var1.n3 = var7;
                  var13.k5 = var9;
                  var13.u3 = var13.u3 + (var8 - var13.l6);
                  var13.l6 = var8;
                  var1.q0 = var10;
                  var2 = n5(this.t2 & 255, this.s7 & 255, this.x8, this.n3, this.y4, this.e2, var1, var13);
                  var8 = var13.l6;
                  var9 = var13.k5;
                  var6 = var1.y4;
                  var7 = var1.n3;
                  var10 = var1.q0;
                  var11 = var10 < var1.t4 ? var1.t4 - var10 - 1 : var1.z1 - var10;
                  if (var2 != 0) {
                     this.n5 = var2 == 1 ? 7 : 9;
                     break;
                  }
               }

               this.a6 = this.t2 & 255;
               this.k5 = this.x8;
               this.u3 = this.n3;
               this.n5 = 1;
               break;
            case 1:
               for (var3 = this.a6; var7 < var3; var7 += 8) {
                  if (var9 == 0) {
                     var1.y4 = var6;
                     var1.n3 = var7;
                     var13.k5 = var9;
                     var13.u3 = var13.u3 + (var8 - var13.l6);
                     var13.l6 = var8;
                     var1.q0 = var10;
                     return var1.l6(var2);
                  }

                  var2 = 0;
                  var9--;
                  var6 |= (var13.n5[var8++] & 255 & 0xFF) << var7;
               }

               var4 = (this.u3 + (var6 & t9[var3])) * 3;
               var6 = m3.n5(var6, this.k5[var4 + 1]);
               var7 -= this.k5[var4 + 1];
               var5 = this.k5[var4];
               if (var5 == 0) {
                  this.u9 = this.k5[var4 + 2];
                  this.n5 = 6;
               } else if ((var5 & 16) != 0) {
                  this.h0 = var5 & 15;
                  this.l6 = this.k5[var4 + 2];
                  this.n5 = 2;
               } else if ((var5 & 64) == 0) {
                  this.a6 = var5;
                  this.u3 = var4 / 3 + this.k5[var4 + 2];
               } else {
                  if ((var5 & 32) == 0) {
                     this.n5 = 9;
                     var13.t2 = "invalid literal/length code";
                     byte var19 = -3;
                     var1.y4 = var6;
                     var1.n3 = var7;
                     var13.k5 = var9;
                     var13.u3 = var13.u3 + (var8 - var13.l6);
                     var13.l6 = var8;
                     var1.q0 = var10;
                     return var1.l6(var19);
                  }

                  this.n5 = 7;
               }
               break;
            case 2:
               for (var3 = this.h0; var7 < var3; var7 += 8) {
                  if (var9 == 0) {
                     var1.y4 = var6;
                     var1.n3 = var7;
                     var13.k5 = var9;
                     var13.u3 = var13.u3 + (var8 - var13.l6);
                     var13.l6 = var8;
                     var1.q0 = var10;
                     return var1.l6(var2);
                  }

                  var2 = 0;
                  var9--;
                  var6 |= (var13.n5[var8++] & 255 & 0xFF) << var7;
               }

               this.l6 = this.l6 + (var6 & t9[var3]);
               var6 >>= var3;
               var7 -= var3;
               this.a6 = this.s7 & 255;
               this.k5 = this.y4;
               this.u3 = this.e2;
               this.n5 = 3;
               break;
            case 3:
               for (var3 = this.a6; var7 < var3; var7 += 8) {
                  if (var9 == 0) {
                     var1.y4 = var6;
                     var1.n3 = var7;
                     var13.k5 = var9;
                     var13.u3 = var13.u3 + (var8 - var13.l6);
                     var13.l6 = var8;
                     var1.q0 = var10;
                     return var1.l6(var2);
                  }

                  var2 = 0;
                  var9--;
                  var6 |= (var13.n5[var8++] & 255 & 0xFF) << var7;
               }

               var4 = (this.u3 + (var6 & t9[var3])) * 3;
               var6 >>= this.k5[var4 + 1];
               var7 -= this.k5[var4 + 1];
               var5 = this.k5[var4];
               if ((var5 & 16) != 0) {
                  this.h0 = var5 & 15;
                  this.c8 = this.k5[var4 + 2];
                  this.n5 = 4;
               } else {
                  if ((var5 & 64) != 0) {
                     this.n5 = 9;
                     var13.t2 = "invalid distance code";
                     byte var18 = -3;
                     var1.y4 = var6;
                     var1.n3 = var7;
                     var13.k5 = var9;
                     var13.u3 = var13.u3 + (var8 - var13.l6);
                     var13.l6 = var8;
                     var1.q0 = var10;
                     return var1.l6(var18);
                  }

                  this.a6 = var5;
                  this.u3 = var4 / 3 + this.k5[var4 + 2];
               }
               break;
            case 4:
               for (var3 = this.h0; var7 < var3; var7 += 8) {
                  if (var9 == 0) {
                     var1.y4 = var6;
                     var1.n3 = var7;
                     var13.k5 = var9;
                     var13.u3 = var13.u3 + (var8 - var13.l6);
                     var13.l6 = var8;
                     var1.q0 = var10;
                     return var1.l6(var2);
                  }

                  var2 = 0;
                  var9--;
                  var6 |= (var13.n5[var8++] & 255 & 0xFF) << var7;
               }

               this.c8 = this.c8 + (var6 & t9[var3]);
               var6 >>= var3;
               var7 -= var3;
               this.n5 = 5;
               break;
            case 5:
               var12 = var10 - this.c8;

               while (var12 < 0) {
                  var12 += var1.z1;
               }

               for (; this.l6 != 0; this.l6--) {
                  if (var11 == 0) {
                     if (var10 == var1.z1 && var1.t4 != 0) {
                        var10 = 0;
                        var11 = var10 < var1.t4 ? var1.t4 - var10 - 1 : var1.z1 - var10;
                     }

                     if (var11 == 0) {
                        var1.q0 = var10;
                        var2 = var1.l6(var2);
                        var10 = var1.q0;
                        var11 = var10 < var1.t4 ? var1.t4 - var10 - 1 : var1.z1 - var10;
                        if (var10 == var1.z1 && var1.t4 != 0) {
                           var10 = 0;
                           var11 = var10 < var1.t4 ? var1.t4 - var10 - 1 : var1.z1 - var10;
                        }

                        if (var11 == 0) {
                           var1.y4 = var6;
                           var1.n3 = var7;
                           var13.k5 = var9;
                           var13.u3 = var13.u3 + (var8 - var13.l6);
                           var13.l6 = var8;
                           var1.q0 = var10;
                           return var1.l6(var2);
                        }
                     }
                  }

                  var1.t9[var10++] = var1.t9[var12++];
                  var11--;
                  if (var12 == var1.z1) {
                     var12 = 0;
                  }
               }

               this.n5 = 0;
               break;
            case 6:
               if (var11 == 0) {
                  if (var10 == var1.z1 && var1.t4 != 0) {
                     var10 = 0;
                     var11 = var10 < var1.t4 ? var1.t4 - var10 - 1 : var1.z1 - var10;
                  }

                  if (var11 == 0) {
                     var1.q0 = var10;
                     var2 = var1.l6(var2);
                     var10 = var1.q0;
                     var11 = var10 < var1.t4 ? var1.t4 - var10 - 1 : var1.z1 - var10;
                     if (var10 == var1.z1 && var1.t4 != 0) {
                        var10 = 0;
                        var11 = var10 < var1.t4 ? var1.t4 - var10 - 1 : var1.z1 - var10;
                     }

                     if (var11 == 0) {
                        var1.y4 = var6;
                        var1.n3 = var7;
                        var13.k5 = var9;
                        var13.u3 = var13.u3 + (var8 - var13.l6);
                        var13.l6 = var8;
                        var1.q0 = var10;
                        return var1.l6(var2);
                     }
                  }
               }

               var2 = 0;
               var1.t9[var10++] = (byte)this.u9;
               var11--;
               this.n5 = 0;
               break;
            case 7:
               if (var7 > 7) {
                  var7 -= 8;
                  var9++;
                  var8--;
               }

               var1.q0 = var10;
               var2 = var1.l6(var2);
               var10 = var1.q0;
               var11 = var10 < var1.t4 ? var1.t4 - var10 - 1 : var1.z1 - var10;
               if (var1.t4 != var1.q0) {
                  var1.y4 = var6;
                  var1.n3 = var7;
                  var13.k5 = var9;
                  var13.u3 = var13.u3 + (var8 - var13.l6);
                  var13.l6 = var8;
                  var1.q0 = var10;
                  var1.l6(var2);
                  return var13.h0 == 0 ? 0 : 1;
               }

               this.n5 = 8;
               break;
            case 8:
               var2 = var13.h0 == 0 ? 0 : 1;
               var1.y4 = var6;
               var1.n3 = var7;
               var13.k5 = var9;
               var13.u3 = var13.u3 + (var8 - var13.l6);
               var13.l6 = var8;
               var1.q0 = var10;
               return var1.l6(var2);
            case 9:
               byte var15 = -3;
               var1.y4 = var6;
               var1.n3 = var7;
               var13.k5 = var9;
               var13.u3 = var13.u3 + (var8 - var13.l6);
               var13.l6 = var8;
               var1.q0 = var10;
               return var1.l6(var15);
            default:
               byte var14 = -2;
               var1.y4 = var6;
               var1.n3 = var7;
               var13.k5 = var9;
               var13.u3 = var13.u3 + (var8 - var13.l6);
               var13.l6 = var8;
               var1.q0 = var10;
               return var1.l6(var14);
         }
      }
   }

   public static int n5(int var0, int var1, int[] var2, int var3, int[] var4, int var5, t9 var6, p8 var7) {
      int var8 = var7.l6;
      int var9 = var7.k5;
      int var10 = var6.y4;
      int var11 = var6.n3;
      int var12 = var6.q0;
      int var13 = var12 < var6.t4 ? var6.t4 - var12 - 1 : var6.z1 - var12;
      int var14 = t9[var0];
      int var15 = t9[var1];

      label141:
      do {
         while (var11 < 20) {
            var9--;
            var10 |= (var7.n5[var8++] & 255 & 0xFF) << var11;
            var11 += 8;
         }

         int var16 = var10 & var14;
         int[] var17 = var2;
         int var18 = var3;
         int var19 = (var18 + var16) * 3;
         int var20;
         if ((var20 = var17[var19]) == 0) {
            var10 >>= var17[var19 + 1];
            var11 -= var17[var19 + 1];
            var6.t9[var12++] = (byte)var17[var19 + 2];
            var13--;
         } else {
            do {
               var10 >>= var17[var19 + 1];
               var11 -= var17[var19 + 1];
               if ((var20 & 16) != 0) {
                  var20 &= 15;
                  int var53 = var17[var19 + 2] + (var10 & t9[var20]);
                  var10 >>= var20;

                  for (var11 -= var20; var11 < 15; var11 += 8) {
                     var9--;
                     var10 |= (var7.n5[var8++] & 255 & 0xFF) << var11;
                  }

                  var16 = var10 & var15;
                  var17 = var4;
                  var18 = var5;
                  var19 = (var18 + var16) * 3;
                  var20 = var17[var19];

                  while (true) {
                     var10 >>= var17[var19 + 1];
                     var11 -= var17[var19 + 1];
                     if ((var20 & 16) != 0) {
                        for (var20 &= 15; var11 < var20; var11 += 8) {
                           var9--;
                           var10 |= (var7.n5[var8++] & 255 & 0xFF) << var11;
                        }

                        int var22 = var17[var19 + 2] + (var10 & t9[var20]);
                        var10 >>= var20;
                        var11 -= var20;
                        var13 -= var53;
                        int var23;
                        if (var12 >= var22) {
                           var23 = var12 - var22;
                           if (var12 - var23 > 0 && 2 > var12 - var23) {
                              var6.t9[var12++] = var6.t9[var23++];
                              var6.t9[var12++] = var6.t9[var23++];
                              var53 -= 2;
                           } else {
                              com.aspose.slides.ms.System.u3.n5(
                                 com.aspose.slides.ms.System.u3.n5((Object)(var6.t9)), var23, com.aspose.slides.ms.System.u3.n5((Object)(var6.t9)), var12, 2
                              );
                              var12 += 2;
                              var23 += 2;
                              var53 -= 2;
                           }
                        } else {
                           var23 = var12 - var22;

                           do {
                              var23 += var6.z1;
                           } while (var23 < 0);

                           var20 = var6.z1 - var23;
                           if (var53 > var20) {
                              var53 -= var20;
                              if (var12 - var23 > 0 && var20 > var12 - var23) {
                                 do {
                                    var6.t9[var12++] = var6.t9[var23++];
                                 } while (--var20 != 0);
                              } else {
                                 com.aspose.slides.ms.System.u3.n5(
                                    com.aspose.slides.ms.System.u3.n5((Object)(var6.t9)), var23, com.aspose.slides.ms.System.u3.n5((Object)(var6.t9)), var12, var20
                                 );
                                 var12 += var20;
                                 var23 += var20;
                                 boolean var49 = false;
                              }

                              var23 = 0;
                           }
                        }

                        if (var12 - var23 > 0 && var53 > var12 - var23) {
                           while (true) {
                              var6.t9[var12++] = var6.t9[var23++];
                              if (--var53 == 0) {
                                 continue label141;
                              }
                           }
                        } else {
                           com.aspose.slides.ms.System.u3.n5(
                              com.aspose.slides.ms.System.u3.n5((Object)(var6.t9)), var23, com.aspose.slides.ms.System.u3.n5((Object)(var6.t9)), var12, var53
                           );
                           var12 += var53;
                           var23 += var53;
                           boolean var56 = false;
                           continue label141;
                        }
                     }

                     if ((var20 & 64) != 0) {
                        var7.t2 = "invalid distance code";
                        var53 = var7.k5 - var9;
                        var53 = var11 >> 3 < var53 ? var11 >> 3 : var53;
                        var9 += var53;
                        var8 -= var53;
                        var11 -= var53 << 3;
                        var6.y4 = var10;
                        var6.n3 = var11;
                        var7.k5 = var9;
                        var7.u3 = var7.u3 + (var8 - var7.l6);
                        var7.l6 = var8;
                        var6.q0 = var12;
                        return -3;
                     }

                     int var41 = var16 + var17[var19 + 2];
                     var16 = var41 + (var10 & t9[var20]);
                     var19 = (var18 + var16) * 3;
                     var20 = var17[var19];
                  }
               }

               if ((var20 & 64) != 0) {
                  if ((var20 & 32) != 0) {
                     int var51 = var7.k5 - var9;
                     var51 = var11 >> 3 < var51 ? var11 >> 3 : var51;
                     var9 += var51;
                     var8 -= var51;
                     var11 -= var51 << 3;
                     var6.y4 = var10;
                     var6.n3 = var11;
                     var7.k5 = var9;
                     var7.u3 = var7.u3 + (var8 - var7.l6);
                     var7.l6 = var8;
                     var6.q0 = var12;
                     return 1;
                  }

                  var7.t2 = "invalid literal/length code";
                  int var21 = var7.k5 - var9;
                  var21 = var11 >> 3 < var21 ? var11 >> 3 : var21;
                  var9 += var21;
                  var8 -= var21;
                  var11 -= var21 << 3;
                  var6.y4 = var10;
                  var6.n3 = var11;
                  var7.k5 = var9;
                  var7.u3 = var7.u3 + (var8 - var7.l6);
                  var7.l6 = var8;
                  var6.q0 = var12;
                  return -3;
               }

               int var39 = var16 + var17[var19 + 2];
               var16 = var39 + (var10 & t9[var20]);
               var19 = (var18 + var16) * 3;
            } while ((var20 = var17[var19]) != 0);

            var10 >>= var17[var19 + 1];
            var11 -= var17[var19 + 1];
            var6.t9[var12++] = (byte)var17[var19 + 2];
            var13--;
         }
      } while (var13 >= 258 && var9 >= 10);

      int var57 = var7.k5 - var9;
      var57 = var11 >> 3 < var57 ? var11 >> 3 : var57;
      var9 += var57;
      var8 -= var57;
      var11 -= var57 << 3;
      var6.y4 = var10;
      var6.n3 = var11;
      var7.k5 = var9;
      var7.u3 = var7.u3 + (var8 - var7.l6);
      var7.l6 = var8;
      var6.q0 = var12;
      return 0;
   }
}
