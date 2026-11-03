package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class d5 extends a6 {
   private static int[] t4 = new int[]{932, 932, 932, 0, 0, 949, 936, 0, 0, 0, 0, 0};
   private static int[] q0 = new int[]{
      41379,
      41430,
      41431,
      41378,
      41382,
      42482,
      42401,
      42403,
      42405,
      42407,
      42409,
      42467,
      42469,
      42471,
      42435,
      41404,
      42402,
      42404,
      42406,
      42408,
      42410,
      42411,
      42413,
      42415,
      42417,
      42419,
      42421,
      42423,
      42425,
      42427,
      42429,
      42431,
      42433,
      42436,
      42438,
      42440,
      42442,
      42443,
      42444,
      42445,
      42446,
      42447,
      42450,
      42453,
      42456,
      42459,
      42462,
      42463,
      42464,
      42465,
      42466,
      42468,
      42470,
      42472,
      42473,
      42474,
      42475,
      42476,
      42477,
      42479,
      42483,
      41387,
      41388
   };

   public d5(int var1) {
      super(var1, t4[var1 % 10]);
   }

   @Override
   protected boolean n5(int[] var1) {
      switch (this.t9()) {
         case 50220:
         case 50221:
         case 50222:
            if (var1[0] >= 256) {
               if (var1[0] >= 64064 && var1[0] <= 64587) {
                  if (var1[0] >= 64064 && var1[0] <= 64091) {
                     if (var1[0] <= 64073) {
                        var1[0] -= 2897;
                     } else if (var1[0] >= 64074 && var1[0] <= 64083) {
                        var1[0] -= 29430;
                     } else if (var1[0] >= 64084 && var1[0] <= 64087) {
                        var1[0] -= 2907;
                     } else if (var1[0] == 64088) {
                        var1[0] = 34698;
                     } else if (var1[0] == 64089) {
                        var1[0] = 34690;
                     } else if (var1[0] == 64090) {
                        var1[0] = 34692;
                     } else if (var1[0] == 64091) {
                        var1[0] = 34714;
                     }
                  } else if (var1[0] >= 64092 && var1[0] <= 64587) {
                     byte var2 = (byte)var1[0];
                     if ((var2 & 255) < 92) {
                        var1[0] -= 3423;
                     } else if ((var2 & 255) >= 128 && (var2 & 255) <= 155) {
                        var1[0] -= 3357;
                     } else {
                        var1[0] -= 3356;
                     }
                  }
               }

               byte var4 = (byte)(var1[0] >> 8);
               byte var3 = (byte)var1[0];
               var4 = (byte)((var4 & 255) - (((var4 & 255) > 159 ? -79 : 113) & 0xFF));
               var4 = (byte)(((var4 & 255) << 1) + 1);
               if ((var3 & 255) > 158) {
                  var3 = (byte)((var3 & 255) - 126);
                  var4++;
               } else {
                  if ((var3 & 255) > 126) {
                     var3--;
                  }

                  var3 = (byte)((var3 & 255) - 31);
               }

               var1[0] = (var4 & 255) << 8 | var3 & 255;
            } else {
               if (var1[0] >= 161 && var1[0] <= 223) {
                  var1[0] += 3968;
               }

               if (var1[0] >= 129 && (var1[0] <= 159 || var1[0] >= 224 && var1[0] <= 252)) {
                  return false;
               }
            }
            break;
         case 50225:
            if (var1[0] >= 128 && var1[0] <= 255) {
               return false;
            }

            if (var1[0] >= 256 && ((var1[0] & 0xFF) < 161 || (var1[0] & 0xFF) == 255 || (var1[0] & 0xFF00) < 41216 || (var1[0] & 0xFF00) == 65280)) {
               return false;
            }

            var1[0] &= 32639;
            break;
         case 52936:
            if (var1[0] >= 129 && var1[0] <= 254) {
               return false;
            }
      }

      return true;
   }

   @Override
   public int n5(char[] var1, int var2, int var3, k7 var4) {
      return this.n5(var1, var2, var3, null, 0, 0, var4);
   }

   @Override
   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, k7 var7) {
      d5$l6 var8 = (d5$l6)var7;
      int var9 = 0;
      switch (this.t9()) {
         case 50220:
         case 50221:
         case 50222:
            var9 = this.n5(var1, var2, var3, var4, var5, var6, var8);
            break;
         case 50225:
            var9 = this.l6(var1, var2, var3, var4, var5, var6, var8);
            break;
         case 52936:
            var9 = this.k5(var1, var2, var3, var4, var5, var6, var8);
      }

      return var9;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, x8 var4) {
      return this.n5(var1, var2, var3, null, 0, 0, var4);
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, x8 var7) {
      d5$n5 var8 = (d5$n5)var7;
      int var9 = 0;
      switch (this.t9()) {
         case 50220:
         case 50221:
         case 50222:
            var9 = this.n5(var1, var2, var3, var4, var5, var6, var8);
            break;
         case 50225:
            var9 = this.l6(var1, var2, var3, var4, var5, var6, var8);
            break;
         case 52936:
            var9 = this.k5(var1, var2, var3, var4, var5, var6, var8);
      }

      return var9;
   }

   private int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, d5$l6 var7) {
      j5$k5 var8 = new j5$k5(this, var7, var4, var5, var6, var1, var2, var3);
      int var9 = 11;
      int var10 = 11;
      if (var7 != null) {
         char var11 = var7.k5;
         var9 = var7.u9;
         var10 = var7.h0;
         if (var11 > 0) {
            var8.n5(var11);
         }
      }

      label140:
      while (var8.n5()) {
         char var15 = var8.l6();
         int var12 = this.x8[var15];

         while (true) {
            byte var13 = (byte)((var12 & 65535) >> 8);
            byte var14 = (byte)(var12 & 65535 & 0xFF);
            if (var13 != 16) {
               if ((var13 & 255) != 0) {
                  if (this.t9() == 50222 && var9 == 0) {
                     if (!var8.n5((byte)15)) {
                        break label140;
                     }

                     var9 = var10;
                  }

                  if (var9 != 1) {
                     if (!var8.n5((byte)27, (byte)36, (byte)66)) {
                        break label140;
                     }

                     var9 = 1;
                  }

                  if (!var8.n5(var13, var14)) {
                     break label140;
                  }
                  break;
               }

               if ((var12 & 65535) == 0 && var15 != 0) {
                  var8.n5(var15);
                  break;
               }

               if (this.t9() == 50222 && var9 == 0) {
                  if (!var8.n5((byte)15)) {
                     break label140;
                  }

                  var9 = var10;
               }

               if (var9 != 11) {
                  if (!var8.n5((byte)27, (byte)40, (byte)66)) {
                     break label140;
                  }

                  var9 = 11;
               }

               if (!var8.n5(var14)) {
                  break label140;
               }
               break;
            }

            if (this.t9() != 50220) {
               if (var9 != 0) {
                  if (this.t9() == 50222) {
                     if (!var8.n5((byte)14)) {
                        break label140;
                     }

                     var10 = var9;
                     var9 = 0;
                  } else {
                     if (!var8.n5((byte)27, (byte)40, (byte)73)) {
                        break label140;
                     }

                     var9 = 0;
                  }
               }

               if (!var8.n5((byte)(var14 & 0xFF & 127))) {
                  break label140;
               }
               break;
            }

            if ((var14 & 255) < 33 || (var14 & 255) >= 33 + q0.length) {
               var8.n5(var15);
               break;
            }

            var12 = q0[(var14 & 255) - 33] & 65535 & 32639 & 65535;
         }
      }

      if (var9 != 11 && (var7 == null || var7.u9())) {
         if (this.t9() == 50222 && var9 == 0) {
            if (var8.n5((byte)15)) {
               var9 = var10;
            } else {
               var8.l6();
            }
         }

         if (var9 != 11 && (this.t9() != 50222 || var9 != 0)) {
            if (var8.n5((byte)27, (byte)40, (byte)66)) {
               var9 = 11;
            } else {
               var8.l6();
            }
         }
      }

      if (var4 != null && var7 != null) {
         var7.u9 = var9;
         var7.h0 = var10;
         if (!var8.n5.a6) {
            var7.k5 = 0;
         }

         var7.a6 = var8.k5();
      }

      return var8.u3();
   }

   private int l6(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, d5$l6 var7) {
      j5$k5 var8 = new j5$k5(this, var7, var4, var5, var6, var1, var2, var3);
      int var9 = 11;
      int var10 = 11;
      if (var7 != null) {
         char var11 = var7.k5;
         var9 = var7.u9;
         var10 = var7.h0;
         if (var11 > 0) {
            var8.n5(var11);
         }
      }

      while (var8.n5()) {
         char var15 = var8.l6();
         int var12 = this.x8[var15];
         byte var13 = (byte)((var12 & 65535) >> 8);
         byte var14 = (byte)(var12 & 65535 & 0xFF);
         if ((var13 & 255) != 0) {
            if (var10 != 5) {
               if (!var8.n5((byte)27, (byte)36, (byte)41, (byte)67)) {
                  break;
               }

               var10 = 5;
            }

            if (var9 != 5) {
               if (!var8.n5((byte)14)) {
                  break;
               }

               var9 = 5;
            }

            if (!var8.n5(var13, var14)) {
               break;
            }
         } else if ((var12 & 65535) == 0 && var15 != 0) {
            var8.n5(var15);
         } else {
            if (var9 != 11) {
               if (!var8.n5((byte)15)) {
                  break;
               }

               var9 = 11;
            }

            if (!var8.n5(var14)) {
               break;
            }
         }
      }

      if (var9 != 11 && (var7 == null || var7.u9())) {
         if (var8.n5((byte)15)) {
            var9 = 11;
         } else {
            var8.l6();
         }
      }

      if (var4 != null && var7 != null) {
         if (!var8.n5.a6) {
            var7.k5 = 0;
         }

         var7.u9 = var9;
         if (var7.u9() && var7.k5 == 0) {
            var7.h0 = 11;
         } else {
            var7.h0 = var10;
         }

         var7.a6 = var8.k5();
      }

      return var8.u3();
   }

   private int k5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, d5$l6 var7) {
      j5$k5 var8 = new j5$k5(this, var7, var4, var5, var6, var1, var2, var3);
      int var9 = 11;
      if (var7 != null) {
         char var10 = var7.k5;
         var9 = var7.u9;
         if (var10 > 0) {
            var8.n5(var10);
         }
      }

      while (var8.n5()) {
         char var14 = var8.l6();
         int var11 = this.x8[var14];
         if ((var11 & 65535) == 0 && var14 != 0) {
            var8.n5(var14);
         } else {
            byte var12 = (byte)((var11 & 65535) >> 8);
            byte var13 = (byte)(var11 & 65535 & 0xFF);
            if (((var12 & 255) == 0 || (var12 & 255) >= 161 && (var12 & 255) <= 247 && (var13 & 255) >= 161 && (var13 & 255) <= 254)
               && ((var12 & 255) != 0 || (var13 & 255) <= 128 || (var13 & 255) == 255)) {
               if ((var12 & 255) != 0) {
                  if (var9 != 6) {
                     if (!var8.n5((byte)126, (byte)123, 2)) {
                        break;
                     }

                     var9 = 6;
                  }

                  if (!var8.n5((byte)(var12 & 0xFF & 127), (byte)(var13 & 0xFF & 127))) {
                     break;
                  }
               } else {
                  if (var9 != 11) {
                     if (!var8.n5((byte)126, (byte)125, (var13 & 255) == 126 ? 2 : 1)) {
                        break;
                     }

                     var9 = 11;
                  }

                  if ((var13 & 255) == 126 && !var8.n5((byte)126, 1) || !var8.n5(var13)) {
                     break;
                  }
               }
            } else {
               var8.n5(var14);
            }
         }
      }

      if (var9 != 11 && (var7 == null || var7.u9())) {
         if (var8.n5((byte)126, (byte)125)) {
            var9 = 11;
         } else {
            var8.l6();
         }
      }

      if (var7 != null && var4 != null) {
         var7.u9 = var9;
         if (!var8.n5.a6) {
            var7.k5 = 0;
         }

         var7.a6 = var8.k5();
      }

      return var8.u3();
   }

   private int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, d5$n5 var7) {
      j5$u3 var8 = new j5$u3(this, var7, var4, var5, var6, var1, var2, var3);
      int var9 = 11;
      int var10 = 11;
      byte[] var11 = new byte[4];
      int var12 = 0;
      if (var7 != null) {
         var9 = var7.h0;
         var10 = var7.c8;
         var12 = var7.u9;
         if (var12 >= 0) {
            System.arraycopy(var7.n5, 0, var11, 0, var12);
         }
      }

      while (var8.n5() || var12 > 0) {
         byte var15;
         if (var12 > 0) {
            if (var11[0] == 27) {
               if (!var8.n5()) {
                  if (var7 != null && !var7.u9()) {
                     break;
                  }
               } else {
                  var11[var12++] = var8.l6();
                  int var13 = this.n5(var11, var12);
                  if (var13 != -2) {
                     if (var13 != -1) {
                        var12 = 0;
                        var10 = var13;
                        var9 = var13;
                     }
                     continue;
                  }
               }
            }

            byte[][] var18 = new byte[][]{var11};
            int[] var14 = new int[]{var12};
            var15 = this.n5(var18, var14);
            var11 = var18[0];
            var12 = var14[0];
         } else {
            var15 = var8.l6();
            if (var15 == 27) {
               if (var12 == 0) {
                  var11[0] = var15;
                  var12 = 1;
                  continue;
               }

               var8.n5(-1);
            }
         }

         if (var15 == 14) {
            var10 = var9;
            var9 = 0;
         } else if (var15 == 15) {
            var9 = var10;
         } else {
            int var19 = var15 & 255;
            boolean var24 = false;
            if (var9 == 1) {
               if (var12 > 0) {
                  if ((var11[0] & 255) != 27) {
                     var19 = (var19 & 65535) << 8 & 65535;
                     byte[][] var16 = new byte[][]{var11};
                     int[] var17 = new int[]{var12};
                     var19 = (var19 & 65535 | this.n5(var16, var17) & 255) & 65535;
                     var11 = var16[0];
                     var12 = var17[0];
                     var24 = true;
                  }
               } else {
                  if (!var8.n5()) {
                     if (var7 == null || var7.u9()) {
                        var8.n5(var15);
                     } else if (var4 != null) {
                        var11[0] = var15;
                        var12 = 1;
                     }
                     break;
                  }

                  var19 = (var19 & 65535) << 8 & 65535;
                  var19 = (var19 & 65535 | var8.l6() & 255) & 65535;
                  var24 = true;
               }

               if (var24 && (var19 & 65535 & 0xFF00) == 10752) {
                  var19 = var19 & 65535 & 0xFF & 65535;
                  var19 = (var19 & 65535 | 4096) & 65535;
               }
            } else if ((var19 & 65535) >= 161 && (var19 & 65535) <= 223) {
               var19 = (var19 & 65535 | 4096) & 65535;
               var19 = var19 & 65535 & 65407 & 65535;
            } else if (var9 == 0) {
               var19 = (var19 & 65535 | 4096) & 65535;
            }

            char var25 = this.s7[var19 & 65535];
            if (var25 == 0 && (var19 & 65535) != 0
               ? (var24 ? !var8.n5((byte)((var19 & 65535) >> 8), (byte)var19) : !var8.n5(var15))
               : !var8.n5(var25, var24 ? 2 : 1)) {
               break;
            }
         }
      }

      if (var4 != null && var7 != null) {
         if (var7.u9() && var12 == 0) {
            var7.h0 = 11;
            var7.c8 = 11;
            var7.u9 = 0;
         } else {
            var7.h0 = var9;
            var7.c8 = var10;
            var7.u9 = var12;
            var7.n5 = var11;
         }

         var7.a6 = var8.k5();
      }

      return var8.u3();
   }

   private int n5(byte[] var1, int var2) {
      if ((var1[0] & 255) != 27) {
         return -2;
      }

      if (var2 < 3) {
         return -1;
      }

      if ((var1[1] & 255) == 40) {
         if ((var1[2] & 255) == 66) {
            return 11;
         }

         if ((var1[2] & 255) == 72) {
            return 11;
         }

         if ((var1[2] & 255) == 74) {
            return 11;
         }

         if ((var1[2] & 255) == 73) {
            return 0;
         }
      } else if ((var1[1] & 255) == 36) {
         if ((var1[2] & 255) == 64 || (var1[2] & 255) == 66) {
            return 1;
         }

         if (var2 < 4) {
            return -1;
         }

         if ((var1[2] & 255) == 40 && (var1[3] & 255) == 68) {
            return 1;
         }
      } else if ((var1[1] & 255) == 38 && (var1[2] & 255) == 64) {
         return -3;
      }

      return -2;
   }

   private byte n5(byte[][] var1, int[] var2) {
      var2[0]--;
      byte var3 = var1[0][0];
      if (var2[0] >= 0) {
         System.arraycopy(var1[0], 1, var1[0], 0, var2[0]);
      }

      var1[0][var2[0]] = 0;
      return var3;
   }

   private int l6(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, d5$n5 var7) {
      j5$u3 var8 = new j5$u3(this, var7, var4, var5, var6, var1, var2, var3);
      int var9 = 11;
      byte[] var10 = new byte[4];
      int var11 = 0;
      if (var7 != null) {
         var9 = var7.h0;
         var11 = var7.u9;
         if (var11 >= 0) {
            System.arraycopy(var7.n5, 0, var10, 0, var11);
         }
      }

      while (var8.n5() || var11 > 0) {
         byte var14;
         if (var11 > 0) {
            if (var10[0] == 27) {
               if (!var8.n5()) {
                  if (var7 != null && !var7.u9()) {
                     break;
                  }
               } else {
                  var10[var11++] = var8.l6();
                  int var12 = this.l6(var10, var11);
                  if (var12 != -2) {
                     if (var12 != -1) {
                        var11 = 0;
                     }
                     continue;
                  }
               }
            }

            byte[][] var17 = new byte[][]{var10};
            int[] var13 = new int[]{var11};
            var14 = this.n5(var17, var13);
            var10 = var17[0];
            var11 = var13[0];
         } else {
            var14 = var8.l6();
            if (var14 == 27) {
               if (var11 == 0) {
                  var10[0] = var14;
                  var11 = 1;
                  continue;
               }

               var8.n5(-1);
            }
         }

         if (var14 == 14) {
            var9 = 5;
         } else if (var14 == 15) {
            var9 = 11;
         } else {
            int var18 = var14 & 255;
            boolean var21 = false;
            if (var9 == 5 && (var14 & 255) != 32 && (var14 & 255) != 9 && (var14 & 255) != 10) {
               if (var11 > 0) {
                  if ((var10[0] & 255) != 27) {
                     var18 = (var18 & 65535) << 8 & 65535;
                     byte[][] var15 = new byte[][]{var10};
                     int[] var16 = new int[]{var11};
                     var18 = (var18 & 65535 | this.n5(var15, var16) & 255) & 65535;
                     var10 = var15[0];
                     var11 = var16[0];
                     var21 = true;
                  }
               } else {
                  if (!var8.n5()) {
                     if (var7 == null || var7.u9()) {
                        var8.n5(var14);
                     } else if (var4 != null) {
                        var10[0] = var14;
                        var11 = 1;
                     }
                     break;
                  }

                  var18 = (var18 & 65535) << 8 & 65535;
                  var18 = (var18 & 65535 | var8.l6() & 255) & 65535;
                  var21 = true;
               }
            }

            char var22 = this.s7[var18 & 65535];
            if (var22 == 0 && (var18 & 65535) != 0
               ? (var21 ? !var8.n5((byte)((var18 & 65535) >> 8), (byte)var18) : !var8.n5(var14))
               : !var8.n5(var22, var21 ? 2 : 1)) {
               break;
            }
         }
      }

      if (var4 != null && var7 != null) {
         if (var7.u9() && var11 == 0) {
            var7.h0 = 11;
            var7.c8 = 11;
            var7.u9 = 0;
         } else {
            var7.h0 = var9;
            var7.u9 = var11;
            var7.n5 = var10;
         }

         var7.a6 = var8.k5();
      }

      return var8.u3();
   }

   private int l6(byte[] var1, int var2) {
      if ((var1[0] & 255) != 27) {
         return -2;
      } else if (var2 < 4) {
         return -1;
      } else {
         return (var1[1] & 0xFF) == 36 && (var1[2] & 0xFF) == 41 && (var1[3] & 0xFF) == 67 ? 5 : -2;
      }
   }

   private int k5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, d5$n5 var7) {
      j5$u3 var8 = new j5$u3(this, var7, var4, var5, var6, var1, var2, var3);
      int var9 = 11;
      int var10 = -1;
      boolean var11 = false;
      if (var7 != null) {
         var9 = var7.h0;
         if (var7.u9 != 0) {
            var10 = var7.n5[0] & 255;
         }
      }

      while (var8.n5() || var10 >= 0) {
         byte var12;
         if (var10 >= 0) {
            var12 = (byte)var10;
            var10 = -1;
         } else {
            var12 = var8.l6();
         }

         if ((var12 & 255) == 126) {
            if (!var8.n5()) {
               if (var7 != null && !var7.u9()) {
                  if (var7 != null) {
                     var7.h0();
                  }

                  if (var4 != null) {
                     var7.u9 = 1;
                     var7.n5[0] = 126;
                     var11 = true;
                  }
               } else {
                  var8.n5(var12);
               }
               break;
            }

            var12 = var8.l6();
            if ((var12 & 255) == 126 && var9 == 11) {
               if (!var8.n5((char)(var12 & 0xFF), 2)) {
                  break;
               }
               continue;
            }

            if ((var12 & 255) == 123) {
               var9 = 6;
               continue;
            }

            if ((var12 & 255) == 125) {
               var9 = 11;
               continue;
            }

            if ((var12 & 255) == 10) {
               continue;
            }

            var8.n5(-1);
            var12 = 126;
         }

         if (var9 != 11 && (var12 & 255) >= 32) {
            if (!var8.n5()) {
               if (var7 != null && !var7.u9()) {
                  if (var7 != null) {
                     var7.h0();
                  }

                  if (var4 != null) {
                     var7.u9 = 1;
                     var7.n5[0] = var12;
                     var11 = true;
                  }
               } else {
                  var8.n5(var12);
               }
               break;
            }

            byte var13 = var8.l6();
            int var14 = ((var12 & 255) << 8 | var13 & 255) & 65535;
            char var17;
            if ((var12 & 255) == 32 && (var13 & 255) != 0) {
               var17 = (char)(var13 & 0xFF);
            } else {
               if (((var12 & 255) < 33 || (var12 & 255) > 119 || (var13 & 255) < 33 || (var13 & 255) > 126)
                  && ((var12 & 255) < 161 || (var12 & 255) > 247 || (var13 & 255) < 161 || (var13 & 255) > 254)) {
                  if ((var13 & 255) != 32 || 33 > (var12 & 255) || (var12 & 255) > 125) {
                     if (!var8.n5((byte)((var14 & 65535) >> 8), (byte)var14)) {
                        break;
                     }
                     continue;
                  }

                  var14 = 8481;
               }

               var14 = (var14 & 65535 | 32896) & 65535;
               var17 = this.s7[var14 & 65535];
            }

            if (var17 == 0 && (var14 & 65535) != 0 ? !var8.n5((byte)((var14 & 65535) >> 8), (byte)var14) : !var8.n5(var17, 2)) {
               break;
            }
         } else {
            char var15 = this.s7[var12 & 0xFF];
            if ((var15 == 0 || var15 == 0) && (var12 & 255) != 0 ? !var8.n5(var12) : !var8.n5(var15)) {
               break;
            }
         }
      }

      if (var4 != null && var7 != null) {
         if (!var11) {
            var7.u9 = 0;
         }

         if (var7.u9() && var7.u9 == 0) {
            var7.h0 = 11;
         } else {
            var7.h0 = var9;
         }

         var7.a6 = var8.k5();
      }

      return var8.u3();
   }

   @Override
   public int n5(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("charCount", "Non-negative number required.");
      }

      long var2 = var1 + 1L;
      if (this.x8().l6() > 1) {
         var2 *= this.x8().l6();
      }

      byte var4 = 2;
      byte var5 = 0;
      byte var6 = 0;
      switch (this.t9()) {
         case 50220:
         case 50221:
            var4 = 5;
            var6 = 3;
            break;
         case 50222:
            var4 = 5;
            var6 = 4;
            break;
         case 50225:
            var4 = 3;
            var5 = 4;
            var6 = 1;
            break;
         case 52936:
            var4 = 4;
            var6 = 2;
      }

      var2 *= var4;
      var2 += var5 + var6;
      if (var2 > 2147483647L) {
         throw new ArgumentOutOfRangeException("charCount", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
      } else {
         return (int)var2;
      }
   }

   @Override
   public int l6(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("byteCount", "Non-negative number required.");
      }

      byte var2 = 1;
      byte var3 = 1;
      switch (this.t9()) {
         case 50220:
         case 50221:
         case 50222:
         case 50225:
            var2 = 1;
            var3 = 3;
            break;
         case 52936:
            var2 = 1;
            var3 = 1;
      }

      long var4 = (long)var1 * var2 + var3;
      if (this.n3().l6() > 1) {
         var4 *= this.n3().l6();
      }

      if (var4 > 2147483647L) {
         throw new ArgumentOutOfRangeException("byteCount", "Too many bytes. The resulting number of chars is larger than what can be returned as an int.");
      } else {
         return (int)var4;
      }
   }

   @Override
   public t9 k5() {
      return new d5$l6(this);
   }

   @Override
   public u9 l6() {
      return new d5$n5(this);
   }
}
