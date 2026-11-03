package com.aspose.slides.internal.r3x;

import com.aspose.slides.internal.o9b.t4;

public class h0 {
   private int n5;
   private int[][] l6;
   private float k5;
   private int u3;
   private int[] a6;

   public h0(float var1, int var2) {
      this.k5 = var1;
      this.u3 = var2;
      this.n5();
   }

   public h0(int var1) {
      this(var1, 0);
   }

   public h0() {
      this(1.0F, 0);
   }

   private void n5() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.k5 * 2.0F + 1.0F, 13);
      this.a6 = new int[var1];
      this.l6 = new int[var1][256];

      for (int var2 = 1; var2 <= this.k5; var2++) {
         int var3 = com.aspose.slides.internal.v6g.k5.u3(this.k5 - var2, 13);
         int var4 = com.aspose.slides.internal.v6g.k5.u3(this.k5 + var2, 13);
         int var5 = (var3 + 1) * (var3 + 1);
         this.a6[var3] = var5;
         this.a6[var4] = var5;
         this.n5 = this.n5 + this.a6[var4] + this.a6[var3];

         for (int var6 = 0; var6 < 256; var6++) {
            int var7 = this.a6[var4] * var6;
            this.l6[var3][var6] = var7;
            this.l6[var4][var6] = var7;
         }
      }

      this.a6[com.aspose.slides.internal.v6g.k5.u3(this.k5, 13)] = com.aspose.slides.internal.v6g.k5.u3((this.k5 + 1.0F) * (this.k5 + 1.0F), 13);
      this.n5 = this.n5 + this.a6[com.aspose.slides.internal.v6g.k5.u3(this.k5, 13)];

      for (int var8 = 0; var8 < 256; var8++) {
         this.l6[com.aspose.slides.internal.v6g.k5.u3(this.k5, 13)][var8] = this.a6[com.aspose.slides.internal.v6g.k5.u3(this.k5, 13)] * var8;
      }
   }

   public final com.aspose.slides.internal.o9b.l6 n5(t4 var1) {
      u3 var2 = new u3(new com.aspose.slides.internal.o9b.l6(var1));

      try {
         u3 var3 = new u3(new com.aspose.slides.internal.o9b.l6(var1.e2(), var1.h0()));

         try {
            int var4 = var2.u3() * var2.a6();
            int[] var5 = new int[var4];
            int[] var6 = new int[var4];
            int[] var7 = new int[var4];
            int[] var8 = new int[var4];
            int[] var9 = new int[var4];
            int[] var10 = new int[var4];
            int[] var11 = new int[var4];
            int[] var12 = new int[var4];
            int var13 = 0;

            for (int var14 = 0; var14 < var4; var14++) {
               var5[var14] = var2.l6()[var13] & 255;
               var7[var14] = var2.l6()[++var13] & 255;
               var9[var14] = var2.l6()[++var13] & 255;
               var11[var14] = var2.l6()[++var13] & 255;
               var13++;
            }

            int var15 = 0;
            int var16 = 0;
            if (this.u3 != 2) {
               for (int var17 = 0; var17 < var4; var17++) {
                  int var18 = 0;
                  int var19 = 0;
                  int var20 = 0;
                  int var40 = 0;
                  int var21 = var17 - com.aspose.slides.internal.v6g.k5.u3(this.k5, 13);

                  for (int var22 = 0; var22 < this.a6.length; var22++) {
                     if (var21 < var15) {
                        var13 = var15;
                     } else if (var21 > var15 + var2.u3() - 1) {
                        var13 = var15 + var2.u3() - 1;
                     } else {
                        var13 = var21;
                     }

                     var40 += this.l6[var22][var5[var13]];
                     var20 += this.l6[var22][var7[var13]];
                     var19 += this.l6[var22][var9[var13]];
                     var18 += this.l6[var22][var11[var13]];
                     var21++;
                  }

                  var6[var17] = var40 / this.n5;
                  var8[var17] = var20 / this.n5;
                  var10[var17] = var19 / this.n5;
                  var12[var17] = var18 / this.n5;
                  if (this.u3 == 1) {
                     var3.l6()[var16] = (byte)(var40 / this.n5);
                     var3.l6()[++var16] = (byte)(var20 / this.n5);
                     var3.l6()[++var16] = (byte)(var19 / this.n5);
                     var3.l6()[++var16] = (byte)(var18 / this.n5);
                     var16++;
                  }

                  if (var17 > 0 && var17 % var2.u3() == 0) {
                     var15 += var2.u3();
                  }
               }
            }

            if (this.u3 == 1) {
               return var3.k5();
            }

            var16 = 0;

            for (int var55 = 0; var55 < var2.a6(); var55++) {
               int var23 = var55 - com.aspose.slides.internal.v6g.k5.u3(this.k5, 13);
               var15 = var23 * var2.u3();

               for (int var24 = 0; var24 < var2.u3(); var24++) {
                  int var51 = 0;
                  int var52 = 0;
                  int var53 = 0;
                  int var41 = 0;
                  int var54 = var15 + var24;
                  int var50 = var23;

                  for (int var25 = 0; var25 < this.a6.length; var25++) {
                     if (this.u3 == 2) {
                        if (var50 < 0) {
                           var13 = var24;
                        } else if (var50 > var2.a6() - 1) {
                           var13 = var4 - (var2.u3() - var24);
                        } else {
                           var13 = var54;
                        }

                        var41 += this.l6[var25][var5[var13]];
                        var53 += this.l6[var25][var7[var13]];
                        var52 += this.l6[var25][var9[var13]];
                        var51 += this.l6[var25][var11[var13]];
                     } else {
                        if (var50 < 0) {
                           var13 = var24;
                        } else if (var50 > var2.a6() - 1) {
                           var13 = var4 - (var2.u3() - var24);
                        } else {
                           var13 = var54;
                        }

                        var41 += this.l6[var25][var6[var13]];
                        var53 += this.l6[var25][var8[var13]];
                        var52 += this.l6[var25][var10[var13]];
                        var51 += this.l6[var25][var12[var13]];
                     }

                     var54 += var2.u3();
                     var50++;
                  }

                  var3.l6()[var16] = (byte)(var41 / this.n5);
                  var3.l6()[++var16] = (byte)(var53 / this.n5);
                  var3.l6()[++var16] = (byte)(var52 / this.n5);
                  var3.l6()[++var16] = -1;
                  var16++;
               }
            }

            return var3.k5();
         } finally {
            if (var3 != null) {
               var3.dispose();
            }
         }
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }
}
