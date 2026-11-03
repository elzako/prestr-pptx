package com.aspose.slides.internal.f9d;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.r1x.i9;
import com.aspose.slides.internal.r1x.q0;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;

class k5 extends q0 {
   private static final byte[] n5 = new byte[]{
      0,
      -128,
      64,
      -64,
      32,
      -96,
      96,
      -32,
      16,
      -112,
      80,
      -48,
      48,
      -80,
      112,
      -16,
      8,
      -120,
      72,
      -56,
      40,
      -88,
      104,
      -24,
      24,
      -104,
      88,
      -40,
      56,
      -72,
      120,
      -8,
      4,
      -124,
      68,
      -60,
      36,
      -92,
      100,
      -28,
      20,
      -108,
      84,
      -44,
      52,
      -76,
      116,
      -12,
      12,
      -116,
      76,
      -52,
      44,
      -84,
      108,
      -20,
      28,
      -100,
      92,
      -36,
      60,
      -68,
      124,
      -4,
      2,
      -126,
      66,
      -62,
      34,
      -94,
      98,
      -30,
      18,
      -110,
      82,
      -46,
      50,
      -78,
      114,
      -14,
      10,
      -118,
      74,
      -54,
      42,
      -86,
      106,
      -22,
      26,
      -102,
      90,
      -38,
      58,
      -70,
      122,
      -6,
      6,
      -122,
      70,
      -58,
      38,
      -90,
      102,
      -26,
      22,
      -106,
      86,
      -42,
      54,
      -74,
      118,
      -10,
      14,
      -114,
      78,
      -50,
      46,
      -82,
      110,
      -18,
      30,
      -98,
      94,
      -34,
      62,
      -66,
      126,
      -2,
      1,
      -127,
      65,
      -63,
      33,
      -95,
      97,
      -31,
      17,
      -111,
      81,
      -47,
      49,
      -79,
      113,
      -15,
      9,
      -119,
      73,
      -55,
      41,
      -87,
      105,
      -23,
      25,
      -103,
      89,
      -39,
      57,
      -71,
      121,
      -7,
      5,
      -123,
      69,
      -59,
      37,
      -91,
      101,
      -27,
      21,
      -107,
      85,
      -43,
      53,
      -75,
      117,
      -11,
      13,
      -115,
      77,
      -51,
      45,
      -83,
      109,
      -19,
      29,
      -99,
      93,
      -35,
      61,
      -67,
      125,
      -3,
      3,
      -125,
      67,
      -61,
      35,
      -93,
      99,
      -29,
      19,
      -109,
      83,
      -45,
      51,
      -77,
      115,
      -13,
      11,
      -117,
      75,
      -53,
      43,
      -85,
      107,
      -21,
      27,
      -101,
      91,
      -37,
      59,
      -69,
      123,
      -5,
      7,
      -121,
      71,
      -57,
      39,
      -89,
      103,
      -25,
      23,
      -105,
      87,
      -41,
      55,
      -73,
      119,
      -9,
      15,
      -113,
      79,
      -49,
      47,
      -81,
      111,
      -17,
      31,
      -97,
      95,
      -33,
      63,
      -65,
      127,
      -1
   };
   private static final int[] l6 = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
   private static final int[] k5 = new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258};
   private static final int[] u3 = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0};
   private static final int[] a6 = new int[]{
      1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577
   };
   private static final int[] u9 = new int[]{0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};
   private final com.aspose.slides.internal.g3j.l6 h0;
   private final byte[] c8 = new byte[4];
   private boolean t2 = true;
   private v3 s7;

   public k5(v3 var1) {
      this.s7 = var1;
      this.h0 = new com.aspose.slides.internal.g3j.l6(var1);
   }

   public final boolean n5() {
      return this.t2;
   }

   public final void l6() {
      this.t2 = true;
      this.h0.n5();
   }

   public final int n5(byte[] var1, int var2, int var3) {
      int var4;
      do {
         var4 = this.h0.n5(3);
         int var5 = (var4 & 7) >> 1;
         switch (var5) {
            case 0:
               var2 = this.n5(var1, var2);
               break;
            case 1:
               var2 = this.l6(var1, var2);
               break;
            case 2:
               var2 = this.k5(var1, var2);
               break;
            case 3:
            default:
               throw new Exception("Data error: bad compression type.");
         }
      } while ((var4 & 1) != 1 && this.t2);

      return var2;
   }

   @Override
   protected void a6() {
      i9 var1 = (i9)i9.n5();
      var1.n5(this.s7);
      this.s7 = null;
      super.a6();
   }

   private static void n5(int var0) {
      if (var0 == 286 || var0 == 287) {
         throw new com.aspose.slides.internal.r1q.n5(d1.n5(new String[]{"invalid value ", a3.l6(var0)}));
      }
   }

   private static void l6(int var0) {
      if (var0 == 30 | var0 == 31) {
         throw new com.aspose.slides.internal.r1q.n5(d1.n5(new String[]{"invalid value ", a3.l6(var0)}));
      }
   }

   private int n5(byte[] var1, int var2) {
      this.h0.n5(this.c8, 0, 4);
      int var3 = this.c8[0] & 255 | (this.c8[1] & 255) << 8;
      int var4 = this.c8[2] & 255 | (this.c8[3] & 255) << 8;
      if (var3 != (~var4 & 65535)) {
         throw new com.aspose.slides.internal.r1q.n5("Block lengthCount does not match with its complement.");
      }

      this.h0.n5(var1, var2, var3);
      return var2 + var3;
   }

   private int l6(byte[] var1, int var2) {
      com.aspose.slides.internal.g3j.l6 var3 = this.h0;

      byte var5;
      do {
         int var4 = var3.n5(7);
         var4 = (n5[var4] & 255) >> 1;
         if (var4 == 0) {
            var5 = 2;
         } else if (1 <= var4 && var4 <= 23) {
            var5 = 1;
            var4--;
         } else {
            var4 = var4 << 1 | var3.n5(1);
            if (48 <= var4 && var4 <= 191) {
               var5 = 0;
               var4 -= 48;
            } else if (192 <= var4 && var4 <= 199) {
               var5 = 1;
               var4 -= 169;
            } else {
               var4 = var4 << 1 | var3.n5(1);
               if (400 > var4 || var4 > 511) {
                  throw new com.aspose.slides.internal.r1q.n5(d1.n5(new String[]{"Unknown literal ", a3.l6(var4)}));
               }

               var5 = 0;
               var4 -= 256;
            }
         }

         switch (var5) {
            case 0:
               n5(var4);
               var1[var2] = (byte)var4;
               var2++;
               break;
            case 1:
               int var6 = u3[var4];
               int var7 = var6 > 0 ? var3.n5(var6) : 0;
               int var8 = k5[var4] + var7;
               n5(var8);
               int var9 = var3.n5(5);
               var9 = (n5[var9] & 255) >> 3;
               l6(var9);
               var6 = u9[var9];
               var7 = var6 > 0 ? var3.n5(var6) : 0;
               int var10 = a6[var9] + var7;
               int var11 = var2 - var10;
               int var12 = var8 - var10;
               if (var11 > -1) {
                  if (var12 <= 0) {
                     com.aspose.slides.ms.System.y4.n5(var1, var11, var1, var2, var8);
                     var2 += var8;
                  } else {
                     for (int var13 = var10; var8 > 0; var2 += var13) {
                        var8 -= var13;
                        if (var8 < 0) {
                           var13 -= -var8;
                        }

                        com.aspose.slides.ms.System.y4.n5(var1, var11, var1, var2, var13);
                     }
                  }
               } else {
                  this.t2 = false;
               }
            case 2:
               break;
            default:
               throw new com.aspose.slides.internal.r1q.n5(d1.n5(new String[]{"Unknown data type ", s3.n5(k5$l6.class, var5)}));
         }
      } while (var5 != 2 && this.t2);

      return var2;
   }

   private int k5(byte[] var1, int var2) {
      int var3 = this.h0.n5(5) + 257;
      int var4 = this.h0.n5(5) + 1;
      int var5 = this.h0.n5(4) + 4;
      k5$u3 var6 = this.k5(var5);
      k5$u3 var7 = this.n5(var6, var3);
      k5$u3 var8 = this.n5(var6, var4);
      return this.n5(var1, var2, var7, var8, var3);
   }

   private int n5(byte[] var1, int var2, k5$u3 var3, k5$u3 var4, int var5) {
      com.aspose.slides.internal.g3j.l6 var6 = this.h0;

      byte var8;
      do {
         int var7 = var3.n5();
         if (var7 == 256) {
            var8 = 2;
         } else if (0 <= var7 && var7 <= 255) {
            var8 = 0;
         } else {
            if (257 > var7 || var7 > var5) {
               throw new com.aspose.slides.internal.r1q.n5(d1.n5(new String[]{"Unknown literal ", a3.l6(var7)}));
            }

            var8 = 1;
         }

         switch (var8) {
            case 0:
               n5(var7);
               var1[var2] = (byte)var7;
               var2++;
               break;
            case 1:
               int var9 = var7 - 257;
               int var10 = u3[var9];
               int var11 = var10 > 0 ? var6.n5(var10) : 0;
               int var12 = k5[var9] + var11;
               n5(var12);
               int var13 = var4.n5();
               l6(var13);
               var10 = u9[var13];
               var11 = var10 > 0 ? var6.n5(var10) : 0;
               int var14 = a6[var13] + var11;
               int var15 = var2 - var14;
               int var16 = var12 - var14;
               if (var15 > -1) {
                  if (var16 <= 0) {
                     com.aspose.slides.ms.System.y4.n5(var1, var15, var1, var2, var12);
                     var2 += var12;
                  } else {
                     for (int var17 = var14; var12 > 0; var2 += var17) {
                        var12 -= var17;
                        if (var12 < 0) {
                           var17 -= -var12;
                        }

                        com.aspose.slides.ms.System.y4.n5(var1, var15, var1, var2, var17);
                     }
                  }
               } else {
                  this.t2 = false;
               }
            case 2:
               break;
            default:
               throw new com.aspose.slides.internal.r1q.n5(d1.n5(new String[]{"Unknown data type ", s3.n5(k5$l6.class, var8)}));
         }
      } while (var8 != 2 && this.t2);

      return var2;
   }

   private k5$u3 k5(int var1) {
      int[] var2 = new int[l6.length];

      for (int var3 = 0; var3 < var1; var3++) {
         var2[var3] = this.h0.n5(3);
      }

      int[] var4 = new int[l6.length];
      com.aspose.slides.ms.System.y4.n5(l6, 0, var4, 0, l6.length * 4);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var4)), com.aspose.slides.ms.System.u3.n5((Object)(var2)));
      return this.n5(var2);
   }

   private k5$u3 n5(k5$u3 var1, int var2) {
      int[] var3 = new int[var2];
      com.aspose.slides.internal.g3j.l6 var4 = this.h0;
      int var5 = 0;

      while (var5 < var2) {
         int var6 = var1.n5();
         switch (var6) {
            case 0:
               var5++;
               break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
               var3[var5] = var6;
               var5++;
               break;
            case 16:
               int var11 = var4.n5(2);
               var11 += 3;
               int var8 = var3[var5 - 1];
               if (var8 != 0) {
                  for (int var9 = 0; var9 < var11; var9++) {
                     var3[var5] = var8;
                     var5++;
                  }
                  break;
               }

               var5 += var11;
               break;
            case 17:
               int var10 = var4.n5(3);
               var5 += 3 + var10;
               break;
            case 18:
               int var7 = var4.n5(7);
               var5 += 11 + var7;
               break;
            default:
               throw new com.aspose.slides.internal.r1q.n5(d1.n5(new String[]{"Unknown cwl symbol ", a3.l6(var6)}));
         }
      }

      return this.n5(var3);
   }

   private k5$u3 n5(int[] var1) {
      int var2 = var1.length;
      int var3 = Integer.MAX_VALUE;
      int var4 = 0;
      int[] var5 = new int[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         int var7 = var1[var6];
         if (var7 != 0) {
            if (var7 > var4) {
               var4 = var7;
            }

            if (var7 < var3) {
               var3 = var7;
            }

            var5[var7]++;
         }
      }

      int[] var16 = new int[var4 + 1];
      int var17 = 0;
      var5[0] = 0;

      for (int var8 = 1; var8 <= var4; var8++) {
         var17 = var17 + var5[var8 - 1] << 1;
         var16[var8] = var17;
      }

      k5$k5[] var18 = null;
      k5$n5[] var9 = null;
      if (var3 <= 8) {
         var18 = (k5$k5[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(k5$k5.class), 256));
      }

      if (var4 > 8) {
         var9 = new k5$n5[256];
      }

      for (int var10 = 0; var10 < var2; var10++) {
         int var11 = var1[var10];
         if (var11 != 0) {
            int var12 = var16[var11];
            if (var11 <= 8) {
               var18[var12].l6(var11);
               var18[var12].n5(var10);
            } else {
               int var13 = var11 - 8;
               int var14 = var12 >> var13;
               k5$n5[] var15 = new k5$n5[]{var9[var14]};
               k5$n5.n5(var15, var12, var13, var10);
               var9[var14] = var15[0];
            }

            var16[var11]++;
         }
      }

      return new k5$u3(var18, var9, var3, var4, this.h0);
   }

   // $VF: synthetic method
   static byte[] k5() {
      return n5;
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(k5$k5.class, new u3());
   }
}
